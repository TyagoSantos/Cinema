package InterfaceGrafica;

import InterfaceGrafica.TelaInicial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class TelaDeFilmes extends JFrame {

    public TelaDeFilmes(){

        //CONTAINER PRINCIPAL
        JPanel principal = new JPanel();
        principal.setPreferredSize(new Dimension(1000,1500));
        principal.setLayout(null);
        add(principal);
        pack();

        //BARRA DE ROLAGEM DE TELA
        JScrollPane scroll = new JScrollPane(principal);
        add(scroll);

        //CONFIGURAÇÕES INICIAIS

        setVisible(true);
        //setSize(1000,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        //---------------------------LABELS-------------------------------------//

        //LABEL "EM EXIBIÇÃO"
        JLabel lblexibicao = new JLabel("EM EXIBIÇÃO");
        lblexibicao.setFont(new Font("arial",Font.BOLD,20));
        lblexibicao.setBounds(20,50,700,200);
        principal.add(lblexibicao);

        //LABEL "CATÁLOGO DE FILMES"
        JLabel lblcatalogo = new JLabel("CATÁLOGO DE FILMES");
        lblcatalogo.setFont(new Font("arial",Font.BOLD,30));
        lblcatalogo.setBounds(310,0,400,50);
        lblcatalogo.setForeground(new Color(63, 154, 13, 236));
        principal.add(lblcatalogo);


        //LABEL "EM BREVE"
        JLabel lblembreve = new JLabel("EM BREVE:");
        lblembreve.setFont(new Font("arial",Font.BOLD,20));
        lblembreve.setBounds(20,1000,700,200);
        principal.add(lblembreve);




        //-------------------------BOTÕES--------------------------------------//


        //BOTÃO FILME 1
        JButton botaof1 = new JButton("FILME 1");
        botaof1.setFont(new Font("arial",Font.BOLD,15));
        botaof1.setBounds(70,200,200,250);
        principal.add(botaof1);

        //BOTAO FILME 2
        JButton botaof2 = new JButton("FILME 2");
        botaof2.setFont(new Font("arial",Font.BOLD,15));
        botaof2.setBounds(370,200,200,250);
        principal.add(botaof2);

        //BOTAO FILME 3
        JButton botaof3 = new JButton("FILME 3");
        botaof3.setFont(new Font("arial",Font.BOLD,15));
        botaof3.setBounds(670,200,200,250);
        principal.add(botaof3);

        //BOTAO FILME 4
        JButton botaof4 = new JButton("FILME 3");
        botaof4.setFont(new Font("arial",Font.BOLD,15));
        botaof4.setBounds(70,500,200,250);
        principal.add(botaof4);

        //BOTAO FILME 5
        JButton botaof5 = new JButton("FILME 5");
        botaof5.setFont(new Font("arial",Font.BOLD,15));
        botaof5.setBounds(370,500,200,250);
        principal.add(botaof5);

        //BOTAO FILME 6
        JButton botaof6 = new JButton("FILME 6");
        botaof6.setFont(new Font("arial",Font.BOLD,15));
        botaof6.setBounds(670,500,200,250);
        principal.add(botaof6);

        //BOTAO FILME 7
        JButton botaof7 = new JButton("FILME 7");
        botaof7.setFont(new Font("arial",Font.BOLD,15));
        botaof7.setBounds(70,800,200,250);
        principal.add(botaof7);

        //BOTAO FILME 8
        JButton botaof8 = new JButton("FILME 8");
        botaof8.setFont(new Font("arial",Font.BOLD,15));
        botaof8.setBounds(370,800,200,250);
        principal.add(botaof8);

        //BOTAO FILME 9
        JButton botaof9 = new JButton("FILME 9");
        botaof9.setFont(new Font("arial",Font.BOLD,15));
        botaof9.setBounds(670,800,200,250);
        principal.add(botaof9);

        //BOTAO VOLTAR
        JButton botaovoltar = new JButton("VOLTAR");
        botaovoltar.setFont(new Font("arial",Font.BOLD,10));
        botaovoltar.setBounds(20,10,90,30);
        principal.add(botaovoltar);

        //BOTAO FILME 1 EM BREVE
        JButton embreve1 = new JButton("em breve 1");
        embreve1.setFont(new Font("arial",Font.BOLD,10));
        embreve1.setBounds(70,1150,200,250);
        principal.add(embreve1);

        //BOTAO FILME 2 EM BREVE
        JButton embreve2 = new JButton("em breve 2");
        embreve2.setFont(new Font("arial",Font.BOLD,10));
        embreve2.setBounds(370,1150,200,250);
        principal.add(embreve2);

        //BOTAO FILME 3 EM BREVE
        JButton embreve3 = new JButton("em breve 3");
        embreve3.setFont(new Font("arial",Font.BOLD,10));
        embreve3.setBounds(670,1150,200,250);
        principal.add(embreve3);


        //-----------------FUNÇÃO BOTOES--------------------------------//

        botaovoltar.addActionListener(this::voltar);



        //--------------CAIXINHA PARA BUSCAR FILMES COM CONTAINER------------//


        JComboBox<String> buscarfilme = new JComboBox<>();
        JPanel painel = new JPanel();
        painel.setBounds(330,100,300,70);
        painel.add(buscarfilme);
        principal.add(painel);

        buscarfilme.addItem("BUSCAR FILME");
        buscarfilme.addItem("filme 1");
        buscarfilme.addItem("filme 2");
        buscarfilme.addItem("filme 3");
        buscarfilme.addItem("filme 4");
        buscarfilme.addItem("filme 5");
        buscarfilme.addItem("filme 6");
        buscarfilme.addItem("filme 7");
        buscarfilme.addItem("filme 8");
        buscarfilme.addItem("filme 9");
        buscarfilme.setSelectedIndex(0);
        buscarfilme.setBounds(400,100,180,50);




    }
    //---------------MÉTODOS PARA ATRIBUIR AÇÃO AOS BOTÕES----------------------//
    private void voltar(ActionEvent actionEvent) {
        TelaInicial voltar = new TelaInicial();
        voltar.setVisible(true);
        this.dispose();

    }


}