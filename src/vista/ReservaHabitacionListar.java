
package vista;

import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Habitacion;
import modelo.HabitacionData;
import modelo.Reservas;
import modelo.ReservasData;
import modelo.TipoHabitacion;
import modelo.TipoHabitacionData;
import static vista.Principal.adminH;
import static vista.Principal.jdpPrincipal;
import static vista.Principal.reservaAdmin;



public class ReservaHabitacionListar extends javax.swing.JInternalFrame {


    
    public ReservaHabitacionListar() {
        initComponents();
        Conexion con = new Conexion();
        hd = new HabitacionData(con);
        thd = new TipoHabitacionData(con);
        resData = new ReservasData(con);
        
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
    Habitacion hu;
    TipoHabitacionData thd;
    TipoHabitacion th;
    ReservasData resData;
    Reservas re;
    List<TipoHabitacion> tipoH;
    List<Habitacion> hab = new ArrayList<>();
    List<Habitacion> habUsadas = new ArrayList<>();
    List<Reservas> res = new ArrayList<>();
    String[] registro = new String[4];
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    
    private void jbListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarActionPerformed
        //Listar Habitacion
        try{
            DefaultTableModel tb = (DefaultTableModel) jtH.getModel();
            int a = jtH.getRowCount()-1;
            for (int i = a; i >= 0; i--) {          
            tb.removeRow(tb.getRowCount()-1);
            }

            res = resData.buscarPorFecha(LocalDate.parse(reservaAdmin.jtfFEntrada.getText(), formatter), LocalDate.parse(reservaAdmin.jtfFSalida.getText(), formatter));

            for(int i = 0; i < res.size(); i++){
               hu = res.get(i).getHabitacion();

               habUsadas.add(hu);
            } 

            if(jcbTH.getSelectedIndex() == 0){
                hab = hd.listarHabitacion();

                for(int i = 0; i < habUsadas.size(); i++){
                    int numHab = habUsadas.get(i).getNumeroHabitacion();

                    for(int e = 0; e < hab.size(); e++){
                        if(hab.get(e).getNumeroHabitacion() == numHab){
                            hab.remove(e);
                        }
                    }
                }


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

                for(int i = 0; i < habUsadas.size(); i++){
                    int numHab = habUsadas.get(i).getNumeroHabitacion();

                    for(int e = 0; e < hab.size(); e++){
                        if(hab.get(e).getNumeroHabitacion() == numHab){
                            hab.remove(e);
                        }
                    }
                }    

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
        }catch(DateTimeParseException e){
            JOptionPane.showMessageDialog(null, "Debe agregar fecha de entrada y de salida", "Fecha", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbListarActionPerformed

    private void jbCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarActionPerformed
        //Cargar habitacion
        int fila = jtH.getSelectedRow();
        if(fila >= 0){
            h = hd.buscarHabitacion(Integer.parseInt((String)jtH.getValueAt(fila, 0)));

            reservaAdmin.habitacion = h;
            
            reservaAdmin.jtfNumero.setText(h.getNumeroHabitacion()+"");
            reservaAdmin.jtfPiso.setText(h.getPiso()+"");
            th = h.getTipoHabitacion();
            reservaAdmin.jtfTH.setText(th.getNombre());
            reservaAdmin.jtfMaxP.setText(th.getCantidadPersonas()+"");
            reservaAdmin.jtfPrecio.setText(th.getPrecio()+"");
            
            reservaAdmin.jtfTotal.setText((Double.parseDouble(reservaAdmin.jtfDias.getText())*th.getPrecio())+"");

            Principal.reservaHL.dispose();
            
            
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
