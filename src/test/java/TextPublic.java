import org.junit.Assert;
import org.testng.annotations.Test;
import ua.kiev.prog.automation.framework.WELTRADE_Publick.MainPage;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.Session;
import ua.kiev.prog.automation.framework.base.Widget;

public class TextPublic {


    public static void main(String[] args) throws InterruptedException {

        String dev = "http://wt23.dev.weltrade.com.ua";
        String prod = "http://www.weltrade.com.ua";

        Session.get().driver().get(prod);
        MainPage mainPage = new MainPage();

        Widget text = new Widget(Locator.create("//*[@id='01']/div/div[1]/div[15]/p[2]"));

        //"Eng","Thai","Rus","Indon","Esp","Vn","Lao","Ms","CN"
        String [] newText = {
                "14.2. To get the prize the Client needs to have net deposit of $5 000 and complete a trading volume of 250 lots from the start of the promotion. 1 lot on Micro account equals 0.01 standard lot. Net deposit is calculated as difference between total withdrawal and total deposit for the Client’s profile.",
                "14.2. ในการรับรางวัลลูกค้าจะต้องมีเงินฝากสุทธิ $5 000 และทำธุรกรรมการซื้อขาย 250 ล็อตให้สมบูรณ์ตั้งแต่เริ่มโปรโมชั่น 1 lot ในบัญชี Micro เท่ากับ 0.01 lot lot เงินฝากสุทธิจะถูกคำนวณเป็นผลต่างระหว่างการถอนเงินทั้งหมดและเงินฝากทั้งหมดสำหรับโปรไฟล์ของลูกค้า",
                "Своп, p.a.",
                "14.2. Untuk mendapatkan hadiah, Klien harus memiliki deposit bersih $5 000 dan menyelesaikan volume perdagangan 250 lot dari awal promosi. 1 lot pada akun Micro sama dengan 0.01 lot standar. Setoran bersih dihitung sebagai selisih antara total penarikan dan total deposit untuk profil Klien.",
                "Swap, p.a.",
                "14.2. Để nhận được giải thưởng, Khách hàng cần có khoản tiền gửi ròng 5 000 đô la và hoàn thành khối lượng giao dịch 250 lô kể từ khi bắt đầu chương trình khuyến mãi. 1 LOT trên tài khoản Micro bằng 0,01 lô tiêu chuẩn. Tiền gửi ròng được tính bằng chênh lệch giữa tổng số tiền rút và tổng số tiền gửi cho hồ sơ của Khách hàng.",
                "14.2. ໃນການຮັບລ້າງວັນລູກຄ້າຈະຕ້ອງມີເງິນຝາກສຸດທິ $5 000 ແລະ ທຳການຊື້ຂາຍ 250 ລອດໃຫ້ສົມບູນຕັ້ງແຕ່ເລີມໂປໂມເຊີນ 1 lot ໃນບັນຊີ Micro ເທົາກັບ 0,01 lot ເງິນຝາກສຸດທິຖືກຄິດໄລ່ເປັນຄວາມແຕກຕ່າງລະຫວ່າງການຖອນເງິນທັງຫມົດແລະເງິນຝາກລວມສໍາລັບໂປແກຼມຂອງລູກຄ້າ",
                "14.2. Untuk mendapatkan hadiah, Pelanggan perlu mempunyai deposit bersih sebanyak $5 000 dan melengkapkan jumlah dagangan sebanyak 250 lot dari permulaan promosi. 1 lot pada akaun Mikro bersamaan dengan 0.01 standard lot. Deposit bersih dikira sebagai perbezaan antara jumlah pengeluaran dan jumlah deposit untuk profil Pelanggan.",
                "掉期交易, p.a."
        };

        try
        {



            for (int i = 0; i < newText.length; i++)
            {

                mainPage.header.moveOnElement(mainPage.header.company);
                mainPage.header.legal_information.click();


                if (i == 2 || i == 4){
                    continue;}


                mainPage.header.getAllLanguages(i);
                Assert.assertEquals(newText[i],text.getText());
                System.out.println(mainPage.header.getNameLangauge(i) + " - ОК");




            }

        }
        finally
        {
            Session.get().close();
        }

    }
}
