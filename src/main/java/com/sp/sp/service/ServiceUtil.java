package com.sp.sp.service;

public class ServiceUtil {
	public static String getActivationCode()
	{		
		StringBuffer activationCode = new StringBuffer();
		String alphaNymericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
		                             "0123456789" +
				                      "abcdefghijklmnopqrstuvwxyz" ;
		int index;
		for(int i = 0; i < 40; i ++)
		{
			index = (int) (alphaNymericString.length() * Math.random());
		    activationCode.append(alphaNymericString.charAt(index));
		}
		return activationCode.toString() ;
	}

}
