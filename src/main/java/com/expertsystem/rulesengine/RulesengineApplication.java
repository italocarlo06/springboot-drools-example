package com.expertsystem.rulesengine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.expertsystem.rulesengine.models.Participant;
import com.expertsystem.rulesengine.models.Rate;

import org.kie.api.runtime.KieSession;

@SpringBootApplication
public class RulesengineApplication implements CommandLineRunner {
	
	@Autowired
    private KieSession kieSession;

	public static void main(String[] args) {
		SpringApplication.run(RulesengineApplication.class, args);       

	}
	
    @Override
    public void run(String... args) {
    	 Rate rate = new Rate();
    	 /*Participant applicantRequest = new Participant();    	     	 
    	 applicantRequest.setName("User Test");
    	 applicantRequest.setAge(20);
    	 applicantRequest.setAnnualSalary(40000);
    	 applicantRequest.setCreditScore(550);
    	 applicantRequest.setExistingDebt(1000);
    	 applicantRequest.setLoanAmount(400);
    	  
    	 Participant applicantRequest2 = new Participant();    	     	 
    	 applicantRequest2.setName("User Test 2");
    	 applicantRequest2.setAge(20);
    	 applicantRequest2.setAnnualSalary(90000);
    	 applicantRequest2.setCreditScore(550);
    	 applicantRequest2.setExistingDebt(10000);
    	 applicantRequest2.setLoanAmount(400000);
    	 
    	 Participant applicantRequest3 = new Participant();    	     	 
    	 applicantRequest3.setName("User Test 3");
    	 applicantRequest3.setAge(20);
    	 applicantRequest3.setAnnualSalary(90000);
    	 applicantRequest3.setCreditScore(550);
    	 applicantRequest3.setExistingDebt(10000);
    	 applicantRequest3.setLoanAmount(4000);
    	 
    	  
    	 Participant applicantRequest4 = new Participant();    	     	 
    	 applicantRequest4.setName("User Test 4");
    	 applicantRequest4.setAge(20);
    	 applicantRequest4.setAnnualSalary(90000);
    	 applicantRequest4.setCreditScore(650);
    	 applicantRequest4.setExistingDebt(10000);
    	 applicantRequest4.setLoanAmount(4000);
    	 
    	  
    	 Participant applicantRequest5 = new Participant();    	     	 
    	 applicantRequest5.setName("User Test 5");
    	 applicantRequest5.setAge(20);
    	 applicantRequest5.setAnnualSalary(90000);
    	 applicantRequest5.setCreditScore(750);
    	 applicantRequest5.setExistingDebt(10000);
    	 applicantRequest5.setLoanAmount(4000);

		 */

		 Participant applicantRequest6 = new Participant();    	     	 
    	 applicantRequest6.setName("User Test 6");
    	 applicantRequest6.setAge(20);
    	 applicantRequest6.setAnnualSalary(90000);
    	 applicantRequest6.setCreditScore(450);
    	 applicantRequest6.setExistingDebt(10000);
    	 applicantRequest6.setLoanAmount(4000);
    	 
    	 kieSession.setGlobal("rate", rate);
    	 kieSession.insert(applicantRequest6);
    	          
        // Fire all rules
        kieSession.fireAllRules();

        // Dispose the session
        kieSession.dispose();

        // Check the result
        System.out.println("Status da Avaliação: " + rate.getLoanStatus()+ ' ' + rate.getLoanRate());
    }

}
