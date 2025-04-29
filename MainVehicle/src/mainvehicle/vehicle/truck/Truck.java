package mainvehicle.vehicle.truck;

import mainvehicle.vehicle.Vehicle;

public class Truck extends Vehicle {

    int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    

    @Override
    public double getRegularPrice() {
        
         if (weight > 2000) {
           
            return super.getRegularPrice() - (super.getRegularPrice() * 0.10);
        }
         else{  return super.getRegularPrice();
         }
        
        
        
      
    }
    
    

     
    
    
    
    
    
    
}
