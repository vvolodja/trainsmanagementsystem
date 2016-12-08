package test.com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.dao.LocomotiveDAO;
import com.cbsgenesis.trainsmanagementsystem.model.Locomotive;

import java.util.Date;

/**
 * Created DAO test;
 *
 * @Author Evgenij Lukashik
 */
public class LocomotiveDAOTest {
    public static void main(String[] args) {
        LocomotiveDAO locomotiveDAO = new LocomotiveDAO();

        Locomotive locomotive = new Locomotive();

        locomotive.setId(1L);
        locomotive.setName("Locomotive Test Name");
        locomotive.setCapacity(100);
        locomotive.setPower(1000);
        locomotive.setYearOfIssue(1925);
        locomotive.setFuelType("Diesel");
        locomotive.setLastServiceDate(new Date(2015,01,01,10,00));

        locomotiveDAO.saveEntity(locomotive);

        // Get Passenger By Id
        System.out.println(locomotiveDAO.getEntityById(1L));

        //locomotiveDAO.updateEntity(locomotive);

        //locomotiveDAO.removeEntity(locomotive);
    }
}
