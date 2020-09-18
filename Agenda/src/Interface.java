import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Interface extends javax.swing.JFrame {

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;
    private String id;
    
    
    public Interface() {
        initComponents();
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        n = new javax.swing.JLabel();
        nomes = new javax.swing.JTextField();
        cadastrar = new javax.swing.JButton();
        t = new javax.swing.JLabel();
        telefones = new javax.swing.JTextField();
        en = new javax.swing.JLabel();
        consulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        endereco = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        deletar = new javax.swing.JButton();
        identificador = new javax.swing.JLabel();
        escolha = new javax.swing.JTextField();
        identificador1 = new javax.swing.JLabel();
        n1 = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        en1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        enderecos = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        nome = new javax.swing.JTextArea();
        telefone = new javax.swing.JTextField();
        alterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        n.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        n.setText("Nome");

        nomes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cadastrar.setText("CADASTRAR");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        t.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t.setText("Telefone para localizar");

        telefones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        en.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        en.setText("Endereço");

        consulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        consulta.setText("CONSULTAR");
        consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaActionPerformed(evt);
            }
        });

        endereco.setColumns(20);
        endereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        endereco.setRows(5);
        jScrollPane1.setViewportView(endereco);

        resultado.setColumns(20);
        resultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resultado.setRows(5);
        jScrollPane2.setViewportView(resultado);

        deletar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deletar.setText("DELETAR");
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
            }
        });

        identificador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        identificador.setText("Telefone");

        escolha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        identificador1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        identificador1.setText("Alterar");

        n1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        n1.setText("Nome");

        t1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t1.setText("Telefone");

        en1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        en1.setText("Endereço");

        enderecos.setColumns(20);
        enderecos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enderecos.setRows(5);
        jScrollPane5.setViewportView(enderecos);

        nome.setColumns(20);
        nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nome.setRows(5);
        jScrollPane7.setViewportView(nome);

        telefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneActionPerformed(evt);
            }
        });

        alterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alterar.setText("ALTERAR");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(n1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(alterar)
                .addGap(97, 97, 97)
                .addComponent(en1)
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(t1)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(n)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(identificador)
                            .addComponent(en))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(escolha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deletar))
                    .addComponent(jScrollPane2)
                    .addComponent(nomes)
                    .addComponent(telefones)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(consulta))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(t)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefone)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(identificador1)
                .addGap(253, 253, 253))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(en)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar)
                    .addComponent(consulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(identificador)
                    .addComponent(escolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(identificador1)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(en1)
                    .addComponent(n1)
                    .addComponent(alterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        try
        {
            conectaBanco();
            String dados = nomes.getText();
            String telefone = telefones.getText();
            String end = endereco.getText();
            statement.executeUpdate("INSERT INTO cadastro (nome, telefone, endereco) VALUES ('"+dados+"','"+telefone+"','"+end+"')");
            JOptionPane.showMessageDialog(this,"Dados salvos!");
            nomes.setText("");
            telefones.setText("");
            endereco.setText("");
            connection.close();
        }
        catch(SQLException | HeadlessException e)
        {
            
        }
    }//GEN-LAST:event_cadastrarActionPerformed

    private void consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaActionPerformed
        resultado.setText("");
        try
        {
            conectaBanco();
            resultSet = statement.executeQuery("SELECT * FROM cadastro");
            while (resultSet.next())
            {
                String dados = resultSet.getString("nome");
                String telefone = resultSet.getString("telefone");
                String end = resultSet.getString("endereco");
                resultado.append(dados + "  |  " + telefone + "  |  " + end + "\n\n");
            }
            connection.close();
        }        
        catch(Exception e)
        {
            System.out.println("Não foi possivel consultar");
        }
    }//GEN-LAST:event_consultaActionPerformed

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
        try
        {
            conectaBanco();
            String telefone = escolha.getText();
            statement.executeUpdate("DELETE FROM cadastro WHERE telefone='"+telefone+"'");
            JOptionPane.showMessageDialog(this,"Deletado com sucesso!");
        }
        catch (Exception e)
        {
            System.out.println("Não localizaado!");
        }
    }//GEN-LAST:event_deletarActionPerformed

    private void telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        try
        {

            conectaBanco();
            String nom = nome.getText();
            String tel = telefone.getText();
            String ende = enderecos.getText();
            if(nom.isEmpty())
            {

            }
            else
            {
                statement.executeUpdate("UPDATE cadastro SET nome = '"+nom+"' WHERE telefone = '"+tel+"'");
            }
            if(ende.isEmpty())
            {

            }
            else
            {
                statement.executeUpdate("UPDATE cadastro SET endereco = '"+ende+"' WHERE telefone = '"+tel+"'");
            }
            JOptionPane.showMessageDialog(this,"Dados salvos!");
        }
        catch (Exception e)
        {
            System.out.println("Falha na alteração!");
        }
    }//GEN-LAST:event_alterarActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }
    
    public void conectaBanco()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10366208","sql10366208","ie14vb5uUu");
        statement = connection.createStatement();
        System.out.println("Banco de dados conectado com sucesso!");
        }
        catch (ClassNotFoundException | SQLException e)
        {
            System.out.println("Banco de Dados não conectado!");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton consulta;
    private javax.swing.JButton deletar;
    private javax.swing.JLabel en;
    private javax.swing.JLabel en1;
    private javax.swing.JTextArea endereco;
    private javax.swing.JTextArea enderecos;
    private javax.swing.JTextField escolha;
    private javax.swing.JLabel identificador;
    private javax.swing.JLabel identificador1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel n;
    private javax.swing.JLabel n1;
    private javax.swing.JTextArea nome;
    private javax.swing.JTextField nomes;
    private javax.swing.JTextArea resultado;
    private javax.swing.JLabel t;
    private javax.swing.JLabel t1;
    private javax.swing.JTextField telefone;
    private javax.swing.JTextField telefones;
    // End of variables declaration//GEN-END:variables
}
