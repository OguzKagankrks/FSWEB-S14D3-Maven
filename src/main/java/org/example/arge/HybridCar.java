package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int  batterySize;
    private int  cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int  batterySize, int cylinders){
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this. batterySize =  batterySize;
        this.cylinders = cylinders;
    }

    public int getCylinders() {
        return cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }
    public void startEngine(){
        System.out.println(getName() + "'s engine is starting");
    }
    public void drive(){
        runEngine();
    }
    protected void runEngine(){
        System.out.println(getName() + " is driving");
    }
}
