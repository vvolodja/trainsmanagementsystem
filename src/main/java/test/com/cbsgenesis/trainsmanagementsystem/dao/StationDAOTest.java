package test.com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.dao.StationDAO;
import com.cbsgenesis.trainsmanagementsystem.model.Station;

/**
 * Test class for {@link StationDAO}
 *
 * @author Eugene Suleimanov
 */
public class StationDAOTest {
    public static void main(String[] args) {
        StationDAO stationDAO = new StationDAO();

        Station station = new Station();
        station.setId(1L);
        station.setName("Test Name");
        station.setDescription("Test Description");

        stationDAO.saveEntity(station);
    }
}
