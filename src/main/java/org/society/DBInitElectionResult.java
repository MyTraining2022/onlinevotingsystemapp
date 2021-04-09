package org.society;

import org.society.entities.ElectionResult;
import org.society.repository.ElectionResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DBInitElectionResult implements CommandLineRunner{
	@Autowired
	ElectionResultRepository repo;
	@Override
	public void run(String... args) throws Exception {
		
	repo.save(new ElectionResult(333L, 24/03/2020, null, "Saran", 3000, 56, 23f, 10, 7, "Win"));
	}
	
	
}
