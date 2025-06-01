/**
 * Represents a simplified Google Drive API.
 * 
 * Just like DropBox, this class simulates a third-party system.
 * Its methods are also incompatible with IHandleFiles, so you'd need another adapter to use it.
 * 
 * This class is not currently used in this example.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 31 de mai. de 2025
 */

package br.com.eaugusto.adapter;

public class GoogleDrive {

	/**
	 * Uploads a file to Google Drive.
	 * 
	 * @param data The file content as bytes.
	 * @param name The name to store the file as.
	 */
	void send(byte[] data, String name) {
		// Simulated Google Drive upload
	}

	/**
	 * Downloads a file by its name.
	 * 
	 * @param name The file name.
	 * @return Byte array with file data.
	 */
	byte[] get(String name) {
		return null; // Simulated download
	}
}
