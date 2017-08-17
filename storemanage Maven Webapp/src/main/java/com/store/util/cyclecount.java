package com.store.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import com.store.model.compiledata;

public class cyclecount {
	public static Map<String, Object> countcyle(String starttime,String endtime,String cycle,List<compiledata> compiledatas){
		int leth;
		int STcyle;
		int EDcyle;
		Map<String,Object> map = null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c= Calendar.getInstance(); ;
		Calendar c2=Calendar.getInstance(); ;
		try {
			c.setTime(formatter.parse(starttime));
			c2.setTime(formatter.parse(endtime));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(cycle.equals("month")){
			STcyle=c.get(Calendar.MONTH)+1;
			EDcyle=c2.get(Calendar.MONTH)+1;
			leth=EDcyle-STcyle+1;			 
		}else if (cycle.equals("week")) {
			STcyle=c.get(Calendar.WEEK_OF_YEAR);
			EDcyle=c2.get(Calendar.WEEK_OF_YEAR);
			leth=EDcyle-STcyle+1;
		}else {
			STcyle=c.get(Calendar.DAY_OF_YEAR);
			EDcyle=c2.get(Calendar.DAY_OF_YEAR);
			leth=EDcyle-STcyle+1;
		}
		List<String> xlist=new ArrayList<String>();
		List<String> prices=new ArrayList<String>();
		List<String> quts=new ArrayList<String>();
		for (int i = 0; i <leth; i++) {
			prices.add("");
			quts.add("");
			if(cycle.equals("dayofyear")){
			xlist.add(formatter2.format(c.getTimeInMillis()+(long)i*3600*24*1000));
			}else {
			xlist.add(String.valueOf(STcyle+i)+cycle);	
			}				
		}
		for (compiledata o:compiledatas) {
			int i=Integer.valueOf(o.getTime())-STcyle;
			prices.set(i, o.getPrice());
			quts.set(i, String.valueOf(o.getQut()));
		}
		map.put("prices", prices);
		map.put("quts", quts);
		map.put("x", xlist);
		return map;
		
}
	}
