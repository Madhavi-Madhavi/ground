package com.example.bookyourslot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.bookyourslot.model.Dashboard;
import com.example.bookyourslot.repo.DashboardRepository;

@Component
public class GroundDataInitializer implements CommandLineRunner {

	@Autowired
	private DashboardRepository dashboardRepository;

	@Override
	public void run(String... args) {
		List<Dashboard> grounds = Arrays.asList(new Dashboard("Babukhan Arena (Kokapet)", "Kokapet"),
				new Dashboard("ElitesMRR cricket ground(Aziz Nagar)", "Aziz Nagar"),
				new Dashboard("K.B.R. cricket ground(Yenikepally)", "Yenikepally"),
				new Dashboard("MBR Grounds(Yenikepally)", "Yenikepally"),
				new Dashboard("Melgiri Cricket Ground(Yenikepally)", "Yenikepally"),
				new Dashboard("MLR Grounds(Suraram)", "Suraram"), 
				new Dashboard("MRE Grounds(Aziz Nagar)", "Aziz Nagar"),
				new Dashboard("test", "Aziz Nagar")

		);

		dashboardRepository.saveAll(grounds);
	}
}
