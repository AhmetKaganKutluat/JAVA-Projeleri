
package javaapplication22;

import javax.swing.JOptionPane;


public class NewJFrame extends javax.swing.JFrame {

    
    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("iste");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void UCGEN_TIPI(int a,int b,int c, int cevre,String ucgentipi){
        a=Integer.parseInt(JOptionPane.showInputDialog("Üçgenin 1. kenarını girin ..!","0"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Üçgenin 2. kenarını girin ..!","0"));
        c=Integer.parseInt(JOptionPane.showInputDialog("Üçgenin 3. kenarını girin ..!","0"));
        
        if((a==b && a==c))
        {
        ucgentipi="EŞKENAR ÜÇGEN";
        cevre = a+b+c;
        } else
            if(a==b || a==c || b==c)
            {
            ucgentipi="İKİZKENAR ÜÇGEN";
            cevre = a+b+c;
            }else 
            {
            ucgentipi="ÇEŞİTKENAR ÜÇGEN";
            cevre = a+b+c;
            }
        JOptionPane.showMessageDialog(rootPane, ucgentipi + "\n");
        
    }
    private void UCGEN_ALAN(int taban, int yukseklik, int alan){
         taban=Integer.parseInt(JOptionPane.showInputDialog("Üçgen tababını girin ..!","0"));
         yukseklik=Integer.parseInt(JOptionPane.showInputDialog("Üçgen yüksekliğini girin ..!","0"));
         alan = (taban*yukseklik)/2;
         JOptionPane.showMessageDialog(rootPane, alan);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        UCGEN_TIPI(WIDTH, WIDTH, WIDTH, WIDTH, null);
        UCGEN_ALAN(WIDTH, WIDTH, WIDTH);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
