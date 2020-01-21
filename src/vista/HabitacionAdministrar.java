
package vista;

import javax.swing.JOptionPane;
import modelo.Conexion;
import modelo.Habitacion;
import modelo.HabitacionData;
import modelo.TipoHabitacion;
import static vista.Principal.buscarH;
import static vista.Principal.hthListar;
import static vista.Principal.jdpPrincipal;
import static vista.Principal.listarTH;


public class HabitacionAdministrar extends javax.swing.JInternalFrame {


    public HabitacionAdministrar() {
        initComponents();
        Conexion con = new Conexion();
        hd = new HabitacionData(con);
        val = new Validaciones();
        h = new Habitacion();
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
        jbBuscarH = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbCrear = new javax.swing.JButton();
        jcbEstado = new javax.swing.JCheckBox();
        jbBuscarTH = new javax.swing.JButton();
        jtfTHNombre = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Administrar Habitaciones");

        jtfTHabitacion.setEditable(false);

        jLabel2.setText("Tipo Hab.");
        jLabel2.setToolTipText("");

        jLabel1.setText("Piso");

        jLabel6.setText("N. Habitacion");

        jbBuscarH.setText("Buscar");
        jbBuscarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarHActionPerformed(evt);
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

        jcbEstado.setText("Fuera de Servicio");

        jbBuscarTH.setText("Buscar");
        jbBuscarTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarTHActionPerformed(evt);
            }
        });

        jtfTHNombre.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jcbEstado)
                .addContainerGap(189, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfTHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfTHNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jbBuscarTH, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel6)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jbCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 17, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfPiso, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                .addComponent(jtfNHabitacion))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbBuscarH, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBuscarTH)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfTHNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfTHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(42, 42, 42)
                .addComponent(jcbEstado)
                .addGap(116, 116, 116))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfNHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jbBuscarH))
                    .addGap(8, 8, 8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGap(162, 162, 162)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbCrear)
                        .addComponent(jbModificar)
                        .addComponent(jbBorrar)
                        .addComponent(jbLimpiar))
                    .addContainerGap(31, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    HabitacionData hd;
    Habitacion h;
    TipoHabitacion th;
    Validaciones val;
    boolean block = true;
    
    private void jbBuscarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarHActionPerformed
        //Buscar
        if(buscarH == null){
            buscarH = new HabitacionListar();
            jdpPrincipal.add(buscarH);
            buscarH.show();
        }else{
            buscarH.dispose();
            buscarH = new HabitacionListar();
            jdpPrincipal.add(buscarH);
            buscarH.show();
        }        
    }//GEN-LAST:event_jbBuscarHActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        //Limpiar
        jtfNHabitacion.setText("");
        jtfPiso.setText("");
        jtfTHabitacion.setText("");
        jtfTHNombre.setText("");
        jcbEstado.setSelected(false);
        block = true;
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        //Borrar
        if(val.esNumero(jtfNHabitacion.getText())){
            hd.borrarHabitacion(Integer.parseInt(jtfNHabitacion.getText()));

            jtfNHabitacion.setText("");
            jtfPiso.setText("");
            jtfTHabitacion.setText("");
            jcbEstado.setSelected(false);
            block = true;
        }
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        //Modificar
        if(val.esNumero(jtfNHabitacion.getText())){
            if(val.esNumero(jtfPiso.getText())){
                if(jtfNHabitacion.getText() != null){
                    if(jtfTHabitacion.getText() != null){
                        Habitacion habitacion = new Habitacion();
                        habitacion.setNumeroHabitacion(Integer.parseInt(jtfNHabitacion.getText()));
                        habitacion.setPiso(Integer.parseInt(jtfPiso.getText()));
                        th = new TipoHabitacion();
                        th.setCodigoHabitacion(Integer.parseInt(jtfTHabitacion.getText()));
                        habitacion.setTipoHabitacion(th);

                        if(jcbEstado.isSelected()){
                            habitacion.setEstadoHabitacion(1);
                        }else{
                            habitacion.setEstadoHabitacion(0);
                        }

                        hd.modificarHabitacion(habitacion);

                        block = false;
                    }else{
                        JOptionPane.showMessageDialog(null, "Debe ingresar tipo de habitacions", "Tipo de Habitacion", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        }
        
        
        

    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed
        //Crear
        if(block){
            if(val.esNumero(jtfNHabitacion.getText())){
                if(val.esNumero(jtfPiso.getText())){
                    if(jtfNHabitacion.getText() != null){
                        if(jtfTHabitacion.getText() != null){
                            Habitacion habitacion = new Habitacion();
                            habitacion.setNumeroHabitacion(Integer.parseInt(jtfNHabitacion.getText()));
                            habitacion.setPiso(Integer.parseInt(jtfPiso.getText()));
                            
                            habitacion.setTipoHabitacion(th);
                            
                            if(jcbEstado.isSelected()){
                                habitacion.setEstadoHabitacion(1);
                            }else{
                                habitacion.setEstadoHabitacion(0);
                            }
                            
                            hd.agregarHabitacion(habitacion);
                                                        
                            block = false;
                        }else{
                            JOptionPane.showMessageDialog(null, "Debe ingresar tipo de habitacions", "Tipo de Habitacion", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            }
        }    
    }//GEN-LAST:event_jbCrearActionPerformed

    private void jbBuscarTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarTHActionPerformed
        //Buscar tipo habitacion
        if(hthListar == null){
            hthListar = new HabitacionTHListar();
            jdpPrincipal.add(hthListar);
            hthListar.show();
        }else{
            hthListar.dispose();
            hthListar = new HabitacionTHListar();
            jdpPrincipal.add(hthListar);
            hthListar.show();
        }
        
    }//GEN-LAST:event_jbBuscarTHActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscarH;
    private javax.swing.JButton jbBuscarTH;
    private javax.swing.JButton jbCrear;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    public javax.swing.JCheckBox jcbEstado;
    public javax.swing.JTextField jtfNHabitacion;
    public javax.swing.JTextField jtfPiso;
    public javax.swing.JTextField jtfTHNombre;
    public javax.swing.JTextField jtfTHabitacion;
    // End of variables declaration//GEN-END:variables
}
