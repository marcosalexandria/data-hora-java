import java.time.Duration;
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
        //System.out.println(dt5.format(form1)); //imprimindo com mesmo formato

        // ----------------------------- pegando elementos --------------------------

        LocalDate dt6 = LocalDate.parse("2015-11-01");

        Integer dia = dt6.getDayOfMonth(); //retorna o dia
        Integer mes = dt6.getMonthValue(); //retorna o mes
        Integer ano = dt6.getYear();       //retorna o ano

        // ----------------------------- cálculo com data-hora --------------------------

        LocalDate dt7 = LocalDate.parse("2015-11-01");
        LocalDateTime dt8 = LocalDateTime.parse("2015-11-01T05:30");

        //os metódos plus adicionam dias, anos, meses, horas... e os metodos minus diminuem

        LocalDate semanaAnteriorLocalDate =  dt7.minusDays(7);
        //System.out.println("semanaAnteriorLocalDate = " + semanaAnteriorLocalDate);
        LocalDate proximaSemana = dt7.plusDays(7);
        //System.out.println("proximaSemana = " + proximaSemana);

        LocalDateTime horasAntesLocalDateTime = dt8.minusHours(3);
        //System.out.println("horasAntesLocalDateTime = " + horasAntesLocalDateTime);
        LocalDateTime mesDeposLocalDateTime = dt8.plusMonths(1);
        //System.out.println("mesDeposLocalDateTime = " + mesDeposLocalDateTime);

        // ----------------------------- Duração entre data-hora --------------------------
        LocalDateTime dt9 = LocalDateTime.parse("2015-11-01T05:30");
        LocalDateTime dt10 = LocalDateTime.parse("2015-11-08T05:30");
        Duration du1 = Duration.between(dt9, dt10); //objeto Duration com o metodo between faz retorna o intervalo entre duas data-hora

        System.out.println("du1 = " + du1.toDays()); //metodo toDays() expecifica que é o intervalo de dias

        //para fazer com LocalDate, ele tem que ser convertido para LocalDateTime
        LocalDate dt11 = LocalDate.parse("2015-11-01");
        LocalDate dt12 = LocalDate.parse("2015-11-08");
        //atStartOfDay = no inicio do dia ou seja colocou essa data as meia noite 00:00:00
        Duration du2 = Duration.between(dt11.atStartOfDay(), dt12.atStartOfDay());
        System.out.println("du2 = " + du2.toDays());

    }
}