package test.com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.dao.FreightWagoonDAO;
import com.cbsgenesis.trainsmanagementsystem.model.FreightWagoon;

/**
 * Created by Java on 15.12.2016.
 */
public class FreightWagoonDAOTest {
    public static void main(String[] args) {
        FreightWagoonDAO freightWagoonDAO = new FreightWagoonDAO();

        FreightWagoon freightWagoon = createFreightWagoon();

        freightWagoonDAO.saveEntity(freightWagoon);

        updateFreightWagoon(freightWagoonDAO);

        //freightWagoonDAO.removeEntity(freightWagoon);

    }
    private static FreightWagoon createFreightWagoon(){
            FreightWagoon freightWagoon =new FreightWagoon();

        freightWagoon.setId(1L);
        freightWagoon.setTypeOfCargoForWagoon("Type of Freight for Wagon: Metal cargo ");
        freightWagoon.setWeight(555);
        freightWagoon.setDimension(444);

            return freightWagoon;
        }


    private static void updateFreightWagoon(FreightWagoonDAO freightWagoonDAO){
        FreightWagoon freightWagoon =new FreightWagoon();

        freightWagoon.setId(1L);
        freightWagoon.setTypeOfCargoForWagoon("Type of Freight for Wagon: Liquid cargo");
        freightWagoon.setWeight(777);
        freightWagoon.setDimension(888);

        freightWagoonDAO.updateEntity(freightWagoon);
    }





}
