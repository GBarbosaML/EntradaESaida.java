package com.mycompany.projeto;

import java.util.Scanner;

public class EstudosTwo {
    
    public static void main(String[]args){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("digite o nome aluno:");
        String nome = teclado.nextLine();
        
        System.out.println("digite a nota do aluno:");
        Float nota = teclado.nextFloat();
        
        System.out.print("a nota do "+nome+ " é "+ nota);
        
        
    }
}
