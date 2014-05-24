package com.mycompany.primerproyecto;

public class ContadorVisitas {
    private static int contador;
    
public static int getContador(){
    contador++;
    return contador;
}
public static void setContador(int contador){
    this.contador=contador;
}
}
