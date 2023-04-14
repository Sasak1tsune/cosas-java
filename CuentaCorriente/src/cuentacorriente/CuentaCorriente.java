/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentacorriente;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Juan Pablo Perea Santos
 */
public class CuentaCorriente {
//almacenar datos dni, nombre y saldo
//Crear cuenta(Dni,nombre,el saldo será 0)
//Sacar dinero(es posible solo con saldo suficiente)
//Ingresar dinero
//Mostrar Informacion(Nombre, Dni y saldo)

    static Scanner entrada = new Scanner(System.in);
    String dni;
    String nombre;
    double saldo;

    public CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = 0;
    }
    public void ingresarSaldo(double agregado) {
        this.saldo += agregado;
        System.out.println("Dinero ingresado con exito, su nuevo saldo es"+this.saldo);
    }

    public void sacarDinero(double retirada) {
        if (this.saldo >= retirada) {
            System.out.println("Perfecto, ha retirado " + retirada + "€");
            this.saldo -= retirada;
            System.out.println("Su saldo restante es" + this.saldo);
        }else{
            System.out.println("Saldo insuficiente\nSu saldo es"+this.saldo);
        }
    }

    public void consultarSaldo() {
        System.out.println("Esta cuenta pertenece a: "+this.nombre+" Con DNI: "+this.dni);
        System.out.println("El saldo disponible es" + this.saldo);
    }
    public static void main(String[] args) {
        int salida=0;
        boolean cuentaCreada=false;
        System.out.println("Inserte su Dni");
        String dni = entrada.nextLine();
        System.out.println("Inserte su nombre");
        String nombre = entrada.nextLine();
        CuentaCorriente usuario = new CuentaCorriente(dni, nombre);
        do{
        System.out.println("\n\n\nBienvenido al ''Banco Judio Promedio'', "+nombre);
        System.out.println("Que operación desea realizar?\n[1]sacar dinero\n[2]Ingresar Dinero\n[3]Consultar saldo\n[0]Salir");
        int seleccion = entrada.nextInt();
        entrada.nextLine();
        switch (seleccion) {
            case 1:
                
                break;
            case 2:
                
                System.out.println("Cuanto dinero desa retirar?");
                double retirada = entrada.nextDouble();
                usuario.sacarDinero(retirada);
                break;
            case 3:
                double agregado = entrada.nextDouble();
                entrada.nextLine();
                usuario.ingresarSaldo(agregado);
                break;
            case 4:
                usuario.consultarSaldo();
                break;
            case 0:
                salida = 1;
                break;
            default:
                System.out.println("Ninguna opción valida seleccionada");
        }
        }while(salida==0);
    }
}//Fine 
