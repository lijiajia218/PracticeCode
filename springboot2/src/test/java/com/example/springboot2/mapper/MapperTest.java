package com.example.springboot2.mapper;

import com.example.springboot2.model.TbSqbBillMonth;
import com.example.springboot2.processor.TbProccessor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.UUID;

/**
 * @Description
 * @Author lll
 * @Date: 2022/7/5 10:18
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperTest {

    @Autowired
    TbSqbBillMonthMapper tbSqbBillMonthMapper;

    @Autowired
    TbProccessor tbProccessor;

    @Test
    public void test() {
        TbSqbBillMonth tb = tbSqbBillMonthMapper.findOne(2008890);
        System.out.println(tb);
    }

    @Test
    public void insertTest() {
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
        tbSqbBillMonthMapper.insert(tbSqbBillMonth);
    }

    @Test
    public void test2() {
        tbProccessor.testTransaction();
    }


    @Test
    public void restTemplateTest() {
        tbProccessor.testSendAndGetBody("http://localhost:9090/hello");
    }


}
