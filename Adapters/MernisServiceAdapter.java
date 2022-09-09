package Adapters;

import Abstracts.ICustomerCheckService;
import Entities.Customer;
import WS.PVVKPSPublicSoap;

import java.util.Locale;

public class MernisServiceAdapter implements ICustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        PVVKPSPublicSoap client = new PVVKPSPublicSoap();
        boolean result = client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()),
                customer.getFirstName().toUpperCase(Locale.ROOT),
                customer.getLastName().toUpperCase(Locale.ROOT),
                customer.getBirthDay());

        if (result == true){
            return  true;
        }
        else{
            return false;
        }
    }
}
