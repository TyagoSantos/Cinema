package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HubADM extends JFrame {
    private JButton botaoAlterarLanches;
    private JButton botaoAlterarFilmes;
    private JPanel conteinerHub;
    private JButton botaoAlterarSessao;
    private JButton logOutButton;


    public HubADM(){

        setContentPane(conteinerHub);
        setTitle("Hub do ADM");
        setSize(1000,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        botaoAlterarLanches.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crudADM telalanche = new crudADM();
                telalanche.setVisible(true);
                dispose();
            }
        });
        logOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginAdm telaLoginDdm = new LoginAdm();
                telaLoginDdm.setVisible(true);
                dispose();
            }
        });
    }





}
