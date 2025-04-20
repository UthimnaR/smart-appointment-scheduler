/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNITTESTING;

/**
 *
 * @author Uthimna
 */

import model.Appointment;
import model.Doctor;
import org.junit.jupiter.api.Test;
import patterns.prototype.AppointmentPrototype;

import static org.junit.jupiter.api.Assertions.*;

public class AppointmentPrototypeTest {

    @Test
    public void testClonePrototype() {
        Appointment original = new Appointment("2025-07-01", "14:00", new Doctor("D04", "Orthopedic"));
        AppointmentPrototype prototype = new AppointmentPrototype(original);
        AppointmentPrototype cloned = prototype.clone();

        assertNotNull(cloned);
        assertEquals("Orthopedic", cloned.getAppointment().getDoctor().getSpecialization());
    }
}
