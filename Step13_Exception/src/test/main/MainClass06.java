package test.main;

import tset.mypac.MyUtil;

public class MainClass06 {
	public static void main(String[] args) {
		
		try {
			MyUtil.send();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		MyUtil.draw();
	}
}
