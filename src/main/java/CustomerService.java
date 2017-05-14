import model.Customer;

/**
 * Created by ANAN011 on 12/5/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
public class CustomerService {
  Customer customer;

  public void changeName(String name) {
    customer.setName(name);
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }
}
