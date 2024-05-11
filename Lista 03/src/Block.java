//objetos podem ser passados para metodos

public class Block {
    int a, b, c, volume;

    Block(int i, int j, int k){
        a = i;
        b = j;
        c = k;
        volume = a*b*c;
    }

    //retorna true se ob definir o mesmo bloco
    boolean sameblock(Block ob){
        if((ob.a == a) && (ob.b == b) && (ob.c == c)){
            return true;
        }
        else{
            return false;
        }
    }

    //retorna true se ob tiver o mesmo volume
    boolean sameVolume(Block ob){
        if(ob.volume == volume){
            return true;
        }
        else{
            return false;
        }
    }
}

class PassOb{
    public static void main(String[] args) {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);

        System.out.println("ob1 mesmas dimesoes de ob2: " + ob1.sameblock(ob2));

        System.out.println("ob1 mesmas dimesoes de ob3: " + ob1.sameblock(ob3));

        System.out.println("ob1 mesmo volume de ob3: " + ob1.sameVolume(ob3));
    }
}
