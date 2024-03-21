package codeflow;

abstract public class AFuelCar extends ACar {

    int kmPrLitre;

    abstract String getFuelType();

    int getKmPrLitre() {
        return kmPrLitre;
    }
    @Override
    public String toString(){
        return super.toString() + kmPrLitre;
    }

}
