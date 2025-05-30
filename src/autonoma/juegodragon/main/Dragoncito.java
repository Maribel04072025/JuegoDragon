/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.juegodragon.main;

import autonoma.juegodragon.elements.Cueva;
import autonoma.juegodragon.gui.GameDragon;

/**
 *
 * @author Maribel Ceballos <maribel.ceballosc@autonoma.edu.co>
 */
public class Dragoncito {

   
    public static void main(String[] args) {
        GameDragon window = new GameDragon();
        
        Cueva cueva = new Cueva(0, 0, window.getWidth(), window.getHeight());
        
        window.setCueva(cueva);
        
        window.setVisible(true);
    }
    
}
