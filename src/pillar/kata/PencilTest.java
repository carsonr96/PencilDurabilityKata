package pillar.kata;

import java.util.Scanner;

/**
 *
 * @author Carson
 */
public class PencilTest {
    
    public static void main(String[] args) {
        //@test//
        Pencil pencil = new Pencil(80, 80);
        System.out.println("Current durability of the graphite " + Pencil.graphiteDurability);
        System.out.println("Current length of the pencil " + Pencil.lengthOfPencil);
        
        //@test//
        Eraser eraser = new Eraser(80);
        System.out.println("Current durability of the eraser " + Eraser.eraserDurability);
        
        //@test//
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please input the text to write down:");
        String desiredText = sc.nextLine();
        desiredText = desiredText.replaceAll("\\s", "");
        System.out.println(desiredText);
        
        //@test//
        String writtenText = desiredText;
        int graphiteDegredation;
        graphiteDegredation = writtenText.length();
        int remainingGraphite = Pencil.graphiteDurability - graphiteDegredation;
        System.out.println(remainingGraphite);
    }
}