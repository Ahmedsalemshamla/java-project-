package pkgfinal._java_project;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import pkgfinal._java_project.MainWindow;
import pkgfinal._java_project.AdminLogin;
import static pkgfinal._java_project.AdminLogin.adminSection;
import pkgfinal._java_project.ViewAssistant;
import pkgfinal._java_project.Test;

public class AdminSection extends javax.swing.JFrame {

    public static ViewAssistant viewAssistant;
    public static AddAssistant addAssistant;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonAddAssistant = new javax.swing.JButton();
        jButtonViewAssistant = new javax.swing.JButton();
        jButtonLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(250, 250, 250));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Admin Section");

        jButtonAddAssistant.setBackground(new java.awt.Color(100, 0, 250));
        jButtonAddAssistant.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButtonAddAssistant.setForeground(new java.awt.Color(0, 0, 0));
        jButtonAddAssistant.setText("Add Assistant");

        jButtonViewAssistant.setBackground(new java.awt.Color(100, 0, 250));
        jButtonViewAssistant.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButtonViewAssistant.setForeground(new java.awt.Color(0, 0, 0));
        jButtonViewAssistant.setText("View Assistant");

        jButtonLogOut.setBackground(new java.awt.Color(100, 0, 250));
        jButtonLogOut.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButtonLogOut.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLogOut.setText("LogOut");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAddAssistant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jButtonViewAssistant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAddAssistant, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButtonViewAssistant, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButtonLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new AdminSection().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddAssistant;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JButton jButtonViewAssistant;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
  public AdminSection(boolean c) {
        initComponents();
        viewAssistant = new ViewAssistant(false);
        addAssistant = new AddAssistant(false);
        this.setVisible(c);
        this.setLocation(500, 200);
        jButtonViewAssistant.addActionListener(new AdminSectionButton());
        jButtonLogOut.addActionListener(new AdminSectionButton());
        jButtonAddAssistant.addActionListener(new AdminSectionButton());
    }

    public class AdminSectionButton implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jButtonAddAssistant) {
                addAssistant.setVisible(true);
                adminSection.setVisible(false);
            } else if (e.getSource() == jButtonViewAssistant) {
                viewAssistant.setVisible(true);
                adminSection.setVisible(false);
            } else if (e.getSource() == jButtonLogOut) {
                adminSection.setVisible(false);
                Test.mainWindow.setVisible(true);

            }
        }
    }
}
