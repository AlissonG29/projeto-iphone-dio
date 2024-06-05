package sistemaOperacional;

import java.util.Scanner;

public class Iphone {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		SistemaOperacional iphone = new SistemaOperacional();
		
		System.out.println(":::::: Seja Bem vindo! ::::::"
				+"O que deseja fazer?"
				);
		
		System.out.println("1. TELEFONE "
				+ "2. MÚSICA "
				+ "3. INTERNET "
				+ "4. MENU"
				+ "0. ENCERRAR ");		
		System.out.print("POR FAVOR, DIGITE A OPÇÃO DESEJADA: ");
		int menu = sc.nextInt();
		System.out.println("--------------------------------------");
				
		do {		
			switch (menu) {
			
			case 1: {	
				System.out.println("::::::TELEFONE::::::"
						+ "1. LIGAR "
						+ "2. ATENDER "
						+ "3. INICIAR CORREIO DE VOZ "
						+ "4. VOLTAR MENU"
						);
						
				System.out.print("DIGITE A OPÇÃO ESCOLHIDA: ");
				int opcao = sc.nextInt();					
				
				if(opcao == 1) {
					System.out.print("DIGITE O NUMERO: ");
					String numero = sc.next();
					Thread.sleep(1000);							
					iphone.ligar(numero);
				}
				else if(opcao == 2) {
					iphone.atender();
				}
				else if(opcao == 3){
					iphone.iniciarCorreioVoz();
				}
				else if(opcao == 4){
					menu = 4;
				}
				else {
					System.out.println("OPÇÃO INVALIDA");							
				}							
				continue;			}
			
			case 2: {	
				System.out.println("::::::MÚSICA::::::"
						+ "1. SELECIONAR MUSICA "
						+ "2. TOCAR "
						+ "3. PAUSAR "
						+ "4. VOLTAR MENU"
						);
						
				System.out.print("DIGITE A OPÇÃO ESCOLHIDA: ");
				int opcao = sc.nextInt();					
				
				if(opcao == 1) {
					System.out.print("QUAL MÚSICA DESEJA OUVIR? ");
					sc.nextLine();
					String musica = sc.nextLine();
					Thread.sleep(1000);							
					iphone.selecionarMusica(musica);
				}
				else if(opcao == 2) {					
					iphone.tocar();					
				}
				else if(opcao == 3){
					iphone.pausar();
				}
				else if(opcao == 4){
					menu = 4;
				}
				else {
					System.out.println("OPÇÃO INVALIDA");							
				}							
				continue;
			}
			case 3: {	
				System.out.println("::::::NAVEGAR NA INTERNET::::::"
						+ "1. ACESSAR PAGINA WEB "
						+ "2. ATUALIZAR ABA "
						+ "3. NOVA ABA "
						+ "4. VOLTAR MENU"
						);
						
				System.out.print("DIGITE A OPÇÃO ESCOLHIDA: ");
				int opcao = sc.nextInt();					
				
				if(opcao == 1) {
					System.out.println("DIGITE O ENDEREÇO WEB QUE DESEJA: ");
					sc.nextLine();
					String url = sc.nextLine();
					Thread.sleep(1000);							
					iphone.exibirPagina(url);
				}
				else if(opcao == 2) {					
					iphone.atualizarAba();					
				}
				else if(opcao == 3){
					iphone.adicionarNovaAba();
				}
				else if(opcao == 4){
					menu = 4;
				}
				else {
					System.out.println("OPÇÃO INVALIDA");							
				}							
				continue;
			}			
			case 4: {
				System.out.println(":::::: MENU ::::::"
						+"O que deseja fazer?"
						);
				
				System.out.println("1. TELEFONE "
						+ "2. MÚSICA "
						+ "3. INTERNET "
						+ "4. MENU"
						+ "0. ENCERRAR ");		
				System.out.print("POR FAVOR, DIGITE A OPÇÃO DESEJADA: ");
				menu = sc.nextInt();
				System.out.println("---------------------------------");				
				break;
				}			
			}			
					
		}while(menu != 0);
		
		System.out.println("MENU ENCERRADO. OBRIGADO!"
				+ "");			
			
		sc.close();					
	}
}

