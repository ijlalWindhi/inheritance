package practice5;
public class mountainTruck extends truck{
    public int seatHeight;
    
    public mountainTruck(int startHeight, int startCadence, int startSpeed, int startGear){
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }
    
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
    
    public static void main(String[] args) {
        System.out.println("mulai berjalan");
        mountainTruck mb = new mountainTruck(0,0,0,0);
        System.out.println("gear= "+mb.gear);
        System.out.println("speed= "+mb.speed);
        mb.setGear(2);
        mb.speedUp(2);
        System.out.println("gear= "+mb.gear);
        System.out.println("speed= "+mb.speed);
        mb.speedUp(2);
        System.out.println("gear= "+mb.gear);
        System.out.println("speed= "+mb.speed);
    }
}
