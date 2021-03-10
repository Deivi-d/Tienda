
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Usuario {
    
    //atributos
    
    private String nombre;
    private String password;
    private String email;
    
    //constructor vacio
    
    Usuario(){
}
    
    //constructor con parametros
    
    public Usuario(String nombre,String pasword,String email){
        
        this.nombre=nombre;
        this.password=pasword;
        this.email=email;
    }
    
    //getter y setters
    
    public String getnombre(){
        return nombre;
    }
    
    public void setnombre(String nombre){
        
        this.nombre=nombre;
       
    }
    
    public String getpassword(){
        return password;
    }
    
    public void setpassword(){
        
        this.password=password;
        
    }
    
    public String getemail(){
        return email;
    }
    
    public void setemail(){

        this.email=email;
    }
    

public static boolean password(String pwd) {
        //(['65'-'90'])
        //pwd = "pePe199";
        //        boolean validar=true;
        //        
        //        if (pwd.length() >= 8 && pwd.matches("([A-Z])") == false) 
        //            ok=false;

        return pwd.length() >= 8 && pwd.matches("([A-Z])");
    }

public boolean email(){
   // coincidencia = false cuando no haya un 0
   if(email.matches("[a-zA-Z][^(@)]+")== false){
       
       return true;
   }else{
       return false;
   }

    }
}
