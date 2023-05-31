package challengeOne;


class Gondola {
    private int number;
    private Person seat1;
    private Person seat2;

    public Gondola(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Person getSeat1() {
        return seat1;
    }

    public void setSeat1(Person person) {
        this.seat1 = person;
    }

    public Person getSeat2() {
        return seat2;
    }

    public void setSeat2(Person person) {
        this.seat2 = person;
    }

    public boolean isFull() {
        return seat1 != null && seat2 != null;
    }

    public boolean isEmpty() {
        return seat1 == null && seat2 == null;
    }
}
