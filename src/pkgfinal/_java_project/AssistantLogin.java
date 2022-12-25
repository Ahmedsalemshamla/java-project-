package pkgfinal._java_project;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import pkgfinal._java_project.AddAssistant;
import static pkgfinal._java_project.AddAssistant.assistantList;
import static pkgfinal._java_project.MainWindow.assistantLogin;
import static pkgfinal._java_project.Test.mainWindow;

public class AssistantLogin extends javax.swing.JFrame {
    public  int n;
    AssistantLogin a;
//    public static AssistantSection assistantSection;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldname = new javax.swing.JTextField();
        jButtonlogin = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(250, 250, 250));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Assitant Login");

        jLabel2.setBackground(new java.awt.Color(250, 250, 250));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Name  :");

        jLabel3.setBackground(new java.awt.Color(250, 250, 250));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("PassWord :");

        jTextFieldname.setBackground(new java.awt.Color(250, 250, 250));
        jTextFieldname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldname.setForeground(new java.awt.Color(0, 0, 0));

        jButtonlogin.setBackground(new java.awt.Color(100, 0, 250));
        jButtonlogin.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButtonlogin.setForeground(new java.awt.Color(0, 0, 0));
        jButtonlogin.setText("Login");

        jButtonBack.setBackground(new java.awt.Color(100, 0, 250));
        jButtonBack.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(0, 0, 0));
        jButtonBack.setText("Back");

        jPasswordField.setBackground(new java.awt.Color(250, 250, 250));
        jPasswordField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jButtonlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jButtonBack)
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldname)
                            .addComponent(jPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldname, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButtonlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButtonBack)))
                .addContainerGap(83, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(AssistantLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssistantLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssistantLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssistantLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldname;
    // End of variables declaration//GEN-END:variables

    public AssistantLogin(boolean s) {
        initComponents();
        this.setVisible(s);
        this.setLocation(500, 200);
        a = this;
//        assistantSection = new AssistantSection(false);
        jButtonlogin.addActionListener(new assistantLogin());
        jButtonBack.addActionListener(new assistantLogin());
    }
    
    public class assistantLogin implements ActionListener {

//        static int n;
        
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jButtonlogin) {
                int c = AddAssistant.numOfAssistant;
                boolean d = true;
                if (d) {
                    for (int i = 0; i < c; i++) {
                        String m = (String) ViewAssistant.tab1.getValueAt(i, 1);
                        if (m.equals(jTextFieldname.getText())) {
                            d = false;                            
                            boolean f = true;
                            if (jPasswordField.getText().equals((String) ViewAssistant.tab1.getValueAt(i, 2))) {
                                
                                assistantLogin.setVisible(false);
                                assistantList.get(i).setVisible(true);
                                setNumberOfAssistantScetion( i);
                                jPasswordField.setText("");
                                jTextFieldname.setText("");
                                f = false;
                                
                            }
                            if (f) {
                                JOptionPane.showMessageDialog(a, "The PassWord  is not Correct");
                            }
                            
                        }
                        
                    }
                }
                if (d) {
                    JOptionPane.showMessageDialog(a, "The Student name is not a Student.");
                }
                
            }
            
            if (e.getSource() == jButtonBack) {
                jPasswordField.setText("");
                jTextFieldname.setText("");
                assistantLogin.setVisible(false);
                mainWindow.setVisible(true);
                
            }
        }
      public  void setNumberOfAssistantScetion(int m)
    {
    
    n=m;
    }
   
    }
}
        
    
    

