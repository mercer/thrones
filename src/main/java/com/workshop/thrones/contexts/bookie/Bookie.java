package com.workshop.thrones.contexts.bookie;

import com.workshop.thrones.ddd.ApplicationService;
import com.workshop.thrones.contexts.bookie.candidate.Candidate;
import com.workshop.thrones.contexts.bookie.candidate.Candidates;
import com.workshop.thrones.contexts.bookie.odd.Odd;
import com.workshop.thrones.contexts.bookie.odd.Odds;
import org.springframework.boot.SpringApplication;

import java.util.Set;

@ApplicationService
public class Bookie {

    private Candidates candidates;
    private Odds odds;

    public Bookie(Candidates candidates, Odds odds) {
        this.candidates = candidates;
        this.odds = odds;
    }

    public static void main(String[] args) {
        SpringApplication.run(Bookie.class, args);
    }

    public Set<Candidate> retrieveAllCandidates() {
        return candidates.all();
    }

    public Set<Odd> retrieveAllOdds() {
        return odds.all();
    }
}
