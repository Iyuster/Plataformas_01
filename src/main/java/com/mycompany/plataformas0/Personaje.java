package com.mycompany.plataformas0;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;

public class Personaje {
    private int x, y;  // Posición del personaje
    private int dx, dy; // Cambios en la posición
    private Image imagen; // Imagen del personaje

    public Personaje() {
        x = 100; // Posición inicial en X
        y = 100; // Posición inicial en Y
        dx = 0; // Velocidad en X
        dy = 0; // Velocidad en Y

        // Cargar la imagen del personaje
        ImageIcon referencia = new ImageIcon("Imagenes/personaje.png"); // Cambia esto a la ruta correcta
        imagen = referencia.getImage();
    }

    public void mover() {
        x += dx; // Actualiza la posición en X
        y += dy; // Actualiza la posición en Y
    }

    public Image getImagen() {
        return imagen; // Devuelve la imagen del personaje
    }

    public int getX() {
        return x; // Devuelve la posición en X
    }

    public int getY() {
        return y; // Devuelve la posición en Y
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -5; // Mover a la izquierda
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 5; // Mover a la derecha
        }

        if (key == KeyEvent.VK_UP) {
            dy = -5; // Mover hacia arriba
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 5; // Mover hacia abajo
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT) {
            dx = 0; // Detener el movimiento horizontal
        }

        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) {
            dy = 0; // Detener el movimiento vertical
        }
    }
}
