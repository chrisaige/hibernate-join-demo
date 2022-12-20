package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private ReporsitoryA repositoryA;
	@Autowired
	private ReporsitoryB repositoryB;

	@Test
	void contextLoads() {
		InvoicingAccountingVehicle vehicle = new InvoicingAccountingVehicle();
		vehicle.setVehicleId(1L);
		vehicle.setField1("V");
		vehicle.setField2("2020");
		repositoryA.saveAndFlush(vehicle);
		VehicleInvoice invoice = new VehicleInvoice();
		invoice.setId(new VehicleInvoiceId("V".toCharArray(), "2020".toCharArray(), 1));
		repositoryB.saveAndFlush(invoice);
		var res = repositoryB.findAll();
	}

}
