class array_ex3 {
    public static void main(String[] args) {
        int[] arr = new int[5]; // 
        for(int i = 0; i < arr.length; i++)
            arr[i] =  i + 1;

        System.out.println("[변경전]");
        System.out.println("arr.length:"+arr.length);
        for(int i = 0; i < arr.length; i++)
            System.out.println("arr["+i+"]:"+arr[i]);
        int[] tmp = new int[arr.length*2]; // 기존 배열의 2배 크기의 배열 tmp를 생성한다.
        for(int i = 0; i < arr.length; i++)
            tmp[i] = arr[i]; // 기존 배열 arr의 모든 요소를 tmp로 복사한다.

        arr=tmp; // arr이 tmp를 참조하도록 한다. 기존 배열은 가비지가 된다.

        System.out.println("[변경후]");
        System.out.println("arr.length:"+arr.length);
        for(int i = 0; i < arr.length; i++)
            System.out.println("arr["+i+"]:"+arr[i]);
    }



}
