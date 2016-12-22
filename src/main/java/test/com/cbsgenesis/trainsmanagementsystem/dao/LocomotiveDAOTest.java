package test.com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.dao.LocomotiveDAO;
import com.cbsgenesis.trainsmanagementsystem.model.Locomotive;

import java.util.Date;

/**
 * Created DAO test{@link LocomotiveDAO};
 *
 * @Author Evgenij Lukashik
 */
public class LocomotiveDAOTest {
    public static void main(String[] args) {
        LocomotiveDAO locomotiveDAO = new LocomotiveDAO();

        Locomotive locomotive = createLocomotive();


        //locomotiveDAO.saveEntity(locomotive);

        updateLocomotive(locomotiveDAO);

        // Get Passenger By Id
        //System.out.println(locomotiveDAO.getEntityById(1L));

        //locomotiveDAO.updateEntity(locomotive);
        //locomotiveDAO.removeEntity(locomotive);

        System.out.println(locomotiveDAO.getAllEntitys());
    }

public static Locomotive createLocomotive(){
        Locomotive locomotive = new Locomotive();
        locomotive.setId(1L);
        locomotive.setName("Locomotive Test Name");
        locomotive.setCapacity(100);
        locomotive.setPower(1000);
        locomotive.setYearOfIssue(1925);
        locomotive.setFuelType("Diesel");
        locomotive.setLastServiceDate(new Date(2015,01,01,10,00));

        return locomotive;
    }


    public static void updateLocomotive(LocomotiveDAO locomotiveDAO){
        Locomotive Updatelocomotive = new Locomotive();
        Updatelocomotive.setId(2L);
        Updatelocomotive.setName("New Locomotive Test Name");
        Updatelocomotive.setCapacity(200);
        Updatelocomotive.setPower(2000);
        Updatelocomotive.setYearOfIssue(1915);
        Updatelocomotive.setFuelType("Diesel Power");
        Updatelocomotive.setLastServiceDate(new Date(2015,01,01,10,00));

    }
}
