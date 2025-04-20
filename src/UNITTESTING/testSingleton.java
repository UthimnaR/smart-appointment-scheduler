/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNITTESTING;

/**
 *
 * @author Uthimna
 */


import org.junit.jupiter.api.Test;
import patterns.singleton.Scheduler;

import static org.junit.jupiter.api.Assertions.*;

public class SchedulerTest {

    @Test
    public void testSingletonInstance() {
        Scheduler s1 = Scheduler.getInstance();
        Scheduler s2 = Scheduler.getInstance();
        assertSame(s1, s2, "Both instances should be the same (singleton)");
    }
}
