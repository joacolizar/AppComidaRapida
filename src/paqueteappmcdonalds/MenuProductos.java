package paqueteappmcdonalds;

public class MenuProductos {



    public void menuProductos(Carrito carrito) {
        int opcionProductos;

        do {
            System.out.println("--- PRODUCTOS ---");
            System.out.println(" 1.McCombos");
            System.out.println(" 2.Hamburguesas");
            System.out.println(" 3.Para acompañar");
            System.out.println(" 4.Bebidas");
            System.out.println(" 5.Postre");
            System.out.println(" 6.Volver atras");
            opcionProductos = Teclado.leerEntero("");
            switch (opcionProductos) {
                case 1 -> {
                    menuMcCombos(carrito);
                }
                case 2 -> {
                    menuHamburguesas(carrito);

                }
                case 3 -> {
                    menuParaAcompañar(carrito);

                }
                case 4 -> {
                    menuBebidas(carrito);

                }
                case 5 -> {
                    menuPostre(carrito);

                }
                case 6 -> {
                    System.out.println("Volviendo atras...");

                }
            }
        } while (opcionProductos != 6);
    }

    public void menuMcCombos(Carrito carrito) {
        int opcionCombos = 0;

        do {

            System.out.println("--- MCCOMBOS ---");
            System.out.println(" 1.BicMc mediano                                 $11.700,00");
            System.out.println(" 2.McCombo Grande Tasty Feat Cuarto Doble        $17.600,00");
            System.out.println(" 3.McCombo Mediano Tasty Feat Cuarto Simple      $13.900,00");
            System.out.println(" 4.Grand Doble Tasty Grande                      $17.800,00");
            System.out.println(" 5.McCombo Mediano Tasty Feat Cuarto Simple      $13.900,00");
            System.out.println(" 6.McNuggets X20 Grande                          $16.600,00");
            System.out.println(" 7.Grand Triple Tasty Turbo Bacon Grande         $21.200,00");
            System.out.println(" 8.Grand Triple Tasty Grande                     $19.800,00");
            System.out.println(" 9.Volver atras");
            opcionCombos = Teclado.leerEntero("");
            if (opcionCombos < 1 || opcionCombos > 9) {
                System.out.println("Opcion incorrecta, vuelva a intentarlo");
                continue;
            }

            switch (opcionCombos) {
                //LOGICA DE LA OPCIOIN BIC MC MEDIANO DE LA OPCION MCCOMBOS
                case 1 -> {
                    System.out.println("BIC MC MEDIANO");
                    System.out.println("$11.700,00");
                    System.out.println("Hamburguesa con doble carne 100% vacuna, salsa Big Mac, queso derretido, cebolla, lechuga y pepino. "
                            + "Acompañamiento y bebida mediana");
                    System.out.println("");
                    int opcionA = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionA = Teclado.leerEntero("");
                        if (opcionA == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("BicMc mediano", 11700, cantidad);
                            break;
                        } else if (opcionA == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionA != 2); //FINALIZA LA OPCION BIC MC MEDIANO

                }

                //LOGICA DE LA OPCIOIN MCCOMBO GRANDE TASTY FEAT CUARTO DOBLE
                case 2 -> {
                    System.out.println("MCCOMBO GRANDE TASTY FEAT CUARTO DOBLE");
                    System.out.println("$17.600,00");
                    System.out.println("Doble hamburguesa de carne 100% vacuna, salsa Tasty, kétchup, mostaza, cebolla y tres fetas de cheddar."
                            + "Acompañamiento y bebida grande");
                    System.out.println("");
                    int opcionB = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionB = Teclado.leerEntero("");
                        if (opcionB == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("McCombo Grande Tasty Feat Cuarto Doble", 17600, cantidad);
                            break;
                        } else if (opcionB == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionB != 2); //FINALIZA LA OPCION MCCOMBO GRANDE TASTY FEAT CUARTO DOBLE                   
                }

                //LOGICA DE LA OPCIOIN MCCOMBO MEDIANO TASTY FEAT CUARTO SIMPLE
                case 3 -> {
                    System.out.println("MCCOMBO MEDIANO TASTY FEAT CUARTO SIMPLE");
                    System.out.println("$13.900,00");
                    System.out.println("Doble hamburguesa de carne 100% vacuna, salsa Tasty, kétchup, mostaza, cebolla y tres fetas de cheddar."
                            + "Acompañamiento y bebida mediana");
                    System.out.println("");
                    int opcionC = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionC = Teclado.leerEntero("");
                        if (opcionC == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("McCombo Mediano Tasty Feat Cuarto simple", 13900, cantidad);
                            break;
                        } else if (opcionC == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionC != 2); //FINALIZA LA OPCION MCCOMBO MEDIANO TASTY FEAT CUARTO SIMPLE  

                }
                //LOGICA DE LA OPCIOIN GRAND DOBLE TASTY GRANDE
                case 4 -> {
                    System.out.println("GRAND DOBLE TASTY GRANDE");
                    System.out.println("$17.800,00");
                    System.out.println("Hamburguesa con doble carne 100% vacuna, salsa tasty, 3 fetas de queso cheddar, lechuga, tomate, cebolla "
                            + "en un pan con semillas de sésamo. Acompañamiento y bebida grande");
                    System.out.println("");
                    int opcionD = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionD = Teclado.leerEntero("");
                        if (opcionD == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Grand Doble Tasty Grande", 17800, cantidad);
                            break;
                        } else if (opcionD == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionD != 2); //FINALIZA LA OPCION GRAND DOBLE TASTY GRANDE  
                }
                //LOGICA DE LA OPCIOIN MCCOMBO MEDIANO TASTY FEAT CUARTO SIMPLE
                case 5 -> {
                    System.out.println("MCCOMBO MEDIANO TASTY FEAT CUARTO SIMPLE");
                    System.out.println("$13.900,00");
                    System.out.println("Hamburguesa de carne 100% vacuna, salsa Tasty, kétchup, mostaza, cebolla y dos fetas de cheddar. "
                            + ".Acompañamiento y bebida mediana");
                    System.out.println("");
                    int opcionE = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionE = Teclado.leerEntero("");
                        if (opcionE == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("McCombo Mediano Tasty Feat Cuarto Simple", 13900, cantidad);
                            break;
                        } else if (opcionE == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionE != 2); //FINALIZA LA OPCION MCCOMBO MEDIANO TASTY FEAT CUARTO SIMPLE  

                }
                //LOGICA DE LA OPCIOIN MCNUGGETS X20 GRANDE
                case 6 -> {
                    System.out.println("MCNUGGETS X20 GRANDE");
                    System.out.println("$16.600,00");
                    System.out.println("20 McNuggets de pollo. Acompañamiento y bebida grande");
                    System.out.println("");
                    int opcionF = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionF = Teclado.leerEntero("");
                        if (opcionF == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("McNuggets X20 Grande", 16600, cantidad);
                            break;
                        } else if (opcionF == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionF != 2); //FINALIZA LA OPCION MCNUGGETS X20 GRANDE  

                }
                //LOGICA DE LA OPCIOIN GRAND TRIPLE TASTY TURBO BACON GRANDE
                case 7 -> {
                    System.out.println("GRAND TRIPLE TASTY TURBO BACON GRANDE");
                    System.out.println("$21.200,00");
                    System.out.println("Hamburguesa con triple carne 100% vacuna, bacon en tiras y triturado, salsa tasty, 4 fetas de queso cheddar,"
                            + "lechuga, tomate y cebolla en un pan mas grande. Acompañamiento y bebida grande");
                    System.out.println("");
                    int opcionG = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionG = Teclado.leerEntero("");
                        if (opcionG == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Grand Triple Tasty Turbo Bacon Grande", 21200, cantidad);
                            break;
                        } else if (opcionG == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionG != 2); //FINALIZA LA OPCION GRAND TRIPLE TASTY TURBO BACON GRANDE 

                }
                //LOGICA DE LA OPCIOIN GRAND TRIPLE TASTY GRANDE
                case 8 -> {
                    System.out.println("GRAND TRIPLE TASTY GRANDE");
                    System.out.println("$19.800,00");
                    System.out.println("Hamburguesa con triple carne 100% vacuna, salsa tasty, 3 fetas de queso cheddar, lechuga, tomate, cebolla"
                            + " en un pan mas grande. Acompañamiento y bebida grande a elección");
                    System.out.println("");
                    int opcionH = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionH = Teclado.leerEntero("");
                        if (opcionH == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Grand Triple Tasty Grande", 19800, cantidad);
                            break;
                        } else if (opcionH == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionH != 2); //FINALIZA LA OPCION GRAND TRIPLE TASTY GRANDE

                }
                case 9 -> {
                    System.out.println("Volviendo atras...");

                }
            }
        } while (opcionCombos != 9);

    }

