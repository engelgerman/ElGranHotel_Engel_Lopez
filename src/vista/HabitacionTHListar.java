
package vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Camas;
import modelo.CamasData;
import modelo.Conexion;
import modelo.TipoHabitacion;
import modelo.TipoHabitacionData;
import static vista.Principal.adminH;
import static vista.Principal.adminTH;
import static vista.Principal.hthListar;
import static vista.Principal.jdpPrincipal;



public class HabitacionTHListar extends javax.swing.JInternalFrame {


    public HabitacionTHListar() {
        initComponents();
        Conexion con = new Conexion();
        thd = new TipoHabitacionData(con);
        cd = new CamasData(con);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtTH = new javax.swing.JTable();
        jbListar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtCamas = new javax.swing.JTable();
        jbCargar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Listar Tipos de Habitaciones");

        jtTH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "C. Personas", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtTH.getTableHeader().setReorderingAllowed(false);
        jtTH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTH);
        if (jtTH.getColumnModel().getColumnCount() > 0) {
            jtTH.getColumnModel().getColumn(0).setResizable(false);
            jtTH.getColumnModel().getColumn(1).setResizable(false);
            jtTH.getColumnModel().getColumn(2).setResizable(false);
            jtTH.getColumnModel().getColumn(3).setResizable(false);
        }

        jbListar.setText("Listar");
        jbListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarActionPerformed(evt);
            }
        });

        jtCamas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Cama"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtCamas);

        jbCargar.setText("Cargar");
        jbCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbListar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCargar)
                .addGap(229, 229, 229))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbListar)
                    .addComponent(jbCargar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    TipoHabitacionData thd;    
    TipoHabitacion th;
    CamasData cd;
    List<TipoHabitacion> tiposH = new ArrayList<>();
    String[] registro = new String[4];
    String[] nombreColumnas = {"Codigo", "Nombre", "C. Personas", "Precio"};
    DefaultTableModel modelo = new DefaultTableModel(null, nombreColumnas);
    String[] registro2 = new String[2];
    String[] nombreColumnas2 = {"Cantidad", "Cama"};
    DefaultTableModel modelo2 = new DefaultTableModel(null, nombreColumnas2); 
    
    
    private void jbListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarActionPerformed
        //Listar tipo habitacion
        DefaultTableModel tb = (DefaultTableModel) jtTH.getModel();
        for (int i = jtTH.getRowCount() - 1; i >= 0; i--) {          
        tb.removeRow(jtTH.getRowCount()-1);
        }
        
        tiposH = thd.listarTipoHabitacion();

        for(int i = 0; i < tiposH.size(); i++){
            th = tiposH.get(i);
            registro[0] = th.getCodigoHabitacion()+"";
            registro[1] = th.getNombre();
            registro[2] = th.getCantidadPersonas()+"";
            registro[3] = th.getPrecio()+"";

            modelo.addRow(registro);
        }

        jtTH.setModel(modelo);

    }//GEN-LAST:event_jbListarActionPerformed

    private void jtTHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTHMouseClicked
        //Listar Camas
        TipoHabitacion th1 = new TipoHabitacion();
        th1.setCodigoHabitacion(Integer.parseInt((String)jtTH.getValueAt(jtTH.getSelectedRow(), 0)));
        th1.setNombre((String)jtTH.getValueAt(jtTH.getSelectedRow(), 1));
        th1.setCantidadPersonas(Integer.parseInt((String)jtTH.getValueAt(jtTH.getSelectedRow(), 2)));
        th1.setPrecio(Double.parseDouble((String)jtTH.getValueAt(jtTH.getSelectedRow(), 3)));
        
        List<Camas> camas = new ArrayList<Camas>();
        camas = cd.buscarCamas(th1);
        
        Camas cama = new Camas();
        
        for (int i = jtCamas.getRowCount() - 1; i >= 0; i--) {          
        modelo2.removeRow(jtCamas.getRowCount()-1);
        }
        
        for(int i = 0; i < camas.size(); i++){
            cama = camas.get(i);
            registro2[0] = cama.getCantidad()+"";
            registro2[1] = cama.getCama();


            modelo2.addRow(registro2);
        }

        jtCamas.setModel(modelo2);
    }//GEN-LAST:event_jtTHMouseClicked

    private void jbCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarActionPerformed
        //Cargar tipo de habitacion
        int fila = jtTH.getSelectedRow();
        th = thd.buscarTipoHabitacion(Integer.parseInt((String)jtTH.getValueAt(fila, 0)));
      
        adminH.th = th;
        
        adminH.jtfTHabitacion.setText(adminH.th.getCodigoHabitacion()+"");
        adminH.jtfTHNombre.setText(adminH.th.getNombre());
        
        hthListar.dispose();
                
    }//GEN-LAST:event_jbCargarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbCargar;
    private javax.swing.JButton jbListar;
    public javax.swing.JTable jtCamas;
    private javax.swing.JTable jtTH;
    // End of variables declaration//GEN-END:variables
}
