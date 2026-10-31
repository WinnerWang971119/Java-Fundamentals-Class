package org.amped.model;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        setScore(score);              // invalid score: stays 0
    }

    public String getName() { return name; }
    public int getScore() { return score; }

    public boolean setScore(int score) {
        if (score < 0 || score > 100) return false;   // reject, keep old value
        this.score = score;
        return true;
    }

    public boolean hasPassed() { return score >= 60; }
}
