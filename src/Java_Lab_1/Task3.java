package Java_Lab_1;

import java.util.Arrays;

public class Task3 {
    private String email;

    //private boolean isValid;

    public Task3(final String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public static boolean isValid(final String email) {
        /*final String recipient = email.substring(0, email.indexOf("@"));
        final String afterRecipient = email.substring(email.indexOf("@") + 1);
        final String domain = afterRecipient.substring(0, afterRecipient.lastIndexOf("."));
        final String topLevelDomain = afterRecipient.substring(afterRecipient.lastIndexOf(".") + 1);

        final String allowedSymbols = "!#$%&'*+-/=?^_`{|}~";
        final String forbiddenSymbols = "(),:;<>[\\]\" "; //space is also forbidden

        final boolean validRecipientLength = recipient.length() >= 1 && recipient.length() <= 64;
        //final boolean validAfterRecipientLength = afterRecipient.length() >= 1 && afterRecipient.length() <= 255;
        final boolean validDomainLength = domain.length() >= 1 && domain.length() <= 63;
        final boolean validTopLevelDomainLength = topLevelDomain.length() >= 1 && topLevelDomain.length() <= 63;
        //-----------------------------------------------
        for (int i = 0; i < email.length() - 1; i++) {
            for (int j = 0; j < allowedSymbols.length(); j++) {
                if (email.charAt(i) == email.charAt(i + 1) && email.charAt(i) == allowedSymbols.charAt(j)) {
                    return false;
                }
            }
        }

        boolean validEnds = true;

        for (int i = 0; i < recipient.length(); i++) {
            for (int j = 0; j < allowedSymbols.length(); j++) {
                if (recipient.charAt(0) == allowedSymbols.charAt(j) ||
                        recipient.charAt(recipient.length() - 1) == allowedSymbols.charAt(j) ||
                        afterRecipient.charAt(0) == allowedSymbols.charAt(j) ||
                        afterRecipient.charAt(afterRecipient.length() - 1) == allowedSymbols.charAt(j)) {
                    validEnds = false;
                }
            }
        }

        final boolean validAllLength = validRecipientLength && validDomainLength && validTopLevelDomainLength;
        final boolean validEmailSymbols = !email.contains(forbiddenSymbols) && validEnds;


        if (!validAllLength && !validEmailSymbols ||
                afterRecipient.isEmpty() ||
                recipient.isEmpty() ||
                !afterRecipient.contains(".")) {
            return false;
        } else {
            return true;
        }
    }*/

        if (email.isEmpty()) {
            return false;
        }

        int indexOfAt = email.indexOf('@');
        int indexOfDot = email.indexOf('.');
        int indexOfSpace = email.indexOf(' ');
        final String specialAllowedSymbols = "!#$%&'*+-/=?^_`{|}~";
        final String forbiddenSymbols = "(),:;<>[\\]\" "; //space is also forbidden

        if (!email.contains("@") || !email.contains(".") || email.contains(forbiddenSymbols) || email.contains(" ")
        || email.lastIndexOf(".") == email.length() - 1) {
            return false;
        }
        for (int i = 0; i < email.length() - 1; i++) {
            for (int j = 0; j < specialAllowedSymbols.length(); j++) {
                if (email.charAt(i) == email.charAt(i + 1)
                        && email.charAt(i) == specialAllowedSymbols.charAt(j)) {
                    return false;
                }
                if (email.charAt(0) == specialAllowedSymbols.charAt(j) ||
                        email.charAt(email.length() - 1) == specialAllowedSymbols.charAt(j)) {
                    return false;
                }

                if (email.indexOf("@") <= 1 || email.indexOf(".") <= 0) {
                    return false;
                }
                if (email.indexOf("@") == email.indexOf(".") - 1 ||
                        (email.indexOf(".") == email.indexOf("@") + 1)) {
                    return false;
                }

            }
        }
        return true;
    }
}

