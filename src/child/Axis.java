package child;

import GrandParents.GovernmentOfIndia;
import others.Customer;
import parent.ReserveBankOfIndia;

public class Axis implements ReserveBankOfIndia {
	
	@Override
	public void rulesOfGovernmentOfIndia() {
		// TODO Auto-generated method stub
		System.out.println("Rules of government of India are followed by Axis bank.");
		System.out.println(GovernmentOfIndia.countryName);
	}

	@Override
	public void statutoryRistrictions() {
		// TODO Auto-generated method stub
		System.out.println("Statutory ristrictions are followed by Axis bank.");
	}

	@Override
	public void regulatoryRistrictions() {
		// TODO Auto-generated method stub
		System.out.println("Regulatory ristrictions are followed by Axis bank.");
	}
	
	@Override
	public String location() {
		// TODO Auto-generated method stub
		return "Noida";
	}
	
	public Customer addAccount(Integer id,String name,String bankName, String location) {
		Customer customer = new Customer();
		customer.setCustomerId(id);
		customer.setCustomerName(name);
		customer.setBankName(bankName);
		customer.setBankLocation(location);
		return customer;
	}
	
	public Customer addAccount(Integer id,String name,String bankName) {
		Customer customer = new Customer();
		customer.setCustomerId(id);
		customer.setCustomerName(name);
		customer.setBankName(bankName);
		customer.setBankLocation(location());
		return customer;
	}

}
