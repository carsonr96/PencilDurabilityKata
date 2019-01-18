package pillar.kata;
/**
 *
 * @author Carson
 */
public class Durability {
    char COLLISION_CHAR = '@';
    
    private Pencil pencil;
    private Eraser eraser;
    private static String writtenText;
    
    int upperCase;
    int lowerCase;
    static int degredationValue;
    
    public Durability() {
        int graphiteDurability = 0;
        int lengthOfPencil = 0;
        int eraserDurability = 0;
        
        pencil = new Pencil(graphiteDurability, lengthOfPencil);
        eraser = new Eraser(eraserDurability);
        writtenText = "";
        int graphiteDegredation;
    }

}
