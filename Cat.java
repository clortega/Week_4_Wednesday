public class Cat implements Animal {
    @Override
    public String GetSound()
    {
        return "meow";
    }

    @Override
    public boolean CanSwim() {
        return false;
    }
}
