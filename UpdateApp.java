/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class UpdateApp { //Mendefinisikan kelas UpdateApp.
    public static void main(String[] args) { //Mendefinisikan metode utama main yang akan dijalankan saat program dijalankan.
        UpdateManager profile = new UpdateManager("Asror", 20, "Bogor, Jawa Barat");
        //Membuat objek ProfileManager dengan nilai awal "Asror" untuk name, 20 untuk age, dan "Bogor, Jawa Barat" untuk address.
        profile.printProfile(); //Memanggil metode printProfile pada objek profile untuk mencetak informasi profil awal ke konsol.

        System.out.println("Updating profile..."); //Mencetak pesan "Updating profile..." ke konsol.
        profile.setName("Asror Alva 'Izzi "); //Memanggil metode setName pada objek profile untuk mengubah nilai atribut name menjadi "Asror Alva 'Izzi".
        profile.setAge(19); //Memanggil metode setAge pada objek profile untuk mengubah nilai atribut age menjadi 19
        profile.setAddress("Bogor"); //Memanggil metode setAddress pada objek profile untuk mengubah nilai atribut address menjadi "Bogor".

        System.out.println("Updated profile:"); //Mencetak pesan "Updated profile:" ke konsol.
        profile.printProfile(); //Memanggil metode printProfile pada objek profile untuk mencetak informasi profil yang diperbarui ke konsol.
    }
}

