package org.example.arge;

public class ElectricCar extends CarSkeleton{

        private double avgKmPerCharge;
        private int batterySize;

        public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
            super(name, description);
            this.avgKmPerCharge = avgKmPerCharge;
            this.batterySize = batterySize;
        }

        public double getAvgKmPerCharge() {
            return avgKmPerCharge;
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
