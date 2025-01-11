package com.gdl.GDL.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdl.GDL.Dao.AppointmentDao;
import com.gdl.GDL.Entity.Appointment;

@Service
public class AppointmentService {
	@Autowired
	AppointmentDao ad;

	public String bookappointment(Appointment a) {

		String msg = ad.bookappointment(a);

		return msg;

	}
}
