class simpul {
    String elemen;
    simpul kiri, kanan;

    public simpul(String elemen) {
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

    simpul tambahSimpul(simpul Penunjuk, String ELEMEN) {
        if (Penunjuk == null) {
            Penunjuk = new simpul(ELEMEN);
        } else {
            if (ELEMEN.compareTo(Penunjuk.elemen) < 0) {
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

public class ProgramPohonBiner {
    public static void main(String[] args) {
        pohon tree = new pohon();
        tree.deklarasiPohon();

        tree.akar = tree.tambahSimpul(tree.akar, "M");
        tree.akar = tree.tambahSimpul(tree.akar, "D");
        tree.akar = tree.tambahSimpul(tree.akar, "P");
        tree.akar = tree.tambahSimpul(tree.akar, "D");
        tree.akar = tree.tambahSimpul(tree.akar, "A");
        tree.akar = tree.tambahSimpul(tree.akar, "S");
        tree.akar = tree.tambahSimpul(tree.akar, "K");
        tree.akar = tree.tambahSimpul(tree.akar, "N");
        tree.akar = tree.tambahSimpul(tree.akar, "G");
        tree.akar = tree.tambahSimpul(tree.akar, "O");
        tree.akar = tree.tambahSimpul(tree.akar, "L");
        tree.akar = tree.tambahSimpul(tree.akar, "W");
        tree.akar = tree.tambahSimpul(tree.akar, "F");
        tree.akar = tree.tambahSimpul(tree.akar, "J");
        tree.akar = tree.tambahSimpul(tree.akar, "T");
        tree.akar = tree.tambahSimpul(tree.akar, "H");
        tree.akar = tree.tambahSimpul(tree.akar, "U");

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