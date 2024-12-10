package Vista;

import javax.swing.*;
import Controlador.*;
import Modelo.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Atracciones {
    private JPanel mainPanel;
    private ControladorAtracciones controladorAtracciones;

    public Atracciones(ControladorAtracciones controlador) {
        this.controladorAtracciones = controlador;
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Cargar los botones con las atracciones
        cargarBotones();
    }

    private void cargarBotones() {
        // Limpiar el panel antes de cargar los botones
        mainPanel.removeAll();

        // Listar todas las atracciones como botones
        List<Atraccion> atracciones = controladorAtracciones.listarAtracciones();
        for (Atraccion atraccion : atracciones) {
            JButton boton = new JButton(atraccion.getNombre());
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mostrarDetallesAtraccion(atraccion);
                }
            });
            mainPanel.add(boton);
        }

        // Actualizar la vista
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    private void mostrarDetallesAtraccion(Atraccion atraccion) {
        // Crear ventana para mostrar los detalles de la atracción
        JFrame detallesFrame = new JFrame("Detalles de la Atracción");
        detallesFrame.setLayout(new BorderLayout());

        JTextArea detallesArea = new JTextArea();
        detallesArea.setEditable(false);
        detallesArea.setText("ID: " + atraccion.getIdAtraccion() + "\n" +
                "Nombre: " + atraccion.getNombre() + "\n" +
                "Descripción: " + atraccion.getDescr() + "\n" +
                "Edad Mínima: " + atraccion.getEdadMin() + "\n" +
                "Altura Máxima: " + atraccion.getAltMax() + " m\n" +
                "Requisitos Adicionales: " + atraccion.getReqAdic() + "\n" +
                "Capacidad Máxima: " + atraccion.getCapacidadMaxima() + "\n" +
                "Estado: " + atraccion.getEstado());

        detallesFrame.add(new JScrollPane(detallesArea), BorderLayout.CENTER);

        // Botón para cambiar el estado
        JButton cambiarEstadoButton = new JButton("Cambiar Estado");
        cambiarEstadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nuevoEstado = atraccion.getEstado().equals("Abierta") ? "Cerrada" : "Abierta";
                controladorAtracciones.cambiarEstado(atraccion.getIdAtraccion(), nuevoEstado);
                mostrarDetallesAtraccion(atraccion); // Actualizar los detalles con el nuevo estado
            }
        });

        detallesFrame.add(cambiarEstadoButton, BorderLayout.SOUTH);

        JButton cerrarButton = new JButton("Cerrar");
        cerrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detallesFrame.dispose(); // Cerrar la ventana
            }
        });

        detallesFrame.add(cerrarButton, BorderLayout.NORTH);
        detallesFrame.setSize(600, 600);
        detallesFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        detallesFrame.setVisible(true);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
