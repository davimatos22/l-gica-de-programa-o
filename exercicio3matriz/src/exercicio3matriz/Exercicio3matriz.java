
package exercicio3matriz;

import java.util.Scanner;

public class Exercicio3matriz {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int matriznum [][] = new int [2][2];
        double matrizresultado [][] = new double [2][2];
        int maior = 0;
        
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                System.out.println("informe o valor do numero");
                matriznum [linha][coluna] = teclado.nextInt();
            }   
        }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    if (maior < matriznum[i][j]){
                        maior = matriznum[i][j];
                        
                }
            }
         }
         
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    matrizresultado [i][j] = matriznum [i][j] * maior;
                }       
        }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.println(matrizresultado [i][j]);
                }
            
        }
    }        
}
