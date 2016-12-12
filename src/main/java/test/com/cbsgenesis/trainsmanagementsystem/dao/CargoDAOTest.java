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
        cargo.setType("Type of Cargo");
        cargo.setVolume(100);
        cargo.setWeight(500);
        cargo.setDimension(3000);
        cargo.setQuantityOfCars(10);


        cargoDAO.saveEntity(cargo);
    }
}
