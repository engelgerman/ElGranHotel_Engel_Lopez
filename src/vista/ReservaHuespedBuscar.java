
package vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Huesped;
import modelo.HuespedData;
import static vista.Principal.adminHuesped;
import static vista.Principal.jdpPrincipal;
import static vista.Principal.resBusHuesped;
import static vista.Principal.reservaAdmin;


public class ReservaHuespedBuscar extends javax.swing.JInternalFrame {


    public ReservaHuespedBuscar() {
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
        jtfID = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfDNI = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbLimpiar = new javax.swing.JButton();
        jbSeleccionar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Buscar Huesped");

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

        jtfID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfIDFocusGained(evt);
            }
        });

        jtfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfNombreFocusGained(evt);
            }
        });

        jtfDNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfDNIFocusGained(evt);
            }
        });

        jLabel6.setText("ID");

        jLabel1.setText("Nombre");

        jLabel2.setText("DNI");

        jLabel3.setText("Filtrar Huesped:");

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbSeleccionar.setText("Seleccionar");
        jbSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSeleccionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbLimpiar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbListar)
                        .addComponent(jbLimpiar)
                        .addComponent(jbSeleccionar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    Validaciones val = new Validaciones();
    HuespedData hd;
    Huesped huesped;
    List<Huesped> huespedes = new ArrayList<>();
    String[] registro = new String[6];
    String[] nombreColumnas = {"ID", "Nombre", "DNI", "Domicilio", "Correo", "Celular"};
        
        
    
    private void jbListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarActionPerformed
        //Listar Huesped
        DefaultTableModel tb = (DefaultTableModel) jtHuesped.getModel();
        int a = jtHuesped.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
                
        DefaultTableModel modelo = new DefaultTableModel(null, nombreColumnas);
        
        int indice = 0;
        
        if(jtfID.getText().isEmpty()){
            
        }else{
            indice = 1;
        }
        
        if(jtfNombre.getText().isEmpty()){
            
        }else{
            indice = 2;
        }
        
        if(jtfDNI.getText().isEmpty()){
            
        }else{
            indice = 3;
        }
        
        
        switch(indice){
            
            case 1:
                if(val.esNumero(jtfID.getText())){
                    huesped = hd.buscarHuespedID(Integer.parseInt(jtfID.getText()));
                    registro[0] = huesped.getIdHuesped()+"";
                    registro[1] = huesped.getNombre();
                    registro[2] = huesped.getDni()+"";
                    registro[3] = huesped.getDomicilio();
                    registro[4] = huesped.getCorreo();
                    registro[5] = huesped.getCelular();
                
                    modelo.addRow(registro);
                    jtHuesped.setModel(modelo);
                }
                break;
                
            case 2:
                huespedes = hd.buscarHuespedNombre(jtfNombre.getText());
            
                int o;
                for(o = 0; o < huespedes.size(); o++){
                    huesped = huespedes.get(o);
                    registro[0] = huesped.getIdHuesped()+"";
                    registro[1] = huesped.getNombre();
                    registro[2] = huesped.getDni()+"";
                    registro[3] = huesped.getDomicilio();
                    registro[4] = huesped.getCorreo();
                    registro[5] = huesped.getCelular();
            
                    modelo.addRow(registro);
                }
        
                jtHuesped.setModel(modelo);
                break;
                
            case 3:
                if(val.esDNI(jtfDNI.getText())){
                    huesped = hd.buscarHuespedDNI(Integer.parseInt(jtfDNI.getText()));
                    registro[0] = huesped.getIdHuesped()+"";
                    registro[1] = huesped.getNombre();
                    registro[2] = huesped.getDni()+"";
                    registro[3] = huesped.getDomicilio();
                    registro[4] = huesped.getCorreo();
                    registro[5] = huesped.getCelular();
                
                    modelo.addRow(registro);
                    jtHuesped.setModel(modelo);
                }
                break;
                
            default:
                huespedes = hd.listarHuesped();
            
                int e;
                for(e = 0; e < huespedes.size(); e++){
                    huesped = huespedes.get(e);
                    registro[0] = huesped.getIdHuesped()+"";
                    registro[1] = huesped.getNombre();
                    registro[2] = huesped.getDni()+"";
                    registro[3] = huesped.getDomicilio();
                    registro[4] = huesped.getCorreo();
                    registro[5] = huesped.getCelular();
            
                    modelo.addRow(registro);
                }
        
                jtHuesped.setModel(modelo); 
        }
        
    }//GEN-LAST:event_jbListarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        //Limpiar
        jtfID.setText(null);
        jtfNombre.setText(null);
        jtfDNI.setText(null);
        DefaultTableModel tb = (DefaultTableModel) jtHuesped.getModel();
        int a = jtHuesped.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
        
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeleccionarActionPerformed
        //Seleccionar
        Huesped huesped1 = new Huesped();
        int fila = jtHuesped.getSelectedRow();
        if(fila != -1){
            huesped1.setIdHuesped(Integer.parseInt((String)jtHuesped.getValueAt(fila, 0)));
            huesped1.setNombre((String)jtHuesped.getValueAt(fila, 1));
            huesped1.setDni(Integer.parseInt((String)jtHuesped.getValueAt(fila, 2)));
            huesped1.setDomicilio((String)jtHuesped.getValueAt(fila, 3));
            huesped1.setCorreo((String)jtHuesped.getValueAt(fila, 4));
            huesped1.setCelular((String)jtHuesped.getValueAt(fila, 5));
        }else{
            JOptionPane.showMessageDialog(null, "No se selecciono ningun huesped", "Seleccionar", JOptionPane.WARNING_MESSAGE);
        }
        
        reservaAdmin.jtfID.setText(huesped1.getIdHuesped()+"");
        reservaAdmin.jtfNombre.setText(huesped1.getNombre());
        reservaAdmin.jtfDNI.setText(huesped1.getDni()+"");
        reservaAdmin.jtfDomicilio.setText(huesped1.getDomicilio());
        reservaAdmin.jtfCorreo.setText(huesped1.getCorreo());
        reservaAdmin.jtfCelular.setText(huesped1.getCelular());
       
        reservaAdmin.huesped = huesped1;
        
        resBusHuesped.dispose();
                
    }//GEN-LAST:event_jbSeleccionarActionPerformed

    private void jtfIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfIDFocusGained
        //Bloquear nombre y dni
        if(jtfNombre.getText().isEmpty() && jtfDNI.getText().isEmpty()){
            jtfID.setEditable(true);
        }else{
            jtfID.setEditable(false);
        }      
    }//GEN-LAST:event_jtfIDFocusGained

    private void jtfNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfNombreFocusGained
        //Bloquear id y dni
        if(jtfID.getText().isEmpty() && jtfDNI.getText().isEmpty()){
            jtfNombre.setEditable(true);
        }else{
            jtfNombre.setEditable(false);
        } 
    }//GEN-LAST:event_jtfNombreFocusGained

    private void jtfDNIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfDNIFocusGained
        //Bloquear id y nombre
        if(jtfNombre.getText().isEmpty() && jtfID.getText().isEmpty()){
            jtfDNI.setEditable(true);
        }else{
            jtfDNI.setEditable(false);
        } 
    }//GEN-LAST:event_jtfDNIFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbListar;
    private javax.swing.JButton jbSeleccionar;
    private javax.swing.JTable jtHuesped;
    private javax.swing.JTextField jtfDNI;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
