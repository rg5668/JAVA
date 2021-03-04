package ch17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServerEx1 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(1111);
			while (true) {
				System.out.println("Ŭ���̾�Ʈ ���� ���");
				Socket client = server.accept();
				System.out.println("������ ����");
				HttpThread ht = new HttpThread(client);
				ht.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static class HttpThread extends Thread {
		private Socket client;
		BufferedReader br;
		PrintWriter pw;
		
		HttpThread(Socket client) {
			this.client = client;
			try {
				br = new BufferedReader
						(new InputStreamReader(client.getInputStream()));
				pw = new PrintWriter(client.getOutputStream());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void run() {
			BufferedReader fbr = null;
			try {
				String pathname = "index.html";
				fbr = new BufferedReader(new FileReader(pathname));
				String fileLine = null;
				pw.println("HTTP/1.0 200 OK\r\nContent-Type: text/html\r\n\r\n");
				while ((fileLine = fbr.readLine()) != null) {
					pw.println(fileLine);
					pw.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (fbr != null) {
						fbr.close();
					}
					if (br != null) {
						br.close();
					}
					if (pw != null) {
						pw.close();
					}
					if (client != null) {
						client.close();
					}
				} catch (IOException e) {
					
				}
			}
		}
	}
}