    public void menuHamburguesas(Carrito carrito) {
        int opcionHamburguesas = 0;
        do {
            System.out.println("--- HAMBURGUESAS ---");
            System.out.println(" 1.Hamburguesa con queso                $4.500,00");
            System.out.println(" 2.Bic Mc                               $7.100,00");
            System.out.println(" 3.Doble Cuarto De Libra Con Queso      $10.200,00");
            System.out.println(" 4.Grand Tasty Turbo Bacon Triple       $13.400,00");
            System.out.println(" 5.Grand Tasty Doble                    $11.000,00");
            System.out.println(" 6.Volver atras");
            opcionHamburguesas = Teclado.leerEntero("");
            if (opcionHamburguesas < 1 || opcionHamburguesas > 6) {
                System.out.println("Opcion incorrecta, vuelva a intentarlo");
                continue;
            }
            switch (opcionHamburguesas) {
                //LOGICA DE LA OPCIOIN HAMBURGUESA CON QUESO
                case 1 -> {
                    System.out.println("HAMBURGUESA CON QUESO");
                    System.out.println("$4.500,00");
                    System.out.println("Hamburguesa de carne 100% vacuna con queso Cheddar, cebolla, mostaza y ketchup");
                    System.out.println("");
                    int opcionAa = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionAa = Teclado.leerEntero("");
                        if (opcionAa == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Hamburguesa con queso", 4500, cantidad);
                            break;
                        } else if (opcionAa == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionAa != 2); //FINALIZA LA OPCION HAMBURGUESA CON QUESO

                }
                //LOGICA DE LA OPCIOIN BIC MC
                case 2 -> {
                    System.out.println("BIC MC");
                    System.out.println("$7.100,00");
                    System.out.println("Hamburguesa 100% carne con salsa especial Bigmac, cebolla, lechuga pepinillo y queso");
                    System.out.println("");
                    int opcionBb = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionBb = Teclado.leerEntero("");
                        if (opcionBb == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Bic Mc", 7100, cantidad);
                            break;
                        } else if (opcionBb == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionBb != 2); //FINALIZA LA OPCION BIC MC

                }
                //LOGICA DE LA OPCIOIN DOBLE CUARTO DE LIBRA CON QUESO
                case 3 -> {
                    System.out.println("DOBLE CUARTO DE LIBRA CON QUESO");
                    System.out.println("$10.200,00");
                    System.out.println("Hamburguesa con doble carne 100% vacuna, dos fetas de queso Cheddar, kétchup, mostaza y cebolla "
                            + "fresca");
                    System.out.println("");
                    int opcionCc = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionCc = Teclado.leerEntero("");
                        if (opcionCc == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Doble Cuarto De Libra Con Queso", 10200, cantidad);
                            break;
                        } else if (opcionCc == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionCc != 2); //FINALIZA LA OPCION DOBLE CUARTO DE LIBRA CON QUESO

                }
                //LOGICA DE LA OPCIOIN GRAND TASTY TURBO BACON TRIPLE
                case 4 -> {
                    System.out.println("GRAND TASTY TURBO BACON TRIPLE");
                    System.out.println("$13.400,00");
                    System.out.println("Hamburguesa con pan mas grande, con triple carne 100% vacuna, bacon en tiras y triturado, salsa tasty, 4 "
                            + "fetas de cheddar, lechuga, tomate y cebolla");
                    System.out.println("");
                    int opcionDd = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionDd = Teclado.leerEntero("");
                        if (opcionDd == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Grand Tasty Turbo Bacon Triple", 13400, cantidad);
                            break;
                        } else if (opcionDd == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionDd != 2); //FINALIZA LA OPCION GRAND TASTY TURBO BACON TRIPLE

                }
                //LOGICA DE LA OPCIOIN GRAND TASTY DOBLE
                case 5 -> {
                    System.out.println("GRAND TASTY DOBLE");
                    System.out.println("$11.000,00");
                    System.out.println("Hamburguesa con doble carne 100% vacuna, salsa Tasty, queso cheddar,lechuga, tomate, cebolla en un pan "
                            + "más grande con semillas");
                    System.out.println("");
                    int opcionEe = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionEe = Teclado.leerEntero("");
                        if (opcionEe == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Grand Tasty Doble", 11000, cantidad);
                            break;
                        } else if (opcionEe == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionEe != 2); //FINALIZA LA OPCION GRAND TASTY DOBLE

                }
                case 6 -> {
                    System.out.println("Volviendo atras...");

                }

            }

        } while (opcionHamburguesas != 6);
    }

