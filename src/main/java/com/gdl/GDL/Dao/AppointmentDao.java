package com.gdl.GDL.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gdl.GDL.Entity.Appointment;

@Repository
public class AppointmentDao {
	@Autowired
	private SessionFactory sf;

	public String bookappointment(Appointment a) {
		Session ss = null;
		Transaction tr = null;
		String msg = null;

		try {
			ss = sf.openSession();
			tr = ss.beginTransaction();
			ss.persist(a);
			msg = "Your appointment has been successfully booked.";
			tr.commit();

		} catch (Exception e) {

			if (tr != null) {
				tr.rollback();
			}
			e.printStackTrace();
		} finally {

			if (ss != null) {
				ss.close();
			}

		}
		return msg;

	}

}
