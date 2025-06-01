/**
 * This interface defines a contract for message sending services.
 * 
 * It allows multiple implementations like EmailService and SMSService.
 * Classes that depend on IMessageService don’t need to know which implementation is used,
 * they just use the interface.
 * 
 * This is a key benefit of Dependency Injection: decoupling implementation from usage.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 31 de mai. de 2025
 */

package br.com.eaugusto.dependencyinjection;

public interface IMessageService {
	void sendMessage(String message, String recipient);
}
