/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberos_grupo_87.Vista;

import bomberos_grupo_87.AccesoADatos.BrigadaData;
import bomberos_grupo_87.AccesoADatos.CuartelData;
import bomberos_grupo_87.Entidades.Brigada;
import bomberos_grupo_87.Entidades.Cuartel;
import bomberos_grupo_87.Entidades.Especialidad;
import javax.swing.JOptionPane;

/**
 *
 * @author LEANS
 */
public class nuevaBrigada extends javax.swing.JInternalFrame {
    CuartelData CD = new CuartelData();
    BrigadaData BrigData = new BrigadaData();

    /**
     * Creates new form nuevaBrigada
     */
    public nuevaBrigada() {
        initComponents();
        iniciarComboCuartel();
        iniciarComboEsp();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TextCodigo = new javax.swing.JTextField();
        TextNombre = new javax.swing.JTextField();
        ButtonBuscar = new javax.swing.JButton();
        ButtonModifi = new javax.swing.JButton();
        ButtonSalir = new javax.swing.JButton();
        ButtonNuevo = new javax.swing.JButton();
        ComboEsp = new javax.swing.JComboBox<>();
        ComboCuartel = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(550, 450));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText(" NUEVA BRIGADA ");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText(" Codigo Brigada: ");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText(" Nombre de Brigada: ");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText(" Especialidad: ");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText(" Cuartel: ");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.setOpaque(true);

        TextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNombreActionPerformed(evt);
            }
        });

        ButtonBuscar.setText("BUSCAR");
        ButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarActionPerformed(evt);
            }
        });

        ButtonModifi.setText("MODIFICAR");
        ButtonModifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonModifiActionPerformed(evt);
            }
        });

        ButtonSalir.setText("SALIR");
        ButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalirActionPerformed(evt);
            }
        });

        ButtonNuevo.setText("NUEVO");
        ButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNuevoActionPerformed(evt);
            }
        });

        ComboEsp.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        ComboCuartel.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(ButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonModifi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ComboEsp, javax.swing.GroupLayout.Alignment.LEADING, 0, 210, Short.MAX_VALUE)
                        .addComponent(ComboCuartel, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ComboEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonNuevo)
                    .addComponent(ButtonModifi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonSalir))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNombreActionPerformed

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed
        // TODO add your handling code here:
        
        int codB = Integer.valueOf(TextCodigo.getText());
        Brigada brig = BrigData.buscarBrigada(codB);
        if(brig==null){
            borrarCampos();
        }else{
            TextNombre.setText(brig.getNombre_br());
            ComboEsp.setSelectedItem(brig.getEspecialidad());
            Cuartel cuar = brig.getCuartel();
            //JOptionPane.showMessageDialog(null, cuar.getNombre_cuartel());
            ComboCuartel.setSelectedItem(cuar.getNombre_cuartel());
            
        }
    }//GEN-LAST:event_ButtonBuscarActionPerformed

    private void ButtonModifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonModifiActionPerformed
        // TODO add your handling code here:
        int codB = Integer.valueOf(TextCodigo.getText());
        Brigada brig = BrigData.buscarBrigada(codB);
        brig.setNombre_br(TextNombre.getText());
        brig.setEspecialidad((Especialidad)ComboEsp.getSelectedItem());
        String nameCuar =(String) ComboCuartel.getSelectedItem().toString();
        Cuartel cuar= new Cuartel();
        for (Cuartel cuartele : CD.listaDeCuarteles()) {
            if(nameCuar.equals(cuartele.getNombre_cuartel())){
                cuar=cuartele;
            }
        }        
        brig.setCuartel(cuar);
        BrigData.modificarBrigada(brig);
        borrarCampos();
            
    }//GEN-LAST:event_ButtonModifiActionPerformed

    private void ButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNuevoActionPerformed
        // TODO add your handling code here:
        Brigada brig = new Brigada();
        String nombreBrig=TextNombre.getText();
        Especialidad esp =(Especialidad) ComboEsp.getSelectedItem();
        String nameCuar =(String) ComboCuartel.getSelectedItem().toString();
        Cuartel cuar= new Cuartel();
        for (Cuartel cuartele : CD.listaDeCuarteles()) {
            if(nameCuar.equals(cuartele.getNombre_cuartel())){
                cuar=cuartele;
            }
        }        
        brig.setCuartel(cuar);
        brig.setNombre_br(nombreBrig);
        brig.setEspecialidad(esp);
        brig.setEstado(true);
        brig.setLibre(true);
        try{
            BrigData.crearBrigada(brig);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Porfavor seleccione un Cuartel Existente.");
        }
        
        borrarCampos();
        
    }//GEN-LAST:event_ButtonNuevoActionPerformed

    private void ButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_ButtonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JButton ButtonModifi;
    private javax.swing.JButton ButtonNuevo;
    private javax.swing.JButton ButtonSalir;
    private javax.swing.JComboBox<String> ComboCuartel;
    private javax.swing.JComboBox<Especialidad> ComboEsp;
    private javax.swing.JTextField TextCodigo;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    public void iniciarComboEsp(){
        ComboEsp.addItem(Especialidad.OperativoPrevencion);
        ComboEsp.addItem(Especialidad.Incendios);
        ComboEsp.addItem(Especialidad.RescateAccTrafico);
        ComboEsp.addItem(Especialidad.RescateMontaña);
        ComboEsp.addItem(Especialidad.SalvamentoDerrumbe);
        ComboEsp.addItem(Especialidad.SocorrerInundaciones);
    }
    
    public void iniciarComboCuartel(){
        for (Cuartel cuart : CD.listaDeCuarteles()) {
            ComboCuartel.addItem(cuart.getNombre_cuartel());
        }
    }
    
    public void borrarCampos(){
        TextCodigo.setText("");
        TextNombre.setText("");
        
    }

}