package challengeOne;

class child extends Person {
    private Adult responsible;

    public child(String name, int year, Adult responsible) {
        super(name, year);
        this.responsible = responsible;
    }

    public Adult getResponsible() {
        return responsible;
    }
}