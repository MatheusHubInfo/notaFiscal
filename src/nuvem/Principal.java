package nuvem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Cliente;
import entites.Produto;

public class Principal {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		Produto produto = new Produto();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		DateTimeFormatter sdf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		List <String> list = new ArrayList<>();

		System.out.println("Entre com os dados : ");
		System.out.print("Name : ");
		cliente.setName(sc.nextLine());
		System.out.print("Email : ");
		cliente.setEmail(sc.nextLine());
		System.out.print("Data de nascimento (DD/MM/YYYY) : ");
		Date contractDate = sdf.parse(sc.next());
		System.out.println("Status : PROCESSING");
		System.out.println("Entre com os dados da ordem de serviço ");
		System.out.print("Quantos itens será inseridos na ordem de serviço  : ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Dados do item #" + i);
			System.out.print("Nome do Produto : ");
			produto.setProduto(sc.next());
			System.out.print("Preço do Produto : ");
			produto.setPreço(sc.nextDouble());
			System.out.print("Quantidade : ");
			produto.setQuantidade(sc.nextInt());
			list.add("\nProduto : " + produto.getProduto() + " Preço R$ : " + produto.getPreço() + " Quantidade : " + produto.getQuantidade());

		}	
		System.out.println("");
		System.out.println("ORDEM DE SERVIÇO : ");
		System.out.println("Momento da ordem de serviço " + sdf1.format(LocalDateTime.now()));
		System.out.println("Status : PROCESSING");
		System.out.println(cliente.toString() + " Data de nascimento : (" + contractDate + ")");
		System.out.println("Itens da ordem de serviço : ");
		System.out.println();
		System.out.println(list);

		sc.close();
	}
}
