/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeanstest;

/**
 *
 * @author gebruiker
 */
import java.util.*;

public class NetBeansTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fgtAmount = 0;
        
        System.out.println("There are currently " + fgtAmount + " fgts around.");
        System.out.println("");
        
        Scanner input = new Scanner(System.in);
        System.out.println("How many fgts did you bring in?");
        fgtAmount = input.nextInt();
        System.out.println("Amount of fgts: " + fgtAmount);
        System.out.println("");
        
        String totalName = "Grand Faggit";
        String firstName = totalName.substring(0, 5);
        String lastName = totalName.substring(6);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println("");
        
        int[] numberzz = {1,2,3,4};
        
        for (int i : numberzz) {
            System.out.println(i);
        }
        System.out.println("");
        
        System.out.println("Are you ready for an amazing form?!");
        input.next();
        skerm sk = new skerm();
        sk.setVisible(true);
    }
    
}
