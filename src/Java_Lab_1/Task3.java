package Java_Lab_1;

public class Task3 {
    private final String email;
    public Task3(final String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public static boolean isValid(final String email) {
        if (email.isEmpty()) {
            return false;
        }

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

                if(email.charAt(i) == '.' && email.charAt(i + 1) == '.') {
                    return false;
                }

            }
        }
        return true;
    }
}

