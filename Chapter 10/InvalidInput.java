public class InvalidInput extends Exception{
    public InvalidInput(){
        super("What you have entered is invalid.");
    }
    public InvalidInput(int i){
        super("Month: " + i + " is invalid.");
    }
    public InvalidInput(String m){
        super("Month: " + m + " is not a valid month.");
    }
}
