package exam;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class egstreamreaderwriter {
public static void main(String[] args) throws IOException {
FileInputStream in=new FileInputStream("C:/Users/sajal/eclipse-workspace/practical1/src/exam/sajal.txt");
FileOutputStream out=new FileOutputStream("C:/Users/sajal/eclipse-workspace/practical1/src/exam/abc.txt");
int c;
while((c=in.read())==-1) {
	out.write(c);
	System.out.print((char)c);
}


out.close();
in.close();
}
}
