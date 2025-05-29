/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 29 de mai. de 2025
 */

package br.com.eaugusto.factorymethod;

public class CorollaCarFactory extends CarFactory {

	@Override
	public Car createCar() {
		return new CorollaCar();
	}
}
