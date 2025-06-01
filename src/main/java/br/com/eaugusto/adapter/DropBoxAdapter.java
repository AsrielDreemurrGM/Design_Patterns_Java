/**
 * Adapter class that makes DropBox compatible with the IHandleFiles interface.
 * 
 * It allows DropBox to be used as if it were a native file handler.
 * This enables our code to depend on abstractions instead of implementations.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 31 de mai. de 2025
 */

package br.com.eaugusto.adapter;

import java.io.File;

public class DropBoxAdapter implements IHandleFiles {

	private DropBox dropBox;

	/**
	 * Constructor that receives a DropBox instance to adapt.
	 * 
	 * @param dropBox The DropBox object to adapt.
	 */
	public DropBoxAdapter(DropBox dropBox) {
		this.dropBox = dropBox;
	}

	/**
	 * Adapts the file saving behavior to DropBox's download logic (placeholder).
	 * 
	 * @param file The file to record.
	 */
	@Override
	public void recordFile(File file) {
		dropBox.upload(null);
	}

	/**
	 * Reads a file from DropBox using its path and returns a java.io.File.
	 * 
	 * @param path The file path to read.
	 * @return A File object representing the downloaded file.
	 */
	@Override
	public File read(String path) {
		DropBoxFile file = dropBox.download(path);
		return new File(file.getlocalPath());
	}
}
