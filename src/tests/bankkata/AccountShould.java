package tests.bankkata;

import main.bankkata.Account;
import main.bankkata.Console;
import main.bankkata.Transaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class AccountShould {

    ArgumentCaptor<List<Transaction>> captor = ArgumentCaptor.forClass(List.class);
    @Mock
    Console console;
    private Account account;

    @BeforeEach
    public void SetUp() {
        MockitoAnnotations.initMocks(this);
        account = new Account(console);
    }

    @Test
    public void print_statement() {

        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);

        account.printStatement();
        verify(console).print(captor.capture());
        assertEquals(3, captor.getValue().size());
    }
}
