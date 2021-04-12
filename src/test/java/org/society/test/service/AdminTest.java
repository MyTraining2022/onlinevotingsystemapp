package org.society.test.service;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.time.LocalDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.society.dao.AdminDao;
import org.society.entities.Admin;
import org.society.repository.AdminRepository;
import org.society.repository.ElectionOfficerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class AdminTest {
	@Autowired
	private AdminDao adDao;
	@MockBean
	private AdminRepository repo;

	@Test
	@DisplayName("Test for adding Admin in database")
	public void addAdminDetailsTest() {
		Admin ad = new Admin(111l, "Life", "Water");

		when(repo.save(ad)).thenReturn(ad);
		assertEquals(ad, adDao.save(ad));

	}
}
