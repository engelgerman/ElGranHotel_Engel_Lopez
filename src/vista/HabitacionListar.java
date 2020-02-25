
package vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Habitacion;
import modelo.HabitacionData;
import modelo.TipoHabitacion;
import modelo.TipoHabitacionData;
import static vista.Principal.adminH;
import static vista.Principal.jdpPrincipal;



public class HabitacionListar extends javax.swing.JInternalFrame {


    public HabitacionListar() {
        initComponents();
        Conexion con = new Conexion();
        hd = new HabitacionData(con);
        thd = new TipoHabitacionData(con);
        
        tipoH = new ArrayList<TipoHabitacion>();
        
        tipoH = thd.listarTipoHabitacion();
        
        jcbTH.removeAllItems();
        for(int i = 0; i < tipoH.size(); i++){
            jcbTH.addItem(tipoH.get(i).getNombre());
        }
        jcbTH.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtH = new javax.swing.JTable();
        jbListar = new javax.swing.JButton();
        jbCargar = new javax.swing.JButton();
        jcbTH = new javax.swing.JComboBox<>();
        jlCantidad = new javax.swing.JLabel();
        jcTH = new javax.swing.JCheckBox();
        jcPrecio = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jtfPrecio1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfPrecio2 = new javax.swing.JTextField();
        jcActiva = new javax.swing.JCheckBox();
        jcDesactiva = new javax.swing.JCheckBox();
        jbLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Listar Habitaciones");

        jtH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N. Habitacion", "Piso", "Tipo de Habitacion", "Estado"
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
        jtH.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtH);

