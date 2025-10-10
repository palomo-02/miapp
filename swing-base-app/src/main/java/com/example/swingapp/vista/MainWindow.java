package com.example.swingapp.vista;

import javax.swing.*;

import com.example.swingapp.controlador.AppController;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {
    private static final long serialVersionUID = 1L;
    
	private final ControlPanel controlPanel;
    private final OutputPanel outputPanel;
    private final AppController controller;

    public MainWindow() {
    	   // Llama al constructor de JFrame con el título de la ventana
        super("Aplicación Base Swing con Maven");

        // Define la acción al cerrar la ventana → finaliza la aplicación
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Tamaño inicial de la ventana en píxeles
        setSize(800, 500);

        // Centra la ventana en la pantalla principal
        setLocationRelativeTo(null);

        // Asigna el gestor de diseño principal: BorderLayout
        // Esto permite dividir la ventana en zonas (NORTH, SOUTH, EAST, WEST, CENTER)
        getContentPane().setLayout(new BorderLayout());

        // Crea los paneles laterales y centrales
        controlPanel = new ControlPanel();  // Panel con botones y controles
        controlPanel.btnClear.setBackground(new Color(198, 70, 0));
        controlPanel.btnRun.setBackground(new Color(165, 29, 45));
        controlPanel.btnIp.setBackground(new Color(53, 132, 228));
        controlPanel.btnCurl.setBackground(new Color(152, 106, 68));
        controlPanel.botonSocket.setBackground(new Color(249, 240, 107));
        controlPanel.botonSocket.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        controlPanel.btnDate.setBackground(new Color(192, 97, 203));
        controlPanel.btnStatRed.setBackground(new Color(51, 209, 122));
        outputPanel  = new OutputPanel();   // Panel que muestra texto o resultados

        // Crea el controlador que coordina los eventos entre ambos paneles
        controller   = new AppController(controlPanel, outputPanel);

        // Añade los paneles a las zonas correspondientes del BorderLayout
        getContentPane().add(controlPanel, BorderLayout.WEST);   // Lado izquierdo
        getContentPane().add(outputPanel, BorderLayout.CENTER);  // Zona central

        // Finalmente, muestra la ventana
        setVisible(true);
    
    }

}