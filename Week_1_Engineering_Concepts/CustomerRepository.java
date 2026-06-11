package Week_1_Engineering_Concepts.DesignPatternsMaster;
// Save as CustomerRepository.java
public interface CustomerRepository { String findCustomer(int id); }

class CustomerRepositoryImpl implements CustomerRepository {
    public String findCustomer(int id) { return "Ansh Raj"; }
}

class CustomerService {
    private CustomerRepository repo;
    public CustomerService(CustomerRepository r) { this.repo = r; }
    public String getCustomerName(int id) { return repo.findCustomer(id); }
}