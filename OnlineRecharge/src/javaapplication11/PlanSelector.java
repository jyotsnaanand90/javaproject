
package javaapplication11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PlanSelector extends javax.swing.JFrame {

    ArrayList<PhoneNumber> numbs=new ArrayList<>();
    public PlanSelector() {
        initComponents();
        setLocationRelativeTo(null);
        File accs=new File("jyotsna");
        if(accs.exists()==false)
        {
            try {
                accs.createNewFile();
                ArrayList<Accounts> accounts=new ArrayList<>();
                Accounts accc;
                accc=new Accounts(12345678l,500,"password1");
                accounts.add(accc);
                accc=new Accounts(12345679l,200,"password2");
                accounts.add(accc);
                accc=new Accounts(12345680l,600,"password3");
                accounts.add(accc);
                accc=new Accounts(12345681l,1000,"password4");
                accounts.add(accc);
                ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(accs));
                oos.writeObject((Object)accounts);
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(PlanSelector.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
        }
        
        File nums=new File("ssmitha");
        if(nums.exists()==false)
        {
            try {
                nums.createNewFile();
                PhoneNumber pn;
                pn=new PhoneNumber(9847510388l,"Idea",15);
                numbs.add(pn);
                 pn=new PhoneNumber(9514600078l,"Airtel",24);
                numbs.add(pn);
                 pn=new PhoneNumber(9551554265l,"BSNL",36);
                numbs.add(pn);
                 pn=new PhoneNumber(9600024492l,"Vodafone",67);
                numbs.add(pn);
                 pn=new PhoneNumber(8600435647l,"Idea",00);
                numbs.add(pn);
                pn=new PhoneNumber(8943438222l,"Airtel",8);
                numbs.add(pn);
                pn=new PhoneNumber(8943438223l,"BSNL",60);
                numbs.add(pn);
                pn=new PhoneNumber(8943438224l,"Vodafone",55);
                numbs.add(pn);
                pn=new PhoneNumber(8608998568l,"Idea",34);
                numbs.add(pn);
                 pn=new PhoneNumber(9872538475l,"Airtel",23);
                numbs.add(pn);
                 pn=new PhoneNumber(7839482374l,"Vodafone",18);
                numbs.add(pn);
                 pn=new PhoneNumber(8600263956l,"BSNL",60);
                numbs.add(pn);
                 pn=new PhoneNumber(9583057291l,"Idea",39);
                numbs.add(pn);
                 pn=new PhoneNumber(8025498264l,"BSNL",43);
                numbs.add(pn);
                 pn=new PhoneNumber(8743027510l,"Airtel",42);
                numbs.add(pn);
                 pn=new PhoneNumber(9536078365l,"Vodafone",14);
                numbs.add(pn);
                 pn=new PhoneNumber(9634234549l,"Airtel",23);
                numbs.add(pn);
                 pn=new PhoneNumber(8356453856l,"Idea",37);
                numbs.add(pn);
                ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(nums));
                os.writeObject((Object)numbs);
                os.close();
            } catch (IOException ex) {
                Logger.getLogger(PlanSelector.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_mobNum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_proceed = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        combo_denomination = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        combo_operator = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mobile Number");

        txt_mobNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mobNumActionPerformed(evt);
            }
        });

        jLabel2.setText("Select Denomination");

        btn_proceed.setText("Proceed");
        btn_proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proceedActionPerformed(evt);
            }
        });

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        combo_denomination.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INR 10 ", "INR 20 ", "INR 30 ", "INR 50 ", "INR 100 ", "INR 200 ", "INR 300 ", "INR 500 " }));
        combo_denomination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_denominationActionPerformed(evt);
            }
        });

        jLabel3.setText("Select Operator");

        combo_operator.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Idea", "Airtel", "BSNL", "Vodafone" }));
        combo_operator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_operatorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btn_proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_mobNum)
                    .addComponent(combo_denomination, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_operator, 0, 142, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(combo_operator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mobNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(combo_denomination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_proceed)
                    .addComponent(btn_clear))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proceedActionPerformed
try{
    if(Long.parseLong(txt_mobNum.getText())<6999999999l||Long.parseLong(txt_mobNum.getText())>9999999999l)
        throw new Exception("Invalid Mobile Number");
    File nums=new File("ssmitha");
        try {
                ObjectInputStream iiis=new ObjectInputStream(new FileInputStream(nums));
                numbs=(ArrayList<PhoneNumber>)iiis.readObject();
                iiis.close();
            } catch (IOException ex) {
                Logger.getLogger(PlanSelector.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
    boolean numfound=false;
    int i;
    for(i=0;i<numbs.size();i++)
    {
        if(Long.parseLong(txt_mobNum.getText())==numbs.get(i).mobno)
        {
            numfound=true;
            break;
        }
    }
    if(numfound&&numbs.get(i).Operator.equals((String)combo_operator.getSelectedItem())) 
    {
    Payment p=new Payment(Long.parseLong(txt_mobNum.getText()),(String)combo_operator.getSelectedItem(),(String)combo_denomination.getSelectedItem());
    p.setVisible(true);
    this.dispose();
    }
    else
        throw new Exception("Phone number does not exist or incorrect operator selected");
}catch(Exception ex)
{
    JOptionPane.showMessageDialog(this,ex.getMessage());
}
    }//GEN-LAST:event_btn_proceedActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
txt_mobNum.setText("");
combo_denomination.setSelectedIndex(0);
combo_operator.setSelectedIndex(0);
    }//GEN-LAST:event_btn_clearActionPerformed

    private void combo_operatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_operatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_operatorActionPerformed

    private void txt_mobNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mobNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mobNumActionPerformed

    private void combo_denominationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_denominationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_denominationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_proceed;
    private javax.swing.JComboBox combo_denomination;
    private javax.swing.JComboBox combo_operator;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt_mobNum;
    // End of variables declaration//GEN-END:variables
}
