class Decipherer {
    public static String decipher(String message) {
        // divide by 2
        int key = message.length() / 2;

        // start at the 6th and take the length of key
        String subMessage = message.substring(5, 5 + key);

        // replace '@#?' with a space
        subMessage = subMessage.replace("@#?", " ");

        // reverse string
        subMessage = new StringBuilder(subMessage).reverse().toString();

        return subMessage;
    }

    public static void main(String[] args) {
        String[] messages = {
                "0@sn9sirppa@#?ia'jgtvryko1",
                "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj",
                "aopi?sedohtém@#?sedhtmg+p9l!"
        };

        for (String message : messages) {
            System.out.println(decipher(message));
        }
    }
}
