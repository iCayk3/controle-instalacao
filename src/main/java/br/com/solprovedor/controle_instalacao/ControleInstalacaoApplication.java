package br.com.solprovedor.controle_instalacao;

import br.com.solprovedor.controle_instalacao.principal.Principal;
import br.com.solprovedor.controle_instalacao.repository.InstalacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ControleInstalacaoApplication implements CommandLineRunner {
	@Autowired
	InstalacaoRepository instalacaoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ControleInstalacaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(instalacaoRepository);
		principal.exibeMenu();
	}
}
