package br.com.esystem.storemob;

/**
 * Created by totvs_esantos on 06/09/2016.
 */
public class Autenticacao {

    public String autenticaUsuario(String user, String password){
        if(user.equalsIgnoreCase(user) && password.equalsIgnoreCase(password)){
            return "Adiministrator";
        }
        return null;
    }

    public boolean isAutenticado(String user, String password){
        return this.autenticaUsuario(user, password) != null ? true : false;
    }

}
