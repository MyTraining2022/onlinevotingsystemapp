package org.society.test.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.society.dao.RegisteredSocietyVotersDao;
import org.society.entities.ElectionResult;
import org.society.entities.RegisteredSocietyVoters;
import org.society.repository.RegisteredSocietyVotersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class RegisteredSocietyVotersTest {

	@Autowired
	private RegisteredSocietyVotersDao registeredSocietyVotersDao;
	
	@MockBean
	private RegisteredSocietyVotersRepository registeredSocietyVotersRepository;
	
	@Test
	public void addRegisteredSocietyVotersDetailsTest() {
		RegisteredSocietyVoters  registeredSocietyVoters= new RegisteredSocietyVoters(1l, "12345", "Ashish", "shaw", "Bcrec", "Female", "obc", "9876543210", "mihir@email.com", "add1", "add23", "mondali", "Dis", 678543, true, null);
		when(registeredSocietyVotersRepository.save(registeredSocietyVoters)).thenReturn(registeredSocietyVoters);
		//assertEquals(registeredSocietyVoters, registeredSocietyVotersDao.save(registeredSocietyVoters));
	}
}
