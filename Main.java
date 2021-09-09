/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.util.Scanner;
import Model.Produto;

/**
 *
 * @author kauaw
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler=new Scanner(System.in);
       Produto p1=new Produto();
       System.out.print("informe o nome do produto:");
       p1.nome=ler.nextLine();
       System.out.print("informe o valor de custo:");
       p1.ValorCusto=ler.nextDouble();
       System.out.print("informe o valor de venda:");
       p1.ValorVenda=ler.nextDouble();
       System.out.print("informe a quantidade:");
       p1.quantidade=ler.nextInt();
       System.out.println("L U C R O:");
       
       System.out.println("lucro unitario = "+p1.calcularLucroUnitario());
       System.out.println("lucro total = "+p1.calcularLucroTotal());
    }
    
}
