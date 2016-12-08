package test.com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.dao.PassengerDAO;
import com.cbsgenesis.trainsmanagementsystem.model.Passenger;
import com.cbsgenesis.trainsmanagementsystem.model.Ticket;

import java.util.Date;

/**
 * Test class for {@link PassengerDAO}
 *
 * Created by Andrey Babenko on 12/1/16.
 */
public class PassengerDAOTest {
    public static void main(String[] args) {
        PassengerDAO passengerDAO = new PassengerDAO();

        Ticket ticket = new Ticket();
        ticket.setId(1L);
        ticket.setFirstName("Andrey");
        ticket.setLastName("Babenko");
        ticket.setTypeOfWagoon("VIP");
        ticket.setPlace(12);
        ticket.setDepartureDate(new Date());
        ticket.setArriveDate(new Date());
        ticket.setBed(true);
        ticket.setTea(1);
        ticket.setCoffee(0);
        ticket.setBaggage(10);

        Passenger oldPassenger = new Passenger();
        oldPassenger.setId(1L);
        oldPassenger.setFirstName("Andrey");
        oldPassenger.setLastName("Babenko");
        oldPassenger.setTicketId(1L);

        Passenger newPassenger = new Passenger();
        newPassenger.setId(1L);
        newPassenger.setFirstName("Viktoria");
        newPassenger.setLastName("Babenko");
        newPassenger.setTicketId(1L);

        // Save Passenger
//        passengerDAO.saveEntity(oldPassenger);

        // Get Passenger By Id
        System.out.println(passengerDAO.getEntityById(1L));

        // Update Passenger
//        passengerDAO.updateEntity(newPassenger);

        //Remove Passenger
//        passengerDAO.removeEntity(oldPassenger);

    }

}
