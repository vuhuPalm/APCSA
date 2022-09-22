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
    private double length;
    private String ability;
    private String rarity;
    private int durability = 100;
    
    /**
     * Constructor for objects of class Pickaxe
     */   
    public Pickaxe(String metalType, String handleType, double length,
    String abilityType, String rarityType){
        metal = metalType;
        handle = handleType;
        rarity = rarityType;
        this.length = length;
        ability = abilityType;
    }
    public Pickaxe(){
        metal = "diamond";
        handle = "wood";
        rarity = "epic";
        length = 2.5;
        ability = "extra speed";
    }
    
    public String getMetal(){
        return metal;
    }
    public String getHandle(){
        return handle;
    }
    public String getRarity(){
        return rarity;
    }
    public double getLength(){
        return length;
    }
    public String getAbility(){
        return ability;
    }
    
    public void setLength(double newLength){
        length = newLength;
    }
    public void setMetal(String newMetal){
        metal = newMetal;
    }
    public void setRarity(String newRarity){
        rarity = newRarity;
    }
    public void setHandle(String newHandle){
        handle = newHandle;
    }
    public void setAbility(String newAbility){
        ability = newAbility;
    }
    
    public void mineStone(){
        if (durability == 0){
            System.out.println("You need to fix your pickaxe, yours is broken");
        } else {
        durability--;
        System.out.println("You mined the stone with your pickaxe and lost 1 durability");
    }
    }
    public void fixPick(){
        durability = 100;
        System.out.println("Your pickaxe is fixed and its durability is " + durability);
    }
    public void mineIron(){
        if (durability <= 10){
            System.out.println("You need to fix your pickaxe, it is almost broken");
        } else {
            durability -= 10;
            System.out.println("You mined the iron and lost 10 durability");
        }
    }
}
