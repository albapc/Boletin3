
package boletin3;


public class Boletin3 {


    public static void main(String[] args) {
       
       Consumo obxConsume= new Consumo();
       float litros=50f;
       float pGas= 1.57f;
       
       Consumo obxConsumo= new Consumo(0f, 0f, 0f, 0f);
       obxConsumo.consumoMedio();
       float vMed=60;
       System.out.println("Velocidad media: "+vMed+" km/h");
    }
    
}
