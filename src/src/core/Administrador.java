package core;
import gui.LoginAdm.*;

import javax.swing.*;

public class Administrador{
        public static boolean login(String usuario, String senha){
                if(usuario.equals("adm")  && senha.equals("123")){
                        return true;

                }
                else{
                        throw new RuntimeException("Informe usuário e senha corretos");
                }
        }
}
