/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 31 de mai. de 2025
 */

package br.com.eaugusto.dependencyinjection;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService {

	@Override
	public void sendMessage(String message, String recipient) {
		System.out.println("Sending E-MAIL to " + recipient + ": " + message);
	}
}
