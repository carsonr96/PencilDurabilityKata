package pillar.kata;
/**
 *
 * @author Carson
 */
public class Eraser {
    static int eraserDurability;

    Eraser(int eraserDurability) {
        this.eraserDurability = eraserDurability;
    }
    
    void erase() {
        if (eraserDurability > 0) {
            eraserDurability--;
        } else {
            System.out.println("You cannot erase any more, please get a replacement.");
        }
    }
}