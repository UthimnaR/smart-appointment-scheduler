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

public class AppointmentPrototype implements Cloneable {
    private Appointment appointment;

    public AppointmentPrototype(Appointment appointment) {
        this.appointment = appointment;
    }

    public AppointmentPrototype clone() {
        try {
            return (AppointmentPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public Appointment getAppointment() {
        return appointment;
    }
}
