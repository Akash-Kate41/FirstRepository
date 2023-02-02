import java.util.Scanner;

public class CarParkingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		{
		AddCarToParking Ac= new AddCarToParking(int CarRegNo,float CarOwnerName,float OwnerMobNo);
        Ac.AddCarToParking();
        GetParkedCarDetails gd= new GetParkedCarDetails(int CarRegNo);
        gd.GetParkedCarDetails();
        RemoveCarFromParking rm= new RemoveCarFromParking(int CarRegNo);
        rm.RemoveCarFromParking();
        ExitCarParking ep= new ExitCarParking(int exit);
        ep.ExitCarParking();
        
        
	
		}

	}

}
