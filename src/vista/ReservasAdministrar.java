
package vista;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import modelo.Conexion;
import modelo.Habitacion;
import modelo.Huesped;
import modelo.Reservas;
import modelo.ReservasData;
import static vista.Principal.reservaHL;
import static vista.Principal.adminHuesped;
import static vista.Principal.jdpPrincipal;
import static vista.Principal.resBusHuesped;
import static vista.Principal.resListar;


public class ReservasAdministrar extends javax.swing.JInternalFrame {


    public ReservasAdministrar() {
        initComponents();
        Conexion con = new Conexion();
        rd = new ReservasData(con);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jbSeleccionarHuesped = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jbBuscarHabitacion = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jtfCPersonas = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtfID = new javax.swing.JTextField();
        jtfPrecio = new javax.swing.JTextField();
        jtfTH = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jtfMaxP = new javax.swing.JTextField();
        jtfNumero = new javax.swing.JTextField();
        jtfDNI = new javax.swing.JTextField();
        jtfDomicilio = new javax.swing.JTextField();
        jtfCelular = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfCorreo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jtfDias = new javax.swing.JTextField();
        jtfPiso = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jtfTotal = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jcbEstado = new javax.swing.JCheckBox();
        jbCrear = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jtfNumeroReserva = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jbBuscarRes = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Aministrar Reservas");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Huesped");
        jLabel1.setToolTipText("");

        jbSeleccionarHuesped.setText("Seleccionar");
        jbSeleccionarHuesped.setToolTipText("");
        jbSeleccionarHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSeleccionarHuespedActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        jLabel3.setText("DNI");

        jLabel4.setText("Domicilio");

        jLabel5.setText("Correo");

        jLabel6.setText("Celular");

        jLabel7.setText("Nombre");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Fecha");

