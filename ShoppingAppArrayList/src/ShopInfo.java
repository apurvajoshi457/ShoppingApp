import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ShopInfo {


	public static List<Customer> accept() {
		String s1=null;
		String s2=null;
//Shape s=new Circle();
		List<Customer> CustomerList=new ArrayList<Customer>();
		Scanner sc=new Scanner(System.in);
		do {

			System.out.println("Enter cust id: ");
			int cust_id=sc.nextInt();

			System.out.println("Enter cust Name: ");
			String cust_name=sc.next();

			System.out.println("Enter cust mob No: ");
			String cust_mobNo=sc.next();

			System.out.println("Enter prod detailes: ");

			List<Product> ProductList=new ArrayList<Product>();
			do {
				System.out.println("Enter prod Id: ");
				int prod_id=sc.nextInt();
				System.out.println("Enter prod name: ");
				String prod_name=sc.next();
				System.out.println("Enter prod price: ");
				double prod_price=sc.nextDouble();
				System.out.println("Enter prod quantity: ");
				int prod_qty=sc.nextInt();
				Product prod1=new Product(prod_id,prod_name,prod_price,prod_qty);

				//prod[i]=prod1
				ProductList.add(prod1);

				System.out.println("Do you want to add more products: ");
				s2=sc.next();
			}while(s2.equalsIgnoreCase("yes"));

			System.out.println("Enter address detailes: ");
			System.out.println("Enter city: " );
			String city=sc.next();
			System.out.println("Enter state: ");
			String state=sc.next();
			System.out.println("Enter pincode: ");
			int pincode=sc.nextInt();

			Address addr2=new Address(city,state,pincode);

			Customer cust1=new Customer(cust_id,cust_name,cust_mobNo,ProductList,addr2);

			System.out.println("Do you want to add next customer: ");
			s1=sc.next();
			CustomerList.add(cust1);
		}while(s1.equalsIgnoreCase("yes"));


		return CustomerList;
	}




	public static void  calculateBill(List<Customer> CustomerList) {
		double total=0;
		//List<Bill> BillList= new ArrayList<Bill>();
		
		for(Customer c:CustomerList) {
			for(Product p: c.getProd()) {
				total=total+(p.getProdPrice()*p.getProdQty());
			}
			double cgst=total*0.06;
			double sgst=total*0.06;
			double finalTotal=total+cgst+sgst;

			Bill billobj=new Bill(1,new Date(),total,cgst,sgst,finalTotal);
			c.setBobj(billobj);
			
			
			
		}
		


	}

	public  void display(List<Customer> CustomerList){
		for (Customer c:CustomerList) {
			System.out.println("-------------------Customer details-----------------------------");
			System.out.println(c.getCustid());
			System.out.println(c.getCustName());
			System.out.println(c.getMobNo());


			System.out.println("----------------Product details--------------------------------");
			List<Product> productList=c.getProd();
			for(Product p:productList)
			{
				System.out.println("-------------product details--------------------------");
				System.out.println(p.getProdId());
				System.out.println(p.getProdName());
				System.out.println(p.getProdPrice());
				System.out.println(p.getProdQty());
			}
			System.out.println("------------------------Address details------------------------------");
			System.out.println(c.getAddr().getCity());
			System.out.println(c.getAddr().getState());
			System.out.println(c.getAddr().getPincode());

		}

		System.out.println("------------------------------Bill details----------------------------");
		
		
			for(Customer c: CustomerList) {
			//System.out.println(c.getBobj().getBillNo());
			System.out.println(c.getBobj().getCgst());
			System.out.println(c.getBobj().getFinalT());
			System.out.println(c.getBobj().getSgst());
			
			}
		
	}

}
