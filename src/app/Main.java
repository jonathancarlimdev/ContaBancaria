package app;

import entities.ContaTerminal;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Por favor, digite o número da agência: ");
        int agNum = scan.nextInt();
        scan.nextLine();

        System.out.print("Digite a sua agência: ");
        String ag = scan.nextLine();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scan.nextLine();

        System.out.print("Digite seu saldo: ");
        double saldo = scan.nextDouble();

        ContaTerminal c1 = new ContaTerminal(agNum, ag, nomeCliente, saldo);




    }
}
