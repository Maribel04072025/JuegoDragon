/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.juegodragon.elements;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Maribel Ceballos <maribel.ceballosc@autonoma.edu.co>
 */

public class Dragon extends Sprite {

    public static final int STEP = 10;
    public static final int EAT_SIZE = 10;
    public static final int MIN_SIZE = 30; 
    private int caveWidth;
    private int caveHeight;
    private Image dragonImage; 

    public Dragon(int x, int y, int width, int height, int caveWidth, int caveHeight) {
        super(x, y, width, height, Color.ORANGE);
        this.caveWidth = caveWidth;
        this.caveHeight = caveHeight;

        dragonImage = new ImageIcon(getClass().getResource("/autonoma/juegodragon/images/dragon.png")).getImage();
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(dragonImage, x, y, width, height, null);
    }

    public void grow() {
        width += EAT_SIZE;
        height += EAT_SIZE;
    }

    public void shrink() {
        width = Math.max(MIN_SIZE, width - EAT_SIZE);
        height = Math.max(MIN_SIZE, height - EAT_SIZE);
    }

    public void handleKey(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                if (y - STEP >= 0) {
                    y -= STEP;
                }
                break;
            case KeyEvent.VK_DOWN:
                if (y + height + STEP <= caveHeight) {
                    y += STEP;
                }
                break;
            case KeyEvent.VK_LEFT:
                if (x - STEP >= 0) {
                    x -= STEP;
                }
                break;
            case KeyEvent.VK_RIGHT:
                if (x + width + STEP <= caveWidth) {
                    x += STEP;
                }
                break;
        }
    }
}
