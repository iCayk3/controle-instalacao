package br.com.solprovedor.controle_instalacao.service;

import java.util.Scanner;

public class InstalacaoService {
    private static Scanner sc = new Scanner(System.in);
    public static void cadastrarInstalacao(){
        System.out.println("Codigo do cliente");
        var codigoCliente = sc.nextInt(); sc.nextLine();
        System.out.println("CTO do cliente");
        var cto = sc.nextInt(); sc.nextLine();

    }
}
