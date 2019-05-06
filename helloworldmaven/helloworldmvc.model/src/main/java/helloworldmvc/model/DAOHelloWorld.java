package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import helloworldmvc.Contract.IModel;

public class DAOHelloWorld {
public void DAOHelloWorld () throws IOException
{
	BufferedReader br = new BufferedReader(new FileReader("C://Users//nabila//git//helloworldmvc//helloworldmaven//HelloWorld.txt"));
	String machaine;
	while ((machaine = br.readLine()) != null) {
	   // process the line.
	}
	br.close();
}
}
