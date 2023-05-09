public class Main {

        public static void main(String[] args) throws InterruptedException{

// all of these are static methods it seems
            System.out.println(Thread.activeCount()); // states the number of actively running threads
            Thread.currentThread().setName("MAIN"); // sets the name of a thread
            // currentThread is the main thread?
            System.out.println(Thread.currentThread().getName()); //geets the namf of a thread
            Thread.currentThread().setPriority(10); // priority on scale of 1-10
            System.out.println(Thread.currentThread().getPriority()); //retrieve priority
            System.out.println(Thread.currentThread().isAlive()); //checks if a thread is actively running

    	for(int i =3;i>0;i--) {
    		System.out.println(i);
    		Thread.sleep(1000); //this thread will run every 1000 milliseconds
            //static method called from Thread class
    	}
    	System.out.println("You are done!");


            MyThread thread2 = new MyThread(); // new MyThread object created extending from Thread class

            thread2.setDaemon(true); //Thread class method called and set thread2 to daemon type thread
            System.out.println(thread2.isDaemon()); //method for checeking daemon status of threead

            thread2.start(); // must use .start method not .run I think

            System.out.println(thread2.isAlive());

            thread2.setName("2nd thread");
            System.out.println(thread2.getName());

            thread2.setPriority(1);
            System.out.println(thread2.getPriority()); //retrieves priority

            System.out.println(Thread.activeCount());
        }
    }
//