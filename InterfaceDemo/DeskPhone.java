package InterfaceDemo;

public class DeskPhone implements Telephone{

    private String myNumber;
    private boolean isRinging;

    public DeskPhone(String myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        
    }

    @Override
    public void dial(String phoneNUmber) {
        
    }

    @Override
    public void answer() {
        
    }

    @Override
    public boolean callPhone() {
       return false; 
    }

    @Override
    public boolean isRinging() {
        return false; 
    }
    
}
