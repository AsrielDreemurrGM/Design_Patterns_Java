/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 31 de mai. de 2025
 */

package br.com.eagusto.adapter;

import java.io.File;

public interface IHandleFiles {

	public void recordFile(File file);

	public File read(String path);
}
