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
public class hombreLobo extends Ficha{

    public hombreLobo(String c) {
        color = c;
        armadura = 2;
        vida = 5;
        ataque = 5;
        tag = "Z"+c.toUpperCase();
        posx = 0;
        posy = 0;
        
    }

    

    @Override
    public void mover(int x, int y) {
        Tablero tab = new Tablero();
        
        if (x <= 2 && x >= -2 && y <= 2 && y >= -2){
            if("| * |".equals(tab.tab[x+1][y+1])){
                posx += (x+1);
                posy += (y+1);
                tab.tab[posx][posy] = tag;
            }
            
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
