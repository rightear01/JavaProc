package Immutal.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; // 참조값 대입은 막지 못한다.
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        
//      b.setValue("부산"); // 대신 변경은 막을 수 있음.
        b = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}