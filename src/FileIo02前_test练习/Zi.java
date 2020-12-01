package FileIo02前_test练习;

public class Zi extends Fu {

    static {
        System.out.println("zi类静态代码块执行");
    }

    {
        System.out.println("zi类非静态代码块执行");
    }

    public Zi() {
        System.out.println("zi类构造执行");
    }
}

