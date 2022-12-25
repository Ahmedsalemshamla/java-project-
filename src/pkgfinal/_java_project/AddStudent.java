package pkgfinal._java_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import static pkgfinal._java_project.AddAssistant.assistantList;

//import static pkgfinal._java_project.AssistantLogin.n;
import static pkgfinal._java_project.MainWindow.assistantLogin;
//import static pkgfinal._java_project.AssistantLogin.assistantSection;
//import static pkgfinal._java_project.AssistantSection.addStudent;

public class AddStudent extends javax.swing.JFrame {

    public int id = 1;
    public int rows = 0;
    String name, facutly, course, Id, level, Class, lab_time;
    AddStudent a;
    String b = "e";

    public AddStudent(boolean c) {
        initComponents();
        a = this;
        jComboBoxLab_Time.setSelectedItem(0);
        this.setVisible(c);
        this.setLocation(500, 200);
        jButtonAddStudent.addActionListener(new loginButton());
        jButtonBack.addActionListener(new loginButton());
        jButtonclear.addActionListener(new loginButton());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldname = new javax.swing.JTextField();
        jTextFieldCourse = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jTextField5Level = new javax.swing.JTextField();
        jTextFieldClass = new javax.swing.JTextField();
        jButtonAddStudent = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jComboBoxLab_Time = new javax.swing.JComboBox<>();
        jTextFieldFacutly = new javax.swing.JTextField();
        jButtonclear = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(250, 250, 250));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Name :");

        jLabel2.setBackground(new java.awt.Color(250, 250, 250));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Facutly");

        jLabel3.setBackground(new java.awt.Color(250, 250, 250));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Course");

        jLabel4.setBackground(new java.awt.Color(250, 250, 250));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ID :");

        jLabel5.setBackground(new java.awt.Color(250, 250, 250));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Level :");

        jLabel6.setBackground(new java.awt.Color(250, 250, 250));
        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Class:");

        jLabel7.setBackground(new java.awt.Color(250, 250, 250));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Lab Time :");

        jLabel8.setBackground(new java.awt.Color(250, 250, 250));
        jLabel8.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Add Student");

        jTextFieldname.setBackground(new java.awt.Color(250, 250, 250));
        jTextFieldname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldname.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldCourse.setBackground(new java.awt.Color(250, 250, 250));
        jTextFieldCourse.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldCourse.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCourseActionPerformed(evt);
            }
        });

        jTextFieldID.setBackground(new java.awt.Color(250, 250, 250));
        jTextFieldID.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldID.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jTextField5Level.setBackground(new java.awt.Color(250, 250, 250));
        jTextField5Level.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField5Level.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldClass.setBackground(new java.awt.Color(250, 250, 250));
        jTextFieldClass.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldClass.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClassActionPerformed(evt);
            }
        });

        jButtonAddStudent.setBackground(new java.awt.Color(100, 0, 250));
        jButtonAddStudent.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButtonAddStudent.setForeground(new java.awt.Color(0, 0, 0));
        jButtonAddStudent.setText("Add Student");

        jButtonBack.setBackground(new java.awt.Color(100, 0, 250));
        jButtonBack.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(0, 0, 0));
        jButtonBack.setText("Back");

        jComboBoxLab_Time.setBackground(new java.awt.Color(100, 150, 250));
        jComboBoxLab_Time.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jComboBoxLab_Time.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxLab_Time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " sunday 8-10", "sunday 10-12", "sunday 12-2 ", "monday 8-10 ", "monday 10-12 ", "monday 12-2", "tuseday 8-10", " tuseday 10-12", "tuseday 12-2", " wednesday 10-12" }));
        jComboBoxLab_Time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLab_TimeActionPerformed(evt);
            }
        });

        jTextFieldFacutly.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldFacutly.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldFacutly.setForeground(new java.awt.Color(0, 0, 0));

        jButtonclear.setBackground(new java.awt.Color(100, 0, 250));
        jButtonclear.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButtonclear.setForeground(new java.awt.Color(0, 0, 0));
        jButtonclear.setText("Clear");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldFacutly)
                                .addComponent(jTextFieldname, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                .addComponent(jTextFieldCourse)
                                .addComponent(jTextFieldID)
                                .addComponent(jTextField5Level)
                                .addComponent(jTextFieldClass))
                            .addComponent(jComboBoxLab_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(238, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonclear, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jTextFieldname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldFacutly)
                        .addGap(5, 5, 5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jTextFieldCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5Level, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldClass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxLab_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(12, 12, 12)
                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButtonclear, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCourseActionPerformed

    }//GEN-LAST:event_jTextFieldCourseActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jTextFieldClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClassActionPerformed

    private void jComboBoxLab_TimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLab_TimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLab_TimeActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAddStudent;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonclear;
    private javax.swing.JComboBox<String> jComboBoxLab_Time;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField5Level;
    private javax.swing.JTextField jTextFieldClass;
    private javax.swing.JTextField jTextFieldCourse;
    private javax.swing.JTextField jTextFieldFacutly;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldname;
    // End of variables declaration//GEN-END:variables
public class loginButton implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jButtonclear) {

