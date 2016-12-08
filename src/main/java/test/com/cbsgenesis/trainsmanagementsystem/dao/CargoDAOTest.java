package test.com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.dao.CargoDAO;
import com.cbsgenesis.trainsmanagementsystem.model.Cargo;

/**
 * Created by Java on 08.12.2016.
 */
public class CargoDAOTest {
    public static void main(String[] args) {
        CargoDAO cargoDAO=new CargoDAO();

        Cargo cargo =new Cargo();
        cargo.setId(1l);
        cargo.setType("Type of cargo");
        cargo.setVolume(50);
        cargo.setWeight(100);
        cargo.setDimension(300);
        cargo.setQuantityOfCars(10);

        cargoDAO.saveEntity(cargo);

    }
}
