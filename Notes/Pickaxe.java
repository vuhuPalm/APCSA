import java.awt.Color;
/**
 * Write a description of class Pickaxe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pickaxe
{
    private String metal;
    private String handle;
    private int length;
    private Color color;
    private String rarity;
    private int durability = 100;
    
    /**
     * Constructor for objects of class Pickaxe
     */   
    public Pickaxe(String metalType, String handleType, int length,
    Color color, String rarityType){
        metal = metalType;
        handle = handleType;
        rarity = rarityType;
        this.length = length;
        this.color = color;
    }
    public void
}
