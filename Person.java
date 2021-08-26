public class Person
{
    //variables for name, address, phone
    private String name;
    private String address;
    private String phone;

    //default constructor for person class
    public Person(){
    }

    //2nd constructor to hold name, address and phone
    public Person(String n, String a, String p){
        name = n;
        address = a;
        phone = p;
    }

    //Setters
    public void setName(String n){
        name = n;
    }
    public void setAddress(String a){
        address = a;
    }
    public void setPhone(String p){
        phone = p;
    }

    //Getters
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhone(){
        return phone;
    }
}
