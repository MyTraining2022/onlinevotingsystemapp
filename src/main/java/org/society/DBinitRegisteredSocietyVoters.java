/*
 *@author: Aditya Mohapatra 
 */

package org.society;

import org.society.repository.RegisteredSocietyVotersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBinitRegisteredSocietyVoters implements CommandLineRunner {

	@Autowired
	RegisteredSocietyVotersRepository registeredSocietyVotersRepository;

	@Override
	public void run(String... args) throws Exception {

	}

}