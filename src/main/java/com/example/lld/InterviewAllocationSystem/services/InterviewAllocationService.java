package com.example.lld.InterviewAllocationSystem.services;

import com.example.lld.InterviewAllocationSystem.model.Interviewee;
import com.example.lld.InterviewAllocationSystem.model.Interviewer;
import com.example.lld.InterviewAllocationSystem.model.ScheduleInterview;

import java.util.*;
import java.util.stream.Collectors;

public class InterviewAllocationService {

    List<Interviewer> interviewers;
    List<Interviewee> interviewees;

    public InterviewAllocationService() {
        this.interviewers = new ArrayList<>();
        this.interviewees = new ArrayList<>();
    }

    public void registerInterviewer(String name, List<String> interviewTypes, int experience, List<Integer> availability) {
        Interviewer interviewer = new Interviewer(name, interviewTypes, experience, availability);
        interviewers.add(interviewer);
    }

    private Map<String, Integer> assignmentCount = new HashMap<>();

    private int countAssignments(String interviewerName) {
        return assignmentCount.getOrDefault(interviewerName, 0);
    }

    private void incrementAssignmentCount(String interviewerName) {
        assignmentCount.put(interviewerName, countAssignments(interviewerName) + 1);
    }

    public void registerInterviewee(String name, List<Integer> preferredSlots) {
        Interviewee interviewee = new Interviewee(name, preferredSlots);
        interviewees.add(interviewee);
    }

    public void allocateInterviews(AllocationStrategy allocationStrategy) {
        for (Interviewee interviewee : interviewees) {
            for (String interviewType : List.of("MC", "PSDS")) {
                List<Interviewer> availableInterviewers = interviewers.stream()
                        .filter(i -> i.getInterviewTypes().contains(interviewType) &&
                                i.getExperience()>= 2 &&
                                i.getAvailability().stream().anyMatch(slot ->
                                        interviewee.preferredSlots.contains(slot) &&
                                !interviewee.interviews.containsValue(i.getName())))
                        .collect(Collectors.toList());

                if (availableInterviewers.isEmpty()) {
                    System.out.println("No available interviewers for " + interviewee.name + ", " + interviewType);
                    continue;
                }

                Interviewer chosenInterviewer = allocationStrategy.getInterviewer(availableInterviewers);

                int chosenSlot = interviewee.preferredSlots.stream()
                        .filter(slot -> chosenInterviewer.getAvailability().contains(slot))
                        .findFirst()
                        .orElseThrow();

                interviewee.interviews.put(interviewType + chosenSlot, chosenInterviewer.getName());
                chosenInterviewer.getAvailability().remove(Integer.valueOf(chosenSlot));
                chosenInterviewer.setInterviewCount(chosenInterviewer.getInterviewCount()+1);
                incrementAssignmentCount(chosenInterviewer.getName());
                interviewee.preferredSlots.remove(Integer.valueOf(chosenSlot));
                if(chosenInterviewer.getAvailability().isEmpty())
                {
                    interviewers.remove(chosenInterviewer);
                }
            }
        }
    }

    public void viewInterviewSchedule() {
        for (Interviewee interviewee : interviewees) {
            for (Map.Entry<String, String> entry : interviewee.interviews.entrySet()) {
                String[] parts = entry.getKey().split("(?<=\\D)(?=\\d)");
                String interviewType = parts[0];
                int slot = Integer.parseInt(parts[1]);
                String interviewer = entry.getValue();
                System.out.println(interviewee.name + ", " + interviewType + ", " + interviewer + ", " + slot);
            }
        }
    }

}
