/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberos_grupo_87.Vista;

/**
 *
 * @author psg_7
 */
public class nuevoCuartel extends javax.swing.JInternalFrame {

    /**
     * Creates new form nuevoCuartel
     */
    public nuevoCuartel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLnuevoCuartel = new javax.swing.JLabel();
        jLMotivo = new javax.swing.JLabel();
        jTFMotivoCreacion = new javax.swing.JTextField();
        jLnombreCuartel = new javax.swing.JLabel();
        jTFnombreNuevoCuartel = new javax.swing.JTextField();
        jLcodigoCuartel = new javax.swing.JLabel();
        JTFCodCuartel = new javax.swing.JTextField();
        jLDireccion = new javax.swing.JLabel();
        jTFDireccion = new javax.swing.JTextField();
        jLCoordX = new javax.swing.JLabel();
        jTFCoordX = new javax.swing.JTextField();
        jLCoordY = new javax.swing.JLabel();
        jTFCoordY = new javax.swing.JTextField();
        jLTel = new javax.swing.JLabel();
        jTFTel = new javax.swing.JTextField();
        jLCorreo = new javax.swing.JLabel();
        jTFCorreo = new javax.swing.JTextField();
        jBCrearNuevoCuartel = new javax.swing.JButton();

        jLnuevoCuartel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLnuevoCuartel.setText("NUEVO CUARTEL");

        jLMotivo.setText("Motivo de la creación del Nuevo Cuartel:");

        jTFMotivoCreacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMotivoCreacionActionPerformed(evt);
            }
        });

        jLnombreCuartel.setText("Nombre del nuevo Cuartel:");

        jLcodigoCuartel.setText("Código Cuartel:");

        jLDireccion.setText("Dirección:");

        jLCoordX.setText("Coordenadas X:");

        jLCoordY.setText("Coordenadas Y:");

        jLTel.setText("Teléfono:");

        jLCorreo.setText("Correo:");

        jBCrearNuevoCuartel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBCrearNuevoCuartel.setText("Crear Nuevo Cuartel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLTel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFTel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLCorreo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFCorreo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLCoordX, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFCoordX, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLCoordY)
                                .addGap(27, 27, 27)
                                .addComponent(jTFCoordY, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLcodigoCuartel)
                                .addGap(34, 34, 34)
                                .addComponent(JTFCodCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLDireccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLMotivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFMotivoCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLnombreCuartel)
                                .addGap(53, 53, 53)
                                .addComponent(jTFnombreNuevoCuartel))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jBCrearNuevoCuartel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLnuevoCuartel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLnuevoCuartel)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnombreCuartel)
                    .addComponent(jTFnombreNuevoCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcodigoCuartel)
                    .addComponent(JTFCodCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDireccion)
                    .addComponent(jTFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCoordX)
                    .addComponent(jTFCoordX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCoordY)
                    .addComponent(jTFCoordY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTel)
                    .addComponent(jTFTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCorreo)
                    .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLMotivo)
                    .addComponent(jTFMotivoCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jBCrearNuevoCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFMotivoCreacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMotivoCreacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFMotivoCreacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTFCodCuartel;
    private javax.swing.JButton jBCrearNuevoCuartel;
    private javax.swing.JLabel jLCoordX;
    private javax.swing.JLabel jLCoordY;
    private javax.swing.JLabel jLCorreo;
    private javax.swing.JLabel jLDireccion;
    private javax.swing.JLabel jLMotivo;
    private javax.swing.JLabel jLTel;
    private javax.swing.JLabel jLcodigoCuartel;
    private javax.swing.JLabel jLnombreCuartel;
    private javax.swing.JLabel jLnuevoCuartel;
    private javax.swing.JTextField jTFCoordX;
    private javax.swing.JTextField jTFCoordY;
    private javax.swing.JTextField jTFCorreo;
    private javax.swing.JTextField jTFDireccion;
    private javax.swing.JTextField jTFMotivoCreacion;
    private javax.swing.JTextField jTFTel;
    private javax.swing.JTextField jTFnombreNuevoCuartel;
    // End of variables declaration//GEN-END:variables
}
