package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class CashbackHackerServiceTest {
    @Test
    public void shouldCalculateFrom900() {
        CashbackHackerService service = new CashbackHackerService();
        assertEquals(service.remain(900), 100);
    }

    @Test
    public void shouldCalculateFrom0() {
        CashbackHackerService service = new CashbackHackerService();
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldCalculateFrom1000() {
        CashbackHackerService service = new CashbackHackerService();
        assertEquals(service.remain(1000), 1000);
    }
}
