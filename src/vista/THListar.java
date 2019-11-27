
package vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.TipoHabitacion;
import modelo.TipoHabitacionData;



public class THListar extends javax.swing.JInternalFrame {


    public THListar() {
        initComponents();
        Conexion con = new Conexion();
        thd = new TipoHabitacionData(con);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtTH = new javax.swing.JTable();
        jbListar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Listar Tipos de Habitaciones");

        jtTH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "C. Personas", "C. Camas", "Tipo Camas", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtTH.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtTH);

        jbListar.setText("Listar");
        jbListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jbListar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbListar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    TipoHabitacionData thd;    
    TipoHabitacion th;
    List<TipoHabitacion> tiposH = new ArrayList<>();
    String[] registro = new String[5];
    
    private void jbListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarActionPerformed
        //Listar tipo habitacion
        tiposH = thd.listarTipoHabitacion();
        String[] nombreColumnas = {"Codigo", "C. Personas", "C. Camas", "Tipo Camas", "Precio"};
        DefaultTableModel modelo = new DefaultTableModel(null, nombreColumnas);
        int i;
        for(i = 0; i < tiposH.size(); i++){
            th = tiposH.get(i);
            registro[0] = th.getCodigoHabitacion()+"";
            registro[1] = th.getCantidadPersonas()+"";
            registro[2] = th.getCantidadCamas()+"";
            registro[3] = th.getTiposCamas();
            registro[4] = th.getPrecio()+"";

            modelo.addRow(registro);
        }

        jtTH.setModel(modelo);

    }//GEN-LAST:event_jbListarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbListar;
    private javax.swing.JTable jtTH;
    // End of variables declaration//GEN-END:variables
}
