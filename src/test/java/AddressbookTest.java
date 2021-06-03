import com.addressbook.Addressbook;
import com.addressbook.AddressbookMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class AddressbookTest {

    /**
     * this will check the contact is added or not.
     */
    @Test
    public void Given_variablesAre_present_should_return_true(){
        AddressbookMain contact=new AddressbookMain();
        Addressbook addressbook=new Addressbook("santosh","panda","bhubaneswar","Bhubaneswar","Odisha","751011","7978715564","santospanda111@gmail.com");
        Boolean result=contact.AddContact(addressbook);
        Assertions.assertTrue(result);
    }

    /**
     * this method will check the user inputs.
     */
    @Test
    public void Given_ConsoleInput_Is_Added_Should_return_value(){
        AddressbookMain contact=new AddressbookMain();
        String firstname = "santosh";
        InputStream in = new ByteArrayInputStream(firstname.getBytes());
        System.setIn(in);
        Assertions.assertEquals("santosh",contact.getInput());
        String lastname = "Panda";
        InputStream lastName = new ByteArrayInputStream(lastname.getBytes());
        System.setIn(lastName);
        Assertions.assertEquals("Panda",contact.getInput());
        String address = "Bhubaneswar";
        InputStream aDdress = new ByteArrayInputStream(address.getBytes());
        System.setIn(aDdress);
        Assertions.assertEquals("Bhubaneswar",contact.getInput());
        String city = "bbsr";
        InputStream cIty = new ByteArrayInputStream(city.getBytes());
        System.setIn(cIty);
        Assertions.assertEquals("bbsr",contact.getInput());
        String state = "odisha";
        InputStream sTate = new ByteArrayInputStream(state.getBytes());
        System.setIn(sTate);
        Assertions.assertEquals("odisha",contact.getInput());
        String zip = "751011";
        InputStream zIp = new ByteArrayInputStream(zip.getBytes());
        System.setIn(zIp);
        Assertions.assertEquals("751011",contact.getInput());
    }

    /**
     * this test case will check that the value is edited according to the user input.
     */
    @Test
    public void givenEditNameInAddressBookWhenNameReturnSameValue() {
        AddressbookMain addressBook = new AddressbookMain();
        Addressbook contacts = new Addressbook("Rohit", "Sharma", "Chakhan", "maharashtra", "pune", "123456", "1234567899", "abc@gmail.com");
        addressBook.addContacts(contacts);
        Addressbook editContact = addressBook.editContacts(addressBook.contactList, "address","editContacts");
        Assertions.assertEquals("Chakhan", editContact.address);
    }
}
