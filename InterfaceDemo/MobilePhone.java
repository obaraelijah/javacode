package InterfaceDemo;

public class MobilePhone implements Telephone{
    private String myNumber;
    private boolean isRinging;
    private boolean isPowerOn;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Phone powered on");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing" + phoneNumber + "on deskphone");
    }

    @Override
    public void answer() {
        if(isRinging && isPowerOn){
           System.out.println("Answering the desk phone");
           isRinging = false; 
        }else {
            
        }
    }

    @Override
    public boolean callPhone(String phoneNUmber) {
       if(phoneNUmber == myNumber && isPowerOn){
        isRinging = true;
        System.out.println("Phone is ringing");
       }else {
        System.out.println("Either wrong number entered or phon eis off");
        isRinging = false;
       }
       return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging; 
    }
}
