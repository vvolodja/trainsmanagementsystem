package test.com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.dao.TicketDAO;
import com.cbsgenesis.trainsmanagementsystem.model.Ticket;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Test class for {@link TicketDAO}
 *
 * Created by Andrey Babenko on 12/6/16.
 */
public class TicketDAOTest {
    public static void main(String[] args) {
        TicketDAO ticketDAO = new TicketDAO();

        // Old Ticket
        Ticket oldTicket = new Ticket();
        oldTicket.setId(1L);
        oldTicket.setFirstName("Andrey");
        oldTicket.setLastName("Babenko");
        oldTicket.setTypeOfWagoon("VIP");
        oldTicket.setPlace(12);
        oldTicket.setDepartureDate(new Date(2017,05,10,12,00));
        oldTicket.setArriveDate(new Date(2017,05,20,9,30));
        oldTicket.setBed(true);
        oldTicket.setTea(1);
        oldTicket.setCoffee(0);
        oldTicket.setBaggage(10);

        Ticket newTicket = new Ticket();
        newTicket.setId(1L);
        newTicket.setFirstName("Viktoria");
        newTicket.setLastName("Babenko");
        newTicket.setTypeOfWagoon("VIP");
        newTicket.setPlace(10);
        newTicket.setDepartureDate(new Date(2017,05,10,12,00));
        newTicket.setArriveDate(new Date(2017,05,20,9,30));
        newTicket.setBed(true);
        newTicket.setTea(2);
        newTicket.setCoffee(1);
        newTicket.setBaggage(20);

        // Save Ticket
        ticketDAO.saveEntity(oldTicket);

        // Get Ticket By Id
//        System.out.println(ticketDAO.getEntityById(1L));

        // Update Ticket
//        ticketDAO.updateEntity(newTicket);

        //Remove Ticket
//        ticketDAO.removeEntity(oldTicket);


    }
}
