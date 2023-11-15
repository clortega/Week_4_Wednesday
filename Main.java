
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        // System.out.println(Duck.getSound());
        System.out.println(new Cat().GetSound());
        System.out.println(new Dog().GetSound());
        System.out.println(new Goose().GetSound());

        User user = new User();
        System.out.println(user);

    }
}