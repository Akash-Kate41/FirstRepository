
public class AddCarToParking {
	
	public static Object getCarRegNo;
	//public static Object getcarRegNo;
	int CarRegNo;
	float CarOwnerName;
	float OwnerMobNo;
	
	{
	System.out.println("Enter the Car Registration Number"+CarRegNo);
	System.out.println("Enter the Car Owner Name "+CarOwnerName);
    System.out.println("Enter the Car Owner's Mobile Number "+OwnerMobNo);
	}
	
	public int getCarRegNo() {
		return CarRegNo;
	}
	public void setCarRegNo(int carRegNo) {
		CarRegNo = carRegNo;
	}
	public float getCarOwnerName() {
		return CarOwnerName;
	}
	public void setCarOwnerName(float carOwnerName) {
		CarOwnerName = carOwnerName;
	}
	public int getOwnerMobNo() {
		return OwnerMobNo;
	}
	public void setOwnerMobNo(int ownerMobNo) {
		OwnerMobNo = ownerMobNo;
	}
	public AddCarToParking(int carRegNo, float carOwnerName, int ownerMobNo) {
		super();
		this.CarRegNo = carRegNo;
		this.CarOwnerName = carOwnerName;
		this.OwnerMobNo = ownerMobNo;
	}
	
	public class ParkingNotFoundException extends Exception{
		
		public static void main(String[] args) {
			try {
				int Parking =getParking();
				System.out.println("Position is " +Parking);
			} catch (ParkingNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}
}


