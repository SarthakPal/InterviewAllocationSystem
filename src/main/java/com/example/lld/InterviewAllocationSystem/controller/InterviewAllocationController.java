package com.example.lld.InterviewAllocationSystem.controller;

import com.example.lld.InterviewAllocationSystem.services.AllocationStrategy;
import com.example.lld.InterviewAllocationSystem.services.FairShareAllocationStrategy;
import com.example.lld.InterviewAllocationSystem.services.InterviewAllocationService;

import java.util.List;

public class InterviewAllocationController {

    public static void main(String args[])
    {
        // Test Case 1
        InterviewAllocationService system1 = new InterviewAllocationService();
        system1.registerInterviewer("In1", List.of("MC", "PSDS"), 7, List.of(1, 2, 3, 4));
        system1.registerInterviewer("In2", List.of("MC", "PSDS"), 7, List.of(1, 2, 3));
        system1.registerInterviewer("In3", List.of("MC", "PSDS"), 7, List.of(3, 7, 8));
        system1.registerInterviewee("C1", List.of(1, 2, 3, 7, 8));
        system1.registerInterviewee("C2", List.of(1, 2, 3, 7, 8));
        system1.registerInterviewee("C3", List.of(1, 2, 3, 7, 8));
        AllocationStrategy fairShareAllocationStrategy = new FairShareAllocationStrategy();
        system1.allocateInterviews(fairShareAllocationStrategy);
        system1.viewInterviewSchedule();

        // Test Case 2
        InterviewAllocationService system2 = new InterviewAllocationService();
        system2.registerInterviewer("In1", List.of("MC", "PSDS"), 7, List.of(1, 2, 3, 4));
        system2.registerInterviewer("In2", List.of("MC", "PSDS"), 7, List.of(2, 3, 4));
        system2.registerInterviewee("C1", List.of(1, 2, 3, 7, 8));
        system2.registerInterviewee("C2", List.of(1, 2, 3, 7, 8));
        AllocationStrategy defaultAllocationStrategy = new FairShareAllocationStrategy();
        system2.allocateInterviews(defaultAllocationStrategy);
        system2.viewInterviewSchedule();

    }

}
