package challengeOne;

public class Program {
    public static void main(String[] args) {
        FerrisWhell rodaGigante = new FerrisWhell();

        Adult joao = new Adult("Joao", 25);
        Adult paulo = new Adult("Paulo", 30);
        Adult maria = new Adult("Maria", 27);
        child pedro = new child("Pedro", 8, maria);

        Gondola gondola2 = rodaGigante.getGondola(2);
        if (gondola2 != null) {
            gondola2.setSeat1(joao);
            gondola2.setSeat2(paulo);
        }

        Gondola gondola3 = rodaGigante.getGondola(3);
        if (gondola3 != null) {
            gondola3.setSeat1(maria);
        }

        Gondola gondola13 = rodaGigante.getGondola(13);
        if (gondola13 != null) {
            gondola13.setSeat1(pedro);
        }

        rodaGigante.printGondolaStatus();
    }
}
