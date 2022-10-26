package com.mycompany.projeto;

import java.util.Scanner;

public class EstudosTwo {
    
    public static void main(String[]args){
        
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();
        Float nota = teclado.nextFloat();
        
        System.out.print("a nota do "+nome+ " é "+ nota);
        
        
    }
}
