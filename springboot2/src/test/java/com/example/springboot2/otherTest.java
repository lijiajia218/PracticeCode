package com.example.springboot2;

import com.example.springboot2.model.TbSqbBillMonth;
import com.example.springboot2.model.TbSqbBillMonthExample;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.UUID;

/**
 * @Description
 * @Author lll
 * @Date: 2022/7/5 11:43
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@Slf4j
public class otherTest {

    @Test
    public void test() {
        TbSqbBillMonthExample example = new TbSqbBillMonthExample();
        example.or()
                .andBillTypeEqualTo(1)
                .andTradeMonthEqualTo("2022-07")
                .andSourceMerchantIdEqualTo("merchantId")
                .andDimensionEqualTo("11111");
        System.out.println(example);
    }

    @Test
    public void gsonTest() {
        TbSqbBillMonth tbSqbBillMonth = TbSqbBillMonth.builder()
                .tradeMonth("07-05")
                .billType(1)
                .sqbMerchantId(UUID.randomUUID().toString())
                .sqbMerchantSn("168-ll")
                .sqbRefundMoney(111L)
                .sqbTradeMoney(222L)
                .createAt(new Date()) //时间需要注意转换的格式。
                .sourceMerchantId("sourceMerchantId")
                .sqbTradeNum(1)
                .sqbRefundNum(1)
                .build();
        Gson gson = new Gson();
        log.info("---------------------------------------");
        log.info(gson.toJson(tbSqbBillMonth));

    }


}
