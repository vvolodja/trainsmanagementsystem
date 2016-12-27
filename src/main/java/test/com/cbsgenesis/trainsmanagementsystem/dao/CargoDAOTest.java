package test.com.cbsgenesis.trainsmanagementsystem.dao;

import com.cbsgenesis.trainsmanagementsystem.dao.CargoDAO;
import com.cbsgenesis.trainsmanagementsystem.model.Cargo;

/**
   @Eugeny Nenenko
 * Created by Java on 08.12.2016.
 */
public class CargoDAOTest {
    public static void main(String[] args) {
        CargoDAO cargoDAO = new CargoDAO();

        Cargo cargo =creteCargo();

        cargoDAO.saveEntity(cargo);

        System.out.println(cargoDAO.getEntityById(1L));

        updateCargo(cargoDAO);

        cargoDAO.removeEntity(cargo);

        System.out.println(cargoDAO.getAllEntities());

    }



    private static Cargo creteCargo() {
        Cargo cargo = new Cargo();

        cargo.setId(1l);
        cargo.setType("Type of cargo");
        cargo.setVolume(50);
        cargo.setWeight(100);
        cargo.setDimension(300);
        cargo.setQuantityOfCars(10);

        return cargo;
    }

    private static void updateCargo(CargoDAO cargoDAO){

        Cargo cargo = new Cargo();

        cargo.setId(1L);
        cargo.setType("Liquid cargo");
        cargo.setWeight(111);
        cargo.setDimension(5544);
        cargo.setQuantityOfCars(3322);

        cargoDAO.updateEntity(cargo);


    }

}

