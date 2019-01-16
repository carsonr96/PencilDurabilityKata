/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carson
 */
public class PencilConstructor {
    public int SMALL_LETTER_DEGREDATION = 1;
    public int CAPITAL_LETTER_DEGREDATION = 2;
    
    private int lengthOfPencil;
    private int graphiteDurability;
    private int initialGraphiteDurability;
    
    private PencilConstructor() {
        lengthOfPencil = 80;
        graphiteDurability = 80;
        
        this.lengthOfPencil = lengthOfPencil;
        initialGraphiteDurability = graphiteDurability;
        this.graphiteDurability = graphiteDurability;
    }
    public int graphiteDurability static {
    
    }
}