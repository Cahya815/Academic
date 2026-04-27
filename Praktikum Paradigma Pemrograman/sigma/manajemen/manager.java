package manajemen;

import isntitusi.Pegawai;

public class manager extends Pegawai {
    protected String divisi;
    protected double bonus;

    public manager (String n, double g ,String d, double b){
        super(n, g);
        divisi = d;
        bonus = b;
    }

    @Override
    public void tampilData () {
         super.tampilData();
         System.out.println("Nama  : " + divisi);
        System.out.println("Gaji  : " + bonus);
    }

}

