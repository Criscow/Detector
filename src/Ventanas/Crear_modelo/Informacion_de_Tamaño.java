package Ventanas.Crear_modelo;

/**
 *
 * @author Cristopher Yahir Baca Martinez
 */
public class Informacion_de_Tamaño extends javax.swing.JFrame {

    public Informacion_de_Tamaño(String tamaño) {
    initComponents();
    
    
    /*
    *  Este constructor acepta un parámetro de tamaño y, en función de su valor,
    *  establece los atributos correspondientes de la ventana. Los posibles valores
    *  del parámetro de tamaño son "Chico", "Mediano", "Grande" y "Muy grande".
    */
    
    if(tamaño.equals("Chico")){ // Modelo v2 B0
        this.setTitle("Informacion de modelo chico");
        this.Titulo_parametros_totales.setText("Total de parametros: 5,920,593");
        this.Titulo_Parametros_entrenables.setText("Parametros entrenables: 5,859,985 ");
        this.Titulo_Parametros_no_entrenables.setText("Parametros no entrenables: 60,608");
    } else if(tamaño.equals("Mediano")){ // Modelo v2 B2
        this.setTitle("Informacion de modelo mediano");
        this.Titulo_parametros_totales.setText("Total de parametros: 8,770,783");
        this.Titulo_Parametros_entrenables.setText("Parametros entrenables: 8,688,495");
        this.Titulo_Parametros_no_entrenables.setText("Parametros no entrenables: 82,288");
    } else if(tamaño.equals("Grande")){ // Modelo v2 B3
        this.setTitle("Informacion de modelo grande");
        this.Titulo_parametros_totales.setText("Total de parametros: 12,932,159");
        this.Titulo_Parametros_entrenables.setText("Parametros entrenables: 12,822,943");
        this.Titulo_Parametros_no_entrenables.setText("Parametros no entrenables: 109,216");
    } else if(tamaño.equals("Muy grande")){ // Modelo v2 S
        this.setTitle("Informacion de modelo muy grande");
        this.Titulo_parametros_totales.setText("Total de parametros: 20,332,641");
        this.Titulo_Parametros_entrenables.setText("Parametros entrenables: 20,178,769");
        this.Titulo_Parametros_no_entrenables.setText("Parametros no entrenables: 153,872");
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Boton_salir = new javax.swing.JLabel();
        Titulo_parametros_totales = new javax.swing.JLabel();
        Titulo_Parametros_entrenables = new javax.swing.JLabel();
        Titulo_Parametros_no_entrenables = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 80, 146), 2));
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
        Fondo.add(Boton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        Titulo_parametros_totales.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Titulo_parametros_totales.setForeground(new java.awt.Color(0, 0, 0));
        Titulo_parametros_totales.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Titulo_parametros_totales.setText("Total de parametros:");
        Fondo.add(Titulo_parametros_totales, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 380, -1));

        Titulo_Parametros_entrenables.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Titulo_Parametros_entrenables.setForeground(new java.awt.Color(0, 0, 0));
        Titulo_Parametros_entrenables.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Titulo_Parametros_entrenables.setText("Parametros entrenables:");
        Fondo.add(Titulo_Parametros_entrenables, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 380, -1));

        Titulo_Parametros_no_entrenables.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Titulo_Parametros_no_entrenables.setForeground(new java.awt.Color(0, 0, 0));
        Titulo_Parametros_no_entrenables.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Titulo_Parametros_no_entrenables.setText("Parametros no entrenables:");
        Fondo.add(Titulo_Parametros_no_entrenables, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 380, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void Boton_salirMouseClicked(java.awt.event.MouseEvent evt) {                                         
        this.setVisible(false); // Oculta la ventana como si se hubiese "Cerrado"
    }                                        

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Boton_salir;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel Titulo_Parametros_entrenables;
    private javax.swing.JLabel Titulo_Parametros_no_entrenables;
    private javax.swing.JLabel Titulo_parametros_totales;
    // End of variables declaration                   
}
