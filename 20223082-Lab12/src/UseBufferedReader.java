import java.io.*;
import java.util.StringTokenizer;
public class UseBufferedReader {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		boolean read = true;
		try {
			while (read) {
				String line = in.readLine();
				if (line.equals("quit")) {
					break;
				}
				StringTokenizer st = new StringTokenizer(line);
				System.out.println(st.countTokens()+" words in this line.");
				while(st.hasMoreTokens()) {
					System.out.println(st.nextToken());
				}
				
			}
		}
		catch (IOException ex) {
			System.out.println(ex);
		}
	}
}