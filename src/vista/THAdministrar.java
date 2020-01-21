
package vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Camas;
import modelo.CamasData;
import modelo.Conexion;
import modelo.TipoHabitacion;
import modelo.TipoHabitacionData;
import static vista.Principal.adminHuesped;
import static vista.Principal.jdpPrincipal;
import static vista.Principal.listarTH;


public class THAdministrar extends javax.swing.JInternalFrame {


    public THAdministrar() {
        initComponents();
        Conexion con = new Conexion();
        thd = new TipoHabitacionData(con);
        cd = new CamasData(con);
        tb = (DefaultTableModel) jtCamas.getModel();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jtfCodigo = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfCPersonas = new javax.swing.JTextField();
        jtfPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbCrear = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtCamas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jbAgregar = new javax.swing.JButton();
        jEliminar = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Administrar Tipo de Habitacion");

        jtfCodigo.setEditable(false);

        jLabel4.setText("Precio");

        jLabel2.setText("Cantidad de Personas");

        jLabel1.setText("Nombre");

        jLabel6.setText("Codigo");

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

        jLabel3.setText("Lista de Camas");

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtfCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(jtfCPersonas, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jEliminar)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfCPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jEliminar)
                    .addComponent(jbAgregar))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCrear)
                    .addComponent(jbModificar)
                    .addComponent(jbBorrar)
                    .addComponent(jbLimpiar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static AgregarCamas agregarCamas = null;
    TipoHabitacionData thd;
    CamasData cd;
    String[] nombreColumnas = {"Cantidad", "Cama"};
    String[] registro = new String[2];
    DefaultTableModel tb;
    DefaultTableModel modelo = new DefaultTableModel(null, nombreColumnas);
    Validaciones val = new Validaciones();
    boolean block = true;
    
    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        //Buscar
        if(listarTH == null){
            listarTH = new THListar();
            jdpPrincipal.add(listarTH);
            listarTH.show();
        }else{
            listarTH.dispose();
            listarTH = new THListar();
            jdpPrincipal.add(listarTH);
            listarTH.show();
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        //Limpiar
        jtfCodigo.setText("");
        jtfNombre.setText("");
        jtfCPersonas.setText("");
        jtfPrecio.setText("");
        
        int a = jtCamas.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        modelo.removeRow(jtCamas.getRowCount()-1);
        }
        
        block = true;
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        //Borrar
        thd.borrarTipoHabitacion(Integer.parseInt(jtfCodigo.getText()));
        TipoHabitacion th = new TipoHabitacion();
        th.setCodigoHabitacion(Integer.parseInt(jtfCodigo.getText()));
        cd.borrarCamas(th);
      
        jtfCodigo.setText("");
        jtfNombre.setText("");
        jtfCPersonas.setText("");
        jtfPrecio.setText("");
        
        int a = jtCamas.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        modelo.removeRow(jtCamas.getRowCount()-1);
        }
        
        block = true;
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        //Modificar
        if(val.esNumero(jtfCPersonas.getText())){
            if(val.esPrecio(jtfPrecio.getText())){
                if(jtCamas.getRowCount() > 0){
              
                    TipoHabitacion th = new TipoHabitacion();
                    th.setCodigoHabitacion(Integer.parseInt(jtfCodigo.getText()));
                    th.setNombre(jtfNombre.getText());
                    th.setCantidadPersonas(Integer.parseInt(jtfCPersonas.getText()));
                    th.setPrecio(Double.parseDouble(jtfPrecio.getText()));

                    if(jtfCodigo.getText() != null){
                        thd.modificarTipoHabitacion(th);
                    }    

                    List<Camas> camas = new ArrayList();
                    int fila = jtCamas.getRowCount()-1;
                    for(int i = 0; i <= fila; i ++){
                        Camas cama = new Camas();
                        cama.setCodigoHabitacion(th.getCodigoHabitacion());
                        cama.setCantidad(Integer.parseInt(jtCamas.getValueAt(i, 0).toString()));
                        cama.setCama((String)jtCamas.getValueAt(i, 1));

                        camas.add(cama);
                    }

                    cd.borrarCamas(th);

                    if(camas.size() == 1){
                        Camas cama = new Camas();
                        cama = camas.get(0);
                        cd.agregarCamas(cama);
                    }else{
                        for(int i = 0; i <= camas.size() - 1; i ++){
                            Camas cama = new Camas();
                            cama = camas.get(i);
                            cd.agregarCamas(cama);
                        }
                    }
                }
            }
        }    
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed
        //Crear
        if(block){
            if(val.esNumero(jtfCPersonas.getText())){
                if(val.esPrecio(jtfPrecio.getText())){
                    if(jtCamas.getRowCount() > 0){

                        List<Camas> camas = new ArrayList<Camas>();
                        int fila = jtCamas.getRowCount()-1;
                        for(int i = 0; i <= fila; i ++){
                                Camas cama = new Camas();
                            cama.setCantidad(Integer.parseInt(jtCamas.getValueAt(i, 0).toString()));
                            cama.setCama((String)jtCamas.getValueAt(i, 1));

                            camas.add(cama);
                        }

                        TipoHabitacion th = new TipoHabitacion();
                        th.setNombre(jtfNombre.getText());
                        th.setCantidadPersonas(Integer.parseInt(jtfCPersonas.getText()));
                        th.setPrecio(Double.parseDouble(jtfPrecio.getText()));
                        th.setCamas(camas);

                        thd.agregarTipoHabitacion(th);

                        jtfCodigo.setText(th.getCodigoHabitacion()+"");

                        if(camas.size() == 1){
                            Camas cama = new Camas();
                            cama = camas.get(0);
                            cama.setCodigoHabitacion(th.getCodigoHabitacion());
                            cd.agregarCamas(cama);
                        }else{
                            for(int i = 0; i <= camas.size() - 1; i ++){
                                Camas cama = new Camas();
                                cama = camas.get(i);
                                cama.setCodigoHabitacion(th.getCodigoHabitacion());
                                cd.agregarCamas(cama);
                            }
                        }
                        block = false;
                    }else{
                        JOptionPane.showMessageDialog(null, "Debe ingresar camas", "Camas", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }    
        }       
    }//GEN-LAST:event_jbCrearActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        //Llamara a agregar camas
        if(agregarCamas == null){
            agregarCamas = new AgregarCamas();
            jdpPrincipal.add(agregarCamas);
            agregarCamas.show();
        }else{
            agregarCamas.dispose();
            agregarCamas = new AgregarCamas();
            jdpPrincipal.add(agregarCamas);
            agregarCamas.show();
        }        
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        //Eliminar cama
        if(jtCamas.getRowCount() > 0){
            int fila = jtCamas.getSelectedRow();
            if(fila < 0){
                modelo.removeRow(jtCamas.getRowCount() - 1);
            }else{
                modelo.removeRow(fila);
            }
        }
    }//GEN-LAST:event_jEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCrear;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    public javax.swing.JTable jtCamas;
    public javax.swing.JTextField jtfCPersonas;
    public javax.swing.JTextField jtfCodigo;
    public javax.swing.JTextField jtfNombre;
    public javax.swing.JTextField jtfPrecio;
    // End of variables declaration//GEN-END:variables
}
