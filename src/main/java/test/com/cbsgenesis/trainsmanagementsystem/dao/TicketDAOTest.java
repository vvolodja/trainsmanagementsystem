package test.com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.dao.TicketDAO;
import com.cbsgenesis.trainsmanagementsystem.model.Ticket;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Test class for {@link TicketDAO}
 *
 * Created by Andrey Babenko on 12/6/16.
 */
public class TicketDAOTest {
    public static void main(String[] args) {
        TicketDAO ticketDAO = new TicketDAO();

        Ticket ticket = new Ticket();
        ticket.setId(1L);
        ticket.setFirstName("Andrey");
        ticket.setLastName("Babenko");
        ticket.setTypeOfWagoon("VIP");
        ticket.setPlace(12);

        DateFormat format = new SimpleDateFormat("EEE MMM dd hh:mm");

        Date departureDate = format.parse("Tue Dec 06 20:19");

        ticket.setDepartureDate(new Date());
        ticket.setArriveDate(new Date());
        ticket.setBed(true);
        ticket.setTea(1);
        ticket.setCoffee(0);
        ticket.setBaggage(10);

        ticketDAO.getEntityById(1L);
    }
}
