package challengeOne;

class FerrisWhell {
    private Gondola[] gondolas;

    public FerrisWhell() {
        gondolas = new Gondola[18];
        for (int i = 0; i < gondolas.length; i++) {
            gondolas[i] = new Gondola(i + 1);
        }
    }

    public Gondola getGondola(int numero) {
        if (numero >= 1 && numero <= gondolas.length) {
            return gondolas[numero - 1];
        }
        return null;
    }

    public Gondola getNextFreeGondola() {
        for (Gondola gondola : gondolas) {
            if (gondola.isEmpty()) {
                return gondola;
            }
        }
        return null;
    }

    public void printGondolaStatus() {
        System.out.println("Gondola Status");
        System.out.println("------- -----------------------");
        for (Gondola gondola : gondolas) {
            System.out.print(gondola.getNumber() + " ");
            if (gondola.isEmpty()) {
                System.out.println("(empty)");
            } else if (gondola.getSeat2() == null) {
                System.out.println("Only " + gondola.getSeat1().getName());
            } else {
                System.out.println(gondola.getSeat1().getName() + " and " + gondola.getSeat2().getName());
            }
        }
    }
}


