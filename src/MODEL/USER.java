/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author Uthimna
 */
public class USER {
    

    private String userId;
    private String name;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public void bookAppointment() {
        System.out.println(name + " booked an appointment.");
    }

    public String getUserId() { return userId; }
    public String getName() { return name; }
}

