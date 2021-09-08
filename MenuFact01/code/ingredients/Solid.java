package ingredients;

public abstract class Solid extends Ingredient{
    public Solid() {
        setUnit(new Unit("mg"));
    }
    public Solid(String nom) { super(nom); setUnit(new Unit("mg")); }
}
