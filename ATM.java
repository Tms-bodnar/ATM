/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Scanner;

/**
 *
 * @author bodnart
 */
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int penz = 0;

        System.out.print("Mennyi pénz szeretnél felvenni? ");
        penz = sc.nextInt();
        if (0 < penz && penz <= 250000) {

            int tizezres = penz / 10000;
            int tizezresMaradek = penz % 10000;
            if (tizezres > 0) {
                System.out.print("Kapsz " + tizezres + " darab tízezrest, ");
                penz = penz - tizezres * 10000;
            }
            if (tizezresMaradek > 0) {
                int otezres = penz / 5000;
                int otezresMaradek = penz % 5000;

                if (otezres > 0) {
                    System.out.print(otezres + " darab ötezrest, ");
                    penz = penz - otezres * 5000;
                }
                if (otezresMaradek > 0) {
                    int ezres = penz / 1000;
                    int ezresMaradek = penz % 1000;

                    if (ezres > 0) {
                        System.out.print(+ezres + " darab ezrest, ");
                        penz = penz - ezres * 1000;

                    }
                    if (ezresMaradek > 0) {
                        int otszazas = penz / 500;
                        int otszazasMaradek = penz % 500;

                        if (otszazas > 0) {
                            System.out.print(+otszazas + "darab ötszázast, ");
                            penz = penz - otszazas * 500;
                        }
                        if (otszazasMaradek > 0) {
                            int ketszazas = penz / 200;
                            int ketszazasMaradek = penz % 200;

                            if (ketszazas > 0) {
                                System.out.print(ketszazas + " kétszázast, ");
                                penz = penz - ketszazas * 200;

                            }
                            if (ketszazasMaradek > 0) {
                                int szazas = penz / 100;
                                int szazasMaradek = penz % 100;

                                if (szazas > 0) {
                                    System.out.print(szazas + " százast, ");
                                    penz = penz - szazas * 100;

                                }
                                if (szazasMaradek > 0) {
                                    int otvenes = penz / 50;
                                    int otvenesMaradek = penz % 50;

                                    if (otvenes > 0) {
                                        System.out.print(otvenes + " ötvenest, ");
                                        penz = penz - otvenes * 50;

                                    }
                                    if (otvenesMaradek > 0) {
                                        int huszas = penz / 20;
                                        int huszasMaradek = penz % 20;

                                        if (huszas > 0) {
                                            System.out.print(huszas + " huszast, ");
                                            penz = penz - huszas * 20;

                                        }
                                        if (huszasMaradek > 0) {
                                            int tizes = penz / 10;
                                            int tizesMaradek = penz % 10;

                                            if (tizes > 0) {
                                                System.out.print(tizes + " tizest, ");
                                                penz = penz - tizes * 10;

                                            }
                                            if (tizesMaradek > 0) {
                                                int otos = penz / 5;
                                                int otosMaradek = penz % 5;

                                                if (otos > 0) {
                                                    System.out.print(otos + " ötforintost, ");
                                                    penz = penz - otos * 5;

                                                }
                                                if (otosMaradek > 0) {
                                                    int kettes = penz / 2;
                                                    int kettesMaradek = penz % 2;

                                                    if (kettes > 0) {
                                                        System.out.print(kettes + " kétforintost ");
                                                        penz = penz - kettes * 2;

                                                    }
                                                    if (kettesMaradek > 0) {
                                                        int egyes = penz / 1;
                                                        System.out.print(egyes + " egyforintost ");
                                                    }
                                                }

                                            }
                                        }

                                    }

                                }

                            }
                        }
                    }
                }
            }
            System.out.print("kapsz.");
        } else {
            System.out.println("A minimum összeg 0, a maximum 250000!");
        }

    }

}
