class StaticBlockEx {
    static int[] arr = new int[10];                 // 실행 1순위.어레이 10개 생성

    static {                                        //실행 2순위. 어레이 10개에 랜덤값 부여하며 초기화
        for(int i=0;i<arr.length;i++) {
            // 1과 10사이의 임의의 값을 배열 arr에 저장
            arr[i] = (int)(Math.random()*10) + 1;   
        }
    }

    public static void main(String args[]) {            //실행 3순위 어레이값 출력
        for(int i=0; i<arr.length;i++)
            System.out.println("arr["+i+"] :" + arr[i]);
    }
}