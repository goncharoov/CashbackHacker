package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashbackHackerServiceTest {
    @Test
    public void shouldCalculateFrom900() {
        CashbackHackerService service = new CashbackHackerService();
        assertEquals(100, service.remain(900));
    }

    @Test
    public void shouldCalculateFrom0() {
        CashbackHackerService service = new CashbackHackerService();
        assertEquals(1000, service.remain(0));
    }

    @Test
    public void shouldCalculateFrom1000() {
        CashbackHackerService service = new CashbackHackerService();
        assertEquals(0, service.remain(1000));
    }
}