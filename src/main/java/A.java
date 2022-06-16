public class A {
    public void operate(){
        int compute;
        int a = 88;
        int b = 10;
        C c = new C();
        c.printInfo();
        int v = c.getClassInstance().compute(B.V1,B.V2);
        int v2 = c.getClassInstance().compute(a,b);
        c.compute(a,b);
        System.out.println(v);
    }
}
