package test.com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.dao.PassengerDAO;
import com.cbsgenesis.trainsmanagementsystem.model.Passenger;

/**
 * Test class for {@link PassengerDAO}
 *
 * @author Andrey Babenko
 */
public class PassengerDAOTest {
    public static void main(String[] args) {
        PassengerDAO passengerDAO = new PassengerDAO();
        Passenger passenger = createPassenger();

//        passengerDAO.saveEntity(passenger);
//
//        System.out.println(passengerDAO.getEntityById(1L));
//
//        updatePassenger(passengerDAO);
//
//        passengerDAO.removeEntity(passenger);

        System.out.println(passengerDAO.getAllEntities());

    }

    private static Passenger createPassenger() {
        Passenger passenger = new Passenger();
        passenger.setId(1L);
        passenger.setFirstName("Andrey");
        passenger.setLastName("Babenko");
        passenger.setTicketId(1L);

        return passenger;
    }

    private static void updatePassenger(PassengerDAO passengerDAO) {
        Passenger newPassenger = new Passenger();
        newPassenger.setId(1L);
        newPassenger.setFirstName("Eugene");
        newPassenger.setLastName("Suleimanov");
        newPassenger.setTicketId(1L);

        passengerDAO.updateEntity(newPassenger);
    }

}
