import model.Customer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by ANAN011 on 12/5/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {
  private CustomerService customerService;

  @Mock
  private Customer customerMock;

  @Before
  public void setup() {
    customerService = new CustomerService();
//    customerMock = mock(Customer.class);
  }

  @Test
  public void testChangeName() {
    //given
    customerService.setCustomer(customerMock);
    when(customerMock.getName()).thenReturn("prajesh");

    //when
    customerService.changeName("prajesh");

    //verify
//    verify(customerMock, times(1)).setName("prajesh");
    assertEquals(customerService.getCustomer().getName(), "prajesh");
  }
}