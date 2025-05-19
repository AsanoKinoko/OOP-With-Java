package ui;

import bo.Management;
import utils.Validator;

public class Main {
    public static void main(String[] args) {
        Management manager= new Management();
//        manager.generateStudent();
        while (true) {
            System.out.println("\tWELCOME TO STUDENT MANAGEMENT");
            System.out.println(" 1.Create");
            System.out.println(" 2.Find and Sort");
            System.out.println(" 3.Update/Delete");
            System.out.println(" 4.Report");
            System.out.println(" 5.Exit");
            int choice = Validator.getInt("Enter choice:","Enter 1->5",
                    "Invalid!", 1, 5);
            switch (choice) {
                case 1:
                    manager.createStudent();
                    break;
                case 2:
                    manager.findAndSort();
                    break;
                case 3:
                    manager.updateOrDelete();
                    break;
                case 4:
                    manager.report();
                    break;
                case 5:
                    return;
            }
        }
    }
}