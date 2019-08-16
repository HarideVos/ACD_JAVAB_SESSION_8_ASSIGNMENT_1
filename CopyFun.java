package eightpointone;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFun {

	public static void main(String args[]) throws IOException {
		Copy();
	}
	private static void Copy() throws IOException
	{
	    Path source = Paths.get("c:/data/Original.txt");
	    Path destination = Paths.get("c:/data/Copy.txt");
	 
	    Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
	}
}
