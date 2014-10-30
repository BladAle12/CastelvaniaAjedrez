/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AjedrezCastelvania;

import javax.swing.JLabel;

/**
 *
 * @author DavidChavarria
 */
public abstract class Ficha extends JLabel{
    
    int vida;
    int armadura;
    int ataque;
    String color;
    String tag;
    int posx;
    int posy;
    
    
    public abstract void atacar(Ficha fi);
    public abstract void ataqueEspecial(Ficha fi);
       
    public void mover(int x, int y) {
        Tablero tab = new Tablero();
        
        if (x <= 1 && x >= -1 && y <= 1 && y >= -1){
            if("| * |".equals(tab.tab[x+1][y+1])){
                posx += (x+1);
                posy += (y+1);
                tab.tab[posx][posy] = tag;
            }
            
        }
    }
    
}