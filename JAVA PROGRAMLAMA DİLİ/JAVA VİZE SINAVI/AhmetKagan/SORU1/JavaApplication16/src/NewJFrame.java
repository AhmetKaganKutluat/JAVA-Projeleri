
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class NewJFrame extends javax.swing.JFrame {

    
    public NewJFrame() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELAM KAÇMAZ", "MEHMET ŞEHİRLİ", "OSMAN BODUR" }));
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NESNE TABANLI PROGRAMLAMA", "İLERİ  PROGRAMCILIĞI", "GÖRSEL PROGRAMLAMA" }));
        jComboBox2.setSelectedIndex(-1);

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
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField5)
                        .addComponent(jTextField4)
                        .addComponent(jTextField3)
                        .addComponent(jTextField2)
                        .addComponent(jTextField1)
                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(771, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTextField1.getText().length()==0)
        { JOptionPane.showMessageDialog(null,"İSİM GİRİNİZ ..","İSİM",JOptionPane.PLAIN_MESSAGE);}  
        else if(jTextField2.getText().length()==0)
            { JOptionPane.showMessageDialog(null,"SOYİSİM GİRİNİZ ..","SOYİSİM",JOptionPane.PLAIN_MESSAGE);}
        else if (jTextField3.getText().length()==0)
            { JOptionPane.showMessageDialog(null,"VİZE NOTUNU GİRİNİZ ..","VİZE",JOptionPane.PLAIN_MESSAGE);}
        else if(jTextField4.getText().length()==0)
        { JOptionPane.showMessageDialog(null,"FİNAL NOTUNU GİRİNİZ ..","FİNAL",JOptionPane.PLAIN_MESSAGE);}
        else if(jTextField5.getText().length()==0)
            { JOptionPane.showMessageDialog(null,"ÖDEV NOTUNU GİRİNİZ ..","ÖDEV",JOptionPane.PLAIN_MESSAGE);}
        
        
        int vize=Integer.parseInt(jTextField3.getText());
        int fnal=Integer.parseInt(jTextField4.getText());
        int odev=Integer.parseInt(jTextField5.getText());
        int ort=(int) ((vize*0.40)+(fnal*0.50)+(odev*0.10));
        String durum = null,harf = null;
        if(ort<60)
        {durum="KALDI";}
        if(ort>=60)
        {durum="GEÇTİ";}
        if(ort<50 && ort>=0)
        {harf="FF";}
        else
        if(ort<60 && ort>=50)
        {harf="DD";}
        else
        if(ort<70 && ort>=60)
        {harf="CC";}
        else
        if(ort<80 && ort>=70)
        {harf="BC";}
        else
        if(ort<90 && ort>=80)
        {harf="BB";}
        else
        if(ort<95 && ort>=90)
        {harf="BA";}
        else        
        {harf="AA";}  
        
        JOptionPane.showMessageDialog(null,jTextField1.getText()+" isimli öğrenci "+harf+" notu ve "+ort+" ortalama ile "+durum+"","BİLGİ",JOptionPane.PLAIN_MESSAGE);
        
        int soru;
        soru=JOptionPane.showConfirmDialog(null, jTextField1.getText()+" "+jTextField2.getText()+"isimli öğrencinin bilgileri kayıt edilsin mi ?","KAYIT",JOptionPane.YES_NO_OPTION);
        if(soru==JOptionPane.YES_OPTION)
        {
            File dosya = new File("kayi.txt");
        if (dosya.exists())
        {
                try {
                    dosya.createNewFile();
                    Scanner oku=new Scanner(System.in);
                } catch (IOException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     int sor;
        sor=JOptionPane.showConfirmDialog(null, jTextField1.getText()+" "+jTextField2.getText()+"isimli öğrencinin bilgileri kayıt edilsin mi ?","KAYIT",JOptionPane.YES_NO_OPTION);
        if(sor==JOptionPane.YES_OPTION)
        {
        System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
        
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
