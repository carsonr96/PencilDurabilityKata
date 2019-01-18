package pillar.kata;

import java.util.Scanner;

/**
 *
 * @author Carson
 */
public class PencilTest {
    
    int upperCase;
    int lowerCase;
    static int degredationValue;
    int MIN_VALUE = Pencil.graphiteDurability;
    
    public static void main(String[] args) {
        //@test//
        Pencil pencil = new Pencil(10, 10);
        System.out.println("Current durability of the graphite " + Pencil.graphiteDurability);
        System.out.println("Current length of the pencil " + Pencil.lengthOfPencil);
        
        //@test//
        Eraser eraser = new Eraser(10);
        System.out.println("Current durability of the eraser " + Eraser.eraserDurability);
        
        //@test//
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the text to write down:");
        String desiredText = sc.nextLine();
        desiredText = desiredText.replaceAll("\\s", "");
        System.out.println(desiredText);
        String writtenText = "";
        sc.close();
        
        //@test//
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
        
        //@test//
        if (remainingGraphite <= 0) {
            String substring = writtenText.substring(0, remainingGraphite);
            System.out.println(substring);
        }
        
        
        
        //@test//
        Pencil.sharpen();
        System.out.println("Pencil has been sharpened to " + Pencil.graphiteDurability);
        System.out.println("Length of the pencil has decreased to " + Pencil.lengthOfPencil);
        
        //@test//
        
    }
}