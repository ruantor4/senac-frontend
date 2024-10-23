import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class TelaDeCadastro extends JFrame{
    public final JLabel lblNome;
    public final JTextField txtNome;

    public final JLabel lblEmail;
    public final JTextField txtEmail;

    public final JLabel lblSenha;
    public final JPasswordField txtSenha;

    public final JButton btnCadastrar;
    public final JButton btnCancelar;

    public final JLabel lblNotificacaoes;

    public TelaDeCadastro(){

        super("Tela de cadastro");
        setLayout(new GridLayout(5, 1, 5, 5));

        JPanel linhaNome = new JPanel(new GridLayout(1, 2));

        lblNome = new JLabel("Nome", SwingConstants.CENTER);
        txtNome = new JTextField(10);
        
        linhaNome.add(lblNome);
        linhaNome.add(txtNome);

        add(linhaNome);



        JPanel linhaEmail = new JPanel(new GridLayout(1, 2));

        lblEmail = new JLabel("Email", SwingConstants.CENTER);
        txtEmail = new JTextField(10);

        linhaEmail.add(lblEmail);
        linhaEmail.add(txtEmail);

        add(linhaEmail);



        JPanel linhaSenha = new JPanel(new GridLayout(1, 2));

        lblSenha = new JLabel("Senha", SwingConstants.CENTER);
        txtSenha = new JPasswordField(10);

        linhaSenha.add(lblSenha);
        linhaSenha.add(txtSenha);

        add(linhaSenha);



        JPanel linhaBotoes = new JPanel(new GridLayout(1 , 2));

        btnCadastrar = new JButton("Cadastrar");
        btnCancelar = new JButton("Cancelar");

        linhaBotoes.add(btnCadastrar);
        linhaBotoes.add(btnCancelar);

        add(linhaBotoes);


        JPanel linhaNotificacoes = new JPanel(new GridLayout(1, 1));

        lblNotificacaoes = new JLabel("Notificações", SwingConstants.CENTER);

        linhaNotificacoes.add(lblNotificacaoes);

        add(linhaNotificacoes);

        btnCadastrar.addActionListener(
            new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent event){
                if (txtNome.getText().trim().length() == 0) {
                    lblNotificacaoes.setText("É necessario digiitar alguma cois no campo Nome. Por favor, digite um caracter valido no campo Nome para proseguir.");
                    txtNome.requestFocus();
                    return;
                }
                
                if (txtEmail.getText().trim().length() == 0){
                    lblNotificacaoes.setText("É necessario digitar alguma coisa no campo Email. Por favor, digite um caracter valido no campo Email para proseguir.");
                    txtEmail.requestFocus();
                    return;
                }
                
                if (String.valueOf(txtSenha.getPassword()).trim().length() == 0){
                    lblNotificacaoes.setText("É necessario digitar alguma coisa no campo Senha. Por favor, digite um caracter valido no campo Senha para proseguir.");
                    txtSenha.requestFocus();
                    return;
                }

                String strSqlCadastrar = "Insert into `login`.`tbl_login`(`nome`,`email`, `senha`) values ('" 
                + txtNome.getText() + "','" + txtEmail.getText() + "','" + String.valueOf(txtSenha.getPassword()) 
                + "');";
                try{
                    Connection connection = MySQLConnector.conectar();
                    Statement stmSqlCadastrar = connection.createStatement();
                    stmSqlCadastrar.addBatch(strSqlCadastrar);
                    stmSqlCadastrar.executeBatch();
                    lblNotificacaoes.setText("Cadastro Realizado com sucesso!");
                }catch(Exception e){
                    lblNotificacaoes.setText("Ops! Ocorreu um problema e não será possivel cadastrar nesse momento. Por favor, tente novamente mais tarde");
                    System.out.println("Erro: "+e);
                }

            }
            }

        
        
        );
        btnCancelar.addActionListener(
            new ActionListener() {
            
                @Override
                public void actionPerformed(ActionEvent event){
                    txtNome.setText("");
                    txtEmail.setText("");
                    txtSenha.setText("");
                    
                    if (JOptionPane.showConfirmDialog(null, "Deseja mesmo sair?") ==0 ) {
                        System.exit(0);
                    } else {
                        txtNome.requestFocus();
                    }
                }
            }

        );

        setSize(300, 300);
        setVisible(true);
    }


    public static void main(String[] args){
        TelaDeCadastro appTelaDeCadastro = new TelaDeCadastro();
        appTelaDeCadastro.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}