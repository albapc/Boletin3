
package boletin3;

import java.util.Scanner;


public class Consumo {
    private float km;
    private float litros;
    private float vMed;
    private float pGas;

public Consumo () {
    
}
public Consumo (float k, float l, float v, float p){
        km = k;
        litros = l;
        vMed = v;
        pGas = p;
    }
public float getTempo(){//espacio/velocidad
    return km/vMed;
}
public float consumoMedio(){
    /*Scanner sc= new Scanner (System.in);
    System.out.println("Introduce litros de combustible:");
    litros=sc.nextFloat();
    System.out.println("Introduce kilómetros recorridos:");
    km=sc.nextFloat();*/
    float consumoM;
    consumoM= (litros/km)*100;
    System.out.println("Consumo medio: "+consumoM+" l/100 km.");
    return consumoM;
}
public float consumoEuros(){
    /*Scanner sc= new Scanner (System.in);
    System.out.println("Introduce litros de combustible:");
    litros=sc.nextFloat();
    System.out.println("Introduce kilómetros recorridos:");
    km=sc.nextFloat();*/
    float consumoE;
    consumoE= ((litros/km)*100)*pGas;
    System.out.println("Consumo en euros: "+consumoE+"€");
        return consumoE;
}
public void setKms(float k){
    km= k;
}
public void setLitros(float l){
    litros= l;
}
public void setvMed(float v){
    vMed= v;
}
public float getvMed(){
    return vMed;
}
public void setpGas(float p){
    pGas= p;
}
}
