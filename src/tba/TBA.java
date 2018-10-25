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
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int d6;
        
        String arm, pNome;
        int pHp, pMHp;
        int pMp, pMMp;
        int pArm, pWep;
        String pArmN, pWepN;
        int[] pCons;
        
        
        pArm = 1;
        switch(pArm){
            case 1:
                pArmN = "Leather Armor";
                break;
            case 2:
                pArmN = "Iron Armor";
                break;
        }
        
        System.out.print("Qual é o nome do seu personagem? ");
        pNome = input.next();
        
        
        d6 = dado(6);
        System.out.println(d6);
        System.out.println(pNome);
        
       

    }
    
   
}
