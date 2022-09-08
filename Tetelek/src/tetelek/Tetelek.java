/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetelek;

/**
 *
 * @author szilagyi.gergely
 */
public class Tetelek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Megszámlálás
        int[] tomb = {4, 5, 3, 5, 2, 5, 1, 9, 6, 6};
        int n = 10;
        int d = 0;
        for (int i = 0; i < n; i++) {
            if (tomb[i] >= 4) {
                d++;
            }
        }
        System.out.println(d + " darab felelel meg a feltételnek");
        
        //Rendezés
        int[] tomb1 = {4, 5, 3, 5, 2, 5, 1, 6, 6, 4};
        int n1 = 10;
        int tmp = 0;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                if (tomb1[i] > tomb1[j]) {
                    tmp = tomb1[i];
                    tomb1[i] = tomb1[j];
                    tomb1[j] = tmp;
                }
            }
        }
        for (int i = 0; i < n1; i++) {
            System.out.print(tomb1[i]);
        }
    }
    
}
