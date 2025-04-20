/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WindowsFactory;

/**
 *
 * @author Uthimna
 */


public class WindowsFactory implements UIFactory {
    public Button createButton() {
        return new WindowsButton();
    }
}
