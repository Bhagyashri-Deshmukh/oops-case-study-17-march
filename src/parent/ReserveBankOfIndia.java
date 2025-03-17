package parent;

import GrandParents.GovernmentOfIndia;

public interface ReserveBankOfIndia extends GovernmentOfIndia {
	
	public void statutoryRistrictions();
	
	public void regulatoryRistrictions();
	
	public default String location() {
		return "Delhi";
	}
}
