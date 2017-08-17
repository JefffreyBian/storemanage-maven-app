package com.store.util;

import java.util.Date;

public  class staticvale {
public static String getTime() {
	long nDate=new Date().getTime();
	return String.valueOf(nDate);
}
public static String getuid() {
	long nDate=new Date().getTime();
	return String.valueOf(nDate);
}
public static String getmid() {
	long nDate=new Date().getTime();
	return "m"+String.valueOf(nDate);
}

public static String getmfrid() {
	long nDate=new Date().getTime();
	return "mf"+String.valueOf(nDate);
}

public static String getmfrcid() {
	long nDate=new Date().getTime();
	return "mfc"+String.valueOf(nDate);
}

public static String getcustid() {
	long nDate=new Date().getTime();
	return "c"+String.valueOf(nDate);
}
public static String getcustcid() {
	long nDate=new Date().getTime();
	return "cc"+String.valueOf(nDate);
}

public static String getsaleid() {
	long nDate=new Date().getTime();
	return "s"+String.valueOf(nDate);
}
public static String getpurchaseid() {
	long nDate=new Date().getTime();
	return "p"+String.valueOf(nDate);
}
}
