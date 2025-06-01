/**
 * This is a demonstration of the Adapter design pattern.
 * 
 * The Adapter pattern allows incompatible interfaces to work together.
 * In this example, we simulate adapting a DropBox API to a common file handler interface (IHandleFiles).
 * 
 * The DropBoxAdapter allows code to use DropBox services without depending on DropBox's native API.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 30 de mai. de 2025
 */

package br.com.eaugusto.adapter;

import java.io.File;

public class Demo {

	public static void main(String[] args) {

		String file = "/insertAFilePathHere.format";

		DropBox dropbox = new DropBox();

		IHandleFiles files = new DropBoxAdapter(dropbox);

		files.recordFile(new File(file));
	}
}
