/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 31 de mai. de 2025
 */

package br.com.eaugusto.adapter;

import java.io.File;

public class DropBoxAdapter implements IHandleFiles {

	private DropBox dropBox;

	public DropBoxAdapter(DropBox dropBox) {
		this.dropBox = dropBox;
	}

	@Override
	public void recordFile(File file) {
		dropBox.download(file.getAbsolutePath());
	}

	@Override
	public File read(String path) {
		DropBoxFile file = dropBox.download(path);
		return new File(file.getlocalPath());
	}
}
