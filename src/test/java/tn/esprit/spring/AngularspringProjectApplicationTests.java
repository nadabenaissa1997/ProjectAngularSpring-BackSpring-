package tn.esprit.spring;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import tn.esprit.spring.service.DomainService;
import tn.esprit.spring.entity.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AngularspringProjectApplicationTests {

	@Autowired
	DomainService us;

	@Test
	public void testAddDomain() throws java.text.ParseException {
	}
}
