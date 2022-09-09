package Abstracts;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{
    @Override
    public void customerSave(Customer customer) {
        System.out.println("Saved To Database : "+customer.getFirstName()+" "+customer.getLastName());
    }
}