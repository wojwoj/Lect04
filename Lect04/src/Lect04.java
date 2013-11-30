
public class Lect04 {

	/**
	 * @param args
	 */
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTask task1 = new MyTask(); 
		
		Thread test1 = new Thread(new Runnable() {
			public void run() {
				for(;;){
		    	System.out.println("jak sie masz");
		    	
		    	try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					break;
					
				}
		    	
				}
				
			}
		});
		
	   new Thread(task1).start();
		
		test1.start();
		
		
		try {
			Thread.sleep(10000);
			test1.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
