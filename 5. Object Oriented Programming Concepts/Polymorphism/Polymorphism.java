class Ab {
    void m1(Ab a) {
        System.out.println("m1 method in class A");
    }
}
class Bb extends Ab {
    public void m1(Ab a) {
        System.out.println("m1 method in class B");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Ab a = new Ab();
        a.m1(a);
        a.m1(new Bb());

        Bb b = new Bb();
        b.m1(null);

        a = b;
        a.m1(null);
        a.m1(new Ab());
    }
}
