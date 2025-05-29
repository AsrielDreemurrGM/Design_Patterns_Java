/**
 * Represents the client requesting a car.
 * Holds information about the requested grade and whether a company contract exists.
 * This information guides the selection of the appropriate car factory.
 * 
 * @see Factory
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 27 de mai. de 2025
 */

package br.com.eaugusto.abstractfactory;

public class Customer {

	private String gradeRequest;
	private boolean hasCompanyContract;

	public Customer(String gradeRequest, boolean hasCompanyContract) {
		this.gradeRequest = gradeRequest;
		this.hasCompanyContract = hasCompanyContract;
	}

	public boolean hasCompanyContract() {
		return hasCompanyContract;
	}

	public String getGradeRequest() {
		return gradeRequest;
	}
}
