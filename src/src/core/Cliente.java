package core;

public class Cliente implements Pessoa{
    private String cpf;

    public Cliente(String cpf){
        this.cpf = cpf;
    }


    public void comprarIngresso(){

    }

    @Override
    public String getCpf() {
        return this.cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
