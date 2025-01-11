package com.gdl.GDL.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gdl.GDL.Entity.Appointment;
import com.gdl.GDL.Service.AppointmentService;

@RestController
public class AppointmentController {

	@Autowired
	AppointmentService as;

	@PostMapping("/Book Appointment")
	public String bookappointment(@RequestBody Appointment a) {
		String msg = as.bookappointment(a);
		return msg;
	}

}
