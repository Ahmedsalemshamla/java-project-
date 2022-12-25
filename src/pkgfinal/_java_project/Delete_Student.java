package pkgfinal._java_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.JOptionPane;
import static pkgfinal._java_project.AddAssistant.assistantList;
//import static pkgfinal._java_project.AddStudent.rows;
import static pkgfinal._java_project.AdminSection.addAssistant;
import static pkgfinal._java_project.MainWindow.assistantLogin;
//import static pkgfinal._java_project.AssistantLogin.n;

//import static pkgfinal._java_project.AssistantSection.delete_Student;
public class Delete_Student extends javax.swing.JFrame {

    Delete_Student m;
    int f;

    public Delete_Student(boolean c) {
        initComponents();
        this.setVisible(c);
        this.setLocation(500, 200);
        jButtonBack.addActionListener(new loginButton());
        jButtonDelete.addActionListener(new loginButton());
        m = this;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField_text = new javax.swing.JTextField();
        jButtonDelete = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Delete Roll_No:");

        jTextField_text.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_text.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField_text.setForeground(new java.awt.Color(0, 0, 0));

        jButtonDelete.setBackground(new java.awt.Color(102, 153, 255));
        jButtonDelete.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(0, 0, 0));
        jButtonDelete.setText("Delete");

        jButtonBack.setBackground(new java.awt.Color(51, 153, 255));
        jButtonBack.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(0, 0, 0));
        jButtonBack.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jTextField_text, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_text, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(Delete_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Delete_Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField_text;
    // End of variables declaration//GEN-END:variables
 public class loginButton implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int a = 0;
            if (e.getSource() == jButtonBack) {
                assistantList.get(assistantLogin.n).setVisible(true);
                assistantList.get(assistantLogin.n).delete_Student.setVisible(false);
            }
            if (e.getSource() == jButtonDelete) {
                String s;
                s = jTextField_text.getText();
                boolean v = false;
                try {
                    a = Integer.parseInt(s);
                    if (a == 0) {
                        JOptionPane.showMessageDialog(m, "Enter Correct  Roll_No00000 Number .");
                        jTextField_text.setText("");
                    } else {
                        v = true;
                    }
                } catch (Exception k) {
                    JOptionPane.showMessageDialog(m, "Enter Correct  Roll_No Number .");
                    jTextField_text.setText("");
                }
                if (v) {

                    for (int i = 0; i < AddAssistant.assistantList.get(assistantLogin.n).addStudent.rows; i++) {

                        if (AddAssistant.assistantList.get(assistantLogin.n).viewStudent.tab.getValueAt(i, 0).toString().equals(s)) {
                            AddAssistant.assistantList.get(assistantLogin.n).viewStudent.tab.removeRow(i);
                            JOptionPane.showMessageDialog(m, "The Deletion of the   Roll_No Number  is made Correct.");
                            AddAssistant.assistantList.get(assistantLogin.n).addStudent.rows--;
                            jTextField_text.setText("");
                            assistantList.get(assistantLogin.n).setVisible(true);
                            assistantList.get(assistantLogin.n).delete_Student.setVisible(false);
                            v = false;
                        }
                    }
                }
                if (v) {
                    JOptionPane.showMessageDialog(m, "Enter Correct  Roll_No11111111111 Number .");
                    jTextField_text.setText(" ");

                }

            }
        }
    }
}
