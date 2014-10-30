/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AjedrezCastelvania;

import java.util.Scanner;

/**
 *
 * @author DavidChavarria
 */
public class vampiro extends Ficha{
    
    Scanner in = new Scanner(System.in);
    
    public vampiro(String c){
        color = c;
        armadura = 5;
        vida = 4;
        ataque = 3;
        tag = "Z"+c.toUpperCase();
        posx = 0;
        posy = 0;
    }


    @Override
    public void ataqueEspecial(Ficha fi) {
        
        System.out.println("Seleccionar Ataque Especial: "
                + "/n /t 1. Crear Zombie"
                + "/n /t 2. Lanzar Lanza");
        
        
        int opt = in.nextInt();
        
        System.out.println("Ingrese Coordenadas para su Acción");
        int x = in.nextInt();
        int y = in.nextInt();
        
        switch(opt){
            case 1 :
                zombie minion = new zombie(color, x, y);
                break;
            case 2 :
                if ((x <= 2 && x >= -2) || (y <= 2 && y >= -2)){
                    
                }
                break;
                
        }
    }

    @Override
    public void atacar(Ficha fi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
