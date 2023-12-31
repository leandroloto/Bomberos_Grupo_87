/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberos_grupo_87.Vista;

import bomberos_grupo_87.AccesoADatos.BrigadaData;
import bomberos_grupo_87.AccesoADatos.CuartelData;
import bomberos_grupo_87.AccesoADatos.SiniestroData;
import bomberos_grupo_87.Entidades.Brigada;
import bomberos_grupo_87.Entidades.Cuartel;
import bomberos_grupo_87.Entidades.Siniestro;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Discar
 */
public class gestionSiniestro extends javax.swing.JInternalFrame {

    private SiniestroData SD = new SiniestroData();
    private CuartelData CD = new CuartelData();
    private BrigadaData BD = new BrigadaData();
    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    /**
     * Creates new form gestionSiniestro
     */
    public gestionSiniestro() {
        initComponents();
        iniciarTabla();
        cargarTabla();
        evitarPegar(TextPuntaje);
        TextDesc.disable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/bomb.jpg"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        ButtonAsignar = new javax.swing.JButton();
        ButtonFinalizar = new javax.swing.JButton();
        ButtonSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableSiniestros = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        FechaFin = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        TextPuntaje = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LabelCuartel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LabelDist = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LabelBrig = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextDesc = new javax.swing.JTextArea();

        jDesktopPane1.setBackground(new java.awt.Color(153, 153, 255));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(820, 352));

