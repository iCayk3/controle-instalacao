package br.com.solprovedor.controle_instalacao.principal;

import br.com.solprovedor.controle_instalacao.model.Instalacao;
import br.com.solprovedor.controle_instalacao.repository.InstalacaoRepository;

import java.util.Scanner;

public class Principal {

    private Instalacao instalacao;
    private Scanner sc = new Scanner(System.in);
    private InstalacaoRepository repository;

    public Principal(){};

    public Principal(InstalacaoRepository repository){
        this.repository = repository;
    }


    public void exibeMenu(){
        var opcao = -1;
        while (opcao != 0){

            System.out.println("""
                MENU
                1 - cadastrar instalacao
                2 - consultar instalacao
                
                0 - sair
                """);

            System.out.println("Chose option: ");
            opcao = sc.nextInt();


            switch (opcao){
                case 1:
                    System.out.println("Cadastrando instalacao");
                    cadastrar();
                    break;
                case 2:
                    System.out.println("Consultando instalacao");
                    break;
                default:

            }
        }


    }

    private void cadastrar(){
        System.out.println("Codigo do cliente");
        var codigoCliente = sc.nextInt(); sc.nextLine();
        System.out.println("CTO do cliente");
        var cto = sc.nextInt(); sc.nextLine();
        System.out.println("porta do cliente");
        var portaCliente = sc.nextInt(); sc.nextLine();
        System.out.println("OLT");
        var olt = sc.nextLine();
        System.out.println("Equipe de instalação");
        var equipe = sc.nextLine();
        System.out.println("Tipo de servico");
        var servico = sc.nextLine();
        System.out.println("Codigo antigo");
        var codigoAntigo = sc.nextInt(); sc.nextLine();
        System.out.println("Localidade");
        var localidade = sc.nextLine();

        var instalacao = new Instalacao(codigoCliente, cto, portaCliente, olt, equipe, servico, codigoAntigo, localidade);
        repository.save(instalacao);
    }
}
