/*[static] Crie uma classe chamada Util que tenha o método static
formatarData( ). O método recebe um objeto do tipo LocalDate e retorna
uma String no formato dd/MM/aaaa. Mostre, no método main(), como utilizar
o método static criado.*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Util {

public static String formatarData(LocalDate dataLocal){
    return dataLocal.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public static void main(String[] args) {
        System.out.println(Util.formatarData(LocalDate.now()));
    }

}
