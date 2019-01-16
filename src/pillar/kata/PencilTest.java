package pillar.kata;

import java.util.Scanner;

/**
 *
 * @author Carson
 */
public class PencilTest {
    
    public static void main(String[] args) {
        //@test//
        Pencil pencil = new Pencil();
        System.out.println(Pencil.graphiteDurability);
        System.out.println(Pencil.lengthOfPencil);
        
        //@test//
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the text to write down: \n");
        String desiredText = sc.nextLine();
        desiredText = desiredText.replaceAll("\\s", "");
        System.out.println(desiredText);
    }
}