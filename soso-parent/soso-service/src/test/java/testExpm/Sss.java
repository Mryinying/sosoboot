package testExpm;

import java.io.File;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.Random;

import javax.imageio.stream.FileImageInputStream;

public class Sss {
	
	public static void main(String[] args) {
//		Random random = new Random();
//		int nextInt = random.nextInt(9)+1;
//		int n = (((9*3)+3)*3);
//		int a = n/10 + n%10;
//		System.out.println(a);
		
		File file = new File("D:/prt.JPG");
		try {
			FileImageInputStream fileImageInputStream = new FileImageInputStream(file);
			ByteOrder byteOrder = fileImageInputStream.getByteOrder();
			fileImageInputStream.close();
			System.out.println(byteOrder);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
