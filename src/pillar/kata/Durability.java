package pillar.kata;

import static pillar.kata.Pencil.lengthOfPencil;

/**
 *
 * @author Carson
 */
public class Durability {
    char COLLISION_CHAR = '@';
    
    private Pencil pencil;
    private Eraser eraser;
    private String writtenText;
    
    public Durability() {
        int graphiteDurability = 80;
        int lengthoOfPencil = 80;
        int eraserDurability = 80;
        
        pencil = new Pencil(graphiteDurability, lengthOfPencil);
        eraser = new Eraser(eraserDurability);
        writtenText = "";
    }
    public void write(String writtenText) {
        int graphiteDegredation;
        graphiteDegredation = writtenText.length();
        int remainingGraphite = Pencil.graphiteDurability - graphiteDegredation;
        System.out.println(remainingGraphite);
    }
    
        
}
