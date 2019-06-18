package test;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

import edu.sbme.oop.Patient;

public class PatientTest {
	/*
	@Before
    public void before() {
		Patient p= new Patient("Ahmed","Ali");
    }
    //why not this define p for other tests ??
	*/
	@Test
	public void sameFirstNameTest() {
		Patient p= new Patient("Ahmed","Ali");
		Assert.assertTrue(p.getfname().equals("Ahmed"));
	}
	
	@Test
	public void sameSecondNameTest() {
		Patient p= new Patient("Ahmed","Ali");
		Assert.assertTrue(p.getlname().equals("Ali"));
	}
	
	@Test
	public void FirstNameNullTest() {
		Patient p= new Patient(null,"Ali");
		Assert.assertTrue(p.getfname().equals(""));
	}
	
	@Test
	public void LastNameNullTest() {
		Patient p= new Patient("Ahmed",null);
		Assert.assertTrue(p.getlname().equals(""));
	}
	
	@Test
	public void GetNullSSNTest() {
		Patient p= new Patient("Ahmed","Ali");
		Assert.assertNull(p.getSSN());
	}
	
	@Test
	public void GetNullPhNumTest() {
		Patient p= new Patient("Ahmed","Ali");
		Assert.assertNull(p.getPhNum());
	}
	
	@Test
	public void GetAfterSetSSNTest() {
		Patient p= new Patient("Ahmed","Ali");
		p.setSSN("123");
		Assert.assertTrue(p.getSSN().equals("123"));
	}
	

	@Test
	public void GetAfterSetPhNumNTes() {
		Patient p= new Patient("Ahmed","Ali");
		p.setPhNum("123");
		Assert.assertTrue(p.getPhNum().equals("123"));
	}




}