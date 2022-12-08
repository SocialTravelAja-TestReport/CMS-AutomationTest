package id.travelaja.StepDefs;

import id.travelaja.Model.EnvironmentVariable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static id.travelaja.Model.EnvironmentVariable.*;
import static net.serenitybdd.core.Serenity.getDriver;

public class ParameterDefinitions {

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    @Before
    public void maxWindows() {
        getDriver().manage().window().maximize();;
    }

    @After
    public void afterSearchStep(){
        getDriver().quit();
    }
}
