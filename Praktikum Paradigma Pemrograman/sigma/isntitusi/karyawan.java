package isntitusi;

public class karyawan extends Pegawai {
    protected String departemen;
    
    public karyawan (String n, double g ,String d ){
        super(n, g);
        departemen = d;
    }

    @Override
    public void tampilData (){
        super.tampilData();
        System.out.print(departemen);
    }
}
