package Ventanas.Ayuda;

/**
 *
 * @author Cristopher Yahir Baca Martinez
 */
public class Ayuda extends javax.swing.JFrame {

    public Ayuda() {
        this.iniciarComponentes();
    }
                    
    private void iniciarComponentes() {

        Fondo = new javax.swing.JPanel();
        Boton_salir = new javax.swing.JLabel();
        Boton_aceleracion_gpu = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Boton_recomendacion_imagenes = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Boton_informacion_crear_modelo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Boton_informacion_detectar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Informacion = new javax.swing.JTextArea();
        Boton_funcionamiento = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Ayuda");
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
        Fondo.add(Boton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 50, 50));

        Boton_aceleracion_gpu.setBackground(new java.awt.Color(104, 80, 146));
        Boton_aceleracion_gpu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Boton_aceleracion_gpu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_aceleracion_gpu.setPreferredSize(new java.awt.Dimension(300, 250));
        Boton_aceleracion_gpu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_aceleracion_gpuMouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Aceleracion");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("por GPU");

        javax.swing.GroupLayout Boton_aceleracion_gpuLayout = new javax.swing.GroupLayout(Boton_aceleracion_gpu);
        Boton_aceleracion_gpu.setLayout(Boton_aceleracion_gpuLayout);
        Boton_aceleracion_gpuLayout.setHorizontalGroup(
            Boton_aceleracion_gpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Boton_aceleracion_gpuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Boton_aceleracion_gpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Boton_aceleracion_gpuLayout.setVerticalGroup(
            Boton_aceleracion_gpuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Boton_aceleracion_gpuLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(26, 26, 26))
        );

