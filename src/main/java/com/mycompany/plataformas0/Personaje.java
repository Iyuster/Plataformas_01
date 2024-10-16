package com.mycompany.plataformas0;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;

public class Personaje {
    private int x, y;  // Posición del personaje en la ventana
    private int dx, dy;  // Movimiento del personaje
    private Image imagen;  // Imagen del personaje

    public Personaje() {
        // Inicializar la posición del personaje
        x = 50;
        y = 50;

        // Cargar la imagen del personaje
        ImageIcon referencia = new ImageIcon("C:\\Users\\2024-25 DAM1\\Documents\\Iago\\Imagenes\\usuario.png"); // coge la imagen del usuario
        imagen = referencia.getImage();
    }

    // Obtener la imagen del personaje
    public Image getImagen() {
        return imagen;
    }

    // Obtener la posición en X
    public int getX() {
        return x;
    }

    // Obtener la posición en Y
    public int getY() {
        return y;
    }

    // Mover el personaje
    public void mover() {
        x += dx;
        y += dy;
    }

    // Eventos de teclado para mover al personaje
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -1;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 1;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -1;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 1;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}
