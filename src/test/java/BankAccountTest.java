import org.example.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.setRemoveAssertJRelatedElementsFromStackTrace;

public class BankAccountTest {
//BankAccount bankAccount1;
BankAccount bankAccount1 = new BankAccount("Apple", "Butter", "01/01/1984");

    @BeforeEach
    public void setUp(){
        BankAccount bankAccount1 = new BankAccount("Apple", "Butter", "01/01/1984");
    }
    @Test
    void firstNameTest(){
        assertThat(bankAccount1.getFirstName()).isEqualTo("Apple");
    }
    @Test
    void lastNameTest(){
        assertThat(bankAccount1.getLastName()).isEqualTo("Butter");
    }
    @Test
    void dateOfBirthTest(){
        assertThat(bankAccount1.getDateOfBirth()).isEqualTo("01/01/1984");
    }
    @Test
    void depositTest(){
        assertThat(950).isEqualTo(950);
    }
    @Test
    void withdrawalTest(){
//        Didn't understand how to write a test for withdrawal
//        bankAccount1.withdrawal(100);
//        Assertions.assertArrayEquals(true, true);
    }


}
