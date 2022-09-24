
import java.util.Scanner;

import adapter.*;
import adapter.Pizzas.BonelessPizza;
import adapter.Pizzas.ExtraCheesePizza;
import adapter.Pizzas.HawaianPizza;
import adapter.Pizzas.MexicanPizza;
import adapter.Pizzas.PepperoniPizza;
import decorator.Ingredientes.*;
import decorator.PanBaguette.*;

public class Main {

    /**
     * Método para obtener un Ticket 
     * @param baguette - Producto que se compra.
     * @return String - Ticket.
     */
    public static String getTicket(Baguette baguette){
        
        // OBJETOS
        String[] ingredientes = baguette.getDescripcion().split(",");
        String description = "Descripción: ";
        String descriptionAux = "Descripción: ";

        for(String ingredient : ingredientes){
            
            description += ingredient + ", ";
            descriptionAux += ingredient + ", ";

            if (descriptionAux.length() >= 63){
                description += "\n        ";
                descriptionAux = "";
            }
        }

        String ticket = "\nTICKET:\n" + 
                        "\u250c----------------------------------------------------------------------------------\u2510".replace('-', '\u2500') + "\n" + 
                        "\u2502                   \"Baguettes WaySub y Pizzas de Don Cangrejo\"                    \u2502\n" +
                        "\u2502                         Hernandez Melo Valentin Benito                           \u2502\n" +
                        "\u2502                             RFC - HEMV740214565                                  \u2502\n" + 
                        "\u2502          Mercado, Medellín #20, Cuauhtémoc, 06760 Ciudad de México, CDMX         \u2502\n" + 
                        "\u2502                             TEL. 55-95-02-54-87                                  \u2502\n" + 
                        "\u2502                           hernandezmelo@gmail.com                                \u2502\n\u2502\n" +
                        "\u2502          " + description + 
                        "\n\n                             Costo Total: $ " + baguette.getCostoTotal() + "\n" + 
                        "\u2514----------------------------------------------------------------------------------\u2518".replace('-', '\u2500') + "\n" + 
                        "\nGRACIAS POR TU COMPRA\n";
        return ticket;
    }

