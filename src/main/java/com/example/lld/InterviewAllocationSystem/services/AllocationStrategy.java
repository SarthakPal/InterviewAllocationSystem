package com.example.lld.InterviewAllocationSystem.services;

import com.example.lld.InterviewAllocationSystem.model.Interviewer;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public interface AllocationStrategy {

    Interviewer getInterviewer(List<Interviewer> availableInterviewers);

}
