package com.sapient.week5;

class MutexLock {
	public static boolean mutex = false;
}

class Tic extends Thread {

	public void run() {

		for (int i = 0; i < 10; i++) {

			while (MutexLock.mutex) {
			}

			System.out.print("Tic ");
			MutexLock.mutex = true;

		}

	}

}

class Toc extends Thread {

	public void run() {

		for (int i = 0; i < 10; i++) {
			while (!MutexLock.mutex) {
			}
			System.out.print("Toc\n");
			MutexLock.mutex = false;

		}

	}

}

public class TicToc {

	public static void main(String[] args) {

		Tic tic = new Tic();
		Toc toc = new Toc();
		tic.start();
		toc.start();

	}

}
