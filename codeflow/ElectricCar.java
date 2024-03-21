package codeflow;

public class ElectricCar extends ACar {

    int batteryCapacity;
    int maxRange;
    int whPrKm;

    public int getBatteryCapacityKWh(){
        return batteryCapacity;
    }

    public int getMaxRangeKm(){
        return maxRange;
    }

    public int getWhPrKm(){
        whPrKm = maxRange / batteryCapacity;
        return whPrKm;
    }

    @Override
    public int getRegistrationFee() {
        return 0;
    }
}
