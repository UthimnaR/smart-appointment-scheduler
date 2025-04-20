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
import patterns.builder.AppointmentBuilder;

import static org.junit.jupiter.api.Assertions.*;

public class AppointmentBuilderTest {

    @Test
    public void testBuildAppointment() {
        Doctor doc = new Doctor("D03", "Cardiologist");
        Appointment appointment = new AppointmentBuilder()
                .setDate("2025-06-01")
                .setTime("09:00")
                .setDoctor(doc)
                .build();

        assertEquals("2025-06-01", appointment.getDate());
        assertEquals("09:00", appointment.getTime());
        assertEquals("Cardiologist", appointment.getDoctor().getSpecialization());
    }
}

