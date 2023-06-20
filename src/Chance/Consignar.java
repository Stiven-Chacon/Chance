/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chance;
/**
 *
 * @author CASA
 */
public class Consignar {
        public static int x=2;
    public static Consig [] CuentaCon= new Consig[1000];        

     public class Consig {
        int Saldo;
        String IdentificacionR;
        String IdentificacionD;
        String Fecha;
    }
     public void CrearRetiro(String Idr, String IDd, int saldo, String fecha){
        CuentaCon[x]= new Consig();    
        CuentaCon[x].IdentificacionR=Idr;
        CuentaCon[x].IdentificacionD=IDd;
        CuentaCon[x].Saldo=saldo;
        CuentaCon[x].Fecha=fecha;
        x++;     
    }
}
