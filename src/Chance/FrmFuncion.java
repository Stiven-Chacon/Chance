
package Chance;



public class FrmFuncion extends javax.swing.JFrame {

    Cuenta ClaseCuenta = new Cuenta();
    String cta;
    
    public FrmFuncion(String NumCuenta) {
        initComponents();
        cta=NumCuenta;    
        ActualizarEncabezado(cta);
           
    }

    FrmFuncion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void ActualizarEncabezado(String NumCuenta){
     for(int i=1;i<=ClaseCuenta.x-1;i++)  
            {            
                if (NumCuenta.equals(ClaseCuenta.cuenta[i].Identificacion))
                {
                    this.LblCuenta.setText("Identificacion: "+ClaseCuenta.cuenta[i].Identificacion);               
                    this.LblNombre.setText("Nombre: "+ClaseCuenta.cuenta[i].Usuario);
                    this.LblCorreo.setText("Correo: "+ClaseCuenta.cuenta[i].Correo);
                    break;
                }
            }     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        BtnConsignar = new javax.swing.JButton();
        BtnRetirar = new javax.swing.JButton();
        LblCuenta = new javax.swing.JLabel();
        LblNombre = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JButton();
        LblCorreo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnConsignar.setText("Consignar");
        BtnConsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsignarActionPerformed(evt);
            }
        });

        BtnRetirar.setText("Retirar");
        BtnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRetirarActionPerformed(evt);
            }
        });

        LblCuenta.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        LblCuenta.setForeground(new java.awt.Color(255, 0, 0));
        LblCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblCuenta.setText("Nombre");

        LblNombre.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        LblNombre.setForeground(new java.awt.Color(255, 0, 0));
        LblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblNombre.setText("Identificacion");

        BtnSalir.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(255, 0, 0));
        BtnSalir.setText("Salir");
        BtnSalir.setBorderPainted(false);
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        LblCorreo.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        LblCorreo.setForeground(new java.awt.Color(255, 0, 0));
        LblCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblCorreo.setText("Correo:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BtnConsignar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnRetirar))
                                .addComponent(LblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(LblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(BtnConsignar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnRetirar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSalir)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void BtnConsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsignarActionPerformed
    this.dispose(); 
    FrmConsignar con = new FrmConsignar();
     con.setVisible(true);
   
}//GEN-LAST:event_BtnConsignarActionPerformed

private void BtnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRetirarActionPerformed
    this.dispose();
    FrmRetirar frmRetirar = new FrmRetirar(cta);
    frmRetirar.setVisible(true);

}//GEN-LAST:event_BtnRetirarActionPerformed

private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
    this.dispose();
    FrmMenu Menu = new FrmMenu();
    Menu.setVisible(true);
}//GEN-LAST:event_BtnSalirActionPerformed


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
            java.util.logging.Logger.getLogger(FrmFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
/*
         Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrmMovimientos().setVisible(true);
            }
        //</editor-fold>
/*
         Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrmMovimientos().setVisible(true);
            }
        });*/
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConsignar;
    private javax.swing.JButton BtnRetirar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel LblCorreo;
    private javax.swing.JLabel LblCuenta;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
