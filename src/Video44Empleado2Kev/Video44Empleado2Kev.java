/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video44Empleado2Kev;

/**
 *
 * @author HP ENVY
 */
public class Video44Empleado2Kev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Jefaturas jefe_RRHH = new Jefaturas("Juan" , 55000,2006,9,25);
        
      jefe_RRHH.estableceIncentivo(2570);
        
      Empleado[] misempleados = new Empleado[6];
      
      misempleados[0] = new Empleado("Paco Gómez" , 8500,1990,12,17);
      
      misempleados[1] = new Empleado("Ana López" , 9500,1995,06,02);
      
      misempleados[2] = new Empleado("Maria Martin" , 105,2002,03,15);
      
      misempleados[3] = new Empleado("Antonio Fernandez",47500,2009,11,9);
      
      misempleados[4] =jefe_RRHH;
      
      misempleados[5] = new Jefaturas("Maria",95000,1999,5,26);
      
      Jefaturas jefa_Finanzas=(Jefaturas) misempleados[5];
      
      jefa_Finanzas.estableceIncentivo(55000);
      
    
      
       for(Empleado e : misempleados){
          
          e.subSueldo(5);
      }
      
      for(Empleado e:misempleados){
          
          System.out.println("Nombre: " + e.dameNombre() + 
                  " Sueldo: " + e.dameSueldo()+ " Fecha de alta " +
                  e.dameFechaContrato());
      }
    }
    }
    

