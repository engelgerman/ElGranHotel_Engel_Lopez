
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


public class ReservasListar extends javax.swing.JInternalFrame {


    public ReservasListar() {
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
        jtfNReserva = new javax.swing.JTextField();
        jtfFEntrada = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter cpf = new javax.swing.text.MaskFormatter("##-##-####");
            jtfFEntrada = new javax.swing.JFormattedTextField(cpf);
        }catch(Exception e){

        }
        jtfFSalida = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter cpf = new javax.swing.text.MaskFormatter("##-##-####");
            jtfFSalida = new javax.swing.JFormattedTextField(cpf);
        }catch(Exception e){

        }
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbLimpiar = new javax.swing.JButton();
        jbSeleccionar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtfIDHuesped = new javax.swing.JTextField();
        jcbActiva = new javax.swing.JCheckBox();
        jcbDesactiva = new javax.swing.JCheckBox();
        jcbFecha = new javax.swing.JCheckBox();

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

        jtfNReserva.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfNReservaFocusGained(evt);
            }
        });

        jtfFEntrada.setEnabled(false);
        jtfFEntrada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfFEntradaFocusLost(evt);
            }
        });

        jtfFSalida.setEnabled(false);
        jtfFSalida.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfFSalidaFocusLost(evt);
            }
        });

        jLabel6.setText("N. Reserva");

        jLabel1.setText("F. Entrada");

        jLabel2.setText("F. Salida");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Filtrar Habitacion:");

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

        jLabel4.setText("ID Huesped");

        jtfIDHuesped.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfIDHuespedFocusGained(evt);
            }
        });

        jcbActiva.setText("Activa");
        jcbActiva.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcbActivaFocusGained(evt);
            }
        });

        jcbDesactiva.setText("Desactiva");
        jcbDesactiva.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcbDesactivaFocusGained(evt);
            }
        });

        jcbFecha.setText("Fecha");
        jcbFecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcbFechaFocusGained(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jbListar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbSeleccionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jcbActiva)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbDesactiva))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(4, 4, 4)
                                        .addComponent(jtfNReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfIDHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jcbFecha)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel1)
                                        .addGap(3, 3, 3)
                                        .addComponent(jtfFEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfFSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfNReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jtfIDHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfFEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jtfFSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbActiva)
                    .addComponent(jcbDesactiva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbListar)
                    .addComponent(jbLimpiar)
                    .addComponent(jbSeleccionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
    LocalDate fEntrada;
    LocalDate fSalida;
    LocalDate hoy = LocalDate.now();    
    
    private void jbListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarActionPerformed
        //Listar Huesped
        DefaultTableModel tb = (DefaultTableModel) jtReservas.getModel();
        int a = jtReservas.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
                
        DefaultTableModel modelo = new DefaultTableModel(null, nombreColumnas);
        
        int indice = 0;
        
        if(jtfNReserva.getText().isEmpty()){
            
        }else{
            indice = 1;
        }
        
        if(jtfIDHuesped.getText().isEmpty()){
            
        }else{
            indice = 2;
        }
        
        if(jcbFecha.isSelected()){
            indice = 3;
        }
        
        if(jcbActiva.isSelected()){
            indice = 4;
        }
        
        if(jcbDesactiva.isSelected()){
            indice = 5;
        }
        
        
        switch(indice){
            
            case 1:
                if(val.esNumero(jtfNReserva.getText())){
                    reserva = rd.buscarPorNReserva(Integer.parseInt(jtfNReserva.getText()));
                    
                    registro[0] = reserva.getNumeroReserva()+"";
                    registro[1] = reserva.getCantidadPersonas()+"";
                    registro[2] = reserva.getFechaEntrada().format(formatter);
                    registro[3] = reserva.getFechaSalida().format(formatter);
                    registro[4] = reserva.getCantidadDias()+"";
                    registro[5] = reserva.getEstadoReserva()+"";
                    registro[6] = reserva.getHuesped().getIdHuesped()+"";
                    registro[7] = reserva.getHabitacion().getNumeroHabitacion()+"";
                    
                    modelo.addRow(registro);
                    jtReservas.setModel(modelo);
                }
                break;
                
            case 2:
                reservas = rd.buscarPorHuesped(Integer.parseInt(jtfIDHuesped.getText()));
           
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
                break;
                
            case 3:
                reservas = rd.buscarPorFecha(fEntrada, fSalida);

                for(int e = 0; e < reservas.size(); e++){
                    reserva = reservas.get(e);
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
                break;
               
            case 4:
                reservas = rd.buscarPorEstado(1);

                for(int e = 0; e < reservas.size(); e++){
                    reserva = reservas.get(e);
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
                break;    
                
            case 5:
                reservas = rd.buscarPorEstado(0);

                for(int e = 0; e < reservas.size(); e++){
                    reserva = reservas.get(e);
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
                break;        
                
            default:
                reservas = rd.listarReservas();
                
                for(int e = 0; e < reservas.size(); e++){
                    reserva = reservas.get(e);
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
        jtfNReserva.setText(null);
        jtfFEntrada.setText(null);
        jtfFEntrada.setEnabled(false);
        jtfFSalida.setText(null);
        jtfFSalida.setEnabled(false);
        jtfIDHuesped.setText(null);
        jcbFecha.setSelected(false);
        jcbFecha.setEnabled(true);
        jcbActiva.setSelected(false);
        jcbActiva.setEnabled(true);
        jcbDesactiva.setSelected(false);
        jcbDesactiva.setEnabled(true);
        DefaultTableModel tb = (DefaultTableModel) jtReservas.getModel();
        int a = jtReservas.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
        
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeleccionarActionPerformed
        //Seleccionar
        Reservas reserva1 = new Reservas();
        
        int fila = jtReservas.getSelectedRow();
        if(fila != -1){
            reserva1.setNumeroReserva(Integer.parseInt((String)jtReservas.getValueAt(fila, 0)));
            reserva1.setCantidadPersonas(Integer.parseInt((String)(String)jtReservas.getValueAt(fila, 1)));
            reserva1.setFechaEntrada(LocalDate.parse((String)jtReservas.getValueAt(fila, 2),formatter));
            reserva1.setFechaSalida(LocalDate.parse((String)jtReservas.getValueAt(fila, 3),formatter));
            reserva1.setCantidadDias(Integer.parseInt((String)jtReservas.getValueAt(fila, 4)));
            reserva1.setEstadoReserva(Integer.parseInt((String)jtReservas.getValueAt(fila, 5)));
            huesped = hd.buscarHuespedID(Integer.parseInt((String)jtReservas.getValueAt(fila, 6)));
            reserva1.setHuesped(huesped);
            hab = habd.buscarHabitacion(Integer.parseInt((String)jtReservas.getValueAt(fila, 7)));
            reserva1.setHabitacion(hab);
                
            if(reservaAdmin == null){
            reservaAdmin = new ReservasAdministrar();
            jdpPrincipal.add(reservaAdmin);
            reservaAdmin.show();
        }else{
            reservaAdmin.dispose();
            reservaAdmin = new ReservasAdministrar();
            jdpPrincipal.add(reservaAdmin);
            reservaAdmin.show();
        }
            
            reservaAdmin.reserva = reserva1;
            reservaAdmin.huesped = reserva1.getHuesped();
            reservaAdmin.habitacion = reserva1.getHabitacion();
                       
            reservaAdmin.jtfNumeroReserva.setText(reserva1.getNumeroReserva()+"");
            reservaAdmin.jtfCPersonas.setText(reserva1.getCantidadPersonas()+"");
            reservaAdmin.jtfFEntrada.setText(reserva1.getFechaEntrada().format(formatter2));
            reservaAdmin.jtfFSalida.setText(reserva1.getFechaSalida().format(formatter2));
            reservaAdmin.jtfDias.setText(reserva1.getCantidadDias()+"");
            if(reserva1.getEstadoReserva() == 1){
                reservaAdmin.jcbEstado.setSelected(true);
            }else{
                reservaAdmin.jcbEstado.setSelected(false);
            }
            
            reservaAdmin.jtfID.setText(reserva1.getHuesped().getIdHuesped()+"");
            reservaAdmin.jtfNombre.setText(reserva1.getHuesped().getNombre());
            reservaAdmin.jtfDNI.setText(reserva1.getHuesped().getDni()+"");
            reservaAdmin.jtfDomicilio.setText(reserva1.getHuesped().getDomicilio());
            reservaAdmin.jtfCelular.setText(reserva1.getHuesped().getCelular()+"");
            reservaAdmin.jtfCorreo.setText(reserva1.getHuesped().getCorreo());
            
            reservaAdmin.jtfNumero.setText(reserva1.getHabitacion().getNumeroHabitacion()+"");
            reservaAdmin.jtfPiso.setText(reserva1.getHabitacion().getPiso()+"");
            reservaAdmin.jtfTH.setText(reserva1.getHabitacion().getTipoHabitacion().getNombre());
            reservaAdmin.jtfMaxP.setText(reserva1.getHabitacion().getTipoHabitacion().getCantidadPersonas()+"");
            reservaAdmin.jtfPrecio.setText(reserva1.getHabitacion().getTipoHabitacion().getPrecio()+"");
            
            reservaAdmin.jtfTotal.setText((reserva1.getCantidadDias() * reserva1.getHabitacion().getTipoHabitacion().getPrecio())+"");
            
            resListar.dispose();
                   
        }else{
            JOptionPane.showMessageDialog(null, "No se selecciono ningun huesped", "Seleccionar", JOptionPane.WARNING_MESSAGE);
        }               
    }//GEN-LAST:event_jbSeleccionarActionPerformed

    private void jtfNReservaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfNReservaFocusGained
        //Bloquear NReservas
        if(jtfIDHuesped.getText().isEmpty() && jcbFecha.isSelected() == false && jcbActiva.isSelected() == false && jcbDesactiva.isSelected() == false){
            jtfNReserva.setEditable(true);
        }else{
            jtfNReserva.setEditable(false);
        }      
    }//GEN-LAST:event_jtfNReservaFocusGained

    private void jtfIDHuespedFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfIDHuespedFocusGained
        //Bloquear IDHuesped
        if(jtfNReserva.getText().isEmpty() && jcbFecha.isSelected() == false && jcbActiva.isSelected() == false && jcbDesactiva.isSelected() == false){
            jtfIDHuesped.setEditable(true);
        }else{
            jtfIDHuesped.setEditable(false);
        }
    }//GEN-LAST:event_jtfIDHuespedFocusGained

    private void jcbFechaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbFechaFocusGained
        //Bloquear Fecha
        if(jtfNReserva.getText().isEmpty() && jtfIDHuesped.getText().isEmpty() && jcbActiva.isSelected() == false && jcbDesactiva.isSelected() == false){
            jcbFecha.setEnabled(true);
            jtfFEntrada.setEnabled(true);
            jtfFSalida.setEnabled(true);
        }else{
            jcbFecha.setEnabled(false);
        }
    }//GEN-LAST:event_jcbFechaFocusGained

    private void jcbActivaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbActivaFocusGained
        //Bloquear Activa
        if(jtfNReserva.getText().isEmpty() && jtfIDHuesped.getText().isEmpty() && jcbFecha.isSelected() == false && jcbDesactiva.isSelected() == false){
            jcbActiva.setEnabled(true);
        }else{
            jcbActiva.setEnabled(false);
        }
    }//GEN-LAST:event_jcbActivaFocusGained

    private void jcbDesactivaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbDesactivaFocusGained
        //Bloquear Desactiva
        if(jtfNReserva.getText().isEmpty() && jtfIDHuesped.getText().isEmpty() && jcbActiva.isSelected() == false && jcbFecha.isSelected() == false){
            jcbDesactiva.setEnabled(true);
        }else{
            jcbDesactiva.setEnabled(false);
        }
    }//GEN-LAST:event_jcbDesactivaFocusGained

    private void jtfFEntradaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfFEntradaFocusLost
        //Formato FEntrada
        try{
            String fe = jtfFEntrada.getText();
            fEntrada = LocalDate.parse(fe, formatter);

            jtfFEntrada.setText(fEntrada.format(formatter2));

        }catch(DateTimeParseException e){
            JOptionPane.showMessageDialog(null, "Ingrese una fecha correcta", "Fecha", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jtfFEntradaFocusLost

    private void jtfFSalidaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfFSalidaFocusLost
        //Formato FSalida
        try{
            String fe = jtfFSalida.getText();
            fSalida = LocalDate.parse(fe, formatter);
            
            if(fSalida.isAfter(fEntrada)){
                jtfFSalida.setText(fSalida.format(formatter2));
            }else{
                jtfFSalida.setText("");
                JOptionPane.showMessageDialog(null, "No puede ingresar fechas anteriores a fecha de entrada", "Fecha", JOptionPane.WARNING_MESSAGE);
            }
        }catch(DateTimeParseException e){
            JOptionPane.showMessageDialog(null, "Ingrese una fecha correcta", "Fecha", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jtfFSalidaFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbListar;
    private javax.swing.JButton jbSeleccionar;
    private javax.swing.JCheckBox jcbActiva;
    private javax.swing.JCheckBox jcbDesactiva;
    private javax.swing.JCheckBox jcbFecha;
    private javax.swing.JTable jtReservas;
    private javax.swing.JTextField jtfFEntrada;
    private javax.swing.JTextField jtfFSalida;
    private javax.swing.JTextField jtfIDHuesped;
    private javax.swing.JTextField jtfNReserva;
    // End of variables declaration//GEN-END:variables
}
