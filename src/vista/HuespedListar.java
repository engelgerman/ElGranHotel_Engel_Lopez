
package vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Huesped;
import modelo.HuespedData;


public class HuespedListar extends javax.swing.JInternalFrame {


    public HuespedListar() {
        initComponents();
        Conexion con = new Conexion();
        hd = new HuespedData(con);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtHuesped = new javax.swing.JTable();
        jbListar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Listar Huesped");

        jtHuesped.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "DNI", "Domicilio", "Correo", "Celular"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtHuesped.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtHuesped);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
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

        HuespedData hd;
        Huesped huesped;
        List<Huesped> huespedes = new ArrayList<>();
        String[] registro = new String[6];
    
    private void jbListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarActionPerformed
        //Listar Huesped
        huespedes = hd.listarHuesped();
        String[] nombreColumnas = {"ID", "Nombre", "DNI", "Domicilio", "Correo", "Celular"};
        DefaultTableModel modelo = new DefaultTableModel(null, nombreColumnas);
        int i;
        for(i = 0; i < huespedes.size(); i++){
            huesped = huespedes.get(i);
            registro[0] = huesped.getIdHuesped()+"";
            registro[1] = huesped.getNombre();
            registro[2] = huesped.getDni()+"";
            registro[3] = huesped.getDomicilio();
            registro[4] = huesped.getCorreo();
            registro[5] = huesped.getCelular();
            
            modelo.addRow(registro);
        }
        
        jtHuesped.setModel(modelo);
        
        
    }//GEN-LAST:event_jbListarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbListar;
    private javax.swing.JTable jtHuesped;
    // End of variables declaration//GEN-END:variables
}