        jbListar.setText("Listar");
        jbListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarActionPerformed(evt);
            }
        });

        jbCargar.setText("Cargar");
        jbCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarActionPerformed(evt);
            }
        });

        jcbTH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbTH.setEnabled(false);

        jlCantidad.setToolTipText("");

        jcTH.setText("Tipo de Habitacion");
        jcTH.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcTHFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcTHFocusLost(evt);
            }
        });

        jcPrecio.setText("Precio");
        jcPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcPrecioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcPrecioFocusLost(evt);
            }
        });

        jLabel1.setText("de");

        jtfPrecio1.setEnabled(false);

        jLabel2.setText("a");

        jtfPrecio2.setEnabled(false);

        jcActiva.setText("Activa");
        jcActiva.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcActivaFocusGained(evt);
            }
        });

        jcDesactiva.setText("Desactiva");
        jcDesactiva.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcDesactivaFocusGained(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcTH)
                                .addGap(25, 25, 25)
                                .addComponent(jcbTH, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlCantidad))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jcPrecio)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1))
                                    .addComponent(jcActiva))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcDesactiva)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtfPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jbListar)
                                .addGap(18, 18, 18)
                                .addComponent(jbCargar)
                                .addGap(18, 18, 18)
                                .addComponent(jbLimpiar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCantidad)
                    .addComponent(jcTH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcPrecio)
                    .addComponent(jLabel1)
                    .addComponent(jtfPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jtfPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcActiva)
                    .addComponent(jcDesactiva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbListar)
                    .addComponent(jbCargar)
                    .addComponent(jbLimpiar))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    HabitacionData hd;
    Habitacion h;
    TipoHabitacionData thd;
    TipoHabitacion th;
    List<TipoHabitacion> tipoH;
    List<Habitacion> hab = new ArrayList<>();
    String[] registro = new String[4];
    
    private void jbListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarActionPerformed
        //Listar Habitacion
        DefaultTableModel tb = (DefaultTableModel) jtH.getModel();
        int a = jtH.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
        
        int index = 0;
        
        if(jcTH.isSelected()){
            index = 1;
        }
        
        if(jcPrecio.isSelected()){
            index = 2;
        }
        
        if(jcActiva.isSelected()){
            index = 3;
        }
        
        if(jcDesactiva.isSelected()){
            index = 4;
        }
        
        String[] nombreColumnas = {"N. Habitacion", "Piso", "Tipo de Habitacion", "Estado"};
        DefaultTableModel modelo = new DefaultTableModel(null, nombreColumnas);
        
        switch(index){
        
            case 1:
                        
                    TipoHabitacion tHabitacion = new TipoHabitacion();
                    tHabitacion = tipoH.get(jcbTH.getSelectedIndex());
                    hab = hd.buscarPorTH(tHabitacion);

                    for(int i = 0; i < hab.size(); i++){
                        h = hab.get(i);
                        registro[0] = h.getNumeroHabitacion()+"";
                        registro[1] = h.getPiso()+"";
                        th = new TipoHabitacion();
                        th = h.getTipoHabitacion();
                        registro[2] = th.getNombre();
                        registro[3] = h.getEstadoHabitacion()+"";

                        modelo.addRow(registro);
                    }

                    jtH.setModel(modelo);
                    jlCantidad.setText("Cantidad: " + jtH.getRowCount());
                    jlCantidad.setVisible(true);
 
            break;
            
            case 2:
                
                tipoH = thd.buscarPorPrecio(Integer.parseInt(jtfPrecio1.getText()), Integer.parseInt(jtfPrecio2.getText()));
                hab = hd.buscarPorTH(th);
                
                for(int o = 0; o < tipoH.size(); o++){
                    
                   hab = hd.buscarPorTH(tipoH.get(o));
                
                    for(int i = 0; i < hab.size(); i++){
                        h = hab.get(i);
                        registro[0] = h.getNumeroHabitacion()+"";
                        registro[1] = h.getPiso()+"";
                        th = new TipoHabitacion();
                        th = h.getTipoHabitacion();
                        registro[2] = th.getNombre();
                        registro[3] = h.getEstadoHabitacion()+"";

                        modelo.addRow(registro);
                    }
                }    

                jtH.setModel(modelo);
                jlCantidad.setText("Cantidad: " + jtH.getRowCount());
                jlCantidad.setVisible(true);
                
            break;
            
            case 3:
                
                hab = hd.buscarEstado(0);
                
                for(int i = 0; i < hab.size(); i++){
                    h = hab.get(i);
                    registro[0] = h.getNumeroHabitacion()+"";
                    registro[1] = h.getPiso()+"";
                    th = new TipoHabitacion();
                    th = h.getTipoHabitacion();
                    registro[2] = th.getNombre();
                    registro[3] = h.getEstadoHabitacion()+"";

                    modelo.addRow(registro);
                }

                jtH.setModel(modelo);
                jlCantidad.setText("Cantidad: " + jtH.getRowCount());
                jlCantidad.setVisible(true);
                
            break;    
                
            case 4:
                
                hab = hd.buscarEstado(1);
                
                for(int i = 0; i < hab.size(); i++){
                    h = hab.get(i);
                    registro[0] = h.getNumeroHabitacion()+"";
                    registro[1] = h.getPiso()+"";
                    th = new TipoHabitacion();
                    th = h.getTipoHabitacion();
                    registro[2] = th.getNombre();
                    registro[3] = h.getEstadoHabitacion()+"";

                    modelo.addRow(registro);
                }

                jtH.setModel(modelo);
                jlCantidad.setText("Cantidad: " + jtH.getRowCount());
                jlCantidad.setVisible(true);
                
            break;
            
            default:
                
                hab = hd.listarHabitacion();
                    
                for(int i = 0; i < hab.size(); i++){
                    h = hab.get(i);
                    registro[0] = h.getNumeroHabitacion()+"";
                    registro[1] = h.getPiso()+"";
                    th = new TipoHabitacion();
                    th = h.getTipoHabitacion();
                    registro[2] = th.getNombre();
                    registro[3] = h.getEstadoHabitacion()+"";

                    modelo.addRow(registro);
                }

                jtH.setModel(modelo);
                jlCantidad.setText("Cantidad: " + jtH.getRowCount());
                jlCantidad.setVisible(true);
                
            break;              
               
        }
    }//GEN-LAST:event_jbListarActionPerformed

    private void jbCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarActionPerformed
        //Cargar habitacion
        int fila = jtH.getSelectedRow();
        if(fila >= 0){
            h = hd.buscarHabitacion(Integer.parseInt((String)jtH.getValueAt(fila, 0)));

            if(adminH == null){
                adminH = new HabitacionAdministrar();
                jdpPrincipal.add(adminH);
                adminH.show();
            }else{
                adminH.dispose();
                adminH = new HabitacionAdministrar();
                jdpPrincipal.add(adminH);
                adminH.show();
            }

            adminH.h = h;

            adminH.jtfNHabitacion.setText(h.getNumeroHabitacion()+"");
            adminH.jtfPiso.setText(h.getPiso()+"");
            th = new TipoHabitacion();
            th = h.getTipoHabitacion();
            adminH.jtfTHabitacion.setText(th.getCodigoHabitacion()+"");
            adminH.jtfTHNombre.setText(th.getNombre());
            if(h.getEstadoHabitacion() == 1){
                adminH.jcbEstado.setSelected(true);
            }else{
                adminH.jcbEstado.setSelected(false);
            }

            Principal.buscarH.dispose();
        }
        
    }//GEN-LAST:event_jbCargarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        //Limpiar
        limpiar();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jcTHFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcTHFocusGained
        //Bloquear Tipo de Habitacion
        if(jcPrecio.isSelected() == false && jcActiva.isSelected() == false && jcDesactiva.isSelected() == false){
            jcTH.setEnabled(true);
            jcbTH.setEnabled(true);
        }else{
            jcTH.setEnabled(false);
            jcbTH.setEnabled(false);
        }
    }//GEN-LAST:event_jcTHFocusGained

    private void jcPrecioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcPrecioFocusGained
        //Bloquear Precio
        if(jcTH.isSelected() == false && jcActiva.isSelected() == false && jcDesactiva.isSelected() == false){
            jcPrecio.setEnabled(true);
            jtfPrecio1.setEnabled(true);
            jtfPrecio2.setEnabled(true);
            
        }else{
            jcPrecio.setEnabled(false);
            jtfPrecio1.setEnabled(false);
            jtfPrecio2.setEnabled(false);
        }
    }//GEN-LAST:event_jcPrecioFocusGained

    private void jcActivaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcActivaFocusGained
        //Bloquear Activa
        if(jcTH.isSelected() == false && jcPrecio.isSelected() == false && jcDesactiva.isSelected() == false){
            jcActiva.setEnabled(true);
        }else{
            jcActiva.setEnabled(false);
        }
    }//GEN-LAST:event_jcActivaFocusGained

    private void jcDesactivaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcDesactivaFocusGained
        //Bloquear Desactiva
        if(jcTH.isSelected() == false && jcPrecio.isSelected() == false && jcActiva.isSelected() == false){
            jcDesactiva.setEnabled(true);
        }else{
            jcDesactiva.setEnabled(false);
        }
    }//GEN-LAST:event_jcDesactivaFocusGained

    private void jcPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcPrecioFocusLost
        //Bloquear JTF
        if(jcPrecio.isSelected() == false){
            jtfPrecio1.setEnabled(false);
            jtfPrecio2.setEnabled(false);
        }
    }//GEN-LAST:event_jcPrecioFocusLost

    private void jcTHFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcTHFocusLost
        //Bloquear JCB
        if(jcTH.isSelected() == false){
            jcbTH.setEnabled(false);
        }        
    }//GEN-LAST:event_jcTHFocusLost

    public void limpiar(){
        jcTH.setSelected(false);
        jcTH.setEnabled(true);
        jcPrecio.setSelected(false);
        jcPrecio.setEnabled(true);
        jcActiva.setSelected(false); 
        jcActiva.setEnabled(true);
        jcDesactiva.setSelected(false);
        jcDesactiva.setEnabled(true);
        jtfPrecio1.setText("");
        jtfPrecio1.setEnabled(false);
        jtfPrecio2.setText("");
        jtfPrecio2.setEnabled(false);
        jcbTH.setSelectedIndex(0);
        jcbTH.setEnabled(false);
        DefaultTableModel tb = (DefaultTableModel) jtH.getModel();
        int a = jtH.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCargar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbListar;
    private javax.swing.JCheckBox jcActiva;
    private javax.swing.JCheckBox jcDesactiva;
    private javax.swing.JCheckBox jcPrecio;
    private javax.swing.JCheckBox jcTH;
    private javax.swing.JComboBox<String> jcbTH;
    private javax.swing.JLabel jlCantidad;
    private javax.swing.JTable jtH;
    private javax.swing.JTextField jtfPrecio1;
    private javax.swing.JTextField jtfPrecio2;
    // End of variables declaration//GEN-END:variables
}
