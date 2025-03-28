package com.bridgelabz.queueinterface;

import java.util.*;

class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}
public class HospitalTriageSystem {
    public static void main(String[] args) {
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>(
                (p1, p2) -> Integer.compare(p2.severity, p1.severity) // Higher severity first
        );

        // Adding patients
        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));


        while (!triageQueue.isEmpty()) {
            Patient nextPatient = triageQueue.poll();
            System.out.println("Treating patient: " + nextPatient.name + " (Severity: " + nextPatient.severity + ")");
        }
    }
}