    public void menuParaAcompañar(Carrito carrito) {
        int opcionAcompañar = 0;
        do {
            System.out.println("--- PARA ACOMPAÑAR ---");
            System.out.println(" 1.Papas Fritas Pequeñas          $3.400,00");
            System.out.println(" 2.Papas Fritas Medianas          $3.600,00");
            System.out.println(" 3.Papas Fritas Grandes           $3.800,00");
            System.out.println(" 4.Pileta De Cheddar              $2.900,00");
            System.out.println(" 5.Papas Con Cheddar y Bacon      $4.900,00");
            System.out.println(" 6.Side Salad                     $2.800,00");
            System.out.println(" 7.Volver atras");
            opcionAcompañar = Teclado.leerEntero("");
            if (opcionAcompañar < 1 || opcionAcompañar > 7) {
                System.out.println("Opcion incorrecta, vuelva a intentarlo");
                continue;
            }
            switch (opcionAcompañar) {
                //LOGICA DE LA OPCIOIN PAPAS FRITAS PEQUEÑAS
                case 1 -> {
                    System.out.println("PAPAS FRITAS PEQUEÑAS");
                    System.out.println("$3.400,00");
                    System.out.println("Calientes, crujientes y deliciosas. Disfrutá de nuestras papas mundialmente famosas, desde la primera "
                            + "hasta la última");
                    System.out.println("");
                    int opcionAA = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionAA = Teclado.leerEntero("");
                        if (opcionAA == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Papas Fritas Pequeñas", 3400, cantidad);
                            break;
                        } else if (opcionAA == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionAA != 2); //FINALIZA LA OPCION PAPAS FRITAS PEQUEÑAS

                }
                //LOGICA DE LA OPCIOIN PAPAS FRITAS MEDIANAS
                case 2 -> {
                    System.out.println("PAPAS FRITAS MEDIANAS");
                    System.out.println("$3.600,00");
                    System.out.println("Calientes, crujientes y deliciosas. Disfrutá de nuestras papas mundialmente famosas, desde la primera "
                            + "hasta la última");
                    System.out.println("");
                    int opcionBB = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionBB = Teclado.leerEntero("");
                        if (opcionBB == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Papas Fritas Medianas", 3600, cantidad);
                            break;
                        } else if (opcionBB == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionBB != 2); //FINALIZA LA OPCION PAPAS FRITAS MEDIANAS

                }
                //LOGICA DE LA OPCIOIN PAPAS FRITAS GRANDES
                case 3 -> {
                    System.out.println("PAPAS FRITAS GRANDES");
                    System.out.println("$3.800,00");
                    System.out.println("Calientes, crujientes y deliciosas. Disfrutá de nuestras papas mundialmente famosas, desde la primera "
                            + "hasta la última");
                    System.out.println("");
                    int opcionCC = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionCC = Teclado.leerEntero("");
                        if (opcionCC == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Papas Fritas Grandes", 3800, cantidad);
                            break;
                        } else if (opcionCC == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionCC != 2); //FINALIZA LA OPCION PAPAS FRITAS GRANDES

                }
                //LOGICA DE LA OPCIOIN PILETA DE CHEDDAR
                case 4 -> {
                    System.out.println("PILETA DE CHEDDAR");
                    System.out.println("$2.900,00");
                    System.out.println("Nuestro inigualable queso cheddar derretido ideal para acompañar tu hamburguesa, McNuggets, tus papas "
                            + "o lo quieras");
                    System.out.println("");
                    int opcionDD = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionDD = Teclado.leerEntero("");
                        if (opcionDD == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Pileta De Cheddar", 2900, cantidad);
                            break;
                        } else if (opcionDD == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionDD != 2); //FINALIZA LA OPCION PILETA DE CHEDDAR

                }
                //LOGICA DE LA OPCIOIN PAPAS CON CHEDDAR Y BACON
                case 5 -> {
                    System.out.println("PAPAS CON CHEDDAR Y BACON");
                    System.out.println("$4.900,00");
                    System.out.println("Papas fritas queso cheddar fundido y bacon. Disfrutá de nuestras papas mundialmente famosas, desde la"
                            + "primera hasta la última");
                    System.out.println("");
                    int opcionEE = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionEE = Teclado.leerEntero("");
                        if (opcionEE == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Papas Con Cheddar y Bacon", 4900, cantidad);
                            break;
                        } else if (opcionEE == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionEE != 2); //FINALIZA LA OPCION PAPAS CON CHEDDAR Y BACON

                }
                //LOGICA DE LA OPCIOIN SIDE SALAD
                case 6 -> {
                    System.out.println("SIDE SALAD");
                    System.out.println("$2.800,00");
                    System.out.println("Lechuga y rodajas de tomate");
                    System.out.println("");
                    int opcionFF = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionFF = Teclado.leerEntero("");
                        if (opcionFF == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Side Salad", 2800, cantidad);
                            break;
                        } else if (opcionFF == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionFF != 2); //FINALIZA LA OPCION SIDE SALAD

                }
                case 7 -> {
                    System.out.println("Volviendo atras...");

                }
            }

        } while (opcionAcompañar != 7);
    }

