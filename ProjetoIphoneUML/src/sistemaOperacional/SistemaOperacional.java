package sistemaOperacional;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusica;

public class SistemaOperacional implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusica {
	

	public void selecionarMusica(String musica) {		
		System.out.println("MUSICA SELECIONADA: " + musica);
	}

	public void tocar() {
		System.out.println("TOCANDO MUSICA SELECIONADA...");		
	}
	
	public void pausar() {
		System.out.println("MUSICA PAUSADA");		
	}

	public void atualizarAba() {
		System.out.println("ATUALIZANDO ABA");
	}

	public void adicionarNovaAba() {
		System.out.println("NOVA ABA ADCIONADA");		
	}

	public void exibirPagina(String url) {
		System.out.println("ACESSANDO URL: " + url);
	}

	public void atender() {		
		System.out.println("LIGAÇÃO ATENDIDA COM SUCESSO!");		
		System.out.println("LIGAÇÃO ATENDIDA ENCERRADA!");
	}

	public void iniciarCorreioVoz() {		
		System.out.println("LIGAÇÃO RECUSADA! INICIANDO CORREIO DE VOZ...");
	}

	public void ligar(String numero) {
		System.out.println("LIGANDO PARA: " + numero);
		System.out.println("LIGAÇÃO CONCLUIDA COM SUCESSO!");
	}
	
	public void novaAba() {
		
	}

	public void atualizarPagina() {
		
	}
}
