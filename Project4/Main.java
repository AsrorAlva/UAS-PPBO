/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project4;

/**
 *
 * @author lenovo
 */
public class Main { //Pada metode main, dua objek person1 dan person2 dibuat menggunakan kelas Person.
    public static void main(String[] args) {
        Person person1 = new Person("Asror", 19); //Objek person1 diinisialisasi dengan nilai "Asror" dan 19 menggunakan konstruktor Person.
        person1.sayHello(); 

        Person person2 = new Person("Salwa", 19); //Objek person1 diinisialisasi dengan nilai "Salwa" dan 19 menggunakan konstruktor Person.
        person2.sayHello(); //dipanggil pada objek person1 dan person2 untuk mencetak pesan sapaan yang mencakup nama dan usia.
    }
}
