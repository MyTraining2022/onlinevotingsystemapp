package org.society;

import java.time.LocalDate;

import org.society.entities.ElectionResult;
import org.society.repository.ElectionResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class DBInitElectionResult implements CommandLineRunner{
	@Autowired
	ElectionResultRepository repo;
	@Override
	public void run(String... args) throws Exception {
		
	//ElectionResult e = new ElectionResult(333L, LocalDate.of(1999, 2, 11), null, "Saran", 3000, 56, 23f, 10, 7, "Win");	
		//System.out.println(e);
	repo.save(new ElectionResult(333L, LocalDate.of(1999, 2, 11), null, "Saran", 3000, 56, 23f, 10, 7, "Win"));
	
	}
	
	
}
