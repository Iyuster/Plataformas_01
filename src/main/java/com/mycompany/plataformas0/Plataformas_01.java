package com.mycompany.plataformas0;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Plataformas_01 extends JFrame {

    private Personaje personaje;

    public Plataformas_01() {
        // Configurar la ventana
        setTitle("Juego de Plataformas");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Inicializar el personaje
        personaje = new Personaje();

        // Añadir el panel de juego
        add(new PanelJuego());

        // Añadir eventos de teclado
        addKeyListener(new Teclas());
    }

    // Clase interna para gestionar el dibujo del juego
    private class PanelJuego extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            dibujar(g);
        }

        private void dibujar(Graphics g) {
            // Dibujar al personaje
            g.drawImage(personaje.getImagen(), personaje.getX(), personaje.getY(), this);
        }
    }

    // Clase interna para manejar las teclas
    private class Teclas extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            personaje.keyPressed(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            personaje.keyReleased(e);
        }
    }

    public static void main(String[] args) {
        Plataformas_01 ventana = new Plataformas_01();
        ventana.setVisible(true);

        // Crear un bucle simple de juego
        while (true) {
            ventana.personaje.mover();
            ventana.repaint();

            try {
                Thread.sleep(10);  // Hacer que el juego corra a 100 FPS
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}


