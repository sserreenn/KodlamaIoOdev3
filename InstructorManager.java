/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seren
 */
public class InstructorManager extends UserManager{
    public void Loing(Instructor user) {
		super.Login(user);
                System.out.println("Eğitmen Id : "+ user.getId());
		System.out.println("Eðitmen Adı : "+user.getFirstName());
		System.out.println("Eðitmen Soyadı : "+user.getLastName());
		System.out.println("Eðitmen Maili:"+user.geteMail());
		System.out.println("Eðitmen Maaşı:"+user.getSalary());
                System.out.println("Eðitmen Branşı:"+user.getBranch());
	}
    public void Delete(Instructor userDlt) {
		super.delete(userDlt);
		userDlt.setSalary(0);
		userDlt.setBranch(null);	
	}
}
