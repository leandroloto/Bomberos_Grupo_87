/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberos_grupo_87.Vista;

import bomberos_grupo_87.AccesoADatos.CuartelData;
import bomberos_grupo_87.Entidades.Cuartel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

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
        jbNuevoCuartel = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jLnuevoCuartel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLnuevoCuartel.setText("NUEVO CUARTEL");

        jLnombreCuartel.setText("Nombre del nuevo Cuartel:");

        jLcodigoCuartel.setText("Código Cuartel:");

        jLDireccion.setText("Dirección:");

        jLCoordX.setText("Coordenadas X:");

        jTFCoordX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCoordXActionPerformed(evt);
            }
        });

        jLCoordY.setText("Coordenadas Y:");

        jLTel.setText("Teléfono:");

        jLCorreo.setText("Correo:");

        jbNuevoCuartel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbNuevoCuartel.setText("Crear Nuevo Cuartel");
        jbNuevoCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoCuartelActionPerformed(evt);
            }
        });

        jbBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLDireccion)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLnombreCuartel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLnuevoCuartel)
                            .addComponent(jTFnombreNuevoCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLcodigoCuartel)
                        .addGap(34, 34, 34)
                        .addComponent(JTFCodCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLTel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFTel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCoordX, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFCoordX, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLCoordY)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFCoordY, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jbNuevoCuartel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
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
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                    .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCorreo)
                    .addComponent(jTFTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTel))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevoCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFCoordXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCoordXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCoordXActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:        
        try{
        CuartelData cuartData = new CuartelData();
        Cuartel nuevo = cuartData.buscarCuartel(Integer.parseInt(JTFCodCuartel.getText()));

        jTFnombreNuevoCuartel.setText(nuevo.getNombre_cuartel());
        jTFDireccion.setText(nuevo.getDireccion());
        //jTFCoordX.
        //Coord_X(rs.getInt("coord_X"));
        //jTFCoordY.setCoord_Y(rs.getInt("coord_Y"));
        jTFTel.setText(nuevo.getTelefono());
        jTFCorreo.setText(nuevo.getCorreo());
            }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "ERROR por favor reintente poniendo la INFORMACIón correcta");
            limpiarCampos();
        }
 
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbNuevoCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoCuartelActionPerformed
        // TODO add your handling code here:
         try{
        String nombre_cuartel = jTFnombreNuevoCuartel.getText();
        int codCuartel = Integer.parseInt(JTFCodCuartel.getText());
        String direccion = jTFDireccion.getText();
        int coord_x = Integer.parseInt(jTFCoordX.getText());
        int coord_y = Integer.parseInt(jTFCoordY.getText());
        String telefono = jTFTel.getText();
        String correo = jTFCorreo.getText();
        if(nombre_cuartel.isEmpty()){
                JOptionPane.showMessageDialog(null, "Por favor ingrese un NOMBRE DE CUARTEL");
       /* }else{
            if (codCuartel.isEmpty()){
                JOptionPane.showMessageDialog(null, "Por favor ingrese un CÓDIGO DE CUARTEL");
            }*
                    
                    */
            
            Cuartel cuart = new Cuartel (nombre_cuartel, codCuartel, direccion, coord_x, coord_y, telefono, correo);
            CuartelData cuartData = new CuartelData();
            cuartData.crearCuartel(cuart);
            
        }
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "ERROR. Ingrese los datos correctos en TODOS los campos.");
        }
        
        limpiarCampos();
        //JOptionPane.showMessageDialog(null, "Se registro un nuevo Cuartel: "+nombre_cuartel+" "+coord_x+" "+coord_y+" "+telefono+" "+correo+");
                                                 

    }//GEN-LAST:event_jbNuevoCuartelActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTFCodCuartel;
    private javax.swing.JLabel jLCoordX;
    private javax.swing.JLabel jLCoordY;
    private javax.swing.JLabel jLCorreo;
    private javax.swing.JLabel jLDireccion;
    private javax.swing.JLabel jLTel;
    private javax.swing.JLabel jLcodigoCuartel;
    private javax.swing.JLabel jLnombreCuartel;
    private javax.swing.JLabel jLnuevoCuartel;
    private javax.swing.JTextField jTFCoordX;
    private javax.swing.JTextField jTFCoordY;
    private javax.swing.JTextField jTFCorreo;
    private javax.swing.JTextField jTFDireccion;
    private javax.swing.JTextField jTFTel;
    private javax.swing.JTextField jTFnombreNuevoCuartel;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevoCuartel;
    private javax.swing.JButton jbSalir;
    // End of variables declaration//GEN-END:variables
private void limpiarCampos() {
        jTFnombreNuevoCuartel.setText("");
        JTFCodCuartel.setText("");
        jTFDireccion.setText("");
        jTFCoordX.setText("");
        jTFCoordY.setText("");
        jTFTel.setText("");
        jTFCorreo.setText("");
        
    }
}
