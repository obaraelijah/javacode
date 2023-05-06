
enum Status{
    Running, Failed, Pending, Success;
}

public class Main {

    public static void main(String[] args) {
        
        //Status[] s = Status.values();
        //System.out.println(s.ordinal());
        //for(Status ss : s) {
          //  System.out.println(ss + " : " + ss.ordinal());

          Status s = Status.Running;

          switch(s) 
          {
                case Running:
                    System.out.println("ALl Good");
                    break;
                
                case Failed:
                    System.out.println("Try Again");
                        break;
                
                case Pending:
                    System.out.println("Please wait");
                    break;
                
                default:
                    System.out.println("Done");
                    break;
                
          }
        }


    }

