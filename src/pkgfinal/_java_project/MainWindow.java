
package pkgfinal._java_project;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import pkgfinal._java_project.AdminLogin;
import static pkgfinal._java_project.Test.mainWindow;
public class MainWindow extends javax.swing.JFrame {
public static AdminLogin adminLogin;
public static AssistantLogin assistantLogin;
   
    public MainWindow(boolean x) {
        initComponents();
       this.setVisible(x);
        this.setLocation(500, 200);
        adminLogin=new AdminLogin(false);
        assistantLogin=new AssistantLogin(false);
       jButtonAdminLogin.addActionListener(new mainWindowloginButton() );
             jButtonAssistantLogin.addActionListener(new mainWindowloginButton() );
               jButtonExittheprogram.addActionListener(new mainWindowloginButton() );
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonAdminLogin = new javax.swing.JButton();
        jButtonAssistantLogin = new javax.swing.JButton();
        jButtonExittheprogram = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(250, 250, 250));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Student Report");

        jButtonAdminLogin.setBackground(new java.awt.Color(0, 0, 255));
        jButtonAdminLogin.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButtonAdminLogin.setForeground(new java.awt.Color(0, 0, 0));
        jButtonAdminLogin.setText("Admin Login");

        jButtonAssistantLogin.setBackground(new java.awt.Color(0, 0, 255));
        jButtonAssistantLogin.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButtonAssistantLogin.setForeground(new java.awt.Color(0, 0, 0));
        jButtonAssistantLogin.setText("Assistant Login");

        jButtonExittheprogram.setBackground(new java.awt.Color(0, 0, 255));
        jButtonExittheprogram.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButtonExittheprogram.setForeground(new java.awt.Color(0, 0, 0));
        jButtonExittheprogram.setText("Exit the program");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAdminLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAssistantLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExittheprogram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(jButtonAdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButtonAssistantLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButtonExittheprogram, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdminLogin;
    private javax.swing.JButton jButtonAssistantLogin;
    private javax.swing.JButton jButtonExittheprogram;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
  public class mainWindowloginButton implements ActionListener {
      
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==jButtonAdminLogin)
            {
            adminLogin.setVisible(true);
            mainWindow.setVisible(false);
            
            }
        if(e.getSource()==jButtonAssistantLogin)
        {assistantLogin.setVisible(true);
        mainWindow.setVisible(false);
        }
          if(e.getSource()==jButtonExittheprogram)
        {
        mainWindow.setVisible(false);
        }
        }
        
  
  
  }



}
