package inheritancePracticum;
public class siswa extends sekolah{
    private String nama;
    private int umur;
    
    public siswa(String nama, int umur, String nis, int absen, String kelas){
        super(nis, absen, kelas);
        this.nama=nama;
        this.umur=umur;
    }
    public void identity(){
        System.out.println("Nama  : "+nama);
        System.out.println("Umur  : "+umur);
        super.show();
    }
}
