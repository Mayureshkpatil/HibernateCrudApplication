package org.techhub.entity;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class DAOAPP {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Player p1 = new Player();
		p1.setId(1);
		p1.setName("ABCD");
		p1.setSal(10000);
		session.save(p1);
		t.commit();
		session.close();
		System.out.println("Record Save Success..................");
	}

}
