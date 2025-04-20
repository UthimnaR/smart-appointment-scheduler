/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author Uthimna
 */
public class DOCTOR {
    

    private String doctorId;
    private String specialization;

    public Doctor(String doctorId, String specialization) {
        this.doctorId = doctorId;
        this.specialization = specialization;
    }

    public String getDoctorId() { return doctorId; }
    public String getSpecialization() { return specialization; }
}

