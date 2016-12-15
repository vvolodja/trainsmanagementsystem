package test.com.cbsgenesis.trainsmanagementsystem.controller;

import com.cbsgenesis.trainsmanagementsystem.controller.TicketController;

/**
 * Test class for {@link TicketController}
 *
 * @author Andrey Babenko
 */
public class TicketControllerTest {
    public static void main(String[] args) {
        TicketController ticketController = new TicketController();

        System.out.println(ticketController.getAllEntities());
    }
}
