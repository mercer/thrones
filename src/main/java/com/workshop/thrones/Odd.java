package com.workshop.thrones;

public class Odd {
    private double value;
    private Candidate candidate;

    public static Odd odd(double value, Candidate candidate) {
        Odd output = new Odd();
        output.value = value;
        output.candidate = candidate;
        return output;
    }
}
