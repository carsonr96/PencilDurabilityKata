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
    private static String writtenText;
    
    int upperCase;
    int lowerCase;
    static int degredationValue;
    
    public Durability() {
        int graphiteDurability = 80;
        int lengthoOfPencil = 80;
        int eraserDurability = 80;
        
        pencil = new Pencil(graphiteDurability, lengthOfPencil);
        eraser = new Eraser(eraserDurability);
        writtenText = "";
            }
        }
