/*
 *@author: Aditya Mohapatra 
 */

package org.society;

import org.society.repository.VotedListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBinitVotedList implements CommandLineRunner {
	@Autowired
	VotedListRepository votedListRepository;

	@Override
	public void run(String... args) throws Exception {
		
		
		

	}

}