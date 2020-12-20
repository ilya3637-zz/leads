import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class functions {


    static boolean auth_check(WebDriver driver) {

        try {
            String[] log_pas = data.getLoginAndPassword();
            driver.get("https://webmaster.leads.su/login");

            //log
            driver.findElement(By.xpath("//*[@id=\"webmaster_models_web_LoginForm_email\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"webmaster_models_web_LoginForm_email\"]")).sendKeys(log_pas[0]);

            //pas
            driver.findElement(By.xpath("//*[@id=\"webmaster_models_web_LoginForm_password\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"webmaster_models_web_LoginForm_password\"]")).sendKeys(log_pas[1]);

            //enter
            driver.findElement(By.xpath("//*[@id=\"login\"]/div[5]/button")).click();


            System.out.println("OK авторизация");
            return true;
        } catch (Exception E) {
            System.out.println("ERROR авторизация");
            return false;
        }

    }

    static boolean fio_check(WebDriver driver) throws InterruptedException {

        String[] fio = data.getFIO();

        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("//*[@id=\"action2020-stage2-lkv-button-see-later\"]")).click();//sendKeys(Keys.ESCAPE);

        try {
            for (int i = 0; i < fio.length; i++) {
                driver.get("https://webmaster.leads.su/account/user/update");


                //first name
                driver.findElement(By.xpath("//*[@id=\"webmaster_modules_account_forms_user_UserUpdateForm_first_name\"]")).click();
                driver.findElement(By.xpath("//*[@id=\"webmaster_modules_account_forms_user_UserUpdateForm_first_name\"]")).clear();
                driver.findElement(By.xpath("//*[@id=\"webmaster_modules_account_forms_user_UserUpdateForm_first_name\"]")).sendKeys(fio[i]);

                //last name
                driver.findElement(By.xpath("//*[@id=\"webmaster_modules_account_forms_user_UserUpdateForm_last_name\"]")).click();
                driver.findElement(By.xpath("//*[@id=\"webmaster_modules_account_forms_user_UserUpdateForm_last_name\"]")).clear();
                driver.findElement(By.xpath("//*[@id=\"webmaster_modules_account_forms_user_UserUpdateForm_last_name\"]")).sendKeys(fio[i]);

                //enter
                driver.findElement(By.xpath("//*[@id=\"save-btn\"]")).click();

                if (driver.getCurrentUrl().equals("https://webmaster.leads.su/account/default")) {
                } else {
                    System.out.println("ERROR ФИО");
                    return false;
                }

            }

            System.out.println("OK ФИО");
            return true;
        } catch (Exception E) {
            System.out.println("ERROR ФИО");
            return false;
        }

    }

    static boolean bd_check(WebDriver driver) {

        String[] bd = data.getBD();
        try {
            for (int i = 0; i < bd.length; i++) {
                driver.get("https://webmaster.leads.su/account/user/update");


                //date
                driver.findElement(By.xpath("//*[@id=\"webmaster_modules_account_forms_user_UserUpdateForm_birthday\"]")).click();
                driver.findElement(By.xpath("//*[@id=\"webmaster_modules_account_forms_user_UserUpdateForm_birthday\"]")).clear();
                driver.findElement(By.xpath("//*[@id=\"webmaster_modules_account_forms_user_UserUpdateForm_birthday\"]")).sendKeys(bd[i]);

                //enter
                driver.findElement(By.xpath("//*[@id=\"save-btn\"]")).click();

                if (driver.getCurrentUrl().equals("https://webmaster.leads.su/account/default")) {
                } else {
                    System.out.println("ERROR Дата рождениея");
                    return false;
                }

            }

            System.out.println("OK Дата рождения");
            return true;
        } catch (Exception E) {
            System.out.println("ERROR Дата рождения");
            return false;
        }

    }

    static boolean icq_tg_check(WebDriver driver) {

        String[] icq_tg = data.getICQandTg();
        try {
            for (int i = 0; i < icq_tg.length; i++) {
                driver.get("https://webmaster.leads.su/account/user/update");


                //icq
                driver.findElement(By.xpath("//*[@id=\"webmaster_modules_account_forms_user_UserUpdateForm_icq\"]")).click();
                driver.findElement(By.xpath("//*[@id=\"webmaster_modules_account_forms_user_UserUpdateForm_icq\"]")).clear();
                driver.findElement(By.xpath("//*[@id=\"webmaster_modules_account_forms_user_UserUpdateForm_icq\"]")).sendKeys(icq_tg[i]);

                //tg
                driver.findElement(By.xpath("//*[@id=\"webmaster_modules_account_forms_user_UserUpdateForm_telegram\"]")).click();
                driver.findElement(By.xpath("//*[@id=\"webmaster_modules_account_forms_user_UserUpdateForm_telegram\"]")).clear();
                driver.findElement(By.xpath("//*[@id=\"webmaster_modules_account_forms_user_UserUpdateForm_telegram\"]")).sendKeys(icq_tg[i]);

                //enter
                driver.findElement(By.xpath("//*[@id=\"save-btn\"]")).click();

                if (driver.getCurrentUrl().equals("https://webmaster.leads.su/account/default")) {
                } else {
                    System.out.println("ERROR ICQ|TG");
                    return false;
                }

            }

            System.out.println("OK ICQ|TG");
            return true;
        } catch (Exception E) {
            System.out.println("ERROR ICQ|TG");
            return false;
        }

    }

    static boolean skype_check(WebDriver driver) {

        String[] icq_tg = data.getSkype();
        try {
            for (int i = 0; i < icq_tg.length; i++) {
                driver.get("https://webmaster.leads.su/account/user/update");


                //skype
                driver.findElement(By.xpath("//*[@id=\"webmaster_modules_account_forms_user_UserUpdateForm_skype\"]")).click();
                driver.findElement(By.xpath("//*[@id=\"webmaster_modules_account_forms_user_UserUpdateForm_skype\"]")).clear();
                driver.findElement(By.xpath("//*[@id=\"webmaster_modules_account_forms_user_UserUpdateForm_skype\"]")).sendKeys(icq_tg[i]);


                //enter
                driver.findElement(By.xpath("//*[@id=\"save-btn\"]")).click();

                if (driver.getCurrentUrl().equals("https://webmaster.leads.su/account/default")) {
                } else {
                    System.out.println("ERROR Skype");
                    return false;
                }

            }

            System.out.println("OK Skype");
            return true;
        } catch (Exception E) {
            System.out.println("ERROR Skype");
            return false;
        }

    }
}
