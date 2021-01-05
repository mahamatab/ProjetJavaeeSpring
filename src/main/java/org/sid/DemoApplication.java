package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.sid.dao.ContactRepository;
import org.sid.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private ContactRepository contactRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		/*DateFormat df= new SimpleDateFormat("dd/MM/yyyy");
		contactRepository.save(new Contact("Mahamat","Abdelkerim",df.parse("12/01/1996"),"abdelkerimmahamat30@gmail.com",783194007,"photo1"));
		contactRepository.save(new Contact("Cherif","Haggar",df.parse("12/01/1906"),"abdelkerimmahamat30@gmail.com",783194007,"photo1"));
		contactRepository.save(new Contact("Terap","Tero",df.parse("12/01/1796"),"abdelkerimmahamat30@gmail.com",783194007,"photo1"));
		contactRepository.findAll().forEach(c->{
			System.out.println(c.getNom());
			});  */

	}

} 
