package test.com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.dao.PassengerDAO;
import com.cbsgenesis.trainsmanagementsystem.model.Passenger;
import com.cbsgenesis.trainsmanagementsystem.model.Ticket;

/**
 * Test class for {@link PassengerDAO}
 *
 * Created by andreyb1990 on 12/1/16.
 */
public class PassengerDAOTest {
    public static void main(String[] args) {
        PassengerDAO passengerDAO = new PassengerDAO();
        Ticket ticket = new Ticket();

        Passenger passenger = new Passenger();
        passenger.setId(1L);
        passenger.setName("Andrey");
        passenger.setTicket(ticket);

        passengerDAO.saveEntity(passenger);

    }

}
