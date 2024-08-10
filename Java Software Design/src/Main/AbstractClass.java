package Main;

public abstract class AbstractClass implements Interface1 {
    // properties

    // public int password = 9999;
    public int password;

    // constructors
    public AbstractClass() // método não abstrato

    {
        password = 9999;
    }

    public AbstractClass(int password) // método não abstrato

    {
        this.password = password;
    }

    // behaviours
    public void sayHello()

    {
        System.out.println("Olá");
    }

    public abstract void sayHi();// //método abstrato! não pode ser implementado na classe abstrata

    @Override
    public void interfaceMothod2() {
        System.out.println("metodo 2 da interface1 na AbstractClass");
    }

}
