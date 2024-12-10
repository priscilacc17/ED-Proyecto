package Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaEmp extends JFrame {
    private JButton atraccionesButton;
    private JButton ticketsButton;
    private JButton minijuegosButton;
    private JPanel panelEsp;
    private JPanel panelBotones;
    private JButton monitorearRutaDeTrenButton;
    private JPanel mainPanel;

    public VentanaEmp() {
        // Configurar la ventana principal (ahora extiende JFrame)
        setTitle("Ventana de Empleado");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Inicializar los botones
        atraccionesButton = new JButton("Atracciones");
        ticketsButton = new JButton("Tickets");
        minijuegosButton = new JButton("Minijuegos");
        monitorearRutaDeTrenButton = new JButton("Monitorear Ruta De Tren");

        // Establecer un tamaño consistente para los botones
        atraccionesButton.setPreferredSize(new Dimension(180, 40));
        ticketsButton.setPreferredSize(new Dimension(180, 40));
        minijuegosButton.setPreferredSize(new Dimension(180, 40));
        monitorearRutaDeTrenButton.setPreferredSize(new Dimension(180, 40));

        // Crear el panel de botones con un layout de BoxLayout
        panelBotones = new JPanel();
        panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.Y_AXIS));

        // Agregar un poco de espacio entre los botones
        panelBotones.add(Box.createRigidArea(new Dimension(0, 20))); // Espacio en la parte superior
        panelBotones.add(atraccionesButton);
        panelBotones.add(Box.createRigidArea(new Dimension(0, 20))); // Espacio entre botones
        panelBotones.add(ticketsButton);
        panelBotones.add(Box.createRigidArea(new Dimension(0, 20))); // Espacio entre botones
        panelBotones.add(minijuegosButton);
        panelBotones.add(Box.createRigidArea(new Dimension(0, 20))); // Espacio en la parte inferior
        panelBotones.add(monitorearRutaDeTrenButton);
        panelBotones.add(Box.createRigidArea(new Dimension(0, 20))); // Espacio en la parte inferior

        // Establecer el color de fondo y los márgenes para el panel de botones
        panelBotones.setBackground(Color.DARK_GRAY); // Fondo oscuro para el panel de botones
        panelBotones.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Márgenes alrededor del panel

        // Crear el panel de contenido (espacio para tablas u otros componentes)
        panelEsp = new JPanel();
        panelEsp.setBackground(Color.LIGHT_GRAY); // Cambia el color de fondo si deseas
        panelEsp.setPreferredSize(new Dimension(600, 600)); // Define el tamaño del panel

        // Agregar los paneles a la ventana principal
        add(panelBotones, BorderLayout.WEST); // Panel de botones a la izquierda
        add(panelEsp, BorderLayout.CENTER);   // Panel de contenido en el centro

        // Hacer visible la ventana
        setSize(800, 600); // Establecer tamaño de la ventana
        setLocationRelativeTo(null); // Centrar la ventana
        setResizable(false); // Evitar redimensionamiento
        setVisible(true);
    }

    // Método main para mostrar la ventana
    public static void main(String[] args) {
        // Crear la ventana al ejecutar el programa
        new VentanaEmp();
    }
}
