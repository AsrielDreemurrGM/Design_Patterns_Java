/**
 * This interface defines standard file handling operations.
 * 
 * It allows different file storage systems (e.g., DropBox, Google Drive)
 * to be used in a unified way through the Adapter pattern.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 31 de mai. de 2025
 */

package br.com.eaugusto.adapter;

import java.io.File;

public interface IHandleFiles {

	/**
	 * Saves the given file to an external storage.
	 * 
	 * @param file The file to store.
	 */
	public void recordFile(File file);

	/**
	 * Reads and returns a file from an external storage by its path.
	 * 
	 * @param path The file path or ID.
	 * @return The corresponding java.io.File.
	 */
	public File read(String path);
}
