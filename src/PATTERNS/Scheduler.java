/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PATTERNS;

/**
 *
 * @author Uthimna
 */
public class Scheduler {
    

    private static Scheduler instance;

    private Scheduler() {}

    public static Scheduler getInstance() {
        if (instance == null) {
            instance = new Scheduler();
        }
        return instance;
    }

    public void schedule() {
        System.out.println("Scheduling appointment...");
    }
}

