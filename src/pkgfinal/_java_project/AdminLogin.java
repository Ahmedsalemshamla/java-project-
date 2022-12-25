
package pkgfinal._java_project;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import static pkgfinal._java_project.MainWindow.adminLogin;
import static pkgfinal._java_project.Test.mainWindow;



public class AdminLogin extends javax.swing.JFrame {

   public static AdminSection adminSection;
  
 
AdminLogin a;
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NameJTextField = new javax.swing.JTextField();
        JButtonLogin = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        PasswordJPassWorField = new javax.swing.JPasswordField();
        JButtonLoginBack = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Name :");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("PassWord :");

        NameJTextField.setBackground(new java.awt.Color(250, 250, 250));
        NameJTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        NameJTextField.setForeground(new java.awt.Color(0, 0, 0));

        JButtonLogin.setBackground(new java.awt.Color(102, 0, 255));
        JButtonLogin.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        JButtonLogin.setForeground(new java.awt.Color(0, 0, 0));
        JButtonLogin.setSelected(true);
        JButtonLogin.setText("Login");
        JButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonLoginActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel3.setText("Admin Login");

        PasswordJPassWorField.setBackground(new java.awt.Color(250, 250, 250));
        PasswordJPassWorField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PasswordJPassWorField.setForeground(new java.awt.Color(0, 0, 0));

        JButtonLoginBack.setBackground(new java.awt.Color(102, 0, 255));
        JButtonLoginBack.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        JButtonLoginBack.setForeground(new java.awt.Color(0, 0, 0));
        JButtonLoginBack.setSelected(true);
        JButtonLoginBack.setText("Back");
        JButtonLoginBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonLoginBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NameJTextField)
                            .addComponent(PasswordJPassWorField, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(JButtonLoginBack, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordJPassWorField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JButtonLoginBack, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void JButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonLoginActionPerformed
    }//GEN-LAST:event_JButtonLoginActionPerformed

    private void JButtonLoginBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonLoginBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonLoginBackActionPerformed
 public static void main(String args[]) {
   
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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
      
             
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton JButtonLogin;
    private javax.swing.JToggleButton JButtonLoginBack;
    private javax.swing.JTextField NameJTextField;
    private javax.swing.JPasswordField PasswordJPassWorField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
public class loginButton implements ActionListener{
        public void actionPerformed(ActionEvent e) {
        if(e.getSource()== JButtonLogin){
        
      if(NameJTextField.getText().equals("admin"))
    {
      if(PasswordJPassWorField.getText().equals("admin123"))      {
         NameJTextField.setText("");
         PasswordJPassWorField.setText("");
        
      adminSection.setVisible(true);
             adminLogin.setVisible(false);
       }else
     {
          JOptionPane.showMessageDialog(a,"the pass word is wrong");
    }
        }else{
     JOptionPane.showMessageDialog(a,"the user name is wrong");}
        
        
        }
        
             if(e.getSource()== JButtonLoginBack){
              NameJTextField.setText("");
          PasswordJPassWorField.setText("");
              mainWindow.setVisible(true);
               adminLogin.setVisible(false);
             
             }
        }}   
//the constructor
    public AdminLogin(boolean c) {
  
        initComponents();
      this.setVisible(c);
           adminSection=  new AdminSection(false); 
       
     this.setLocation(500,200);  
        a=this;
       
        JButtonLogin.addActionListener(new loginButton());
            JButtonLoginBack.addActionListener(new loginButton());
    }}
