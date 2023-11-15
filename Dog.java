public class Dog implements Animal {

    @Override //This does nothing, other than indicate a method was overwritted. Like a comment... its needed in C# apparently.
    public String GetSound() {
        return "woof woof";
    }
    
}
