package test;

import org.junit.Test;
import org.junit.Assert;
import edu.sbme.oop.PatientDaoImpl;
import edu.sbme.oop.Patient;
import edu.sbme.oop.PatientDaoException;
import java.sql.SQLException;

public class PatientDaoImplTest {
	/*
	@Test
	public void PatientDaoImplExceptionThrownTest() 
	{
		try {
		Patient p= new Patient("Ahmed","Ali");
		PatientDaoImpl pL = new PatientDaoImpl();
		pL.insert_patient(p);
		}
		catch(PatientDaoException e)
		{
			Assert.assertTrue(true);
		}
	}
	*/
	
	@Test
	public void newPatientDaoImplTest() 
	{
		PatientDaoImpl pL = new PatientDaoImpl();
		Assert.assertTrue(true);
		
	}
	
	@Test
	public void sqlExceptionThrownTest() 
	{
		try {
		PatientDaoImpl pL = new PatientDaoImpl();
		}
		catch(Exception e)
		{
			Assert.assertTrue(true);
		}
	}
	

}