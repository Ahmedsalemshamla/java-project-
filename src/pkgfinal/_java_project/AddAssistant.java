package pkgfinal._java_project;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import pkgfinal._java_project.AdminSection;
import pkgfinal._java_project.ViewAssistant;
import pkgfinal._java_project.AdminLogin;
import static pkgfinal._java_project.AdminSection.addAssistant;
public class AddAssistant extends JFrame {
public static int numOfAssistant=0;
public static int id=1;
public static ArrayList<AssistantSection> assistantList=new ArrayList<AssistantSection> ();
    private String name, password, email, contentno;
    AddAssistant a;
     AssistantSection AssistantSectionO;

    public AddAssistant(boolean c) {
        initComponents();
        a = this;
        this.setVisible(c);
        this.setLocation(500, 200);
    
        jButtonAddAssistant.addActionListener(new AddAssistantButton());
         Back.addActionListener(new AddAssistantButton());}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldContentNo = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonAddAssistant = new javax.swing.JButton();
        jPasswordFieldPassWord = new javax.swing.JPasswordField();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(250, 250, 250));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Name:");

        jLabel2.setBackground(new java.awt.Color(250, 250, 250));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("PassWord :");

        jLabel3.setBackground(new java.awt.Color(250, 250, 250));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Email :");

        jLabel4.setBackground(new java.awt.Color(250, 250, 250));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Content No :");

        jLabel5.setBackground(new java.awt.Color(250, 250, 250));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Add Asistant");

        jTextFieldContentNo.setBackground(new java.awt.Color(250, 250, 250));
        jTextFieldContentNo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldContentNo.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldName.setBackground(new java.awt.Color(250, 250, 250));
        jTextFieldName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldName.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldEmail.setBackground(new java.awt.Color(250, 250, 250));
        jTextFieldEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(0, 0, 0));

        jButtonAddAssistant.setBackground(new java.awt.Color(100, 0, 250));
        jButtonAddAssistant.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButtonAddAssistant.setForeground(new java.awt.Color(0, 0, 0));
        jButtonAddAssistant.setText("Add Assistant");

        jPasswordFieldPassWord.setBackground(new java.awt.Color(250, 250, 250));
        jPasswordFieldPassWord.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPasswordFieldPassWord.setForeground(new java.awt.Color(0, 0, 0));

        Back.setBackground(new java.awt.Color(51, 102, 255));
        Back.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(0, 0, 0));
        Back.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jTextFieldContentNo, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldName)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEmail)
                                    .addComponent(jPasswordFieldPassWord, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
                                .addGap(169, 169, 169))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonAddAssistant, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldContentNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonAddAssistant, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
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
            java.util.logging.Logger.getLogger(AddAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new AddAssistant().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton jButtonAddAssistant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordFieldPassWord;
    private javax.swing.JTextField jTextFieldContentNo;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables

    public class AddAssistantButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           if (e.getSource() == jButtonAddAssistant) {
            if (jTextFieldName.getText().length() == 0) {
                JOptionPane.showMessageDialog(a, "enter the Assitant Name");
            } else {
                name = jTextFieldName.getText();
                if (jPasswordFieldPassWord.getText().length() == 0) {
                    JOptionPane.showMessageDialog(a, "Enter theAssistant PassWord");

                } else {
                    password = jPasswordFieldPassWord.getText();
                    if (jTextFieldEmail.getText().length() == 0) {
                        JOptionPane.showMessageDialog(a, "Enter theAssistant Email");
                    } else {
                        email = jTextFieldEmail.getText();
                        char s = email.charAt(0);
                        boolean x = false;
                        for (int i = 0; i < email.length(); i++) {
                             s = email.charAt(i);
                            if (s == '@') {
                                x = true;
                            }
                        }
                        if (!x) {
                            JOptionPane.showMessageDialog(a, "The email is not an Email");

                        }else{
                        if (jTextFieldContentNo.getText().length() == 0 ) {
                             JOptionPane.showMessageDialog(a, "Enter theAssistant ContentNo");
                        } else {
                           contentno=jTextFieldContentNo.getText();
                              JOptionPane.showMessageDialog(a, "Assistant Added successfully");
                              jPasswordFieldPassWord.setText("");
                              jTextFieldContentNo.setText("");
                              jTextFieldEmail.setText("");
                              jTextFieldName.setText("");
                              
                              
//                    //////    


String row[]={id+"",name,password,email,contentno};
id++;
  AssistantSectionO=  new AssistantSection(false);
    AdminSection.viewAssistant.ArrStr(row);
     assistantList.add(AssistantSectionO);

     addAssistant.setVisible(false);
AdminLogin.adminSection.setVisible(true);



                        }}
                    }
                }

            }
        }  
        else  if (e.getSource() == Back){
             addAssistant.setVisible(false);
   AdminLogin.adminSection.setVisible(true);
            }

    }
        
    }}
