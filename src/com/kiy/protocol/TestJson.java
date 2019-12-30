package com.kiy.protocol;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import com.google.gson.Gson;
import com.kiy.common.Weather;

public class TestJson {
	public static void main(String[] args) {
		try {
			URL u = new URL("http://api.k780.com/?app=weather.today&weaid=110&appkey=32106&sign=af54d39737870ec1d35de9edb1c4b2b0&format=json");
			InputStream in = u.openStream();
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			try {
				byte buf[] = new byte[1024];
				int read = 0;
				while ((read = in.read(buf)) > 0) {
					out.write(buf, 0, read);
				}
			} finally {
				if (in != null) {
					in.close();
				}
			}
			byte b[] = out.toByteArray();
			String string = new String(b, "utf-8");
			
			Gson gson = new Gson();
			
			Weather fromJson = gson.fromJson(string, Weather.class);
			
			System.err.println(fromJson.getResult().getAqi());
			System.err.println(fromJson.getResult().getCitynm());
			
			System.out.println(new String(b, "utf-8"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
