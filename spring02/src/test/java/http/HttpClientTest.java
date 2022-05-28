package http;


import com.alibaba.fastjson.JSONObject;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.apache.http.entity.StringEntity;

import java.io.IOException;

public class HttpClientTest {


    @Test
    public void testSendHttpRequest() {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String url = "http://localhost:8888/mail/send";
        HttpPost httpPost = new HttpPost(url);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("app_id", "1234");
        jsonObject.put("name", "lijiajia");
        jsonObject.put("desc", "描述");
        jsonObject.put("receiverEmail", "333333");
        jsonObject.put("id", "fasdfadfasdfID");
        jsonObject.put("name", "lijiajia");
        jsonObject.put("password", "password");
        StringEntity stringEntity = new StringEntity(jsonObject.toString(), Consts.UTF_8);
        stringEntity.setContentType(new BasicHeader("Content-Type", "application/json;charset=utf-8"));
        stringEntity.setContentEncoding(Consts.UTF_8.name());
        httpPost.setEntity(stringEntity);

        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpPost);
            HttpEntity httpEntity = response.getEntity();
            String s = EntityUtils.toString(httpEntity);
            System.out.println(s);
            EntityUtils.consume(httpEntity);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                httpClient.close();
                response.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
