package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class LancheADM extends JFrame {

    public LancheADM(){



        /////////////////////// CONFIGS BASICAS////////////////////////////
        setVisible(true);
        setSize(1000,800);
        setTitle("Tela de lanches do administrador");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);



    //////////////////// BOTÕES //////////////////////

        JButton lanche1 = new JButton("LANCHE 1");
        lanche1.setBounds(100,310,110,150);
        add(lanche1);


        JButton lanche2 = new JButton("LANCHE 2");
        lanche2.setBounds(260,310,110,150);
        add(lanche2);

        JButton lanche3 = new JButton("LANCHE 3");
        lanche3.setBounds(420,310,110,150);
        add(lanche3);

        JButton lanche4 = new JButton("LANCHE 4");
        lanche4.setBounds(580,310,110,150);
        add(lanche4);

        JButton lanche5 = new JButton("LANCHE 5");
        lanche5.setBounds(740,310,110,150);
        add(lanche5);






        ////////////////// FUNÇÕES ////////////////

        lanche1.addActionListener(this::botaolanche1);
        lanche2.addActionListener(this::botaolanche2);
        lanche3.addActionListener(this::botaolanche3);
        lanche4.addActionListener(this::botaolanche4);
        lanche5.addActionListener(this::botaolanche5);

    }


    private void botaolanche5(ActionEvent actionEvent) {
        crudADM telacrud = new crudADM();
        telacrud.setVisible(true);
        this.dispose();
    }

    private void botaolanche4(ActionEvent actionEvent) {
        crudADM telacrud = new crudADM();
        telacrud.setVisible(true);
        this.dispose();
    }

    private void botaolanche3(ActionEvent actionEvent) {
        crudADM telacrud = new crudADM();
        telacrud.setVisible(true);
        this.dispose();
    }

    private void botaolanche2(ActionEvent actionEvent) {
        crudADM telacrud = new crudADM();
        telacrud.setVisible(true);
        this.dispose();
    }

    private void botaolanche1(ActionEvent actionEvent) {
        crudADM telacrud = new crudADM();
        telacrud.setVisible(true);
        this.dispose();
    }


}
