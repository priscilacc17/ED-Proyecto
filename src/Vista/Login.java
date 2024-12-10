package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Controlador.ControladorEmpleados;

public class Login {
    private JPanel mainPanel;
    private JTextField textFieldUsername;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel usernameLabel;
    private JLabel passwordLabel;

    // Instancia del controlador de empleados
    private ControladorEmpleados controlador;

    public Login() {
        // Configuración del panel principal con fondo
        mainPanel = new FondoPanel("image/parque.jpg", 0.7f); // Ruta de la imagen y opacidad
        mainPanel.setLayout(null); // Usar layout absoluto para personalizar posiciones

        // Configurar etiquetas
        usernameLabel = new JLabel("Usuario:");
        usernameLabel.setBounds(50, 50, 100, 30);

        passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(50, 100, 100, 30);

        // Configurar campos de texto
        textFieldUsername = new JTextField();
        textFieldUsername.setBounds(150, 50, 200, 30);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 200, 30);

        // Configurar botón
        loginButton = new JButton("Iniciar Sesión");
        loginButton.setBounds(150, 150, 200, 40);

        // Agregar acción al botón
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textFieldUsername.getText();
                String password = new String(passwordField.getPassword());

                if (controlador != null && controlador.autenticar(username, password)) {
                    VentanaEmp ventana = new VentanaEmp();
                    ventana.setVisible(true);
                    JOptionPane.showMessageDialog(null, "¡Inicio de sesión exitoso!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    JFrame loginFrame = (JFrame) SwingUtilities.getWindowAncestor(loginButton);
                    loginFrame.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Agregar componentes al panel principal
        mainPanel.add(usernameLabel);
        mainPanel.add(passwordLabel);
        mainPanel.add(textFieldUsername);
        mainPanel.add(passwordField);
        mainPanel.add(loginButton);
    }

    // Configurar la ventana y mostrarla
    public void mostrar() {
        JFrame frame = new JFrame("Formulario de Login");
        frame.setContentPane(this.getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); // Establecer tamaño
        frame.setLocationRelativeTo(null); // Centrar ventana
        frame.setResizable(false); // Evitar redimensionamiento
        frame.setVisible(true);
    }

    // Setter para asignar el controlador
    public void setControlador(ControladorEmpleados controlador) {
        this.controlador = controlador;
    }

    // Getter para el panel principal
    public JPanel getMainPanel() {
        return mainPanel;
    }

    // Clase interna para fondo con opacidad
    static class FondoPanel extends JPanel {
        private final Image fondo;
        private final float opacidad;

        public FondoPanel(String rutaImagen, float opacidad) {
            this.fondo = new ImageIcon(rutaImagen).getImage();
            this.opacidad = opacidad;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacidad));
            g2d.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
