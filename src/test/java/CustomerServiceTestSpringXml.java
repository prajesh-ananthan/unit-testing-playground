import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by ANAN011 on 12/5/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Configuration
@ImportResource(locations = "classpath:/customerservice-test-context.xml")
public class CustomerServiceTestSpringXml {

  @Autowired
  CustomerService customerService;

  @Test
  public void testcustomerServiceNotNull() {
    assertNotNull(customerService);
  }
}
