/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project3;

/**
 *
 * @author lenovo
 */
public class Dog implements Mammal { //mengimplementasikan interface Mammal.
    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    } 

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping...");
    }

    @Override
    public void run() {
        System.out.println("Dog is running..."); 
    } //Mengoverride metode eat(), sleep(), dan run() sesuai dengan kontrak dari interface Animal dan Mammal.
}

