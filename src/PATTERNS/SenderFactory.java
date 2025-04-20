/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PATTERNS;

/**
 *
 * @author Uthimna
 */
public class SenderFactory {
    

    public static NotificationSender getSender(String type) {
        if (type.equalsIgnoreCase("email")) return new EmailSender();
        else if (type.equalsIgnoreCase("sms")) return new SmsSender();
        return null;
    }
}

