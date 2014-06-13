import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        JBentrar = new javax.swing.JToggleButton();
        JBcancelar = new javax.swing.JToggleButton();
        JTlogin = new javax.swing.JTextField();
        JPpassword = new javax.swing.JPasswordField();
        JLlogin = new javax.swing.JLabel();
        JLsenha = new javax.swing.JLabel();
        JLpcimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        JBentrar.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        JBentrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botoes_Site_5745_Knob_Valid_Green.png"))); // NOI18N
        JBentrar.setText("Entrar");
        JBentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBentrarActionPerformed(evt);
            }
        });
        getContentPane().add(JBentrar);
        JBentrar.setBounds(130, 180, 120, 34);

        JBcancelar.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        JBcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botoes_Site_5750_Knob_Cancel.png"))); // NOI18N
        JBcancelar.setText("Cancelar");
        JBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcancelarActionPerformed(evt);
            }
        });
        getContentPane().add(JBcancelar);
        JBcancelar.setBounds(260, 180, 130, 34);

        JTlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTloginActionPerformed(evt);
            }
        });
        getContentPane().add(JTlogin);
        JTlogin.setBounds(200, 110, 130, 20);
        getContentPane().add(JPpassword);
        JPpassword.setBounds(200, 140, 130, 20);

        JLlogin.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        JLlogin.setText("Login:");
        getContentPane().add(JLlogin);
        JLlogin.setBounds(140, 100, 53, 33);

        JLsenha.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        JLsenha.setText("Senha:");
        getContentPane().add(JLsenha);
        JLsenha.setBounds(130, 130, 59, 33);

        JLpcimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/computer-icon.png"))); // NOI18N
        getContentPane().add(JLpcimg);
        JLpcimg.setBounds(0, 60, 130, 140);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTloginActionPerformed

    private void JBentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBentrarActionPerformed
        try{ //tratamento de erros

        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");//Driver JDBC – Fonte de Dados ODBC

        //conecta no BD, as aspas vazias representam o Login: usuário e senha.

        Connection con = DriverManager.getConnection("jdbc:odbc:DB_Teste","","");

        Statement stmt = con.createStatement();       //objeto comdo sql

        int cadMat=Integer.parseInt( JTlogin.getText() );

        String cadNome = JTlogin.getText();      //obtém nome digitado

        stmt.executeUpdate("insert into TabFicha (Matricula,Nome) values ('" + cadMat + "','" + cadNome +  "')" );

        JOptionPane.showMessageDialog( this, " Dados Salvos! ");

        con.close();  // fecha conexão com BD

      }  catch( SQLException e){ //trata os erros SQL

            JOptionPane.showMessageDialog(this, "Erro Cmdo SQL " + e.getMessage() );

            } catch( ClassNotFoundException e){      //trata erros de conexão

             JOptionPane.showMessageDialog( this, " Driver não encontrado " );

}
    }//GEN-LAST:event_JBentrarActionPerformed

    private void JBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBcancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton JBcancelar;
    private javax.swing.JToggleButton JBentrar;
    private javax.swing.JLabel JLlogin;
    private javax.swing.JLabel JLpcimg;
    private javax.swing.JLabel JLsenha;
    private javax.swing.JPasswordField JPpassword;
    private javax.swing.JTextField JTlogin;
    // End of variables declaration//GEN-END:variables
}
