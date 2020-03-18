package com.microServiceCvs.microServiceCvs;

public class CvNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CvNotFoundException(String message) {
        super(String.format(message));
        }

}
