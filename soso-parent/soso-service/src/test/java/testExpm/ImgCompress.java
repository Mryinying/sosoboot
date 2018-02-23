package testExpm;

import java.awt.Image;  
import java.awt.image.BufferedImage;  
import java.io.ByteArrayInputStream;  
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;  
  
import javax.imageio.IIOImage;  
import javax.imageio.ImageIO;  
import javax.imageio.ImageWriteParam;  
import javax.imageio.ImageWriter;
import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.FileImageOutputStream;  
/** 
 * 图片压缩处理 
 */

public class ImgCompress {

	/**
	 * 传入byte[],传出byte[]
	 * 
	 * @param imageByte
	 *            图片字节数组
	 * @param width
	 *            生成小图片宽度
	 * @param height
	 *            生成小图片高度
	 * @param gp
	 *            是否等比缩放
	 * @return
	 */
	public static byte[] compressPic(byte[] imageByte, int width, int height, boolean gp) {
		byte[] inByte = null;
		try {
			ByteArrayInputStream byteInput = new ByteArrayInputStream(imageByte);
			Image img = ImageIO.read(byteInput);
			// 判断图片格式是否正确
			if (img.getWidth(null) == -1) {
				return inByte;
			} else {
				int newWidth;
				int newHeight;
				// 判断是否是等比缩放
				if (gp == true) {
					// 为等比缩放计算输出的图片宽度及高度
					double rate1 = ((double) img.getWidth(null)) / (double) width + 0.1;
					double rate2 = ((double) img.getHeight(null)) / (double) height + 0.1;
					// 根据缩放比率大的进行缩放控制
					double rate = rate1 > rate2 ? rate1 : rate2;
					newWidth = (int) (((double) img.getWidth(null)) / rate);
					newHeight = (int) (((double) img.getHeight(null)) / rate);
				} else {
					newWidth = width; // 输出的图片宽度
					newHeight = height; // 输出的图片高度
				}
				BufferedImage tag = new BufferedImage((int) newWidth, (int) newHeight, BufferedImage.TYPE_INT_RGB);
				img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
				/*
				 * Image.SCALE_SMOOTH 的缩略算法 生成缩略图片的平滑度的 优先级比速度高 生成的图片质量比较好 但速度慢
				 */
				tag.getGraphics().drawImage(img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH), 0, 0, null);

				ImageWriter imgWrier;
				ImageWriteParam imgWriteParams;
				// 指定写图片的方式为 jpg
				imgWrier = ImageIO.getImageWritersByFormatName("jpg").next();
				imgWriteParams = new javax.imageio.plugins.jpeg.JPEGImageWriteParam(null);
				ByteArrayOutputStream out = new ByteArrayOutputStream(imageByte.length);
				imgWrier.reset();
				// 必须先指定 out值，才能调用write方法, ImageOutputStream可以通过任何 OutputStream构造
				imgWrier.setOutput(ImageIO.createImageOutputStream(out));
				// 调用write方法，就可以向输入流写图片
				imgWrier.write(null, new IIOImage(tag, null, null), imgWriteParams);
				out.flush();
				out.close();
				byteInput.close();
				inByte = out.toByteArray();

			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return inByte;
	}
	
	public static void main(String[] args) {

		String path = "D:/prt.JPG";
		
		byte[] image2byte = image2byte(path);
		
		byte[] compressPic = compressPic(image2byte, 320, 480, true);
		
		byte2image(compressPic, "D:/prt0.JPG");
			
	}
	
	
	
	//图片到byte数组
	  public static byte[] image2byte(String path){
	    byte[] data = null;
	    try {
	    	FileImageInputStream input = new FileImageInputStream(new File(path));
	      ByteArrayOutputStream output = new ByteArrayOutputStream();
	      byte[] buf = new byte[1024];
	      int numBytesRead = 0;
	      while ((numBytesRead = input.read(buf)) != -1) {
	      output.write(buf, 0, numBytesRead);
	      }
	      data = output.toByteArray();
	      output.close();
	      input.close();
	    }
	    catch (FileNotFoundException ex1) {
	      ex1.printStackTrace();
	    }
	    catch (IOException ex1) {
	      ex1.printStackTrace();
	    }
	    return data;
	  }
	  //byte数组到图片
	  public static void byte2image(byte[] data,String path){
	    if(data.length<3||path.equals("")) return;
	    try{
	    FileImageOutputStream imageOutput = new FileImageOutputStream(new File(path));
	    imageOutput.write(data, 0, data.length);
	    imageOutput.close();
	    System.out.println("Make Picture success,Please find image in " + path);
	    } catch(Exception ex) {
	      System.out.println("Exception: " + ex);
	      ex.printStackTrace();
	    }
	  }
}  