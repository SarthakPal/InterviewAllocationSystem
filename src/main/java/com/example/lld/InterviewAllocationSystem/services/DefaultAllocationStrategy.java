package com.example.lld.InterviewAllocationSystem.services;

import com.example.lld.InterviewAllocationSystem.model.Interviewer;

import java.util.Comparator;
import java.util.List;

public class DefaultAllocationStrategy implements AllocationStrategy {

    @Override
    public Interviewer getInterviewer(List<Interviewer> availableInterviewers) {
        return availableInterviewers.get(0);
    }

}
