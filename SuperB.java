class SuperA {
    int a=10;
}
class SuperB extends SuperA{
    int a=20;
    void show(int a){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
    public static void main(String[] args) {
        SuperB ob1=new SuperB();
        ob1.show(30);
        
    }
}
 