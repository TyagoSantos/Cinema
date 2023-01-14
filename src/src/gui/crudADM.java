package gui;

import core.Funcionario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;

import database.FuncionarioData;

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
                    Funcionario.funcEditarLanche(nome, preco,marca,Quantidade, ID);

                    confirmacao.setText("Tudo certo!");
                    confirmacao.setForeground(new Color(36, 187, 11));

                }catch (RuntimeException e1){

                    confirmacao.setText(e1.getMessage());
                    confirmacao.setForeground(new Color(245, 13, 13, 255));

                } catch (SQLException ex) {
                    confirmacao.setText("Erro de conexao!");
                    confirmacao.setForeground(new Color(245, 13, 13, 255));
                    //throw new RuntimeException(ex);
                }
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

                confirmacao.setText("");
            }
        });



        botaolanche1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FuncionarioData funcionarioData = new FuncionarioData();

                tfID.setText("1");
                tfNOME.setText(funcionarioData.nomeLanche1);
                tfMARCA.setText(funcionarioData.marcaLanche1);
                tfPreco.setText(funcionarioData.precoLanche1);
                tfQuantidade.setText(funcionarioData.quantidadeLanche1);
            }

        });
        botaolanche2.addActionListener(new ActionListener() {
            FuncionarioData funcionarioData = new FuncionarioData();
            @Override
            public void actionPerformed(ActionEvent e) {
                tfID.setText("2");
                tfNOME.setText(funcionarioData.nomeLanche2);
                tfMARCA.setText(funcionarioData.marcaLanche2);
                tfPreco.setText(funcionarioData.precoLanche2);
                tfQuantidade.setText(funcionarioData.quantidadeLanche2);
            }
        });
        botaolanche3.addActionListener(new ActionListener() {
            FuncionarioData funcionarioData = new FuncionarioData();
            @Override
            public void actionPerformed(ActionEvent e) {
                tfID.setText("3");
                tfNOME.setText(funcionarioData.nomeLanche3);
                tfMARCA.setText(funcionarioData.marcaLanche3);
                tfPreco.setText(funcionarioData.precoLanche3);
                tfQuantidade.setText(funcionarioData.quantidadeLanche3);

            }
        });
        botaolanche4.addActionListener(new ActionListener() {
            FuncionarioData funcionarioData = new FuncionarioData();
            @Override
            public void actionPerformed(ActionEvent e) {
                tfID.setText("4");
                tfNOME.setText(funcionarioData.nomeLanche4);
                tfMARCA.setText(funcionarioData.marcaLanche4);
                tfPreco.setText(funcionarioData.precoLanche4);
                tfQuantidade.setText(funcionarioData.quantidadeLanche4);

            }
        });
        botaolanche5.addActionListener(new ActionListener() {
            FuncionarioData funcionarioData = new FuncionarioData();
            @Override
            public void actionPerformed(ActionEvent e) {
                tfID.setText("5");
                tfNOME.setText(funcionarioData.nomeLanche5);
                tfMARCA.setText(funcionarioData.marcaLanche5);
                tfPreco.setText(funcionarioData.precoLanche5);
                tfQuantidade.setText(funcionarioData.quantidadeLanche5);

            }
        });
    }}