    public void menuBebidas(Carrito carrito) {
        int opcionBebidas = 0;
        do {
            System.out.println("--- BEBIDAS ---");
            System.out.println(" 1.Coca-Cola Chica          $3.000,00");
            System.out.println(" 2.Coca-Cola Mediana        $3.300,00");
            System.out.println(" 3.Coca-Cola Grande         $3.600,00");
            System.out.println(" 4.Sprite Zero Chica        $3.000,00");
            System.out.println(" 5.Sprite Zero Mediana      $3.300,00");
            System.out.println(" 6.Sprite Zero Grande       $3.600,00");
            System.out.println(" 7.Agua                     $3.800,00");
            System.out.println(" 8.Jugo De Manzana          $2.500,00");
            System.out.println(" 9.Judo De Naranja          $2.300,00");
            System.out.println(" 10.Volver atras");
            opcionBebidas = Teclado.leerEntero("");
            if (opcionBebidas < 1 || opcionBebidas > 10) {
                System.out.println("Opcion incorrecta, vuelva a intentarlo");
                continue;
            }
            switch (opcionBebidas) {
                //LOGICA OPCION COCA CHICA
                case 1 -> {
                    System.out.println("COCA-COLA CHICA");
                    System.out.println("$3.000,00");
                    System.out.println("Coca Cola pequeña");
                    System.out.println("");
                    int opcionBa = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionBa = Teclado.leerEntero("");
                        if (opcionBa == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Coca-Cola Chica", 3000, cantidad);
                            break;
                        } else if (opcionBa == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionBa != 2); //FINALIZA LA OPCION COCA CHICA

                }
                //LOGICA OPCION COCA MEDIANA
                case 2 -> {
                    System.out.println("COCA-COLA MEDIANA");
                    System.out.println("$3.300,00");
                    System.out.println("Refrescante gaseosa Coca Cola en tamaño mediano");
                    System.out.println("");
                    int opcionBb = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionBb = Teclado.leerEntero("");
                        if (opcionBb == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Coca-Cola Mediana", 3300, cantidad);
                            break;
                        } else if (opcionBb == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionBb != 2); //FINALIZA LA OPCION COCA MEDIANA

                }
                //LOGICA OPCION COCA GRANDE
                case 3 -> {
                    System.out.println("COCA-COLA GRANDE");
                    System.out.println("$3.600,00");
                    System.out.println("Refrescante gaseosa Coca Cola en tamaño grande");
                    System.out.println("");
                    int opcionBc = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionBc = Teclado.leerEntero("");
                        if (opcionBc == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Coca-Cola Grande", 3600, cantidad);
                            break;
                        } else if (opcionBc == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionBc != 2); //FINALIZA LA OPCION COCA GRANDE

                }
                //LOGICA OPCION SPRITE CHICA
                case 4 -> {
                    System.out.println("SPRITE ZERO CHICA");
                    System.out.println("$3.000,00");
                    System.out.println("Sprite Zero chica");
                    System.out.println("");
                    int opcionBd = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionBd = Teclado.leerEntero("");
                        if (opcionBd == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Sprite Zero chica", 3000, cantidad);
                            break;
                        } else if (opcionBd == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionBd != 2); //FINALIZA LA OPCION SPRITE CHICA

                }
                //LOGICA OPCION SPRITE MEDIANA
                case 5 -> {
                    System.out.println("SPRITE ZERO MEDIANA");
                    System.out.println("$3.300,00");
                    System.out.println("Refrescante gaseosa Sprite Zero en tamaño mediano");
                    System.out.println("");
                    int opcionBe = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionBe = Teclado.leerEntero("");
                        if (opcionBe == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Sprite Zero Mediana", 3300, cantidad);
                            break;
                        } else if (opcionBe == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionBe != 2); //FINALIZA LA OPCION SPRITE MEDIANA

                }
                //LOGICA OPCION SPRITE GRANDE
                case 6 -> {
                    System.out.println("SPRITE ZERO GRANDE");
                    System.out.println("$3.600,00");
                    System.out.println("Refrescante gaseosa Sprite Zero en tamaño grande");
                    System.out.println("");
                    int opcionBf = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionBf = Teclado.leerEntero("");
                        if (opcionBf == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Sprite Zero Grande", 3600, cantidad);
                            break;
                        } else if (opcionBf == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionBf != 2); //FINALIZA LA OPCION SPRITE GRANDE

                }
                //LOGICA OPCION AGUA
                case 7 -> {
                    System.out.println("AGUA");
                    System.out.println("$3.800,00");
                    System.out.println("Botella de 500ml de agua mineral");
                    System.out.println("");
                    int opcionBg = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionBg = Teclado.leerEntero("");
                        if (opcionBg == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Agua", 3800, cantidad);
                            break;
                        } else if (opcionBg == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionBg != 2); //FINALIZA LA OPCION AGUA

                }
                //LOGICA OPCION JUGO DE MANZANA
                case 8 -> {
                    System.out.println("JUGO DE MANZANA");
                    System.out.println("$2.500,00");
                    System.out.println("Jugo 100% manzana");
                    System.out.println("");
                    int opcionBh = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionBh = Teclado.leerEntero("");
                        if (opcionBh == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Jugo De Manzana", 2500, cantidad);
                            break;
                        } else if (opcionBh == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionBh != 2); //FINALIZA LA OPCION JUGO DE MANZANA

                }
                //LOGICA OPCION JUGO DE NARANJA
                case 9 -> {
                    System.out.println("JUGO DE NARANJA");
                    System.out.println("$2.300,00");
                    System.out.println("Jugo de Naranja");
                    System.out.println("");
                    int opcionBi = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionBi = Teclado.leerEntero("");
                        if (opcionBi == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Jugo De Naranja", 2300, cantidad);
                            break;
                        } else if (opcionBi == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionBi != 2); //FINALIZA LA OPCION JUGO DE NARANJA

                }
                case 10 -> {
                    System.out.println("Volviendo atras...");

                }
            }

        } while (opcionBebidas != 10);
    }

