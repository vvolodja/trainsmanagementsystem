package test.com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.dao.FreightWagoonDAO;
import com.cbsgenesis.trainsmanagementsystem.model.FreightWagoon;

/**
 * Created by Java on 15.12.2016.
 */
public class FreightWagoonTest {
    public static void main(String[] args) {
        FreightWagoonDAO freightWagoonDAO = new FreightWagoonDAO();

        FreightWagoon freightWagoon = new FreightWagoon();

        freightWagoon.setId(1L);
        freightWagoon.setTypeOfCargoForWagoon("Type of Freight for Wagoon");
        freightWagoon.setWeight(555);
        freightWagoon.setDimension(444);

        freightWagoonDAO.saveEntity(freightWagoon);


    }
}
