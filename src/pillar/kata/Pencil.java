package pillar.kata;
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

    public int SMALL_LETTER_DEGREDATION = 1;
    public int CAPITAL_LETTER_DEGREDATION = 2;
    
    static int lengthOfPencil;
    static int graphiteDurability;
    static int initialGraphiteDurability;
    
    static String desiredText;
    static String newString;
    
    Pencil(int graphiteDurability, int lengthOfPencil) {
        
        this.lengthOfPencil = lengthOfPencil;
        initialGraphiteDurability = graphiteDurability;
        this.graphiteDurability = graphiteDurability;
    }
    static void sharpen() {
        if (lengthOfPencil > 0) {
            graphiteDurability = initialGraphiteDurability;
            lengthOfPencil--;
        }
    }
    char COLLISION_CHAR = '@'; 
}