package core;

import database.AdmLancheData;
import database.Conexao;

import javax.swing.*;
import database.AdmLancheData.*;

import java.sql.SQLException;

public class Funcionario extends Pessoa{
    private String nome;
    private String cpf;
    private int idade;
    private String telefone;

    public Funcionario(){

    }
    public Funcionario(String nome, String cpf, int idade, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    @Override
    public String getCpf() {
        return this.cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public static boolean funcEditarLanche(String nome, String preco, String marca, String Quantidade, String ID)  {
        AdmLancheData lancheadm = new AdmLancheData();

        if (nome.isEmpty() || preco.isEmpty() || marca.isEmpty() || Quantidade.isEmpty() || ID.isEmpty() ){
            throw new RuntimeException("Campos vazios");
    }else{
            //lancheadm.editarGeral(Integer.parseInt(ID),nome,marca,Integer.parseInt(preco),Integer.parseInt(Quantidade));

            return true;
        }
}}