        Fondo.add(Boton_aceleracion_gpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 250, 120));

        Boton_recomendacion_imagenes.setBackground(new java.awt.Color(104, 80, 146));
        Boton_recomendacion_imagenes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Boton_recomendacion_imagenes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_recomendacion_imagenes.setPreferredSize(new java.awt.Dimension(300, 250));
        Boton_recomendacion_imagenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_recomendacion_imagenesMouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Recomendacion");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("de imagenes");

        javax.swing.GroupLayout Boton_recomendacion_imagenesLayout = new javax.swing.GroupLayout(Boton_recomendacion_imagenes);
        Boton_recomendacion_imagenes.setLayout(Boton_recomendacion_imagenesLayout);
        Boton_recomendacion_imagenesLayout.setHorizontalGroup(
            Boton_recomendacion_imagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Boton_recomendacion_imagenesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Boton_recomendacion_imagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Boton_recomendacion_imagenesLayout.setVerticalGroup(
            Boton_recomendacion_imagenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Boton_recomendacion_imagenesLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(25, 25, 25))
        );

        Fondo.add(Boton_recomendacion_imagenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 250, 120));

        Boton_informacion_crear_modelo.setBackground(new java.awt.Color(104, 80, 146));
        Boton_informacion_crear_modelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Boton_informacion_crear_modelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_informacion_crear_modelo.setPreferredSize(new java.awt.Dimension(300, 250));
        Boton_informacion_crear_modelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_informacion_crear_modeloMouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Informacion");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("crear modelo");

        javax.swing.GroupLayout Boton_informacion_crear_modeloLayout = new javax.swing.GroupLayout(Boton_informacion_crear_modelo);
        Boton_informacion_crear_modelo.setLayout(Boton_informacion_crear_modeloLayout);
        Boton_informacion_crear_modeloLayout.setHorizontalGroup(
            Boton_informacion_crear_modeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Boton_informacion_crear_modeloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Boton_informacion_crear_modeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Boton_informacion_crear_modeloLayout.setVerticalGroup(
            Boton_informacion_crear_modeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Boton_informacion_crear_modeloLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(26, 26, 26))
        );

        Fondo.add(Boton_informacion_crear_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 250, 120));

        Boton_informacion_detectar.setBackground(new java.awt.Color(104, 80, 146));
        Boton_informacion_detectar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Boton_informacion_detectar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_informacion_detectar.setPreferredSize(new java.awt.Dimension(300, 250));
        Boton_informacion_detectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_informacion_detectarMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("detectar");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Informacion");

        javax.swing.GroupLayout Boton_informacion_detectarLayout = new javax.swing.GroupLayout(Boton_informacion_detectar);
        Boton_informacion_detectar.setLayout(Boton_informacion_detectarLayout);
        Boton_informacion_detectarLayout.setHorizontalGroup(
            Boton_informacion_detectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Boton_informacion_detectarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Boton_informacion_detectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Boton_informacion_detectarLayout.setVerticalGroup(
            Boton_informacion_detectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Boton_informacion_detectarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        Fondo.add(Boton_informacion_detectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 250, 120));

        jScrollPane1.setBorder(null);

        Informacion.setEditable(false);
        Informacion.setBackground(new java.awt.Color(255, 255, 255));
        Informacion.setColumns(20);
        Informacion.setFont(new java.awt.Font("Roboto", 0, 17)); // NOI18N
        Informacion.setForeground(new java.awt.Color(0, 0, 0));
        Informacion.setRows(5);
        Informacion.setText("Selecciona una categoria de ayuda.");
        Informacion.setBorder(null);
        Informacion.setLineWrap(true);
        Informacion.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Informacion);

        Fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 680, 500));

        Boton_funcionamiento.setBackground(new java.awt.Color(104, 80, 146));
        Boton_funcionamiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Boton_funcionamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_funcionamiento.setPreferredSize(new java.awt.Dimension(300, 250));
        Boton_funcionamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_funcionamientoMouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("funciona?");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("¿Como");

        javax.swing.GroupLayout Boton_funcionamientoLayout = new javax.swing.GroupLayout(Boton_funcionamiento);
        Boton_funcionamiento.setLayout(Boton_funcionamientoLayout);
        Boton_funcionamientoLayout.setHorizontalGroup(
            Boton_funcionamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Boton_funcionamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Boton_funcionamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addContainerGap())
        );
        Boton_funcionamientoLayout.setVerticalGroup(
            Boton_funcionamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Boton_funcionamientoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        Fondo.add(Boton_funcionamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }                  

    private void Boton_salirMouseClicked(java.awt.event.MouseEvent evt) {                                         
        this.setVisible(false); // Oculta la ventana como si se hubiera "Cerrado"
    }                                        

    private void Boton_funcionamientoMouseClicked(java.awt.event.MouseEvent evt) {                                                  
        Informacion.setText("Este software utiliza inteligencia artificial mediante una Red Neuronal Convolucional para detectar el cáncer. La red aprende a diferenciar entre tejidos con y sin cáncer. En términos sencillos, se trata de una red que clasifica imágenes como A (sin cáncer) o \nB (con cáncer). Para lograrlo, se basa en el modelo EfficientNet.\n\nEfficientNet es una arquitectura de red neuronal que se destaca por su enfoque en el \n‘escalado compuesto’. Este concepto optimiza tres dimensiones clave: ancho, \nprofundidad y resolución. El objetivo es encontrar un equilibrio óptimo para lograr un \nmejor rendimiento en la clasificación de imágenes. De hecho, EfficientNet ha demostrado superar a otras arquitecturas como AmoebaNet, PNASNet, NASNet y ResNet.\n\nAsí que, solo tendrás que proporcionar tus imágenes de tejidos con y sin cáncer, darle un nombre al modelo y especificar su tamaño. El software se encargará de ponerlo a tu \ndisposición para que lo utilices.");
    }                                                 

    private void Boton_informacion_detectarMouseClicked(java.awt.event.MouseEvent evt) {                                                        
        Informacion.setText("La Ventana de Detección es un espacio donde puedes utilizar los modelos que vienen \npreinstalados en el software o aquellos que tú mismo entrenes utilizando esta misma \nherramienta (ten en cuenta que no se aceptan modelos externos o de otras fuentes en \nesta versión del software).\n\nPara crear un registro de detección, simplemente sigue estos pasos:\n\n- Ingresa el nombre del paciente.\n\n- Proporciona su apellido(s).\n\n- Selecciona la fecha del registro. Ten en cuenta que esta fecha se ingresa manualmente debido a posibles desfases.\n\n- Indica el sexo biológico del paciente.\n\n- Agrega un número de teléfono como referencia.\n\n- Incluye cualquier información adicional relevante, como síntomas o exámenes médicos previos.\n\n- Agrega las imágenes(Solo PNG y JPG) de la parte del cuerpo donde se sospecha que podría haber cáncer(Revisa la seccion de ética y privacidad de los datos médicos).");
    }                                                       

    private void Boton_informacion_crear_modeloMouseClicked(java.awt.event.MouseEvent evt) {                                                            
        Informacion.setText("La Ventana de Creación de Modelos es una interfaz que permite a los usuarios del software diseñar modelos de detección de cáncer de manera sencilla. Estos modelos se pueden utilizar posteriormente en la interfaz de detección para identificar el tipo de cáncer requerido.\n\nPara crear un modelo, debes proporcionar la siguiente información:\n\n- Ingresa un nombre descriptivo para el modelo (por ejemplo, “Cáncer de Mama por Mamografías Versión 2”). Solo se admiten letras y números en el nombre.\n\n- Indica el autor del modelo.\n\n- Selecciona la fecha en la que se creó el modelo. Ten en cuenta que esta fecha se ingresa manualmente debido a posibles desfases.\n\n- Define el ancho y alto de las imágenes. Se recomienda que las imágenes tengan una resolución cuadrada. Consulta la sección de Recomendaciones de Imágenes para obtener más detalles.\n\n- Ajusta el tamaño del modelo de clasificación. Un modelo más grande puede ofrecer mayor precisión, pero también requiere más recursos computacionales.\n\n- Agrega detalles relevantes sobre el autor, la razón detrás del nombre del modelo o cualquier información relacionada con los datos de entrenamiento.\n\n- Carga las imágenes que se utilizarán para entrenar el modelo. Es importante que todas las imágenes tengan las mismas dimensiones (de lo contrario, se reescalarán automáticamente). Las imágenes deben estar en formato PNG o JPG. Además, se recortarán para equilibrar la cantidad de imágenes positivas y negativas. Consulta la sección de Recomendaciones de Imágenes.");
    }                                                           

    private void Boton_recomendacion_imagenesMouseClicked(java.awt.event.MouseEvent evt) {                                                          
        Informacion.setText("Aquí están las recomendaciones para las imágenes utilizadas en el entrenamiento y uso de los modelos:\n\n- Las imágenes deben parecer ruido, como si fueran histopatologías o muestras de tejidos. Busca áreas específicas afectadas que no tengan muchas variantes, especialmente dentro de la misma parte del cuerpo. Por ejemplo, en el caso del modelo de cáncer de mama, las imágenes son de mamas de miles de pacientes, pero todas de la misma zona.\n\n- Se recomienda que las imágenes tengan una resolución cuadrada. Esto significa que el ancho y el alto deben ser iguales. Si no cumplen con esta recomendación, se reescalarán automáticamente a la resolución específica guardada para ese modelo al usarlo para la detección. Si estás creando un modelo, también se reescalarán al múltiplo de 8 más cercano.\n\n- Si las imágenes son radiografías (como mamografías), es importante tener muchas \nimágenes. Esto permite que el modelo funcione como un MOE, donde crea zonas para \ndecir “sí” o “no”, independientemente de las variaciones en la imagen. Por ejemplo, si \nutilizas miles de mamografías de diferentes tamaños de senos, el modelo creará “mini \nmodelos” especializados para cada tamaño de seno.\n\n- Las imágenes deben estar en formato JPG y PNG. Otros formatos no serán tomados en cuenta."); 
    }  

    private void Boton_aceleracion_gpuMouseClicked(java.awt.event.MouseEvent evt) {    
        Informacion.setText("El aceleramiento por hardware, es usar la GPU para acelerar los procesos de entrenamiento de los modelos de inteligencia artificial. Si este recurso no se permite entrenar los modelos, si tienes problemas para activar el aceleramiento por hardware(GPU) sigue las siguientes instrucciones:\n\nPara tarjeta NVIDIA:\n\n- Descarga e instala los controladores específicos para tu GPU NVIDIA.\n- Descarga la versión compatible con tu GPU del CUDA Toolkit.\n- Verifica la instalación escribiendo en la consola: nvcc --version.\n- Ejecuta el siguiente comando en la consola: pip install tensorflow-gpu.\n\nPara tarjetas AMD\n\n- Descargar e instalar los controladres especificos de su GPU\n- Instalar ROCm(Radeon Open Compute)\n- Verificar la instalacion de ROCm escribiendo en la consola \"rocm-smi\"\n- Ejecutar el comando en la consola \"pip install tensorflow-rocm\"");                                               
    }                                                  

                                                        
    // Declaracion de variables                     
    private javax.swing.JPanel Boton_aceleracion_gpu;
    private javax.swing.JPanel Boton_funcionamiento;
    private javax.swing.JPanel Boton_informacion_crear_modelo;
    private javax.swing.JPanel Boton_informacion_detectar;
    private javax.swing.JPanel Boton_recomendacion_imagenes;
    private javax.swing.JLabel Boton_salir;
    private javax.swing.JPanel Fondo;
    private javax.swing.JTextArea Informacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // Final de declaracion de variables               
}
