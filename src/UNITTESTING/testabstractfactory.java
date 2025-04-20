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
import patterns.abstractfactory.*;

import static org.junit.jupiter.api.Assertions.*;

public class UIFactoryTest {

    @Test
    public void testWindowsFactory() {
        UIFactory factory = new WindowsFactory();
        Button button = factory.createButton();
        assertEquals("Rendering Windows Button", captureOutput(button));
    }

    @Test
    public void testMacFactory() {
        UIFactory factory = new MacFactory();
        Button button = factory.createButton();
        assertEquals("Rendering Mac Button", captureOutput(button));
    }

    private String captureOutput(Button button) {
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        button.render();
        return out.toString().trim();
    }
}
