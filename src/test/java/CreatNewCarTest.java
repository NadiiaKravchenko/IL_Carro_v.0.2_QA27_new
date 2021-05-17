import models.Car;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreatNewCarTest extends TestBase {
    @BeforeMethod
    public void precondition() {
            if (!app.user().isLogged()) {
                app.user().loggin();
            }

    }

    @Test
    public void createNewCar() {
        Car car = new Car().withLocation("Tel-Aviv")
                .withMake("Subaru")
                .withModel("Forester")
                .withYear("2017")
                .withEngine("2000")
                .withFuel("Petrol")
                .withGear("AT")
                .withWd("RWD")
                .withDoors("5")
                .withSeats("5")
                .withCarClass("Luxury")
                .withFuelConsumption("10")
                .withCarRegNum("8511432")
                .withPrice("350")
                .withDistanceIncluded("500");



        app.car().opencarCreationForm();
        app.car().fillCarForm(car);
        app.car().attachFoto("C:\\Nadiia\\IT\\QA_Automation_Lessons\\GitHub_QA27\\IL_Carro_v.0.2_QA27_new\\Subaru.jpg");
        app.car().pause(2000);
        app.car().saveNewCar();




    }

    @AfterMethod
    public void postcondition() {

    }
}
