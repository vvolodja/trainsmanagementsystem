package test.com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.dao.LocomotiveDAO;
import com.cbsgenesis.trainsmanagementsystem.dao.PassengerWaggonDAO;
import com.cbsgenesis.trainsmanagementsystem.model.Locomotive;
import com.cbsgenesis.trainsmanagementsystem.model.PassengerWaggon;

import java.util.Date;

/**
 * Created by Java on 15.12.2016.
 *
 *@author Julia Konoh;
 */
public class PassengerWagoonDAOTest {

    public static void main(String[] args) {
        PassengerWaggonDAO passengerWaggonDAO = new PassengerWaggonDAO();

        PassengerWaggon passengerWaggon = new PassengerWaggon();

        passengerWaggon.setId(1L);
        passengerWaggon.setTypeOfWagoonComfort(" Level of comfort");
        passengerWaggon.setQuantityOfSeats(54);


        //passengerWaggonDAO.saveEntity(passengerWaggon);
        // Get Passenger By Id
        // System.out.println(passengerWaggonDAO.getEntityById(1L));

         passengerWaggon.setId(2L);
         passengerWaggon.setTypeOfWagoonComfort("Coupe class");
         passengerWaggon.setQuantityOfSeats(36);
         passengerWaggonDAO.updateEntity(passengerWaggon);


        //passengerWaggonDAO.removeEntity(passengerWaggon);

    }
}
