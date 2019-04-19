package com.workshop.thrones;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static com.workshop.thrones.CandidateTestBuilder.aCandidate;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ThronesApplicationTests {

    @Autowired
    private ThronesApplication app;

    @Test
    void should_retrieve_all_candidates() {
        assertThat(app.retrieveAllCandidates()).contains(aCandidate().name("Jon Snow").build());
    }

}
