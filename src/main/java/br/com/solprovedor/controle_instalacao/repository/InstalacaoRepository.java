package br.com.solprovedor.controle_instalacao.repository;

import br.com.solprovedor.controle_instalacao.model.Instalacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstalacaoRepository extends JpaRepository<Instalacao, Long> {
}
