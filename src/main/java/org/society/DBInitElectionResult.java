package org.society;

import java.time.LocalDate;

import org.society.entities.CooperativeSociety;
import org.society.entities.ElectionResult;
import org.society.entities.NominatedCandidates;
import org.society.entities.RegisteredSocietyVoters;
import org.society.repository.ElectionResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBInitElectionResult implements CommandLineRunner {
	@Autowired
	ElectionResultRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		CooperativeSociety cs = new CooperativeSociety(100l, "Taj", "Mahal", "Sathpur", "Mondal", "Saran", "123456");
		NominatedCandidates nc = new NominatedCandidates(33l, 2222l, "Shor", "Tiger", 25000f, true, true, true,null );
		ElectionResult er1=new ElectionResult(121l, LocalDate.of(2021, 1, 26), nc, "Indra Nagar", 10000, 5000, 50, 2500, 50, "Win");
		repo.save(er1);
		NominatedCandidates nc2 = new NominatedCandidates(22l, 3333l, "Life", "Water", 35000f, true, true, true,null );
		ElectionResult er2=new ElectionResult(121l, LocalDate.of(2021, 1, 26), nc2, "Mohit Nagar", 20000, 10000, 50, 5000, 50, "Loss");
		repo.save(er2);
		NominatedCandidates nc3 = new NominatedCandidates(33l, 4444l, "Death", "Fire", 45000f, true, true, true,null	 );
		ElectionResult er3=new ElectionResult(131l, LocalDate.of(2021, 1, 26), nc3, "Ganga Nagar", 30000, 15000, 50, 7500, 50, "Win");
		repo.save(er3);
	}

}
