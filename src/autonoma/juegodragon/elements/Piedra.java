/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.juegodragon.elements;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Maribel Ceballos  <maribel.ceballosc@autonoma.edu.co>
 */
public class Piedra extends Sprite {

    private Image piedraImage; 

    public Piedra(int x, int y, int width, int height) {
        super(x, y, width, height, Color.GRAY);

        
        piedraImage = new ImageIcon(getClass().getResource("/autonoma/juegodragon/images/roca.png")).getImage();
    }

    @Override
    public void draw(Graphics g) {
     
        g.drawImage(piedraImage, x, y, width, height, null);
    }
}

