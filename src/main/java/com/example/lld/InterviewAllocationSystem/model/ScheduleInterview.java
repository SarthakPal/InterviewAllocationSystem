package com.example.lld.InterviewAllocationSystem.model;

public class ScheduleInterview {

    private String interviewerName;

    private Integer slot;

    public ScheduleInterview(String interviewerName, Integer slot) {
        this.interviewerName = interviewerName;
        this.slot = slot;
    }

    public String getInterviewerName() {
        return interviewerName;
    }

    public void setInterviewerName(String interviewerName) {
        this.interviewerName = interviewerName;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

}
