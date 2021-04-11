package org.society.test.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.society.dao.ElectionResultDao;
import org.society.entities.ElectionResult;
import org.society.repository.ElectionResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class ElectionResultTest {
	@Autowired
	private ElectionResultDao erservice;

	@MockBean
	private ElectionResultRepository repo;

	@Test
	public void addElectionResultDetailsTest() {
	
		ElectionResult er = new ElectionResult(121l, LocalDate.of(2021, 01, 26), null, "Saran",1000, 500, 50f, 300, 30f, "win");
		when(repo.save(er)).thenReturn(er);
		assertEquals(er, erservice.save(er));

	}
	
	@Test
	public void updateElectionResultDetailsTest() {
		
		ElectionResult er = new ElectionResult(121l, LocalDate.of(2021, 01, 26), null, "Saran",1000, 500, 50f, 300, 30f, "win");
		//when(repo.update(er)).thenReturn(er);
		assertEquals(er, erservice.save(er));

	}
}
