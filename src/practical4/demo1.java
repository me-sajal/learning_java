package practical4;
import java.io.*;
import java.net.URL;
public class demo1 {
	public static void main(String[] args)throws Exception {
		try {
			String parseLine;
			URL URL= new URL("https://omni.ebl-zone.com/");
			BufferedReader br=new BufferedReader(new InputStreamReader(URL.openStream()));
			while ((parseLine=br.readLine())!=null) {
				System.out.println(parseLine);
			}
			br.close();
			}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
