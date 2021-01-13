package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;
public class CashbackHackerServiceTest {
    @Test
    public void shouldCalculateFrom900() {
        CashbackHackerService service = new CashbackHackerService();
        Assert.assertEquals(service.remain(900), 100);
    }

    @Test
    public void shouldCalculateFrom0() {
        CashbackHackerService service = new CashbackHackerService();
        Assert.assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldCalculateFrom1000() {
        CashbackHackerService service = new CashbackHackerService();
        Assert.assertEquals(service.remain(1000), 0);
    }
}
