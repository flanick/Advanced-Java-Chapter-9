public class PersonAndCustomerExample {
    public static void main(String[] args) {
        Customer cust = new Customer();

        cust.setCustomerNumber(1234);
        cust.setName("Jane Doe");
        cust.setAddress("5555 Test St, Smalltown, MD 21784");
        cust.setPhone("(410)555-1212");
        cust.setMailingList(true);

        System.out.println(cust);
    }
}
