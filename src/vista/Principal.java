
package vista;

import java.awt.Component;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;


public class Principal extends javax.swing.JFrame {


    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPrincipal = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jmSalir = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmHuesped = new javax.swing.JMenu();
        jmiAdministrarHuesped = new javax.swing.JMenuItem();
        jmiHuespedBuscar = new javax.swing.JMenuItem();
        jmiInforme = new javax.swing.JMenuItem();
        jmTipoHabitacion = new javax.swing.JMenu();
        jmiAdministrarTH = new javax.swing.JMenuItem();
        jmiTHListar = new javax.swing.JMenuItem();
        jmiCambiarPrecio = new javax.swing.JMenuItem();
        jmHabitacion = new javax.swing.JMenu();
        jmiAdministrarHabitacion = new javax.swing.JMenuItem();
        jmiHabitacionListar = new javax.swing.JMenuItem();
        jmReservas = new javax.swing.JMenu();
        jmiAdministrarReservas = new javax.swing.JMenuItem();
        jmiReservasListar = new javax.swing.JMenuItem();
        jmiCICO = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdpPrincipal.setPreferredSize(new java.awt.Dimension(1147, 500));

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1127, Short.MAX_VALUE)
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPrincipalLayout.createSequentialGroup()
                .addGap(0, Short.MAX_VALUE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jmSalir.setText("Archivo");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmSalir.add(jMenuItem1);

        jMenuBar2.add(jmSalir);

        jmHuesped.setText("Huesped");

        jmiAdministrarHuesped.setText("Administrar");
        jmiAdministrarHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAdministrarHuespedActionPerformed(evt);
            }
        });
        jmHuesped.add(jmiAdministrarHuesped);

        jmiHuespedBuscar.setText("Buscar");
        jmiHuespedBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiHuespedBuscarActionPerformed(evt);
            }
        });
        jmHuesped.add(jmiHuespedBuscar);

        jmiInforme.setText("Informe");
        jmiInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiInformeActionPerformed(evt);
            }
        });
        jmHuesped.add(jmiInforme);

        jMenuBar2.add(jmHuesped);

        jmTipoHabitacion.setText("Tipo de Habitacion");

        jmiAdministrarTH.setText("Administrar");
        jmiAdministrarTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAdministrarTHActionPerformed(evt);
            }
        });
        jmTipoHabitacion.add(jmiAdministrarTH);

        jmiTHListar.setText("Listar");
        jmiTHListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTHListarActionPerformed(evt);
            }
        });
        jmTipoHabitacion.add(jmiTHListar);

        jmiCambiarPrecio.setText("Cambiar Precio");
        jmiCambiarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCambiarPrecioActionPerformed(evt);
            }
        });
        jmTipoHabitacion.add(jmiCambiarPrecio);

        jMenuBar2.add(jmTipoHabitacion);

        jmHabitacion.setText("Habitacion");

        jmiAdministrarHabitacion.setText("Administrar");
        jmiAdministrarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAdministrarHabitacionActionPerformed(evt);
            }
        });
        jmHabitacion.add(jmiAdministrarHabitacion);

        jmiHabitacionListar.setText("Listar");
        jmiHabitacionListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiHabitacionListarActionPerformed(evt);
            }
        });
        jmHabitacion.add(jmiHabitacionListar);

        jMenuBar2.add(jmHabitacion);

        jmReservas.setText("Reservas");

        jmiAdministrarReservas.setText("Administrar");
        jmiAdministrarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAdministrarReservasActionPerformed(evt);
            }
        });
        jmReservas.add(jmiAdministrarReservas);

        jmiReservasListar.setText("Listar");
        jmiReservasListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiReservasListarActionPerformed(evt);
            }
        });
        jmReservas.add(jmiReservasListar);

        jmiCICO.setText("Check In Check Out");
        jmiCICO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCICOActionPerformed(evt);
            }
        });
        jmReservas.add(jmiCICO);

        jMenuBar2.add(jmReservas);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1127, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jdpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static HuespedAdministrar adminHuesped = null;
    public static HuespedBuscar buscarHuesped = null;
    public static THAdministrar adminTH = null;
    public static THListar listarTH = null;
    public static HabitacionAdministrar adminH = null;
    public static HabitacionTHListar hthListar = null;
    public static HabitacionListar buscarH = null;
    public static THCambiarPrecio cambiarPTH = null;
    public static ReservasAdministrar reservaAdmin = null;
    public static ReservaHuespedBuscar resBusHuesped = null;
    public static ReservaHabitacionListar reservaHL = null;
    public static ReservasListar resListar = null;
    public static CICOReservaListar cicoResListar = null;
    public static CheckInCheckOut cico = null;
    public static HuespedInforme hInforme = null;
    
    private void jmiAdministrarHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAdministrarHuespedActionPerformed
        //Llamar a administrar huesped
        if(adminHuesped == null){
            adminHuesped = new HuespedAdministrar();
            jdpPrincipal.add(adminHuesped);
            adminHuesped.show();
        }else{
            adminHuesped.dispose();
            adminHuesped = new HuespedAdministrar();
            jdpPrincipal.add(adminHuesped);
            adminHuesped.show();
        }       
    }//GEN-LAST:event_jmiAdministrarHuespedActionPerformed

    private void jmiHuespedBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiHuespedBuscarActionPerformed
        //Llamar a buscar huesped
        if(buscarHuesped == null){
            buscarHuesped = new HuespedBuscar();
            jdpPrincipal.add(buscarHuesped);
            buscarHuesped.show();
        }else{
            buscarHuesped.dispose();
            buscarHuesped = new HuespedBuscar();
            jdpPrincipal.add(buscarHuesped);
            buscarHuesped.show();
        } 
    }//GEN-LAST:event_jmiHuespedBuscarActionPerformed

    private void jmiAdministrarTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAdministrarTHActionPerformed
        //Llamar a administrar tipos de habitacion
        if(adminTH == null){
            adminTH = new THAdministrar();
            jdpPrincipal.add(adminTH);
            adminTH.show();
        }else{
            adminTH.dispose();
            adminTH = new THAdministrar();
            jdpPrincipal.add(adminTH);
            adminTH.show();
        } 
    }//GEN-LAST:event_jmiAdministrarTHActionPerformed

    private void jmiTHListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTHListarActionPerformed
        //Llamar a listar tipo de habitacion
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
    }//GEN-LAST:event_jmiTHListarActionPerformed

    private void jmiAdministrarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAdministrarHabitacionActionPerformed
        //Llamar a administrar habitaciones
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
    }//GEN-LAST:event_jmiAdministrarHabitacionActionPerformed

    private void jmiHabitacionListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiHabitacionListarActionPerformed
        //Llamar a listar habitacion
        if(cambiarPTH == null){
            buscarH = new HabitacionListar();
            jdpPrincipal.add(buscarH);
            buscarH.show();
        }else{
            buscarH.dispose();
            buscarH = new HabitacionListar();
            jdpPrincipal.add(buscarH);
            buscarH.show();
        }
    }//GEN-LAST:event_jmiHabitacionListarActionPerformed

    private void jmiCambiarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCambiarPrecioActionPerformed
        //Llamar a cambiar precio
        if(cambiarPTH == null){
            cambiarPTH = new THCambiarPrecio();
            jdpPrincipal.add(cambiarPTH);
            cambiarPTH.show();
        }else{
            cambiarPTH.dispose();
            cambiarPTH = new THCambiarPrecio();
            jdpPrincipal.add(cambiarPTH);
            cambiarPTH.show();
        }
    }//GEN-LAST:event_jmiCambiarPrecioActionPerformed

    private void jmiAdministrarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAdministrarReservasActionPerformed
        //Llamar a Reservas
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
        
    }//GEN-LAST:event_jmiAdministrarReservasActionPerformed

    private void jmiReservasListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiReservasListarActionPerformed
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
    }//GEN-LAST:event_jmiReservasListarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmiCICOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCICOActionPerformed
        //Check In Check Out
        if(cico == null){
            cico = new CheckInCheckOut();
            jdpPrincipal.add(cico);
            cico.show();
        }else{
            cico.dispose();
            cico = new CheckInCheckOut();
            jdpPrincipal.add(cico);
            cico.show();
        } 
    }//GEN-LAST:event_jmiCICOActionPerformed

    private void jmiInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInformeActionPerformed
        //Informe
        if(hInforme == null){
            hInforme = new HuespedInforme();
            jdpPrincipal.add(hInforme);
            hInforme.show();
        }else{
            hInforme.dispose();
            hInforme = new HuespedInforme();
            jdpPrincipal.add(hInforme);
            hInforme.show();
        } 
    }//GEN-LAST:event_jmiInformeActionPerformed

 
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JMenu jmHabitacion;
    private javax.swing.JMenu jmHuesped;
    private javax.swing.JMenu jmReservas;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenu jmTipoHabitacion;
    private javax.swing.JMenuItem jmiAdministrarHabitacion;
    private javax.swing.JMenuItem jmiAdministrarHuesped;
    private javax.swing.JMenuItem jmiAdministrarReservas;
    private javax.swing.JMenuItem jmiAdministrarTH;
    private javax.swing.JMenuItem jmiCICO;
    private javax.swing.JMenuItem jmiCambiarPrecio;
    private javax.swing.JMenuItem jmiHabitacionListar;
    private javax.swing.JMenuItem jmiHuespedBuscar;
    private javax.swing.JMenuItem jmiInforme;
    private javax.swing.JMenuItem jmiReservasListar;
    private javax.swing.JMenuItem jmiTHListar;
    // End of variables declaration//GEN-END:variables
}
