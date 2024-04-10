package Ventanas.Otros;

/**
 *
 * @author Cristopher Yahir Baca Martinez
 */

public class Alerta extends javax.swing.JFrame {

    public Alerta(String alerta) {
        this.iniciarComponentes();
        this.Texto.setText(alerta);
        
    }
               
    private void iniciarComponentes() {

        Fondo = new javax.swing.JPanel();
        Boton_salir = new javax.swing.JLabel();
        Texto = new javax.swing.JLabel();

        setTitle("Alerta");
        setLocationByPlatform(true);
        setUndecorated(true);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 80, 146), 2));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton_salir.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Boton_salir.setForeground(new java.awt.Color(104, 80, 146));
        Boton_salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Boton_salir.setText("X");
        Boton_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_salirMouseClicked(evt);
            }
        });
        Fondo.add(Boton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        Texto.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Texto.setForeground(new java.awt.Color(0, 0, 0));
        Fondo.add(Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 360, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }                  

    private void Boton_salirMouseClicked(java.awt.event.MouseEvent evt) {                                         
        this.setVisible(false);
    }                                        

    // Declaracion de variables                  
    private javax.swing.JLabel Boton_salir;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel Texto;
    // Final de la declaracion de variables                
}
