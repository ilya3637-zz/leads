import java.text.SimpleDateFormat;
import java.util.Date;

public class data {

    static String[] getLoginAndPassword() {

        //нет тестового аккаунта, поэтому вписать свои данные. В идеале иметь отдельную БД со всеми тестовыми данными
        String[] log_pas = {"ilya3637@mail.ru", "Pospelov3003637"};

        return log_pas;
    }

    static String[] getFIO() {

        String[] fio = {"test", "тест", "testтест", "qweQWEфывФЫВ-qweweqasdook 27-й"};
        return fio;
    }

    static String[] getWrongFIO() {

        String[] fio = {"%$#--", ""};
        return fio;
    }

    static String[] getWrongBD() {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        Date date_temp = new Date(System.currentTimeMillis()+10);
        String date = simpleDateFormat.format(date_temp);

        String[] bd = {"1996-12-23", date};
        return bd;
    }

    static String[] getBD() {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());

        String[] bd = {"1996-12-23", date};
        return bd;
    }

    static String[] getSkype() {

        String[] skype = {"йцуцйуйцу", "qewqewqewqw"};
        return skype;
    }

    static String[] getWrongSkype() {

        String[] skype = {"q", "и"};
        return skype;
    }

    static String[] getICQandTg() {

        String[] icq_tg = {"q", "123"};
        return icq_tg;
    }



}
