
public class Proceso extends Thread {
	
		  @Override
		  public void run(){
			for (int i = 0; i < 10 ; i++){
		      System.out.println("Proceso1");
		      try{
				Thread.sleep(500);
		      }catch(Exception ex){
		      }
		    }}
 public static void main(String[] args){
	 Proceso p = new Proceso();
	 p.run();
 }		  
}




