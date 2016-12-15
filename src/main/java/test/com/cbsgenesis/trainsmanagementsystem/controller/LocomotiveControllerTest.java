package test.com.cbsgenesis.trainsmanagementsystem.controller;

import com.cbsgenesis.trainsmanagementsystem.controller.LocomotiveController;

/**
 * Test class fot{@link LocomotiveController}
 * @Author Evgenij Lukashik
 */
public class LocomotiveControllerTest {
    public static void main(String[] args) {

        LocomotiveController locomotiveController = new LocomotiveController();

        System.out.println( locomotiveController.showAllLocomotives());
    }
}
