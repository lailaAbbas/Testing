package edu.sbme.oop;


public class PatientDaoException extends Exception {
	PatientDaoException(Throwable e) {
		super("Patient Dao Exception", e);
	}

}