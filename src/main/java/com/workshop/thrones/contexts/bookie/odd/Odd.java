package com.workshop.thrones.contexts.bookie.odd;

import com.workshop.thrones.ddd.DomainEntity;
import com.workshop.thrones.contexts.bookie.candidate.Candidate;

@DomainEntity
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
