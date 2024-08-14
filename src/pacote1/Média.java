package pacote1;
import java.io.IOException;
import java.util.Scanner;

public class Média {
	public static void main(String args[]) throws IOException {
		mediaNota();
	}
	
	public static void mediaNota() throws IOException {
		System.out.println("====Insira a primeira nota do aluno====");
		
		Scanner s = new Scanner(System.in);
		
		int nota1 = s.nextInt();
		
		System.out.println("====Insira a segunda nota do aluno====");
		int nota2 = s.nextInt();
		
		System.out.println("====Insira a terceira nota do aluno====");
		int nota3 = s.nextInt();
		
		System.out.println("====Insira a quarta nota do aluno====");
		int nota4 = s.nextInt();
		
		int notas = nota1 + nota2 + nota3 + nota4;
		
		int mediaFinal = notas/4; 
		System.out.println("A nota final do aluno é:" + mediaFinal);
		
	}
}
