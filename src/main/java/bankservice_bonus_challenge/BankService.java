package bankservice_bonus_challenge;

import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*

Create a class 'BankService' that manages a set of accounts.

Implement a method in BankService to open an account.
It should only require a customer as an argument and should return the new account number.

Implement a method in BankService to transfer a specific amount (as BigDecimal) from
one account number (as String) to another account number (as String).
 */

public class BankService {
    private Set<Account> accountSet = new HashSet<>();

    public void openAccount(Client client){
        accountSet.add(new Account(generateRandomString(), client, new BigDecimal("0")));
    }

    public void transferMoneyAcountToAcount(BigDecimal bd, String sender, String receiver){
        //
    }

    public String generateRandomString() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

        System.out.println(generatedString);
        return generatedString;
    }
}

