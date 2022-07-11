package Hamburgueria;

import java.util.Scanner;

public class PedidoHamburguer extends Hamburguer {

    public PedidoHamburguer(String tipoHamburguer, String tipoQueijo, String AcrescentaVerdura) {
        super(tipoHamburguer, tipoQueijo, AcrescentaVerdura);
    }

    public static void main(String args[]) {

        Hamburguer lanche1 = new Hamburguer();


        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        System.out.println("(1) Escolha o Tipo de Hamburguer: ");
        System.out.println("(2) Escolher Queijo");
        System.out.println("(3) Acrescentar Verdura");
        System.out.println("(4) Imprimir Pedidos");
        opcao = sc.nextInt();

        while (opcao != 5) {

            switch (opcao) {
                case 1:
                    System.out.println("1 - Carne");
                    System.out.println("2 - Frango");
                    System.out.println("3 - Soja");

                    switch (opcao){
                        case 1:

                            lanche1.TipoHamburguer = "Carne";
                            break;
                        case 2:

                            lanche1.TipoHamburguer = "Frango";
                            break;
                        case 3:

                            lanche1.TipoHamburguer = "Soja";
                            break;

                    }
                    break;

                case 2:
                    System.out.println("1 - Prato");
                    System.out.println("2 - Provolone");
                    System.out.println("3 - Cheddar");

                    switch (opcao) {
                        case 1:

                            lanche1.TipoQueijo = "Prato";
                            break;
                        case 2:

                            lanche1.TipoQueijo = "Provolone";
                            break;
                        case 3:

                            lanche1.TipoQueijo = "Cheddar";
                            break;
                    }
                    break;

                case 3:
                    System.out.println("1 - Acrescentar verdura");
                    System.out.println("2 - Sem verdura");
                    switch (opcao) {
                        case 1:

                            lanche1.AcrescentaVerdura = "Com Verdura";
                            break;
                        case 2:

                            lanche1.AcrescentaVerdura = "Sem Verdura";
                            break;
                    }
                    break;

                case 4:
                    System.out.println("====== Pedido =====");
                    System.out.println("Seu pedido foi um Hamburguer de : " + lanche1.TipoHamburguer);
                    System.out.println("Com queijo : " + lanche1.TipoQueijo + " E o complemento foi " + lanche1.AcrescentaVerdura);
                    break;

                default:

                    System.out.println("Obrigado, volte sempre!");
            }
        }
    }
}