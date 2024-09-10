import java.util.Date;

public class Bill {
	private int billNo;
	private Date date;
	private double total;
	private double cgst;
	private double sgst;
	private double finalT;
	public Bill(int billNo, Date date, double total, double cgst, double sgst, double finalT) {
		
		this.billNo = billNo;
		this.date = date;
		this.total = total;
		this.cgst = cgst;
		this.sgst = sgst;
		this.finalT = finalT;
	}
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getCgst() {
		return cgst;
	}
	public void setCgst(double cgst) {
		this.cgst = cgst;
	}
	public double getSgst() {
		return sgst;
	}
	public void setSgst(double sgst) {
		this.sgst = sgst;
	}
	public double getFinalT() {
		return finalT;
	}
	public void setFinalT(double finalT) {
		this.finalT = finalT;
	}
	
	
	
}
