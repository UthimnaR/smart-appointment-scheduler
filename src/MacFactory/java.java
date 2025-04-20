/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MacFactory;

/**
 *
 * @author Uthimna
 */


public class MacFactory implements UIFactory {
    public Button createButton() {
        return new MacButton();
    }
}

