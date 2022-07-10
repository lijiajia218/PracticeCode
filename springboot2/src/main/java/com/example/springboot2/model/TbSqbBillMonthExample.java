package com.example.springboot2.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbSqbBillMonthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSqbBillMonthExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTradeMonthIsNull() {
            addCriterion("trade_month is null");
            return (Criteria) this;
        }

        public Criteria andTradeMonthIsNotNull() {
            addCriterion("trade_month is not null");
            return (Criteria) this;
        }

        public Criteria andTradeMonthEqualTo(String value) {
            addCriterion("trade_month =", value, "tradeMonth");
            return (Criteria) this;
        }

        public Criteria andTradeMonthNotEqualTo(String value) {
            addCriterion("trade_month <>", value, "tradeMonth");
            return (Criteria) this;
        }

        public Criteria andTradeMonthGreaterThan(String value) {
            addCriterion("trade_month >", value, "tradeMonth");
            return (Criteria) this;
        }

        public Criteria andTradeMonthGreaterThanOrEqualTo(String value) {
            addCriterion("trade_month >=", value, "tradeMonth");
            return (Criteria) this;
        }

        public Criteria andTradeMonthLessThan(String value) {
            addCriterion("trade_month <", value, "tradeMonth");
            return (Criteria) this;
        }

        public Criteria andTradeMonthLessThanOrEqualTo(String value) {
            addCriterion("trade_month <=", value, "tradeMonth");
            return (Criteria) this;
        }

        public Criteria andTradeMonthLike(String value) {
            addCriterion("trade_month like", value, "tradeMonth");
            return (Criteria) this;
        }

        public Criteria andTradeMonthNotLike(String value) {
            addCriterion("trade_month not like", value, "tradeMonth");
            return (Criteria) this;
        }

        public Criteria andTradeMonthIn(List<String> values) {
            addCriterion("trade_month in", values, "tradeMonth");
            return (Criteria) this;
        }

        public Criteria andTradeMonthNotIn(List<String> values) {
            addCriterion("trade_month not in", values, "tradeMonth");
            return (Criteria) this;
        }

        public Criteria andTradeMonthBetween(String value1, String value2) {
            addCriterion("trade_month between", value1, value2, "tradeMonth");
            return (Criteria) this;
        }

        public Criteria andTradeMonthNotBetween(String value1, String value2) {
            addCriterion("trade_month not between", value1, value2, "tradeMonth");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNull() {
            addCriterion("bill_type is null");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNotNull() {
            addCriterion("bill_type is not null");
            return (Criteria) this;
        }

        public Criteria andBillTypeEqualTo(Integer value) {
            addCriterion("bill_type =", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotEqualTo(Integer value) {
            addCriterion("bill_type <>", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThan(Integer value) {
            addCriterion("bill_type >", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_type >=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThan(Integer value) {
            addCriterion("bill_type <", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThanOrEqualTo(Integer value) {
            addCriterion("bill_type <=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeIn(List<Integer> values) {
            addCriterion("bill_type in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotIn(List<Integer> values) {
            addCriterion("bill_type not in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeBetween(Integer value1, Integer value2) {
            addCriterion("bill_type between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_type not between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andSourceMerchantIdIsNull() {
            addCriterion("source_merchant_id is null");
            return (Criteria) this;
        }

        public Criteria andSourceMerchantIdIsNotNull() {
            addCriterion("source_merchant_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourceMerchantIdEqualTo(String value) {
            addCriterion("source_merchant_id =", value, "sourceMerchantId");
            return (Criteria) this;
        }

        public Criteria andSourceMerchantIdNotEqualTo(String value) {
            addCriterion("source_merchant_id <>", value, "sourceMerchantId");
            return (Criteria) this;
        }

        public Criteria andSourceMerchantIdGreaterThan(String value) {
            addCriterion("source_merchant_id >", value, "sourceMerchantId");
            return (Criteria) this;
        }

        public Criteria andSourceMerchantIdGreaterThanOrEqualTo(String value) {
            addCriterion("source_merchant_id >=", value, "sourceMerchantId");
            return (Criteria) this;
        }

        public Criteria andSourceMerchantIdLessThan(String value) {
            addCriterion("source_merchant_id <", value, "sourceMerchantId");
            return (Criteria) this;
        }

        public Criteria andSourceMerchantIdLessThanOrEqualTo(String value) {
            addCriterion("source_merchant_id <=", value, "sourceMerchantId");
            return (Criteria) this;
        }

        public Criteria andSourceMerchantIdLike(String value) {
            addCriterion("source_merchant_id like", value, "sourceMerchantId");
            return (Criteria) this;
        }

        public Criteria andSourceMerchantIdNotLike(String value) {
            addCriterion("source_merchant_id not like", value, "sourceMerchantId");
            return (Criteria) this;
        }

        public Criteria andSourceMerchantIdIn(List<String> values) {
            addCriterion("source_merchant_id in", values, "sourceMerchantId");
            return (Criteria) this;
        }

        public Criteria andSourceMerchantIdNotIn(List<String> values) {
            addCriterion("source_merchant_id not in", values, "sourceMerchantId");
            return (Criteria) this;
        }

        public Criteria andSourceMerchantIdBetween(String value1, String value2) {
            addCriterion("source_merchant_id between", value1, value2, "sourceMerchantId");
            return (Criteria) this;
        }

        public Criteria andSourceMerchantIdNotBetween(String value1, String value2) {
            addCriterion("source_merchant_id not between", value1, value2, "sourceMerchantId");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantIdIsNull() {
            addCriterion("sqb_merchant_id is null");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantIdIsNotNull() {
            addCriterion("sqb_merchant_id is not null");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantIdEqualTo(String value) {
            addCriterion("sqb_merchant_id =", value, "sqbMerchantId");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantIdNotEqualTo(String value) {
            addCriterion("sqb_merchant_id <>", value, "sqbMerchantId");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantIdGreaterThan(String value) {
            addCriterion("sqb_merchant_id >", value, "sqbMerchantId");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantIdGreaterThanOrEqualTo(String value) {
            addCriterion("sqb_merchant_id >=", value, "sqbMerchantId");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantIdLessThan(String value) {
            addCriterion("sqb_merchant_id <", value, "sqbMerchantId");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantIdLessThanOrEqualTo(String value) {
            addCriterion("sqb_merchant_id <=", value, "sqbMerchantId");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantIdLike(String value) {
            addCriterion("sqb_merchant_id like", value, "sqbMerchantId");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantIdNotLike(String value) {
            addCriterion("sqb_merchant_id not like", value, "sqbMerchantId");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantIdIn(List<String> values) {
            addCriterion("sqb_merchant_id in", values, "sqbMerchantId");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantIdNotIn(List<String> values) {
            addCriterion("sqb_merchant_id not in", values, "sqbMerchantId");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantIdBetween(String value1, String value2) {
            addCriterion("sqb_merchant_id between", value1, value2, "sqbMerchantId");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantIdNotBetween(String value1, String value2) {
            addCriterion("sqb_merchant_id not between", value1, value2, "sqbMerchantId");
            return (Criteria) this;
        }

        public Criteria andSqbTradeNumIsNull() {
            addCriterion("sqb_trade_num is null");
            return (Criteria) this;
        }

        public Criteria andSqbTradeNumIsNotNull() {
            addCriterion("sqb_trade_num is not null");
            return (Criteria) this;
        }

        public Criteria andSqbTradeNumEqualTo(Integer value) {
            addCriterion("sqb_trade_num =", value, "sqbTradeNum");
            return (Criteria) this;
        }

        public Criteria andSqbTradeNumNotEqualTo(Integer value) {
            addCriterion("sqb_trade_num <>", value, "sqbTradeNum");
            return (Criteria) this;
        }

        public Criteria andSqbTradeNumGreaterThan(Integer value) {
            addCriterion("sqb_trade_num >", value, "sqbTradeNum");
            return (Criteria) this;
        }

        public Criteria andSqbTradeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sqb_trade_num >=", value, "sqbTradeNum");
            return (Criteria) this;
        }

        public Criteria andSqbTradeNumLessThan(Integer value) {
            addCriterion("sqb_trade_num <", value, "sqbTradeNum");
            return (Criteria) this;
        }

        public Criteria andSqbTradeNumLessThanOrEqualTo(Integer value) {
            addCriterion("sqb_trade_num <=", value, "sqbTradeNum");
            return (Criteria) this;
        }

        public Criteria andSqbTradeNumIn(List<Integer> values) {
            addCriterion("sqb_trade_num in", values, "sqbTradeNum");
            return (Criteria) this;
        }

        public Criteria andSqbTradeNumNotIn(List<Integer> values) {
            addCriterion("sqb_trade_num not in", values, "sqbTradeNum");
            return (Criteria) this;
        }

        public Criteria andSqbTradeNumBetween(Integer value1, Integer value2) {
            addCriterion("sqb_trade_num between", value1, value2, "sqbTradeNum");
            return (Criteria) this;
        }

        public Criteria andSqbTradeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sqb_trade_num not between", value1, value2, "sqbTradeNum");
            return (Criteria) this;
        }

        public Criteria andSqbTradeMoneyIsNull() {
            addCriterion("sqb_trade_money is null");
            return (Criteria) this;
        }

        public Criteria andSqbTradeMoneyIsNotNull() {
            addCriterion("sqb_trade_money is not null");
            return (Criteria) this;
        }

        public Criteria andSqbTradeMoneyEqualTo(Long value) {
            addCriterion("sqb_trade_money =", value, "sqbTradeMoney");
            return (Criteria) this;
        }

        public Criteria andSqbTradeMoneyNotEqualTo(Long value) {
            addCriterion("sqb_trade_money <>", value, "sqbTradeMoney");
            return (Criteria) this;
        }

        public Criteria andSqbTradeMoneyGreaterThan(Long value) {
            addCriterion("sqb_trade_money >", value, "sqbTradeMoney");
            return (Criteria) this;
        }

        public Criteria andSqbTradeMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("sqb_trade_money >=", value, "sqbTradeMoney");
            return (Criteria) this;
        }

        public Criteria andSqbTradeMoneyLessThan(Long value) {
            addCriterion("sqb_trade_money <", value, "sqbTradeMoney");
            return (Criteria) this;
        }

        public Criteria andSqbTradeMoneyLessThanOrEqualTo(Long value) {
            addCriterion("sqb_trade_money <=", value, "sqbTradeMoney");
            return (Criteria) this;
        }

        public Criteria andSqbTradeMoneyIn(List<Long> values) {
            addCriterion("sqb_trade_money in", values, "sqbTradeMoney");
            return (Criteria) this;
        }

        public Criteria andSqbTradeMoneyNotIn(List<Long> values) {
            addCriterion("sqb_trade_money not in", values, "sqbTradeMoney");
            return (Criteria) this;
        }

        public Criteria andSqbTradeMoneyBetween(Long value1, Long value2) {
            addCriterion("sqb_trade_money between", value1, value2, "sqbTradeMoney");
            return (Criteria) this;
        }

        public Criteria andSqbTradeMoneyNotBetween(Long value1, Long value2) {
            addCriterion("sqb_trade_money not between", value1, value2, "sqbTradeMoney");
            return (Criteria) this;
        }

        public Criteria andSqbRefundNumIsNull() {
            addCriterion("sqb_refund_num is null");
            return (Criteria) this;
        }

        public Criteria andSqbRefundNumIsNotNull() {
            addCriterion("sqb_refund_num is not null");
            return (Criteria) this;
        }

        public Criteria andSqbRefundNumEqualTo(Integer value) {
            addCriterion("sqb_refund_num =", value, "sqbRefundNum");
            return (Criteria) this;
        }

        public Criteria andSqbRefundNumNotEqualTo(Integer value) {
            addCriterion("sqb_refund_num <>", value, "sqbRefundNum");
            return (Criteria) this;
        }

        public Criteria andSqbRefundNumGreaterThan(Integer value) {
            addCriterion("sqb_refund_num >", value, "sqbRefundNum");
            return (Criteria) this;
        }

        public Criteria andSqbRefundNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sqb_refund_num >=", value, "sqbRefundNum");
            return (Criteria) this;
        }

        public Criteria andSqbRefundNumLessThan(Integer value) {
            addCriterion("sqb_refund_num <", value, "sqbRefundNum");
            return (Criteria) this;
        }

        public Criteria andSqbRefundNumLessThanOrEqualTo(Integer value) {
            addCriterion("sqb_refund_num <=", value, "sqbRefundNum");
            return (Criteria) this;
        }

        public Criteria andSqbRefundNumIn(List<Integer> values) {
            addCriterion("sqb_refund_num in", values, "sqbRefundNum");
            return (Criteria) this;
        }

        public Criteria andSqbRefundNumNotIn(List<Integer> values) {
            addCriterion("sqb_refund_num not in", values, "sqbRefundNum");
            return (Criteria) this;
        }

        public Criteria andSqbRefundNumBetween(Integer value1, Integer value2) {
            addCriterion("sqb_refund_num between", value1, value2, "sqbRefundNum");
            return (Criteria) this;
        }

        public Criteria andSqbRefundNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sqb_refund_num not between", value1, value2, "sqbRefundNum");
            return (Criteria) this;
        }

        public Criteria andSqbRefundMoneyIsNull() {
            addCriterion("sqb_refund_money is null");
            return (Criteria) this;
        }

        public Criteria andSqbRefundMoneyIsNotNull() {
            addCriterion("sqb_refund_money is not null");
            return (Criteria) this;
        }

        public Criteria andSqbRefundMoneyEqualTo(Long value) {
            addCriterion("sqb_refund_money =", value, "sqbRefundMoney");
            return (Criteria) this;
        }

        public Criteria andSqbRefundMoneyNotEqualTo(Long value) {
            addCriterion("sqb_refund_money <>", value, "sqbRefundMoney");
            return (Criteria) this;
        }

        public Criteria andSqbRefundMoneyGreaterThan(Long value) {
            addCriterion("sqb_refund_money >", value, "sqbRefundMoney");
            return (Criteria) this;
        }

        public Criteria andSqbRefundMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("sqb_refund_money >=", value, "sqbRefundMoney");
            return (Criteria) this;
        }

        public Criteria andSqbRefundMoneyLessThan(Long value) {
            addCriterion("sqb_refund_money <", value, "sqbRefundMoney");
            return (Criteria) this;
        }

        public Criteria andSqbRefundMoneyLessThanOrEqualTo(Long value) {
            addCriterion("sqb_refund_money <=", value, "sqbRefundMoney");
            return (Criteria) this;
        }

        public Criteria andSqbRefundMoneyIn(List<Long> values) {
            addCriterion("sqb_refund_money in", values, "sqbRefundMoney");
            return (Criteria) this;
        }

        public Criteria andSqbRefundMoneyNotIn(List<Long> values) {
            addCriterion("sqb_refund_money not in", values, "sqbRefundMoney");
            return (Criteria) this;
        }

        public Criteria andSqbRefundMoneyBetween(Long value1, Long value2) {
            addCriterion("sqb_refund_money between", value1, value2, "sqbRefundMoney");
            return (Criteria) this;
        }

        public Criteria andSqbRefundMoneyNotBetween(Long value1, Long value2) {
            addCriterion("sqb_refund_money not between", value1, value2, "sqbRefundMoney");
            return (Criteria) this;
        }

        public Criteria andDimensionIsNull() {
            addCriterion("dimension is null");
            return (Criteria) this;
        }

        public Criteria andDimensionIsNotNull() {
            addCriterion("dimension is not null");
            return (Criteria) this;
        }

        public Criteria andDimensionEqualTo(String value) {
            addCriterion("dimension =", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionNotEqualTo(String value) {
            addCriterion("dimension <>", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionGreaterThan(String value) {
            addCriterion("dimension >", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionGreaterThanOrEqualTo(String value) {
            addCriterion("dimension >=", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionLessThan(String value) {
            addCriterion("dimension <", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionLessThanOrEqualTo(String value) {
            addCriterion("dimension <=", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionLike(String value) {
            addCriterion("dimension like", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionNotLike(String value) {
            addCriterion("dimension not like", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionIn(List<String> values) {
            addCriterion("dimension in", values, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionNotIn(List<String> values) {
            addCriterion("dimension not in", values, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionBetween(String value1, String value2) {
            addCriterion("dimension between", value1, value2, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionNotBetween(String value1, String value2) {
            addCriterion("dimension not between", value1, value2, "dimension");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Date value) {
            addCriterion("create_at =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Date value) {
            addCriterion("create_at <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Date value) {
            addCriterion("create_at >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("create_at >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Date value) {
            addCriterion("create_at <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Date value) {
            addCriterion("create_at <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Date> values) {
            addCriterion("create_at in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Date> values) {
            addCriterion("create_at not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Date value1, Date value2) {
            addCriterion("create_at between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Date value1, Date value2) {
            addCriterion("create_at not between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantSnIsNull() {
            addCriterion("sqb_merchant_sn is null");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantSnIsNotNull() {
            addCriterion("sqb_merchant_sn is not null");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantSnEqualTo(String value) {
            addCriterion("sqb_merchant_sn =", value, "sqbMerchantSn");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantSnNotEqualTo(String value) {
            addCriterion("sqb_merchant_sn <>", value, "sqbMerchantSn");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantSnGreaterThan(String value) {
            addCriterion("sqb_merchant_sn >", value, "sqbMerchantSn");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantSnGreaterThanOrEqualTo(String value) {
            addCriterion("sqb_merchant_sn >=", value, "sqbMerchantSn");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantSnLessThan(String value) {
            addCriterion("sqb_merchant_sn <", value, "sqbMerchantSn");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantSnLessThanOrEqualTo(String value) {
            addCriterion("sqb_merchant_sn <=", value, "sqbMerchantSn");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantSnLike(String value) {
            addCriterion("sqb_merchant_sn like", value, "sqbMerchantSn");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantSnNotLike(String value) {
            addCriterion("sqb_merchant_sn not like", value, "sqbMerchantSn");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantSnIn(List<String> values) {
            addCriterion("sqb_merchant_sn in", values, "sqbMerchantSn");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantSnNotIn(List<String> values) {
            addCriterion("sqb_merchant_sn not in", values, "sqbMerchantSn");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantSnBetween(String value1, String value2) {
            addCriterion("sqb_merchant_sn between", value1, value2, "sqbMerchantSn");
            return (Criteria) this;
        }

        public Criteria andSqbMerchantSnNotBetween(String value1, String value2) {
            addCriterion("sqb_merchant_sn not between", value1, value2, "sqbMerchantSn");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}