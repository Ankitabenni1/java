package ac.in.kletech.traveller;

public class Traveller {
          private int iTravellerID;
          private float fbaggageAmount;
          private int iexpiryYear;
          private boolean bNOCstatus;
		
		public Traveller(int iTravellerID, float fbaggageAmount,
				int iexpiryYear, boolean bNOCstatus) 
		{
			this.iTravellerID = iTravellerID;
			this.fbaggageAmount = fbaggageAmount;
			this.iexpiryYear = iexpiryYear;
			this.bNOCstatus = bNOCstatus;
		}
		public int getiTravellerID() {
			return iTravellerID;
		}
		public float getFbaggageAmount() {
			return fbaggageAmount;
		}
		public int getIexpiryYear() {
			return iexpiryYear;
		}
		public boolean isbNOCstatus() {
			return bNOCstatus;
		}
          
}
