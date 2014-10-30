/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AjedrezCastelvania;

/**
 *
 * @author DavidChavarria
 */
public class muerte extends Ficha {

    public muerte(String c){
        color = c;
        armadura = 1;
        vida = 3;
        ataque = 4;
        tag = "Z"+c.toUpperCase();
        
        if (c.equalsIgnoreCase("b")){
            posx = 0;
            posy = 0;
        }   else if (c.equalsIgnoreCase("n")){
            posx = 0;
            posy = 0;
        }
            
        
    }

    @Override
    public void atacar(Ficha fi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ataqueEspecial(Ficha fi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
 
   
    
}
