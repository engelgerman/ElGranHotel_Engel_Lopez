
package vista;

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
import modelo.Huesped;
import modelo.HuespedData;
import modelo.Reservas;
import modelo.ReservasData;
import static vista.Principal.adminHuesped;
import static vista.Principal.jdpPrincipal;
import static vista.Principal.resListar;
import static vista.Principal.reservaAdmin;


public class HuespedInforme extends javax.swing.JInternalFrame {


    public HuespedInforme() {
        initComponents();
        Conexion con = new Conexion();
        hd = new HuespedData(con);
        rd = new ReservasData(con);
        habd = new HabitacionData(con);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtReservas = new javax.swing.JTable();
        jbListar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtfDNIHuesped = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Buscar Reservas");

        jtReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N. Reserva", "C. Personas", "F. Entrada", "F. Salida", "C. Dias", "Estado", "Huesped", "N. Habitacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtReservas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtReservas);
        if (jtReservas.getColumnModel().getColumnCount() > 0) {
            jtReservas.getColumnModel().getColumn(6).setResizable(false);
        }

        jbListar.setText("Listar");
        jbListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jLabel4.setText("DNI Huesped");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfDNIHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jbListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbLimpiar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfDNIHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbListar)
                        .addComponent(jbLimpiar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    Validaciones val = new Validaciones();
    ReservasData rd;
    HuespedData hd;
    HabitacionData habd;
    Huesped huesped;
    Reservas reserva;
    Habitacion hab;
    List<Reservas> reservas = new ArrayList<>();
    String[] registro = new String[8];
    String[] nombreColumnas = {"N. Reserva", "C. Personas", "F. Entrada", "F. Salida", "C. Dias", "Estado", "Huesped", "N. Habitacion"};
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("ddMMyyyy");
    
    
    private void jbListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarActionPerformed
        //Listar Huesped
        DefaultTableModel tb = (DefaultTableModel) jtReservas.getModel();
        int a = jtReservas.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
                
        DefaultTableModel modelo = new DefaultTableModel(null, nombreColumnas);
        
        if(val.esDNI(jtfDNIHuesped.getText())){
            
            huesped = hd.buscarHuespedDNI(Integer.parseInt(jtfDNIHuesped.getText()));
                       
            reservas = rd.buscarPorHuesped(huesped.getIdHuesped());
                    
            for(int i = 0; i < reservas.size(); i++){
                    reserva = reservas.get(i);
                    registro[0] = reserva.getNumeroReserva()+"";
                    registro[1] = reserva.getCantidadPersonas()+"";
                    registro[2] = reserva.getFechaEntrada().format(formatter);
                    registro[3] = reserva.getFechaSalida().format(formatter);
                    registro[4] = reserva.getCantidadDias()+"";
                    registro[5] = reserva.getEstadoReserva()+"";
                    registro[6] = reserva.getHuesped().getIdHuesped()+"";
                    registro[7] = reserva.getHabitacion().getNumeroHabitacion()+"";
            
                    modelo.addRow(registro);
            }
            jtReservas.setModel(modelo);
        }
    }//GEN-LAST:event_jbListarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        //Limpiar
        jtfDNIHuesped.setText(null);
        DefaultTableModel tb = (DefaultTableModel) jtReservas.getModel();
        int a = jtReservas.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
        
    }//GEN-LAST:event_jbLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbListar;
    private javax.swing.JTable jtReservas;
    private javax.swing.JTextField jtfDNIHuesped;
    // End of variables declaration//GEN-END:variables
}
