package br.com.solprovedor.controle_instalacao.model;

import br.com.solprovedor.controle_instalacao.repository.InstalacaoRepository;
import br.com.solprovedor.controle_instalacao.service.InstalacaoService;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "instalacoes")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Instalacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer codigo;
    private Integer cto;
    private Integer porta;
    private String olt;
    private String tecnico;
    private LocalDate data = LocalDate.now();
    @Enumerated(EnumType.STRING)
    private Servico servico;
    private Integer codigoAntigo;
    private String localidade;
    @Transient
    private InstalacaoService service;


    public Instalacao(int codigoCliente, int cto, int portaCliente, String olt, String equipe, String servico, int codigoAntigo, String localidade) {
        this.codigo = codigoCliente;
        this.cto = cto;
        this.porta = portaCliente;
        this.olt = olt;
        this.tecnico = equipe;
        this.servico = Servico.fromString(servico);
        this.codigoAntigo = codigoAntigo;
        this.localidade = localidade;
    }

}
