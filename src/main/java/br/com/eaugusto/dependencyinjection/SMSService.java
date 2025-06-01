/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 31 de mai. de 2025
 */

package br.com.eaugusto.dependencyinjection;

//import org.springframework.stereotype.Service;

//@Service
public class SMSService implements IMessageService {

	@Override
	public void sendMessage(String message, String recipient) {
		System.out.println("Sending SMS to " + recipient + ": " + message);
	}
}
