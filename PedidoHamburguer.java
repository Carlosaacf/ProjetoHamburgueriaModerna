package Hamburgueria;

import java.util.Scanner;

public class PedidoHamburguer {

    public static void main(String args[]) {

        Hamburguer lanche1 = new Hamburguer();




        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao !=7) {

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

                    if (menu == 1) {

                        lanche1.TipoQueijo = "Prato";
                    }
                       else if (menu == 2) {

                            lanche1.TipoQueijo = "Provolone";
                        }
                       else if (menu == 3) {

                            lanche1.TipoQueijo = "Cheddar";
                        }
                        break;

                        case 5:
                            System.out.println("1 - Acrescentar verdura");
                            System.out.println("2 - Sem verdura");
                            menu = sc.nextInt();

                            if (menu == 1) {

                                lanche1.AcrescentaVerdura = "Com Verdura";
                            }
                      else if (menu == 2)
                      {

                                    lanche1.AcrescentaVerdura = "Sem Verdura";
                                }

                                break;

                                case 6:
                                    System.out.println("====== Pedido =====");
                                    System.out.println("Seu pedido foi um Hamburguer de: " + lanche1.getTipoHamburguer()s +
                                            " Pão " + lanche1.TipoPão);
                                    System.out.println("Com molho: " + lanche1.TipoMolho + "Com queijo : " + lanche1.TipoQueijo + " E o complemento foi " + lanche1.AcrescentaVerdura);
                                    System.out.println("_______________________");
                                    break;

                                default:

                                    System.out.println("Digite uma Opção Valida");
                            }
                    }
            }
        }