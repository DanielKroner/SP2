package codeflow;

abstract public class ACar implements ICar {

    String registrationNumber;
    String carMake;
    String carModel;
    int numberOfDoors;


    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getMake() {
        return carMake;
    }

    @Override
    public String getModel() {
        return carModel;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public String toString(){
        return "Reg #: " + registrationNumber + " Make: " + carMake + " Model: " + carModel + " #ofDoors: " + numberOfDoors;
    }
}
