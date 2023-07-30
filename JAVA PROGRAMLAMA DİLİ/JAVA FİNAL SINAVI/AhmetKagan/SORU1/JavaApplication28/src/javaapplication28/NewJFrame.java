
package javaapplication28;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.sql.*;


public class NewJFrame extends javax.swing.JFrame {

    
    public NewJFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jButton1.setText("KAYDET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ÇIKIŞ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox2, 0, 184, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton1)
                        .addGap(54, 54, 54)
                        .addComponent(jButton2)))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(206, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    File dosya = new File("bolum.txt");
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try
        {
            File file = new File("bolum.txt");
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(file));
        String satir = reader.readLine();

            while (satir!=null) {
            	jComboBox1.addItem(satir);
                satir = reader.readLine();
            }
        
        }
        catch (Exception e)
        {System.out.print("HAATAAAA!!!");}
    }//GEN-LAST:event_formWindowOpened

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jComboBox1.getSelectedIndex()==0)
        {
        jComboBox2.removeAllItems();
        jComboBox2.addItem("SELAM KAÇMAZ");
        jComboBox2.addItem("MEHMET ŞEHİRLİ");
        jComboBox2.addItem("OSMAN BODUR");
        }
        if(jComboBox1.getSelectedIndex()==1)
        {
        jComboBox2.removeAllItems();
        jComboBox2.addItem("SELAM KAÇMAZ");
        jComboBox2.addItem("MEHMET ŞEHİRLİ");
        jComboBox2.addItem("OSMAN BODUR");
        }
        if(jComboBox1.getSelectedIndex()==2)
        {
        jComboBox2.removeAllItems();
        jComboBox2.addItem("SELAM KAÇMAZ");
        jComboBox2.addItem("MEHMET ŞEHİRLİ");
        jComboBox2.addItem("OSMAN BODUR");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed
    DefaultListModel listModel = new DefaultListModel();
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if(jComboBox2.getSelectedIndex()==0)
        {
            listModel.removeAllElements();
           jList1.setModel(listModel);
            listModel.addElement("NESNE TABANLI PROGRAMLAMA");
            listModel.addElement("GÖRSEL PROGRAMLAMA");
            listModel.addElement("BİLGİSAYAR DONANIM");
        }
        if(jComboBox2.getSelectedIndex()==1)
        {
            listModel.removeAllElements();
           jList1.setModel(listModel);
            listModel.addElement("YAZILIM MİMARİLERİ");
            listModel.addElement("MİKROİŞLEMCİ");
            listModel.addElement("SİSTEM ANALİZİ");
        }
        if(jComboBox2.getSelectedIndex()==2)
        {
            listModel.removeAllElements();
           jList1.setModel(listModel);
            listModel.addElement("SUNUCU İŞLEETİM");
            listModel.addElement("İLERİ PROGRAMLAMA");
            listModel.addElement("MATEMATİK");
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int sayi=Integer.parseInt(JOptionPane.showInputDialog("Bir sayı Girin ..!","Buraya Giriniz..."));
        if(sayi == JOptionPane.YES_OPTION)
        {
        System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTextField1.getText().length()==0)
       {JOptionPane.showMessageDialog(rootPane,"AD TEXT ALANLARINI DOLDURUN");}
       else if(jTextField2.getText().length()==0)
       {JOptionPane.showMessageDialog(rootPane,"SOYADTEXT ALANLARINI DOLDURUN");}
       else 
       {
        int sor;
        sor=JOptionPane.showConfirmDialog(rootPane,jTextField1.getText()+" "+jTextField2.getText()+" isimli Öğrencinin bilgileri kaydedilsin mi ?","KAYIT",JOptionPane.YES_NO_OPTION);
        if(sor==JOptionPane.YES_OPTION)
        {
           try {
            Connection baglan = DriverManager.getConnection("jdbc:derby://localhost:1527/ODEV");
                Statement kayit = baglan.createStatement();
                java.sql.ResultSet res = kayit.executeQuery("select * from KAYITLAR");
                String bolum = (String) jComboBox1.getSelectedItem();
                String hoca = (String) jComboBox2.getSelectedItem();
                kayit.execute("INSERT INTO KAYIT(ADI,SOYADI,BOLUM,OGRETIM_ELEMANI) VALUES('"+jTextField1.getText().trim()+"','"+jTextField2.getText().trim()
                        +"','"+bolum+"','"+hoca+"')");
                
                JOptionPane.showMessageDialog(rootPane," Öğrencinin bilgileri başarıyla kaydedildi ... ");
            
            
           }
           catch(Exception e)
           {
           JOptionPane.showMessageDialog(rootPane," HATA ! ");
           }
                
       
       }
       }
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
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
