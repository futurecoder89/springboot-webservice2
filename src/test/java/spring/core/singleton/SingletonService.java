package spring.core.singleton;

public class SingletonService {
    //자기자신을 private과 static으로 선언
    //그러면 객체가 생성될때 클래스 레벨에 올라가기때문에 하나만 존재하게됨
    //1. static 영역에 객체를 딱 1개만 생성해둔다.
    private static final SingletonService instance = new SingletonService();

    //조회
    //2. public으로 열어서 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 조회하도록 허용한다.
    public static SingletonService getInstance() {
        return instance; //instance를 생성할수있는 다른 곳은 없다
    }
    //3. 생성자를 private으로 선언해서 외부에서 new 키워드를 사용한 객체 생성을 못하게 막는다.
    private SingletonService() {


    }
    public void Logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }

}
