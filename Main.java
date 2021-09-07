
import java.util.Scanner;

/**
 * @author ARTHUR EHRAT
 *
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int codigo, quantidade;
		double totalG = 0;
		double total = 0;
		char add = 's';

		System.out.println("Bem vindo a nossa lanchonete!\n ");

		while (add != 'n') {
			System.out.println(
					"CODIGO     ITEM        PREÇO\n01   Cachorro Quente   R$ 4,00\n02     X-SALADA        R$ 4,50\n03     X-BACON         R$ 5,00\n04     TORRADA         R$ 2,00\n05     REFRIGERANTE    R$ 1,50\n");
			System.out.println("Digite o numero do item desejado:\n");
			codigo = sc.nextInt();
			System.out.println("Digite a quantidade:");
			quantidade = sc.nextInt();

			if (codigo == 1) {
				total = quantidade * 4.00;
			} else if (codigo == 2) {
				total = quantidade * 4.50;
			} else if (codigo == 3) {
				total = quantidade * 5.00;
			} else if (codigo == 4) {
				total = quantidade * 2.00;
			} else if (codigo == 5) {
				total = quantidade * 1.50;
			}
			totalG = total + totalG;
			System.out.printf("Total R$ %.2f%n", total);
			System.out.println("Deseja adicionar mais itens?(S/N)");
			add = sc.next().charAt(0);

		}
		System.out.printf("Total= R$" + totalG);
		sc.close();
	}

}
