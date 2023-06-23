/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class UpdateManager { //Mendefinisikan kelas UpdateManager.
        private String name; //Mendeklarasikan variabel name sebagai tipe data String dan memberikannya akses privat (hanya dapat diakses di dalam kelas).
        private int age; //Mendeklarasikan variabel age sebagai tipe data int dan memberikannya akses privat.
        private String address; //Mendeklarasikan variabel address sebagai tipe data String dan memberikannya akses privat.
    
        public UpdateManager(String name, int age, String address) { //Mendefinisikan konstruktor ProfileManager dengan parameter name, age, dan address untuk menginisialisasi nilai awal dari atribut profil.
            this.name = name; //Menginisialisasi atribut name dengan nilai yang diterima dari parameter konstruktor.
            this.age = age; //Menginisialisasi atribut age dengan nilai yang diterima dari parameter konstruktor.
            this.address = address; //Menginisialisasi atribut address dengan nilai yang diterima dari parameter konstruktor.
        }
        public void setName(String name) { //Mendefinisikan metode setName yang menerima parameter name untuk mengubah nilai atribut name.
            this.name = name; //Mengubah nilai atribut name dengan nilai yang diterima dari parameter name.
        }
        public void setAge(int age) { //Mendefinisikan metode setAge yang menerima parameter age untuk mengubah nilai atribut age.
            this.age = age; //Mengubah nilai atribut age dengan nilai yang diterima dari parameter age.
        }
        public void setAddress(String address) { //Mendefinisikan metode setAddress yang menerima parameter address untuk mengubah nilai atribut address.
            this.address = address; //Mengubah nilai atribut address dengan nilai yang diterima dari parameter address.
        }
        public String getName() { //Mendefinisikan metode getName yang mengembalikan nilai atribut name.
            return name; //Mengembalikan nilai atribut name.
        }
        public int getAge() { //Mendefinisikan metode getAge yang mengembalikan nilai atribut age.
            return age; //Mengembalikan nilai atribut age.
        }
        public String getAddress() { //Mendefinisikan metode getAddress yang mengembalikan nilai atribut address
            return address; //Mengembalikan nilai atribut address.
        }
    
        public void printProfile() { //Mendefinisikan metode printProfile untuk mencetak informasi profil ke konsol.
            System.out.println("Name: " + name); //Mencetak nilai atribut name ke konsol.
            System.out.println("Age: " + age); //Mencetak nilai atribut age ke konsol.
            System.out.println("Address: " + address); // Mencetak nilai atribut address ke konsol.
        }
    }
    


