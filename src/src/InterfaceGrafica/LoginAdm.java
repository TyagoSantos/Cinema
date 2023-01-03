package InterfaceGrafica;


import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Objects;

public class LoginAdm extends JFrame  {

    JTextField caixausuario;
    JPasswordField caixasenha;

     private String usuario;
     private String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LoginAdm(){


        //----------- BOTÃO --------------------- //

        JButton botaoentrar = new JButton("ENTRAR");
        botaoentrar.setFont(new Font("arial", Font.BOLD, 15));
        botaoentrar.setBounds(420, 600, 120, 40);
        add(botaoentrar);

        JButton botaovoltar = new JButton("VOLTAR");
        botaovoltar.setFont(new Font("arial", Font.BOLD, 15));
        botaovoltar.setBounds(10, 20, 110, 30);
        add(botaovoltar);

        botaovoltar.addActionListener(this::voltar);
       botaoentrar.addActionListener(this::entrar);


        //------------------ TEXTFIELD ----------------------------//

        caixausuario = new JTextField();
        caixausuario.setBounds(390, 470, 200, 25);
        add(caixausuario);
        caixausuario.setToolTipText("Informe o USUÁRIO para fazer o login.");  //comando para deixar uma caixa de texto
                                                                                //ao passar o mouse em cima


        caixasenha = new JPasswordField();
        caixasenha.setBounds(390, 520, 200, 25);
        caixasenha.setToolTipText("Informe a SENHA para fazer o login.");
        add(caixasenha);


        //-------------- JPANEL E CONFIGS INICIAIS ----------------//
        JPanel login = new JPanel();
        login.setPreferredSize(new Dimension(1000, 1000));
        //login.setBackground(new Color(239, 151, 49));
        login.setLayout(null);
        login.setBounds(500, 400, 500, 500);
        add(login);
        pack();

        setVisible(true);
        setSize(1000, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);


        //----------------- LABELS -------------------------//

        JLabel titulo = new JLabel("CineIF PAULISTA");
        titulo.setFont(new Font("Arial",Font.BOLD,40));
        titulo.setBounds(330,10,500,100);
        titulo.setForeground(new Color(63, 164, 13, 236));
        login.add(titulo);

        JLabel lblusuario = new JLabel("USUÁRIO:");
        lblusuario.setFont(new Font("arial", Font.BOLD, 20));
        lblusuario.setBounds(290, 430, 100, 100);
        login.add(lblusuario);

        JLabel lblsenha = new JLabel("SENHA:");
        lblsenha.setFont(new Font("arial", Font.BOLD, 20));
        lblsenha.setBounds(310, 480, 100, 100);
        login.add(lblsenha);

        JLabel lbladm = new JLabel("ADMINISTRADOR");
        lbladm.setFont(new Font("arial", Font.BOLD, 25));
        lbladm.setBounds(370,380,500,100);
        login.add(lbladm);


        //----------------- IMAGEM -------------------------//
        ImageIcon logo_ifpe = new ImageIcon(Objects.requireNonNull(getClass().getResource("ifpe.png")));
        JLabel ifpe = new JLabel(logo_ifpe);

        login.add(ifpe);
        ifpe.setBounds(350,105,250,250);
    }


    //VERIFICAÇÃO LOGIN DO ADM
    private void entrar(ActionEvent actionEvent) {
        //credenciais provisórias
        setUsuario("adm");
        setSenha("123");

        if(caixausuario.getText().equals(usuario) && caixasenha.getText().equals(senha)){
        System.out.println("Login bem sucedido");
        }
        else{
        System.out.println("Falha no login");
        }

    }
    private void voltar(ActionEvent actionEvent) {

        TelaInicial voltar = new TelaInicial();
        voltar.setVisible(true);
        this.dispose();
    }
}