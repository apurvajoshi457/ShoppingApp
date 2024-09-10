import java.util.List;

public class Customer {

	
	private int custid;
	private String custName;
	private String mobNo;
	private List<Product> prod;
	private Address addr;
	private Bill bobj;
	public Bill getBobj() {
		return bobj;
	}
	public void setBobj(Bill bobj) {
		this.bobj = bobj;
	}
	public Customer(int custid, String custName, String mobNo, List<Product> prod, Address addr) {
		super();
		this.custid = custid;
		this.custName = custName;
		this.mobNo = mobNo;
		this.prod = prod;
		this.addr = addr;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public List<Product> getProd() {
		return prod;
	}
	public void setProd(List<Product> prod) {
		this.prod = prod;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	
}