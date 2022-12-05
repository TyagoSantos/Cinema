import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class LoginAdm extends JFrame {

    public LoginAdm(){

        //----------- BOTÃO --------------------- //

        JButton botaoentrar = new JButton("ENTRAR");
        botaoentrar.setFont(new Font("arial",Font.BOLD,15));
        botaoentrar.setBounds(230,250,120,40);
        add(botaoentrar);

        JButton botaovoltar = new JButton("VOLTAR");
        botaovoltar.setFont(new Font("arial",Font.BOLD,15));
        botaovoltar.setBounds(10,20,110,30);
        add(botaovoltar);

        botaovoltar.addActionListener(this::voltar);

        //------------------ TEXTFIELD ----------------------------//

        JTextField caixausuario = new JTextField();
        caixausuario.setBounds(190,130,200,20);
        add(caixausuario);


        JPasswordField caixasenha = new JPasswordField();
        caixasenha.setBounds(190,190,200,20);
        add(caixasenha);

        //-------------- JPANEL E CONFIGS INICIAIS ----------------//
        JPanel login = new JPanel();
        login.setPreferredSize(new Dimension(500,500));
        login.setBackground(new Color(239, 151, 49));
        login.setLayout(null);
        login.setBounds(500,400,500,500);
        add(login);
        pack();

        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);


        //----------------- LABELS -------------------------//

        JLabel lblusuario = new JLabel("USUÁRIO:");
        lblusuario.setFont(new Font("arial",Font.BOLD,15));
        lblusuario.setBounds(100,90,100,100);
        login.add(lblusuario);

        JLabel lblsenha = new JLabel("SENHA:");
        lblsenha.setFont(new Font("arial",Font.BOLD,15));
        lblsenha.setBounds(110,150,100,100);
        login.add(lblsenha);

    }

    private void voltar(ActionEvent actionEvent) {
        TelaInicial voltar = new TelaInicial();
        voltar.setVisible(true);
        this.dispose();

    }


}
