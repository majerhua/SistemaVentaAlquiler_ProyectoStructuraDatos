/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculasymas.g3.sistemaventasyalquilar.SisVentAlqui.vistas;

/**
 *
 * @author Jose
 */
public class vMenu extends javax.swing.JFrame {

    /**
     * Creates new form vMenu
     */
    public vMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelUsuarioOAdministrador = new javax.swing.JLabel();
        btnAdministrador = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        btnAtrasLogin = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnMantenimiento = new javax.swing.JMenu();
        subMnCliente = new javax.swing.JMenuItem();
        subMenuPeliculas = new javax.swing.JMenuItem();
        subMnVendedor = new javax.swing.JMenuItem();
        subMnCategoriaPel = new javax.swing.JMenuItem();
        mnAlquiler = new javax.swing.JMenu();
        subMnAlquilerPel = new javax.swing.JMenuItem();
        subMnFacturaAlq = new javax.swing.JMenuItem();
        mnVenta = new javax.swing.JMenu();
        subMnVentaPel = new javax.swing.JMenuItem();
        subMnFacturaPel = new javax.swing.JMenuItem();
        mnAyuda = new javax.swing.JMenu();
        mnAccesorios = new javax.swing.JMenu();
        mnSalir = new javax.swing.JMenu();
        subMnClose = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido ");

        labelUsuarioOAdministrador.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        labelUsuarioOAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuarioOAdministrador.setText(".......................");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(labelUsuarioOAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelUsuarioOAdministrador))
                .addGap(20, 20, 20))
        );

        btnAdministrador.setText("Administrador");
        btnAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministradorActionPerformed(evt);
            }
        });

        btnUsuario.setText("Usuario");
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        btnAtrasLogin.setText("Atras");
        btnAtrasLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 410, Short.MAX_VALUE)
                .addComponent(btnAtrasLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnAtrasLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addComponent(btnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(335, 335, 335))
        );

        mnMantenimiento.setText("Mantenimiento");

        subMnCliente.setText("Cliente");
        subMnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnClienteActionPerformed(evt);
            }
        });
        mnMantenimiento.add(subMnCliente);

        subMenuPeliculas.setText("Peliculas");
        subMenuPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuPeliculasActionPerformed(evt);
            }
        });
        mnMantenimiento.add(subMenuPeliculas);

        subMnVendedor.setText("Vendedor");
        subMnVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnVendedorActionPerformed(evt);
            }
        });
        mnMantenimiento.add(subMnVendedor);

        subMnCategoriaPel.setText("Categoria Pelicula");
        subMnCategoriaPel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnCategoriaPelActionPerformed(evt);
            }
        });
        mnMantenimiento.add(subMnCategoriaPel);

        jMenuBar1.add(mnMantenimiento);

        mnAlquiler.setText("Alquiler");

        subMnAlquilerPel.setText("Alquier Pelicula");
        subMnAlquilerPel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnAlquilerPelActionPerformed(evt);
            }
        });
        mnAlquiler.add(subMnAlquilerPel);

        subMnFacturaAlq.setText("Factura Alquiler");
        mnAlquiler.add(subMnFacturaAlq);

        jMenuBar1.add(mnAlquiler);

        mnVenta.setText("Venta");

        subMnVentaPel.setText("Venta Pelicula");
        subMnVentaPel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnVentaPelActionPerformed(evt);
            }
        });
        mnVenta.add(subMnVentaPel);

        subMnFacturaPel.setText("Factura Pelicula");
        mnVenta.add(subMnFacturaPel);

        jMenuBar1.add(mnVenta);

        mnAyuda.setText("Ayuda");
        jMenuBar1.add(mnAyuda);

        mnAccesorios.setText("Accesorios");
        jMenuBar1.add(mnAccesorios);

        mnSalir.setText("Salir");

        subMnClose.setText("Close");
        mnSalir.add(subMnClose);

        jMenuBar1.add(mnSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministradorActionPerformed
        // TODO add your handling code here:
        
        vAdministrador vistaAdmin = new vAdministrador();
        vistaAdmin.setVisible(true);
    }//GEN-LAST:event_btnAdministradorActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        // TODO add your handling code here:
        vUsuario vistaUsuario = new vUsuario();
        vistaUsuario.setVisible(true);
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnAtrasLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasLoginActionPerformed
        
        vLogin vistaLogin = new vLogin();
        vistaLogin.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnAtrasLoginActionPerformed

    private void subMnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnClienteActionPerformed
       
        vCliente vistaCliente =new vCliente();
        vistaCliente.setVisible(true);
    }//GEN-LAST:event_subMnClienteActionPerformed

    private void subMnVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnVendedorActionPerformed
        
        vVendedor vistaVendedor = new vVendedor();
        vistaVendedor.setVisible(true);
        
    }//GEN-LAST:event_subMnVendedorActionPerformed

    private void subMnCategoriaPelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnCategoriaPelActionPerformed
        
        vCategoria vistaCategoria = new vCategoria();
        vistaCategoria.setVisible(true);
    }//GEN-LAST:event_subMnCategoriaPelActionPerformed

    private void subMenuPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuPeliculasActionPerformed
        vPelicula vistaPelicula = new vPelicula();
        vistaPelicula.setVisible(true);
    }//GEN-LAST:event_subMenuPeliculasActionPerformed

    private void subMnVentaPelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnVentaPelActionPerformed
        
        vVenta vistaVenta = new vVenta();
        vistaVenta.setVisible(true);
        
    }//GEN-LAST:event_subMnVentaPelActionPerformed

    private void subMnAlquilerPelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnAlquilerPelActionPerformed
        // TODO add your handling code here:
        vAlquiler vistaAlquiler = new vAlquiler();
        vistaAlquiler.setVisible(true);
    }//GEN-LAST:event_subMnAlquilerPelActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(vMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAdministrador;
    private javax.swing.JButton btnAtrasLogin;
    public static javax.swing.JButton btnUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel labelUsuarioOAdministrador;
    private javax.swing.JMenu mnAccesorios;
    private javax.swing.JMenu mnAlquiler;
    private javax.swing.JMenu mnAyuda;
    private javax.swing.JMenu mnMantenimiento;
    private javax.swing.JMenu mnSalir;
    private javax.swing.JMenu mnVenta;
    private javax.swing.JMenuItem subMenuPeliculas;
    private javax.swing.JMenuItem subMnAlquilerPel;
    private javax.swing.JMenuItem subMnCategoriaPel;
    private javax.swing.JMenuItem subMnCliente;
    private javax.swing.JMenuItem subMnClose;
    private javax.swing.JMenuItem subMnFacturaAlq;
    private javax.swing.JMenuItem subMnFacturaPel;
    private javax.swing.JMenuItem subMnVendedor;
    private javax.swing.JMenuItem subMnVentaPel;
    // End of variables declaration//GEN-END:variables
}