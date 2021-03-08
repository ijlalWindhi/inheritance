package practice3;
public class gajah extends hewan{
    public static void testClassMethod(){
        System.out.println("The class method in hewan...");
    }
    public void testInstanceMethod(){
        System.out.println("The instance method in hewan...");
    }
    public static void main(String[] args) {
        gajah myGajah = new gajah();
        hewan myHewan = myGajah;
        hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}
