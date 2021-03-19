/**
 * @author Pedro Henrique Souza Peçanha
 */
package projeeto_jogo_da_velha;
import java.util.Scanner;
import java.util.Random;

public class jogo {
	
	static Random numero = new Random();
	
	static int[] criaVetor() {
		int[] vetor = new int[9];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = 0;
		}
		return vetor;
	}

	static String[][] criaMatriz() {
		String[][] matriz = new String[3][3];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) { // MATRIZ QUADRADA
				matriz[i][j] = " ";
			}
		}

		return matriz;
	}

	static void grafico(String m[][]) {
		System.out.print("         |          |                                               |          |       "
				+ "\n    " + m[0][0] + "    |    " + m[0][1] + "     |    " + m[0][2]
				+ "                                      1   |     2    |    3     "
				+ "\n         |          |                                               |          |         "
				+ "\n---------+----------+----------                             --------+----------+---------"
				+ "\n         |          |                                               |          |         "
				+ "\n    " + m[1][0] + "    |    " + m[1][1] + "     |     " + m[1][2]
				+ "                                     4   |     5    |    6    "
				+ "\n         |          |                                               |          |         "
				+ "\n---------+----------+----------                             --------+----------+---------"
				+ "\n         |          |                                               |          |         "
				+ "\n     " + m[2][0] + "   |    " + m[2][1] + "     |     " + m[2][2]
				+ "                                     7   |     8    |    9    "
				+ "\n         |          |                                               |          |         \n");

	}

	static void jogador1(int v[], String m[][]) {
		Scanner kib = new Scanner(System.in);
System.out.println("PLAYER 1");
		for (int i = 0; i < 1;) {
			int N = kib.nextInt();
			switch (N) {
			case 1:
				if (v[0] == 0) {
					v[0] = 1;
					m[0][0] = "X";
					grafico(m);
					i =1;
				} else {
					System.out.println("Digite novamente");
				}
				break;
			case 2:
				if (v[1] == 0) {
					v[1] = 1;
					i =1;
					m[0][1] = "X";
					grafico(m);
				} else {
					System.out.println("Digite novamente");
				}
				break;
			case 3:
				if (v[2] == 0) {
					v[2] = 1;
					m[0][2] = "X";
					i =1;
					grafico(m);
				} else {
					System.out.println("Digite novamente");
				}
				break;
			case 4:
				if (v[3] == 0) {
					v[3] = 1;
					m[1][0] = "X";
					i =1;
					grafico(m);
				} else {
					System.out.println("Digite novamente");
				}
				break;
			case 5:
				if (v[4] == 0) {
					v[4] = 1;
					m[1][1] = "X";
					i =1;
					grafico(m);
				} else {
					System.out.println("Digite novamente");
				}
				break;
			case 6:
				if (v[5] == 0) {
					v[5] = 1;
					m[1][2] = "X";
					i =1;
					grafico(m);
				} else {
					System.out.println("Digite novamente");
				}
				break;
			case 7:
				if (v[6] == 0) {
					v[6] = 1;
					m[2][0] = "X";
					i =1;
					grafico(m);
				} else {
					System.out.println("Digite novamente");
				}
				break;
			case 8:
				if (v[7] == 0) {
					v[7] = 1;
					m[2][1] = "X";
					i =1;
					grafico(m);
				} else {
					System.out.println("Digite novamente");
				}
				break;
			case 9:
				if (v[8] == 0) {
					v[8] = 1;
					m[2][2] = "X";
					i =1;
					grafico(m);
				} else {
					System.out.println("Digite novamente");
				}				
				break;
			}
		}
	}
	
	static void jogador2(int v[], String m[][]) {
		Scanner kib = new Scanner(System.in);
System.out.println("PLAYER 2");

		for (int i = 0; i <1;) {
			int N = kib.nextInt();
			switch (N) {
			case 1:
				if (v[0] == 0) {
					v[0] = 1;
					m[0][0] = "O";
					i =1;
					grafico(m);
				} else {
					System.out.println("Digite novamente");
				}
				break;
			case 2:
				if (v[1] == 0) {
					v[1] = 1;
					m[0][1] = "O";
					i =1;
					grafico(m);
				} else {
					System.out.println("Digite novamente");
				}
				break;
			case 3:
				if (v[2] == 0) {
					v[2] = 1;
					m[0][2] = "O";
					i =1;
					grafico(m);
				} else {
					System.out.println("Digite novamente");
				}
				break;
			case 4:
				if (v[3] == 0) {
					v[3] = 1;
					m[1][0] = "O";
					i =1;
					grafico(m);
				} else {
					System.out.println("Digite novamente");
				}
				break;
			case 5:
				if (v[4] == 0) {
					v[4] = 1;
					m[1][1] = "O";
					i =1;
					grafico(m);
				} else {
					System.out.println("Digite novamente");
				}
				break;
			case 6:
				if (v[5] == 0) {
					v[5] = 1;
					m[1][2] = "O";
					i =1;
					grafico(m);
				} else {
					System.out.println("Digite novamente");
				}
				break;
			case 7:
				if (v[6] == 0) {
					v[6] = 1;
					m[2][0] = "O";
					i =1;
					grafico(m);
				} else {
					System.out.println("Digite novamente");
				}
				break;
			case 8:
				if (v[7] == 0) {
					v[7] = 1;
					m[2][1] = "O";
					i =1;
					grafico(m);
				} else {
					System.out.println("Digite novamente");
				}
				break;
			case 9:
				if (v[8] == 0) {
					v[8] = 1;
					m[2][2] = "O";
					i =1;
					grafico(m);
				} else {
					System.out.println("Digite novamente");
				}				
				break;
			}
		}
	}
	
	static void turno(int []v, String[][]m) {

		for(int i =0; i<1;) {
		jogador1(v,m);
		i= verifica(m);
		if (i==1) {
			break;
		}
		jogador2(v,m);
		i =verifica(m);
		if(i==2) {
			break;
		}
	}
		
	}
	
	static int verifica(String [][]m) {
	 int  vencedor = 0;
            if (m[0][0] == "X" && m[1][1] == "X" && m[2][2] == "X") {
                vencedor = 1;
            } else if (m[0][0] == "X" && m[0][1] == "X" && m[0][2] == "X") {
                vencedor = 1;
            } else if (m[1][0] == "X" && m[1][1] == "X" && m[1][2] == "X") {
                vencedor = 1;
            } else if (m[2][0] == "X" && m[2][1] == "X" && m[2][2] == "X") {
                vencedor = 1;
            } else if (m[0][2] == "X" && m[1][1] == "X" && m[2][0] == "X") {
                vencedor = 1;
            } else if (m[0][0] == "X" && m[1][1] == "X" && m[2][2] == "X") {
                vencedor = 1;
            } else if (m[0][0] == "X" && m[1][0] == "X" && m[2][0] == "X") {
                vencedor = 1;
            } else if (m[0][1] == "X" && m[1][1] == "X" && m[2][1] == "X") {
                vencedor = 1;
            } else if (m[0][2] == "X" && m[1][2] == "X" && m[2][2] == "X") {
                vencedor = 1;
            }
            
            if (m[0][0] == "O" && m[1][1] == "O" && m[2][2] == "O") {
                vencedor = 2;
            } else if (m[0][0] == "O" && m[0][1] == "O" && m[0][2] == "O") {
                vencedor = 1;
            } else if (m[1][0] == "O" && m[1][1] == "O" && m[1][2] == "O") {
                vencedor = 2;
            } else if (m[2][0] == "O" && m[2][1] == "O" && m[2][2] == "O") {
                vencedor = 2;
            } else if (m[0][2] == "O" && m[1][1] == "O" && m[2][0] == "O") {
                vencedor = 2;
            } else if (m[0][0] == "O" && m[1][1] == "O" && m[2][2] == "O") {
                vencedor = 2;
            } else if (m[0][0] == "O" && m[1][0] == "O" && m[2][0] == "O") {
                vencedor = 2;
            } else if (m[0][1] == "O" && m[1][1] == "O" && m[2][1] == "O") {
                vencedor = 2;
            } else if (m[0][2] == "O" && m[1][2] == "O" && m[2][2] == "O") {
                vencedor = 2;
            }
			return vencedor;
        }
	

	public static void main(String[] args) {

		int vetor[] = criaVetor();
		String matriz[][] = criaMatriz();
		grafico(matriz);
		turno(vetor,matriz);
	}
}
