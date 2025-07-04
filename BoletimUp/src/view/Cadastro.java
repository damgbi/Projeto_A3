
package view;

import controler.AlunoControler;
import controler.UsuarioControler;
import controler.campotxtEmail;
import javax.swing.JOptionPane;

public class Cadastro extends javax.swing.JFrame {

   
    public Cadastro() {
        initComponents();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        tipoUsuario = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        imagePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rightSpacePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cadastroPanel = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblSobrenome = new javax.swing.JLabel();
        txtSobrenome = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblSenhaCadastrar = new javax.swing.JLabel();
        pswdSenhaCadastrar = new javax.swing.JPasswordField();
        lblConfirmeSenha = new javax.swing.JLabel();
        pswdConfirmeSenha = new javax.swing.JPasswordField();
        btnCadastrar = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        lblNome1 = new javax.swing.JLabel();
        btnVoltarLogin = new javax.swing.JButton();
        lblCadastrese = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1292, 721));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/backgroundLoginCadastro.png"))); // NOI18N

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -7;
        gridBagConstraints.ipady = -8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(imagePanel, gridBagConstraints);

        rightSpacePanel.setOpaque(false);
        rightSpacePanel.setPreferredSize(new java.awt.Dimension(412, 722));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/BoletimUpIcon.png"))); // NOI18N

        cadastroPanel.setOpaque(false);

        lblNome.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        lblNome.setText("Nome ");

        txtNome.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtNome.setToolTipText("Seu Nome");
        txtNome.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeFocusGained(evt);
            }
        });
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblSobrenome.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        lblSobrenome.setText("Sobrenome");

        txtSobrenome.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtSobrenome.setToolTipText("Seu Sobrenome");
        txtSobrenome.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        txtSobrenome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSobrenomeFocusGained(evt);
            }
        });
        txtSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSobrenomeActionPerformed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        lblEmail.setText("E-mail");

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtEmail.setToolTipText("E-mail ex: exemplo@gmail.com");
        txtEmail.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblSenhaCadastrar.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        lblSenhaCadastrar.setText("Senha");

        pswdSenhaCadastrar.setToolTipText("Insira sua Senha");
        pswdSenhaCadastrar.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));

        lblConfirmeSenha.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        lblConfirmeSenha.setText("Confirme a senha:");

        pswdConfirmeSenha.setToolTipText("Confirme sua Senha");
        pswdConfirmeSenha.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        pswdConfirmeSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswdConfirmeSenhaActionPerformed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(102, 255, 102));
        btnCadastrar.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setToolTipText("");
        btnCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        tipoUsuario.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton1.setText("Professor");
        jRadioButton1.setToolTipText("botão Professor");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        tipoUsuario.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton2.setText("Aluno");
        jRadioButton2.setToolTipText("botão Aluno");

        lblNome1.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        lblNome1.setText("Você é :");

        btnVoltarLogin.setFont(new java.awt.Font("MS UI Gothic", 1, 12)); // NOI18N
        btnVoltarLogin.setForeground(new java.awt.Color(102, 102, 102));
        btnVoltarLogin.setText("Voltar para Login");
        btnVoltarLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnVoltarLogin.setBorderPainted(false);
        btnVoltarLogin.setContentAreaFilled(false);
        btnVoltarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cadastroPanelLayout = new javax.swing.GroupLayout(cadastroPanel);
        cadastroPanel.setLayout(cadastroPanelLayout);
        cadastroPanelLayout.setHorizontalGroup(
            cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastroPanelLayout.createSequentialGroup()
                        .addGroup(cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSobrenome)
                            .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(cadastroPanelLayout.createSequentialGroup()
                        .addGroup(cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSenhaCadastrar)
                            .addComponent(pswdSenhaCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblConfirmeSenha)
                            .addComponent(pswdConfirmeSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail)
                            .addGroup(cadastroPanelLayout.createSequentialGroup()
                                .addComponent(lblNome1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2)))
                        .addGap(0, 115, Short.MAX_VALUE))))
            .addGroup(cadastroPanelLayout.createSequentialGroup()
                .addGroup(cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastroPanelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadastroPanelLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnVoltarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cadastroPanelLayout.setVerticalGroup(
            cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastroPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cadastroPanelLayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadastroPanelLayout.createSequentialGroup()
                        .addComponent(lblSobrenome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(lblNome1))
                .addGap(18, 18, 18)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSenhaCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswdSenhaCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblConfirmeSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswdConfirmeSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnVoltarLogin)
                .addContainerGap())
        );

        txtEmail.getAccessibleContext().setAccessibleName("Email");
        pswdSenhaCadastrar.getAccessibleContext().setAccessibleName("Senha");
        pswdConfirmeSenha.getAccessibleContext().setAccessibleName("Confirme a senha");
        btnCadastrar.getAccessibleContext().setAccessibleName("Botão Cadastrar");
        btnCadastrar.getAccessibleContext().setAccessibleDescription("Botão Cadastrar");

        lblCadastrese.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        lblCadastrese.setText("Cadastre-se");

        javax.swing.GroupLayout rightSpacePanelLayout = new javax.swing.GroupLayout(rightSpacePanel);
        rightSpacePanel.setLayout(rightSpacePanelLayout);
        rightSpacePanelLayout.setHorizontalGroup(
            rightSpacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightSpacePanelLayout.createSequentialGroup()
                .addGroup(rightSpacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightSpacePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cadastroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(rightSpacePanelLayout.createSequentialGroup()
                        .addGroup(rightSpacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rightSpacePanelLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel2))
                            .addGroup(rightSpacePanelLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(lblCadastrese)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        rightSpacePanelLayout.setVerticalGroup(
            rightSpacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightSpacePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCadastrese)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cadastroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cadastroPanel.getAccessibleContext().setAccessibleDescription("");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 33;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel1.add(rightSpacePanel, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeFocusGained

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        campotxtEmail validarEmail = new campotxtEmail();
        UsuarioControler controler = new UsuarioControler();
        
        String nome = txtNome.getText().trim();
        String sobrenome = txtSobrenome.getText().trim();
        String nomeCompleto = nome + " " + sobrenome;
        String tipousuario = null;
        String email = txtEmail.getText().trim();
        String senha = new String(pswdSenhaCadastrar.getPassword());
        String senhaConfirmada = new String(pswdConfirmeSenha.getPassword());
        
        if (nome.isEmpty() || sobrenome.isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha os campos Nome e Sobrenome", "Erro",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (jRadioButton1.isSelected()) {
            tipousuario = "professor";
        } else if (jRadioButton2.isSelected()) {
            tipousuario = "aluno";
            
        } else if (!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) {
            JOptionPane.showMessageDialog(this, "Você precisa selecionar se é Professor ou Aluno.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!validarEmail.isEmailValido(email)) {
            JOptionPane.showMessageDialog(this, "E-mail inválido! Corrija antes de continuar, (ex:usuarioemail@gmail.com)");
            txtEmail.requestFocus();
            return;
        }
        
        
        if (senha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Insira uma senha", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (senha.length() < 8) {
            JOptionPane.showMessageDialog(this, "A senha deve conter pelo menos 8 caracteres", "Erro",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!senha.equals(senhaConfirmada)) {
            JOptionPane.showMessageDialog(this, "As senhas não coincidem.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        boolean sucesso;

        if (tipousuario.equals("aluno")) {
            AlunoControler alunoControler = new AlunoControler();
            sucesso = alunoControler.definirSenhaParaAluno(email, senha);

            if (sucesso) {
                JOptionPane.showMessageDialog(this, "Senha definida com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Erro: a senha já foi definida anteriormente ou o e-mail não é de um aluno válido.");
            }

        } else {
            
            sucesso = controler.cadastrar(nomeCompleto, email, senha, tipousuario);

            if (sucesso) {
                JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar usuário.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void pswdConfirmeSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswdConfirmeSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswdConfirmeSenhaActionPerformed

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtSobrenomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSobrenomeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSobrenomeFocusGained

    private void txtSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSobrenomeActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void btnVoltarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarLoginActionPerformed
        Login telaLogin = new Login();  
        telaLogin.setVisible(true);
        this.dispose();  // ← fechar a tela atual (Cadastro)
    }//GEN-LAST:event_btnVoltarLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltarLogin;
    private javax.swing.JPanel cadastroPanel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel lblCadastrese;
    private javax.swing.JLabel lblConfirmeSenha;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblSenhaCadastrar;
    private javax.swing.JLabel lblSobrenome;
    private javax.swing.JPasswordField pswdConfirmeSenha;
    private javax.swing.JPasswordField pswdSenhaCadastrar;
    private javax.swing.JPanel rightSpacePanel;
    private javax.swing.ButtonGroup tipoUsuario;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables
}
