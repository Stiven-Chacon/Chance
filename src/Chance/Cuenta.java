package Chance;

public class Cuenta {
    public static int x=2;
    public static registro [] cuenta= new registro[1000];        

    void Crear(String text, String text0, int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
    public class registro {
        String Identificacion;
	String  Usuario;
	String  Correo;
	String  NIP; 
        int Saldo;
        String IdentificacionR;
        String IdentificacionD;
        String Fecha;
    }
    
    public void Prellenar(){
        cuenta[1]=new registro();    
        cuenta[1].Identificacion="a";
        cuenta[1].Usuario=" ";
        cuenta[1].Correo= " ";
        cuenta[1].NIP="a";        
    }
	     
    public void Crear(String NUCuenta, String nombre, String correo) {    
        cuenta[x]=new registro();    
        cuenta[x].Identificacion=NUCuenta;
        cuenta[x].Usuario=nombre;
        cuenta[x].Correo=correo;
        x++;     
    }
    
	
    public void Abonar(String Idr, int deposito) {            
            for(int i=1;i<x;i++)    {                                       
                if (Idr.equals(cuenta[i].Identificacion))   {    
                    cuenta[i].Saldo=cuenta[i].Saldo+deposito;
                    System.out.print("Operacion realizada exitosamente \nPresione una tecla para continuar");                    
                }        
            }    
	}
    
    public boolean Validar(String Nocuenta, String NIP ) {        
        boolean band=false;
        for(int i=1;i<x;i++)    {                                       
            if (Nocuenta.equals(cuenta[i].Identificacion) && NIP.equals(cuenta[i].NIP))  {
                band=true; 
                break;
            }
        }                   
        return band;
    }
    public boolean Vusuario(String identificacion){
      boolean band=false;
        for(int i=1;i<x;i++)    {                                       
            if (identificacion.equals(cuenta[i].Identificacion))  {
                band=true; 
                break;
            }
        }                   
        return band;
    }
    
    
    
    public void Retirar(String Idr, int retiro) {
        for(int i=1;i<x;i++)    {                                       
                if (Idr.equals(cuenta[i].Identificacion))   {    
                    cuenta[i].Saldo=cuenta[i].Saldo-retiro;
                   System.out.print("Operacion realizada exitosamente \nPresione una tecla para continuar");                    
                }        
            }    

           }
}
