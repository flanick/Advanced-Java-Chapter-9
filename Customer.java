public class Customer extends Person {
    private int customerNumber;
    private boolean mailingList;

    //default constructor
    public Customer(){
    }

    //constructor holding customer number and if they want on a mailing list
    public Customer(int num, boolean mail){
        customerNumber = num;
        mailingList = mail;
    }

    //setters
    public void setCustomerNumber(int num){
        customerNumber = num;
    }
    public void setMailingList(boolean mail){
        mailingList = mail;
    }

    //getters
    public String getMailingList(){
        String str;

        //if loop to determine if customer wants to be on the mailing list and returns the response
        if(mailingList==true)
            str = "yes";
        else
            str = "no";
        return str;
    }

    //To string method
    public String toString(){
        String str;
        str = "Name: " + getName()
                + "\nAddress: "+getAddress()
                + "\nPhone: "+getPhone()
                + "\nCustomer Number: "+customerNumber
                + "\nMailing list: "+getMailingList();
        return str;
    }
}
