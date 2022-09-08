/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console;
import java.util.Scanner;

/**
 *
 * @author szilagyi.gergely
 */
public class Console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                //beolvasáshoz létrehozunk egy Scannert
        Scanner con = new Scanner(System.in);
        System.out.println( "Írj be egy számot: " );
        int szam = con.nextByte();
        
        System.out.println( "Írd be a neved: " );
        String nev= con.next();
        
        System.out.println(nev + ", ezt a számot írtad be: " + szam);
        int eredmeny=szam*64;
        System.out.println( " A szam 64-szerese: " +eredmeny );
        con.close();
        System.out.println( "Köszönöm" );

    }
    
}
