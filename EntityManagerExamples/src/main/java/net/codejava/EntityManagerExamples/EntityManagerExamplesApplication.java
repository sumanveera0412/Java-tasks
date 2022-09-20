package net.codejava.EntityManagerExamples;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EntityManagerExamplesApplication implements CommandLineRunner {
  
	@Autowired private ContactRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(EntityManagerExamplesApplication.class, args);
	}
@Override
public void run(String... args) throws Exception {
	//createContact();
	//updateContact();
	deleteContact();
	listContacts();
	//getContact();
	
}
private void deleteContact() {
	Integer id=1;
	repo.delete(id);
}
private void updateContact() {
	Integer id = 1;
	Contact contact = repo.findById(id);
	contact.setEmail("john.deo.2022@outlook.com");
	
	repo.update(contact);
}

private void getContact() {
	Integer id=2;
	Contact contact = repo.findById(id);
	System.out.println(contact);
}
private void createContact() {
	Contact contact = new Contact();
	contact.setName("Mohit");
	contact.setEmail("mohit2124@gmail.com");
	contact.setAddress("Bangalore,Karnataka");
	
	repo.save(contact);
}
private void listContacts() {
	List<Contact> listContracts = repo.findAll();
    listContracts.forEach(System.out::println);
}
}