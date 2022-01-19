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
		System.out.println("Entre com os dados da ordem de servi�o ");
		System.out.print("Quantos itens ser� inseridos na ordem de servi�o  : ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Dados do item #" + i);
			System.out.print("Nome do Produto : ");
			produto.setProduto(sc.next());
			System.out.print("Pre�o do Produto : ");
			produto.setPre�o(sc.nextDouble());
			System.out.print("Quantidade : ");
			produto.setQuantidade(sc.nextInt());
			list.add("\nProduto : " + produto.getProduto() + " Pre�o R$ : " + produto.getPre�o() + " Quantidade : " + produto.getQuantidade());

		}	
		System.out.println("");
		System.out.println("ORDEM DE SERVI�O : ");
		System.out.println("Momento da ordem de servi�o " + sdf1.format(LocalDateTime.now()));
		System.out.println("Status : PROCESSING");
		System.out.println(cliente.toString() + " Data de nascimento : (" + contractDate + ")");
		System.out.println("Itens da ordem de servi�o : ");
		System.out.println();
		System.out.println(list);

		sc.close();
	}
}
