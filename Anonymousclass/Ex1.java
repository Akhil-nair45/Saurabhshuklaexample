class Greetings
{
    public void sayHello()
    {
        System.out.println("Hello");
    }
}

class INDIA
{

    Greetings g = new Greetings(){
        public void sayHello()
        {
            System.out.println("welcome");
        }
    };
}





public class Ex1 {
    public static void main(String[] args) {
        INDIA india = new INDIA();
        india.g.sayHello();
    }
}
