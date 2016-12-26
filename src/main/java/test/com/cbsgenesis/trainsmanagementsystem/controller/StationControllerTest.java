package test.com.cbsgenesis.trainsmanagementsystem.controller;

import com.cbsgenesis.trainsmanagementsystem.controller.CargoController;
import com.cbsgenesis.trainsmanagementsystem.controller.StationController;
import com.cbsgenesis.trainsmanagementsystem.model.Station;

/**
 * Created by Евгений on 26.12.2016.
 */
public class StationControllerTest {
    public static void main(String[] args) {
        StationController stationController = new StationController();

        System.out.println(stationController.getAllEntities());
    }
}
