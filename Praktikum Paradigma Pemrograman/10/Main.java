interface Hewan {
    void suara(); // method tanpa isi
}

class Kucing implements Hewan {
    public void suara() {
        System.out.println("Meong...");
    }
}

class Anjing implements Hewan {
    public void suara() {
        System.out.println("Guk guk...");
    }
}


public class Main {
    public static void main(String[] args) {
        Hewan h1 = new Kucing();
        Hewan h2 = new Anjing();

        h1.suara();
        h2.suara();
    }
}
