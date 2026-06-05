class BlockEx {

    static {
        System.out.println("static { }");   //클래스 초기화 블럭. 실행 1순위 
    }

    {
        System.out.println("{ }");          //인스턴스 초기화. 4순위 실행  8순위 실행
    }

    public BlockEx() {
        System.out.println("생성자");       //인스턴스값 실행 5순위 실행   9순위 실행
    }

    public static void main(String args[]) {
        System.out.println("BlockEx be = new BlockEx();");  // 2순위. MAIN method 실행되며 인스턴스 초기화로 이동
        BlockEx be = new BlockEx();                             // 3순위 be 를 BlockEx 로 정의하고 실행

        System.out.println("BlockEx be2 = new BlockEx();"); //6순위
        BlockEx be2 = new BlockEx();                            //7순위
    }   
}