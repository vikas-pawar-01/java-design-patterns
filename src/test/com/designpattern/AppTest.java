package test.com.designpattern;

import com.designpattern.solid.dip.*;
import com.designpattern.solid.isp.*;
import com.designpattern.solid.lsp.*;
import com.designpattern.solid.ocp.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class AppTest {

  @Test
  public void testOpenClosedPrinciple() {
    Shape circle = new Circle(5);
    Shape rectangle = new Rectangle(4, 6);
    ShapeCalculator calculator = new ShapeCalculator();

    double totalArea = calculator.calculateTotalArea(Arrays.asList(circle, rectangle));
    assertEquals(103.53981633974483, totalArea, 0.0001, "Total area should match the expected value.");
  }

  @Test
  public void testLiskovSubstitutionPrinciple() {
    Bird sparrow = new Sparrow();
    assertDoesNotThrow(sparrow::fly, "Sparrow should be able to fly.");

    Bird penguin = new Penguin();
    assertThrows(UnsupportedOperationException.class, penguin::fly, "Penguin cannot fly.");
  }

  @Test
  public void testInterfaceSegregationPrinciple() {
    Worker humanWorker = new HumanWorker();
    assertDoesNotThrow(humanWorker::work, "HumanWorker should be able to work.");

    RobotWorker robotWorker = new RobotWorker();
    assertDoesNotThrow(robotWorker::work, "RobotWorker should be able to work.");
  }

  @Test
  public void testDependencyInversionPrinciple() {
    NotificationService emailService = new EmailNotificationService();
    NotificationManager manager = new NotificationManager(emailService);

    assertDoesNotThrow(() -> manager.notify("Test message"),
        "NotificationManager should send notifications without errors.");
  }
}