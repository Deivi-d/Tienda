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
        if(nombre<6){
            
        }
        this.nombre=nombre;
       
    }
    
    public String getpassword(){
        return password;
    }
    
    public void setpassword(String password){
        
        
        this.password=password;
      
    }
    
    public String getemail(){
        return email;
    }
    
    public void setemail(String email){
        this.email=email;
        
    }
    

    
}
