
package tba;
import java.util.Random;
import java.util.Scanner;





public class Dados {
    Random dado = new Random();

    public int d6(int mod){    
        return geraDado(6, mod);
    }
    
    public int d8(int mod){    
        return geraDado(8, mod);
    }
    
    public int d10(int mod){    
        return geraDado(10, mod);
    }
    
    public int d12(int mod){    
        return geraDado(12, mod);
    }
    
    public int d20(int mod){    
        return geraDado(20, mod);
    }
    
    private int geraDado(int lados, int mod) {
        return dado.nextInt(lados) +1 +mod;
    }
}
