package inheritancePracticum;
public class sekolah {
    private String nis;
    private int absen;
    private String kelas;
    
    public sekolah(String nis, int abesn, String kelas){
        this.nis=nis;
        this.absen=abesn;
        this.kelas=kelas;
    }
    public void show(){
        System.out.println("Nis   : "+nis);
        System.out.println("Absen : "+absen);
        System.out.println("Kelas : "+kelas);
    }
}
