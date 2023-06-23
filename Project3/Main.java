/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project3;

/**
 *
 * @author lenovo
 */
public class Main { //merupakan kelas utama yang berisi metode main sebagai titik masuk program.
    public static void main(String[] args) {
        Dog dog = new Dog(); //
        dog.eat();
        dog.sleep();
        dog.run();

        Parrot parrot = new Parrot();
        parrot.eat();
        parrot.sleep();
        parrot.fly();
    }    //Pada metode main, objek dog dan parrot dibuat dengan menggunakan implementasi Dog dan Parrot yang telah didefinisikan sebelumnya.
        //Metode eat(), sleep(), dan run() dipanggil pada objek dog untuk mencetak pesan yang sesuai ke konsol.
        //Metode eat(), sleep(), dan fly() dipanggil pada objek parrot untuk mencetak pesan yang sesuai ke konsol.
}
