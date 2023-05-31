package challengeOne;

public class TestTree {
    public static void main(String[] args) {
        Person lilly = new Person("Lilly");
        lilly.spouse(new Person("Wilhelm"));

        Person opa = new Person("Opa");
        opa.spouse(new Person("Oma"));
        lilly.addChild(opa);

        Person reinhold = new Person("Reinhold");
        reinhold.spouse(new Person("Sonia"));
        opa.addChild(reinhold);

        Person christian = new Person("Christian");
        christian.spouse(new Person("Monica"));
        reinhold.addChild(christian);

        christian.addChild(new Person("Oscar"));
        christian.addChild(new Person("Lorena"));

        opa.addChild(new Person("Gabrielle"));
        opa.addChild(new Person("Sabine"));

        Person wilma = new Person("Wilma");
        wilma.spouse(new Person("Rodolfo"));
        lilly.addChild(wilma);

        Person ricardo = new Person("Ricardo");
        ricardo.spouse(new Person("Debora"));
        wilma.addChild(ricardo);

        wilma.addChild(new Person("Rodrigo"));

        Person sigrid = new Person("Sigrid");
        sigrid.spouse(new Person("Peter"));
        lilly.addChild(sigrid);

        Person martin = new Person("Martin");
        martin.spouse(new Person("Carla"));
        sigrid.addChild(martin);

        martin.addChild(new Person("Nicolas"));

        sigrid.addChild(new Person("Thomas"));
        sigrid.addChild(new Person("Claudia"));

        lilly.printFamilyTree(0);
    }

}
