
package boletin3;


public class Boletin3 {


    public static void main(String[] args) {
       
       Consumo obxConsume= new Consumo();
       /*float litros=50f;
       float pGas= 1.57f;*/
       
       Consumo obxConsumo= new Consumo(500f, 40f, 28f, 1.57f);
       obxConsumo.consumoMedio();
       obxConsumo.setvMed(60);
       System.out.println("Velocidad media: "+obxConsumo.getvMed()+" km/h");
    }
    
}
