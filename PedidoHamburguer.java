package Hamburgueria;

import java.util.Scanner;

public class PedidoHamburguer {

    public static void main(String args[]) {

        Hamburguer lanche1 = new Hamburguer();


        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 6) {

            System.out.println("(1) Escolha o Tipo de Hamburguer: ");
            System.out.println("(2) Escolha o Tipo de Pão: ");
            System.out.println("(3) Escolha o Tipo de Molho: ");
            System.out.println("(4) Escolher Queijo");
            System.out.println("(5) Acrescentar Verdura ?");
            System.out.println("(6) Imprimir Pedido");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:

                    int menu = 0;
                    System.out.println("1 - Carne");
                    System.out.println("2 - Frango");
                    System.out.println("3 - Soja");
                    menu = sc.nextInt();

                    if (menu == 1) {
                        lanche1.getTipoHamburguer();
                        lanche1.setTipoHamburguer("Carne");
                    } else if (menu == 2) {
                        lanche1.getTipoHamburguer();
                        lanche1.setTipoHamburguer("Frango");
                    } else if (menu == 3) {

                        lanche1.getTipoHamburguer();
                        lanche1.setTipoHamburguer("Soja");
                    }

                    break;

                case 2:

                    System.out.println("1 - Brioche");
                    System.out.println("2 - Centeio");
                    System.out.println("3 - Australiano");
                    menu = sc.nextInt();

                    if (menu == 1) {
                        lanche1.getTipoPão();
                        lanche1.setTipoPão("Brioche");
                    } else if (menu == 2) {
                        lanche1.getTipoPão();
                        lanche1.setTipoPão("Centeio");
                    } else if (menu == 3) {
                        lanche1.getTipoPão();
                        lanche1.setTipoPão("Australiano");
                    }

                    break;
                case 3:
                    System.out.println("1 - Barbecue");
                    System.out.println("2 - Maionese com Ervas");
                    System.out.println("3 - Mostarda e Mel");
                    menu = sc.nextInt();

                    if (menu == 1) {

                        lanche1.getTipoMolho();
                        lanche1.setTipoMolho("Barbecue");
                    } else if (menu == 3) {
                        lanche1.getTipoMolho();
                        lanche1.setTipoMolho("Maionese com Ervas");
                    } else if (menu == 3) {
                        lanche1.getTipoMolho();
                        lanche1.setTipoMolho("Mostarda e Mel");
                    }
                    break;

                case 4:
                    System.out.println("1 - Prato");
                    System.out.println("2 - Provolone");
                    System.out.println("3 - Cheddar");
                    menu = sc.nextInt();

                    if (menu == 1) {

                        lanche1.getTipoQueijo();
                        lanche1.setTipoQueijo("Prato");
                    } else if (menu == 2) {
                        lanche1.getTipoQueijo();
                        lanche1.setTipoQueijo("Provolone");
                    } else if (menu == 3) {
                        lanche1.getTipoQueijo();
                        lanche1.setTipoQueijo("Cheddar");
                    }
                    break;

                case 5:
                    System.out.println("1 - Com verdura");
                    System.out.println("2 - Sem verdura");
                    menu = sc.nextInt();

                    if (menu == 1) {
                        lanche1.getAcrescentaVerdura();
                        lanche1.setAcrescentaVerdura("Com Verdura");
                    } else if (menu == 2) {
                        lanche1.getAcrescentaVerdura();
                        lanche1.setAcrescentaVerdura("Sem Verdura");
                    }

                    break;

                case 6:
                    System.out.println("================= Pedido =================");
                    System.out.println("Seu Pedido foi um Hamburguer de " + lanche1.getTipoHamburguer() +
                            "\n" + "O Tipo de Pão escolhido foi " + lanche1.getTipoPão());
                    System.out.println("Acompanhado com molho " + lanche1.getTipoMolho() +"\n" + "O Queijo escolhido foi  : " + lanche1.getTipoQueijo() +
                            "\n" +"E o Complemento foi " + lanche1.getAcrescentaVerdura());
                    System.out.println("__________________________________________");
                    break;

                default:

                    System.out.println("Digite uma Opção Valida");
            }
        }
    }
}