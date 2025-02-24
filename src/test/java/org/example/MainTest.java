package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main = new Main();
    @org.junit.jupiter.api.Test
    void laskeEtaisus() {
        assertEquals(1.0, main.laskeEtaisus(100.0, 100.0), 0.0001);
    }
}