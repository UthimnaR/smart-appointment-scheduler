/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PATTERNS;

/**
 *
 * @author Uthimna
 */
 {
    


import model.Appointment;
import model.Doctor;

public class AppointmentBuilder {
    private String date;
    private String time;
    private Doctor doctor;

    public AppointmentBuilder setDate(String date) {
        this.date = date;
        return this;
    }

    public AppointmentBuilder setTime(String time) {
        this.time = time;
        return this;
    }

    public AppointmentBuilder setDoctor(Doctor doctor) {
        this.doctor = doctor;
        return this;
    }

    public Appointment build() {
        return new Appointment(date, time, doctor);
    }
}
