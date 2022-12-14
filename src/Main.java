
import java.util.Scanner;

import decorator.Ingredientes.*;
import decorator.PanBaguette.*;

public class Main {

    public static void elegirIngredientes(Baguette baguett) {
        Baguette baguette2 = baguett;
        Scanner sc = new Scanner(System.in);
        int opcion;
        int contadorPollo = 0;
        int contadorPeperoni = 0;
        int contadorJamon = 0;
        int contadorLechuga = 0;
        int contadorJitomate = 0;
        int contadorCebolla = 0;
        int contadorMostaza = 0;
        int contadorCatsup = 0;
        int contadorMayonesa = 0;

        do {
            System.out.println("Elige tu(s) ingrediente(s): \n" +
                    "1.- Pagar.\n" +
                    "2.- Pollo.\n" +
                    "3.- Peperoni.\n" +
                    "4.- Jamon.\n" +
                    "5.- Lechuga.\n" +
                    "6.- Jitomate.\n" +
                    "7.- Cebolla.\n" +
                    "8.- Mostaza.\n" +
                    "9.- Catsup.\n" +
                    "10.- Mayonesa.\n" +
                    "0.- Terminar simulacion.\n");

            while (true) {
                try {
                    String opcionUsuario = sc.nextLine();
                    opcion = Integer.parseInt(opcionUsuario);
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("Por favor elige la opcion VALIDA "
                            + "1.- Pagar.\n" +
                            "2.- Pollo.\n" +
                            "3.- Peperoni.\n" +
                            "4.- Jamon.\n" +
                            "5.- Lechuga.\n" +
                            "6.- Jitomate.\n" +
                            "7.- Cebolla.\n" +
                            "8.- Mostaza.\n" +
                            "9.- Catsup.\n" +
                            "10.- Mayonesa.\n" +
                            "0.- Terminar simulacion.\n");
                }
            }

            switch (opcion) {
                case 1:
                    System.out.println("Descripcion Baguett:\n" + baguett.getDescripcion() +
                            "\nCosto Total: $" + baguett.getCostoTotal());
                    // System.out.println(baguett.getTicket());
                    break;

                case 2:
                    baguette2 = new Pollo(baguette2);
                    if (contadorPollo < baguette2.getRepeticionMaxIngrediente()) {
                        baguett = new Pollo(baguett);
                        contadorPollo++;
                    } else {
                        System.out.println("Solo puedes tener como m??ximo triple Pollo");
                    }
                    break;

                case 3:
                    baguette2 = new Pepperoni(baguette2);
                    if (contadorPeperoni < baguette2.getRepeticionMaxIngrediente()) {
                        baguett = new Pepperoni(baguett);
                        contadorPeperoni++;
                    } else {
                        System.out.println("Solo puedes tener como m??ximo triple Peperoni");
                    }
                    break;

                case 4:
                    baguette2 = new Jamon(baguette2);
                    if (contadorJamon < baguette2.getRepeticionMaxIngrediente()) {
                        baguett = new Jamon(baguett);
                        contadorJamon++;
                    } else {
                        System.out.println("Solo puedes tener como m??ximo triple Jamon");
                    }
                    break;

                case 5:
                    baguette2 = new Lechuga(baguette2);
                    if (contadorLechuga < baguette2.getRepeticionMaxIngrediente()) {
                        baguett = new Lechuga(baguett);
                        contadorLechuga++;
                    } else {
                        System.out.println("Solo puedes tener como m??ximo triple Lechuga");
                    }
                    break;
                case 6:
                    baguette2 = new Jitomate(baguette2);
                    if (contadorJitomate < baguette2.getRepeticionMaxIngrediente()) {
                        baguett = new Jitomate(baguett);
                        contadorJitomate++;
                    } else {
                        System.out.println("Solo puedes tener como m??ximo triple Jitomate");
                    }
                    break;
                case 7:
                    baguette2 = new Cebolla(baguette2);
                    if (contadorCebolla < baguette2.getRepeticionMaxIngrediente()) {
                        baguett = new Cebolla(baguett);
                        contadorCebolla++;
                    } else {
                        System.out.println("Solo puedes tener como m??ximo triple Cebolla");
                    }
                    break;
                case 8:
                    baguette2 = new Mostaza(baguette2);
                    if (contadorMostaza < baguette2.getRepeticionMaxIngrediente()) {
                        baguett = new Mostaza(baguett);
                        contadorMostaza++;
                    } else {
                        System.out.println("Solo puedes tener como m??ximo triple Mostaza");
                    }
                    break;
                case 9:
                    baguette2 = new Catsup(baguette2);
                    if (contadorCatsup < baguette2.getRepeticionMaxIngrediente()) {
                        baguett = new Catsup(baguett);
                        contadorCatsup++;
                    } else {
                        System.out.println("Solo puedes tener como m??ximo triple Catsup");
                    }
                    break;
                case 10:
                    baguette2 = new Mayonesa(baguette2);
                    if (contadorMayonesa < baguette2.getRepeticionMaxIngrediente()) {
                        baguett = new Mayonesa(baguett);
                        contadorMayonesa++;
                    } else {
                        System.out.println("Solo puedes tener como m??ximo triple Mayonesa");
                    }
                    break;

                case 0:
                    break;

                default:
                    System.out.println("\nPor favor elige el inrediente que deseas agregar.");
                    break;

            }

        } while (opcion != 0 && opcion != 1);
        sc.close();
    }

    public static void main(String[] args) {

        Baguette baguett;
        Scanner scn = new Scanner(System.in);
        int opcion;

        System.out.println("Bienvenidos al WaySub \n"
                + "Elige el pan que deseas:\n" +
                "1.- Pan Miel.\n" +
                "2.- Pan Integral.\n" +
                "3.- Pan Italiano.\n" +
                "0.- Terminar simulacion.\n");

        while (true) {
            try {
                String opcionUsuario = scn.nextLine();
                opcion = Integer.parseInt(opcionUsuario);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Por favor elige la opcion VALIDA "
                        + "Elige el pan que deseas:\n" +
                        "1.- Pan Miel.\n" +
                        "2.- Pan Integral.\n" +
                        "3.- Pan Italiano.\n" +
                        "0.- Terminar simulacion.\n");
            }
        }
        switch (opcion) {

            case 1:
                baguett = new BaguetteHoney();
                elegirIngredientes(baguett);
                break;
            case 2:
                baguett = new BaguetteIntegral();
                elegirIngredientes(baguett);
                break;

            case 3:
                baguett = new BaguetteItaliano();
                elegirIngredientes(baguett);
                break;

            case 0:
                break;

        }
        scn.close();
    }

}