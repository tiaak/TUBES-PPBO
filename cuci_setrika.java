package kasir_loundry;

public class cuci_setrika extends cuci1{
    private double berat;

   public void setBerat(double berat){
       this.berat = berat;
   }

    public double getBerat(){
        return (double) berat*8000;
    }

}
