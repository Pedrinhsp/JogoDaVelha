/* Author <Pedro Henrique Souza Pecanha>
 */
package projeeto_jogo_da_velha;
import java.util.Scanner;
import java.util.Random;

public class JogoDaVelha {
	
	static int p1 = 0, p2 = 0;
        static Scanner input = new Scanner(System.in);

        
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
	
	static int imprimeMenu() {
        System.out.println("|******************************************************|\n"
                         + "|          1) MODO JOGADOR VS JOGADOR                  |\n"
                         + "|          2) MODO JOGADOR VS CPU                      |\n"
                         + "|******************************************************|\n");
       
        int mododeJogo = input.nextInt();// depois recebera uma funcao 
        switch(mododeJogo) {
        case 1:
        	break;
        case 2:
        	break;
        }
        return mododeJogo;
    }

	static void grafico(String m[][]) {
		System.out.print("         |          |                                               |          |       "
				+ "\n    " + m[0][0] + "    |    " + m[0][1] + "     |     " + m[0][2]
				+ "                                     1   |     2    |    3     "
				+ "\n         |          |                                               |          |         "
				+ "\n---------+----------+----------                             --------+----------+---------"
				+ "\n         |          |                                               |          |         "
				+ "\n    " + m[1][0] + "    |    " + m[1][1] + "     |     " + m[1][2]
				+ "                                     4   |     5    |    6    "
				+ "\n         |          |                                               |          |         "
				+ "\n---------+----------+----------                             --------+----------+---------"
				+ "\n         |          |                                               |          |         "
				+ "\n    " + m[2][0] + "    |    " + m[2][1] + "     |     " + m[2][2]
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
        
        static void CPU (int v[], String m[][]) {
               Random play = new Random();              
System.out.println("PLAYER CPU");
		for (int i = 0; i <1;) {
                    
			int N = play.nextInt(10);
			switch (N) {
			case 1:
				if (v[0] == 0) {
					v[0] = 1;
					m[0][0] = "O";
					i =1;
					grafico(m);
				} else {
				}
				break;
			case 2:
				if (v[1] == 0) {
					v[1] = 1;
					m[0][1] = "O";
					i =1;
					grafico(m);
				} else {
				}
				break;
			case 3:
				if (v[2] == 0) {
					v[2] = 1;
					m[0][2] = "O";
					i =1;
					grafico(m);
				} else {
				}
				break;
			case 4:
				if (v[3] == 0) {
					v[3] = 1;
					m[1][0] = "O";
					i =1;
					grafico(m);
				} else {
				}
				break;
			case 5:
				if (v[4] == 0) {
					v[4] = 1;
					m[1][1] = "O";
					i =1;
					grafico(m);
				} else {
				}
				break;
			case 6:
				if (v[5] == 0) {
					v[5] = 1;
					m[1][2] = "O";
					i =1;
					grafico(m);
				} else {
				}
				break;
			case 7:
				if (v[6] == 0) {
					v[6] = 1;
					m[2][0] = "O";
					i =1;
					grafico(m);
				} else {
				}
				break;
			case 8:
				if (v[7] == 0) {
					v[7] = 1;
					m[2][1] = "O";
					i =1;
					grafico(m);
				} else {
				}
				break;
			case 9:
				if (v[8] == 0) {
					v[8] = 1;
					m[2][2] = "O";
					i =1;
					grafico(m);
				} else {
				}				
				break;
			}
		}
	}
	
	static void turno(int []v, String[][]m, int modo) {
		for(int r = 0; r<3;) {
		switch(modo) {
				
		case 1:
			int i = 0;
			 v = criaVetor();
			 m = criaMatriz();
				int	u = 0;
			for(int s =1; s<8;s++) {
			jogador1(v,m);
			u++;
			i = verifica(m);
			if (i==1) {
				break;
			}
			if(u==5) {
			break;	
			} 
			jogador2(v,m);
			i = verifica(m);
			if(i==2) {
				break;
			}
		}
		velha(i, modo);	
		if(p1==3) {
			r = 3;
			System.out.println("BOA CATIORO PLAYER 1!");
			break;
		}
		if(p2==3) {
			r = 3;
			System.out.println("BOA CATIORO PLAYER 2!");
			break;
		}
		
		
		 break;
				
		   case 2:
				 i = 0;
				 v = criaVetor();
				 m = criaMatriz();
				  u = 0;
				for(int o =1; o<8;o++) {
				jogador1(v,m);
				u++;
				i= verifica(m);
				if (i==1) {
					break;
				}
				if(u==5) {
				break;	
				} 
				CPU(v,m);
				i =verifica(m);
				if(i==2) {
					break;
				}
			}
			velha(i, modo);	
			if(p1==3) {
				r = 3;
				System.out.println("BOA CATIORO!");
				break;
			}
			if(p2==3) {
				r = 3;
				System.out.println("BOA CPU!");
				break;
			}

			
			 i = 0;
			   u = 0;
			 v = criaVetor();
			 m = criaMatriz();
			 grafico(m);
			 u=0;
			for(int y =1; y<8;y++) {
			CPU(v,m);
			u++;
			i= verifica(m);
			if (i==2) {
				break;
			}
			if(u==5) {
			break;	
			} 
			jogador1(v,m);
			i =verifica(m);
			if(i==1) {
				break;
			}
		}
			velha(i, modo);
			if(p1==3) {
				r = 3;
				System.out.println("BOA CATIORO!");
				break;
			}
			if(p2==3) {
				r = 3;
				System.out.println("BOA CPU!");
				break;
			}

			 break;
				 }
		}
	}
	
	static int verifica(String [][]m) {
	 int  winner = 0;
            if (m[0][0] == "X" && m[1][1] == "X" && m[2][2] == "X") {
                winner = 1;
            } else if (m[0][0] == "X" && m[0][1] == "X" && m[0][2] == "X") {
                winner = 1;
            } else if (m[1][0] == "X" && m[1][1] == "X" && m[1][2] == "X") {
                winner = 1;
            } else if (m[2][0] == "X" && m[2][1] == "X" && m[2][2] == "X") {
                winner = 1;
            } else if (m[0][2] == "X" && m[1][1] == "X" && m[2][0] == "X") {
                winner = 1;
            } else if (m[0][0] == "X" && m[1][1] == "X" && m[2][2] == "X") {
                winner = 1;
            } else if (m[0][0] == "X" && m[1][0] == "X" && m[2][0] == "X") {
                winner = 1;
            } else if (m[0][1] == "X" && m[1][1] == "X" && m[2][1] == "X") {
                winner = 1;
            } else if (m[0][2] == "X" && m[1][2] == "X" && m[2][2] == "X") {
                winner = 1;
            }
            
            if (m[0][0] == "O" && m[1][1] == "O" && m[2][2] == "O") {
                winner = 2;
            } else if (m[0][0] == "O" && m[0][1] == "O" && m[0][2] == "O") {
                winner = 2;
            } else if (m[1][0] == "O" && m[1][1] == "O" && m[1][2] == "O") {
                winner = 2;
            } else if (m[2][0] == "O" && m[2][1] == "O" && m[2][2] == "O") {
                winner = 2;
            } else if (m[0][2] == "O" && m[1][1] == "O" && m[2][0] == "O") {
                winner = 2;
            } else if (m[0][0] == "O" && m[1][1] == "O" && m[2][2] == "O") {
                winner = 2;
            } else if (m[0][0] == "O" && m[1][0] == "O" && m[2][0] == "O") {
                winner = 2;
            } else if (m[0][1] == "O" && m[1][1] == "O" && m[2][1] == "O") {
                winner = 2;
            } else if (m[0][2] == "O" && m[1][2] == "O" && m[2][2] == "O") {
                winner = 2;
            }
			return winner;
        }
	
	static void velha(int winner, int modo) {
switch(modo) {
case 1:
		if(winner==0) {
			System.out.println("VELHA!");
		}
		else if(winner==1) {
			p1 = p1+1;
			System.out.println("PLAYER 1 WINS!");
		}
		else if(winner==2) {
			p2 = p2+1;
			System.out.println("PLAYER 2 WINS!");
		}
		System.out.println("SCORE: "
				+ "\n P1: "+p1+"\n P2: "+p2);
		break;
case 2:
	if(winner==0) {
		System.out.println("VELHA!");
	}
	else if(winner==1) {
		p1 = p1+1;
		System.out.println("PLAYER 1 WINS!");
	}
	else if(winner==2) {
		p2 = p2+1;
		System.out.println("CPU WINS!");
	}
	System.out.println("SCORE: "
			+ "\n P1: "+p1+"\n CPU: "+p2);
      }
	}
	

	public static void main(String[] args) {
                int modo = imprimeMenu();
                int vetor[] = criaVetor();
        		String matriz[][] = criaMatriz();
        		grafico(matriz);
        		turno(vetor,matriz, modo);
                
	}
}
