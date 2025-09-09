package chat01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	public static void main(String[] args) {
//		서버 소켓
		ServerSocket serversocket = null;
//		클라이언트 소켓
		Socket socket = null;
		
		BufferedReader reader = null;
		
		String message = null;
		try {
			serversocket = new ServerSocket(1100);
			System.out.println("서버가 시작되었습니다. 클라이언트를 기다리는 중");
			
			socket = serversocket.accept();
			System.out.println("클라이언트가 연결되었습니다.");
			
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			message = reader.readLine();
			System.out.println("클라이언트로부터 받은 메세지");
			System.out.println(message);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(serversocket != null) {
					serversocket.close();
				}
				if(socket != null) {
					socket.close();
				}
				if(reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} 		
	}
}
}