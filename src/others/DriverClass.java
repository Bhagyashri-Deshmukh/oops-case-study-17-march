package others;

import child.Axis;
import child.SBI;
import parent.ReserveBankOfIndia;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReserveBankOfIndia rbiSbi = new SBI();
		
		rbiSbi.rulesOfGovernmentOfIndia();
		rbiSbi.statutoryRistrictions();
		rbiSbi.regulatoryRistrictions();
		
		System.out.println("==================================================================================================");
		
		SBI sbi = new SBI();
		Customer customer1 = sbi.addAccount(101,"Radhika Sawant","SBI","Pune");
		Customer customer2 = sbi.addAccount(102, "Shweta Kumari", "SBI");
		
		System.out.println(customer1);
		System.out.println("==================================================================================================");
		System.out.println(customer2);
		
		System.out.println("\n**********************************************************************************************\n");
		System.out.println("\n**********************************************************************************************\n");
		
		ReserveBankOfIndia rbiAxis = new Axis();
		
		rbiAxis.rulesOfGovernmentOfIndia();
		rbiAxis.statutoryRistrictions();
		rbiAxis.regulatoryRistrictions();
		
		System.out.println("==================================================================================================");
		
		Axis axis = new Axis();
		Customer customer3 = axis.addAccount(103,"Radhika Sawant","SBI","Pune");
		Customer customer4 = axis.addAccount(104, "Shweta Kumari", "SBI");
		
		System.out.println(customer3);
		System.out.println("==================================================================================================");
		System.out.println(customer4);
		
		
	}

}
