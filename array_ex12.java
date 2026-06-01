class array_ex12 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Park", "Yi"};

        for (int i = 0; i < names.length; i++)              // .
            System.out.println("names["+i+"]:"+names[i]);      // names 배열에서 names 배열번호, 배열 내용을 줄을 넘기면서 출력
        String tmp = names[2];      
        System.out.println("tmp:"+tmp);                     // tmp에 현재 있는 내용 출력

        names [0] = "Yu";                                  // names 배열의 0번 배열에 "Yu" 로 변경 저장
        
        for (String str : names)
            System.out.println(str);                         // names 배열에서 str에 있는 내용을 줄을 넘기면서 출력

    }
}
