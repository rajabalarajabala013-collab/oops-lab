class Railway{
  int seats=1;
    
  synchronized void book(){
    try{
      if(seats==0){
         System.out.println("NO seats,Booking thread waiting...");
         wait();
      }
      seats--;
      System.out.println("Ticket booked.");
      System.out.println("Available seats:"+seats);
    }catch(Exception e){}
}
  synchronized void cancel(){
      seats++;
      System.out.println("Ticket cancelled.");
      System.out.println("Available seats:"+seats);
      notify();
    } 
}

class Booking extends Thread{
    Railway r;
    Booking(Railway r) { this.r=r;}
    public void run() { r.book();}
}

class Cancellation extends Thread{
   Railway r;
   Cancellation(Railway r) { this.r = r;}
   public void run() {
     try{ Thread.sleep(1000);} catch(Exception e) {}
     r.cancel();
   }
}
public class RailwayBooking{
  public static void main(String[] args) throws Exception{
     Railway r=new Railway();
         
     Booking b1=new Booking(r);
     b1.start();
     b1.join();
         
     Booking b2=new Booking(r);
     b2.start();
         
     Cancellation c=new Cancellation(r);
     c.start();
         }
}
           

