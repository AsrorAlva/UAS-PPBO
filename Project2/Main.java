/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project2;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[] args) { //Di dalam metode main(), objek car dibuat dengan tipe Vehicle yang mengacu pada implementasi Car.
        Vehicle car = new Car();
        car.setName("Ferrari"); //  diberi nama "Ferrari" menggunakan metode setName()

        Vehicle motorcycle = new Motorcycle();
        motorcycle.setName("Harley Davidson"); //diberi nama "Harley Davidson" menggunakan metode setName().

        System.out.println("Car Name: " + car.getName());
        car.start();
        car.stop();

        System.out.println("Motorcycle Name: " + motorcycle.getName());
        motorcycle.start();
        motorcycle.stop();
    } //dipanggil pada objek car dan objek motorcycle untuk mencetak pesan yang sesuai ke konsol.
}

