import java.util.ArrayList;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        // System.out.println(Duck.getSound());
        System.out.println(new Cat().GetSound());
        System.out.println(new Dog().GetSound());
        System.out.println(new Goose().GetSound());

        User user = new User("My name is User");
        System.out.println(user);

        Instructor instructor = new Instructor("Dog");
        System.out.println(instructor);

        var usersList = new ArrayList<User>();
        usersList.add(user);
        PrintUsers(usersList);

        System.out.println(new Cat().CanSwim());
        System.out.println(new Goose().CanSwim());

        B b = new B("Apple", "Carrot", "Peach", "fruit");
        System.out.println(b.Present());
    }



    public static void PrintUsers(ArrayList<User> users) {
        for(var user : users) {
            System.out.println(user);
        }
    }
}