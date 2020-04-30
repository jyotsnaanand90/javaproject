
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


public class Payment extends javax.swing.JFrame {

    long mobno;
    String operator;
    String Denom;
    ArrayList<Accounts> accounts=new ArrayList<>();
    ArrayList<PhoneNumber> phones=new ArrayList<>();
    public Payment(long MobNo,String Operator, String Denomination) {
        initComponents();
        setLocationRelativeTo(null);
        mobno=MobNo;
        operator=Operator;
        Denom=Denomination;
        File accs=new File("jyotsna");
        try {
                ObjectInputStream is=new ObjectInputStream(new FileInputStream(accs));
                accounts=(ArrayList<Accounts>)is.readObject();
                is.close();
            } catch (IOException ex) {
                Logger.getLogger(PlanSelector.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
        File nums=new File("ssmitha");
        try {
                ObjectInputStream iis=new ObjectInputStream(new FileInputStream(nums));
                phones=(ArrayList<PhoneNumber>)iis.readObject();
                iis.close();
            } catch (IOException ex) {
                Logger.getLogger(PlanSelector.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
    txt_amount.setText(Denom.substring(Denom.indexOf(" ")+1,Denom.lastIndexOf(" ")));
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_cardNum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_amount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Debit/Credit Card Number");

        jLabel2.setText("3D Secure Password");

        jLabel3.setText("Merchant");

        jLabel4.setText("PayTM Online recharge");

        jLabel5.setText("Amount");

        txt_amount.setEditable(false);

        jLabel6.setText("JYOSMITH Online Payment");

        jButton1.setText("Proceed");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_cardNum)
                            .addComponent(txt_password)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(txt_amount)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jButton1)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cardNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
    long c;
    if(Long.parseLong(txt_cardNum.getText())<10000000)
        throw new Exception("Invalid card number");
    else
        c=Long.parseLong(txt_cardNum.getText());
String p=txt_password.getText();
boolean found=false;
int i;
for(i=0;i<accounts.size();i++)
{
    if(accounts.get(i).cardNo==c)
    {
        found=true;
        break;
    }
}
if(found==false)
        throw new Exception("Invalid account number");
else if(accounts.get(i).password.equals(p)==false)
    {
    throw new Exception("Incorect password");
    }
else if(accounts.get(i).balance<Integer.parseInt(Denom.substring(Denom.indexOf(" ")+1,Denom.lastIndexOf(" "))))
    throw new Exception("Insufficient balance");
else
{   
    accounts.get(i).balance-=Integer.parseInt(Denom.substring(Denom.indexOf(" ")+1,Denom.lastIndexOf(" ")));
    for(i=0;i<phones.size();i++)
    {
        if(phones.get(i).mobno==mobno)
            break;
    }
    phones.get(i).balance+=Integer.parseInt(Denom.substring(Denom.indexOf(" ")+1,Denom.lastIndexOf(" ")));
    int newbalance=phones.get(i).balance;
    File accs=new File("jyotsna");
        
            try {
                if(accs.exists())
                    accs.delete();
                accs.createNewFile();
                ObjectOutputStream ooos=new ObjectOutputStream(new FileOutputStream(accs));
                ooos.writeObject((Object)accounts);
                ooos.close();
            } catch (IOException ex) {
                Logger.getLogger(PlanSelector.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        File nums=new File("ssmitha");
            try {
                if(nums.exists())
                    nums.delete();
                nums.createNewFile();
                ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(nums));
                o.writeObject((Object)phones);
                o.close();
            } catch (IOException ex) {
                Logger.getLogger(PlanSelector.class.getName()).log(Level.SEVERE, null, ex);
            }
    Summary summ=new Summary(mobno,operator,Denom,newbalance);
    summ.setVisible(true);
    this.dispose();
}
}
catch(Exception ex)
{
    JOptionPane.showMessageDialog(this, ex.getMessage());
    ex.printStackTrace();
}
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_amount;
    private javax.swing.JTextField txt_cardNum;
    private javax.swing.JPasswordField txt_password;
    // End of variables declaration//GEN-END:variables
}