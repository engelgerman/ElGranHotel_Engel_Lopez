
package vista;

import static vista.Principal.adminTH;
import static vista.THAdministrar.agregarCamas;


public class AgregarCamas extends javax.swing.JInternalFrame {


    public AgregarCamas() {
        initComponents();
        String[] seleccion = {"", "Simple", "Doble", "Queen", "King Size"};
        jcbCamas.removeAllItems();
        for(int i = 0; i < seleccion.length; i++){
            jcbCamas.addItem(seleccion[i]);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbCamas = new javax.swing.JComboBox<>();
        jtfCantidad = new javax.swing.JTextField();
        jbAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jlPersonas = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Seleccione Camas");

        jLabel1.setText("Cantidad");

        jLabel2.setText("Tipo de Cama");

        jcbCamas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbCamas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbCamasItemStateChanged(evt);
            }
        });

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jLabel3.setText("Personas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlPersonas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbAgregar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jcbCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbAgregar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jlPersonas)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Validaciones val = new Validaciones();
    int[] personas = {1, 2, 2, 2};
    
    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        //Agregar camas a tipo de habitacion
        if(val.esNumero(jtfCantidad.getText())){
            if(jcbCamas.getSelectedIndex() != 0){
                String[] registro = new String[2];
            
                registro[0] = jtfCantidad.getText();
                registro[1] = (String)jcbCamas.getSelectedItem();
            
                adminTH.modelo.addRow(registro);
                adminTH.jtCamas.setModel(adminTH.modelo);
                
                jtfCantidad.setText("");
                jcbCamas.setSelectedIndex(0);
                
                agregarCamas.dispose();
            }    
        }        
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jcbCamasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbCamasItemStateChanged
        //
        if(jcbCamas.getSelectedIndex() > 0){
        jlPersonas.setText(personas[jcbCamas.getSelectedIndex()-1]+"");
        }
    }//GEN-LAST:event_jcbCamasItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JComboBox<String> jcbCamas;
    private javax.swing.JLabel jlPersonas;
    private javax.swing.JTextField jtfCantidad;
    // End of variables declaration//GEN-END:variables
}
