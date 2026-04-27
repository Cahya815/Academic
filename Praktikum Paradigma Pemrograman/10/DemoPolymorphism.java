interface Bentuk {
	    void gambar();
	}
	
	class Lingkaran implements Bentuk {
	    public void gambar() {
	        System.out.println("Menggambar lingkaran...");
	    }
	}
class Persegi implements Bentuk {
   public void gambar() {
	        System.out.println("Menggambar persegi...");
	    }
	}
	public class DemoPolymorphism {
   public static void main(String[] args) {
	        Bentuk b;

      b = new Lingkaran();
       b.gambar();
	        b = new Persegi();
       b.gambar();
  }	}
    