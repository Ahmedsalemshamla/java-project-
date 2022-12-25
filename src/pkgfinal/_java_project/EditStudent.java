package pkgfinal._java_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import static pkgfinal._java_project.AddAssistant.assistantList;
    
import static pkgfinal._java_project.AdminSection.addAssistant;

import static pkgfinal._java_project.MainWindow.assistantLogin;

public class EditStudent extends javax.swing.JFrame {

    EditStudent m;
    String s;
    String z[] = {" sunday 8-10", "sunday 10-12", "sunday 12-2 ", "monday 8-10 ",
        "monday 10-12 ", "monday 12-2", "tuseday 8-10", " tuseday 10-12", "tuseday 12-2",
        " wednesday 10-12"
    };
    String p;

    public EditStudent(boolean c) {
        initComponents();
        m = this;
        this.setVisible(c);
        this.setLocation(500, 200);
        jButtonloadRecord.addActionListener(new loginButton());
        jButtonUpdatestudent.addActionListener(new loginButton());
        jButtonBack.addActionListener(new loginButton());
    }

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jLabel1 = new javax.swing.JLabel();
        jButtonloadRecord = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldRollno = new javax.swing.JTextField();
        jTextFieldfacutly = new javax.swing.JTextField();
        jTextField_id = new javax.swing.JTextField();
        jTextFieldCourse = new javax.swing.JTextField();
        jTextField_level = new javax.swing.JTextField();
        jTextField_class = new javax.swing.JTextField();
        lab_Time = new javax.swing.JComboBox<>();
        jButtonUpdatestudent = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jLabel2, org.jdesktop.beansbinding.ELProperty.create("nullrfer"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        jLabel1.setBackground(new java.awt.Color(250, 250, 250));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Rolll No :");

        jButtonloadRecord.setBackground(new java.awt.Color(100, 0, 250));
        jButtonloadRecord.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButtonloadRecord.setForeground(new java.awt.Color(0, 0, 0));
        jButtonloadRecord.setText("Load Record");

        jLabel2.setBackground(new java.awt.Color(250, 250, 250));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Name :");

        jTextFieldName.setBackground(new java.awt.Color(250, 250, 250));
        jTextFieldName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldName.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setBackground(new java.awt.Color(250, 250, 250));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Facutly :");

        jLabel4.setBackground(new java.awt.Color(250, 250, 250));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Course :");

        jLabel5.setBackground(new java.awt.Color(250, 250, 250));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ID :");

        jLabel6.setBackground(new java.awt.Color(250, 250, 250));
        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Level :");

        jLabel7.setBackground(new java.awt.Color(250, 250, 250));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Class :");

        jLabel8.setBackground(new java.awt.Color(250, 250, 250));
        jLabel8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Lab_Time :");

        jTextFieldRollno.setBackground(new java.awt.Color(250, 250, 250));
        jTextFieldRollno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldRollno.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldfacutly.setBackground(new java.awt.Color(250, 250, 250));
        jTextFieldfacutly.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldfacutly.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_id.setBackground(new java.awt.Color(250, 250, 250));
        jTextField_id.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField_id.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldCourse.setBackground(new java.awt.Color(250, 250, 250));
        jTextFieldCourse.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldCourse.setForeground(new java.awt.Color(0, 0, 0));

        jTextField_level.setBackground(new java.awt.Color(250, 250, 250));
        jTextField_level.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField_level.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_level.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_levelActionPerformed(evt);
            }
        });

        jTextField_class.setBackground(new java.awt.Color(250, 250, 250));
        jTextField_class.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField_class.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_classActionPerformed(evt);
            }
        });

        lab_Time.setBackground(new java.awt.Color(0, 102, 153));
        lab_Time.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lab_Time.setForeground(new java.awt.Color(0, 0, 0));
        lab_Time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " sunday 8-10", "sunday 10-12", "sunday 12-2 ", "monday 8-10 ", "monday 10-12 ", "monday 12-2", "tuseday 8-10", " tuseday 10-12", "tuseday 12-2", " wednesday 10-12" }));

        jButtonUpdatestudent.setBackground(new java.awt.Color(51, 0, 153));
        jButtonUpdatestudent.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButtonUpdatestudent.setForeground(new java.awt.Color(0, 0, 0));
        jButtonUpdatestudent.setText("UpDate Student");

        jButtonBack.setBackground(new java.awt.Color(100, 0, 250));
        jButtonBack.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(0, 0, 0));
        jButtonBack.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_class)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonUpdatestudent)
                                    .addComponent(lab_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldRollno, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_level))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCourse))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldfacutly))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldName)))))
                .addGap(68, 68, 68)
                .addComponent(jButtonloadRecord))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonloadRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldRollno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldfacutly, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_class, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lab_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jButtonBack)
                .addGap(8, 8, 8)
                .addComponent(jButtonUpdatestudent, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_classActionPerformed

    }//GEN-LAST:event_jTextField_classActionPerformed

    private void jTextField_levelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_levelActionPerformed

    }//GEN-LAST:event_jTextField_levelActionPerformed

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
            java.util.logging.Logger.getLogger(EditStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonUpdatestudent;
    private javax.swing.JButton jButtonloadRecord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextFieldCourse;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldRollno;
    private javax.swing.JTextField jTextField_class;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_level;
    private javax.swing.JTextField jTextFieldfacutly;
    private javax.swing.JComboBox<String> lab_Time;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
public class loginButton implements ActionListener {
public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jButtonUpdatestudent) {
                if (jTextFieldRollno.getText().length() == 0) {
                    JOptionPane.showMessageDialog(m, "Enter Roll-No .");
                } else {
                    boolean v = true;
                    if (v) {
                        for (int i = 0; i < addAssistant.AssistantSectionO.addStudent.rows; i++) {
                            if ((addAssistant.AssistantSectionO.viewStudent.tab.getValueAt(i, 0)).toString().equals(s)) {

                                if (jTextFieldName.getText().length() != 0 && jTextFieldfacutly.getText().length() != 0
                                        && jTextFieldCourse.getText().length() != 0 && jTextField_id.getText().length() != 0
                                        && jTextField_level.getText().length() != 0 && jTextField_class.getText().length()
                                        != 0) {
                                    v = false;
                                    AddAssistant.assistantList.get(assistantLogin.n).viewStudent.tab.setValueAt(jTextFieldName.getText(), i, 1);
                                    AddAssistant.assistantList.get(assistantLogin.n).viewStudent.tab.setValueAt(jTextFieldfacutly.getText(), i, 2);
                                    AddAssistant.assistantList.get(assistantLogin.n).viewStudent.tab.setValueAt(jTextFieldCourse.getText(), i, 3);
                                    AddAssistant.assistantList.get(assistantLogin.n).viewStudent.tab.setValueAt(jTextField_id.getText(), i, 4);
                                    AddAssistant.assistantList.get(assistantLogin.n).viewStudent.tab.setValueAt(jTextField_level.getText(), i, 5);
                                    AddAssistant.assistantList.get(assistantLogin.n).viewStudent.tab.setValueAt(jTextField_class.getText(), i, 6);
                                    p = z[lab_Time.getSelectedIndex()];
                                    addAssistant.AssistantSectionO.viewStudent.tab.setValueAt(p, i, 7);
                                    JOptionPane.showMessageDialog(m, " All Data Upadted .");
                                  callEmptyField();
                                    assistantList.get(assistantLogin.n).setVisible(true);
                                    assistantList.get(assistantLogin.n).editStudent.setVisible(false);
                                } else {
                                    JOptionPane.showMessageDialog(m, "Enter All Data.");
                                }
                            }
                            if (v) {
                                jTextFieldRollno.setText("");
                                JOptionPane.showMessageDialog(m, "Enter Correct  Roll_No Number .");
                            }
                        }
                    }
                }
            }
            if (e.getSource() == jButtonloadRecord) {
                s = jTextFieldRollno.getText();
                boolean v = true;
                if (v) {
                    for (int i = 0; i < AddAssistant.assistantList.get(assistantLogin.n).addStudent.rows; i++) {
                        if ((AddAssistant.assistantList.get(assistantLogin.n).viewStudent.tab.getValueAt(i, 0)).toString().equals(s)) {
                            v = false;
                            jTextFieldName.setText((String) AddAssistant.assistantList.get(assistantLogin.n).viewStudent.tab.getValueAt(i, 1   ));
                            jTextFieldfacutly.setText((String) AddAssistant.assistantList.get(assistantLogin.n).viewStudent.tab.getValueAt(i, 2));
                            jTextFieldCourse.setText((String) AddAssistant.assistantList.get(assistantLogin.n).viewStudent.tab.getValueAt(i, 3 ));
                            jTextField_id.setText((String) AddAssistant.assistantList.get(assistantLogin.n).viewStudent.tab.getValueAt(i, 4    ));
                            jTextField_level.setText((String) AddAssistant.assistantList.get(assistantLogin.n).viewStudent.tab.getValueAt(i, 5 ));
                            jTextField_class.setText((String) AddAssistant.assistantList.get(assistantLogin.n).viewStudent.tab.getValueAt(i, 6 ));

                            for (int x = 0; x < z.length; x++) {
                                if (z[x].equals(AddAssistant.assistantList.get(assistantLogin.n).viewStudent.tab.getValueAt(i, 7) + "")) {
                                    lab_Time.setSelectedIndex(x);
                                }
                            }
                        }
                    }
                }
                if (v) {
                    JOptionPane.showMessageDialog(m, "Enter Correct  Roll_No Number .");
                    jTextFieldRollno.setText("");
                }
            }
            if (e.getSource() == jButtonBack) {
                callEmptyField();
      
                assistantList.get(assistantLogin.n).setVisible(true);
                assistantList.get(assistantLogin.n).editStudent.setVisible(false);
            }
        }
    }
public void callEmptyField(){
  jTextFieldName.setText("");
                jTextFieldfacutly.setText("");
                jTextFieldCourse.setText("");
                jTextField_id.setText("");
                jTextField_level.setText("");
                jTextField_class.setText("");
                lab_Time.setSelectedIndex(0);
                jTextFieldRollno.setText("");
                jTextFieldRollno.setText("");

}
}
