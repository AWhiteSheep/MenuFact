package ingredients;

public abstract class Liquide extends Ingredient{
    public Liquide() {
        setUnit(new Unit("ml"));
    }
    public Liquide(String nom) {
        super(nom);
        setUnit(new Unit("ml"));
    }
}
