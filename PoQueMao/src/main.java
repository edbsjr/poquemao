import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int doce, po1, po2, po3, aux, evolution=0;

		System.out.println("Digite quantos doces você tem: (0<=N<=1000)");
		doce = input.nextInt();
		
		System.out.println("Digite quantos pontos para o primeiro evoluir (1<=X<=1000):");
		po1 = input.nextInt();

		System.out.println("Digite quantos pontos para o segundo evoluir (1<=Y<=1000):");
		po2 = input.nextInt();

		System.out.println("Digite quantos pontos para o terceiro evoluir (1<=Z<=1000)");
		po3 = input.nextInt();
		
		if (doce > 1000)
		{	
			System.out.println("Número de doces invalido.");
		}
		else if (doce < 0) 
		{
			System.out.println("Número de doces invalido.");
		}
		else if (po1 > 1000 )
		{	
			System.out.println("Pontos para evolução invalido.");
		}
		else if (po1 <= 1) 
		{
			System.out.println("Pontos para evolução invalido.");
		}
		else if (po2 > 1000 )
		{	
			System.out.println("Pontos para evolução invalido.");
		}
		else if (po2 <= 1) 
		{
			System.out.println("Pontos para evolução invalido.");
		}
		else if (po3 > 1000 )
		{	
			System.out.println("Pontos para evolução invalido.");
		}
		else if (po3 <= 1) 
		{
			System.out.println("Pontos para evolução invalido.");
		}
		
		else 
		{
			//Colocando eles em ordem crescente
			if (po1 > po2)
			{
				aux = po1;
				po1 = po2;
				po2 = aux;
			}
			if (po2 > po3)
			{
				aux = po2;
				po2 = po3;
				po3 = aux;
			}
			if (po1 > po2)
			{
				aux = po1;
				po1 = po2;
				po2 = aux;
			}
			
			// Agora a evolução acontece
			if (doce>=po1+po2+po3)
			{
			evolution = 3;
			}
			else if (doce>=po2+po1)
			{
			evolution = 2;
			}
			else if (doce>=po1)
			{
			evolution = 1;
			}
	
			System.out.println ("Numero de evoluções:"+evolution);
		}
		
		
	}

}
