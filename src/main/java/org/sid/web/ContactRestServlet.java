package org.sid.web;

import java.util.List;
import java.util.Optional;

import org.sid.dao.ContactRepository;
import org.sid.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactRestServlet {
	
		@Autowired
		private ContactRepository contactRepository;
		
		@RequestMapping(value="/contacts",method=RequestMethod.GET)
		public List<Contact> getCOntacts(){
			return contactRepository.findAll();
			
		}
		@RequestMapping(value="/contacts/{id}", method=RequestMethod.GET)
		public Optional<Contact> getContact(@PathVariable Long id) {
			return contactRepository.findById(id);
		}
		
		@RequestMapping(value="/chercheContacts", method=RequestMethod.GET)
		public Page<Contact> chercher(
				@RequestParam(name="mc",defaultValue="") String mc,
				@RequestParam(name="page",defaultValue="0") int page,
				@RequestParam(name="size",defaultValue="") int size) {
			
			return null;//contactRepository.chercher(mc, new PageRequest(page,size, null))
		}
		
		@RequestMapping(value="/contacts/{id}",method=RequestMethod.PUT)
			public Contact save(@PathVariable Long id,@RequestBody Contact c) {
				c.setId(id);
				return contactRepository.save(c);
	
		}
		
		@RequestMapping(value="/contacts/{id}", method=RequestMethod.DELETE)
			public boolean supprimer (@PathVariable Long id) {
			contactRepository.deleteById(id);
			return true;
		}
}
