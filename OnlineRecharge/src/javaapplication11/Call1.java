package javaapplication11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.Integer.parseInt;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Call1 extends javax.swing.JFrame {

     static int milliseconds = 0;
    static int seconds = 0;
    static int  minutes = 0;
    static int hours = 0;
    int bal,x;
    static boolean state=true;
    ArrayList<PhoneNumber> numbs=new ArrayList<>();
    public Call1() {
        initComponents();
        setLocationRelativeTo(null);
       
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_mobile = new javax.swing.JTextField();
        txt_mobile1 = new javax.swing.JTextField();
        combo = new javax.swing.JComboBox<>();
        second = new javax.swing.JTextField();
        millisecond = new javax.swing.JTextField();
        minute = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("JYOSMITH online call system");

        jLabel2.setText("YOUR MOBILE NUMBER:");

        jLabel3.setText("SELECT OPERATOR:");

        jLabel4.setText("(calling)MOBILE NUMBER:");

        txt_mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mobileActionPerformed(evt);
            }
        });

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Idea", "Airtel", "BSNL", "Vodafone" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        second.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        second.setText("00:");

        millisecond.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        millisecond.setText("00");

        minute.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        minute.setText("00:");
        minute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minuteActionPerformed(evt);
            }
        });

        jButton1.setText("CALL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("END CALL");
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
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_mobile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mobile1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(minute, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(second, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(millisecond, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jButton2)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_mobile1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(millisecond, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(second, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minute, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mobileActionPerformed
        
    }//GEN-LAST:event_txt_mobileActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        
    }//GEN-LAST:event_comboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        try{
    if(Long.parseLong(txt_mobile.getText())<6999999999l||Long.parseLong(txt_mobile.getText())>9999999999l)
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
        if(Long.parseLong(txt_mobile.getText())==numbs.get(i).mobno)
        {
            numfound=true;
            break;
        }
    }
    if(numfound&&numbs.get(i).Operator.equals((String)combo.getSelectedItem())) 
    {
           
        Thread t;
        t = new Thread()
        {
            public void run()
            {
                for(;;)
                {
                    if(state == true)
                    {
                        try
                        {
                            sleep(1);
                            if(milliseconds>1000)
                            {
                                milliseconds=0;
                                seconds++;
                            }
                            if(seconds>60)
                            {
                                milliseconds=0;
                                seconds=0;
                                minutes++;
                            }
                          millisecond.setText(":" + milliseconds);
                          milliseconds ++;
                          second.setText(":" + seconds);
                          minute.setText(":"+minutes);
                        }
                        catch(Exception e)
                    {
                    }
                }
            }
            }
        };
                t.start();

   
    }
    else
        throw new Exception("Phone number does not exist or incorrect operator selected");
}catch(Exception ex)
{
    JOptionPane.showMessageDialog(this,ex.getMessage());
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void minuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minuteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minuteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        state =false;
        
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
    x = (minutes*60)+seconds;
    for(i=0;i<numbs.size();i++)
    {
        if(Long.parseLong(txt_mobile.getText())==numbs.get(i).mobno)
        {
            numbs.get(i).balance-= (x/3);
            bal =numbs.get(i).balance;
            numfound=true;
            break;
        }
    }
    File nums1=new File("ssmitha");
            try {
                if(nums1.exists())
                    nums1.delete();
                nums1.createNewFile();
                ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(nums));
                o.writeObject((Object)numbs);
                o.close();
            } catch (IOException ex) {
                Logger.getLogger(PlanSelector.class.getName()).log(Level.SEVERE, null, ex);
            }
    
   
   summary2 summ=new summary2(Long.parseLong(txt_mobile.getText()),Long.parseLong(txt_mobile1.getText()),bal,minutes,seconds,milliseconds,x/3);
    summ.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField millisecond;
    private javax.swing.JTextField minute;
    private javax.swing.JTextField second;
    private javax.swing.JTextField txt_mobile;
    private javax.swing.JTextField txt_mobile1;
    // End of variables declaration//GEN-END:variables

}
