package br.com.ffroliva.intercom.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.ffroliva.intercom.model.DistanceUnitEnum;

@RunWith(SpringRunner.class)
public class DistanceServiceTest {
	
	@Autowired
	DistanceService distanceService;
	
    @TestConfiguration
    static class EmployeeServiceImplTestContextConfiguration {
  
        @Bean
        public DistanceService distanceService() {
            return new DistanceService();
        }
    }
	
	@Test
	public void calculateDistance(){
			System.out.println(distanceService.calculateDistance(32.9697, -96.80322, 29.46786, -98.53506, DistanceUnitEnum.MILES) + " Miles\n");
			System.out.println(distanceService.calculateDistance(32.9697, -96.80322, 29.46786, -98.53506, DistanceUnitEnum.KILOMETERS) + " Kilometers\n");
			System.out.println(distanceService.calculateDistance(32.9697, -96.80322, 29.46786, -98.53506, DistanceUnitEnum.NAUTICAL_MILES) + " Nautical Miles\n");
		
	}

}
