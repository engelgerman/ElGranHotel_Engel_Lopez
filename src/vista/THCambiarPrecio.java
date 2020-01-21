
package vista;

import java.util.ArrayList;
import java.util.List;
import modelo.Conexion;
import modelo.TipoHabitacion;
import modelo.TipoHabitacionData;


public class THCambiarPrecio extends javax.swing.JInternalFrame {


    public THCambiarPrecio() {
        initComponents();
        Conexion con = new Conexion();
        thd = new TipoHabitacionData(con);
        th = new ArrayList<TipoHabitacion>();
        
        th = thd.listarTipoHabitacion();
        
        jcbTH.removeAllItems();
        jcbTH.addItem("");
        for(int i = 0; i < th.size(); i++){
            jcbTH.addItem(th.get(i).getNombre());
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcbTH = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfCH = new javax.swing.JTextField();
        jtfPA = new javax.swing.JTextField();
        jbCambiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtfPN = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cambiar Precio");

        jcbTH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbTH.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbTHItemStateChanged(evt);
            }
        });

        jLabel1.setText("Tipo de Habitacion");

        jLabel2.setText("Precio Actual");

        jLabel3.setText("Precio Nuevo");

        jtfCH.setEditable(false);

        jtfPA.setEditable(false);

        jbCambiar.setText("Cambiar");
        jbCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCambiarActionPerformed(evt);
            }
        });

        jLabel4.setText("Codigo Habitacion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbTH, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtfPN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                .addComponent(jtfPA, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfCH, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jbCambiar)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jbCambiar)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    TipoHabitacionData thd;
    List<TipoHabitacion> th;
    
    private void jcbTHItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbTHItemStateChanged
        //Cargar codigo de Habitacion
        if(jcbTH.getSelectedIndex()>0){
            jtfCH.setText(th.get(jcbTH.getSelectedIndex()-1).getCodigoHabitacion()+"");
            jtfPA.setText(th.get(jcbTH.getSelectedIndex()-1).getPrecio()+"");
        }   
    }//GEN-LAST:event_jcbTHItemStateChanged

    private void jbCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCambiarActionPerformed
        //Cambiar precio
        if(jcbTH.getSelectedIndex()>0){
            TipoHabitacion thNuevo = new TipoHabitacion();
            thNuevo = th.get(jcbTH.getSelectedIndex()-1);
            thNuevo.setPrecio(Double.parseDouble(jtfPN.getText()));
            
            thd.modificarPrecio(thNuevo);
            
            th = thd.listarTipoHabitacion();
        
            jcbTH.removeAllItems();
            jcbTH.addItem("");
            for(int i = 0; i < th.size(); i++){
                jcbTH.addItem(th.get(i).getNombre());
            }
            
            jtfPN.setText("");
        } 
        
        
        
        
    }//GEN-LAST:event_jbCambiarActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbCambiar;
    private javax.swing.JComboBox<String> jcbTH;
    private javax.swing.JTextField jtfCH;
    private javax.swing.JTextField jtfPA;
    private javax.swing.JTextField jtfPN;
    // End of variables declaration//GEN-END:variables
}
