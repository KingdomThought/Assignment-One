import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<Vehicle> list = new LinkedList();
		list.add(new BMW(123, true));
		System.out.println("BMW object created of type Vehicle");
		list.add(new Toyota(456, true));
		System.out.println("Toyota object created of type Vehicle");
		list.add(new Suzuki(123, true));
		System.out.println("Suzuki object created of type Vehicle");
		
			new Thread(new Runnable() {
			    @Override
			    public void run() {
			        list.get(0).race();
			    }
			}).start();
			
			new Thread(new Runnable() {
			    @Override
			    public void run() {
			        list.get(1).race();
			    }
			}).start();
			
			new Thread(new Runnable() {
			    @Override
			    public void run() {
			        list.get(2).race();
			    }
			}).start();
	}

}
