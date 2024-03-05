package br.com.infoX.telas;

import br.com.infoX.dao.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author wb
 */
public class TelaUsuario extends javax.swing.JInternalFrame {

    private Connection conexao = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;

    public TelaUsuario() {
        initComponents();
        conexao = ModuloConexao.conector();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsuarioId = new javax.swing.JTextField();
        txtUsuarioNome = new javax.swing.JTextField();
        txtUsuarioLogin = new javax.swing.JTextField();
        txtUsuarioSenha = new javax.swing.JTextField();
        cbxUsuarioPerfil = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtUsuarioFone = new javax.swing.JTextField();
        btnUsuarioAdicionar = new javax.swing.JButton();
        btnUsuarioBuscar = new javax.swing.JButton();
        btnUsuarioAlterar = new javax.swing.JButton();
        btnUsuarioDeletar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuários");

        jLabel1.setText("*id:");

        jLabel2.setText("*Nome:");

        jLabel3.setText("*Login:");

        jLabel4.setText("*Senha:");

        jLabel5.setText("*Perfil:");

        cbxUsuarioPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "user" }));
        cbxUsuarioPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUsuarioPerfilActionPerformed(evt);
            }
        });

        jLabel6.setText("Fone:");

        btnUsuarioAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infoX/icones/create.png"))); // NOI18N
        btnUsuarioAdicionar.setToolTipText("Adicionar");
        btnUsuarioAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarioAdicionar.setPreferredSize(new java.awt.Dimension(80, 80));
        btnUsuarioAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioAdicionarActionPerformed(evt);
            }
        });

        btnUsuarioBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infoX/icones/read.png"))); // NOI18N
        btnUsuarioBuscar.setToolTipText("Consultar");
        btnUsuarioBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarioBuscar.setPreferredSize(new java.awt.Dimension(80, 80));
        btnUsuarioBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioBuscarActionPerformed(evt);
            }
        });

        btnUsuarioAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infoX/icones/update.png"))); // NOI18N
        btnUsuarioAlterar.setToolTipText("Alterar");
        btnUsuarioAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarioAlterar.setPreferredSize(new java.awt.Dimension(80, 80));
        btnUsuarioAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioAlterarActionPerformed(evt);
            }
        });

        btnUsuarioDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infoX/icones/delete.png"))); // NOI18N
        btnUsuarioDeletar.setToolTipText("Apagar");
        btnUsuarioDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarioDeletar.setPreferredSize(new java.awt.Dimension(80, 80));
        btnUsuarioDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioDeletarActionPerformed(evt);
            }
        });

        jLabel7.setText("* Campos Obrigatórios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUsuarioAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnUsuarioBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnUsuarioAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnUsuarioDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtUsuarioId, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtUsuarioNome, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbxUsuarioPerfil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtUsuarioFone, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(41, 41, 41)
                                    .addComponent(jLabel3))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addComponent(jLabel4)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUsuarioSenha)
                                .addComponent(txtUsuarioLogin)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuarioId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuarioNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtUsuarioFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUsuarioSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cbxUsuarioPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUsuarioAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuarioBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuarioAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuarioDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        setBounds(0, 0, 640, 491);
    }// </editor-fold>//GEN-END:initComponents

    private void cbxUsuarioPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUsuarioPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxUsuarioPerfilActionPerformed

    private void btnUsuarioBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioBuscarActionPerformed
        this.consultar();
    }//GEN-LAST:event_btnUsuarioBuscarActionPerformed

    private void btnUsuarioAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioAdicionarActionPerformed
        this.adicionar();
    }//GEN-LAST:event_btnUsuarioAdicionarActionPerformed

    private void btnUsuarioAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioAlterarActionPerformed
        this.alterar();
    }//GEN-LAST:event_btnUsuarioAlterarActionPerformed

    private void btnUsuarioDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioDeletarActionPerformed
        this.remover();
    }//GEN-LAST:event_btnUsuarioDeletarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsuarioAdicionar;
    private javax.swing.JButton btnUsuarioAlterar;
    private javax.swing.JButton btnUsuarioBuscar;
    private javax.swing.JButton btnUsuarioDeletar;
    private javax.swing.JComboBox<String> cbxUsuarioPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtUsuarioFone;
    private javax.swing.JTextField txtUsuarioId;
    private javax.swing.JTextField txtUsuarioLogin;
    private javax.swing.JTextField txtUsuarioNome;
    private javax.swing.JTextField txtUsuarioSenha;
    // End of variables declaration//GEN-END:variables

    private void consultar() {
        String sql = " select * from tbusuarios where iduser = ? ";

        try {

            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtUsuarioId.getText());
            rs = pst.executeQuery();

            if (rs.next()) {
                txtUsuarioNome.setText(rs.getString(2));
                txtUsuarioFone.setText(rs.getString(3));
                txtUsuarioLogin.setText(rs.getString(4));
                txtUsuarioSenha.setText(rs.getString(5));
                cbxUsuarioPerfil.setSelectedItem(rs.getString(6));
            } else {
                JOptionPane.showMessageDialog(null, "Usuario não encontrado, verifique o id informado!");
                txtUsuarioNome.setText(null);
                txtUsuarioFone.setText(null);
                txtUsuarioLogin.setText(null);
                txtUsuarioSenha.setText(null);
            }

            rs.close();
            pst.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void adicionar() {
        String sql = "insert into tbusuarios(iduser, usuario, fone, login, senha, perfil) values(?, ?, ?, ?, ?, ?)";

        try {

            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtUsuarioId.getText());
            pst.setString(2, txtUsuarioNome.getText());
            pst.setString(3, txtUsuarioFone.getText());
            pst.setString(4, txtUsuarioLogin.getText());
            pst.setString(5, txtUsuarioSenha.getText());
            pst.setString(6, cbxUsuarioPerfil.getSelectedItem().toString());
                     
            if ((txtUsuarioId.getText().isEmpty() || txtUsuarioNome.getText().isEmpty()) || (txtUsuarioLogin.getText().isEmpty()) || (txtUsuarioSenha.getText().isEmpty()) || (cbxUsuarioPerfil.getSelectedItem() == null)) {
                JOptionPane.showMessageDialog(null, " Por favor preencha todos os campos obrigatorios!");
            } else {
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário " + txtUsuarioNome.getText() + " adicionado com sucesso!");
                    txtUsuarioId.setText(null);
                    txtUsuarioNome.setText(null);
                    txtUsuarioFone.setText(null);
                    txtUsuarioLogin.setText(null);
                    txtUsuarioSenha.setText(null);
                }
            }

            pst.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void alterar() {
        String sql = "update tbusuarios set usuario = ?, fone = ?,  login = ?, senha = ?, perfil = ?  where iduser = ? ";
           
        try {
            
            pst = conexao.prepareStatement(sql);
                       
            pst.setString(1, txtUsuarioNome.getText());
            pst.setString(2, txtUsuarioFone.getText());
            pst.setString(3, txtUsuarioLogin.getText());
            pst.setString(4, txtUsuarioSenha.getText());
            pst.setString(5, cbxUsuarioPerfil.getSelectedItem().toString());
            pst.setString(6, txtUsuarioId.getText());
            
            if ((txtUsuarioId.getText().isEmpty() || txtUsuarioNome.getText().isEmpty()) || (txtUsuarioLogin.getText().isEmpty()) || (txtUsuarioSenha.getText().isEmpty()) || (cbxUsuarioPerfil.getSelectedItem() == null)) {
                JOptionPane.showMessageDialog(null, " Por favor preencha todos os campos obrigatorios!");
            } else {
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário " + txtUsuarioNome.getText() + " alterado com sucesso!");
                    txtUsuarioId.setText(null);
                    txtUsuarioNome.setText(null);
                    txtUsuarioFone.setText(null);
                    txtUsuarioLogin.setText(null);
                    txtUsuarioSenha.setText(null);
                }
            }

            pst.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }
    
    private void remover() {
        
        if (txtUsuarioId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, " Por favor preencha o campo id !");
        } else {
            this.consultar();
            String sql = " delete from tbusuarios where iduser = ? ";
            
             int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover este usuario ? ", "Atenção", JOptionPane.YES_NO_OPTION);
             if(confirma == JOptionPane.YES_OPTION) {
                try {
                   pst = conexao.prepareStatement(sql);
                   if (txtUsuarioId.getText().isEmpty()) {
                       JOptionPane.showMessageDialog(null, " Por favor preencha o campo id !");
                   } else {               
                       pst.setString(1, txtUsuarioId.getText());              
                       int removido = pst.executeUpdate();
                        if (removido > 0) {
                           JOptionPane.showMessageDialog(null, "Usuário removido com sucesso!");
                           txtUsuarioId.setText(null);
                           txtUsuarioNome.setText(null);
                           txtUsuarioFone.setText(null);
                           txtUsuarioLogin.setText(null);
                           txtUsuarioSenha.setText(null);
                       }
                   }
                   pst.close();           
                } catch (SQLException e) {
                   JOptionPane.showMessageDialog(null, e);
                }
             }
        }           
    }
}
