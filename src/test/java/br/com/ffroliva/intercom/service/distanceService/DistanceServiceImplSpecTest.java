package br.com.ffroliva.intercom.service.distanceService;

import br.com.ffroliva.intercom.AppConfiguration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/br/com/ffroliva/intercom/service/distanceService.feature",
        plugin = {"pretty", "html:target/cucumber/distanceService"}
)
@ContextConfiguration(classes = AppConfiguration.class)
public class DistanceServiceImplSpecTest {
}
