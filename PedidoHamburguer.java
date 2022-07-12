package Hamburgueria;

import java.util.Scanner;

public class PedidoHamburguer extends Hamburguer {

    public PedidoHamburguer(String tipoHamburguer, String tipoPão,
                            String tipoMolho, String tipoQueijo, String acrescentaVerdura) {
        super(tipoHamburguer, tipoPão, tipoMolho, tipoQueijo, acrescentaVerdura);
    }

    public static void main(String args[]) {

        Hamburguer lanche1 = new Hamburguer();


        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        System.out.println("(1) Escolha o Tipo de Hamburguer: ");
        System.out.println("(2) Escolha o Tipo de Pão: ");
        System.out.println("(3) Escolha o Tipo de Molho: ");
        System.out.println("(4) Escolher Queijo");
        System.out.println("(5) Acrescentar Verdura ?");
        System.out.println("(6) Imprimir Pedido");
        opcao = sc.nextInt();

        while (opcao != 7) {

            switch (opcao) {
                case 1:

                    int menu = 0;
                    System.out.println("1 - Carne");
                    System.out.println("2 - Frango");
                    System.out.println("3 - Soja");
                    menu = sc.nextInt();

                    if (menu == 1) {

                        lanche1.TipoHamburguer = "Carne";
                    } else if (menu == 2) {

                        lanche1.TipoHamburguer = "Frango";
                    } else if (menu == 3) {

                        lanche1.TipoHamburguer = "Soja";
                    }

                    break;

                case 2:

                    System.out.println("1 - Brioche");
                    System.out.println("2 - Centeio");
                    System.out.println("3 - Australiano");
                    menu = sc.nextInt();

                    if (menu == 1) {

                        lanche1.TipoPão = "Brioche";
                    } else if (menu == 2) {

                        lanche1.TipoPão = "Centeio";
                    } else if (menu == 3) {

                        lanche1.TipoPão = "Australiano";
                    }

                    break;
                case 3:
                    System.out.println("1 - Barbecue");
                    System.out.println("2 - Maionese com Ervas");
                    System.out.println("3 - Mostarda com Mel");
                    menu = sc.nextInt();

                    if (menu == 1) {

                        lanche1.TipoMolho = "Barbecue";
                    } else if (menu == 2) {

                        lanche1.TipoMolho = "Maionese com Ervas";
                    } else if (menu == 3) {

                        lanche1.TipoMolho = "Mostarda com Mel";
                    }

                    break;

                case 4:
                    System.out.println("1 - Prato");
                    System.out.println("2 - Provolone");
                    System.out.println("3 - Cheddar");
                    menu = sc.nextInt();

                    switch (menu) {
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

                case 5:
                    System.out.println("1 - Acrescentar verdura");
                    System.out.println("2 - Sem verdura");
                    menu = sc.nextInt();
                    switch (menu) {
                        case 1:

                            lanche1.AcrescentaVerdura = "Com Verdura";
                            break;
                        case 2:

                            lanche1.AcrescentaVerdura = "Sem Verdura";
                            break;
                    }
                    break;

                case 6:
                    System.out.println("====== Pedido =====");
                    System.out.println("Seu pedido foi um Hamburguer de: " + lanche1.TipoHamburguer +
                            " Pão " + lanche1.TipoPão);
                    System.out.println("Com molho: " + lanche1.TipoMolho + "Com queijo : " + lanche1.TipoQueijo + " E o complemento foi " + lanche1.AcrescentaVerdura);
                    break;

                default:

                    System.out.println("Obrigado, volte sempre!");
            }
        }
    }
}