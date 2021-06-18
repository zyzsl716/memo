
public class Client
{
    public static  void main(String[] args)
    {
        UserInfoDTO user = new UserInfoDTO();

        Caretaker c = new Caretaker();

        user.setAccount("张三");
        user.setPassword("123456");
        user.setTelNo("1111111111111");
        System.out.println("状态一：");
        user.show();
        c.setMemento(user.saveMemento());
        System.out.println("--------------------------");

        user.setPassword("654987");
        user.setTelNo("222222222222");
        System.out.println("状态二：");
        user.show();

        user.restoreMemento(c.getMemento());
        System.out.println("回到状态一");
        System.out.println("--------------------------");
        user.show();
    }
}