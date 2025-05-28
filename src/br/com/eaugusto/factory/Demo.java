/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 27 de mai. de 2025
 */

package br.com.eaugusto.factory;

public class Demo {

	public static void main(String[] args) {
		Customer client = new Customer("A", true);
		Factory factory = getFactory(client);

		Car car = factory.create(client.getGradeRequest());
		car.startEngine();
	}

	private static Factory getFactory(Customer client) {
		if (client.hasCompanyContract()) {
			return new WithContractFactory();
		} else {
			return new WithoutContractFactory();
		}
	}
}
