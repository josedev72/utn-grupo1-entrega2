
package com.examples.tpmesadeayuda_entrega2.vista;



//import com.examples.tpmesadeayuda_entrega2.daos.ServiciosDaoImplementacion;
import com.examples.tpmesadeayuda_entrega2.logica.Clientes;
//import com.examples.tpmesadeayuda_entrega2.logica.Incidentes;
//import com.examples.tpmesadeayuda_entrega2.logica.Servicios;
import com.examples.tpmesadeayuda_entrega2.logica.Incidentes;
import com.examples.tpmesadeayuda_entrega2.persistencia.ClientesRepository;
import com.examples.tpmesadeayuda_entrega2.persistencia.IncidentesRepository;
//import com.examples.tpmesadeayuda_entrega2.persistencia.IncidentesRepository;
//import com.examples.tpmesadeayuda_entrega2.persistencia.ServiciosRepository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import javax.persistence.criteria.CriteriaBuilder;
//import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class App_Principal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();

            opcion = scanner.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("Eligió Salir del programa . . .");
                    break;
                case 1:
                    // RRHH
                    int subrrhh = mostrarMenu_RRHH();
                    switch (subrrhh){
                        case 0:
                            mostrarMenu();break;
                        case 1:
                            altaTecnico();break;
                        case 2:
                            modificarTecnico();break;
                        case 3:
                            eliminarTecnico();break;
                        case 4:
                            listarTecnicos();break;
                        default:
                            System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                    }
                    break;
                case 2:
                    // Comercial
                    int comercial = mostrarMenu_Comercial();
                    switch (comercial){
                        case 0:
                            mostrarMenu();break;
                        case 1:
                            altaCliente();break;
                        case 2:
                            modificarCliente();break;
                        case 3:
                            eliminarCliente();break;
                        case 4:
                            listarTodosLosClientes();break;
                        default:
                            System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                    }
                    break;
                case 3:
                    // Mesa de ayuda
                    int mesa = mostrarMenu_MesaDeAyuda();
                    switch (mesa){
                        case 0:
                            mostrarMenu();break;
                        case 1:
                            altaIncidente();break;
                        default:
                            System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 0);
    /*
    try {
          repositorioClientes.agregarClientes(cliente1);
          repositorioServicios.agregarServicios(servicio1);
          repositorioIncidentes.agregarIncidentes(incidentes1);

        }catch (Exception e) {
            e.printStackTrace();
        }
        */
    }

    private static void listarTecnicos() {
    }

    private static void eliminarTecnico() {
    }

    private static void modificarTecnico() {
    }

    private static void altaIncidente() {
        Scanner scanner = new Scanner(System.in);

        //creo un incidente para poder pasarlo
        Incidentes incidente = new Incidentes();

        //id_cliente;
        //id_servicios; id_especialidades; id_tecnicos; String tiempo_estimado_resolucion; Date fecha_posible_resolucion;

        // -> Preg a Fabiana xq no consideramos en la bbdd, si es necesario persistir o no
        //@Transient
        // Estado estadoAux = getEstadoAux();
        // String estado;
        // String consideraciones;

        System.out.println("Ingrese los datos del Incidente: ");
        System.out.print("     Ingrese id de servicio: "); incidente.setId_servicios(scanner.nextInt());
        System.out.print("     Ingrese id de especialidad: "); incidente.setId_especialidades(scanner.nextInt());
        System.out.print("     Ingrese id del tecnico: "); incidente.setId_tecnicos(scanner.nextInt());

        int dia, mes, anio;
        System.out.println("     Ingrese fecha de posible resolución: ");
        System.out.print("          Día: "); dia = scanner.nextInt();
        System.out.print("          Mes: "); mes = scanner.nextInt();
        System.out.print("          Año: "); anio = scanner.nextInt();
        System.out.println();

        incidente.setFecha_posible_resolucion(new Date(anio, mes, dia));

        //creo el repositorio para poder hacer la consulta
        IncidentesRepository repositorioIncidentes = new IncidentesRepository();
        try {
            repositorioIncidentes.agregarIncidentes(incidente);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void altaTecnico() {
    }

    private static void listarTodosLosClientes() {
        ClientesRepository repositorioClientes = new ClientesRepository();
        repositorioClientes.obtenerEntityManagerConfigurado();
        for (Clientes clienteActual : repositorioClientes.listarTodosLosClientes()) {
            System.out.println(clienteActual.toString());
        }


        // Creo el repositorio para poder hacer la consulta
        // ClientesRepository repositorioClientes = new ClientesRepository()


    }

    private static void eliminarCliente() {
        Scanner scanner = new Scanner(System.in);

        //Instancio un cliente para poder modificarlo
        Clientes cliente = new Clientes();

        System.out.println("Ingrese Id del Cliente a eliminar: ");
        System.out.print("     Ingrese Id: "); cliente.setId_clientes(scanner.nextInt());
        ClientesRepository repositorioClientes = new ClientesRepository();
        try {
            repositorioClientes.borrarClientes(cliente);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    private static void altaCliente() {
        Scanner scanner = new Scanner(System.in);

        //creo un cliente para poder pasarlo
        Clientes cliente = new Clientes();

        System.out.println("Ingrese los datos del Cliente: ");
        System.out.print("     Ingrese email: "); cliente.setEmail(scanner.nextLine());
        System.out.print("     Ingrese C.U.I.T.: "); cliente.setCuit(scanner.nextLine());
        System.out.print("     Ingrese Razon Social: "); cliente.setRazonSocial(scanner.nextLine());

        //creo el repositorio para poder hacer la consulta
        ClientesRepository repositorioClientes = new ClientesRepository();
        try {
            repositorioClientes.agregarClientes(cliente);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void modificarCliente() throws Exception {
        // verificar si existe el cliente para poder modificarlo
        // x si, pedir los datos
        // x no, mostrar msj q no se ha encontrado el cliente

        Scanner scanner = new Scanner(System.in);

        //Instancio un cliente para poder modificarlo
        Clientes cliente = new Clientes();

        System.out.println("Ingrese Id del Cliente a modificar: ");
        System.out.print("     Ingrese Id: "); cliente.setId_clientes(scanner.nextInt());
        System.out.print("     Ingrese C.U.I.T.: "); cliente.setCuit(scanner.nextLine());
        System.out.print("     Ingrese Razon Social: "); cliente.setRazonSocial(scanner.nextLine());
        System.out.print("     Ingrese email: "); cliente.setEmail(scanner.nextLine());

        //creo el repositorio para poder hacer la consulta
        ClientesRepository repositorioClientes = new ClientesRepository();
        try {
            repositorioClientes.modificarClientes(cliente);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void mostrarMenu() {
        LimpiarTerminal();
        System.out.println("\n                        TP - Reporte de Incidentes");
        System.out.println("\n\n---------------------------");
        System.out.println("  Menú de Departamentos");
        System.out.println("---------------------------");
        System.out.println("  1. RRHH");
        System.out.println("  2. Comercial");
        System.out.println("  3. Mesa de ayuda");
        System.out.println("  0. Salir");
        System.out.print("         Ingrese una opción: ");
    }

    private static int mostrarMenu_RRHH() {
        System.out.println("\n---------------------------");
        System.out.println("      Departamento RRHH ");
        System.out.println("---------------------------");
        System.out.println("  1. Alta de Técnico");
        System.out.println("  2. Modificación de Técnico");
        System.out.println("  3. Eliminación de Técnico");
        System.out.println("  4. Listar Técnicos");
        System.out.println("  0. Volver atras");
        System.out.print("         Ingrese una opción: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private static int mostrarMenu_Comercial() {
        System.out.println("\n--------------------------------");
        System.out.println("      Departamento Comercial ");
        System.out.println("--------------------------------");
        System.out.println("  1. Alta de Cliente");
        System.out.println("  2. Modificación de Cliente");
        System.out.println("  3. Eliminación de Cliente");
        System.out.println("  4. Listar Clientes");
        System.out.println("  0. Volver atras");
        System.out.print("         Ingrese una opción: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int mostrarMenu_MesaDeAyuda() {
        System.out.println("\n--------------------------------------");
        System.out.println("      Departamento Mesa de Ayuda ");
        System.out.println("--------------------------------------");
        System.out.println("  1. Alta de Incidentes");
        System.out.println("  0. Volver atras");
        System.out.print("         Ingrese una opción: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void LimpiarTerminal() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.print("\033c");
                System.out.flush();
            }
        } catch (Exception e) {
            // Manejo de excepciones
        }
    }
}
