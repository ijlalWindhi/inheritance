package practice5;
public class truck {
    public int cadence;
    public int gear;
    public int speed;
    
    public truck(int startCadence, int startSpeed, int startGear){
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
    
    public void setCadence(int newValue){
        cadence = newValue;
    }
    
    public void setGear(int newValue){
        gear = newValue;
    }
    
    public void applybreak(int decrement){
        speed = decrement;
    }
    
    public void speedUp(int increment){
        speed = increment;
    }
}
