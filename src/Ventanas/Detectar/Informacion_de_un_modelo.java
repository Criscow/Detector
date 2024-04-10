package Ventanas.Detectar;

/**
 *
 * @author Cristopher Yahir Baca Martinez
 */
public class Informacion_de_un_modelo extends javax.swing.JFrame {

    public Informacion_de_un_modelo(String[] datos) {
        this.iniciarComponentes();
        this.Titulo_Nombre_modelo.setText("Nombre del modelo: " + datos[0].replace("_", " "));
        this.Titulo_Nombre_autor.setText("Autor: " + datos[1]);
        this.Titulo_Fecha_creacion.setText("Fecha de creacion: " + datos[2] + "-" + datos[3] + "-" + datos[4]);
        this.Titulo_Resolucion.setText("Resolucion de entrada-imagen recomenda: " + datos[5]);
        this.Titulo_Tamaño.setText("Tamaño: " + datos[6]);
        this.Informacion.setText(datos[9]);
    }

    private void iniciarComponentes() {

        Fondo = new javax.swing.JPanel();
        Boton_salir = new javax.swing.JLabel();
        Titulo_Nombre_modelo = new javax.swing.JLabel();
        Titulo_Nombre_autor = new javax.swing.JLabel();
        Titulo_Fecha_creacion = new javax.swing.JLabel();
        Titulo_Informacion_adicional = new javax.swing.JLabel();
        Titulo_Tamaño = new javax.swing.JLabel();
        Titulo_Resolucion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Informacion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Informacion de un modelo");
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 80, 146), 2));
        Fondo.setToolTipText("");
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton_salir.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Boton_salir.setForeground(new java.awt.Color(104, 80, 146));
        Boton_salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Boton_salir.setText("x");
        Boton_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_salirMouseClicked(evt);
            }
        });
        Fondo.add(Boton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        Titulo_Nombre_modelo.setBackground(new java.awt.Color(255, 255, 255));
        Titulo_Nombre_modelo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Titulo_Nombre_modelo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo_Nombre_modelo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Titulo_Nombre_modelo.setText("Nombre del modelo: ");
        Fondo.add(Titulo_Nombre_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        Titulo_Nombre_autor.setBackground(new java.awt.Color(255, 255, 255));
        Titulo_Nombre_autor.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Titulo_Nombre_autor.setForeground(new java.awt.Color(0, 0, 0));
        Titulo_Nombre_autor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Titulo_Nombre_autor.setText("Autor:");
        Fondo.add(Titulo_Nombre_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        Titulo_Fecha_creacion.setBackground(new java.awt.Color(255, 255, 255));
        Titulo_Fecha_creacion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Titulo_Fecha_creacion.setForeground(new java.awt.Color(0, 0, 0));
        Titulo_Fecha_creacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Titulo_Fecha_creacion.setText("Fecha de creacion:");
        Fondo.add(Titulo_Fecha_creacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        Titulo_Informacion_adicional.setBackground(new java.awt.Color(255, 255, 255));
        Titulo_Informacion_adicional.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Titulo_Informacion_adicional.setForeground(new java.awt.Color(0, 0, 0));
        Titulo_Informacion_adicional.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Titulo_Informacion_adicional.setText("Informacion adicional");
        Fondo.add(Titulo_Informacion_adicional, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        Titulo_Tamaño.setBackground(new java.awt.Color(255, 255, 255));
        Titulo_Tamaño.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Titulo_Tamaño.setForeground(new java.awt.Color(0, 0, 0));
        Titulo_Tamaño.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Titulo_Tamaño.setText("Tamaño: ");
        Fondo.add(Titulo_Tamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        Titulo_Resolucion.setBackground(new java.awt.Color(255, 255, 255));
        Titulo_Resolucion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Titulo_Resolucion.setForeground(new java.awt.Color(0, 0, 0));
        Titulo_Resolucion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Titulo_Resolucion.setText("Resolucion de entrada-imagen recomenda:");
        Fondo.add(Titulo_Resolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jScrollPane1.setBorder(null);

        Informacion.setEditable(false);
        Informacion.setBackground(new java.awt.Color(255, 255, 255));
        Informacion.setColumns(20);
        Informacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Informacion.setForeground(new java.awt.Color(0, 0, 0));
        Informacion.setLineWrap(true);
        Informacion.setRows(5);
        Informacion.setBorder(null);
        jScrollPane1.setViewportView(Informacion);

        Fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 690, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void Boton_salirMouseClicked(java.awt.event.MouseEvent evt) {                                         
        this.setVisible(false); // Oculta la ventana como si se hubiese "Cerrado"
    }                                        

    // Declaracion de variables               
    private javax.swing.JLabel Boton_salir;
    private javax.swing.JPanel Fondo;
    private javax.swing.JTextArea Informacion;
    private javax.swing.JLabel Titulo_Fecha_creacion;
    private javax.swing.JLabel Titulo_Informacion_adicional;
    private javax.swing.JLabel Titulo_Nombre_autor;
    private javax.swing.JLabel Titulo_Nombre_modelo;
    private javax.swing.JLabel Titulo_Resolucion;
    private javax.swing.JLabel Titulo_Tamaño;
    private javax.swing.JScrollPane jScrollPane1;
    // Final de la declaracion de variables             
}
