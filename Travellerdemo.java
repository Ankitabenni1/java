package ac.in.kletech.traveller;

public class Travellerdemo {

          static Checks CheckPoint=new Checks();
	public static void main(String[] args) {
		   Traveller A=new Traveller(19, 20, 2023, false);
		   System.out.println(A.getiTravellerID());
		   System.out.println(A.getFbaggageAmount());
		   System.out.println(A.getIexpiryYear());
		   if(CheckPoint.checkBaggage(A)&& CheckPoint.checkImmigration(A) && CheckPoint.checkSecurity(A))
		   {
			   System.out.println("FLY");
			   
		   }
		   else
			   System.out.println("GO FOE RECHECKING");
	}

}
