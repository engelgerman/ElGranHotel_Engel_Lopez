
package vista;

import modelo.Conexion;
import modelo.Habitacion;
import modelo.HabitacionData;


public class HabitacionAdministrar extends javax.swing.JInternalFrame {


    public HabitacionAdministrar() {
        initComponents();
        Conexion con = new Conexion();
        hd = new HabitacionData(con);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfNHabitacion = new javax.swing.JTextField();
        jtfPiso = new javax.swing.JTextField();
        jtfTHabitacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbCrear = new javax.swing.JButton();
        jcbEstado = new javax.swing.JCheckBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Administrar Habitaciones");

        jLabel2.setText("Tipo Hab.");
        jLabel2.setToolTipText("");

        jLabel1.setText("Piso");

        jLabel6.setText("N. Habitacion");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbCrear.setText("Crear");
        jbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearActionPerformed(evt);
            }
        });

        jcbEstado.setText("Estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jcbEstado)
                .addContainerGap(239, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel6)
                                .addComponent(jLabel2)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jbCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfPiso)
                                .addComponent(jtfTHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addComponent(jtfNHabitacion))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(jcbEstado)
                .addGap(116, 116, 116))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfNHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jbBuscar))
                    .addGap(8, 8, 8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfTHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGap(134, 134, 134)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbCrear)
                        .addComponent(jbModificar)
                        .addComponent(jbBorrar)
                        .addComponent(jbLimpiar))
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    HabitacionData hd;
    Habitacion h;
    
    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        //Buscar
        h = new Habitacion();
        h = hd.buscarHabitacion(Integer.parseInt(jtfNHabitacion.getText()));
        
        jtfPiso.setText(h.getPiso()+"");
        jtfTHabitacion.setText(h.getTipoHabitacion()+"");
        if(h.getEstadoHabitacion()==1){
            jcbEstado.setSelected(true);
        }else{
            jcbEstado.setSelected(false);
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        //Limpiar
        jtfNHabitacion.setText("");
        jtfPiso.setText("");
        jtfTHabitacion.setText("");
        jcbEstado.setSelected(false);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        //Borrar
        if(jtfNHabitacion.getText() != null){
            hd.borrarHabitacion(Integer.parseInt(jtfNHabitacion.getText()));

            jtfNHabitacion.setText("");
            jtfPiso.setText("");
            jtfTHabitacion.setText("");
            jcbEstado.setSelected(false);
        }
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        //Modificar
        h = new Habitacion();
        if(jtfNHabitacion.getText() != null){
        h = new Habitacion();
        h.setNumeroHabitacion(Integer.parseInt(jtfNHabitacion.getText()));
        h.setPiso(Integer.parseInt(jtfPiso.getText()));
        h.setTipoHabitacion(Integer.parseInt(jtfTHabitacion.getText()));
        if(jcbEstado.isSelected()){
            h.setEstadoHabitacion(1);
        }else{
            h.setEstadoHabitacion(0);
        }

        if(jtfNHabitacion.getText() != null){
            hd.modificarHabitacion(h);
        }
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed
        //Crear
        if(jtfNHabitacion.getText() != null){
        h = new Habitacion();
        h.setNumeroHabitacion(Integer.parseInt(jtfNHabitacion.getText()));
        h.setPiso(Integer.parseInt(jtfPiso.getText()));
        h.setTipoHabitacion(Integer.parseInt(jtfTHabitacion.getText()));
        if(jcbEstado.isSelected()){
            h.setEstadoHabitacion(1);
        }else{
            h.setEstadoHabitacion(0);
        }

        hd.agregarHabitacion(h);
        }
    }//GEN-LAST:event_jbCrearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCrear;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JCheckBox jcbEstado;
    private javax.swing.JTextField jtfNHabitacion;
    private javax.swing.JTextField jtfPiso;
    private javax.swing.JTextField jtfTHabitacion;
    // End of variables declaration//GEN-END:variables
}
