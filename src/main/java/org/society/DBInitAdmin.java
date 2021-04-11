package org.society;

import org.society.entities.Admin;
import org.society.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBInitAdmin implements CommandLineRunner {
	@Autowired
	AdminRepository repository;

	@Override
	public void run(String... args) throws Exception {
		Admin ad1 = new Admin(123L, "Life", "Dead");
		repository.save(ad1);
	}

}
