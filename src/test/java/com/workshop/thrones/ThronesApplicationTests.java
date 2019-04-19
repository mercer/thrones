package com.workshop.thrones;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ThronesApplicationTests {

    @Autowired
    private ThronesApplication app;

    @Test
    void should_retrieve_all_candidates() {
        assertThat(app.retrieveAllCandidates()).contains(Candidate.BRONN);
    }

    @Test
    void should_retrieve_all_odds() {
        assertThat(app.retrieveAllOdds()).isNotEmpty();
    }

}
