package Ventanas.Crear_modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import Ventanas.Otros.Alerta;

/**
 *
 * @author Cristopher Yahir Baca Martinez
 */
public class Crear_modelo extends javax.swing.JFrame {

    public Crear_modelo() {
        initComponents();
    }

    private void initComponents() {
        Fondo = new javax.swing.JPanel();
        Boton_salir = new javax.swing.JLabel();
        Campo_dimensiones = new javax.swing.JTextField();
        Campo_nombre_modelo = new javax.swing.JTextField();
        Campo_año = new javax.swing.JTextField();
        Campo_mes = new javax.swing.JTextField();
        Campo_dia = new javax.swing.JTextField();
        Campo_autor = new javax.swing.JTextField();
        Campo_modelo_titulo = new javax.swing.JLabel();
        Campo_modelo = new javax.swing.JComboBox<>();
        Modelos_ayuda = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Campo_informacion_adicional = new javax.swing.JTextArea();
        Boton_proceder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Crear modelo");
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton_salir.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Boton_salir.setForeground(new java.awt.Color(104, 80, 146));
        Boton_salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Boton_salir.setText("<");
        Boton_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_salirMouseClicked(evt);
            }
        });
        Fondo.add(Boton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        Campo_dimensiones.setBackground(new java.awt.Color(255, 255, 255));
        Campo_dimensiones.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Campo_dimensiones.setForeground(new java.awt.Color(51, 51, 51));
        Campo_dimensiones.setBorder(javax.swing.BorderFactory.createTitledBorder(
                new javax.swing.border.LineBorder(new java.awt.Color(104, 80, 146), 4, true),
                "Ancho y alto de las imagenes(Se redondeara a un multiplo de 8)", javax.swing.border.TitledBorder.LEFT,
                javax.swing.border.TitledBorder.TOP, new java.awt.Font("Roboto", 1, 15), new java.awt.Color(0, 0, 0))); // NOI18N
        Campo_dimensiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_dimensionesActionPerformed(evt);
            }
        });
        Fondo.add(Campo_dimensiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 470, -1));

        Campo_nombre_modelo.setBackground(new java.awt.Color(255, 255, 255));
        Campo_nombre_modelo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Campo_nombre_modelo.setForeground(new java.awt.Color(51, 51, 51));
        Campo_nombre_modelo.setBorder(javax.swing.BorderFactory.createTitledBorder(
                new javax.swing.border.LineBorder(new java.awt.Color(104, 80, 146), 4, true), "Nombre del modelo",
                javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP,
                new java.awt.Font("Roboto", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        Campo_nombre_modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_nombre_modeloActionPerformed(evt);
            }
        });
        Fondo.add(Campo_nombre_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 470, -1));

        Campo_año.setBackground(new java.awt.Color(255, 255, 255));
        Campo_año.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Campo_año.setForeground(new java.awt.Color(51, 51, 51));
        Campo_año.setBorder(javax.swing.BorderFactory.createTitledBorder(
                new javax.swing.border.LineBorder(new java.awt.Color(104, 80, 146), 4, true), "Año",
                javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP,
                new java.awt.Font("Roboto", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        Campo_año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_añoActionPerformed(evt);
            }
        });
        Fondo.add(Campo_año, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 120, -1));

        Campo_mes.setBackground(new java.awt.Color(255, 255, 255));
        Campo_mes.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Campo_mes.setForeground(new java.awt.Color(51, 51, 51));
        Campo_mes.setBorder(javax.swing.BorderFactory.createTitledBorder(
                new javax.swing.border.LineBorder(new java.awt.Color(104, 80, 146), 4, true), "Mes",
                javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP,
                new java.awt.Font("Roboto", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        Campo_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_mesActionPerformed(evt);
            }
        });
        Fondo.add(Campo_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 120, -1));

        Campo_dia.setBackground(new java.awt.Color(255, 255, 255));
        Campo_dia.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Campo_dia.setForeground(new java.awt.Color(51, 51, 51));
        Campo_dia.setBorder(javax.swing.BorderFactory.createTitledBorder(
                new javax.swing.border.LineBorder(new java.awt.Color(104, 80, 146), 4, true), "Dia",
                javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP,
                new java.awt.Font("Roboto", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        Campo_dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_diaActionPerformed(evt);
            }
        });
        Fondo.add(Campo_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 120, -1));

        Campo_autor.setBackground(new java.awt.Color(255, 255, 255));
        Campo_autor.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Campo_autor.setForeground(new java.awt.Color(51, 51, 51));
        Campo_autor.setBorder(javax.swing.BorderFactory.createTitledBorder(
                new javax.swing.border.LineBorder(new java.awt.Color(104, 80, 146), 4, true), "Autor",
                javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP,
                new java.awt.Font("Roboto", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        Campo_autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_autorActionPerformed(evt);
            }
        });
        Fondo.add(Campo_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 470, -1));

        Campo_modelo_titulo.setBackground(new java.awt.Color(255, 255, 255));
        Campo_modelo_titulo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Campo_modelo_titulo.setForeground(new java.awt.Color(0, 0, 0));
        Campo_modelo_titulo.setText("Tamaño");
        Fondo.add(Campo_modelo_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        Campo_modelo.setBackground(new java.awt.Color(255, 255, 255));
        Campo_modelo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Campo_modelo.setForeground(new java.awt.Color(0, 0, 0));
        Campo_modelo.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Chico", "Mediano", "Grande", "Muy grande" }));
        Campo_modelo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Fondo.add(Campo_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 400, 50));

        Modelos_ayuda.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Modelos_ayuda.setForeground(new java.awt.Color(104, 80, 146));
        Modelos_ayuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Modelos_ayuda.setText("?");
        Modelos_ayuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Modelos_ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Modelos_ayudaMouseClicked(evt);
            }
        });
        Fondo.add(Modelos_ayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 40, 50));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        Campo_informacion_adicional.setBackground(new java.awt.Color(255, 255, 255));
        Campo_informacion_adicional.setColumns(20);
        Campo_informacion_adicional.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        Campo_informacion_adicional.setForeground(new java.awt.Color(51, 51, 51));
        Campo_informacion_adicional.setLineWrap(true);
        Campo_informacion_adicional.setWrapStyleWord(true);
        Campo_informacion_adicional.setRows(5);
        Campo_informacion_adicional.setBorder(javax.swing.BorderFactory.createTitledBorder(
                new javax.swing.border.LineBorder(new java.awt.Color(104, 80, 146), 4, true), "Informacion adicional",
                javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP,
                new java.awt.Font("Roboto", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jScrollPane1.setViewportView(Campo_informacion_adicional);

        Fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 440, 410));

        Boton_proceder.setBackground(new java.awt.Color(104, 80, 146));
        Boton_proceder.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Boton_proceder.setForeground(new java.awt.Color(255, 255, 255));
        Boton_proceder.setText("Adjuntar imagenes y entrenar");
        Boton_proceder.setBorderPainted(false);
        Boton_proceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_proceder.setDefaultCapable(false);
        Boton_proceder.setFocusPainted(false);
        Boton_proceder.setFocusable(false);
        Boton_proceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_procederMouseClicked(evt);
            }
        });
        Boton_proceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_procederActionPerformed(evt);
            }
        });
        Fondo.add(Boton_proceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 440, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
    }

    private void Boton_salirMouseClicked(java.awt.event.MouseEvent evt) {
        this.setVisible(false); // Oculta la ventana como si se hubiese "Cerrado"
    }

    private void Campo_dimensionesActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void Campo_nombre_modeloActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void Campo_añoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void Campo_mesActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void Campo_diaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void Campo_autorActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void Modelos_ayudaMouseClicked(java.awt.event.MouseEvent evt) {
        String Tamaño = this.Campo_modelo.getSelectedItem().toString();
        new Informacion_de_Tamaño(Tamaño).setVisible(true);
    }

    /**
     * Método para validar los campos de entrada.
     *
     * @return true si todos los campos son válidos, false en caso contrario.
     */
    private boolean validarCampos() {
        // Verificar que los campos de texto no estén vacíos.
        if (this.Campo_nombre_modelo.getText().toString().equals("")
                || this.Campo_dimensiones.getText().toString().equals("")
                || this.Campo_dia.getText().toString().equals("")
                || this.Campo_mes.getText().toString().equals("")
                || this.Campo_año.getText().toString().equals("")
                || this.Campo_autor.getText().toString().equals("")) {
            return false;
        }

        // Verificar que los campos de nombre y autor solo contengan letras y números.
        String regex = "^[a-zA-Z0-9 ]*$";
        if (!this.Campo_nombre_modelo.getText().toString().matches(regex)
                || !this.Campo_autor.getText().toString().matches(regex)) {
            return false;
        }
        // Verificar que los campos numéricos tengan entradas numéricas.
        try {
            int dia = Integer.parseInt(this.Campo_dia.getText().toString());
            int mes = Integer.parseInt(this.Campo_mes.getText().toString());
            int año = Integer.parseInt(this.Campo_año.getText().toString());
            int dimensiones = Integer.parseInt(this.Campo_dimensiones.getText().toString());

            if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || año < 2024 || dimensiones < 1) {
                return false;
            }
        } catch (NumberFormatException e) {
            // Si se lanza una excepción NumberFormatException, significa que uno de los
            // campos no es un número válido.
            return false;
        }

        // Si todas las verificaciones pasan, se retorna true.
        return true;
    }

    /**
     * Método para limpiar los campos de entrada.
     */

    private void limpiarCampos() {
        this.Campo_nombre_modelo.setText("");
        this.Campo_autor.setText("");
        this.Campo_dia.setText("");
        this.Campo_mes.setText("");
        this.Campo_año.setText("");
        this.Campo_dimensiones.setText("");
        this.Campo_informacion_adicional.setText("");
    }

    /**
     * Método que se ejecuta cuando se hace clic en el botón "proceder". Si
     * todos los campos son válidos, se abre un selector de archivos para
     * seleccionar la carpeta de imagenes positivas y negativas . Si no, se
     * muestra una alerta al usuario.
     *
     * @param evt Evento del ratón que desencadena este método.
     */
    private void Boton_procederMouseClicked(java.awt.event.MouseEvent evt) {
        // Verificar si todos los campos son válidos.
        if (!this.validarCampos()) {
            new Alerta("Verifica que todos los campos esten bien").setVisible(true);
            return;
        }

        // Seleccionar la carpeta de imágenes positivas.
        new JOptionPane("Vas a seleccionar la carpeta de imagenes positivas(solo se tomara jpg y png)",
                JOptionPane.INFORMATION_MESSAGE)
                .createDialog("Imagenes positivas").setVisible(true);
        String ruta_positiva = seleccionarCarpeta();

        // Seleccionar la carpeta de imágenes negativas.
        new JOptionPane("Vas a seleccionar la carpeta de imagenes negativas(solo se tomara jpg y png)",
                JOptionPane.INFORMATION_MESSAGE)
                .createDialog("Imagenes negativas").setVisible(true);
        String ruta_negativa = seleccionarCarpeta();

        ArrayList<String> datos = new ArrayList<String>();
        datos.add(Campo_nombre_modelo.getText().toString().replace(" ", "_"));
        datos.add(Campo_autor.getText().toString());
        datos.add(Campo_dia.getText().toString());
        datos.add(Campo_mes.getText().toString());
        datos.add(Campo_año.getText().toString());
        datos.add(String.valueOf(retornarMultiplo8(Integer.parseInt(Campo_dimensiones.getText().toString()))));
        datos.add(Campo_modelo.getSelectedItem().toString());
        datos.add(ruta_positiva);
        datos.add(ruta_negativa);
        datos.add(Campo_informacion_adicional.getText().toString().equals("") ? "Sin formacion adicional"
                : Campo_informacion_adicional.getText().toString());

        // Verificar que no exista otro modelo con el mismo nombre

        String ultimosModelos = "Archivos\\Registros\\Modelos_registrados.csv"; // Ruta del archivo CSV
        boolean modeloDuplicado = false;
        try (BufferedReader br = new BufferedReader(new FileReader(ultimosModelos))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().equals(Campo_nombre_modelo.getText().toString().replace(" ", "_"))) {
                    modeloDuplicado = true;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (modeloDuplicado) {
            new JOptionPane("Ya existe un modelo llamado " + Campo_nombre_modelo.getText().toString(),
                    JOptionPane.INFORMATION_MESSAGE)
                    .createDialog("Alerta").setVisible(true);
        } else {
            final String MODELO_DIR = "Archivos\\Modelos\\";
            final String REGISTROS_DIR = "Archivos\\Registros\\";
            final String ULTIMO_MODELO_DIR = "Archivos\\Otros_recursos\\Ultimo_modelo.csv";

            // Ruta completa del archivo CSV
            String nombreModelo = Campo_nombre_modelo.getText().toString().replace(" ", "_");
            String nombre = MODELO_DIR + nombreModelo + "\\datos.csv";

            // Crear los directorios necesarios
            File file = new File(nombre);
            file.getParentFile().mkdirs();

            // Llamar al método escribirCsv
            escribirCsv(datos, nombre);

            String myFileName = REGISTROS_DIR + "Modelos_registrados.csv";

            try {
                // Abre el archivo en modo de apendizaje (sin sobrescribir)
                try (BufferedWriter output = new BufferedWriter(new FileWriter(myFileName, true))) {
                    // Agrega el nuevo nombre al archivo
                    output.append(nombreModelo);
                    output.newLine(); // Agrega un salto de línea al final
                }
            } catch (IOException e) {
                e.printStackTrace();
                // Considera un manejo de errores más robusto aquí
            }

            ArrayList<String> ultimo_nombre = new ArrayList<String>();
            ultimo_nombre.add(nombreModelo);
            escribirCsv(ultimo_nombre, ULTIMO_MODELO_DIR);

            this.limpiarCampos(); // Se limpia todos los campos

            // Verificamos la aceleración por GPU
            boolean aceleracion = verificarAceleracionGPU();

            if (!aceleracion) { 
                // Si no hay aceleración por GPU, mostramos un mensaje al usuario
                new JOptionPane(
                        "No se detecto aceleracion por GPU la cual es necesario \n vaya a la seccion de Ayuda > Aceleracion por GPU.",
                        JOptionPane.INFORMATION_MESSAGE)
                        .createDialog("Aceleracion por GPU").setVisible(true);
            } else {
                // Si hay aceleración por GPU y conexion a internet, ejecutamos el comando para crear el modelo
                if(verificarConexion()){ // Verifica si hay conexion a internet
                    ejecutarComandoCrearModelo();
                } else {
                    new JOptionPane("Verifica que haya conexion a internet",
                    JOptionPane.INFORMATION_MESSAGE)
                    .createDialog("Alerta").setVisible(true);
                }
            }
        }

    }

    public boolean verificarConexion() {
        try {
            InetAddress googleAddress = InetAddress.getByName("www.google.com");
            boolean conexion = googleAddress.isReachable(5000); // Espera 5 segundos para la respuesta

            return conexion;
        } catch (IOException e) {
            return false;
        }
    }

    public int retornarMultiplo8(int num) {
        if (num % 8 == 0) {
            return num;
        } else {
            int bajo = num - (num % 8);
            int alto = bajo + 8;
            return (num - bajo < alto - num) ? bajo : alto;
        }
    }

    private void ejecutarComandoCrearModelo() {
        try {
            // Creamos un ProcessBuilder para ejecutar el comando
            ProcessBuilder pb = new ProcessBuilder("python", ".\\Archivos\\Recursos_ingenieria\\Crear_modelo.py");
            Process process = pb.start();

            // Leemos la salida del comando
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    System.out.println(linea);
                }
            }
        } catch (IOException e) {
            e.printStackTrace(System.out);
            new Alerta("Algo salio mal").setVisible(true);
        }
    }

    // Método para ejecutar un comando y verificar si la GPU está disponible
    private boolean verificarAceleracionGPU() {
        boolean aceleracion = false;
        try {
            // Creamos un ProcessBuilder para ejecutar el comando
            ProcessBuilder pb = new ProcessBuilder("python", ".\\Archivos\\Recursos_ingenieria\\DetectarGPU.py");
            Process process = pb.start();

            // Leemos la salida del comando
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.equals("GPU disponible")) {
                    aceleracion = true;
                }
            }

        } catch (IOException e) {
            e.printStackTrace(System.out);
            new Alerta("Algo salio mal").setVisible(true);
        }
        return aceleracion;
    }

    public void escribirCsv(ArrayList<String> datos, String nombre) {
        FileWriter csvWriter = null;
        try {
            csvWriter = new FileWriter(nombre);
            for (String row : datos) {
                csvWriter.append(row);
                csvWriter.append("\n");
            }
            csvWriter.flush();
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para seleccionar una carpeta y devolver su ruta.
    private String seleccionarCarpeta() {
        // Crear un selector de archivos para seleccionar directorios.
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile().getAbsolutePath();
        } else {
            new Alerta("No se selecciono ninguna carpeta").setVisible(true);
            return "";
        }
    }

    private void Boton_procederActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    // Variables declaration - do not modify
    private javax.swing.JButton Boton_proceder;
    private javax.swing.JLabel Boton_salir;
    private javax.swing.JTextField Campo_autor;
    private javax.swing.JTextField Campo_año;
    private javax.swing.JTextField Campo_dia;
    private javax.swing.JTextField Campo_dimensiones;
    private javax.swing.JTextArea Campo_informacion_adicional;
    private javax.swing.JTextField Campo_mes;
    private javax.swing.JComboBox<String> Campo_modelo;
    private javax.swing.JLabel Campo_modelo_titulo;
    private javax.swing.JTextField Campo_nombre_modelo;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel Modelos_ayuda;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration
}
