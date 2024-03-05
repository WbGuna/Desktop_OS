package br.com.infoX.telas;

import br.com.infoX.dao.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author wb
 */
public class TelaCliente extends javax.swing.JInternalFrame {

    private Connection conexao = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;

    public TelaCliente() {
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
        btnClienteAdicionar = new javax.swing.JButton();
        btnClienteAlterar = new javax.swing.JButton();
        btnClienteDeletar = new javax.swing.JButton();
        txtClienteNome = new javax.swing.JTextField();
        txtClienteEndereco = new javax.swing.JTextField();
        txtClienteTelefone = new javax.swing.JTextField();
        txtClienteEmail = new javax.swing.JTextField();
        txtClientePesquisar = new javax.swing.JTextField();
        lblClienteBusca = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClienteClientes = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtClienteId = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cliente");
        setPreferredSize(new java.awt.Dimension(640, 491));

        jLabel1.setText("* Campos obrigatórios");

        jLabel2.setText("*Nome:");

        jLabel3.setText("Endereço:");

        jLabel4.setText("*Telefone");

        jLabel5.setText("email:");

        btnClienteAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infoX/icones/create.png"))); // NOI18N
        btnClienteAdicionar.setToolTipText("Adicionar");
        btnClienteAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClienteAdicionar.setPreferredSize(new java.awt.Dimension(80, 80));
        btnClienteAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteAdicionarActionPerformed(evt);
            }
        });

        btnClienteAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infoX/icones/update.png"))); // NOI18N
        btnClienteAlterar.setToolTipText("Alterar");
        btnClienteAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClienteAlterar.setPreferredSize(new java.awt.Dimension(80, 80));
        btnClienteAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteAlterarActionPerformed(evt);
            }
        });

        btnClienteDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infoX/icones/delete.png"))); // NOI18N
        btnClienteDeletar.setToolTipText("Excluir");
        btnClienteDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClienteDeletar.setPreferredSize(new java.awt.Dimension(80, 80));
        btnClienteDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteDeletarActionPerformed(evt);
            }
        });

        txtClientePesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientePesquisarActionPerformed(evt);
            }
        });
        txtClientePesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClientePesquisarKeyReleased(evt);
            }
        });

        lblClienteBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infoX/icones/pesquisar.png"))); // NOI18N

        tbClienteClientes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int ColIndex){
                return false;
            }
        };
        tbClienteClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Nome", "Endereço", "Telefone", "Email"
            }
        ));
        tbClienteClientes.setFocusable(false);
        tbClienteClientes.getTableHeader().setReorderingAllowed(false);
        tbClienteClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClienteClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbClienteClientes);

        jLabel6.setText("id:");

        txtClienteId.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtClientePesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblClienteBusca)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(btnClienteAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)
                                .addComponent(btnClienteAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133)
                                .addComponent(btnClienteDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtClienteEmail))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtClienteEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtClienteTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtClienteId, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtClientePesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblClienteBusca))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtClienteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtClienteEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtClienteTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtClienteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClienteAdicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClienteAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClienteDeletar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteAlterarActionPerformed
        this.alterar();
    }//GEN-LAST:event_btnClienteAlterarActionPerformed

    private void txtClientePesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientePesquisarActionPerformed

    }//GEN-LAST:event_txtClientePesquisarActionPerformed

    private void btnClienteAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteAdicionarActionPerformed
        this.adicionar();
    }//GEN-LAST:event_btnClienteAdicionarActionPerformed

    private void txtClientePesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClientePesquisarKeyReleased
        this.pesquisarCliente();
    }//GEN-LAST:event_txtClientePesquisarKeyReleased

    private void tbClienteClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClienteClientesMouseClicked
        this.setarCampos();
    }//GEN-LAST:event_tbClienteClientesMouseClicked

    private void btnClienteDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteDeletarActionPerformed
        this.remover();
    }//GEN-LAST:event_btnClienteDeletarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClienteAdicionar;
    private javax.swing.JButton btnClienteAlterar;
    private javax.swing.JButton btnClienteDeletar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClienteBusca;
    private javax.swing.JTable tbClienteClientes;
    private javax.swing.JTextField txtClienteEmail;
    private javax.swing.JTextField txtClienteEndereco;
    private javax.swing.JTextField txtClienteId;
    private javax.swing.JTextField txtClienteNome;
    private javax.swing.JTextField txtClientePesquisar;
    private javax.swing.JTextField txtClienteTelefone;
    // End of variables declaration//GEN-END:variables

    private void pesquisarCliente() {
        String sql = " select idcli as id, nomecli as Nome, endcli as Endereço, fonecli as Telefone, emailcli as Email from tbclientes where nomecli like ? ";

        try {

            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtClientePesquisar.getText() + "%");
            rs = pst.executeQuery();
            tbClienteClientes.setModel(DbUtils.resultSetToTableModel(rs)); // Biblioteca rs2xml.jar - este método é quem popula a tabela!

            rs.close();
            pst.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void setarCampos() {
        int setar = tbClienteClientes.getSelectedRow();
        txtClienteId.setText(tbClienteClientes.getModel().getValueAt(setar, 0).toString());
        txtClienteNome.setText(tbClienteClientes.getModel().getValueAt(setar, 1).toString());
        txtClienteEndereco.setText(tbClienteClientes.getModel().getValueAt(setar, 2).toString());
        txtClienteTelefone.setText(tbClienteClientes.getModel().getValueAt(setar, 3).toString());
        txtClienteEmail.setText(tbClienteClientes.getModel().getValueAt(setar, 4).toString());

        btnClienteAdicionar.setEnabled(false);

    }

    private void adicionar() {
        String sql = "insert into tbclientes(nomecli,  endcli, fonecli, emailcli) values(?, ?, ?, ?)";

        try {

            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtClienteNome.getText());
            pst.setString(2, txtClienteEndereco.getText());
            pst.setString(3, txtClienteTelefone.getText());
            pst.setString(4, txtClienteEmail.getText());

            if ((txtClienteNome.getText().isEmpty() || txtClienteTelefone.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, " Por favor preencha todos os campos obrigatorios!");
            } else {
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente " + txtClienteNome.getText() + " adicionado com sucesso!");
                    this.limpar();
                }
            }

            pst.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void alterar() {
        String sql = "update tbclientes set nomecli = ?, endcli = ?,  fonecli = ?, emailcli = ? where idcli= ? ";

        try {

            pst = conexao.prepareStatement(sql);

            pst.setString(1, txtClienteNome.getText());
            pst.setString(2, txtClienteEndereco.getText());
            pst.setString(3, txtClienteTelefone.getText());
            pst.setString(4, txtClienteEmail.getText());
            pst.setString(5, txtClienteId.getText());

            if ((txtClienteNome.getText().isEmpty() || txtClienteTelefone.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, " Por favor preencha todos os campos obrigatorios!");
            } else {
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente " + txtClienteNome.getText() + " alterado com sucesso!");
                   this.limpar();
                }
            }

            pst.close();
            btnClienteAdicionar.setEnabled(true);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void remover() {

        String sql = " delete from tbclientes where idcli = ? ";

        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover este Cliente ? ", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtClienteId.getText());
                int removido = pst.executeUpdate();
                if (removido > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente removido com sucesso!");

                }
                pst.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    private void limpar() {
        txtClientePesquisar.setText(null);
        txtClienteId.setText(null);
        txtClienteNome.setText(null);
        txtClienteEndereco.setText(null);
        txtClienteTelefone.setText(null);
        txtClienteEmail.setText(null);
        ((DefaultTableModel) tbClienteClientes.getModel()).setRowCount(0);

    }
}
