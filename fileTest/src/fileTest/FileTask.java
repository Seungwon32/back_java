package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileTask {
	public static void main (String[] args) throws IOException{
//		음식 4개 작성
//		음식 1개당 1줄씩 사용
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("foods.txt", true));
		String[] foods = {"리조또", "봉골레 파스타", "피자", "스테이크"};
		
//		 try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test1.txt", true))) {
//	            for (String food : foods) {
//	                bufferedWriter.write(food); 
//	                bufferedWriter.newLine();   
//	            }
//
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
		 
		Arrays.asList(foods).stream().forEach(food -> {
			try {
				bufferedWriter.write(food + "\n");
			} catch (IOException e) {
	            e.printStackTrace();
			}
		});
		System.out.println("텍스트파일생성");
		bufferedWriter.close();
		
//		음식을 모두 가져와서 콘솔에 출력
		BufferedReader bufferedReader = new BufferedReader(new FileReader("foods.txt"));
		String line = null;
		while((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		bufferedReader.close();
		
//		값 수정  	봉골레 -> 알리오올리오
		BufferedReader bufferedReader = new BufferedReader(new FileReader("foods.txt"));
		String line = null, temp = "";
		while((line = bufferedReader.readLine()) != null) {
			if(line.equals("봉골레 파시타")) {
				temp += "알리오올리오 파스타\n";
				continue;
			}
			temp += line + "\n";
		}
		bufferedReader.close();
		
		BufferedWriter(new FileWriter("foods_v2.txt", true));
	    bufferedWriter.write(temp);
	      
	    System.out.println("foods.txt 수정 했습니다.");
	    bufferedWriter.close();
	    
//	    "알리오올리오" 삭제
	    BufferedReader bufferedReader = new BufferedReader(new FileReader("foods_v2.txt"));
		String line = null;
		while((line = bufferedReader.readLine()) != null) {
			if(line.equals("알리오올리오 파스타")) {
				continue;
			}
			temp += line + "\n";
		}
		bufferedReader.close();

		BufferedWriter(new FileWriter("foods_v2.txt", false));
	    bufferedWriter.write(temp);
	      
	    System.out.println("수정 했습니다.");
	    bufferedWriter.close();
		
	}
}
