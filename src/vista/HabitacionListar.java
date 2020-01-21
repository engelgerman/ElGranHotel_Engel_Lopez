
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
        jcbTH.addItem("Todos");
        for(int i = 0; i < tipoH.size(); i++){
            jcbTH.addItem(tipoH.get(i).getNombre());
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtH = new javax.swing.JTable();
        jbListar = new javax.swing.JButton();
        jbCargar = new javax.swing.JButton();
        jcbTH = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jlCantidad = new javax.swing.JLabel();

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

        jLabel1.setText("Tipo de Habitacion");
        jLabel1.setToolTipText("");

        jlCantidad.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jbListar)
                                .addGap(18, 18, 18)
                                .addComponent(jbCargar))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jcbTH, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlCantidad)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jlCantidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbListar)
                    .addComponent(jbCargar))
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
        
        if(jcbTH.getSelectedIndex() == 0){
            hab = hd.listarHabitacion();
            String[] nombreColumnas = {"N. Habitacion", "Piso", "Tipo de Habitacion", "Estado"};
            DefaultTableModel modelo = new DefaultTableModel(null, nombreColumnas);

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
        }else{
            TipoHabitacion tHabitacion = new TipoHabitacion();
            tHabitacion = tipoH.get(jcbTH.getSelectedIndex()-1);
            hab = hd.buscarPorTH(tHabitacion);
            
            String[] nombreColumnas = {"N. Habitacion", "Piso", "Tipo de Habitacion", "Estado"};
            DefaultTableModel modelo = new DefaultTableModel(null, nombreColumnas);

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


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCargar;
    private javax.swing.JButton jbListar;
    private javax.swing.JComboBox<String> jcbTH;
    private javax.swing.JLabel jlCantidad;
    private javax.swing.JTable jtH;
    // End of variables declaration//GEN-END:variables
}
