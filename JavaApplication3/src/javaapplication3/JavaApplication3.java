/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author szilagyi.gergely
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//Explicit hívással
        String s1 = new String();
        String s2 = new String("Ez " + 1 + " egyszám is lehet!");
        //Implicit konstruktor hívással:
        String s11 = "BRFC HU";
        String s21 = s11 + " HU. BF. " + 2004;
        //Karaktertömbből:
        char[] karaktertomb = {'B', 'u', 'd', 'a', 'f', 'o', 'k'};
        String s3 = new String(karaktertomb);       // "Budafpk"
        String s4 = new String(karaktertomb, 2, 3); // "d, a"
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s11);
        System.out.println(s21);
        System.out.println(s3);
        System.out.println(s4);
        //Egy karakter elérése: charAt metódus
        char ch = s3.charAt(2);        // ch = 'p' (s3="Budafok")
        char ch2 = "Budafok".charAt(0); // ch2 = 'B'
        System.out.println(ch);
        System.out.println(ch2);
        //String osztály konverziók
        boolean log = false;
        char ch1 = 'Z';
        double pi = 3.14;
        String s5 = String.valueOf(log) + String.valueOf(ch1) + String.valueOf(pi);  // s5 = "falseX3.14"
        System.out.println(ch1);
        System.out.println(s5);
        //Két sztring összehasonlítása: equals, equalsIgnoreCase metódus
        boolean b1 = "alma".equals("ALMA");            // false
        boolean b2 = "alma".equalsIgnoreCase("ALMA");  // true
        System.out.println(b1);
        System.out.println(b2);
        //Az == a referenciákat hasonlítja össze, nem a tartalmat!!!
        //Karakter vagy sztring keresése: indexOf metódus
        int index1 = "Buda".indexOf('u');         // 1
        int index2 = "Kicsiisten".indexOf('i', 2);      // 4
        // a 2. indexű elemtől indul a keresés
        int index3 = "Budafok".indexOf("Bu");        // 0
        int index4 = "Budafok".indexOf("fo");        // -1
        //Keresés hátulról: lastIndexOf metódus
        int index5 = "almadalma".lastIndexOf("ma");    // 7
        //Így kezdődik-e a sztring: startsWith metódus
        boolean start = "szalma".startsWith("sza"); // true
        //Így végződik-e a sztring: endsWith metódus
        boolean vege = "szalma".endsWith("ma"); 
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);
        System.out.println(index5);
        System.out.println(start);
        System.out.println(vege);
    }
    
}
