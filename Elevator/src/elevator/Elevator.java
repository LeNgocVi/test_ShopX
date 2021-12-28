/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevator;
import java.util.*;

class Elevator {

  private int currentFloor;

  public void run() {
    currentFloor = 1 + ((int) (Math.random() * 10));

    System.out.println("The elevator is now on floor " + currentFloor);
    System.out.print("Which floor are you at now (0-10) where 0 = basement: ");
    int personFloor = Keyboard.readInt();
    moveTo(personFloor);
    System.out.println("Enter the elevator");

    System.out.println("To which floor do you want to go (0-10) where 0 = basement");
    int destinationFloor = Keyboard.readInt();
    moveTo(destinationFloor);
    System.out.println("Leave the elevator");
  }

  private void moveTo(int destinationFloor) {
    if (destinationFloor == currentFloor) {
      /* nothing to do */
    } else if (destinationFloor > currentFloor) {
      moveUpTo(destinationFloor);
    } else {
      moveDownTo(destinationFloor);
    }
  }

  private void moveUpTo(int destinationFloor) {
    System.out.println("The elevator is on its way up ...");
    while (currentFloor < destinationFloor) {
      currentFloor++;
      System.out.println(currentFloor);
    }
    System.out.println("The elevator has arrived");
  }

  private void moveDownTo(int destinationFloor) {
    System.out.println("The elevator is on its way down ...");
    while (currentFloor > destinationFloor) {
      currentFloor--;
      System.out.println(currentFloor);
    }
    System.out.println("The elevator has arrived");
  }

  public static void main(String[] args) {
    new Elevator().run();
  }

}