    public void menuPostre(Carrito carrito) {
        int opcionPostre = 0;
        do {
            System.out.println("--- POSTRES ---");
            System.out.println(" 1.McFlurry Oreo                 $4.200,00");
            System.out.println(" 2.McFlurry KitKat               $4.200,00");
            System.out.println(" 3.Cono Combinado                $1.200,00");
            System.out.println(" 4.Sundae De Dulce De Leche      $3.100,00");
            System.out.println(" 5.Sundae De Chocolate           $3.100,00");
            System.out.println(" 6.Sundae De Frutilla            $3.100,00");
            System.out.println(" 7.Volver atras");
            opcionPostre = Teclado.leerEntero("");
            if (opcionPostre < 1 || opcionPostre > 7) {
                System.out.println("Opcion incorrecta, vuelva a intentarlo");
                continue;
            }
            switch (opcionPostre) {
                //LOGICA OPCION MCFLURRY OREO
                case 1 -> {
                    System.out.println("MCFLURRY OREO");
                    System.out.println("$4.200,00");
                    System.out.println("Helado de vainilla, dulce de leche o mixto, galletitas oreo en trozos con salsa a elección");
                    System.out.println("");
                    int opcionP = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionP = Teclado.leerEntero("");
                        if (opcionP == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("McFlurry Oreo", 4200, cantidad);
                            break;
                        } else if (opcionP == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionP != 2); //FINALIZA LA OPCION MCFLURRY OREO

                }
                //LOGICA OPCION MCFLURRY KITKAT
                case 2 -> {
                    System.out.println("MCFLURRY KIKAT");
                    System.out.println("$4.200,00");
                    System.out.println("Helado de vainilla, dulce de leche o mixto, trocitos de KitKat con salsa a elección");
                    System.out.println("");
                    int opcionPa = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionPa = Teclado.leerEntero("");
                        if (opcionPa == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("McFlurry KitKat", 4200, cantidad);
                            break;
                        } else if (opcionPa == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionPa != 2); //FINALIZA LA OPCION MCFLURRY KITKAT

                }
                //LOGICA OPCION CONO COMBINADO
                case 3 -> {
                    System.out.println("CONO COMBINADO");
                    System.out.println("$1.200,00");
                    System.out.println("");
                    System.out.println("");
                    int opcionPb = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionPb = Teclado.leerEntero("");
                        if (opcionPb == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Cono Combinado", 1200, cantidad);
                            break;
                        } else if (opcionPb == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionPb != 2); //FINALIZA LA OPCION CONO COMBINADO

                }
                //LOGICA OPCION SUNDAE DDL
                case 4 -> {
                    System.out.println("SUNDAE DE DULCE DE LECHE");
                    System.out.println("$3.100,00");
                    System.out.println("El helado más rico con una salsa tibia de dulce de leche");
                    System.out.println("");
                    int opcionPc = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionPc = Teclado.leerEntero("");
                        if (opcionPc == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Sundae De Dulce De Leche", 3100, cantidad);
                            break;
                        } else if (opcionPc == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionPc != 2); //FINALIZA LA OPCION SUNDAE DDL

                }
                //LOGICA OPCION SUNDAE CHOCOLATE
                case 5 -> {
                    System.out.println("SUNDAE DE CHOCOLATE");
                    System.out.println("$3.100,00");
                    System.out.println("El helado más rico con una salsa tibia de chocolate");
                    System.out.println("");
                    int opcionPd = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionPd = Teclado.leerEntero("");
                        if (opcionPd == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Sundae De Chocolate", 3100, cantidad);
                            break;
                        } else if (opcionPd == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionPd != 2); //FINALIZA LA OPCION SUNDAE CHOCOLATE

                }
                //LOGICA OPCION SUNDAE FRUTILLA
                case 6 -> {
                    System.out.println("SUNDAE DE FRUTILLA");
                    System.out.println("$3.100,00");
                    System.out.println("El helado más rico con una salsa tibia de frutilla");
                    System.out.println("");
                    int opcionPe = 0;
                    do {
                        System.out.println("1.Agregar al carrito      2.Volver atras");
                        opcionPe = Teclado.leerEntero("");
                        if (opcionPe == 1) {
                            System.out.print("Cantidad:");
                            int cantidad = Teclado.leerEntero("");
                            carrito.agregarProducto("Sundae De Frutilla", 3100, cantidad);
                            break;
                        } else if (opcionPe == 2) {
                            System.out.println("Volviendo atras...");
                            break;
                        } else {
                            System.out.println("Opcion incorrecta, vuelva a intentarlo");
                        }
                    } while (opcionPe != 2); //FINALIZA LA OPCION SUNDAE FRUTILLA

                }
                //VOLVER ATRAS
                case 7 -> {
                    System.out.println("Volviendo atras...");

                }
            }

        } while (opcionPostre != 7);
    }
}
