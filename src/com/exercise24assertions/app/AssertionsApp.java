package com.exercise24assertions.app;

import java.util.Scanner;
public class AssertionsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variable declaration 
		int edad=0;
		
		//Object Declaration
		Scanner input = new Scanner(System.in);
		
		System.out.println("Eres mayor de edad? Introduce tu edad: ");
		edad = input.nextInt();
		System.out.println(isMayorEdad(edad));
		
		/*assert edad>0: "Edad NO valida";
		
		if(edad<18)
		{
			System.out.println("Menor de edad");
		}
		if(edad>=18)
		{
			System.out.println("Chavorruco");
		}*/
	}
	public static String isMayorEdad(int edad)
	{
		String cad="";
        assert edad>0: "Edad NO valida"
        		+ "El metodo solo acepta valores positivos";
		
		if(edad<18)
		{
			cad = "Menor de edad";
		}
		if(edad>=18)
		{
			cad = "Chavorruco";
		}
		return cad;
	}

}