        jtfFEntrada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfFEntradaFocusLost(evt);
            }
        });

        jtfFSalida.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfFSalidaFocusLost(evt);
            }
        });

        jLabel9.setText("Salida");

        jLabel10.setText("Entrada");

        jbBuscarHabitacion.setText("Buscar Habitacion");
        jbBuscarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarHabitacionActionPerformed(evt);
            }
        });

        jLabel11.setText("Cantidad Personas");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Habitacion");

        jLabel13.setText("N°");

        jLabel14.setText("Piso");

        jLabel15.setText("Tipo Habitacion");

        jLabel16.setText("$ por Noche");

        jtfID.setEditable(false);

        jtfPrecio.setEditable(false);

        jtfTH.setEditable(false);

        jLabel17.setText("Max. Personas");

        jtfMaxP.setEditable(false);

        jtfNumero.setEditable(false);

        jtfDNI.setEditable(false);

        jtfDomicilio.setEditable(false);

        jtfCelular.setEditable(false);

        jtfNombre.setEditable(false);

        jtfCorreo.setEditable(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Importe");

        jLabel19.setText("Dias");

        jtfDias.setEditable(false);

        jtfPiso.setEditable(false);

        jLabel20.setText("$ Total");

        jtfTotal.setEditable(false);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Estado");

        jcbEstado.setText("Activa");

        jbCrear.setText("Crear");
        jbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jButton6.setText("Limpiar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jtfNumeroReserva.setEditable(false);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Numero de Reserva");
        jLabel22.setToolTipText("");

        jbBuscarRes.setText("Buscar");
        jbBuscarRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarResActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSeleccionarHuesped))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(7, 7, 7)
                                        .addComponent(jtfNombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfDomicilio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtfCelular)
                                        .addGap(46, 46, 46))
                                    .addComponent(jtfCorreo)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfNumeroReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbBuscarRes))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel21)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jcbEstado)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbCrear)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbModificar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbEliminar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton6)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfCPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbBuscarHabitacion))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(43, 43, 43)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtfFEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtfFSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel19)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtfDias, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtfPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtfTH, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtfMaxP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 32, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNumeroReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jbBuscarRes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jbSeleccionarHuesped))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtfFEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfFSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel19)
                    .addComponent(jtfDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBuscarHabitacion)
                    .addComponent(jLabel11)
                    .addComponent(jtfCPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jtfTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jtfMaxP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCrear)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar)
                    .addComponent(jButton6))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ReservasData rd;
    LocalDate hoy = LocalDate.now();
    LocalDate fEntrada = null;
    LocalDate fEnt = null;
    LocalDate fSalida = null;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("ddMMyyyy");
    public Huesped huesped = null;
    public Habitacion habitacion = null;
    public Reservas reserva = null;
    boolean block = true;
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //Limpiar
        jtfNumeroReserva.setText("");
        
        jtfID.setText("");
        jtfDNI.setText("");
        jtfNombre.setText("");
        jtfDomicilio.setText("");
        jtfCelular.setText("");
        jtfCorreo.setText("");
        
        jtfFEntrada.setText("");
        jtfFSalida.setText("");
        jtfDias.setText("");
        
        jtfCPersonas.setText("");
        jtfNumero.setText("");
        jtfPiso.setText("");
        jtfTH.setText("");
        jtfMaxP.setText("");
        
        jtfPrecio.setText("");
        jtfTotal.setText("");
        
        jcbEstado.setSelected(false);
        
        block = true;
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jbSeleccionarHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeleccionarHuespedActionPerformed
        //seleccionar huesped
        if(resBusHuesped == null){
            resBusHuesped = new ReservaHuespedBuscar();
            jdpPrincipal.add(resBusHuesped);
            resBusHuesped.show();
        }else{
            resBusHuesped.dispose();
            resBusHuesped = new ReservaHuespedBuscar();
            jdpPrincipal.add(resBusHuesped);
            resBusHuesped.show();
        } 
    }//GEN-LAST:event_jbSeleccionarHuespedActionPerformed

    private void jtfFEntradaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfFEntradaFocusLost
        //Calcular dias focuslost fecha entrada
        try{
            String fe = jtfFEntrada.getText();
            fEntrada = LocalDate.parse(fe, formatter);
            
            if(fEntrada.isAfter(hoy)||fEntrada.isEqual(hoy)){
                jtfFEntrada.setText(fEntrada.format(formatter2));
            }else{
                jtfFEntrada.setText("");
                JOptionPane.showMessageDialog(null, "No puede ingresar fechas anteriores a hoy", "Fecha", JOptionPane.WARNING_MESSAGE);
            }
        }catch(DateTimeParseException e){
            JOptionPane.showMessageDialog(null, "Ingrese una fecha correcta", "Fecha", JOptionPane.WARNING_MESSAGE);
        }    
    }//GEN-LAST:event_jtfFEntradaFocusLost

    private void jtfFSalidaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfFSalidaFocusLost
        //Calcular dias focuslost fecha entrada
        try{
            String fs = jtfFSalida.getText();
            fSalida = LocalDate.parse(fs, formatter);
            
            if(fSalida.isAfter(hoy)||fSalida.isEqual(hoy)){
                jtfFSalida.setText(fSalida.format(formatter2));
            }else{
                jtfFSalida.setText("");
                JOptionPane.showMessageDialog(null, "No puede ingresar fechas anteriores a hoy", "Fecha", JOptionPane.WARNING_MESSAGE);
            }
        }catch(DateTimeParseException e){
            JOptionPane.showMessageDialog(null, "Ingrese una fecha correcta", "Fecha", JOptionPane.WARNING_MESSAGE);
        }
        Period periodo = Period.between(fEntrada, fSalida);
        
        jtfDias.setText(periodo.getDays()+"");
    }//GEN-LAST:event_jtfFSalidaFocusLost

    private void jbBuscarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarHabitacionActionPerformed
        //Buscar habitacion
        if(reservaHL == null){
            reservaHL = new ReservaHabitacionListar();
            jdpPrincipal.add(reservaHL);
            reservaHL.show();
        }else{
            reservaHL.dispose();
            reservaHL = new ReservaHabitacionListar();
            jdpPrincipal.add(reservaHL);
            reservaHL.show();
        } 
    }//GEN-LAST:event_jbBuscarHabitacionActionPerformed

    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed
        //Crear reserva
        if(block){
            reserva = new Reservas();
            reserva.setCantidadPersonas(Integer.parseInt(jtfCPersonas.getText()));
            reserva.setFechaEntrada(fEntrada);
            reserva.setFechaSalida(fSalida);
            reserva.setCantidadDias(Integer.parseInt(jtfDias.getText()));

            if(jcbEstado.isSelected()){
                reserva.setEstadoReserva(1);
            }else{
                reserva.setEstadoReserva(0);
            }

            reserva.setHuesped(huesped);
            reserva.setHabitacion(habitacion);

            rd.agregarReserva(reserva);

            jtfNumeroReserva.setText(reserva.getNumeroReserva()+"");
            
            block = false;
        }
    }//GEN-LAST:event_jbCrearActionPerformed

    private void jbBuscarResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarResActionPerformed
        //Llamar a reserva listar
        if(resListar == null){
            resListar = new ReservasListar();
            jdpPrincipal.add(resListar);
            resListar.show();
        }else{
            resListar.dispose();
            resListar = new ReservasListar();
            jdpPrincipal.add(resListar);
            resListar.show();
        }
    }//GEN-LAST:event_jbBuscarResActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        //Eliminar reserva
        if(!jtfNumeroReserva.getText().isEmpty()){
            rd.borrarReserva(Integer.parseInt(jtfNumeroReserva.getText()));
           
            jtfNumeroReserva.setText("");
        
            jtfID.setText("");
            jtfDNI.setText("");
            jtfNombre.setText("");
            jtfDomicilio.setText("");
            jtfCelular.setText("");
            jtfCorreo.setText("");

            jtfFEntrada.setText("");
            jtfFSalida.setText("");
            jtfDias.setText("");

            jtfCPersonas.setText("");
            jtfNumero.setText("");
            jtfPiso.setText("");
            jtfTH.setText("");
            jtfMaxP.setText("");

            jtfPrecio.setText("");
            jtfTotal.setText("");

            jcbEstado.setSelected(false);

            block = true;
        }
        
        
        
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        //Modificar reserva
        if(!jtfNumeroReserva.getText().isEmpty()){    
            reserva.setNumeroReserva(Integer.parseInt(jtfNumeroReserva.getText()));
            reserva.setCantidadPersonas(Integer.parseInt(jtfCPersonas.getText()));
            reserva.setFechaEntrada(LocalDate.parse(jtfFEntrada.getText(), formatter));
            reserva.setFechaSalida(LocalDate.parse(jtfFSalida.getText(), formatter));
            reserva.setCantidadDias(Integer.parseInt(jtfDias.getText()));

            if(jcbEstado.isSelected()){
                reserva.setEstadoReserva(1);
            }else{
                reserva.setEstadoReserva(0);
            }

            reserva.setHuesped(huesped);
            reserva.setHabitacion(habitacion);

            rd.modificarReserva(reserva);

            block = false;
        }
    }//GEN-LAST:event_jbModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton jbBuscarHabitacion;
    private javax.swing.JButton jbBuscarRes;
    private javax.swing.JButton jbCrear;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSeleccionarHuesped;
    public javax.swing.JCheckBox jcbEstado;
    public javax.swing.JTextField jtfCPersonas;
    public javax.swing.JTextField jtfCelular;
    public javax.swing.JTextField jtfCorreo;
    public javax.swing.JTextField jtfDNI;
    public javax.swing.JTextField jtfDias;
    public javax.swing.JTextField jtfDomicilio;
    public javax.swing.JTextField jtfFEntrada;
    public javax.swing.JTextField jtfFSalida;
    public javax.swing.JTextField jtfID;
    public javax.swing.JTextField jtfMaxP;
    public javax.swing.JTextField jtfNombre;
    public javax.swing.JTextField jtfNumero;
    public javax.swing.JTextField jtfNumeroReserva;
    public javax.swing.JTextField jtfPiso;
    public javax.swing.JTextField jtfPrecio;
    public javax.swing.JTextField jtfTH;
    public javax.swing.JTextField jtfTotal;
    // End of variables declaration//GEN-END:variables
}
