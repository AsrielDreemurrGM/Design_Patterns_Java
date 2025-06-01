/**
 * Represents a file in DropBox format.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 31 de mai. de 2025
 */

package br.com.eaugusto.adapter;

public class DropBoxFile {

	/**
	 * Creates a DropBoxFile from a given absolute file path.
	 * 
	 * @param absolutePath The local file path.
	 */
	public DropBoxFile(String absolutePath) {
	}

	/**
	 * Returns the local path of the DropBox file.
	 * 
	 * @return Local file system path.
	 */
	public String getlocalPath() {
		return "/tmp"; // Simulated local path
	}
}
