
public abstract class AbstractClass {
    
   private char unitId;
   public char UnitName;
   public char Location;
   public char City;
   public char State;
   public double AreaLength;
   public double AreaWide;
   public double TotalArea;
   public int NoOfFloor;
   public int NoOfFlat;
   public String OwnerOfTheUnit;
   private char Address;
   private char OwnerCity;
   private char OwnerState;
   private int Phone;
   private char LaunchedDate;
   private double EstimatedCost;
    
    
 abstract   public void showPropertyInfo();
 abstract public void showPropertyOwnerInfo();
 
 
 char getUnitId(){
     return unitId;
     
 }
 
 char getAddress(){
     return Address;
 }
 
 char getOwnerCity(){
     return OwnerCity;
 }
 
 char getOwnerState(){
     return OwnerState;
 }
 
 int getPhone(){
     return Phone;
 }
 
 char getLaunchedDate(){
     return LaunchedDate;
 }
 
 double getEstimatedCost(){
     return EstimatedCost;
 }
 
 
}
