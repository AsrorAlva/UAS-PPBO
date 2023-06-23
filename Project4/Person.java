/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project4;

/**
 *
 * @author lenovo
 */
public class Person {
    private String name;
    private int age;
    //Memiliki dua atribut, yaitu name untuk nama orang dan age untuk usia orang.
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //Konstruktor Person digunakan untuk menginisialisasi atribut name dan age saat objek dibuat.

    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    } //Metode sayHello() digunakan untuk mencetak pesan sapaan ke konsol dengan menggunakan atribut name dan age.
}
