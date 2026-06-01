class array_ex15 {
    public static void main(String[] args) {
        String sorce = "SOSHELP";
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                        "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                        "..-", "...-", ".--", "-..-", "-.--", "--.."};

        String result = "";

        for (int i = 0; i < sorce.length(); i++) {
            result += morse[sorce.charAt(i) - 'A'];
        }
        System.out.println("sorce:"+ sorce);
        System.out.println("morse:"+ result);
    }


    
}
