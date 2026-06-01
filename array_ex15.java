class array_ex15 {
    public static void main(String[] args) {
        String sorce = "SOSHELP";
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                        "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                        "..-", "...-", ".--", "-..-", "-.--", "--.."};
                // A-Z까지의 문자를 Morse Code로 변환하기 위한 배열이다. 

        String result = "";

        for (int i = 0; i < sorce.length(); i++) {
            result += morse[sorce.charAt(i) - 'A']; // "A"를 빼는 이유는 아스키 코드 값을 빼서 A=0 으로 정렬하기 위해서
        }
        System.out.println("sorce:"+ sorce);
        System.out.println("morse:"+ result);
    }


    
}
