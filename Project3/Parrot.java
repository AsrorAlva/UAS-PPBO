/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project3;

/**
 *
 * @author lenovo
 */
public class Parrot implements Bird { //mengimplementasikan interface Bird.
    @Override
    public void eat() {
        System.out.println("Parrot is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Parrot is sleeping...");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying...");
    } //Mengoverride metode eat(), sleep(), dan fly() sesuai dengan kontrak dari interface Animal dan Bird.
}

