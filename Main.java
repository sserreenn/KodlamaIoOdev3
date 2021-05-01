/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seren
 */
public class Main {
    public static void main(String[] args) {
        Instructor hoca = new Instructor(1, "Engin", "Demiroğ","engindemirog@gmail.com", 10000, "Backend");
        Student ogrenci =new Student(1, "Seren", "Akyüz", "seren.akyuz@outlook.com.tr", 10, 2, "Bilgisayar Mühendisliği");
        InstructorManager im = new InstructorManager();
        StutendtManager sm = new StutendtManager();
        
        im.Login(hoca);
        im.Delete(hoca);
        
        sm.Login(hoca);
        //sm.Delete(ogrenci);
    }
}
