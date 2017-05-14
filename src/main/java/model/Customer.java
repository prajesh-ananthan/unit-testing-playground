package model;

/**
 * Created by ANAN011 on 12/5/2017.
 *
 * @author Prajesh Ananthan, arvato Systems Malaysia Sdn Bhd
 */
public class Customer {
  private int id;
  private String name;

  public Customer(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    System.out.println("Customer getName method");
    return name;
  }

  public void setName(String name) {
    System.out.println("Customer setName method");
    this.name = name;
  }
}
