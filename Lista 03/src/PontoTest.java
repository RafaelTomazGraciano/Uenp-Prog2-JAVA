
public class PontoTest {
    public static void main(String[] args) {
        Ponto p = new Ponto(2,3);
        System.out.println(p.getX());
        System.out.println(p.getY());
        p.setX(5);
        p.setY(7);
        System.out.println(p.getX());
        System.out.println(p.getY());
    }
}
