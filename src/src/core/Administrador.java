package core;
import gui.LoginAdm.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Administrador{
        public static boolean login(String usuario, String senha){
                if(usuario.equals("adm")  && senha.equals("123")){

                        return true;

                }
                else{
                        throw new RuntimeException("Usuário ou senha incorretos");
                }

        }




//        ArrayList<String> teste = new ArrayList<>();
//
//        public void procurarPosicao(int posicao){
//
//                System.out.println(teste.get(posicao));
//        }
//
        public  void puxarLanche(ArrayList teste){


                teste.add(teste);
              System.out.println(teste);

        }
//
//        public ArrayList getTeste(){
//                return teste;
//
//        }

}
