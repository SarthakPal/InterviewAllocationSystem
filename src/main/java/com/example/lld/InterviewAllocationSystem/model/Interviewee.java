package com.example.lld.InterviewAllocationSystem.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Interviewee {
    public String name;
    public List<Integer> preferredSlots;
    public Map<String, String> interviews;

    public Interviewee(String name, List<Integer> preferredSlots) {
        this.name = name;
        this.preferredSlots = new ArrayList<>(preferredSlots);
        this.interviews = new HashMap<>();
    }
}
