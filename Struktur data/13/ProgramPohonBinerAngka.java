class simpul {
    int elemen;
    simpul kiri, kanan;

    public simpul(int elemen) {
        this.elemen = elemen;
        this.kiri = null;
        this.kanan = null;
    }
}

class pohon {
    simpul akar;

    void deklarasiPohon() {
        akar = null;
    }

    simpul tambahSimpul(simpul Penunjuk, int ELEMEN) {
        if (Penunjuk == null) {
            Penunjuk = new simpul(ELEMEN);
        } else {
            if (ELEMEN < Penunjuk.elemen) {
                Penunjuk.kiri = tambahSimpul(Penunjuk.kiri, ELEMEN);
            } else {
                Penunjuk.kanan = tambahSimpul(Penunjuk.kanan, ELEMEN);
            }
        }
        return Penunjuk;
    }

    void preOrder(simpul Penunjuk) {
        if (Penunjuk != null) {
            System.out.print(Penunjuk.elemen + " ");
            preOrder(Penunjuk.kiri);
            preOrder(Penunjuk.kanan);
        }
    }

    void inOrder(simpul Penunjuk) {
        if (Penunjuk != null) {
            inOrder(Penunjuk.kiri);
            System.out.print(Penunjuk.elemen + " ");
            inOrder(Penunjuk.kanan);
        }
    }

    void postOrder(simpul Penunjuk) {
        if (Penunjuk != null) {
            postOrder(Penunjuk.kiri);
            postOrder(Penunjuk.kanan);
            System.out.print(Penunjuk.elemen + " ");
        }
    }
}

public class ProgramPohonBinerAngka {
    public static void main(String[] args) {
        pohon tree = new pohon();
        tree.deklarasiPohon();

        tree.akar = tree.tambahSimpul(tree.akar, 50);
        tree.akar = tree.tambahSimpul(tree.akar, 30);
        tree.akar = tree.tambahSimpul(tree.akar, 70);
        tree.akar = tree.tambahSimpul(tree.akar, 20);
        tree.akar = tree.tambahSimpul(tree.akar, 40);
        tree.akar = tree.tambahSimpul(tree.akar, 60);
        tree.akar = tree.tambahSimpul(tree.akar, 80);
        tree.akar = tree.tambahSimpul(tree.akar, 100);
        tree.akar = tree.tambahSimpul(tree.akar, 10);
        tree.akar = tree.tambahSimpul(tree.akar, 90);

        System.out.print("PreOrder: ");
        tree.preOrder(tree.akar);
        System.out.println();

        System.out.print("InOrder: ");
        tree.inOrder(tree.akar);
        System.out.println();

        System.out.print("PostOrder: ");
        tree.postOrder(tree.akar);
        System.out.println();
    }
}