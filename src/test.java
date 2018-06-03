import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {

	private static String FILENAME = "C:\\promotion1.log";
	public static void main(String[] args) {
		
//		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
//
//			String sCurrentLine;
//			String[] output = null;
//			while ((sCurrentLine = br.readLine()) != null) {
//				
//				String[] words=sCurrentLine.split("[|]");
//				
//				SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
//				Date date1,date2;
//				try {
//					date1 = format.parse(words[1]);
//					date2 = format.parse(words[2]);
//					long difference = date2.getTime() - date1.getTime();
//					long diffMinutes = difference / (60 * 1000) % 60;
//					
//					long totalPrice = 0;
//					if(diffMinutes>1){
//						totalPrice = (diffMinutes-1)+3;
//					}else if(diffMinutes==1) {
//						totalPrice=3;
//					}else {
//						totalPrice=0;
//					}
//					System.out.println(words[1]+" "+words[2]+" "+words[3]+" Diff = "+diffMinutes+" Minutes"+">>>>>>>"+ totalPrice+" baht");
//					
//				} catch (Exception e) {
//					System.out.println(e);
//				}
//				
//			}
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		
		float result = 0;
		float a =31;
		float b =60;
		
		System.out.println(a/b);
		
		
		
		
		
		
		
	}

	
	
	
	
}
