package com.example.lld.InterviewAllocationSystem.model;

import java.util.ArrayList;
import java.util.List;

public class Interviewer {
    String name;
    List<String> interviewTypes;
    int experience;
    List<Integer> availability;
    int interviewCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getInterviewTypes() {
        return interviewTypes;
    }

    public void setInterviewTypes(List<String> interviewTypes) {
        this.interviewTypes = interviewTypes;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public List<Integer> getAvailability() {
        return availability;
    }

    public void setAvailability(List<Integer> availability) {
        this.availability = availability;
    }

    public int getInterviewCount() {
        return interviewCount;
    }

    public void setInterviewCount(int interviewCount) {
        this.interviewCount = interviewCount;
    }

    public Interviewer(String name, List<String> interviewTypes, int experience, List<Integer> availability) {
        this.name = name;
        this.interviewTypes = interviewTypes;
        this.experience = experience;
        this.availability = new ArrayList<>(availability); // Creating a modifiable copy
        this.interviewCount = 0;
    }
}
