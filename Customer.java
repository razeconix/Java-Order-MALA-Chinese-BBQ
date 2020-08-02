
import java.util.*;

class Customer
{
	private String customerName;
	private String customerTel;
	private String customerAddress;

	public Customer()
	{
		customerName = "Customer1";
		customerTel = null;
		customerAddress = null;
	}

	public Customer(String customerNamePara, String customerTelPara, String customerAddressPara)
	{
		this.customerName = customerNamePara;
		this.customerTel = customerTelPara;
		this.customerAddress = customerAddressPara;
	}

	public void setCustomerName(String customerNamePara)
	{
		this.customerName = customerNamePara;
	}

	public String getCustomerName()
	{
		return customerName;
	}

	public void setCustomerTel(String customerTelPara)
	{
		this.customerTel = customerTelPara;
	}

	public String getCustomerTel()
	{
		return customerTel;
	}

	public void setCustomerAddress(String customerAddressPara)
	{
		this.customerAddress = customerAddressPara;
	}

	public String getCustomerAddress()
	{
		return customerAddress;
	}
}
