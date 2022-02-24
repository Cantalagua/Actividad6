/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author alexi
 */

class alumno {
    public static final int[] cali = {98, 73, 65, 83, 100};
    public static final String nombre = "Luis Lucía";
    
    public double getPromedio(){
        double total = 0;
        for(int i=0; i<cali.length; i++){
        	total = total + cali[i];
        }
        double prom = total / cali.length;
            
            return prom; 
    }
    
    public String getCalFin() {
        String calF = "";
        if (getPromedio()<50) {
            calF = "F";
        }
        else if (getPromedio()<60 && getPromedio()>51) {
            calF = "E";
                       
        }
        else if (getPromedio()<70 && getPromedio()>61) {
            calF = "D";
        }   
               
        else if (getPromedio()<80 && getPromedio()>71) {
            calF = "C";
        }
        
        else if (getPromedio()<90 && getPromedio()>81) {
            calF = "B";
        }
        
        else if (getPromedio()<100 && getPromedio()>91) {
            calF = "A";
        }
        
        return calF;
    }    
    
    public String prnCal(){
        
    String fin = "Nombre del estudiante: " + nombre + "\nCalificación 1:" + cali[0] + "\nCalificación 2:" + cali[1] + "\nCalificación 3:" + cali[2] + "\nCalificación 4:" + cali[3] + "\nCalificación 5:" + cali[4] + "\nPromedio: " + getPromedio() + "\nCalificación: " + getCalFin();
    return fin;
    
    }
}


public class Actividad6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        alumno calf = new alumno();
        System.out.println(calf.prnCal());
        
    }
    
}

