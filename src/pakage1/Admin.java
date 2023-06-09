/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakage1;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static pakage1.patientList.patienttable;

/**
 *
 * @author zanec
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        ImageIcon icon2= new ImageIcon(getClass().getResource("doctor.png"));
         Image img2= icon2.getImage().getScaledInstance(doctor.getWidth(), doctor.getHeight(), Image.SCALE_SMOOTH);
         doctor.setIcon(new ImageIcon(img2));
         
         ImageIcon icon3= new ImageIcon(getClass().getResource("arrow2.png"));
         Image img3= icon3.getImage().getScaledInstance(arrows.getWidth(), arrows.getHeight(), Image.SCALE_SMOOTH);
         arrows.setIcon(new ImageIcon(img3));
         
         ImageIcon icon4= new ImageIcon(getClass().getResource("logout.png"));
         Image img4= icon4.getImage().getScaledInstance(logout.getWidth(), logout.getHeight(), Image.SCALE_SMOOTH);
         logout.setIcon(new ImageIcon(img4));
         btn1.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        firstPanel = new javax.swing.JPanel();
        doctor = new javax.swing.JLabel();
        admin_User = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        arrows = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        logout = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        doctorlist = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        tab = new javax.swing.JTabbedPane();
        Book = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        middle = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        next = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        appointment = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        summary = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firstPanel.setBackground(new java.awt.Color(183, 30, 30));
        firstPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pakage1/doctor.png"))); // NOI18N
        firstPanel.add(doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 26, 37, 31));

        admin_User.setBackground(new java.awt.Color(183, 30, 30));
        admin_User.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        admin_User.setForeground(new java.awt.Color(255, 255, 255));
        admin_User.setText("Dr. Username");
        firstPanel.add(admin_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 75, 129, 21));

        jLabel3.setBackground(new java.awt.Color(183, 30, 30));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("49-123-459-1");
        firstPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 102, 129, -1));

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn1.setText("BOOK");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        firstPanel.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 130, -1));

        arrows.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pakage1/arrow2.png"))); // NOI18N
        firstPanel.add(arrows, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 34, 31));

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn2.setText("APPOINTMENTS");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        firstPanel.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 30));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pakage1/logout.png"))); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        firstPanel.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 457, 36, 31));

        jLabel4.setBackground(new java.awt.Color(183, 30, 30));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Log out");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        firstPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 494, 60, 30));

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn4.setText("Patient List");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        firstPanel.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 230, 30));

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn3.setText("SUMMARY");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        firstPanel.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 130, 30));

        doctorlist.setBackground(new java.awt.Color(255, 255, 255));
        doctorlist.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        doctorlist.setText("Doctor List");
        doctorlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorlistActionPerformed(evt);
            }
        });
        firstPanel.add(doctorlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 230, 30));

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn5.setText("Appointment List");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        firstPanel.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 230, 30));

        jPanel1.add(firstPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 540));

        tab.setBackground(new java.awt.Color(255, 255, 255));

        Book.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(183, 30, 30));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(183, 30, 30));
        jLabel1.setText("Last name:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 0, -1, 44));

        lastname.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lastname.setForeground(new java.awt.Color(183, 30, 30));
        lastname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lastname.setBorder(null);
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel4.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 312, 44));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 312, 11));

        jLabel8.setBackground(new java.awt.Color(183, 30, 30));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(183, 30, 30));
        jLabel8.setText("First name:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 66, -1, 44));

        firstname.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        firstname.setForeground(new java.awt.Color(183, 30, 30));
        firstname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        firstname.setBorder(null);
        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        jPanel4.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 66, 312, 44));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 116, 312, 11));

        jLabel9.setBackground(new java.awt.Color(183, 30, 30));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(183, 30, 30));
        jLabel9.setText("Middle name:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 133, -1, 44));

        middle.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        middle.setForeground(new java.awt.Color(183, 30, 30));
        middle.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        middle.setBorder(null);
        middle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middleActionPerformed(evt);
            }
        });
        jPanel4.add(middle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 133, 312, 44));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 183, 312, 11));

        jLabel10.setBackground(new java.awt.Color(183, 30, 30));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(183, 30, 30));
        jLabel10.setText("Date (mm/dd/yy):");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 267, -1, 44));

        date.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        date.setForeground(new java.awt.Color(183, 30, 30));
        date.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        date.setBorder(null);
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        jPanel4.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 267, 312, 44));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 317, 312, 11));

        jLabel11.setBackground(new java.awt.Color(183, 30, 30));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(183, 30, 30));
        jLabel11.setText("Time:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 334, -1, 44));

        time.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        time.setForeground(new java.awt.Color(183, 30, 30));
        time.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        time.setBorder(null);
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });
        jPanel4.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 334, 312, 44));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 384, 312, 11));

        next.setBackground(new java.awt.Color(255, 255, 255));
        next.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        next.setForeground(new java.awt.Color(183, 30, 30));
        next.setText("SUBMIT");
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nextMouseExited(evt);
            }
        });
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel4.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 400, 120, 36));

        cancel.setBackground(new java.awt.Color(255, 255, 255));
        cancel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(183, 30, 30));
        cancel.setText("CANCEL");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel4.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 120, 36));

        jLabel12.setBackground(new java.awt.Color(183, 30, 30));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(183, 30, 30));
        jLabel12.setText("Phone number:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 200, -1, 44));

        phone.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        phone.setForeground(new java.awt.Color(183, 30, 30));
        phone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        phone.setBorder(null);
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        jPanel4.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 312, 44));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 312, 11));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 78, 630, 473));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(183, 30, 30));
        jLabel7.setText("PATIENT INFORMATION");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 21, 230, 31));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("__");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 40, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 40, 30));

        javax.swing.GroupLayout BookLayout = new javax.swing.GroupLayout(Book);
        Book.setLayout(BookLayout);
        BookLayout.setHorizontalGroup(
            BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        BookLayout.setVerticalGroup(
            BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tab.addTab("tab1", Book);

        appointment.setBackground(new java.awt.Color(255, 255, 255));
        appointment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lastname", "Firstname", "Middle", "Phone", "Date", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(5).setResizable(false);
        }

        appointment.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 558, 343));

        jLabel2.setBackground(new java.awt.Color(183, 30, 30));
        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(183, 30, 30));
        jLabel2.setText("List of patients");
        appointment.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 39));

        tab.addTab("tab2", appointment);

        summary.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Summary");
        summary.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 207, -1, -1));

        tab.addTab("tab3", summary);

        jPanel1.add(tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, -30, 630, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        tab.setSelectedIndex(1);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        tab.setSelectedIndex(0);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        tab.setSelectedIndex(2);
    }//GEN-LAST:event_btn3ActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        loginForm main = new loginForm();      
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        patientList ut = new patientList();
        ut.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn4ActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        lastname.setText("");
        firstname.setText("");
        middle.setText("");
        phone.setText("");
        date.setText("");
        time.setText("");

    }//GEN-LAST:event_cancelActionPerformed

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        // TODO add your handling code here:
        cancel.setBackground(new Color(255,255,255));
        cancel.setForeground(new Color(183,30,30));
    }//GEN-LAST:event_cancelMouseExited

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        // TODO add your handling code here
        cancel.setBackground(new Color(183,30,30));
        cancel.setForeground(Color.WHITE);
    }//GEN-LAST:event_cancelMouseEntered

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        if(lastname.getText().isEmpty()||firstname.getText().isEmpty()||middle.getText().isEmpty()||date.getText().isEmpty()||time.getText().isEmpty()
            ||phone.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please Fill up other fields.","Message",JOptionPane.WARNING_MESSAGE);
        }else{
            String payment = JOptionPane.showInputDialog("Enter Payment(500): ");
            int quantity = Integer.parseInt(payment);
            while(quantity<500||quantity<1)
            {
                JOptionPane.showMessageDialog(null,"Invalid amount.");
                payment = JOptionPane.showInputDialog("Enter Payment(500): ");
                quantity = Integer.parseInt(payment);
            }
            float change = (float)quantity - 500;
            JOptionPane.showMessageDialog(null,"Change: "+change+" Appointment successfully booked.");
            Admin.AddRowToJTable(new Object[]{lastname.getText(),firstname.getText(),middle.getText(),phone.getText(),date.getText(),time.getText()});

            lastname.setText("");firstname.setText("");middle.setText("");phone.setText("");date.setText("");time.setText("");
            //       userTable user = new userTable();
            //       user.setVisible(true);
            //  this.dispose();
            //       User us = new User();
            //       us.setVisible(false);
        }
    }//GEN-LAST:event_nextActionPerformed

    private void nextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseExited
        // TODO add your handling code here:
        next.setBackground(new Color(255,255,255));
        next.setForeground(new Color(183,30,30));
    }//GEN-LAST:event_nextMouseExited

    private void nextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseEntered
        // TODO add your handling code here:
        next.setBackground(new Color(183,30,30));
        next.setForeground(Color.WHITE);
    }//GEN-LAST:event_nextMouseEntered

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void middleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middleActionPerformed

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        int a=JOptionPane.showConfirmDialog(null, "Confirm Exit?");
        if(a==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void doctorlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorlistActionPerformed
          doctorList dl = new doctorList();
          dl.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_doctorlistActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        appointmentList al = new appointmentList();
        al.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn5ActionPerformed

public static void AddRowToJTable(Object[] dataRow){
           DefaultTableModel model = (DefaultTableModel)table.getModel();
           model.addRow(dataRow);
       }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Book;
    public static javax.swing.JLabel admin_User;
    private javax.swing.JPanel appointment;
    private javax.swing.JLabel arrows;
    public static javax.swing.JButton btn1;
    public static javax.swing.JButton btn2;
    public static javax.swing.JButton btn3;
    public static javax.swing.JButton btn4;
    public static javax.swing.JButton btn5;
    private javax.swing.JButton cancel;
    public static javax.swing.JTextField date;
    private javax.swing.JLabel doctor;
    public static javax.swing.JButton doctorlist;
    private javax.swing.JPanel firstPanel;
    public static javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    public static javax.swing.JTextField lastname;
    private javax.swing.JLabel logout;
    public static javax.swing.JTextField middle;
    private javax.swing.JButton next;
    public static javax.swing.JTextField phone;
    private javax.swing.JPanel summary;
    private javax.swing.JTabbedPane tab;
    public static javax.swing.JTable table;
    public static javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables
}
