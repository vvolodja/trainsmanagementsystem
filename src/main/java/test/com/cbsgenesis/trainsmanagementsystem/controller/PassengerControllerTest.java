package test.com.cbsgenesis.trainsmanagementsystem.controller;

import com.cbsgenesis.trainsmanagementsystem.controller.PassengerController;

/**
 * Test class for {@link PassengerController}
 *
 * @author Andrey Babenko
 */
public class PassengerControllerTest {
    public static void main(String[] args) {
        PassengerController passengerController = new PassengerController();

        System.out.println(passengerController.showAllPassengers());
    }
}
