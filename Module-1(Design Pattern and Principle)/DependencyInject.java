interface CustomerRepository {
    String findCustomerById(int id);
}

class CustomerRepositoryImpl implements CustomerRepository {
    public String findCustomerById(int id) {
    return "Customer ID: " + id +", Name: Mervyn";
    }
}

class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(
            CustomerRepository customerRepository) {
        this.customerRepository =
                customerRepository;
    }
    public void getCustomer(int id) {
        String customer =customerRepository.findCustomerById(id);
        System.out.println(customer);
    }
}

public class DependencyInject {
    public static void main(String[] args) {
        CustomerRepository customerRepository =new CustomerRepositoryImpl();
        CustomerService customerService =new CustomerService(customerRepository);
        customerService.getCustomer(101);
    }
}