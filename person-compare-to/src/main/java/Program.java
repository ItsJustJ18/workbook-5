import java.util.ArrayList;
import java.util.Collections;

public class Program {

    public static void main(String[] args) {
        ArrayList<Person> myFamily = new ArrayList<>();
        Person p = new Person("Dad", "El Dado", 48);
        Person f = new Person("Super", "Dog", 12);
        Person z = new Person("Sheldon", "Plankton", 98);
        myFamily.add(p);
        myFamily.add(f);
        myFamily.add(z);

        Collections.sort(myFamily);
        Collections.reverse(myFamily);

        for (Person person : myFamily) {
            System.out.println(person);
        }
    }

}
