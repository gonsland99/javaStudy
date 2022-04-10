package ch11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class PropertiesEx2 {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE");
			System.exit(0);
		}
		Properties p = new Properties();
		String input = args[0];
		
		try {
			p.load(new FileInputStream(input));
		}catch(IOException e) {
			System.out.println("지정된 파일 찾을수 없음!");
			System.exit(0);
		}
		
		String name = p.getProperty("name");
		String[] data = p.getProperty("data").split(",");
		int max = 0;
		int min = 0;
		int sum = 0;
		
		for(int i=0; i<data.length; i++) {
			int val = Integer.parseInt(data[i]);
			if(i==0) max=min=val;
			
			if(max < val)
				max = val;
			else if(min > val)
				min = val;
			
			sum+=val;
		}
		System.out.println(name);
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		System.out.println(sum*1.0/data.length);
	}
}
