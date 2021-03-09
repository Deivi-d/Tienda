/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Opinion{
    
    Opinion(){
    }
    //atributos
    private String usuario;
    private int puntuacion;
    private String comentario;
    private int votopositivo;
    private int votonegativo;
    
    public Opinion(String usuario,int puntuacion,String comentario,int votopositivo,int votonegativo){
        
        this.usuario=usuario;
        this.puntuacion=puntuacion;
        this.comentario=comentario;
        this.votopositivo=votopositivo;
        this.votonegativo=votonegativo;
    }
    
        public String getusuario(){
        return usuario;
    }
    
    public String setusuario(String usuario){
        this.usuario=usuario;
        return null;
    }
    
    public int getpuntuacion(){
        return puntuacion;
    }
    
    public void setpuntuacion(int puntuacion){
        this.puntuacion=puntuacion;
        
    }
    
    public int getvotopositivo(){
        return votopositivo;
    }
    
    public void setvotopositivo(int votopositivo){
        this.votopositivo=votopositivo;
        
    }
    
    public int getvotonegativo(){
        return votonegativo;
    }
    
    public void setvotonegativo(int votonegativo){
        this.votonegativo=votonegativo;
        
    }
}
