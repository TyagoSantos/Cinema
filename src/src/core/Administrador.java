package core;
import database.FuncionarioData;
import gui.LoginAdm.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Administrador{
        private Object nome1;
        private Object marca1;
        private Object preco1;
        private Object quantidade1;


        private Object nome2;
        private Object marca2;
        private Object preco2;
        private Object quantidade2;


        private Object nome3;
        private Object marca3;
        private Object preco3;
        private Object quantidade3;


        private Object nome4;
        private Object marca4;
        private Object preco4;
        private Object quantidade4;


        private Object nome5;
        private Object marca5;
        private Object preco5;
        private Object quantidade5;



    public static boolean login(String usuario, String senha){
        if(usuario.equals("adm")  && senha.equals("123")){
            return true;

        }
        else{
            throw new RuntimeException("Usuário ou senha incorretos");
        }
    }

        public void puxarLanche(ArrayList teste){
                teste.add(teste);
                nome1 = teste.get(0);

                System.out.println(teste);
        }

        //MÉTODOS PARA PEGAR OS VALORES DO LANCHE 1
        // PEGA OS VALOR DO INDICE DO ARRAY E COLOCA NUMA VARIÁVEL DO TIPO OBJECT)
        public Object nomelanche1(ArrayList teste){
                nome1 = teste.get(1);
                return nome1;
        }
        public Object marcalanche1(ArrayList teste){
                marca1 = teste.get(2);
                return marca1;
        }
        public Object precolanche1(ArrayList teste){
                preco1 = teste.get(3);
                return preco1;
        }
        public Object quantidadeLanche1(ArrayList teste){
                quantidade1 = teste.get(4);
                return quantidade1;
        }


        //MÉTODOS PARA PEGAR OS VALORES DO LANCHE 2
        public Object nomelanche2(ArrayList teste){
                nome2 = teste.get(6);
                return nome2;
        }
        public Object marcalanche2(ArrayList teste){
                marca2 = teste.get(7);
                return marca2;
       }
        public Object precolanche2(ArrayList teste){
                preco2 = teste.get(8);
                return preco2;
        }
        public Object quantidadelanche2(ArrayList teste){
                quantidade2 = teste.get(9);
                return quantidade2;
        }


        //MÉTODOS PARA PEGAR OS VALORES DO LANCHE 3
        public Object nomelanche3(ArrayList teste){
                nome3 = teste.get(11);
                return nome3;
        }
        public Object marcalanche3(ArrayList teste){
                marca3 = teste.get(12);
                return marca3;
        }
        public Object precolanche3(ArrayList teste){
            preco3 = teste.get(13);
            return preco3;
        }
        public Object quantidadelanche3(ArrayList teste){
                quantidade3 = teste.get(14);
                return quantidade3;
        }


        //MÉTODOS PARA PEGAR OS VALORES DO LANCHE 4
        public Object nomelanche4(ArrayList teste){
                nome4 = teste.get(16);
                return nome4;
        }
        public Object marcalanche4(ArrayList teste){
                marca4 = teste.get(17);
                return marca4;
        }
        public Object precolanche4(ArrayList teste){
            preco4 = teste.get(18);
            return preco4;
        }
        public Object quantidadelanche4(ArrayList teste){
                quantidade4 = teste.get(19);
                return quantidade4;
        }

        //MÉTODOS PARA PEGAR OS VALORES DO LANCHE 5
        public Object nomelanche5(ArrayList teste){
            nome5 = teste.get(21);
            return nome5;
        }
        public Object marcalanche5(ArrayList teste){
            marca5 = teste.get(22);
            return marca5;
        }
        public Object precolanche5(ArrayList teste){
            preco5 = teste.get(23);
            return preco5;
        }
        public Object quantidadelanche5(ArrayList teste){
            quantidade5 = teste.get(24);
            return quantidade5;
        }
}