    /**
     * Método para elegir los ingredientes del Baguette.
     * @param baguett - Baguette que contendrá los ingredientes.
     */
    public static void elegirIngredientes(Baguette baguett) {
        
        // OBJETOS
        Baguette baguetteConIngredientes = baguett;
        Scanner sc = new Scanner(System.in);
        int[] contadorIngredientes = new int[9];

        // VARIABLES
        int eleccion;

        do {
            System.out.print("\nElige tu(s) ingrediente(s):\n" +
                    "1.- Pagar.\n" +
                    "2.- Pollo. 🍗\n" +
                    "3.- Peperoni.\n" +
                    "4.- Jamon.\n" +
                    "5.- Lechuga.\n" +
                    "6.- Jitomate.\n" +
                    "7.- Cebolla.\n" +
                    "8.- Mostaza.\n" +
                    "9.- Catsup.\n" +
                    "10.- Mayonesa.\n" +
                    "0.- TERMINAR SIMULACIÓN.\n");

            while (true) {
                try {
                    System.out.print("Elección: ");
                    String opcionUsuario = sc.nextLine();
                    eleccion = Integer.parseInt(opcionUsuario);
                    if(!(0 <= eleccion & eleccion <= 10)){
                        throw new NumberFormatException();
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("\nPor favor elige la opcion VALIDA\n"
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
                            "0.- TERMINAR SIMULACIÓN.\n");
                }
            }

            switch (eleccion) {
                case 1:
                    System.out.println("\n" + getTicket(baguett));
                    break;

                case 2:
                    baguetteConIngredientes = new Pollo(baguetteConIngredientes);
                    if (contadorIngredientes[0] < baguetteConIngredientes.getRepeticionMaxIngrediente()) {
                        baguett = new Pollo(baguett);
                        contadorIngredientes[0] += 1;
                    } else {
                        System.out.println("\n AVISO: Solo puedes tener como máximo triple Pollo");
                    }
                    break;

                case 3:
                    baguetteConIngredientes = new Pepperoni(baguetteConIngredientes);
                    if (contadorIngredientes[1] < baguetteConIngredientes.getRepeticionMaxIngrediente()) {
                        baguett = new Pepperoni(baguett);
                        contadorIngredientes[1] += 1;
                    } else {
                        System.out.println("\n AVISO: Solo puedes tener como máximo triple Peperoni");
                    }
                    break;

                case 4:
                    baguetteConIngredientes = new Jamon(baguetteConIngredientes);
                    if (contadorIngredientes[2] < baguetteConIngredientes.getRepeticionMaxIngrediente()) {
                        baguett = new Jamon(baguett);
                        contadorIngredientes[2] += 1;
                    } else {
                        System.out.println("\n AVISO: Solo puedes tener como máximo triple Jamon");
                    }
                    break;

                case 5:
                    baguetteConIngredientes = new Lechuga(baguetteConIngredientes);
                    if (contadorIngredientes[3] < baguetteConIngredientes.getRepeticionMaxIngrediente()) {
                        baguett = new Lechuga(baguett);
                        contadorIngredientes[3] += 1;
                    } else {
                        System.out.println("\n AVISO: Solo puedes tener como máximo triple Lechuga");
                    }
                    break;
                case 6:
                    baguetteConIngredientes = new Jitomate(baguetteConIngredientes);
                    if (contadorIngredientes[4] < baguetteConIngredientes.getRepeticionMaxIngrediente()) {
                        baguett = new Jitomate(baguett);
                        contadorIngredientes[4] += 1;
                    } else {
                        System.out.println("\n AVISO: Solo puedes tener como máximo triple Jitomate");
                    }
                    break;
                case 7:
                    baguetteConIngredientes = new Cebolla(baguetteConIngredientes);
                    if (contadorIngredientes[5] < baguetteConIngredientes.getRepeticionMaxIngrediente()) {
                        baguett = new Cebolla(baguett);
                        contadorIngredientes[5] += 1;
                    } else {
                        System.out.println("\n AVISO: Solo puedes tener como máximo triple Cebolla");
                    }
                    break;
                case 8:
                    baguetteConIngredientes = new Mostaza(baguetteConIngredientes);
                    if (contadorIngredientes[6] < baguetteConIngredientes.getRepeticionMaxIngrediente()) {
                        baguett = new Mostaza(baguett);
                        contadorIngredientes[6] += 1;
                    } else {
                        System.out.println("\n AVISO: Solo puedes tener como máximo triple Mostaza");
                    }
                    break;
                case 9:
                    baguetteConIngredientes = new Catsup(baguetteConIngredientes);
                    if (contadorIngredientes[7] < baguetteConIngredientes.getRepeticionMaxIngrediente()) {
                        baguett = new Catsup(baguett);
                        contadorIngredientes[7] += 1;
                    } else {
                        System.out.println("\n AVISO: Solo puedes tener como máximo triple Catsup");
                    }
                    break;
                case 10:
                    baguetteConIngredientes = new Mayonesa(baguetteConIngredientes);
                    if (contadorIngredientes[8] < baguetteConIngredientes.getRepeticionMaxIngrediente()) {
                        baguett = new Mayonesa(baguett);
                        contadorIngredientes[8] += 1;
                    } else {
                        System.out.println("\n AVISO: Solo puedes tener como máximo triple Mayonesa");
                    }
                    break;

                case 0:
                    break;
            }

        } while (eleccion != 0 && eleccion != 1);
        sc.close();
    }

    /**
     * Método para generar un Baguette. 
     */
    private static void opcionBaguette(){

        // OBJETOS
        Baguette baguett;
        Scanner scn = new Scanner(System.in);

        // VARIABLES
        int eleccion;

        System.out.print("\nElige el pan que deseas:\n" +
                "1.- Pan Miel.\n" +
                "2.- Pan Integral.\n" +
                "3.- Pan Italiano.\n" +
                "0.- TERMINAR SIMULACIÓN.\n");

        while (true) {
            try {
                System.out.print("Elección: ");
                String opcionUsuario = scn.nextLine();
                eleccion = Integer.parseInt(opcionUsuario);
                if(!(0 <= eleccion & eleccion <= 3)){
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.print("\nPor favor elige la opcion VALIDA\n" +
                        "1.- Pan Miel.\n" +
                        "2.- Pan Integral.\n" +
                        "3.- Pan Italiano.\n" +
                        "0.- TERMINAR SIMULACIÓN.\n");
            }
        }

        switch (eleccion) {

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

    /**
     * Método para generar una Pizza.
     */
    private static void opcionPizza(){

        // OBJETOS
        Baguette pizza = null;
        Scanner scn = new Scanner(System.in);

        // VARIABLES
        int eleccion;

        System.out.print("\nElige la pizza que deseas:\n" +
                "1.- Elegir Boneless Pizza y pagar.\n" +
                "2.- Elegir Pizza Extra Queso y pagar.\n" +
                "3.- Elegir Pizza Hawaiana y pagar.\n" +
                "4.- Elegir Pizza Mexicana y pagar.\n" + 
                "5.- Elegir Pizza Pepperoni y pagar.\n" + 
                "0.- TERMINAR SIMULACIÓN.\n");

        while (true) {
            try {
                System.out.print("Elección: ");
                String opcionUsuario = scn.nextLine();
                eleccion = Integer.parseInt(opcionUsuario);
                if(!(0 <= eleccion & eleccion <= 5)){
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.print("\nPor favor elige la opcion VALIDA\n" +
                "1.- Elegir Boneless Pizza y pagar..\n" +
                "2.- Elegir Pizza Extra Queso y pagar..\n" +
                "3.- Elegir Pizza Hawaiana y pagar..\n" +
                "4.- Elegir Pizza Mexicana y pagar..\n" + 
                "5.- Elegir Pizza Pepperoni y pagar..\n" + 
                "0.- TERMINAR SIMULACIÓN.\n");
            }
        }

        switch (eleccion) {

            case 1:
                pizza = new PizzaAdapter(new BonelessPizza());
                break;
            case 2:
                pizza = new PizzaAdapter(new ExtraCheesePizza());
                break;
            case 3:
                pizza = new PizzaAdapter(new HawaianPizza());
                break;
            case 4: 
                pizza = new PizzaAdapter(new MexicanPizza());
            case 5: 
                pizza = new PizzaAdapter(new PepperoniPizza());
            case 0:
                break;
        }

        if(pizza != null){
            System.out.println(getTicket(pizza)); 
        }
        scn.close();
    }

    public static void main(String[] args) {

        // OBJETOS
        Scanner scn = new Scanner(System.in);

        // VARIABLES 
        int eleccion;

        System.out.print("\n🥖 Bienvenidos al Baguettes WaySub y Pizzas de Don Cangrejo 🍕\n" 
                        + "¿Qué desesas comer?:\n"
                        + "1.- Baguette.\n"
                        + "2.- Pizza.\n"
                        + "0.- Salir del Main Interactivo.\n");
        
        while(true){
            try{
                System.out.print("Elección: ");
                String opcionUsuario = scn.nextLine().strip();
                eleccion = Integer.parseInt(opcionUsuario);
                if(!(0 <= eleccion & eleccion <= 2)){
                    throw new NumberFormatException();
                }
                break;
            }
            catch(NumberFormatException e){
                System.out.print("\nPor favor elige la opción VALIDA.\n" 
                                      + "1.- Baguetter.\n"
                                      + "2.- Pizza.\n"
                                      + "0.- Salir del Main Interactivo.\n");
            }
        }

        switch (eleccion) {
            case 1: opcionBaguette();
                break;
            case 2: opcionPizza();
                break;
            case 0:
                break;
        }
        scn.close();
    }

}