package kasir_loundry;

public class setrika extends cuci1{
    private double berat;

   public void setBerat(double berat){
       this.berat = berat;
   }

    public double getBerat(){
        return (double) berat*5000;
    }

}