        ButtonAsignar.setText("ASIGNAR BRIGADA");
        ButtonAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAsignarActionPerformed(evt);
            }
        });

        ButtonFinalizar.setText("FINALIZAR");
        ButtonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFinalizarActionPerformed(evt);
            }
        });

        ButtonSalir.setText("SALIR");
        ButtonSalir.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ButtonSalirAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        ButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalirActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DATOS PARA FINALIZAR SINIESTRO:");
        jLabel2.setOpaque(true);

        TableSiniestros.setModel(new javax.swing.table.DefaultTableModel(
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
        TableSiniestros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TableSiniestros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableSiniestrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableSiniestros);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SINIESTROS ACTIVOS PENDIENTES");
        jLabel4.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTION DE SINIESTROS");
        jLabel1.setOpaque(true);

        FechaFin.setDateFormatString("dd-MMM-yyyy HH:mm:ss");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PUNTAJE DE EXITO: ");
        jLabel3.setOpaque(true);

        TextPuntaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextPuntajeKeyTyped(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 153, 0));
        jLabel5.setFont(new java.awt.Font("Malgun Gothic Semilight", 2, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("*Se asigna automaticamente la brigada especializada mas cercana*");
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CUARTEL CERCANO: ");
        jLabel6.setOpaque(true);

        LabelCuartel.setBackground(new java.awt.Color(0, 0, 0));
        LabelCuartel.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 11)); // NOI18N
        LabelCuartel.setForeground(new java.awt.Color(255, 153, 51));
        LabelCuartel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelCuartel.setText("CUARTEL.");
        LabelCuartel.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DISTANCIA: ");
        jLabel7.setOpaque(true);

        LabelDist.setBackground(new java.awt.Color(0, 0, 0));
        LabelDist.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 11)); // NOI18N
        LabelDist.setForeground(new java.awt.Color(255, 153, 51));
        LabelDist.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelDist.setText("0");
        LabelDist.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("BRIGADA: ");
        jLabel9.setOpaque(true);

        LabelBrig.setBackground(new java.awt.Color(0, 0, 0));
        LabelBrig.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 11)); // NOI18N
        LabelBrig.setForeground(new java.awt.Color(255, 153, 51));
        LabelBrig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelBrig.setText("BRIGADA.");
        LabelBrig.setOpaque(true);

        TextDesc.setColumns(20);
        TextDesc.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        TextDesc.setRows(5);
        TextDesc.setText("Descripcion del Siniestro seleccionado!");
        jScrollPane2.setViewportView(TextDesc);

        jDesktopPane1.setLayer(ButtonAsignar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ButtonFinalizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ButtonSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(FechaFin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(TextPuntaje, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(LabelCuartel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(LabelDist, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(LabelBrig, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(ButtonFinalizar))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TextPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                    .addComponent(FechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(LabelDist, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(LabelCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LabelBrig, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(ButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(45, 45, 45)
                        .addComponent(ButtonFinalizar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(LabelCuartel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(LabelDist))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(LabelBrig))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(13, 13, 13)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonAsignar)
                            .addComponent(ButtonSalir))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSalirAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ButtonSalirAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSalirAncestorAdded

    private void ButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_ButtonSalirActionPerformed

    private void ButtonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFinalizarActionPerformed
        // TODO add your handling code here:
        int filas = TableSiniestros.getSelectedRow();
        Siniestro sini = new Siniestro();
        try {
            if (filas != -1) {
                int codBrig = (Integer) TableSiniestros.getValueAt(filas, 0);
                sini = SD.buscarSiniestro(codBrig);

                //boolean uno = sini.getFecha_siniestro().isBefore(sini.getFecha_resol());
                if (sini.isEnCurso() == true) {
                    if (FechaFin.getCalendar() != null) {
                        LocalDate fyh = (FechaFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                        int hh = FechaFin.getJCalendar().getDate().getHours();
                        int mm = FechaFin.getJCalendar().getDate().getMinutes();
                        int ss = FechaFin.getJCalendar().getDate().getSeconds();
                        LocalDateTime fechasini = LocalDateTime.of(fyh.getYear(), fyh.getMonth().getValue(), fyh.getDayOfMonth(), hh, mm, ss);

                        if (sini.getFecha_siniestro().isBefore(fechasini) == true) {

                            int punt = Integer.valueOf(TextPuntaje.getText());
                            if (punt <= 10 && punt >= 0) {
                                sini.setFecha_resol(fechasini);
                                sini.setPuntuacion(punt);
                                sini.setEnCurso(false);
                                sini.setEstado(false);
                                sini.getBrigada().setLibre(true);
                                SD.modificarSiniestro(sini);
                                Brigada brig = sini.getBrigada();
                                BD.modificarBrigada(brig);
                                JOptionPane.showMessageDialog(null, "Se finalizo el siniestro con EXITO!");
                                borrarTabla();
                                cargarTabla();
                                borrarCampos();

                            } else {
                                JOptionPane.showMessageDialog(null, "Usted debe elegir el puntaje entre 0 - 10");
                                borrarTabla();
                                cargarTabla();
                                borrarCampos();
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Debe completar los campos Correctamente(Verifique la fecha y la NOTA)!");
                            borrarTabla();
                            cargarTabla();
                            borrarCampos();
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Debe ingresar una fecha!.");
                        borrarTabla();
                        cargarTabla();
                        borrarCampos();
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "El siniestro debe estar EN CURSO! Asigne una Brigada!");
                    borrarTabla();
                    cargarTabla();
                    borrarCampos();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Elija un siniestro y complete los campos Correctamente(Verifique la fecha)!");
                borrarTabla();
                cargarTabla();
                borrarCampos();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar una fecha correcta!");
            borrarTabla();
            cargarTabla();
            borrarCampos();
        }

    }//GEN-LAST:event_ButtonFinalizarActionPerformed

    private void ButtonAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAsignarActionPerformed
        // TODO add your handling code here:
        boolean fin = false;

        int filas = TableSiniestros.getSelectedRow();
        Siniestro sini = null;
//        try{  
        if (filas != -1) {
            int codBrig = (Integer) TableSiniestros.getValueAt(filas, 0);
            sini = SD.buscarSiniestro(codBrig);

            if (sini.isEnCurso() == false) {

                for (Map.Entry<Double, Cuartel> obj : CD.listaCuartCercaDeSiniestro(sini.getCodSiniestro()).entrySet()) {
                    Cuartel cuart = obj.getValue();
                    for (Brigada brigada : CD.listarBrigadasDelCuartel(cuart.getCodCuartel())) {
                        if (brigada.getEspecialidad().equals(sini.getEspecialidad()) || brigada.isLibre() == true) {
                            if (!BD.listarBomberosPorBrigada(brigada.getCodBrigada()).isEmpty()) {
                                sini.setBrigada(brigada);
                                sini.setEnCurso(true);
                                fin = true;
                                brigada.setLibre(false);
                                BD.modificarBrigada(brigada);
                                borrarTabla();
                                cargarTabla();
                                SD.modificarSiniestro(sini);
                                JOptionPane.showMessageDialog(null, "Se asigno la Brigada: " + brigada.getNombre_br() + " del Cuartel: " + cuart.getNombre_cuartel());
                                LabelCuartel.setText(cuart.getNombre_cuartel());
                                LabelDist.setText(obj.getKey() + " KM.");
                                LabelBrig.setText(brigada.getNombre_br());
                                break;
                            }

                        }
                    }
                    if (fin == true) {
                        break;
                    } else {
                        for (Brigada brigada : CD.listarBrigadasDelCuartel(cuart.getCodCuartel())) {
                            if (brigada.isLibre() == true) {
                                if (!BD.listarBomberosPorBrigada(brigada.getCodBrigada()).isEmpty()) {
                                sini.setBrigada(brigada);
                                sini.setEnCurso(true);
                                fin = true;
                                borrarTabla();
                                cargarTabla();
                                brigada.setLibre(false);
                                BD.modificarBrigada(brigada);
                                SD.modificarSiniestro(sini);
                                JOptionPane.showMessageDialog(null, "Se asigno la Brigada provisional: " + brigada.getNombre_br() + " del Cuartel: " + cuart.getNombre_cuartel());
                                JOptionPane.showMessageDialog(null, "Se notificara a la Brigada con esa especialidad mas cercana para apoyar al estar libre.");
                                break;
                                }
                            }
                        }
                    }

                }
                if (fin == false) {
                    JOptionPane.showMessageDialog(null, "NO se encontró una BRIGADA LIBRE");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Porfavor seleccione un Siniestro que no este en Curso");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Porfavor seleccione primero un Siniestro.");
        }
//        }catch(Exception ex){
//            JOptionPane.showMessageDialog(null, "Porfavor seleccione primero un Siniestro."+ex.getMessage());
//        }

        borrarTabla();
        cargarTabla();

    }//GEN-LAST:event_ButtonAsignarActionPerformed

    private void TextPuntajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextPuntajeKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean num = key >= 48 && key <= 58;

        if (!num) {
            evt.consume();
        }

    }//GEN-LAST:event_TextPuntajeKeyTyped

    private void TableSiniestrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableSiniestrosMouseClicked
        // TODO add your handling code here:
        
        int filas = TableSiniestros.getSelectedRow();
        Siniestro sini = new Siniestro();
        try {
            if (filas != -1) {
                int codBrig = (Integer) TableSiniestros.getValueAt(filas, 0);
                sini = SD.buscarSiniestro(codBrig);
                TextDesc.setText(sini.getDetalles());
            } else {
                JOptionPane.showMessageDialog(null, "Elija un siniestro activo Porfavor!");
            }
        } catch (Exception ex) {
            
        }
        
    }//GEN-LAST:event_TableSiniestrosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAsignar;
    private javax.swing.JButton ButtonFinalizar;
    private javax.swing.JButton ButtonSalir;
    private com.toedter.calendar.JDateChooser FechaFin;
    private javax.swing.JLabel LabelBrig;
    private javax.swing.JLabel LabelCuartel;
    private javax.swing.JLabel LabelDist;
    private javax.swing.JTable TableSiniestros;
    private javax.swing.JTextArea TextDesc;
    private javax.swing.JTextField TextPuntaje;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    public void iniciarTabla() {
        modelo.addColumn("Codigo Siniestro");
        modelo.addColumn("Tipo");
        modelo.addColumn("Fecha inicio");
        modelo.addColumn("Coordenada X");
        modelo.addColumn("Coordenada Y");
        modelo.addColumn("Brigada");
        modelo.addColumn("Detalle");
        modelo.addColumn("En curso");
        TableSiniestros.setModel(modelo);
    }

    public void cargarTabla() {
        String enCurso;
        for (Siniestro sini : SD.listaDeSiniestros()) {
            if (sini.isEstado() == true) {
                if (sini.isEnCurso() == true) {
                    enCurso = "SI";
                } else {
                    enCurso = "NO";
                }
                modelo.addRow(new Object[]{sini.getCodSiniestro(), sini.getEspecialidad(), sini.getFecha_siniestro(), sini.getCoord_X(), sini.getCoord_Y(), sini.getBrigada(), sini.getDetalles(), enCurso});
            }
        }

    }

    public void borrarTabla() {
        int x = TableSiniestros.getRowCount() - 1;

        for (int i = x; i >= 0; i--) {
            modelo.removeRow(i);

        }
    }

    public void borrarCampos() {
        FechaFin.setCalendar(null);
        TextPuntaje.setText("");

    }

    private void evitarPegar(JTextField campo) {
        InputMap map2 = campo.getInputMap(JTextField.WHEN_FOCUSED);
        map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

    }

}
