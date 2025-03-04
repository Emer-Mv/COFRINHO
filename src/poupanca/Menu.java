package poupanca;

import java.util.Scanner;

public class Menu {

	private Scanner sc;
	private Cofrinho cofrinho;

	public Menu() {
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();

	}
	public void exibirMenuPrincipal() {

		System.out.println("COFRINHO: ");
		System.out.println("1-Add Moeda ");
		System.out.println("2-Remover Moeda ");
		System.out.println("3-Listar moeda ");
		System.out.println("4-Calcular valor total convertido para real ");
		System.out.println("0-Encerrar ");

		String opcaoSelecionada = sc.next(); 

		//System.out.println(opcaoSelecionada);

		switch (opcaoSelecionada) {

		case "0":
			System.out.println("Sistema finalizado!");
			break;
		case "1":
			exibirSubMenuAdicionarMoedas();
			exibirMenuPrincipal();
			break;
			
		case "2":
			exibirSubMenuRemoverMoedas();
			exibirMenuPrincipal();
			break;
			
		case "3":
			cofrinho.listagemMoedas();
			exibirMenuPrincipal();
			break;
			
		case "4":
			double valorTotalConvertido = cofrinho.totalConvertido();
			String  valorTotalConvertidoTexto = String.format("%.2f", valorTotalConvertido);
			System.out.println("O valor total convertido para real é? " + valorTotalConvertidoTexto);
			exibirMenuPrincipal();
			break;
			

		default:
			System.out.println("Opção inválida!");
			exibirMenuPrincipal();
			break;
		}

	}
	

	private void exibirSubMenuAdicionarMoedas() {
		System.out.println("Escolha moeda: ");
		System.out.println("1 - Real: ");
		System.out.println("2 - Dollar: ");
		System.out.println("3 - Euro: ");
		int tipoDeMoeda = sc.nextInt();

		System.out.println("Digite o valor: ");
		String valorMoedas = sc.next();
		valorMoedas = valorMoedas.replace(",", ".");

		double valorMoeda = Double.valueOf(valorMoedas);

		Moeda moeda = null;

		if(tipoDeMoeda == 1) {
			moeda = new Real(valorMoeda);


		}else if(tipoDeMoeda == 2) {
			moeda  = new Dollar(valorMoeda);


		}else if(tipoDeMoeda == 3) {
			moeda = new Euro(valorMoeda);

		}else {
			System.out.println("Cofrinho esta vazio!");
			exibirMenuPrincipal();
		}
		cofrinho.adicionar(moeda);
		System.out.println("Moeda adicinada!");
	}
	
	private void exibirSubMenuRemoverMoedas() {
		System.out.println("Escolha moeda: ");
		System.out.println("1 - Real: ");
		System.out.println("2 - Dollar: ");
		System.out.println("3 - Euro: ");
		int tipoDeMoeda = sc.nextInt();

		System.out.println("Digite o valor: ");
		String valorMoedas = sc.next();
		valorMoedas = valorMoedas.replace(",", ".");

		double valorMoeda = Double.valueOf(valorMoedas);

		Moeda moeda = null;

		if(tipoDeMoeda == 1) {
			moeda = new Real(valorMoeda);


		}else if(tipoDeMoeda == 2) {
			moeda  = new Dollar(valorMoeda);


		}else if(tipoDeMoeda == 3) {
			moeda = new Euro(valorMoeda);

		}else {
			System.out.println("Cofrinho esta vazio!");
			exibirMenuPrincipal();
		}
		cofrinho.remover(moeda);
	}

}