/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberos_grupo_87.Vista;

import bomberos_grupo_87.AccesoADatos.BrigadaData;
import bomberos_grupo_87.AccesoADatos.CuartelData;
import bomberos_grupo_87.Entidades.Bombero;
import bomberos_grupo_87.Entidades.Brigada;
import bomberos_grupo_87.Entidades.Cuartel;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gabriel925
 */
public class ConsultaBombero extends javax.swing.JInternalFrame {

    private DefaultComboBoxModel m = new DefaultComboBoxModel();

    private DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int fila, int columna) {
            return false;
        }

    };

    /**
     * Creates new form ConsultaBombero
     */
    public ConsultaBombero() {
        initComponents();
        armarCabecera();
        comboCuartel();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/03CascoTitanNeo.jpg"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtBombero = new javax.swing.JTable();
        jcbCuartel = new javax.swing.JComboBox<>();
        jcbBrigada = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CONSULTA DE BOMBERO");

        jtBombero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtBombero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtBombero);

        jcbCuartel.setBackground(new java.awt.Color(153, 153, 153));
        jcbCuartel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbCuartelItemStateChanged(evt);
            }
        });
        jcbCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCuartelActionPerformed(evt);
            }
        });

        jcbBrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbBrigadaActionPerformed(evt);
            }
        });

        jLabel2.setText("CUARTEL :");

        jLabel3.setText("BRIGADA :");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcbCuartel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcbBrigada, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(214, 214, 214))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCuartelActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jcbCuartelActionPerformed

    private void jcbCuartelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbCuartelItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            try {
                comboBrigada();
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,""+ ex.getMessage());
            }
        }
    }//GEN-LAST:event_jcbCuartelItemStateChanged

    private void jcbBrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbBrigadaActionPerformed
        // TODO add your handling code here:
        try{
            cargarTabla();
        }catch (Exception e){
            
        }
        
    }//GEN-LAST:event_jcbBrigadaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Brigada> jcbBrigada;
    private javax.swing.JComboBox<Cuartel> jcbCuartel;
    private javax.swing.JTable jtBombero;
    // End of variables declaration//GEN-END:variables
private void armarCabecera() {
        modelo.addColumn("DNI");
        modelo.addColumn("NOMBRE Y APELLIDO");
        modelo.addColumn("GRUPO SANGUINEO");
        modelo.addColumn("CELULAR");
        jtBombero.setModel(modelo);
    }

    public void borrarFilas() {
        int x = jtBombero.getRowCount() - 1;

        for (int i = x; i >= 0; i--) {
            modelo.removeRow(i);
        }

    }

    private void cargarTabla() {
        borrarFilas();
        BrigadaData bd = new BrigadaData();
        Brigada b = (Brigada) jcbBrigada.getSelectedItem();
        for (Bombero bombero : bd.listarBomberosPorBrigada(b.getCodBrigada())) {
            modelo.addRow(new Object[]{bombero.getDni(), bombero.getNombre_ape(), bombero.getGrupo_sang(), bombero.getCelular()});
        }
    }

    private void comboCuartel() {
        CuartelData cd = new CuartelData();
        for (Cuartel cuartel : cd.listaDeCuarteles()) {
            jcbCuartel.addItem(cuartel);
        }

    }

    private void comboBrigada() {
        jcbBrigada.removeAllItems();
        CuartelData cd = new CuartelData();
        Cuartel c = (Cuartel) jcbCuartel.getSelectedItem();
        for (Brigada brigada : cd.listarBrigadasDelCuartel(c.getCodCuartel())) {
            jcbBrigada.addItem(brigada);
        }

    }

}
