
package boletin3;


public class Boletin3 {


    public static void main(String[] args) {
       
       Consumo obxConsume= new Consumo();
       /*obxConsume.setLitros(50f);
       obxConsume.setpGas(1.57f);*/
       
       Consumo obxConsumo= new Consumo(500f, 40f, 28f, 1.57f);
       obxConsumo.setLitros(15f);
       obxConsumo.consumoMedio();
       obxConsumo.setvMed(60);
       System.out.println("Velocidad media: "+obxConsumo.getvMed()+" km/h");
       
    }
    
}
