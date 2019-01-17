package pillar.kata;
/**
 *
 * @author Carson
 */
public class Durability {
    char COLLISION_CHAR = '@';
    private Pencil pencil;
    private Eraser eraser;
    private String desiredText;
    
    public Durability() {
        int graphiteDurability = 80;
        int lengthoOfPencil = 80;
        int eraserDurability = 80;
        
        pencil = new Pencil(graphiteDurability, lengthoOfPencil);
        
    }
    
        
}
