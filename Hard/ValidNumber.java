class ValidNumber {
    public boolean isNumber(String s) {
        boolean num = false;
        boolean dot = false;
        boolean exp = false;
        boolean afterExp = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = true;
                afterExp = true;
            }
            else if (c == '.') {
                if (dot || exp) {
                    return false;
                }
                dot = true;
            }
            else if (c == 'e' || c == 'E') {
                if (exp || !num) {
                    return false;
                }
                exp = true;
                afterExp = false;
            }
            else if (c == '+' || c == '-') {
                if (i != 0 && s.charAt(i - 1) != 'e'
                    && s.charAt(i - 1) != 'E') {
                    return false;
                }
            }
            else {
                return false;
            }
        }

        return num && afterExp;
    }
}
