package practice2;
public class employ extends person{
    private String noKaryawan;
    
//    konstruktor
    public employ(String noKaryawan, String nama, int usia){
        super(nama, usia);
        this.noKaryawan = noKaryawan;
    }
//    metode
    public void info(){
        System.out.println("No. Karyawan : "+this.noKaryawan);
        super.info();
    }
}
