package Concretes;

import Abstracts.ICustomerCheckService;
import Abstracts.ICustomerService;
import Entities.Customer;

public class CustomerManager implements ICustomerService {

    private ICustomerCheckService iCustomerCheckService;

    public CustomerManager(ICustomerCheckService icustomerCheckService){
        this.iCustomerCheckService = icustomerCheckService;
    }

    @Override
    public void customerSave(Customer customer) throws Exception {
        if (iCustomerCheckService.checkIfRealPerson(customer)){
            System.out.println("Saved To Person : "+customer.getFirstName() +" "+customer.getLastName());
        }
        else{
            System.out.println("Not A Valid Person");
        }
    }
}