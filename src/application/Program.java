package application;

import java.util.Scanner;

import services.BrasilInterestService;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantia:");
		double quantia = sc.nextDouble();
		System.out.print("Meses: ");
		int meses = sc.nextInt();
		
		BrasilInterestService is = new BrasilInterestService(2.0);
		double pagamento = is.pagamento(quantia, meses);
		
		System.out.println("Pagamento depois " + meses + " meses");
		System.out.println(String.format("%.2f", pagamento));
		
		sc.close();
	}
}
