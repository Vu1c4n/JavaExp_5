public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            // 测试设置年龄
            person.setAge(25);
            System.out.println("年龄为：" + person.getAge());

            // 测试非法年龄
            person.setAge(160); // 设置一个非法年龄
            System.out.println("年龄为：" + person.getAge()); // 不会执行到这里，因为会抛出异常
        } catch (IllegalAgeException e) {
            System.out.println("出现异常：" + e.getMessage());
        }
    }
}
