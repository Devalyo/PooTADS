package Ex05;

public class Ex05
{
    public static void main(String[] args) {
        
        Ret ret01 = new Ret(200, 321);
        Ret ret02 = new Ret(323, 123);

        System.out.println(ret01.CalcularArea());
        System.out.println(ret02.CalcularArea());

        System.out.println(ret01.Comparar(ret02));

    }
}