package challengeOne;
import java.util.ArrayList;
import java.util.List;
public class Person {
    private String name;
    private Person spouse;
    private List<Person> children;

    public Person(String name) {
        this.name = name;
        this.spouse = null;
        this.children = new ArrayList<>();
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public void spouse(Person spouse) {
        this.spouse = spouse;
        spouse.spouse = this;
    }

    public void printFamilyTree(int level) {
        printIndentation(level);
        System.out.print(name);

        if (spouse != null) {
            System.out.print(" -- Married to: " + spouse.name);
        }

        if (!children.isEmpty()) {
            System.out.println(" -- Children:");
            for (Person child : children) {
                child.printFamilyTree(level + 1);
            }
        } else if (spouse == null) {
            System.out.println(" -- Single");
        }
    }

    private void printIndentation(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
    }
}