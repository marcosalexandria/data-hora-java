import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        // ----------------------------- instanciando --------------------------

        LocalDate dt1 = LocalDate.now(); //retrna a data atual no padrão yyyy-MM-dd

        LocalDate dt2 = LocalDate.parse("2015-11-01"); //converte um texto para data no padrão yyyy-MM-dd

        LocalDateTime dt3 = LocalDateTime.now(); //retorna data e hora yyyy-MM-dddTHH:mm:ss

        LocalDateTime dt4 = LocalDateTime.parse("2015-11-01T18:43"); //converte um texto para data e hora yyyy-MM-dddTHH:mm:ss

        // ----------------------------- formatando --------------------------

        DateTimeFormatter form1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //estabelecendo um formato
        LocalDate dt5 = LocalDate.parse("01/11/2015", form1); //instanciando com o formato desejado
        System.out.println(dt5.format(form1)); //imprimindo com mesmo formato

        // ----------------------------- pegando elementos --------------------------

        LocalDate dt6 = LocalDate.parse("2015-11-01");

        Integer dia = dt6.getDayOfMonth(); //retorna o dia
        Integer mes = dt6.getMonthValue(); //retorna o mes
        Integer ano = dt6.getYear();       //retorna o ano
    }
}