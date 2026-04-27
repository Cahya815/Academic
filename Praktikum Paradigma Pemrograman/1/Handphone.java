class Handphone {
String merk;
String proci;
String zamn;

public void setHandphone(String merk, String proci, String zamn) {
this.merk = merk;
this.proci = proci;
this.zamn = zamn;
}

public void tampil() {
System.out.println("Merk HP   : " + merk);
System.out.println("Tipe Processor   : " + proci);
System.out.println("Apakah Hp Reccomended  : " + zamn);
    }
}
