/*
 * Author- Govind Kidambi
 */
package org.society;

import org.society.repository.NominatedCandidatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DBinitNominatedCandidates implements CommandLineRunner {
	@Autowired
	NominatedCandidatesRepository nominatedCandidatesRepository;

	@Override
	public void run(String... args) throws Exception {

	}


}
