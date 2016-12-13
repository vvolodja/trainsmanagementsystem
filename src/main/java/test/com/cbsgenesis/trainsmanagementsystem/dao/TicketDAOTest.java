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
 * @author Andrey Babenko
 */
public class TicketDAOTest {
    public static void main(String[] args) {
        TicketDAO ticketDAO = new TicketDAO();
        Ticket ticket = createTicket();

        ticketDAO.saveEntity(ticket);

        System.out.println(ticketDAO.getEntityById(1L));

        updateTicket(ticketDAO);

        ticketDAO.removeEntity(ticket);

        System.out.println(ticketDAO.getAllEntitys());


    }

    private static Ticket createTicket() {
        Ticket ticket = new Ticket();
        ticket.setId(1L);
        ticket.setFirstName("Andrey");
        ticket.setLastName("Babenko");
        ticket.setTypeOfWagoon("VIP");
        ticket.setPlace(12);
        ticket.setDepartureDate(new Date(2017,05,10,12,00));
        ticket.setArriveDate(new Date(2017,05,20,9,30));
        ticket.setBed(true);
        ticket.setTea(1);
        ticket.setCoffee(0);
        ticket.setBaggage(10);

        return ticket;
    }

    private static void updateTicket(TicketDAO ticketDAO) {
        Ticket ticket = new Ticket();
        ticket.setId(1L);
        ticket.setFirstName("Eugene");
        ticket.setLastName("Suleimanov");
        ticket.setTypeOfWagoon("VIP");
        ticket.setPlace(12);
        ticket.setDepartureDate(new Date(2017,05,10,12,00));
        ticket.setArriveDate(new Date(2017,05,20,9,30));
        ticket.setBed(true);
        ticket.setTea(0);
        ticket.setCoffee(1);
        ticket.setBaggage(12);

        ticketDAO.updateEntity(ticket);
    }
}
