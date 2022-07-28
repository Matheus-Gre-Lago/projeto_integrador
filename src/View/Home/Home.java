package View.Home;

import View.Empresa.EmpresaCadastro;
import View.Login.Login;
import View.Usuario.UsuarioCadastro;
import View.Usuario.UsuarioEditarExcluir;
import View.Venda.Venda;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelEvento;
import services.ServicosEvento;
import services.ServicosFactory;

public class Home extends javax.swing.JFrame {
    
    boolean login = true;

    public Home() {
        initComponents();
        atualizarTabelaHome();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        buttonCadastroEmpresa = new javax.swing.JButton();
        buttonLogin = new javax.swing.JButton();
        buttonCadastroUser = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHomeEvento = new javax.swing.JTable();
        buttonCompra = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelLogo.setFont(new java.awt.Font("Segoe UI", 2, 48)); // NOI18N
        labelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogo.setText("Beer convivium");

        buttonCadastroEmpresa.setForeground(new java.awt.Color(51, 51, 255));
        buttonCadastroEmpresa.setText("SEJA UM PODUTOR");
        buttonCadastroEmpresa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttonCadastroEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastroEmpresaActionPerformed(evt);
            }
        });

        buttonLogin.setForeground(new java.awt.Color(51, 51, 255));
        buttonLogin.setText("ACESSE SUA CONTA");
        buttonLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        buttonCadastroUser.setForeground(new java.awt.Color(51, 51, 255));
        buttonCadastroUser.setText("CADASTRE-SE");
        buttonCadastroUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        buttonCadastroUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastroUserActionPerformed(evt);
            }
        });

        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));

        jSeparator2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));

        tableHomeEvento.setBackground(new java.awt.Color(204, 204, 204));
        tableHomeEvento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Evento", "Empresa"
            }
        ));
        tableHomeEvento.setSelectionForeground(new java.awt.Color(51, 51, 255));
        jScrollPane1.setViewportView(tableHomeEvento);

        buttonCompra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonCompra.setText("Compre o seu ingresso ");
        buttonCompra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), null));
        buttonCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCompraActionPerformed(evt);
            }
        });

        jSeparator3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 131, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonCadastroEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonCadastroUser, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119))))))
            .addComponent(jSeparator3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCadastroEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCadastroUser, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(buttonCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        buttonCadastroEmpresa.getAccessibleContext().setAccessibleDescription("");

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
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCadastroEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastroEmpresaActionPerformed
        EmpresaCadastro pagina = new EmpresaCadastro();
        pagina.setVisible(true);
    }//GEN-LAST:event_buttonCadastroEmpresaActionPerformed

    private void buttonCadastroUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastroUserActionPerformed
        UsuarioCadastro pagina = new UsuarioCadastro();
        pagina.setVisible(true);
    }//GEN-LAST:event_buttonCadastroUserActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        if(buttonLogin.getText().equals("ACESSE SUA CONTA")){
            Login pagina = new Login();
            pagina.setVisible(true);
            
            if(pagina.login){
                buttonLogin.getText().equals("Edite sua Conta");
                System.out.println(login);
            }
        }else{
            UsuarioEditarExcluir pagina = new UsuarioEditarExcluir();
            pagina.setVisible(true);
        }
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void buttonCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCompraActionPerformed
        if(login){
            Venda venda = new Venda();
            venda.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this,  "Você precisa logar para acessar a compra");
        }
    }//GEN-LAST:event_buttonCompraActionPerformed


    public void atualizarTabelaHome(){
        DefaultTableModel modelTable = (DefaultTableModel) tableHomeEvento.getModel();
        modelTable.getDataVector().removeAllElements();
        modelTable.fireTableDataChanged();
        
        Object rowData[] = new Object[3];
        ServicosEvento eventoServicos =  ServicosFactory.getEventoServicos();
        
        try {
            for(ModelEvento evento : eventoServicos.getEvento()){
                rowData[0] = evento.getNome();
                rowData[1] = evento.getIdEmpresa();
                modelTable.addRow(rowData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastroEmpresa;
    private javax.swing.JButton buttonCadastroUser;
    private javax.swing.JButton buttonCompra;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JTable tableHomeEvento;
    // End of variables declaration//GEN-END:variables
}
