/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.DuglasRos.sistem;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int opcion = 0;
    do{
    do{
        opcion=Integer.parseInt(JOptionPane.showInputDialog ("Bienvenido\n"
        +"1=Suma\n"
        +"2=Resta\n"
        +"3=Multiplicacion\n"
        +"4=Division\n"
        +"Elija una opcion"));
        
    switch(opcion) {
    case 1:
        Sumar suma = new Sumar (0,0);
	
	suma.valor1 = Integer.parseInt(JOptionPane.showInputDialog ("Ingrese un numero"));
	suma.valor2 = Integer.parseInt(JOptionPane.showInputDialog ("Ingrese un numero"));
	
	JOptionPane.showMessageDialog(null,"La sumatoria es: "+(suma.sumatoria(suma.valor1,suma.valor2)));
    break;
    case 2:
        Restar resta = new Restar (0,0);
	
	resta.valor1 = Integer.parseInt(JOptionPane.showInputDialog ("Ingrese un numero"));
	resta.valor2 = Integer.parseInt(JOptionPane.showInputDialog ("Ingrese un numero"));
	
	JOptionPane.showMessageDialog(null,"La resta es: "+(resta.residuo(resta.valor1,resta.valor2)));
    break;
    case 3:
        Multiplicar multiplicacion = new Multiplicar (0,0);
	
	multiplicacion.valor1 = Integer.parseInt(JOptionPane.showInputDialog ("Ingrese un numero"));
	multiplicacion.valor2 = Integer.parseInt(JOptionPane.showInputDialog ("Ingrese un numero"));
	
	JOptionPane.showMessageDialog(null,"La multiplicacion es: "+(multiplicacion.producto(multiplicacion.valor1,multiplicacion.valor2)));
    break;
    case 4:
        Divisor division = new Divisor (0,0);
        
	division.valor1 = Integer.parseInt(JOptionPane.showInputDialog ("Ingrese un numero"));
	division.valor2 = Integer.parseInt(JOptionPane.showInputDialog ("Ingrese un numero"));

        if(division.valor2 != 0){
        JOptionPane.showMessageDialog(null,"La division es: "+(division.cociente(division.valor1,division.valor2)));
        
        }else{
        JOptionPane.showMessageDialog(null,"No se puede dividir entre 0");
        }
    break;
    default:
    }
    }while(opcion > 4);
    opcion =Integer.parseInt(JOptionPane.showInputDialog ("Operar de nuevo \n"
            +"SI = 1 \n"
            + "NO = 2"));
    }while(opcion == 1);
   }
}
    


    
