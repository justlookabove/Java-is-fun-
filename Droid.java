/**************************************************

                Kiran Gunasekaran
                Droid.java

**************************************************/


public class Droid {
  int batteryLevel;
  
  Droid() {
    batteryLevel = 100;
  }
  
  public void activate() {
    System.out.println("ACTIVATED, How may I help you?");
    batteryLevel = batteryLevel - 5;
    System.out.println("BatteryLevel is: " + batteryLevel + " percent.");
  }
  
  public void chargeBattery(int hours) {
    System.out.println("Droid charging...");
    batteryLevel = batteryLevel + hours;
    
    if(batteryLevel > 100) {
      batteryLevel = 100;
    } else {
      System.out.println("BatteryLevel is: " + batteryLevel + " percent.");
    }
  }
  
  public int checkBatteryLevel() {
    System.out.println("BatteryLevel is: " + batteryLevel + " percent.");
    return batteryLevel;
  }
  
  public void hover(int feet) {
    if(feet > 2) {
      System.out.println("Error! I cannot hover above 2 feet.");
    } else {
      System.out.println("Hovering...");
      batteryLevel = batteryLevel - 20;
      System.out.println("BatteryLevel is: " + batteryLevel + " percent.");
    }
  }
  
  public static void main(String[] args) {
    Droid Fly = new Droid();
    Fly.activate();
    Fly.chargeBattery(5);
    Fly.hover(1);
  }
}