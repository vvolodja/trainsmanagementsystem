package test.com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.dao.CargoDAO;
import com.cbsgenesis.trainsmanagementsystem.dao.StationDAO;
import com.cbsgenesis.trainsmanagementsystem.model.Cargo;
import com.cbsgenesis.trainsmanagementsystem.model.Station;

/**
 * Test class for {@link StationDAO}
 *
 * @author Eugeny Nenenko
 */
public class StationDAOTest {
    public static void main(String[] args) {
        StationDAO stationDAO = new StationDAO();

        Station station =creteStation();

        stationDAO.saveEntity(station);

        System.out.println(stationDAO.getEntityById(1L));

        updateStation(stationDAO);

        //stationDAO.removeEntity(station);


        System.out.println(stationDAO.getAllEntities());

    }



    private static Station creteStation() {
        Station station = new Station();

        station.setId(1l);
        station.setName("Kyiv Station!");
        station.setDescription("Main station of Kyiv city");

        return station;
    }

    private static void updateStation(StationDAO stationDAO){

       Station station = new Station();

        station.setId(1l);
        station.setName("Dnipro Station!");
        station.setDescription("Main station of Dnipro city");


        stationDAO.updateEntity(station);


    }

}


