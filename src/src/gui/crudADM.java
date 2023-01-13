package gui;

import core.Funcionario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;

public class crudADM extends JFrame {
    private JTextField tfID;
    private JTextField tfNOME;
    private JTextField tfMARCA;
    private JTextField tfPreco;
    private JTextField tfQuantidade;
    private JButton botaosalvar;
    private JButton botaolimpar;
    private JLabel confirmacao;
    private JPanel containerlancheadm;
    private JButton botaovoltar;
    private JButton botaolanche1;
    private JButton botaolanche2;
    private JButton botaolanche3;
    private JButton botaolanche4;
    private JButton botaolanche5;

    public JTextField getTfID() {
        return tfID;
    }

    public void setTfID(JTextField tfID) {
        this.tfID = tfID;
    }

    public JTextField getTfNOME() {
        return tfNOME;
    }

    public void setTfNOME(JTextField tfNOME) {
        this.tfNOME = tfNOME;
    }

    public JTextField getTfMARCA() {
        return tfMARCA;
    }

    public void setTfMARCA(JTextField tfMARCA) {
        this.tfMARCA = tfMARCA;
    }

    public JTextField getTfPreco() {
        return tfPreco;
    }

    public void setTfPreco(JTextField tfPreco) {
        this.tfPreco = tfPreco;
    }

    public JTextField getTfQuantidade() {
        return tfQuantidade;
    }

    public void setTfQuantidade(JTextField tfQuantidade) {
        this.tfQuantidade = tfQuantidade;
    }

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
            String ID = tfID.getText();

            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = tfNOME.getText();
                String preco = tfPreco.getText();
                String marca = tfMARCA.getText();
                String Quantidade = tfQuantidade.getText();
                String ID = tfID.getText();



                try{
                    Funcionario funcEditar = new Funcionario();
                    Funcionario.funcEditarLanche(nome, preco,marca,Quantidade,ID);

                    confirmacao.setText("Tudo certo!");
                    confirmacao.setForeground(new Color(36, 187, 11));

                }catch (RuntimeException e1){

                    confirmacao.setText(e1.getMessage());
                    confirmacao.setForeground(new Color(245, 13, 13, 255));

                }


//                if (nome.isBlank() || preco.isBlank() || marca.isBlank() || Quantidade.isBlank() || ID.isBlank() ){
//                confirmacao.setText("Há campos vazios");
//                confirmacao.setFont(new Font("arial",Font.BOLD,13));
//                confirmacao.setForeground(new Color(236, 11, 11));
//
//                }else {
//                    confirmacao.setText("TUDO CERTO!");
//                    confirmacao.setForeground(new Color(72, 201, 58, 255));
//                }
                }


        });

                botaovoltar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new LoginAdm().setVisible(true);
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
        botaolimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfID.setText("");
                tfMARCA.setText("");
                tfNOME.setText("");
                tfPreco.setText("");
                tfQuantidade.setText("");
            }


        });


        botaolanche1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfID.setText("1");
            }
        });
        botaolanche2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfID.setText("2");
            }
        });
        botaolanche3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfID.setText("3");
            }
        });
        botaolanche4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfID.setText("4");
            }
        });
        botaolanche5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfID.setText("5");
            }
        });
    }}


