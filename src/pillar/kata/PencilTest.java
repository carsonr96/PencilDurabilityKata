package pillar.kata;

import java.util.Scanner;

/**
 *
 * @author Carson
 */
public class PencilTest {
    
    static int degredationValue;
    int MIN_VALUE = Pencil.graphiteDurability;
    
    public static void main(String[] args) {
        //@test pencil//
        Pencil pencil = new Pencil(10, 10);
        System.out.println("Current durability of the graphite " + Pencil.graphiteDurability);
        System.out.println("Current length of the pencil " + Pencil.lengthOfPencil);
        
        //@test eraser//
        Eraser eraser = new Eraser(10);
        System.out.println("Current durability of the eraser " + Eraser.eraserDurability);
        
        //@test input//
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the text to write down:");
        String desiredText = sc.nextLine();
        desiredText = desiredText.replaceAll("\\s", "");
        System.out.println(desiredText);
        sc.close();
        
        //@test capital letters vs lower case letters//
        //
        int graphiteDegredation;
        for (int i = 0; i < desiredText.length(); i++) {
            char currentCharacter = desiredText.charAt(i);
            if (currentCharacter >= 'A' && currentCharacter <= 'Z') {
                degredationValue+=2;
            } else {
                degredationValue++;
            }
        }
        graphiteDegredation = degredationValue;
        int remainingGraphite = Pencil.graphiteDurability - degredationValue;
        System.out.println("Durability remaining " + remainingGraphite);
        
        //@test supposed to be cutting it off after the length of the input
        //exceeds the remaining durability of the graphite
        String writtenText = "";
        remainingGraphite = Pencil.graphiteDurability;
        for (int i = 0; i < writtenText.length(); i++) {
         
        }
        
        //@test pencil sharpen//
        Pencil.sharpen();
        
        //@test supposed to be inserting text at a specified index//
        
        
        //@test supposed to be erasing text from a given interval//
        
    }
}