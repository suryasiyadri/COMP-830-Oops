import java.util.ArrayList;

class Worker {
	long workerId;
	
	public Worker(long workerId) {
		this.workerId = workerId;
	}
	public long getWorkerID() { 
		return workerId; 
	}
	public String  notify(WorkItem i) {
		if(i.getItemID().equals(Long.toString(workerId))) {
			String s = ("Employeer:" + workerId + " processed on Item" + i.getItemID() + " of message " + i.getmessage());
			int id = Integer.parseInt(i.itemId) + 1;
			i.setItemID(Integer.toString(id));
			System.out.println(s);
			return s;
		}
		else 
		return null;
	}
}

class WorkItem {
	String itemId;
	String message;
	long workerId;
	
	public WorkItem(String id,String msg) {
		this.itemId = id;
		this.message = msg;		
	}
	public void setItemID(String itemID) { 
		this.itemId = itemID;
	}
	public String getItemID() {
		return(itemId); 
	}
	public String getmessage() {
		return(message);
	}
	public long getworkerId() {
		return(workerId);
	}
}

class WorkManager {
	ArrayList<Worker> subscriber = new ArrayList<Worker>(4);
	
	public void subscribe(Worker worker) {
		subscriber.add(worker);
	}
	public void unsubscribe(Worker worker) {
		subscriber.remove(worker);
	}
	
	public void notify(WorkItem accum) {
		for(Worker worker: subscriber) {
			if(worker.getWorkerID()<=4) {
				String  result = worker.notify(accum);
				if(result != null){
				System.out.println(worker.getWorkerID() + ": Completed work on item " + accum.getItemID());
				}
			}
		}
		
	}

}


public class ObserverPattern {
	

	public static void main(String[] args) {
		
		WorkManager publisher = new WorkManager();
		Worker worker1 = new Worker(1);
		Worker worker2 = new Worker(2);
		Worker worker3 = new Worker(3);
		Worker worker4 = new Worker(4);
		
		publisher.subscribe(worker1);
		publisher.subscribe(worker2);
		publisher.subscribe(worker3);
		publisher.subscribe(worker4);
		
		WorkItem item1 = new WorkItem("1","run");
		publisher.notify(item1);
		WorkItem item2 = new WorkItem("3","sleep");
		publisher.notify(item2);
		WorkItem item3 = new WorkItem("5","code");
		publisher.notify(item3);
	}
}
