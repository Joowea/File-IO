package FileIo02前_test练习;

public class Fu {

    static {
        System.out.println("fu类静态代码块执行");
    }

    {
        System.out.println("fu类非静态代码块执行");
    }

    public Fu() {
        System.out.println("fu类构造执行");
    }
}
