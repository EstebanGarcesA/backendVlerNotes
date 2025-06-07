import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------\nBienvenido al sistema de notas VLER\n------------------------\nInicio de sesión\n------------------------");

        int intentos = 0;
        while (intentos < 3) {
            System.out.println("Ingrese su usuario: ");
            String usuario = sc.nextLine();
            System.out.println("Ingrese su contraseña: ");
            String contrasena = sc.nextLine();

            if (usuario.equals("admin") && contrasena.equals("1234")) {

        System.out.println("Ingrese la cantidad de estudiantes");
        int cantidadEstudiantes = sc.nextInt();
        String[] estudiantes = new String[cantidadEstudiantes];

//        *******Momento uno******

        double[] notaMomentoUno = new double[cantidadEstudiantes];
        double[] notaFinalMomentoUno = new double[cantidadEstudiantes];
        double[] primeraNotaMomentoUno = new double[cantidadEstudiantes];
        double[] segundaNotaMomentoUno = new double[cantidadEstudiantes];
        double[] terceraNotaMomentoUno = new double[cantidadEstudiantes];

//         *******Momento dos******
        double[] notaMomentoDos = new double[cantidadEstudiantes];
        double[] notaFinalMomentoDos = new double[cantidadEstudiantes];
        double[] primeraNotaMomentoDos = new double[cantidadEstudiantes];
        double[] segundaNotaMomentoDos = new double[cantidadEstudiantes];
        double[] terceraNotaMomentoDos = new double[cantidadEstudiantes];

        //         *******Momento tres******

        double[] notaMomentoTres = new double[cantidadEstudiantes];
        double[] notaFinalMomentoTres = new double[cantidadEstudiantes];
        double[] primeraNotaMomentoTres = new double[cantidadEstudiantes];
        double[] segundaNotaMomentoTres = new double[cantidadEstudiantes];
        double[] terceraNotaMomentoTres = new double[cantidadEstudiantes];

        double[] notaFinal = new double[cantidadEstudiantes];
        int notas = 0;

//                                 ********Ingreso de notas********
                for (int i = 0; i < cantidadEstudiantes; i++) {
                    System.out.print("Ingrese el nombre del estudiante: ");
                    estudiantes[i] = sc.next();

                    System.out.println("******Momento 1******");
                    System.out.print("Ingrese la primera nota del momento 1: ");
                    primeraNotaMomentoUno[i] = sc.nextDouble();
                    System.out.print("Ingrese la segunda nota del momento 1: ");
                    segundaNotaMomentoUno[i] = sc.nextDouble();
                    System.out.print("Ingrese la tercera nota del momento 1: ");
                    terceraNotaMomentoUno[i] = sc.nextDouble();

                    System.out.println("******Momento 2******");
                    System.out.print("Ingrese la primera nota del momento 2: ");
                    primeraNotaMomentoDos[i] = sc.nextDouble();
                    System.out.print("Ingrese la segunda nota del momento 2: ");
                    segundaNotaMomentoDos[i] = sc.nextDouble();
                    System.out.print("Ingrese la tercera nota del momento 2: ");
                    terceraNotaMomentoDos[i] = sc.nextDouble();

                    System.out.println("******Momento 3******");
                    System.out.print("Ingrese la primera nota del momento 3: ");
                    primeraNotaMomentoTres[i] = sc.nextDouble();
                    System.out.print("Ingrese la segunda nota del momento 3: ");
                    segundaNotaMomentoTres[i] = sc.nextDouble();
                    System.out.print("Ingrese la tercera nota del momento 3: ");
                    terceraNotaMomentoTres[i] = sc.nextDouble();
                }
                int opcion = 0;
                while (opcion != 3) {
                    System.out.println("Menu de opciones: \n1. modificar nota de un estudiantes\n2. mostrar notas de estudiantes\n3. salir.");
                    opcion = sc.nextInt();

//                              ********Modificar notas********
                    switch (opcion) {
                        case 1:
                            System.out.print("Ingrese el numero del estudiante a modificar la nota: ");
                            int numeroEstudiante = sc.nextInt();
                            System.out.println("Ingrese el numero del momento en el cual se encuentra la nota que desea modificar\n1. Momento uno\n2. Momento dos\n3. Momento tres");
                            int momentos = sc.nextInt();


                            switch (momentos) {
                                case 1:
                                    System.out.println("Ingrese el numero de la nota a modificar\n1. Nota uno\n2. Nota dos\n3. Nota tres");
                                    notas = sc.nextInt();
                                    switch (notas) {
                                        case 1:
                                            System.out.print("Ingrese la nota uno del momento 1: ");
                                            primeraNotaMomentoUno[numeroEstudiante - 1] = sc.nextDouble();
                                            break;
                                        case 2:
                                            System.out.print("Ingrese la nota dos del momento 1: ");
                                            segundaNotaMomentoUno[numeroEstudiante - 1] = sc.nextDouble();
                                            break;
                                        case 3:
                                            System.out.print("Ingrese la nota tres del momento 1: ");
                                            terceraNotaMomentoUno[numeroEstudiante - 1] = sc.nextDouble();
                                            break;
                                        default:
                                            break;
                                    }
                                    break;
                                case 2:
                                    System.out.println("Ingrese el numero de la nota a modificar\n1. Nota uno\n2. Nota dos\n3. Nota tres");
                                    notas = sc.nextInt();
                                    switch (notas) {
                                        case 1:
                                            System.out.print("Ingrese la nota uno del momento 2: ");
                                            primeraNotaMomentoDos[numeroEstudiante - 1] = sc.nextDouble();
                                            break;
                                        case 2:
                                            System.out.print("Ingrese la nota dos del momento 2: ");
                                            segundaNotaMomentoDos[numeroEstudiante - 1] = sc.nextDouble();
                                            break;
                                        case 3:
                                            System.out.print("Ingrese la nota tres del momento 2: ");
                                            terceraNotaMomentoDos[numeroEstudiante - 1] = sc.nextDouble();
                                            break;
                                    }

                                case 3:
                                    System.out.println("Ingrese el numero de la nota a modificar\n1. Nota uno\n2. Nota dos\n3. Nota tres");
                                    notas = sc.nextInt();
                                    switch (notas) {
                                        case 1:
                                            System.out.print("Ingrese la nota uno del momento 3: ");
                                            primeraNotaMomentoTres[numeroEstudiante - 1] = sc.nextDouble();
                                            break;
                                        case 2:
                                            System.out.print("Ingrese la nota dos del momento 3: ");
                                            segundaNotaMomentoTres[numeroEstudiante - 1] = sc.nextDouble();
                                            break;
                                        case 3:
                                            System.out.print("Ingrese la nota tres del momento 3:");
                                            terceraNotaMomentoTres[numeroEstudiante - 1] = sc.nextDouble();
                                            break;
                                    }
                            }

//                            Ver estudiantes y las notas de estos

                        case 2:
                            System.out.println("Listado de estudiantes y sus notas");
                            for (int i = 0; i < cantidadEstudiantes; i++) {
                                notaFinalMomentoUno[i] = (primeraNotaMomentoUno[i] * 0.30) + (segundaNotaMomentoUno[i] * 0.35) + (terceraNotaMomentoUno[i] * 0.35);
                                notaFinalMomentoDos[i] = (primeraNotaMomentoDos[i] * 0.30) + (segundaNotaMomentoDos[i] * 0.35) + (terceraNotaMomentoDos[i] * 0.35);
                                notaFinalMomentoTres[i] = (primeraNotaMomentoTres[i] * 0.30) + (segundaNotaMomentoTres[i] * 0.35) + (terceraNotaMomentoTres[i] * 0.35);
                                System.out.println("El/La estudiante " + "#" + (i + 1) + " es " + estudiantes[i] + "\nSus notas son las siguientes:\n******Momento 1******\nNota #1: " + primeraNotaMomentoUno[i] + "\nNota #2: " + segundaNotaMomentoUno[i] + "\nNota #3: " + terceraNotaMomentoUno[i] + "\nNota final del momento 1: " + notaFinalMomentoUno[i] + "\n******Momento 2******\nNota #1: " + primeraNotaMomentoDos[i] + "\nNota #2: " + segundaNotaMomentoDos[i] + "\nNota #3: " + terceraNotaMomentoDos[i] + "\nNota final del momento 2: " + notaFinalMomentoDos[i] + "\n******Momento 3******\nNota #1: " + primeraNotaMomentoTres[i] + "\nNota #2: " + segundaNotaMomentoTres[i] + "\nNota #3: " + terceraNotaMomentoTres[i] + "\nNota final del momento 2: " + notaFinalMomentoTres[i]);
                            }
                            break;

//                            cerrar programa


                        case 3:
                            System.out.println("Cerrando sesión...");
                            System.out.println("Saliendo del programa...");
                            intentos = 3;
                            break;
                        default:
                            System.out.println("Opcion no  valida, por favor intente de nuevo.");
                            break;

                    }
                }


            } else {
                System.out.println("Usuario y/o contraseña incorrectos");
                intentos++;

                if (intentos >= 3) {
                    System.out.println("Ha alcanzado el numero de intentos. Contactar con el administrador.");
                }
            }
        }
    }
}



