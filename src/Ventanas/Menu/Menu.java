package Ventanas.Menu;

import Ventanas.Otros.Interfaces_instancias;

/**
 *
 * @author Cristopher Yahir Baca Martinez
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        this.iniciarComponentes();
    }
                     
    private void iniciarComponentes() {

        Fondo = new javax.swing.JPanel();
        Panel_imagen = new javax.swing.JPanel();
        Imagen_liston = new javax.swing.JLabel();
        Panel_opciones = new javax.swing.JPanel();
        Boton_salir2 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Boton_ayudar = new javax.swing.JButton();
        Boton_registros = new javax.swing.JButton();
        Boton_detectar = new javax.swing.JButton();
        Boton_crear_modelo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        Fondo.setMinimumSize(new java.awt.Dimension(1000, 600));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_imagen.setBackground(new java.awt.Color(104, 80, 146));

        Imagen_liston.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Imagen_liston.setAutoscrolls(true);
        Imagen_liston.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Panel_imagenLayout = new javax.swing.GroupLayout(Panel_imagen);
        Panel_imagen.setLayout(Panel_imagenLayout);
        Panel_imagenLayout.setHorizontalGroup(
            Panel_imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_imagenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Imagen_liston, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Panel_imagenLayout.setVerticalGroup(
            Panel_imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_imagenLayout.createSequentialGroup()
                .addComponent(Imagen_liston, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Fondo.add(Panel_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 460, 600));

        Panel_opciones.setBackground(new java.awt.Color(255, 255, 255));
        Panel_opciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_opciones.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N

        Boton_salir2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Boton_salir2.setForeground(new java.awt.Color(104, 80, 146));
        Boton_salir2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Boton_salir2.setText("X");
        Boton_salir2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_salir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_salir2MouseClicked(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Roboto", 1, 55)); // NOI18N
        Titulo.setForeground(new java.awt.Color(104, 80, 146));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Detector de cancer");

        Boton_ayudar.setBackground(new java.awt.Color(104, 80, 146));
        Boton_ayudar.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        Boton_ayudar.setForeground(new java.awt.Color(255, 255, 255));
        Boton_ayudar.setText("?");
        Boton_ayudar.setBorderPainted(false);
        Boton_ayudar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_ayudar.setDefaultCapable(false);
        Boton_ayudar.setFocusPainted(false);
        Boton_ayudar.setFocusable(false);
        Boton_ayudar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_ayudarMouseClicked(evt);
            }
        });

        Boton_registros.setBackground(new java.awt.Color(104, 80, 146));
        Boton_registros.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        Boton_registros.setForeground(new java.awt.Color(255, 255, 255));
        Boton_registros.setText("Registros");
        Boton_registros.setToolTipText("");
        Boton_registros.setBorderPainted(false);
        Boton_registros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_registros.setDefaultCapable(false);
        Boton_registros.setFocusPainted(false);
        Boton_registros.setFocusable(false);
        Boton_registros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_registrosMouseClicked(evt);
            }
        });
        Boton_detectar.setBackground(new java.awt.Color(104, 80, 146));
        Boton_detectar.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        Boton_detectar.setForeground(new java.awt.Color(255, 255, 255));
        Boton_detectar.setText("Detectar");
        Boton_detectar.setBorderPainted(false);
        Boton_detectar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_detectar.setDefaultCapable(false);
        Boton_detectar.setFocusPainted(false);
        Boton_detectar.setFocusable(false);
        Boton_detectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_detectarMouseClicked(evt);
            }
        });
        Boton_crear_modelo.setBackground(new java.awt.Color(104, 80, 146));
        Boton_crear_modelo.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        Boton_crear_modelo.setForeground(new java.awt.Color(255, 255, 255));
        Boton_crear_modelo.setText("Crear modelo");
        Boton_crear_modelo.setToolTipText("");
        Boton_crear_modelo.setBorderPainted(false);
        Boton_crear_modelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_crear_modelo.setDefaultCapable(false);
        Boton_crear_modelo.setFocusPainted(false);
        Boton_crear_modelo.setFocusable(false);
        Boton_crear_modelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_crear_modeloMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("©2024 Cristopher Yahir Baca Martinez");

        javax.swing.GroupLayout Panel_opcionesLayout = new javax.swing.GroupLayout(Panel_opciones);
        Panel_opciones.setLayout(Panel_opcionesLayout);
        Panel_opcionesLayout.setHorizontalGroup(
            Panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_opcionesLayout.createSequentialGroup()
                .addComponent(Boton_salir2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Panel_opcionesLayout.createSequentialGroup()
                .addGroup(Panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_opcionesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                            .addGroup(Panel_opcionesLayout.createSequentialGroup()
                                .addComponent(Boton_ayudar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(8, 8, 8))))
                    .addGroup(Panel_opcionesLayout.createSequentialGroup()
                        .addGroup(Panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_opcionesLayout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(Boton_detectar))
                            .addGroup(Panel_opcionesLayout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(Boton_crear_modelo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(Panel_opcionesLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(Boton_registros)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_opcionesLayout.setVerticalGroup(
            Panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_opcionesLayout.createSequentialGroup()
                .addComponent(Boton_salir2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(Boton_detectar)
                .addGap(29, 29, 29)
                .addComponent(Boton_crear_modelo)
                .addGroup(Panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_opcionesLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Boton_registros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(Boton_ayudar))
                    .addGroup(Panel_opcionesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );

        Fondo.add(Panel_opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }                     

    private void Boton_salir2MouseClicked(java.awt.event.MouseEvent evt) {                                          
        System.exit(0);
    }                                         

    private void Boton_ayudarMouseClicked(java.awt.event.MouseEvent evt) {                                          
        if (Interfaces_instancias.AYUDA.isVisible()) {
            Interfaces_instancias.AYUDA.setVisible(false);
        }
        Interfaces_instancias.AYUDA.setVisible(true);
    }                                         

    private void Boton_registrosMouseClicked(java.awt.event.MouseEvent evt) {                                             

    }                                            

    private void Boton_detectarMouseClicked(java.awt.event.MouseEvent evt) {                                            
        if (Interfaces_instancias.DETECTAR.isVisible()) {
            Interfaces_instancias.DETECTAR.setVisible(false);
        }
        Interfaces_instancias.DETECTAR.setVisible(true);
    }                                           

    private void Boton_crear_modeloMouseClicked(java.awt.event.MouseEvent evt) {                                                
        if (Interfaces_instancias.CREAR_MODELO.isVisible()) {
            Interfaces_instancias.CREAR_MODELO.setVisible(false);
        }
        Interfaces_instancias.CREAR_MODELO.setVisible(true);
    }                                               

    // Declaracion de variables                 
    private javax.swing.JButton Boton_ayudar;
    private javax.swing.JButton Boton_crear_modelo;
    private javax.swing.JButton Boton_detectar;
    private javax.swing.JButton Boton_registros;
    private javax.swing.JLabel Boton_salir2;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel Imagen_liston;
    private javax.swing.JPanel Panel_imagen;
    private javax.swing.JPanel Panel_opciones;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    // Final de declaracion de variables                
}
