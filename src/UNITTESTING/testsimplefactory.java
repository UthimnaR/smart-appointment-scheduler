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
import org.junit.jupiter.api.Test;
import patterns.simplefactory.AppointmentFactory;

import static org.junit.jupiter.api.Assertions.*;

public class AppointmentFactoryTest {

    @Test
    public void testCreateDentalAppointment() {
        Appointment appointment = AppointmentFactory.createAppointment("Dental");
        assertNotNull(appointment);
        assertEquals("Dentist", appointment.getDoctor().getSpecialization());
    }
}

