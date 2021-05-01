/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seren
 */
public class StutendtManager extends UserManager{
    public void Loing(Student user){
        super.Login(user);
        System.out.println("Öğrenci id : "+ user.getId());
        System.out.println("Öğrenci Adı : "+ user.getFirstName());
        System.out.println("Öğrenci Soyadı : "+ user.getFirstName());
       System.out.println("Öğrenci Mail adresi : "+ user.geteMail());
       System.out.println("Öğrenci Okul Numarası : "+ user.getSchoolNumber());
       System.out.println("Öğrenci Ders Sayısı : "+ user.getNumberOfLessons());
       System.out.println("Öğrenci Bölümü : "+ user.getDepartment());
    }
    public void Delete(Student userDlt){
        super.Delete(userDlt);
        userDlt.setSchoolNumber(0);
        userDlt.setNumberOfLessons(0);
        userDlt.setDepartment(null);
    }
}
