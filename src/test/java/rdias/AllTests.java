package rdias;

import rdias.dao.ClienteDAOTest;
import rdias.service.ClienteServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ClienteDAOTest.class})
public class AllTests {

}
