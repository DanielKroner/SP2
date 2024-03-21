package codeflow;

public class GasolineCar extends AFuelCar{

    int registrationFee;
    @Override
    String getFuelType() {
        return "Gasoline";
    }

    @Override
    public int getRegistrationFee() {
        if(this.kmPrLitre <= 50 && this.kmPrLitre >= 20){
            registrationFee = 330;
        }else if(this.kmPrLitre <= 19 && this.kmPrLitre >= 15){
            registrationFee = 1050;
        }else if(this.kmPrLitre <= 14 && this.kmPrLitre >= 10){
            registrationFee = 2340;
        }else if(this.kmPrLitre <= 9 && this.kmPrLitre >= 5){
            registrationFee = 5500;
        }else if(this.kmPrLitre <= 4){
            registrationFee = 10470;
        }

        return registrationFee;
    }
}
