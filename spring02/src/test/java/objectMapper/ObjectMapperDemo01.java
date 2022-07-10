package objectMapper;/**
 * @description:
 * @author: lll
 * @date: 2022-05-29 16:15
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;

/**
 *@Author sqb
 *@Date 16:15
 */
public class ObjectMapperDemo01 {
    ObjectMapper om = new ObjectMapper();

    @Test
    public void test() {
        String josnString  = "{\"lakala_trade_params\":{\"lakala_merc_id\":\"822142490018799\",\"lakala_term_id\":\"14047376\"},\"merchant_daily_max_sum_of_trans\":\"100000\",\"merchant_single_max_of_tran\":{},\"category_merchant_single_max_of_tran\":{\"106\":\"500.00\"}}";
        Map map = transformForMap(josnString,om);
        System.out.println(map);

    }


    public Map transformForMap(Object o, ObjectMapper om)  {
        Map result = null;
        if (o instanceof String) {
            if ("".equals(o)) {
                return result;
            } else {
                try {
                    result = om.readValue(((String) o).getBytes("UTF-8"), Map.class);
                } catch (IOException e) {
                }
            }
        } else if (o instanceof Map) {
            result = (Map) o;
        }
        return result;
    }
}
