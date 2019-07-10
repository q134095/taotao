
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.lang.model.type.DeclaredType;

public class Demo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		/*SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date pendingDate = sdf.parse("01/02/2018");*/
/*		Calendar calendar = Calendar.getInstance();
		calendar.setTime(pendingDate);
		calendar.add(Calendar.DAY_OF_YEAR, 0);*/
	
		//String dateNow = sdf.format(new Date());
		//Date currentTime = sdf.parse(dateNow);
		//int i = 0;
		//if (calendar.getTime().before(currentTime)) {
			//i=1;
		//}
/*		try {
			ArrayList<String> arrayList = new ArrayList<>();
			arrayList.add("111");
			arrayList.get(0);
			try {
				arrayList.get(1);
			} catch (Exception e) {
				System.out.println("aaa");
			}
			System.out.println("asdsad");
			arrayList.get(1);
		} catch (Exception e) {
			System.out.println("bbb"+e);
		}*/
	/*	String dateNow = sdf.format(new Date());
		Date currentTime = sdf.parse(dateNow);*/
		
	/*	ArrayList<String> arrayList = new ArrayList<>();
		ArrayList<String> arrayList1 = new ArrayList<>();
		ArrayList<String> arrayList2 = new ArrayList<>();
		arrayList1.add("12");
		arrayList2.add("3");
		arrayList = arrayList1;
		//arrayList = arrayList2;
		arrayList.addAll(arrayList2);*/
	/*	System.out.println("aaa  "+pendingDate);
		System.out.println("bbb  "+calendar.getTime());
		System.out.println("ccc  "+currentTime);
		System.out.println("qqq  "+new Date());
		System.out.println("ddd  "+sdf.format(calendar.getTime()));
		System.out.println("ddd  "+calendar.getTime());
		System.out.println("size  "+arrayList.size());
		System.out.println("vvv  "+arrayList.get(0) +"qqq " +arrayList.get(1) );*/
	/*	System.out.println("aaa  "+pendingDate.getTime());*/
		//1548950400000  19
		//1580486400000  20
		//1580486400000 2020
		//1517414400000   18
		
		Date now = new Date();
		String ltrDate = "07/01/2019";
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(simpleDateFormat.parse(ltrDate));
		calendar.add(calendar.MONDAY, 7);
		Date aaa = calendar.getTime();
		
		//20190503 start
		SimpleDateFormat simpleDateFormat2=new SimpleDateFormat("dd/MM/yyyy");
		Date pDate = simpleDateFormat2.parse("03/05/2019");
		Calendar PDate = Calendar.getInstance();
		PDate.setTime(pDate);
		PDate.add(Calendar.DAY_OF_YEAR, 5);
		
		//20190503 end
		
		
		if (now.getTime()<aaa.getTime()) {
			System.out.println("aaa  "+now.getTime()+"bbb "+aaa.getTime()+"ccc ");
			System.out.println("20190503  "+ PDate.getTime().toString());
		}
		
	}

}
