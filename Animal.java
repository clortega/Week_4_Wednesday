
public interface Animal {

    public abstract String GetSound();

    default public boolean CanSwim() { //add default
        return true;
    }
    
}
    