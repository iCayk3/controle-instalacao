package br.com.solprovedor.controle_instalacao.principal;

import br.com.solprovedor.controle_instalacao.model.Instalacao;

import java.util.Scanner;

public class Principal {

    private Instalacao instalacao;
    private Scanner sc = new Scanner(System.in);


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
            sc.nextLine();
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Cadastrando instalacao");
                    instalacao.cadastrar();
                    break;
                case 2:
                    System.out.println("Consultando instalacao");
                    break;
                default:

            }
        }


    }
}
