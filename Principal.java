/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Programa de facturación de venta de kilos de Sal
import java.util.Scanner;
/**
 *
 * @author RHINO VS OJITOS
 */
public class Principal {
    
    public static void main(String[]args){
        String codigo=" ";
        int kilos=0;
        float precio=0;
        float importeFactura=0;
        float facturacionTotal=0;
        int contador=0;
        int totalKilos=0;
        Scanner sc=new Scanner(System.in);  
        
        for (int i=1;i<=2;i++) //i=3
        {
            System.out.println("Factura n°"+i);
            System.out.println("Codigo del Producto: ");
            codigo=sc.next();
            System.out.println("Cantida de en kilos: "); //
            kilos=sc.nextInt(); //50
            System.out.println("Precio: "); 
            precio=sc.nextFloat(); //10 
            importeFactura=kilos*precio; //2000
            facturacionTotal=importeFactura+facturacionTotal; //3500
            
            if(importeFactura>1000)
            {
                contador++; //2
            }
            totalKilos=kilos+totalKilos; //350
        }
        System.out.println("Detalle de la venta");
        System.out.println("Facturacion total: Q"+facturacionTotal);
        System.out.println("Total de kilos vendidos: "+totalKilos);
    }
        
}
