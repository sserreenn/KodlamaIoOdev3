/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seren
 */
public class UserManager {

    public void Login(User user) {
        System.out.println(user.getFirstName()+"Sistemimize giriş yapmıştır");
    }
    public void Delete(User userDlt){
        System.out.println("Kullanici Silindi");
		System.out.println("\n Silinen Kullanicinin Ismi ve Soyismi: ");
		System.out.println("Isim : "+userDlt.getFirstName());
		System.out.println("Soyad : "+userDlt.getLastName()+"\n\n\n");
                userDlt.setId(0);
		userDlt.setFirstName(null);
		userDlt.setLastName(null);
		userDlt.seteMail(null);
    }
}
