package Ventanas.Detectar;

import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Random;

import javax.swing.filechooser.FileNameExtensionFilter;

import Ventanas.Otros.Alerta;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Cristopher Yahir Baca Martinez
 */
public class Detectar extends javax.swing.JFrame {

    public Detectar() {
        this.iniciarComponentes();
        this.listarModelos();
    }

    private void iniciarComponentes() {

        Fondo = new javax.swing.JPanel();
        Modelos_ayuda = new javax.swing.JLabel();
        Campo_año = new javax.swing.JTextField();
        Campo_nombres = new javax.swing.JTextField();
        Campo_telefono = new javax.swing.JTextField();
        Campo_dia = new javax.swing.JTextField();
        Campo_mes = new javax.swing.JTextField();
        Campo_sexo_biologico = new javax.swing.JComboBox<>();
        Campo_sexo_titulo = new javax.swing.JLabel();
        Campo_apellidos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Campo_informacion_adicional = new javax.swing.JTextArea();
        Campo_modelo = new javax.swing.JComboBox<>();
        Campo_modelo_titulo = new javax.swing.JLabel();
        Boton_salir = new javax.swing.JLabel();
        Boton_proceder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Detectar");
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        Fondo.add(Modelos_ayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 390, 40, 50));

        Campo_año.setBackground(new java.awt.Color(255, 255, 255));
        Campo_año.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Campo_año.setForeground(new java.awt.Color(51, 51, 51));
        Campo_año.setBorder(javax.swing.BorderFactory.createTitledBorder(
                new javax.swing.border.LineBorder(new java.awt.Color(104, 80, 146), 4, true), "Año",
                javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP,
                new java.awt.Font("Roboto", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        Fondo.add(Campo_año, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 120, -1));

        Campo_nombres.setBackground(new java.awt.Color(255, 255, 255));
        Campo_nombres.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Campo_nombres.setForeground(new java.awt.Color(51, 51, 51));
        Campo_nombres.setBorder(javax.swing.BorderFactory.createTitledBorder(
                new javax.swing.border.LineBorder(new java.awt.Color(104, 80, 146), 4, true), "Nombre(s)",
                javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP,
                new java.awt.Font("Roboto", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        Fondo.add(Campo_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 470, -1));

        Campo_telefono.setBackground(new java.awt.Color(255, 255, 255));
        Campo_telefono.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Campo_telefono.setForeground(new java.awt.Color(51, 51, 51));
        Campo_telefono.setBorder(javax.swing.BorderFactory.createTitledBorder(
                new javax.swing.border.LineBorder(new java.awt.Color(104, 80, 146), 4, true), "Numero de telefono",
                javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP,
                new java.awt.Font("Roboto", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        Fondo.add(Campo_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 470, -1));

        Campo_dia.setBackground(new java.awt.Color(255, 255, 255));
        Campo_dia.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Campo_dia.setForeground(new java.awt.Color(51, 51, 51));
        Campo_dia.setBorder(javax.swing.BorderFactory.createTitledBorder(
                new javax.swing.border.LineBorder(new java.awt.Color(104, 80, 146), 4, true), "Dia",
                javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP,
                new java.awt.Font("Roboto", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        Fondo.add(Campo_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 120, -1));

        Campo_mes.setBackground(new java.awt.Color(255, 255, 255));
        Campo_mes.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Campo_mes.setForeground(new java.awt.Color(51, 51, 51));
        Campo_mes.setBorder(javax.swing.BorderFactory.createTitledBorder(
                new javax.swing.border.LineBorder(new java.awt.Color(104, 80, 146), 4, true), "Mes",
                javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP,
                new java.awt.Font("Roboto", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        Fondo.add(Campo_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 120, -1));

        Campo_sexo_biologico.setBackground(new java.awt.Color(255, 255, 255));
        Campo_sexo_biologico.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Campo_sexo_biologico.setForeground(new java.awt.Color(0, 0, 0));
        Campo_sexo_biologico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        Campo_sexo_biologico.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Fondo.add(Campo_sexo_biologico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 240, 50));

        Campo_sexo_titulo.setBackground(new java.awt.Color(255, 255, 255));
        Campo_sexo_titulo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Campo_sexo_titulo.setForeground(new java.awt.Color(0, 0, 0));
        Campo_sexo_titulo.setText("Sexo biologico");
        Fondo.add(Campo_sexo_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        Campo_apellidos.setBackground(new java.awt.Color(255, 255, 255));
        Campo_apellidos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Campo_apellidos.setForeground(new java.awt.Color(51, 51, 51));
        Campo_apellidos.setBorder(javax.swing.BorderFactory.createTitledBorder(
                new javax.swing.border.LineBorder(new java.awt.Color(104, 80, 146), 4, true), "Apellido(s)",
                javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP,
                new java.awt.Font("Roboto", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        Fondo.add(Campo_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 470, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        Campo_informacion_adicional.setBackground(new java.awt.Color(255, 255, 255));
        Campo_informacion_adicional.setColumns(20);
        Campo_informacion_adicional.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Campo_informacion_adicional.setForeground(new java.awt.Color(51, 51, 51));
        Campo_informacion_adicional.setRows(5);
        Campo_informacion_adicional.setBorder(javax.swing.BorderFactory.createTitledBorder(
                new javax.swing.border.LineBorder(new java.awt.Color(104, 80, 146), 4, true), "Informacion adicional",
                javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP,
                new java.awt.Font("Roboto", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        Campo_informacion_adicional.setLineWrap(true);
        Campo_informacion_adicional.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Campo_informacion_adicional);

        Fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 440, 260));

        Campo_modelo.setBackground(new java.awt.Color(255, 255, 255));
        Campo_modelo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Campo_modelo.setForeground(new java.awt.Color(0, 0, 0));
        Campo_modelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Modelo" }));
        Campo_modelo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Fondo.add(Campo_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 400, 50));

        Campo_modelo_titulo.setBackground(new java.awt.Color(255, 255, 255));
        Campo_modelo_titulo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Campo_modelo_titulo.setForeground(new java.awt.Color(0, 0, 0));
        Campo_modelo_titulo.setText("Modelo de cancer");
        Fondo.add(Campo_modelo_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, -1));

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

        Boton_proceder.setBackground(new java.awt.Color(104, 80, 146));
        Boton_proceder.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Boton_proceder.setForeground(new java.awt.Color(255, 255, 255));
        Boton_proceder.setText("Adjuntar imagenes y detectar");
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
        Fondo.add(Boton_proceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, 440, 50));

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

    /*
     * Lee los datos del modelo seleccionado y se pasan como parametros del constructor
     * de la ventana Informacion_de_un_modelo
     */

         /*
     *  Listar los modelos ya creados en el comboBox this.Campo_modelo
     *  para que el usuario los escoga.
    */
    private void listarModelos() {
        List<String> modelos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Archivos\\Registros\\Modelos_registrados.csv"))) {
            String modelo;
            while ((modelo = br.readLine()) != null) {
                modelos.add(modelo.replace("_", " "));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convertir ArrayList a String[]
        String[] modelosArray = modelos.toArray(new String[0]);

        // Establecer el modelo para el JComboBox
        Campo_modelo.setModel(new javax.swing.DefaultComboBoxModel<>(modelosArray));
    }

    private void Modelos_ayudaMouseClicked(java.awt.event.MouseEvent evt) {
        List<String> datos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Archivos\\Modelos\\" + this.Campo_modelo.getSelectedItem().toString().replace(" ", "_") + "\\datos.csv"))) {
            String dato;
            while ((dato = br.readLine()) != null) {
                datos.add(dato);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convertir ArrayList a String[]
        String[] datosArray = datos.toArray(new String[0]);

        new Informacion_de_un_modelo(datosArray).setVisible(true); // Crea instancia de la interfaz Informacion_de_un_modelo.java
    }

    private void Boton_salirMouseClicked(java.awt.event.MouseEvent evt) {
        this.setVisible(false);
    }

    /**
     * Método que se ejecuta cuando se hace clic en el botón "proceder". Si
     * todos los campos son válidos, se abre un selector de archivos para
     * seleccionar múltiples imágenes. Si no, se muestra una alerta al usuario.
     *
     * @param evt Evento del ratón que desencadena este método.
     */
    private void Boton_procederMouseClicked(java.awt.event.MouseEvent evt) {
        // Verificar si todos los campos son válidos.
        if (!this.validarCampos()) {
            new JOptionPane("Verifica que todos los campos esten bien",
                JOptionPane.INFORMATION_MESSAGE)
                .createDialog("Imagenes positivas").setVisible(true);
            return;
        }

        List<String> rutas = new ArrayList<>();

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);
        fileChooser.setFileFilter(new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png"));

        // Si el usuario aprobó la selección de archivos, añadir la ruta de cada archivo
        // a la lista de rutas.
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            for (File file : fileChooser.getSelectedFiles()) {
                rutas.add(file.getAbsolutePath());
            }
        }

        int indice = new Random().nextInt(1000000);
        ArrayList<String> datos = new ArrayList<>();
        datos.add(this.Campo_nombres.getText());
        datos.add(this.Campo_apellidos.getText());
        datos.add(this.Campo_dia.getText());
        datos.add(this.Campo_mes.getText());
        datos.add(this.Campo_año.getText());
        datos.add(this.Campo_sexo_biologico.getSelectedItem().toString());
        datos.add(this.Campo_telefono.getText());
        datos.add(this.Campo_informacion_adicional.getText());

        try (FileWriter writer = new FileWriter("Archivos\\Registros\\" + indice + "\\datos.csv")) {
            for (String str : datos) {
                writer.write(str);
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.limpiarCampos();

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Archivos\\Otros_recursos\\Rutas_imagenes_detectar.csv"));
            for (Object obj : rutas) {
                if (obj instanceof String) {
                    writer.write((String) obj);
                    writer.newLine();
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Archivos\\Otros_recursos\\Modelo_en_uso.csv"));
            writer.write(this.Campo_modelo.getSelectedItem().toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }

        
        // Si todo sale bien se ejecutara el proceso de detectar
        ejecutarComandoDetectar();

    }

    /*
     *  Ejecutar el archivo python Detectar.py para crear el registro de deteccion
     */
    private void ejecutarComandoDetectar() {
        try {
            // Creamos un ProcessBuilder para ejecutar el comando
            ProcessBuilder pb = new ProcessBuilder("python", ".\\Archivos\\Recursos_ingenieria\\Detectar.py");
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

    /**
     * Método para validar los campos de entrada.
     *
     * @return true si todos los campos son válidos, false en caso contrario.
     */
    private boolean validarCampos() {
        // Verificar que los campos de texto no estén vacíos.
        // Si alguno de los campos está vacío, se retorna false inmediatamente.
        if (this.Campo_nombres.getText().toString().equals("")
                || this.Campo_apellidos.getText().toString().equals("")
                || this.Campo_dia.getText().toString().equals("")
                || this.Campo_mes.getText().toString().equals("")
                || this.Campo_año.getText().toString().equals("")
                || this.Campo_telefono.getText().toString().equals("")) {
            return false;
        }

        // Verificar que los campos numéricos tengan entradas numéricas.
        // Se intenta convertir los campos numéricos a enteros.
        // Si alguno de los campos no es un número válido o no cumple con las
        // restricciones especificadas,
        // se retorna false.
        try {
            int dia = Integer.parseInt(this.Campo_dia.getText().toString());
            int mes = Integer.parseInt(this.Campo_mes.getText().toString());
            int año = Integer.parseInt(this.Campo_año.getText().toString());

            if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || año < 2024) {
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

    private void limpiarCampos() {
        this.Campo_nombres.setText("");
        this.Campo_apellidos.setText("");
        this.Campo_dia.setText("");
        this.Campo_mes.setText("");
        this.Campo_año.setText("");
        this.Campo_telefono.setText("");
        this.Campo_informacion_adicional.setText("");
    }


    // Declaracion de variables
    private javax.swing.JButton Boton_proceder;
    private javax.swing.JLabel Boton_salir;
    private javax.swing.JTextField Campo_apellidos;
    private javax.swing.JTextField Campo_año;
    private javax.swing.JTextField Campo_dia;
    private javax.swing.JTextArea Campo_informacion_adicional;
    private javax.swing.JTextField Campo_mes;
    private javax.swing.JComboBox<String> Campo_modelo;
    private javax.swing.JLabel Campo_modelo_titulo;
    private javax.swing.JTextField Campo_nombres;
    private javax.swing.JComboBox<String> Campo_sexo_biologico;
    private javax.swing.JLabel Campo_sexo_titulo;
    private javax.swing.JTextField Campo_telefono;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel Modelos_ayuda;
    private javax.swing.JScrollPane jScrollPane1;
    // Final de declaracion de variables
}
