package com.example.springboot2.processor;

import com.example.springboot2.mapper.TbSqbBillMonthMapper;
import com.example.springboot2.model.TbSqbBillMonth;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.UUID;

/**
 * @Description
 * @Author lll
 * @Date: 2022/7/5 11:02
 * @Version 1.0
 */
@Slf4j
@Component
public class TbProccessor {

    private final DataSourceTransactionManager transactionManager;

    private final Gson gson;

    private final TbSqbBillMonthMapper tbSqbBillMonthMapper;

    @Autowired
    RestTemplate restTemplate;

    public TbProccessor(DataSourceTransactionManager transactionManager,
                                   Gson gson,
                        TbSqbBillMonthMapper tbSqbBillMonthMapper
                                 ) {
        this.transactionManager = transactionManager;
        this.gson = gson;
        this.tbSqbBillMonthMapper = tbSqbBillMonthMapper;
    }

    public void testTransaction() {
        DefaultTransactionDefinition transDefinition = new DefaultTransactionDefinition();
        transDefinition.setPropagationBehavior(DefaultTransactionDefinition.PROPAGATION_REQUIRES_NEW);
        TransactionStatus transStatus = this.transactionManager.getTransaction(transDefinition);

        try {
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
            log.info("throw exception  ");
//            int a = (1/0);

            transactionManager.commit(transStatus);
        } catch (Exception e) {
            log.error("tbSqbBillMonthMapper 插入数据失败，rillback ");
            transactionManager.rollback(transStatus);
        }

    }

    public void testSendAndGetBody(String url){
        byte[] body = this.restTemplate.getForEntity(url, byte[].class).getBody();
        log.info(new String(body));

    }


}
