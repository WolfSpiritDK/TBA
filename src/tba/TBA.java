/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tba;
import java.util.*;


public class TBA {
/**
 *
 * @author Thiago
 */

    Random rand = new Random();
    public static int dado(int arg) {
        Random rand = new Random();
        
        int valor = rand.nextInt(arg - 1) + 1;
        return valor;
    }

    
    public static void main(String[] args) {
        sheet player = new sheet();
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int d4, d6, d8, d10, d12, d20;
        
        d4 = dado(4);
        d6 = dado(6);
        d8 = dado(8);
        d10 = dado(10);
        d12 = dado(12);
        d20 = dado(20);
        
        player.sheet();
        
        
        
        
        
     
        
        
        
        
       

    }
    
   
}
