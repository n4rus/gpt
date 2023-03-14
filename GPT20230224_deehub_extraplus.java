import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
 
public class DeliveryHub extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_hub);
 
        // Create the buttons for each delivery app
        Button fedexButton = (Button) findViewById(R.id.fedex_button);
        Button upsButton = (Button) findViewById(R.id.ups_button);
        Button uspsButton = (Button) findViewById(R.id.usps_button);
 
        // Set onClickListeners for each button to launch the corresponding delivery app's activity
        fedexButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.fedex.app");  // Replace with actual package name of FedEx app 
                startActivity(intent);   // Launch the FedEx app activity 
            }  
        });

        upsButton.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                Intent intent = new Intent("com.ups.app");   // Replace with actual package name of UPS app 
                startActivity(intent);    // Launch the UPS app activity 

            }  

        });

        uspsButton.setOnClickListener(new View.OnClickListener() { 

            @Override 

            public void onClick(View v) { 

                Intent intent = new Intent("com.usps.app");   // Replace with actual package name of USPS app 

                startActivity(intent);    // Launch the USPS app activity  

            }  

        });  

    }  														// End of DeliveryHub class


//Create a new Android project 
public class RideOrderSelector extends Activity {

    //Declare variables 
    private double price;
    private double distance;

    //Create a method to select the ride orders by price and distance 
    public void selectRideOrder(double price, double distance) {

        //Check if the price is within the range of Ifood, Uber, and Rappi 
        if (price >= 0 && price <= 10) {

            //Check if the distance is within the range of Ifood, Uber, and Rappi 
            if (distance >= 0 && distance <= 10) {

                //If both conditions are met, display a list of available rides from Ifood, Uber, and Rappi 
                System.out.println("Available rides from Ifood, Uber, and Rappi:");

                //Display list of available rides from Ifood 
                System.out.println("Ifood:");

                //Display list of available rides from Uber 
                System.out.println("Uber:");

                //Display list of available rides from Rappi 
                System.out.println("Rappi:");

            } else {

                //If the distance is not within the range of Ifood, Uber, and Rappi display an error message 
                System.out.println("Error: Distance not within range.");

            }

        } else {

            //If the price is not within the range of Ifood, Uber, and Rappi display an error message  
            System.out.println("Error: Price not within range.");

        }  
    }  
}

//In the onCreate() method of the main activity, call the selectRideOrder() method 
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //Call the selectRideOrder() method 
    RideOrderSelector rideOrderSelector = new RideOrderSelector();
    rideOrderSelector.selectRideOrder(price, distance);
}

//In the onCreate() method of the main activity, call the selectRideOrder() method 
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //Call the selectRideOrder() method 
    RideOrderSelector rideOrderSelector = new RideOrderSelector();
    rideOrderSelector.selectRideOrder(price, distance);
}
