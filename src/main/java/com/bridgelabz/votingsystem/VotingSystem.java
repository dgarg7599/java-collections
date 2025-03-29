package com.bridgelabz.votingsystem;

import java.util.*;

public class VotingSystem {

    // HashMap to store candidate votes
    private Map<String, Integer> votes = new HashMap<>();

    // LinkedHashMap to maintain the insertion order of the candidates
    private Map<String, Integer> insertionOrder = new LinkedHashMap<>();

    // TreeMap to display the results sorted by votes or candidate name
    private Map<String, Integer> sortedResults = new TreeMap<>();

    // Method to cast a vote for a candidate
    public void castVote(String candidate) {
        // Update the vote count in HashMap
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);

        // Maintain the insertion order in LinkedHashMap
        insertionOrder.put(candidate, votes.get(candidate));

        // Sort the candidates by votes in TreeMap
        // TreeMap automatically sorts by keys, but we need to sort by votes. So, we use a custom comparator.
        List<Map.Entry<String, Integer>> list = new ArrayList<>(votes.entrySet());
        list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue())); // Sort by votes (descending order)

        sortedResults.clear();
        for (Map.Entry<String, Integer> entry : list) {
            sortedResults.put(entry.getKey(), entry.getValue());
        }
    }

    // Method to display the results
    public void displayResults() {
        System.out.println("Voting Results (Sorted by Votes):");
        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }

    // Method to display the votes in the order they were cast
    public void displayVotesInOrder() {
        System.out.println("Votes in Order of Casting:");
        for (Map.Entry<String, Integer> entry : insertionOrder.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        // Simulate voting
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        // Display the results
        votingSystem.displayResults();

        // Display the votes in order of casting
        votingSystem.displayVotesInOrder();
    }
}
