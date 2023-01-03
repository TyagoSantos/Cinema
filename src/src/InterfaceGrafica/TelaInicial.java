package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Objects;
import javax.swing.ImageIcon;



public class TelaInicial extends JFrame  {


    public TelaInicial(){

        //CONFIGURAÇÕES INICIAIS

        setVisible(true);
        setTitle("cineIF PAULISTA");
        setSize(1000,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);


        //---------------------- LABELS ---------------------------------//

        //TITULO
        JLabel titulo = new JLabel("CineIF PAULISTA");
        titulo.setFont(new Font("Arial",Font.BOLD,40));
        titulo.setBounds(330,10,500,100);
        titulo.setForeground(new Color(63, 164, 13, 236));
        add(titulo);

        //FILMES DESTAQUES
        JLabel destaques = new JLabel("EM DESTAQUE");
        destaques.setFont(new Font("Arial",Font.BOLD,20));
        destaques.setBounds(430,180,300,100);
        destaques.setForeground(new Color(10,10,10));
        add(destaques);


        //----------------------BOTOES----------------------------------//

        //BOTÃO INFORMAÇÃO
        JButton helpInicial = new JButton("Help");
        helpInicial.setBounds(900,20,60,25);
        add(helpInicial);

        //BOTAO VER TODOS OS FILMES
        JButton todos_os_filmes = new JButton("Ver todos os filmes");
        todos_os_filmes.setBounds(790,150,150,30);
        todos_os_filmes.setFont(new Font("arial",Font.BOLD,12));
        add(todos_os_filmes);

        //BOTÃO FILME 1
        JButton filme1 = new JButton("FILME 1");
        filme1.setBounds(110,310,200,250);
        add(filme1);

        //BOTAO FILME 2
        JButton filme2 = new JButton("FILME 2");
        filme2.setBounds(410,310,200,250);
        add(filme2);

        //BOTAO FILME 3
        JButton filme3 = new JButton("FILME 3");
        filme3.setBounds(710,310,200,250);
        add(filme3);

        //BOTAO ADMINISTRADOR
        JButton adm = new JButton("Administrador");
        adm.setBounds(790,650,150,30);
        adm.setFont(new Font("arial",Font.BOLD,15));
        add(adm);


        //-------------FUNÇÃO DOS BOTÕES------------------------------//

        //FUNÇÃO BOTÃO "INFORMAÇÃO"
        helpInicial.addActionListener(this::help);

        //FUNÇÃO BOTÃO "VER TODOS OS FILMES"
        todos_os_filmes.addActionListener(this::verfilmes);

        //FUNÇÃO BOTÃO "ADMINISTRADOR"
        adm.addActionListener(this::logaradm);


        //--------------------------IMAGENS-------------------------------//
        ImageIcon logo_ifpe = new ImageIcon(Objects.requireNonNull(getClass().getResource("ifpe.png")));
        JLabel ifpe = new JLabel(logo_ifpe);
        add(ifpe);
        ifpe.setBounds(0,0,300,300);
    }

    //METODO QUE ATRIBUI AÇÃO AO BOTÃO DO ADMINISTRADOR
    private void logaradm(ActionEvent actionEvent) {
        LoginAdm telalogin = new LoginAdm();
        telalogin.setVisible(true);
        this.dispose();
    }

    //METODO QUE ATRIBUI AÇÃO AO BOTÃO "VER FILMES"
    private void verfilmes(ActionEvent actionEvent) {
        TelaDeFilmes tela1 = new TelaDeFilmes();
        tela1.setVisible(true);
        this.dispose();
    }

    private void help(ActionEvent actionEvent){
        JOptionPane.showMessageDialog(null, "Nessa tela, o cliente pode optar por acessar algum filme " +
                "diretamente (os destaques) ou então ele pode acessar uma aba com todos os filmes. O administrador pode acessar a " +
                "sua tela para ter acesso as suas funcionalidades. ","Help", JOptionPane.QUESTION_MESSAGE);
    }
}