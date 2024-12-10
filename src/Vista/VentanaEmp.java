package Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaEmp extends JFrame {
    private JButton atraccionesButton;
    private JButton ticketsButton;
    private JButton minijuegosButton;
    private JPanel panelEsp;
    private JPanel panelBotones;

    public VentanaEmp() {
        // Configurar la ventana principal (ahora extiende JFrame)
        setTitle("Ventana de Empleado");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600); // Ajusta el tamaño de la ventana
        setLayout(new BorderLayout());

        // Inicializar los botones
        atraccionesButton = new JButton("Atracciones");
        ticketsButton = new JButton("Tickets");
        minijuegosButton = new JButton("Minijuegos");

        // Crear el panel de botones con un layout de BoxLayout
        panelBotones = new JPanel();
        panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.Y_AXIS));
        panelBotones.add(atraccionesButton);
        panelBotones.add(ticketsButton);
        panelBotones.add(minijuegosButton);

        // Crear el panel de contenido (espacio para tablas u otros componentes)
        panelEsp = new JPanel();
        panelEsp.setBackground(Color.LIGHT_GRAY); // Cambia el color de fondo si deseas
        panelEsp.setPreferredSize(new Dimension(600, 600)); // Define el tamaño del panel

        // Agregar los paneles a la ventana principal
        add(panelBotones, BorderLayout.WEST); // Panel de botones a la izquierda
        add(panelEsp, BorderLayout.CENTER);   // Panel de contenido en el centro

        // Hacer visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        // Crear la ventana al ejecutar el programa
        new VentanaEmp();
    }
}
