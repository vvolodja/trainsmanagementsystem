package test.com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.dao.CargoDAO;
import com.cbsgenesis.trainsmanagementsystem.model.Cargo;

/**
 * Created by Евгений on 06.12.2016.
 */
public class CargoDAOTest {
    public static void main(String[] args) {
        CargoDAO cargoDAO = new CargoDAO();

        Cargo cargo = new Cargo();
        cargo.setId(1L);
        cargo.setName("Test Name");

        cargoDAO.saveEntity(cargo);
    }
}
