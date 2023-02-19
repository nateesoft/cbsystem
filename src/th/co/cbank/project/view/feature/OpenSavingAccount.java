package th.co.cbank.project.view.feature;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class OpenSavingAccount extends javax.swing.JDialog {

    public OpenSavingAccount(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblSelectSaveAccount = new javax.swing.JLabel();
        lblSaveAccountNo = new javax.swing.JLabel();
        cbAccountType = new javax.swing.JComboBox();
        txtAccountCode = new javax.swing.JTextField();
        lblSaveBookNo = new javax.swing.JLabel();
        txtAccountBookNo = new javax.swing.JTextField();
        lblSaveFee = new javax.swing.JLabel();
        txtAccountSaveFee = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        lblSaveEvidence = new javax.swing.JLabel();
        chkEvidenPersonalId = new javax.swing.JCheckBox();
        chkEvidenHomeAt = new javax.swing.JCheckBox();
        btnSaveAccOpen = new javax.swing.JButton();
        btnPrintSliplOpenAcc = new javax.swing.JButton();
        btnCancelOpenAccount = new javax.swing.JButton();
        lblSaveAccountNo1 = new javax.swing.JLabel();
        txtProfileCode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("เปิดบัญชีเงินฝาก");

        lblSelectSaveAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSelectSaveAccount.setText("เลือกบัญชี");

        lblSaveAccountNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSaveAccountNo.setText("เลขที่บัญชี");

        cbAccountType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbAccountType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAccountTypeItemStateChanged(evt);
            }
        });

        txtAccountCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAccountCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lblSaveBookNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSaveBookNo.setText("สมุดเล่มที่");

        txtAccountBookNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAccountBookNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lblSaveFee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSaveFee.setText("ค่าธรรมเนียม");

        txtAccountSaveFee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAccountSaveFee.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAccountSaveFee.setText("0.00");
        txtAccountSaveFee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAccountSaveFee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAccountSaveFeeFocusGained(evt);
            }
        });
        txtAccountSaveFee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAccountSaveFeeKeyPressed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setText("บาท");

        lblSaveEvidence.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSaveEvidence.setText("หลักฐาน");

        chkEvidenPersonalId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkEvidenPersonalId.setText("สำเนาบัตรประชาชน");

        chkEvidenHomeAt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkEvidenHomeAt.setText("สำเนาทะเบียนบ้าน");

        btnSaveAccOpen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveAccOpen.setText("บันทึกข้อมูล");
        btnSaveAccOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAccOpenActionPerformed(evt);
            }
        });

        btnPrintSliplOpenAcc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPrintSliplOpenAcc.setText("ออกสลิปใบเสร็จ");
        btnPrintSliplOpenAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintSliplOpenAccActionPerformed(evt);
            }
        });

        btnCancelOpenAccount.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelOpenAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelOpenAccount.setText("ยกเลิกรายการ");
        btnCancelOpenAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOpenAccountActionPerformed(evt);
            }
        });

        lblSaveAccountNo1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSaveAccountNo1.setText("รหัสสมาชิก");

        txtProfileCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtProfileCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblSelectSaveAccount)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSaveFee)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblSaveEvidence, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblSaveAccountNo, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblSaveBookNo, javax.swing.GroupLayout.Alignment.TRAILING)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblSaveAccountNo1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAccountSaveFee, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel32))
                            .addComponent(cbAccountType, 0, 276, Short.MAX_VALUE)
                            .addComponent(txtProfileCode)
                            .addComponent(txtAccountCode)
                            .addComponent(txtAccountBookNo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkEvidenPersonalId)
                            .addComponent(chkEvidenHomeAt)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSaveAccOpen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrintSliplOpenAcc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelOpenAccount)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSaveAccountNo1)
                    .addComponent(txtProfileCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelectSaveAccount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSaveAccountNo)
                    .addComponent(txtAccountCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccountBookNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaveBookNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSaveFee)
                    .addComponent(txtAccountSaveFee, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkEvidenPersonalId)
                        .addComponent(lblSaveEvidence))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(chkEvidenHomeAt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrintSliplOpenAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveAccOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelOpenAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbAccountTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAccountTypeItemStateChanged
        if (evt.getStateChange() == 1) {
            if (cbAccountType.getItemCount() > 0) {
//                showDocAuto1();
            }
        }
    }//GEN-LAST:event_cbAccountTypeItemStateChanged

    private void txtAccountSaveFeeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAccountSaveFeeFocusGained
        txtAccountSaveFee.selectAll();
    }//GEN-LAST:event_txtAccountSaveFeeFocusGained

    private void txtAccountSaveFeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccountSaveFeeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSaveAccOpen.requestFocus();
        }
    }//GEN-LAST:event_txtAccountSaveFeeKeyPressed

    private void btnSaveAccOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAccOpenActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "ท่านต้องการเปิดบัญชีเงินฝากใช่หรือไม่ ?");
        if (confirm == JOptionPane.YES_OPTION) {
//            saveOpenSave();
        }
    }//GEN-LAST:event_btnSaveAccOpenActionPerformed

    private void btnPrintSliplOpenAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintSliplOpenAccActionPerformed
        if (cbAccountType.getItemCount() > 0) {
//            PrintCOM pc = new PrintCOM();
//            pc.printFeeOpen(txtProfileCode.getText(), txtAccountSaveFee.getText());
        }
    }//GEN-LAST:event_btnPrintSliplOpenAccActionPerformed

    private void btnCancelOpenAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOpenAccountActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelOpenAccountActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                OpenSavingAccount dialog = new OpenSavingAccount(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelOpenAccount;
    private javax.swing.JButton btnPrintSliplOpenAcc;
    private javax.swing.JButton btnSaveAccOpen;
    private javax.swing.JComboBox cbAccountType;
    private javax.swing.JCheckBox chkEvidenHomeAt;
    private javax.swing.JCheckBox chkEvidenPersonalId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel lblSaveAccountNo;
    private javax.swing.JLabel lblSaveAccountNo1;
    private javax.swing.JLabel lblSaveBookNo;
    private javax.swing.JLabel lblSaveEvidence;
    private javax.swing.JLabel lblSaveFee;
    private javax.swing.JLabel lblSelectSaveAccount;
    private javax.swing.JTextField txtAccountBookNo;
    private javax.swing.JTextField txtAccountCode;
    private javax.swing.JTextField txtAccountSaveFee;
    private javax.swing.JTextField txtProfileCode;
    // End of variables declaration//GEN-END:variables
}
