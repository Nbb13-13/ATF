package hooks;

import Util.Singleton;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

import stepDefinition.AbstractStepDef;

public class Hooks extends AbstractStepDef {
    @Before("@UI")
        public void beforeUITest() {
            driver = Singleton.getDriver();
        }
//        @After("@UI")
//        public void afterUITest () {
//            Singleton.closeDriver();
//        }

//        @AfterStep("@UI")
//        public void takeScreenShort (Scenario scenario){
//            log.info("take a screenshort before steps");
//            tekeScreenshort(scenario, driver);
//        }
//    }
    }
