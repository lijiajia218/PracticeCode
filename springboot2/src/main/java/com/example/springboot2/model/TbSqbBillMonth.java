package com.example.springboot2.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @Description
 * @Author lll
 * @Date: 2022/7/5 10:06
 * @Version 1.0
 */
@Data
@Builder
public class TbSqbBillMonth {
    private Integer id;

    private String tradeMonth;

    private Integer billType;

    private String sourceMerchantId;

    private String sqbMerchantId;

    private Integer sqbTradeNum;

    private Long sqbTradeMoney;

    private Integer sqbRefundNum;

    private Long sqbRefundMoney;

    private String dimension;

    private Date createAt;

    private String sqbMerchantSn;

    /*
    mysql 类型和java类型的对应关系。
    CREATE TABLE `tb_sqb_bill_month` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `trade_month` char(8) NOT NULL,
  `bill_type` int(11) NOT NULL,
  `source_merchant_id` varchar(36) NOT NULL,
  `sqb_merchant_id` varchar(36) DEFAULT NULL,
  `sqb_trade_num` int(11) NOT NULL DEFAULT '0',
  `sqb_trade_money` bigint(20) NOT NULL DEFAULT '0',
  `sqb_refund_num` int(11) NOT NULL DEFAULT '0',
  `sqb_refund_money` bigint(20) NOT NULL DEFAULT '0',
  `sqb_merchant_sn` varchar(32) DEFAULT '' COMMENT '收钱吧商户号',
  `dimension` varchar(36) DEFAULT NULL COMMENT '维度',
  `create_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `tb_sqb_bill_month_uindex` (`trade_month`,`bill_type`,`source_merchant_id`,`sqb_merchant_id`)
) ENGINE=InnoDB AUTO_INCREMENT=49666106 DEFAULT CHARSET=utf8
     */
}
