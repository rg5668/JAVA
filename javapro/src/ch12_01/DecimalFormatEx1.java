package ch12_01;

import java.text.DecimalFormat;
import java.text.ParseException;
/*
 * 1244.56 -> 1,244.56
 * Number num = df1.parse("1,234.56"); 문자 --> 숫자로
 * df1.format(d);	숫자--->editting 문자로
 */
public class DecimalFormatEx1 {
	public static void main(String[] args) {
		DecimalFormat df1 = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("000,000");
		
		try {
			Number num = df1.parse("1,234.56"); 
			double d = num.doubleValue();
			d+=10;
			System.out.println(d + "->" + df1.format(d));
			System.out.println(d + "->" + df2.format(d));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
