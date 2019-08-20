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

        Session.get().driver().get(dev);
        MainPage mainPage = new MainPage();

        String [] mail = {"https://www.weltrade.com.ua/","https://www.weltrade.kz/","https://bel.weltrade.com/"};
        int y = 0;

        Widget text = new Widget(Locator.create("/html/body/footer/div[1]/div/nav/div[1]/ul[2]/li[3]/a"));

        //  0     1      2      3      4     5    6    7     8
        //"Eng","Thai","Rus","Indon","Esp","Vn","Lao","Ms","CN"
        String [] newText = {
                "yy",
                "ทีมพัฒนาของเราอัพเดตการออกแบบพื้นที่ส่วนบุคคลของเว็บไซต์ งานที่ยอดเยี่ยมได้ถูกดำเนินการเพื่อปรับปรุงประสิทธิภาพการทำงานเพื่อเพิ่มความเร็วในการทำงานและทำให้การจัดการโปรไฟล์ทำได้ง่ายและชัดเจน เราได้ควบคุมการปฏิบัติงานและข้อมูลทั้งหมดไว้ในที่เดียวและได้ปรับปรุงการใช้งานของพื้นที่ส่วนบุคคล",
                "Команда наших разработчиков обновила дизайн личного кабинета сайта. Была проделана отличная работа по улучшению производительности, увеличению скорости работы и обеспечению легкого и понятного управления профилем. Мы поместили все необходимые данные и элементы управления в одно место и сделали личный кабинет более удобным.",
                "Tim pengembangan kami memperbarui desain area pribadi situs web. Pekerjaan hebat telah dilakukan untuk meningkatkan produktivitas, mempercepat pekerjaan dan membuat manajemen profil mudah dan jelas. Kami telah menempatkan semua kontrol operasional dan data di satu tempat dan telah meningkatkan kegunaan area pribadi.",
                "Nuestro equipo de desarrollo actualizó el diseño del área personal del sitio web. Realizaron este fantástico trabajo para mejorar la productividad, acelerar el trabajo y hacer que la gestión de los perfiles fuera más fácil y clara. Hemos puesto todos los datos y controles operativos en un solo lugar y hemos mejorado la usabilidad del área personal.",
                "Nhóm phát triển của chúng tôi cập nhật trang web thiết kế trang cá nhân. Điều này đã được thực hiện để cải thiện năng suất, để tăng tốc công việc và làm cho việc quản lý hồ sơ dễ dàng và rõ ràng. Chúng tôi đã cài đặt tất cả các khả năng hoạt động và dữ liệu ở một nơi và đã cải thiện việc sử dụng trang cá nhân.",
                "ທີມງານພັດທະນາຂອງພວກເຮົາປັບປຸງການອອກແບບພື້ນທີ່ສ່ວນຕົວຂອງເວບໄຊທ໌. ວຽກທີ່ດີເລີດແມ່ນໄດ້ຖືກດຳເນີນເພື່ອປັບປຸງປະສິດທິພາບການເຮັດເພື່ອຄວາມໄວໃນການເຮັດວຽກ ແລະ ເຮັດໃຫ້ການຈັດການໂປຼໄຟລ໌ງ່າຍແລະຈະແຈ້ງ. ພວກເຮົາໄດ້ເອົາໃຈໃສ່ຄວບຄຸມການປະຕິບັດງານແລະຂໍ້ມູນທັງ ໝົດໄວ້ໃນດວບໄຊທ໌ບ່ອນດຽວແລະໄດ້ປັບປຸງການໃຊ້ງານຂອງພື້ນທີ່ສ່ວນຕົວ",
                "Pasukan pembangunan kami memperbaharui reka bentuk laman web peribadi. Hasil yang hebat telah dilakukan untuk meningkatkan produktiviti, mempercepatkan kerja dan membuat pengurusan profil lebih mudah dan jelas. Kami telah meletakkan semua kawalan operasi dan data di satu tempat dan telah meningkatkan kebolehgunaan laman peribadi.",
                "我们的开发团队更新了网站的个人区域设计。此次更新能更好地提高生产力,加快工作效率,简化档案管理。我们将所有操作控制和数据集合在同一个地方,并且提高了个人区域的可用性。"
        };

        try
        {


            for (int i = 0; i < newText.length; i++)
            {




                mainPage.header.getAllLanguages(i);
                System.out.println(text.getText());


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
