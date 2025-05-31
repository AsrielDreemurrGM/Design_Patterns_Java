/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 30 de mai. de 2025
 */

package br.com.eagusto.adapter;

import java.io.File;

public class Demo {

	public static void main(String[] args) {

		String file = "/insertAFilePathHere.format";

		DropBox dropbox = new DropBox();

		IHandleFiles files = new DropBoxAdapter(dropbox);

		files.recordFile(new File(file));
	}
}
