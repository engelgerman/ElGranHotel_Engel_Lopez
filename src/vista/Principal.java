
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
        jmArchivo = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();
        jmHuesped = new javax.swing.JMenu();
        jmiAdministrarHuesped = new javax.swing.JMenuItem();
        jmiHuespedBuscar = new javax.swing.JMenuItem();
        jmTipoHabitacion = new javax.swing.JMenu();
        jmiAdministrarTH = new javax.swing.JMenuItem();
        jmiTHListar = new javax.swing.JMenuItem();
        jmHabitacion = new javax.swing.JMenu();
        jmiAdministrarHabitacion = new javax.swing.JMenuItem();
        jmiHabitacionListar = new javax.swing.JMenuItem();
        jmReservas = new javax.swing.JMenu();
        jmiAdministrarReservas = new javax.swing.JMenuItem();
        jmiReservasListar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        jmArchivo.setText("Archivo");

        jmiSalir.setText("Salir");
        jmArchivo.add(jmiSalir);

        jMenuBar2.add(jmArchivo);

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
        jmReservas.add(jmiAdministrarReservas);

        jmiReservasListar.setText("Listar");
        jmReservas.add(jmiReservasListar);

        jMenuBar2.add(jmReservas);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static HuespedAdministrar adminHuesped = null;
    public static HuespedBuscar buscarHuesped = null;
    
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
        THAdministrar tha = new THAdministrar();
        jdpPrincipal.add(tha);
        tha.setVisible(true);  
    }//GEN-LAST:event_jmiAdministrarTHActionPerformed

    private void jmiTHListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTHListarActionPerformed
        //Llamar a listar tipo de habitacion
        THListar thl = new THListar();
        jdpPrincipal.add(thl);
        thl.setVisible(true);
    }//GEN-LAST:event_jmiTHListarActionPerformed

    private void jmiAdministrarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAdministrarHabitacionActionPerformed
        //Llamar a administrar habitaciones
        HabitacionAdministrar ha = new HabitacionAdministrar();
        jdpPrincipal.add(ha);
        ha.setVisible(true);
    }//GEN-LAST:event_jmiAdministrarHabitacionActionPerformed

    private void jmiHabitacionListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiHabitacionListarActionPerformed
        //Llamar a listar habitacion
        HabitacionListar hl = new HabitacionListar();
        jdpPrincipal.add(hl);
        hl.setVisible(true);
    }//GEN-LAST:event_jmiHabitacionListarActionPerformed

 
    
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
    public static javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JMenu jmArchivo;
    private javax.swing.JMenu jmHabitacion;
    private javax.swing.JMenu jmHuesped;
    private javax.swing.JMenu jmReservas;
    private javax.swing.JMenu jmTipoHabitacion;
    private javax.swing.JMenuItem jmiAdministrarHabitacion;
    private javax.swing.JMenuItem jmiAdministrarHuesped;
    private javax.swing.JMenuItem jmiAdministrarReservas;
    private javax.swing.JMenuItem jmiAdministrarTH;
    private javax.swing.JMenuItem jmiHabitacionListar;
    private javax.swing.JMenuItem jmiHuespedBuscar;
    private javax.swing.JMenuItem jmiReservasListar;
    private javax.swing.JMenuItem jmiSalir;
    private javax.swing.JMenuItem jmiTHListar;
    // End of variables declaration//GEN-END:variables
}
