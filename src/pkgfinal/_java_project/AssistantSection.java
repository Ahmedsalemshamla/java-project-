package pkgfinal._java_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static pkgfinal._java_project.AddAssistant.assistantList;
//import static pkgfinal._java_project.AssistantLogin.n;

import static pkgfinal._java_project.MainWindow.assistantLogin;

public class AssistantSection extends javax.swing.JFrame {

    public AddStudent addStudent;
    public ViewStudent viewStudent;
    public EditStudent editStudent;
    public Delete_Student delete_Student;

    public AssistantSection(boolean b) {
        initComponents();
        this.setVisible(b);
        this.setLocation(500, 200);
        addStudent = new AddStudent(false);
//        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        delete_Student = new Delete_Student(false);
        viewStudent = new ViewStudent(false);
        /////////////////////////////////////
        jButtonLogOut.addActionListener(new loginButton());
        /////////////////////////////////////
        jButtonAddStudent.addActionListener(new loginButton());
        ////Add a Student ///////////////////
        editStudent = new EditStudent(false);
        ////////////////////////////////////
        jButtonDeleteStudent.addActionListener(new loginButton());
        /////////////////////////////////////////////////////
        jButtonEditStudent.addActionListener(new loginButton());
        ///////////////////////////////////////////////////
        jButtonViewStudent.addActionListener(new loginButton());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonAddStudent = new javax.swing.JButton();
        jButtonViewStudent = new javax.swing.JButton();
        jButtonEditStudent = new javax.swing.JButton();
        jButtonLogOut = new javax.swing.JButton();
        jButtonDeleteStudent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(250, 250, 250));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Assistant Section");

        jButtonAddStudent.setBackground(new java.awt.Color(100, 0, 250));
        jButtonAddStudent.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButtonAddStudent.setForeground(new java.awt.Color(0, 0, 0));
        jButtonAddStudent.setText("Add Student");

        jButtonViewStudent.setBackground(new java.awt.Color(100, 0, 250));
        jButtonViewStudent.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButtonViewStudent.setForeground(new java.awt.Color(0, 0, 0));
        jButtonViewStudent.setText("View Student");

        jButtonEditStudent.setBackground(new java.awt.Color(100, 0, 250));
        jButtonEditStudent.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButtonEditStudent.setForeground(new java.awt.Color(0, 0, 0));
        jButtonEditStudent.setText("Edit Student");

        jButtonLogOut.setBackground(new java.awt.Color(100, 0, 250));
        jButtonLogOut.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButtonLogOut.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLogOut.setText("LogOut");
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });

        jButtonDeleteStudent.setBackground(new java.awt.Color(100, 0, 250));
        jButtonDeleteStudent.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButtonDeleteStudent.setForeground(new java.awt.Color(0, 0, 0));
        jButtonDeleteStudent.setText("Delete Student");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(149, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEditStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonViewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDeleteStudent))
                        .addGap(60, 60, 60))))
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jButtonLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonViewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeleteStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jButtonLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLogOutActionPerformed

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
            java.util.logging.Logger.getLogger(AssistantSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssistantSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssistantSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssistantSection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new AssistantSection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddStudent;
    private javax.swing.JButton jButtonDeleteStudent;
    private javax.swing.JButton jButtonEditStudent;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JButton jButtonViewStudent;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public class loginButton implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == jButtonAddStudent) {
                assistantList.get(assistantLogin.n).setVisible(false);
                addStudent.setVisible(true);

            } else if (e.getSource() == jButtonDeleteStudent) {

                assistantList.get(assistantLogin.n).setVisible(false);

                delete_Student.setVisible(true);

            } else if (e.getSource() == jButtonEditStudent) {

                assistantList.get(assistantLogin.n).setVisible(false);

                editStudent.setVisible(true);
            } else if (e.getSource() == jButtonViewStudent) {
                assistantList.get(assistantLogin.n).setVisible(false);

                viewStudent.setVisible(true);
            } else if (e.getSource() == jButtonLogOut) {
                
                assistantList.get(assistantLogin.n).setVisible(false);

                assistantLogin.setVisible(true);
            }
        }
    }

}
