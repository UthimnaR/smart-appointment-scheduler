/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author Uthimna
 */
public class APPOINTMENT {
    

    private String date;
    private String time;
    private Doctor doctor;

    public Appointment(String date, String time, Doctor doctor) {
        this.date = date;
        this.time = time;
        this.doctor = doctor;
    }

    public String getDate() { return date; }
    public String getTime() { return time; }
    public Doctor getDoctor() { return doctor; }
}
