package br.com.solprovedor.controle_instalacao.model;

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

    public void cadastrar() {

    }
}
