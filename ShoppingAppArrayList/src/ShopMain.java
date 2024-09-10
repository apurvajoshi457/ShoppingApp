import java.util.ArrayList;
import java.util.List;

public class ShopMain {

	public static void main(String[] args) {
		ShopInfo s=new ShopInfo();
		List<Customer> custlist=s.accept();
		s.calculateBill(custlist)	;
		s.display(custlist);
		
		
		
		
		
	}

}
