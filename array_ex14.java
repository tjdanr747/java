class array_ex14 {
    public static void main(String[] args) {
        String src = "ABCDE";

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            System.out.println("src.charAt("+i+"):"+ch);
        }

        char[] chArr = src.toCharArray(); 

        System.out.println(chArr); // char배열은 println()의 매개변수로 전달되면 문자열로 변환되어 출력된다.

    }

}
