package oops.ex4;

class MovieBooking {
    int n;

    public MovieBooking (int n) {
        this.n = n;
    }

    synchronized void ticketBook() {
        if (this.n < 1) {
            System.out.println("Sorry no tickets available!");
        }
        else {
            System.out.println("Available tickets: " + n);
            System.out.println("Booking Ticket");
            try {
                n--;
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Thread is interrupted.");
            }
            System.out.println("Ticket booking successful.");
        }

    }
}

class CheckMovie implements Runnable {
    private MovieBooking mb;

    public CheckMovie(MovieBooking mb) {
        this.mb = mb;
    }
    public void run() {
        mb.ticketBook();
    }

}

class Test2 {
    public static void main(String[] args) {
        MovieBooking mb = new MovieBooking(5);
        Thread thread1 = new Thread(new CheckMovie(mb), "Thread - 1");
        Thread thread2 = new Thread(new CheckMovie(mb), "Thread - 2");
        Thread thread3 = new Thread(new CheckMovie(mb), "Thread - 3");
        Thread thread4 = new Thread(new CheckMovie(mb), "Thread - 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
