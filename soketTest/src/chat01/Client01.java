package chat01;

import java.io.IOException;import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client01 {
	public static void main(String[] args) {
//		포트번호 1100
//		192.168.161.27
		
		Socket socket = null;
		PrintWriter writer = null;
		
		String serverIp = "192.168.161.27";
		String message = null;
		try {
			socket = new Socket(serverIp, 1100);
			System.out.println("서버에 연결 되었습니다.");
			writer = new PrintWriter(socket.getOutputStream(), true);
			message = "아러ㅏ나ㅣㅓㄹ아ㅣㅓ라ㅣㅓㅇㄹㄴㅇ미ㅏㅓ";
			writer.println(message);
			System.out.println("서버로["+message+"]를 전송했습니다.");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(writer != null) {
					writer.close();
				}
				if(socket != null) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}