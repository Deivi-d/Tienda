/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Ropa extends Articulo {
    private String color;
    private TallaSML talla;
    
    public Ropa() {
        
    }
    public Ropa(String color,TallaSML talla,String codigo,String nombre,float precio, int stock){
         super(codigo,nombre,precio,stock);
         this.color=color;
         this.talla=talla;
    }
    public String Setcolor(){
        return color;
    }
    public void GetColor(String color){
        this.color=color;
    }
    public TallaSML SetTalla(){
        return talla;
    }
    public void GetTalla(TallaSML talla){
        this.talla=talla;
    }
    @Override
	public String toString() {
		return "Color: "+this.color+"\nnombre:"+this.talla+"\n";
                
	}
   
           
    
            
}
