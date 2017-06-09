import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentInsert {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Student stud = new Student();
		stud.setSno(111);
		stud.setSname("Raj");
		stud.setMarks(500.0);
		s.save(stud);
		tx.commit();
		s.close();
	}

}
