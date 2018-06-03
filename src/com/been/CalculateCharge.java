package com.been;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONObject;


public class CalculateCharge {
private static String FILENAME = "C:\\promotion1.log";
	public JSONArray process() {
		JSONArray jsonArrayObj = new JSONArray();
		DecimalFormat decimalFormat = new DecimalFormat("#.##");	
		String[] words= null;
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date date1,date2;
		float totalPrice = 0,priceMinute=0,priceSecound=0;
		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				words = sCurrentLine.split("[|]");
				try {
					date1 = format.parse(words[1]);
					date2 = format.parse(words[2]);
					long difference = date2.getTime() - date1.getTime();
					long diffMinutes = difference / (60 * 1000) % 60;
					long diffSeconds = difference / 1000 % 60;
					
					if(diffMinutes>1){
						priceMinute = ((diffMinutes-1)+3);
					}else if(diffMinutes==1) {
						priceMinute=3;
					}else {
						priceMinute=0;
					}
					priceSecound = (float)diffSeconds / (float)60;
					totalPrice = priceMinute+priceSecound;
					//System.out.println(priceMinute+"+"+priceSecound+"= "+decimalFormat.format(totalPrice));
					//System.out.println(words[1]+" "+words[2]+"   "+"      "+difference+"    "+diffMinutes+"   =    "+diffSeconds+" >>>"+totalSec);
					//System.out.println(words[1]+" "+words[2]+" "+words[3]+" Diff = "+diffMinutes+" Minutes"+">>>>>>>"+ totalPrice+" baht");
					JSONArray jsonArray = new JSONArray();
					jsonArray.put(words[3]);
					jsonArray.put(diffMinutes+" Minute, "+diffSeconds+" Secound");
					jsonArray.put(""+decimalFormat.format(totalPrice));
					jsonArrayObj.put(jsonArray);
					
				} catch (Exception e) {
					System.out.println(e);
				}
				
			}
			
			System.out.println(jsonArrayObj);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return jsonArrayObj;
	}
	
	
	public void exportJsonFile() {
		try (FileWriter file = new FileWriter("E:\\chargePhone.json")) {
			CalculateCharge C = new CalculateCharge();
			JSONArray obj = C.process();
			file.write(obj.toString());
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + obj);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}





