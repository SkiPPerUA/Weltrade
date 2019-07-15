import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.AutorisationPage;
import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.TraderControlPage;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.Session;
import ua.kiev.prog.automation.framework.base.Widget;
import ua.kiev.prog.automation.framework.base.widget.GUILink;

public class TextCabinet {

    public static void main(String[] args) throws InterruptedException {

        String local = "http://localhost:4200/auth";
        String prod = "https://account.weltrade.com/auth/login";

        Session.get().driver().get(prod);

        AutorisationPage page = new AutorisationPage();

        page.loginInCabinet("savchukvi12@gmail.com","4766147sv");

        TraderControlPage pageloged = new TraderControlPage();

        //Widget text = new Widget(Locator.create("/html/body/app-root/app-pages/main/app-open-account/section/div/div/div[3]/div/div/div/p"));

        //"Eng","Thai","Rus","Indon","Esp","Vn","Lao","Ms","CN"
        String [] newText = {
                "If you have additional questions, please contact our support team.",
                "หากคุณมีคำถามเพิ่มเติมโปรดติดต่อทีมสนับสนุนของเรา.",
                "Если у вас возникли дополнительные вопросы, пожалуйста, обратитесь в службу поддержки.",
                "Jika anda memiliki pertanyaan tambahan, silakan hubungi tim dukungan kami.",
                "Si tiene alguna pregunta más, póngase en contacto con nuestro equipo de asistencia.",
                "Nếu bạn có thêm câu hỏi, xin vui lòng liên hệ với nhóm hỗ trợ của chúng tôi.",
                "ຖ້າທ່ານມີຄໍາຖາມເພີ່ມເຕີມ, ກະລຸນາຕິດຕໍ່ທີມງານສະຫນັບສະຫນູນຂອງພວກເຮົາ.",
                "Sekiranya anda mempunyai soalan tambahan, sila hubungi pasukan sokongan kami.",
                "如果您有其他问题,请联系我们的支持团队。"
        };



        Widget radio = new Widget(Locator.create("/html/body/app-root/app-pages/main/app-control-page/section/div/div[2]/app-control-account/div/div[1]/div[2]/app-switcher/div/div"));

        try {
            /*for (int i = 0; i < newText.length; i++) {

                pageloged.header.language.click();
                pageloged.header.getAllLanguages(i).click();
                //Assert.assertEquals(newText[i], text.getText());
                System.out.println(pageloged.header.getNameLangauge(i));
                Thread.sleep(3000);

            }*/

            radio.element().click();

            for (int i = 0; i < newText.length; i++) {

                pageloged.header.language.click();
                pageloged.header.getAllLanguages(i).click();
                //Assert.assertEquals(newText[i], text.getText());
                System.out.println(pageloged.header.getNameLangauge(i));
                Thread.sleep(3000);

            }



        }finally {
            Session.get().close();
        }

    }
}
