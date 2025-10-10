package com.example.swingapp.vista;

import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {
    private static final long serialVersionUID = 1L;
	public JButton btnRun, btnClear, btnExit, btnDate, btnCurl, btnIp,btnStatRed, botonSocket;
	  public JTextField txtUrl;

    public ControlPanel() {
        // grid con 3 filas (una por botón)
        setLayout(new GridLayout(8, 1, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));

        txtUrl = new JTextField("https://example.com");
        btnCurl = new JButton("🌐 Consultar");
        btnStatRed = new JButton("📊 Estadísticas Red");
        btnIp  = new JButton("🖧 IP");
        btnDate = new JButton("📅 Fecha");
        botonSocket = new JButton("� socket");
        btnRun   = new JButton("▶ Ejecutar");
        btnClear = new JButton("🧹 Limpiar");
        btnExit  = new JButton("🚪 Salir");

        
        add(txtUrl);
        add(btnCurl);
        add(btnStatRed);
        add(btnIp);
        add(btnDate);
        add(btnRun);
        add(botonSocket);
        add(btnClear);
        add(btnExit);
    }
}