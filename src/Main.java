public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Erste Bank");
        bank.addBranch("Vienna");


        bank.addCustomer("Vienna","pouyan", 100.10);
        bank.addCustomer("Vienna", "Mary",150.00 );
        bank.addCustomer("Vienna", "Iman",200.30);


        bank.addBranch("Salzburg");
        bank.addCustomer("Salzburg","Keyvan",234.23);

       bank.addCustomerTransaction("Vienna ", "Pouyan" , 400.43);
        bank.addCustomerTransaction("Vienna ", "Mary" , 123.43);
        bank.addCustomerTransaction("Vienna ", "Iman" , 412.12);



        bank.listCustomers("Vienna",false );
        bank.listCustomers("Vienna",true );
        bank.listCustomers("Salzburg",true);





    }
}
