package program;

/*
beecrowd | 1073 - Quadrado de Pares

Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 até N,
inclusive N, se for o caso.

Entrada
A entrada contém um valor inteiro N (5 < N < 2000).

Saída
Imprima o quadrado de cada um dos valores pares, de 1 até N, conforme o exemplo abaixo.

Tome cuidado! Algumas linguagens tem por padrão apresentarem como saída 1e+006 ao invés de 1000000 
que ocasionará resposta errada. Neste caso, configure a precisão adequadamente para que isso não ocorra.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 2;i <= n; i++) {
			
			if(i % 2 == 0) {
				System.out.println(i + "^2 = " + (int) Math.pow(i , 2));
			}
		}
		sc.close();
	}
}
