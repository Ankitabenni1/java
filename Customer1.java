package ac.in.kletech.customer1;

public class Customer1 {
	private int icustomerID[]={1,2,3,4,5};
	private String scustomerName[]={"A","B","C","D","E"};
	private long lphoneNum[]={926374525,345634754,343455,445543,45535};
	private float fbillAmount;
	public Customer1(int[] icustomerID, String[] scustomerName, long[] lphoneNum,
			float fbillAmount) {
		super();
		this.icustomerID = icustomerID;
		this.scustomerName = scustomerName;
		this.lphoneNum = lphoneNum;
		this.fbillAmount = fbillAmount;
	}
	
	public int[] getIcustomerID() {
		return icustomerID;
	}
	public String[] getScustomerName() {
		return scustomerName;
	}
	public long[] getLphoneNum() {
		return lphoneNum;
	}
	public float getFbillAmount() {
		return fbillAmount;
	}
	class RegualarCustomer extends Customer1{
		
	
	
	
	}	
	
	void computeBill(){
		
		
	}
	void printCustomerInfo(){
		
	System.out.println("ID = "+icustomerID);
	System.out.println("Name = "+scustomerName);
	System.out.println("Phone no = "+lphoneNum);
	System.out.println("Amount = "+fbillAmount);
	}
   		
	}


