/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuffer;

/**
 *
 * @author szilagyi.gergely
 */
public class StringBuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String st1 = new String();
        String st2 = "Lehet szo " + 1 + " de szám is"; 
        char[] chart = {'E', 'l', 'e', 'm', 'm', 'é', 'r'};
        String st3 = new String(chart);
        StringBuffer sb1= new StringBuffer();
        StringBuffer sb2 = new StringBuffer(10);
    }
    
}
