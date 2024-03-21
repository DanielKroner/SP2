package codeflow;

public class DieselCar extends AFuelCar {

    int registrationFee;
    boolean ParticleFilter;
    @Override
    String getFuelType() {
        return "Diesel";
    }
    public boolean hasParticleFilter(){
        return this.ParticleFilter;

    }
    @Override
    public int getRegistrationFee() {
        if(this.kmPrLitre <= 50 && this.kmPrLitre >= 20){
            registrationFee = 330 + 130;
        }else if(this.kmPrLitre <= 19 && this.kmPrLitre >= 15){
            registrationFee = 1050 + 1390;
        }else if(this.kmPrLitre <= 14 && this.kmPrLitre >= 10){
            registrationFee = 2340 + 1850;
        }else if(this.kmPrLitre <= 9 && this.kmPrLitre >= 5){
            registrationFee = 5500 + 2770;
        }else if(this.kmPrLitre <= 4){
            registrationFee = 10470 + 15260;
        }

        return registrationFee;
    }
}
