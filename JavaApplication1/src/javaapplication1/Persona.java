/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author JPPS
 */
public class Persona {

    String nombre = "NoName";
    byte edad = 0;
    double estatura = 0;
    String dni = "";
    static String hoy = "Miercoles";
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre = "Juanpisito";
        p1.estatura = 1.87;
        p1.edad = 19;
        p1.dni = "Y7718272S";
        System.out.println(p1.nombre + "\n" + p1.edad + "\n" + p1.estatura + "\n" + p1.dni);
        p1.saludar();
        p1.crecer(0.23);
        System.out.println("mi nueva estatura es: " + p1.estatura);
        p1.cumplirAnhos();
        System.out.println("mi nueva edad es: " + p1.edad);
        System.out.println("Hoy es: " + Persona.hoy);
        p1.hoyEs(2);
        System.out.println(p1.hoy);
    }

    void saludar() {
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Encantando de conocerte");
    }

    void crecer(double incremento) {
        estatura += incremento;
    }

    void cumplirAnhos() {
        edad++;
    }
    static void hoyEs(int dia){
        switch(dia){
            case 1:
                hoy="Lunes";
                break;
            case 2:
                hoy="Martes";
                break;
            case 3:
                hoy="Miercoles";
                break;
            case 4:
                hoy="Jueves";
                break;
            case 5:
                hoy="Viernes";
                break;
            case 6:
                hoy="Sabado";
                break;
            case 7:
                hoy="Domingo";
                break;
        }
    }  
}
