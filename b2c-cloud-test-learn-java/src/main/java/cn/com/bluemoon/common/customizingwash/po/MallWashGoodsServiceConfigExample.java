package cn.com.bluemoon.common.customizingwash.po;

import java.util.ArrayList;
import java.util.List;

public class MallWashGoodsServiceConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MallWashGoodsServiceConfigExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Long value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Long value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Long value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Long value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Long value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Long value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Long> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Long> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Long value1, Long value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Long value1, Long value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNull() {
            addCriterion("goods_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNotNull() {
            addCriterion("goods_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeEqualTo(String value) {
            addCriterion("goods_code =", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotEqualTo(String value) {
            addCriterion("goods_code <>", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThan(String value) {
            addCriterion("goods_code >", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_code >=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThan(String value) {
            addCriterion("goods_code <", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThanOrEqualTo(String value) {
            addCriterion("goods_code <=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLike(String value) {
            addCriterion("goods_code like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotLike(String value) {
            addCriterion("goods_code not like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIn(List<String> values) {
            addCriterion("goods_code in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotIn(List<String> values) {
            addCriterion("goods_code not in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeBetween(String value1, String value2) {
            addCriterion("goods_code between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotBetween(String value1, String value2) {
            addCriterion("goods_code not between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andServiceItemNameIsNull() {
            addCriterion("service_item_name is null");
            return (Criteria) this;
        }

        public Criteria andServiceItemNameIsNotNull() {
            addCriterion("service_item_name is not null");
            return (Criteria) this;
        }

        public Criteria andServiceItemNameEqualTo(String value) {
            addCriterion("service_item_name =", value, "serviceItemName");
            return (Criteria) this;
        }

        public Criteria andServiceItemNameNotEqualTo(String value) {
            addCriterion("service_item_name <>", value, "serviceItemName");
            return (Criteria) this;
        }

        public Criteria andServiceItemNameGreaterThan(String value) {
            addCriterion("service_item_name >", value, "serviceItemName");
            return (Criteria) this;
        }

        public Criteria andServiceItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("service_item_name >=", value, "serviceItemName");
            return (Criteria) this;
        }

        public Criteria andServiceItemNameLessThan(String value) {
            addCriterion("service_item_name <", value, "serviceItemName");
            return (Criteria) this;
        }

        public Criteria andServiceItemNameLessThanOrEqualTo(String value) {
            addCriterion("service_item_name <=", value, "serviceItemName");
            return (Criteria) this;
        }

        public Criteria andServiceItemNameLike(String value) {
            addCriterion("service_item_name like", value, "serviceItemName");
            return (Criteria) this;
        }

        public Criteria andServiceItemNameNotLike(String value) {
            addCriterion("service_item_name not like", value, "serviceItemName");
            return (Criteria) this;
        }

        public Criteria andServiceItemNameIn(List<String> values) {
            addCriterion("service_item_name in", values, "serviceItemName");
            return (Criteria) this;
        }

        public Criteria andServiceItemNameNotIn(List<String> values) {
            addCriterion("service_item_name not in", values, "serviceItemName");
            return (Criteria) this;
        }

        public Criteria andServiceItemNameBetween(String value1, String value2) {
            addCriterion("service_item_name between", value1, value2, "serviceItemName");
            return (Criteria) this;
        }

        public Criteria andServiceItemNameNotBetween(String value1, String value2) {
            addCriterion("service_item_name not between", value1, value2, "serviceItemName");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNameIsNull() {
            addCriterion("service_type_name is null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNameIsNotNull() {
            addCriterion("service_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNameEqualTo(String value) {
            addCriterion("service_type_name =", value, "serviceTypeName");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNameNotEqualTo(String value) {
            addCriterion("service_type_name <>", value, "serviceTypeName");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNameGreaterThan(String value) {
            addCriterion("service_type_name >", value, "serviceTypeName");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("service_type_name >=", value, "serviceTypeName");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNameLessThan(String value) {
            addCriterion("service_type_name <", value, "serviceTypeName");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNameLessThanOrEqualTo(String value) {
            addCriterion("service_type_name <=", value, "serviceTypeName");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNameLike(String value) {
            addCriterion("service_type_name like", value, "serviceTypeName");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNameNotLike(String value) {
            addCriterion("service_type_name not like", value, "serviceTypeName");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNameIn(List<String> values) {
            addCriterion("service_type_name in", values, "serviceTypeName");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNameNotIn(List<String> values) {
            addCriterion("service_type_name not in", values, "serviceTypeName");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNameBetween(String value1, String value2) {
            addCriterion("service_type_name between", value1, value2, "serviceTypeName");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNameNotBetween(String value1, String value2) {
            addCriterion("service_type_name not between", value1, value2, "serviceTypeName");
            return (Criteria) this;
        }

        public Criteria andDefaultServiceFlagIsNull() {
            addCriterion("default_service_flag is null");
            return (Criteria) this;
        }

        public Criteria andDefaultServiceFlagIsNotNull() {
            addCriterion("default_service_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultServiceFlagEqualTo(Integer value) {
            addCriterion("default_service_flag =", value, "defaultServiceFlag");
            return (Criteria) this;
        }

        public Criteria andDefaultServiceFlagNotEqualTo(Integer value) {
            addCriterion("default_service_flag <>", value, "defaultServiceFlag");
            return (Criteria) this;
        }

        public Criteria andDefaultServiceFlagGreaterThan(Integer value) {
            addCriterion("default_service_flag >", value, "defaultServiceFlag");
            return (Criteria) this;
        }

        public Criteria andDefaultServiceFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("default_service_flag >=", value, "defaultServiceFlag");
            return (Criteria) this;
        }

        public Criteria andDefaultServiceFlagLessThan(Integer value) {
            addCriterion("default_service_flag <", value, "defaultServiceFlag");
            return (Criteria) this;
        }

        public Criteria andDefaultServiceFlagLessThanOrEqualTo(Integer value) {
            addCriterion("default_service_flag <=", value, "defaultServiceFlag");
            return (Criteria) this;
        }

        public Criteria andDefaultServiceFlagIn(List<Integer> values) {
            addCriterion("default_service_flag in", values, "defaultServiceFlag");
            return (Criteria) this;
        }

        public Criteria andDefaultServiceFlagNotIn(List<Integer> values) {
            addCriterion("default_service_flag not in", values, "defaultServiceFlag");
            return (Criteria) this;
        }

        public Criteria andDefaultServiceFlagBetween(Integer value1, Integer value2) {
            addCriterion("default_service_flag between", value1, value2, "defaultServiceFlag");
            return (Criteria) this;
        }

        public Criteria andDefaultServiceFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("default_service_flag not between", value1, value2, "defaultServiceFlag");
            return (Criteria) this;
        }

        public Criteria andItemRefIsNull() {
            addCriterion("item_ref is null");
            return (Criteria) this;
        }

        public Criteria andItemRefIsNotNull() {
            addCriterion("item_ref is not null");
            return (Criteria) this;
        }

        public Criteria andItemRefEqualTo(String value) {
            addCriterion("item_ref =", value, "itemRef");
            return (Criteria) this;
        }

        public Criteria andItemRefNotEqualTo(String value) {
            addCriterion("item_ref <>", value, "itemRef");
            return (Criteria) this;
        }

        public Criteria andItemRefGreaterThan(String value) {
            addCriterion("item_ref >", value, "itemRef");
            return (Criteria) this;
        }

        public Criteria andItemRefGreaterThanOrEqualTo(String value) {
            addCriterion("item_ref >=", value, "itemRef");
            return (Criteria) this;
        }

        public Criteria andItemRefLessThan(String value) {
            addCriterion("item_ref <", value, "itemRef");
            return (Criteria) this;
        }

        public Criteria andItemRefLessThanOrEqualTo(String value) {
            addCriterion("item_ref <=", value, "itemRef");
            return (Criteria) this;
        }

        public Criteria andItemRefLike(String value) {
            addCriterion("item_ref like", value, "itemRef");
            return (Criteria) this;
        }

        public Criteria andItemRefNotLike(String value) {
            addCriterion("item_ref not like", value, "itemRef");
            return (Criteria) this;
        }

        public Criteria andItemRefIn(List<String> values) {
            addCriterion("item_ref in", values, "itemRef");
            return (Criteria) this;
        }

        public Criteria andItemRefNotIn(List<String> values) {
            addCriterion("item_ref not in", values, "itemRef");
            return (Criteria) this;
        }

        public Criteria andItemRefBetween(String value1, String value2) {
            addCriterion("item_ref between", value1, value2, "itemRef");
            return (Criteria) this;
        }

        public Criteria andItemRefNotBetween(String value1, String value2) {
            addCriterion("item_ref not between", value1, value2, "itemRef");
            return (Criteria) this;
        }

        public Criteria andServicePriceIsNull() {
            addCriterion("service_price is null");
            return (Criteria) this;
        }

        public Criteria andServicePriceIsNotNull() {
            addCriterion("service_price is not null");
            return (Criteria) this;
        }

        public Criteria andServicePriceEqualTo(Integer value) {
            addCriterion("service_price =", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceNotEqualTo(Integer value) {
            addCriterion("service_price <>", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceGreaterThan(Integer value) {
            addCriterion("service_price >", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_price >=", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceLessThan(Integer value) {
            addCriterion("service_price <", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceLessThanOrEqualTo(Integer value) {
            addCriterion("service_price <=", value, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceIn(List<Integer> values) {
            addCriterion("service_price in", values, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceNotIn(List<Integer> values) {
            addCriterion("service_price not in", values, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceBetween(Integer value1, Integer value2) {
            addCriterion("service_price between", value1, value2, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andServicePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("service_price not between", value1, value2, "servicePrice");
            return (Criteria) this;
        }

        public Criteria andMutualFlagIsNull() {
            addCriterion("mutual_flag is null");
            return (Criteria) this;
        }

        public Criteria andMutualFlagIsNotNull() {
            addCriterion("mutual_flag is not null");
            return (Criteria) this;
        }

        public Criteria andMutualFlagEqualTo(Integer value) {
            addCriterion("mutual_flag =", value, "mutualFlag");
            return (Criteria) this;
        }

        public Criteria andMutualFlagNotEqualTo(Integer value) {
            addCriterion("mutual_flag <>", value, "mutualFlag");
            return (Criteria) this;
        }

        public Criteria andMutualFlagGreaterThan(Integer value) {
            addCriterion("mutual_flag >", value, "mutualFlag");
            return (Criteria) this;
        }

        public Criteria andMutualFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("mutual_flag >=", value, "mutualFlag");
            return (Criteria) this;
        }

        public Criteria andMutualFlagLessThan(Integer value) {
            addCriterion("mutual_flag <", value, "mutualFlag");
            return (Criteria) this;
        }

        public Criteria andMutualFlagLessThanOrEqualTo(Integer value) {
            addCriterion("mutual_flag <=", value, "mutualFlag");
            return (Criteria) this;
        }

        public Criteria andMutualFlagIn(List<Integer> values) {
            addCriterion("mutual_flag in", values, "mutualFlag");
            return (Criteria) this;
        }

        public Criteria andMutualFlagNotIn(List<Integer> values) {
            addCriterion("mutual_flag not in", values, "mutualFlag");
            return (Criteria) this;
        }

        public Criteria andMutualFlagBetween(Integer value1, Integer value2) {
            addCriterion("mutual_flag between", value1, value2, "mutualFlag");
            return (Criteria) this;
        }

        public Criteria andMutualFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("mutual_flag not between", value1, value2, "mutualFlag");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Integer value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Integer value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Integer value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Integer value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Integer value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Integer> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Integer> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Integer value1, Integer value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andServiceTypeSortIsNull() {
            addCriterion("service_type_sort is null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeSortIsNotNull() {
            addCriterion("service_type_sort is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeSortEqualTo(Integer value) {
            addCriterion("service_type_sort =", value, "serviceTypeSort");
            return (Criteria) this;
        }

        public Criteria andServiceTypeSortNotEqualTo(Integer value) {
            addCriterion("service_type_sort <>", value, "serviceTypeSort");
            return (Criteria) this;
        }

        public Criteria andServiceTypeSortGreaterThan(Integer value) {
            addCriterion("service_type_sort >", value, "serviceTypeSort");
            return (Criteria) this;
        }

        public Criteria andServiceTypeSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_type_sort >=", value, "serviceTypeSort");
            return (Criteria) this;
        }

        public Criteria andServiceTypeSortLessThan(Integer value) {
            addCriterion("service_type_sort <", value, "serviceTypeSort");
            return (Criteria) this;
        }

        public Criteria andServiceTypeSortLessThanOrEqualTo(Integer value) {
            addCriterion("service_type_sort <=", value, "serviceTypeSort");
            return (Criteria) this;
        }

        public Criteria andServiceTypeSortIn(List<Integer> values) {
            addCriterion("service_type_sort in", values, "serviceTypeSort");
            return (Criteria) this;
        }

        public Criteria andServiceTypeSortNotIn(List<Integer> values) {
            addCriterion("service_type_sort not in", values, "serviceTypeSort");
            return (Criteria) this;
        }

        public Criteria andServiceTypeSortBetween(Integer value1, Integer value2) {
            addCriterion("service_type_sort between", value1, value2, "serviceTypeSort");
            return (Criteria) this;
        }

        public Criteria andServiceTypeSortNotBetween(Integer value1, Integer value2) {
            addCriterion("service_type_sort not between", value1, value2, "serviceTypeSort");
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