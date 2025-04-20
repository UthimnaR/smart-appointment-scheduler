/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNITTESTING;

/**
 *
 * @author Uthimna
 */


import org.junit.jupiter.api.Test;
import patterns.factorymethod.NotificationSender;
import patterns.factorymethod.SenderFactory;

import static org.junit.jupiter.api.Assertions.*;

public class SenderFactoryTest {

    @Test
    public void testEmailSenderCreation() {
        NotificationSender sender = SenderFactory.getSender("email");
        assertNotNull(sender);
        assertEquals("Sending Email...", captureOutput(sender));
    }

    private String captureOutput(NotificationSender sender) {
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        sender.send();
        return out.toString().trim();
    }
}
