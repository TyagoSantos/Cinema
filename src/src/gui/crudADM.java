package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class crudADM extends JFrame {
    private JTextField tfID;
    private JTextField tfNOME;
    private JTextField tfMARCA;
    private JTextField tfPreco;
    private JTextField tfQuantidade;
    private JButton botaosalvar;
    private JButton botaoexcluir;
    private JLabel confirmacao;
    private JPanel containerlancheadm;
    private JButton botaovoltar;


    public crudADM(){
        setContentPane(containerlancheadm);
        setTitle("CRUD DO ADM");
        setSize(1000,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);


        ///////////////////////// botao para alterar ////////////////////

        botaosalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = tfNOME.getText();
                String preco = tfPreco.getText();
                String marca = tfMARCA.getText();
                String Quantidade = tfQuantidade.getText();
                String ID = tfID.getText();



                if (nome.isBlank() || preco.isBlank() || marca.isBlank() || Quantidade.isBlank() || ID.isBlank() ){
                confirmacao.setText("Nenhum campo deve ficar vazio");
                confirmacao.setFont(new Font("arial",Font.BOLD,13));
                confirmacao.setForeground(new Color(236, 11, 11));

            }else {
                    confirmacao.setText("TUDO CERTO!");
                    confirmacao.setForeground(new Color(72, 201, 58, 255));
                }


                }
        });

                botaovoltar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new LancheADM().setVisible(true);
                        dispose();

                    }
                });
        
        


tfQuantidade.addKeyListener(new KeyAdapter() { } );
        tfID.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if(!Character.isDigit(c)){
                    e.consume();
                }
            }
        });
        tfPreco.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();

                if(!Character.isDigit(c)){
                    e.consume();
                }
            }
        });
        tfQuantidade.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();

                if(!Character.isDigit(c)){
                    e.consume();
                }
            }
        });
    }}


