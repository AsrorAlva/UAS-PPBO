/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project2;

/**
 *
 * @author lenovo
 */
public class Motorcycle implements Vehicle {
    private String name; //File ini berisi definisi kelas Motorcycle yang juga mengimplementasikan interface Vehicle.

    @Override
    public void start() {
        System.out.println("Motorcycle starting...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopping...");
    } //Dalam metode start() dan stop(), pesan yang sesuai dicetak ke konsol.

    @Override
    public String getName() {
        return name;
    } //digunakan untuk mengembalikan nilai atribut name.

    @Override
    public void setName(String name) {
        this.name = name;
    } //digunakan untuk mengatur nilai atribut name.
}

