import Ingredientes.*;
import PanBaguett.*;
import java.util.Scanner;

public class Prueba{

    public static void elegirIngredientes(Baguett baguett){
        Baguett baguett2 = baguett;
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


        do{
			System.out.println("Elige tu(s) ingrediente(s): \n"+
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

				while (true){
					try {
						String opcionUsuario = sc.nextLine();
						opcion = Integer.parseInt(opcionUsuario);
						break;
					}catch (NumberFormatException ex){
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

				switch(opcion){
					case 1:
						System.out.println("Descripcion Baguett:\n"+baguett.getDescripcion() + 
                        "\nCosto Total: $"+baguett.getCostoTotal());
                        System.out.println(baguett.getTicket());
						break;

					case 2:
                        baguett2 = new Pollo(baguett2);
						if(contadorPollo<baguett2.getRepeticionMaxIngrediente()){
                            baguett = new Pollo(baguett);
                            contadorPollo++;
                        }else{
                            System.out.println("Solo puedes tener como máximo triple Pollo");
                        }
						break;

					case 3:
						baguett2 = new Peperoni(baguett2);
						if(contadorPeperoni<baguett2.getRepeticionMaxIngrediente()){
                            baguett = new Peperoni(baguett);
                            contadorPeperoni++;
                        }else{
                            System.out.println("Solo puedes tener como máximo triple Peperoni");
                        }
						break;

					case 4:
						baguett2 = new Jamon(baguett2);
						if(contadorJamon<baguett2.getRepeticionMaxIngrediente()){
                            baguett = new Jamon(baguett);
                            contadorJamon++;
                        }else{
                            System.out.println("Solo puedes tener como máximo triple Jamon");
                        }
						break;

					case 5:
						baguett2 = new Lechuga(baguett2);
						if(contadorLechuga<baguett2.getRepeticionMaxIngrediente()){
                            baguett = new Lechuga(baguett);
                            contadorLechuga++;
                        }else{
                            System.out.println("Solo puedes tener como máximo triple Lechuga");
                        }
						break;
                    case 6:
						baguett2 = new Jitomate(baguett2);
						if(contadorJitomate<baguett2.getRepeticionMaxIngrediente()){
                            baguett = new Jitomate(baguett);
                            contadorJitomate++;
                        }else{
                            System.out.println("Solo puedes tener como máximo triple Jitomate");
                        }
						break;
                    case 7:
						baguett2 = new Cebolla(baguett2);
						if(contadorCebolla<baguett2.getRepeticionMaxIngrediente()){
                            baguett = new Cebolla(baguett);
                            contadorCebolla++;
                        }else{
                            System.out.println("Solo puedes tener como máximo triple Cebolla");
                        }
						break;
                    case 8:
						baguett2 = new Mostaza(baguett2);
						if(contadorMostaza<baguett2.getRepeticionMaxIngrediente()){
                            baguett = new Mostaza(baguett);
                            contadorMostaza++;
                        }else{
                            System.out.println("Solo puedes tener como máximo triple Mostaza");
                        }
						break;
                    case 9:
						baguett2 = new Catsup(baguett2);
						if(contadorCatsup<baguett2.getRepeticionMaxIngrediente()){
                            baguett = new Catsup(baguett);
                            contadorCatsup++;
                        }else{
                            System.out.println("Solo puedes tener como máximo triple Catsup");
                        }
						break;
                    case 10:
						baguett2 = new Mayonesa(baguett2);
						if(contadorMayonesa<baguett2.getRepeticionMaxIngrediente()){
                            baguett = new Mayonesa(baguett);
                            contadorMayonesa++;
                        }else{
                            System.out.println("Solo puedes tener como máximo triple Mayonesa");
                        }
						break;

					case 0:
						break;

					default:
						System.out.println("\nPor favor elige el inrediente que deseas agregar.");
						break;

				}

		}while(opcion != 0 && opcion != 1);
    }
    public static void main(String[] args){

        Baguett baguett;
        Scanner scn = new Scanner(System.in);
		int opcion;

        System.out.println("Bienvenidos al WaySub \n"
							+ "Elige el pan que deseas:\n" + 
							"1.- Pan Miel.\n" +
							"2.- Pan Integral.\n" + 
							"3.- Pan Italiano.\n" + 
							"0.- Terminar simulacion.\n");
        
        while (true){
					try {
						String opcionUsuario = scn.nextLine();
						opcion = Integer.parseInt(opcionUsuario);
						break;
					}catch (NumberFormatException ex){
						System.out.println("Por favor elige la opcion VALIDA "
							+ "Elige el pan que deseas:\n" + 
							"1.- Pan Miel.\n" +
							"2.- Pan Integral.\n" + 
							"3.- Pan Italiano.\n" + 
							"0.- Terminar simulacion.\n");
					}
				}
        switch(opcion){

            case 1: 
                baguett = new BaguettHoney();
                elegirIngredientes(baguett);
                break;
            case 2: 
                baguett = new BaguettIntegral();
                elegirIngredientes(baguett);
                break;

            case 3: 
                baguett = new BaguettItaliano();
                elegirIngredientes(baguett);
                break;

            case 0:
                break;

        }
    }
}