package practice4;
public class b extends a{
    private int b;
    public void setB(int nilai){
        b = nilai;
    }
    public int getB(){
        return b;
    }
    public void tampilkanNilai(){
        super.tampilkanNilai();
        System.out.println("Nilai B : "+getB());
    }
}
