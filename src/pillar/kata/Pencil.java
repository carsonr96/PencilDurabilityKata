package pillar.kata;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carson
 */
public class Pencil {
    
    static int lengthOfPencil;
    static int graphiteDurability;
    static int initialGraphiteDurability;
    
    static String desiredText = "";
    static String newString;
    
    static char currentCharacter;
    
    
    Pencil(int graphiteDurability, int lengthOfPencil) {
        
        this.lengthOfPencil = lengthOfPencil;
        initialGraphiteDurability = graphiteDurability;
        this.graphiteDurability = graphiteDurability;
    }
    static void sharpen() {
        if (lengthOfPencil > 1) {
            graphiteDurability = initialGraphiteDurability;
            lengthOfPencil--;
            System.out.println("Pencil has been sharpened to " + Pencil.graphiteDurability);
            System.out.println("Length of the pencil has decreased to " + Pencil.lengthOfPencil);
        } else {
            System.out.println("Can no longer sharpen this pencil.");
        }
    }
    static void write() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the text to write down:");
        String desiredText = sc.nextLine();
        desiredText = desiredText.replaceAll("\\s", "");
        System.out.println(desiredText);
        sc.close();
    }
}