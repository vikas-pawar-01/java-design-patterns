package test.com.designpattern;

import com.designpattern.solid.dip.*;
import com.designpattern.solid.isp.*;
import com.designpattern.solid.lsp.*;
import com.designpattern.solid.ocp.*;
import com.designpattern.patterns.creational.builder.*;
import com.designpattern.patterns.creational.abstractfactory.*;
import com.designpattern.patterns.structural.adapter.*;
import com.designpattern.patterns.structural.bridge.*;
import com.designpattern.patterns.structural.composite.*;

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

  @Test
  public void testBuilderPattern() {
    HouseBuilder builder = new ConcreteHouseBuilder();
    HouseDirector director = new HouseDirector(builder);
    House house = director.constructHouse();

    assertNotNull(house, "House should be constructed successfully.");
    assertEquals("Concrete Foundation", house.getFoundation(), "House foundation should match.");
    assertEquals("Wooden Structure", house.getStructure(), "House structure should match.");
    assertEquals("Shingle Roof", house.getRoof(), "House roof should match.");
  }

  @Test
  public void testAbstractFactoryPattern() {
    AbstractFactory<Shape> shapeFactory = (AbstractFactory<Shape>) FactoryProvider.getFactory("Shape");
    Shape circle = shapeFactory.create("Circle");
    assertNotNull(circle, "Circle should be created successfully.");
    assertDoesNotThrow(circle::draw, "Circle should be drawable.");

    AbstractFactory<Color> colorFactory = (AbstractFactory<Color>) FactoryProvider.getFactory("Color");
    Color red = colorFactory.create("Red");
    assertNotNull(red, "Red color should be created successfully.");
    assertDoesNotThrow(red::fill, "Red color should be fillable.");
  }

  @Test
  public void testAdapterPattern() {
    AudioPlayer audioPlayer = new AudioPlayer();

    assertDoesNotThrow(() -> audioPlayer.play("mp3", "song.mp3"), "MP3 file should play successfully.");
    assertDoesNotThrow(() -> audioPlayer.play("mp4", "video.mp4"), "MP4 file should play successfully.");
    assertDoesNotThrow(() -> audioPlayer.play("vlc", "movie.vlc"), "VLC file should play successfully.");
    assertDoesNotThrow(() -> audioPlayer.play("avi", "unsupported.avi"), "Unsupported format should not crash.");
  }

  @Test
  public void testBridgePattern() {
    Shape redCircle = new Circle(new Red());
    Shape blueRectangle = new Rectangle(new Blue());

    assertDoesNotThrow(redCircle::draw, "Red Circle should be drawable.");
    assertDoesNotThrow(blueRectangle::draw, "Blue Rectangle should be drawable.");
  }

  @Test
  public void testCompositePattern() {
    Employee dev1 = new Developer("Alice", "Frontend Developer");
    Employee dev2 = new Developer("Bob", "Backend Developer");
    Employee designer = new Designer("Charlie", "UI/UX Designer");

    Manager manager = new Manager("David", "Team Lead");
    manager.addEmployee(dev1);
    manager.addEmployee(dev2);
    manager.addEmployee(designer);

    Manager generalManager = new Manager("Eve", "General Manager");
    generalManager.addEmployee(manager);

    assertDoesNotThrow(generalManager::showDetails, "Organization structure should be displayable.");
  }
}