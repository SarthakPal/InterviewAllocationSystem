package com.example.lld.InterviewAllocationSystem.services;

import com.example.lld.InterviewAllocationSystem.model.Interviewer;

import java.util.Comparator;
import java.util.List;

public class FairShareAllocationStrategy implements AllocationStrategy {
    @Override
    public Interviewer getInterviewer(List<Interviewer> availableInterviewers) {
        Interviewer chosenInterviewer = availableInterviewers.stream()
                .min(Comparator.comparingInt(i -> i.getInterviewCount()))
                .orElseThrow();
        return chosenInterviewer;
    }

}
