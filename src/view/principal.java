package view;

import java.io.IOException;
import java.io.InvalidObjectException;

import controller.ArquivosController;
import controller.IArquivosController;

public class principal {

	public static void main(String[] args) {
		
		IArquivosController arqCont = new ArquivosController();
		String dirWin = "C:\\windows";
		String path = "C:\\TEMP\\kevin";
		String nome = "generic_food.csv";
		
		try {
//			arqCont.readDir(dirWin);
//			arqCont.createFile(path, nome);
			arqCont.readFeile(path, nome);
//			arqCont.openFile(path, nome);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
