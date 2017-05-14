import model.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by ANAN011 on 12/5/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CustomerServiceTestWithSpring.LocalConfig.class)
public class CustomerServiceTestWithSpring {

  @Autowired
  CustomerService customerService;

  @Autowired
  Customer customer;

  @Test
  public void assertNotCustomerService() {
    assertNotNull(customerService);
    assertEquals(customerService.getCustomer().getName(), "prajesh");

  }

  @Configuration
  public static class LocalConfig {
    @Bean
    public CustomerService customerService() {
      return new CustomerService();
    }

    @Bean
    public Customer customer() {
      return new Customer(1234, "prajesh");
    }
  }
}
