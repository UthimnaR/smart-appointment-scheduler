/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PATTERNS;

/**
 *
 * @author Uthimna
 */
    

import model.Appointment;
import model.Doctor;

public class AppointmentFactory {
    public static Appointment createAppointment(String type) {
        if (type.equalsIgnoreCase("Dental")) {
            return new Appointment("2025-05-01", "10:00", new Doctor("D01", "Dentist"));
        } else if (type.equalsIgnoreCase("General")) {
            return new Appointment("2025-05-01", "11:00", new Doctor("D02", "General Practitioner"));
        }
        return null;
    }
}

