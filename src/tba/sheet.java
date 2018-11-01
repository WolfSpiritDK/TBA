/*
Class for player sheet, here will be the stats and items.
use "sheet (variable name) = new sheet" to create a variable in main class, then use (variable).sheet(args) to call it.
*/
package tba;
import java.util.*;

 


public class sheet {    
    
     public Dados dados;
     
     public int HP, MHP, WEP, ARM,
         STR, DEX, CON, INT, WIS, CHA;    

    public sheet(){
        dados = new Dados();
       
    }

    private int newstat(){
        Vector roll = new Vector();

        roll.add(dados.d6(0));
        roll.add(dados.d6(0));
        roll.add(dados.d6(0));
        roll.add(dados.d6(0));
        
        Collections.sort(roll);
        Collections.reverse(roll);
        System.out.println(roll);
        
        return (int)roll.elementAt(0) + (int)roll.elementAt(1) + (int)roll.elementAt(2);
    }

    public void newstr(){
        this.STR = newstat();
    }
    
    public void newdex(){
        this.DEX = newstat();
    }
    
    public void newcon(){
        this.CON = newstat();
    }
}
    

