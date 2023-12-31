/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberos_grupo_87.Vista;

import bomberos_grupo_87.AccesoADatos.CuartelData;
import bomberos_grupo_87.Entidades.Cuartel;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import java.awt.Color;

/**
 *
 * @author psg_7
 */
public class nuevoCuartel extends javax.swing.JInternalFrame {
    CuartelData CD = new CuartelData();
    /**
     * Creates new form nuevoCuartel
     */
    public nuevoCuartel() {
        initComponents();
        evitarPegar(JTFCodCuartel);
        evitarPegar(jTFnombreNuevoCuartel);
        evitarPegar(jTFDireccion);
        evitarPegar(jTFTel);
        evitarPegar(jTFCoordX);
        evitarPegar(jTFCoordY);
        evitarPegar(jTFCorreo);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/cuartel.jpg"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
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
        jTFCorreo = new javax.swing.JTextField();
        jTFTel = new javax.swing.JTextField();
        jLTel = new javax.swing.JLabel();
        jLestado = new javax.swing.JLabel();
        jTFCoordY = new javax.swing.JTextField();
        jLCorreo = new javax.swing.JLabel();
        jCheckBoxEstado = new javax.swing.JCheckBox();
        jbSalir = new javax.swing.JButton();
        jbNuevoCuartel = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLnuevoCuartel.setBackground(new java.awt.Color(255, 255, 0));
        jLnuevoCuartel.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 20)); // NOI18N
        jLnuevoCuartel.setForeground(new java.awt.Color(255, 0, 0));
        jLnuevoCuartel.setText("NUEVO CUARTEL");
        jLnuevoCuartel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLnuevoCuartel.setOpaque(true);

        jLnombreCuartel.setBackground(new java.awt.Color(255, 255, 0));
        jLnombreCuartel.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jLnombreCuartel.setForeground(new java.awt.Color(255, 0, 0));
        jLnombreCuartel.setText("Nombre del nuevo Cuartel:");
        jLnombreCuartel.setOpaque(true);

        jTFnombreNuevoCuartel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFnombreNuevoCuartelKeyTyped(evt);
            }
        });

        jLcodigoCuartel.setBackground(new java.awt.Color(255, 255, 0));
        jLcodigoCuartel.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jLcodigoCuartel.setForeground(new java.awt.Color(255, 0, 0));
        jLcodigoCuartel.setText("Código Cuartel:");
        jLcodigoCuartel.setOpaque(true);

        JTFCodCuartel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFCodCuartelKeyTyped(evt);
            }
        });

        jLDireccion.setBackground(new java.awt.Color(255, 255, 0));
        jLDireccion.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jLDireccion.setForeground(new java.awt.Color(255, 0, 0));
        jLDireccion.setText("Dirección:");
        jLDireccion.setOpaque(true);

        jLCoordX.setBackground(new java.awt.Color(255, 255, 0));
        jLCoordX.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jLCoordX.setForeground(new java.awt.Color(255, 0, 0));
        jLCoordX.setText("Coordenadas X:");
        jLCoordX.setOpaque(true);

        jTFCoordX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCoordXActionPerformed(evt);
            }
        });
        jTFCoordX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCoordXKeyTyped(evt);
            }
        });

        jLCoordY.setBackground(new java.awt.Color(255, 255, 0));
        jLCoordY.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jLCoordY.setForeground(new java.awt.Color(255, 0, 0));
        jLCoordY.setText("Coordenadas Y:");
        jLCoordY.setOpaque(true);

        jTFCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCorreoKeyTyped(evt);
            }
        });

        jTFTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFTelKeyTyped(evt);
            }
        });

        jLTel.setBackground(new java.awt.Color(255, 255, 0));
        jLTel.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jLTel.setForeground(new java.awt.Color(255, 0, 0));
        jLTel.setText("Teléfono:");
        jLTel.setOpaque(true);

        jLestado.setBackground(new java.awt.Color(255, 255, 0));
        jLestado.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jLestado.setForeground(new java.awt.Color(255, 0, 0));
        jLestado.setText("Estado:");
        jLestado.setOpaque(true);

        jTFCoordY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCoordYKeyTyped(evt);
            }
        });

        jLCorreo.setBackground(new java.awt.Color(255, 255, 0));
        jLCorreo.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jLCorreo.setForeground(new java.awt.Color(255, 0, 0));
        jLCorreo.setText("Correo:");
        jLCorreo.setOpaque(true);

        jCheckBoxEstado.setBackground(new java.awt.Color(255, 255, 0));
        jCheckBoxEstado.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jCheckBoxEstado.setForeground(new java.awt.Color(255, 0, 0));
        jCheckBoxEstado.setText("  Activo");

        jbSalir.setBackground(new java.awt.Color(255, 255, 255));
        jbSalir.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 16)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 0, 0));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbNuevoCuartel.setBackground(new java.awt.Color(255, 255, 255));
        jbNuevoCuartel.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 16)); // NOI18N
        jbNuevoCuartel.setForeground(new java.awt.Color(255, 0, 0));
        jbNuevoCuartel.setText("Crear Nuevo Cuartel");
        jbNuevoCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoCuartelActionPerformed(evt);
            }
        });

        jbBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscar.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 16)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(255, 0, 0));
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbModificar.setBackground(new java.awt.Color(255, 255, 255));
        jbModificar.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 16)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(255, 0, 0));
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLnuevoCuartel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLnombreCuartel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTFnombreNuevoCuartel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLcodigoCuartel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(JTFCodCuartel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLDireccion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTFDireccion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLCoordX, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTFCoordX, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLCoordY, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTFCorreo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTFTel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLTel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLestado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTFCoordY, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLCorreo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCheckBoxEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbNuevoCuartel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbModificar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLDireccion)
                        .addGap(33, 33, 33)
                        .addComponent(jTFDireccion))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLcodigoCuartel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JTFCodCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLCoordX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(7, 7, 7)
                                .addComponent(jTFCoordX, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLestado)
                                        .addGap(31, 31, 31)
                                        .addComponent(jCheckBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jbNuevoCuartel))
                                .addGap(53, 53, 53)
                                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLCoordY)
                                .addGap(30, 30, 30)
                                .addComponent(jTFCoordY, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLTel)
                        .addGap(32, 32, 32)
                        .addComponent(jTFTel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLCorreo)
                        .addGap(18, 18, 18)
                        .addComponent(jTFCorreo))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLnombreCuartel)
                        .addGap(23, 23, 23)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLnuevoCuartel)
                            .addComponent(jTFnombreNuevoCuartel))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLnuevoCuartel)
                .addGap(21, 21, 21)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcodigoCuartel)
                    .addComponent(JTFCodCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnombreCuartel)
                    .addComponent(jTFnombreNuevoCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDireccion)
                    .addComponent(jTFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCoordX, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCoordY)
                    .addComponent(jTFCoordX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCoordY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCorreo)
                    .addComponent(jLTel)
                    .addComponent(jTFTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxEstado)
                    .addComponent(jLestado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNuevoCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFCoordXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCoordXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCoordXActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:        
        if(JTFCodCuartel.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Por favor ingrese un Código válido");
        }else{
        int codCuartel = Integer.valueOf(JTFCodCuartel.getText());
        try{
            
      
        Cuartel cuartel = CD.buscarCuartel(codCuartel);
        if (cuartel == null){
            borrarCampos();            
            JOptionPane.showMessageDialog(this, "No se encontro el cuartel");
            
        } else {
            jTFnombreNuevoCuartel.setText(cuartel.getNombre_cuartel());
            jTFDireccion.setText(cuartel.getDireccion());
            jTFCoordX.setText(cuartel.getCoord_X()+"");
            jTFCoordY.setText(cuartel.getCoord_Y()+"");
            jTFTel.setText(cuartel.getTelefono());
            jTFCorreo.setText(cuartel.getCorreo());
            jCheckBoxEstado.setSelected(cuartel.isEstado());
            
        }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "No se encontro el cuartel");
        }
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:
        if(JTFCodCuartel.getText().isEmpty() || jTFnombreNuevoCuartel.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "NO debe dejar CAMPOS VACIOS.");
        }else{
        int codCuartel = Integer.valueOf(JTFCodCuartel.getText());
        Cuartel cuartel = CD.buscarCuartel(codCuartel);
        cuartel.setNombre_cuartel(jTFnombreNuevoCuartel.getText());
        cuartel.setDireccion(jTFDireccion.getText());
        cuartel.setCoord_X((Integer.valueOf(jTFCoordX.getText())));
        cuartel.setCoord_Y((Integer.valueOf(jTFCoordY.getText())));
        cuartel.setTelefono(jTFTel.getText());
        cuartel.setCorreo(jTFCorreo.getText());
        cuartel.setEstado((jCheckBoxEstado.isSelected()));
        
       
        CuartelData cuartlData = new CuartelData();
        cuartlData.modificarCuartel(cuartel);
        limpiarCampos();
        
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbNuevoCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoCuartelActionPerformed
        // TODO add your handling code here:
        try{
            if(jTFnombreNuevoCuartel.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Ingrese un Nombre para el Nuevo Cuartel");
            }else if(jTFDireccion.getText().isEmpty() || jTFTel.getText().isEmpty()||jTFCorreo.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Todos los Campos deben estar Completos");
            }else if (jCheckBoxEstado.isSelected() == false){
                JOptionPane.showMessageDialog(null, "El Cuartel debe estar Activo");
            }else{
        String nombre_cuartel = jTFnombreNuevoCuartel.getText();
        String direccion = jTFDireccion.getText();
        int coord_x = Integer.parseInt(jTFCoordX.getText());
        int coord_y = Integer.parseInt(jTFCoordY.getText());
        String telefono = jTFTel.getText();
        String correo = jTFCorreo.getText();
        boolean estado = jCheckBoxEstado.isSelected();
        
        Cuartel cuart = new Cuartel (nombre_cuartel, direccion, coord_x, coord_y, telefono, correo, estado);
        CuartelData cuartData = new CuartelData();
        cuartData.crearCuartel(cuart);
        limpiarCampos();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "ERROR. Verifique que los datos sean correctos"
                    + " en TODOS los campos.");
       
        limpiarCampos();
        }
      
    }//GEN-LAST:event_jbNuevoCuartelActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void JTFCodCuartelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFCodCuartelKeyTyped
        // TODO add your handling code here:
         int key = evt.getKeyChar();
        boolean num = key >= 48 && key <= 58;

        if (!num) {
            evt.consume();
        }
    }//GEN-LAST:event_JTFCodCuartelKeyTyped

    private void jTFnombreNuevoCuartelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFnombreNuevoCuartelKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean min = key >= 65 && key <= 90;
        boolean mayu = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(min || mayu || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFnombreNuevoCuartelKeyTyped

    private void jTFCoordXKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCoordXKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <= 58;
        boolean menos = key == 45;
        if (!(num || menos)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFCoordXKeyTyped

    private void jTFCoordYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCoordYKeyTyped
        // TODO add your handling code here:
        
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <= 58;
        boolean menos = key == 45;
        if (!(num || menos)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFCoordYKeyTyped

    private void jTFTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFTelKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <= 58;

        if (!num) {
            evt.consume();
        }
        
    }//GEN-LAST:event_jTFTelKeyTyped

    private void jTFCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCorreoKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean min = key >= 65 && key <= 90;
        boolean mayu = key >= 97 && key <= 122;
        boolean num = key >= 48 && key <= 58;
        boolean arr = key == 64;
        boolean punt = key == 46;
        if (!(min || mayu || num|| arr || punt)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTFCorreoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTFCodCuartel;
    private javax.swing.JCheckBox jCheckBoxEstado;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLCoordX;
    private javax.swing.JLabel jLCoordY;
    private javax.swing.JLabel jLCorreo;
    private javax.swing.JLabel jLDireccion;
    private javax.swing.JLabel jLTel;
    private javax.swing.JLabel jLcodigoCuartel;
    private javax.swing.JLabel jLestado;
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
        jCheckBoxEstado.setSelected(false);

        
    }

    private static class CtelData {

        public CtelData() {
        }
    }
    
    public void borrarCampos() {
        jTFnombreNuevoCuartel.setText("");
        JTFCodCuartel.setText("");
        jTFDireccion.setText("");
        jTFCoordX.setText("");
        jTFCoordY.setText("");
        jTFTel.setText("");
        jTFCorreo.setText("");
        jCheckBoxEstado.setSelected(false);

    }
    private void evitarPegar(JTextField campo) {
        InputMap map2 = campo.getInputMap(JTextField.WHEN_FOCUSED);
        map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
    }
}
    
