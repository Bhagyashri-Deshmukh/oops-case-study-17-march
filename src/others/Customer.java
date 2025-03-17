package others;

public class Customer {

	private Integer customerId;
	private String customerName;
	private String bankName;
	private String bankLocation;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(Integer customerId, String customerName, String bankName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.bankName = bankName;
	}

	public Customer(Integer customerId, String customerName, String bankName, String bankLocation) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.bankName = bankName;
		this.bankLocation = bankLocation;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankLocation() {
		return bankLocation;
	}

	public void setBankLocation(String bankLocation) {
		this.bankLocation = bankLocation;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", bankName=" + bankName
				+ ", bankLocation=" + bankLocation + "]";
	}
	
}
