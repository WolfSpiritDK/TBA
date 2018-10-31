/*
Class for player sheet, here will be the stats and items.
use "sheet (variable name) = new sheet" to create a variable in main class, then use (variable).sheet(args) to call it.
*/
package tba;
import java.util.*;

 


public class sheet {
    public int dado(int arg){
        Random dado = new Random();
        int value = dado.nextInt(arg - 1) +1;
        return value;
    }
    public void sheet(){
        
        int HP, MHP, WEP, ARM;
        int stat, STR, DEX, CON, INT, WIS, CHA;
        int d4, d6, d8, d10, d12, d20;
        
        stat = dado((6)*4); //Placeholder for 4d6 and picking the 3 highest numbers for statrolling.
        
        d4 = dado(4);
        d6 = dado(6);
        d8 = dado(8);
        d10 = dado(10);
        d12 = dado(12);
        d20 = dado(20);
        
        System.out.println(stat);
        
        
        
        
      
            
        }
        
   
    
    
}
    