                jTextField5Level.setText("");
                jTextFieldID.setText("");
                jTextFieldClass.setText("");
                jComboBoxLab_Time.setSelectedIndex(0);
                jTextFieldCourse.setText("");
                jTextFieldFacutly.setText("");
                jTextFieldname.setText("");

            }
            if (e.getSource() == jButtonBack) {
                assistantList.get(assistantLogin.n).addStudent.setVisible(false);
                assistantList.get(assistantLogin.n).setVisible(true);

            }
            if (e.getSource() == jButtonAddStudent) {
                if (jTextFieldname.getText().length() == 0) {
                    JOptionPane.showMessageDialog(a, "Enter Your Name .");
                } else {
                    name = jTextFieldname.getText();
                    if (jTextFieldFacutly.getText().length() == 0) {
                        JOptionPane.showMessageDialog(a, "Enter Your FacutlyName .");
                    } else {
                        facutly = jTextFieldFacutly.getText();
                        if (jTextFieldCourse.getText().length() == 0) {
                            JOptionPane.showMessageDialog(a, "Enter Your CourseName .");
                        } else {
                            course = jTextFieldCourse.getText();
                            if (jTextFieldID.getText().length() == 0) {
                                JOptionPane.showMessageDialog(a, "Enter Your ID .");
                            } else {
                                Id = jTextFieldID.getText();

                                if (jTextField5Level.getText().length() == 0) {
                                    JOptionPane.showMessageDialog(a, "Enter Your LevelNo .");
                                } else {
                                    level = jTextField5Level.getText();

                                    if (jTextFieldClass.getText().length() == 0) {
                                        JOptionPane.showMessageDialog(a, "Enter Your ClassName .");
                                    } else {
                                        Class = jTextFieldClass.getText();
                                        String z[] = {" sunday 8-10", "sunday 10-12", "sunday 12-2 ", "monday 8-10 ",
                                            "monday 10-12 ", "monday 12-2", "tuseday 8-10", " tuseday 10-12", "tuseday 12-2",
                                            " wednesday 10-12"
                                        };
                                        int c;
                                        String select = "";
                                        for (int i = 0; i < z.length; i++) {
                                            if (i == jComboBoxLab_Time.getSelectedIndex()) {
                                                select = z[i];
                                            }

                                        }

                                        String x[] = {id + "", name, facutly, course, Id, level, Class, select};
                                        id++;

                                        assistantList.get(assistantLogin.n).viewStudent.setTabel(x);

                                        assistantList.get(assistantLogin.n).addStudent.setVisible(false);
                                        assistantList.get(assistantLogin.n).setVisible(true);
                                        jTextFieldClass.setText("");
                                        jTextField5Level.setText("");
                                        jTextFieldID.setText("");
                                        jTextFieldClass.setText("");
                                        jTextFieldCourse.setText("");
                                        jTextFieldFacutly.setText("");
                                        jTextFieldname.setText("");
                                        jComboBoxLab_Time.setSelectedIndex(0);
                                    }

                                }

                            }

                        }

                    }

                }
            }

        }
    }

}
