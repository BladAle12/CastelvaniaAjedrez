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
public class zombie extends Ficha {
    
    public zombie(String c, int x, int y){
        color = c;
        armadura = 0;
        vida = 1;
        ataque = 1;
        tag = "Z"+c.toUpperCase();
        posx = x;
        posy = y;
        
    }

    @Override
    public void atacar(Ficha fi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ataqueEspecial(Ficha fi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mover (int x, int y){
        System.out.println("El Zombie no se puede Mover");
    }

}
