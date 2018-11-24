package com.yulan.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCustomerCodeIsNull() {
            addCriterion("CUSTOMER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIsNotNull() {
            addCriterion("CUSTOMER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeEqualTo(String value) {
            addCriterion("CUSTOMER_CODE =", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotEqualTo(String value) {
            addCriterion("CUSTOMER_CODE <>", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeGreaterThan(String value) {
            addCriterion("CUSTOMER_CODE >", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_CODE >=", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLessThan(String value) {
            addCriterion("CUSTOMER_CODE <", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_CODE <=", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLike(String value) {
            addCriterion("CUSTOMER_CODE like", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotLike(String value) {
            addCriterion("CUSTOMER_CODE not like", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIn(List<String> values) {
            addCriterion("CUSTOMER_CODE in", values, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotIn(List<String> values) {
            addCriterion("CUSTOMER_CODE not in", values, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeBetween(String value1, String value2) {
            addCriterion("CUSTOMER_CODE between", value1, value2, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_CODE not between", value1, value2, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("CUSTOMER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("CUSTOMER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("CUSTOMER_NAME =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("CUSTOMER_NAME >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("CUSTOMER_NAME <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("CUSTOMER_NAME like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("CUSTOMER_NAME not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("CUSTOMER_NAME in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("CUSTOMER_NAME not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNull() {
            addCriterion("STATUS_ID is null");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNotNull() {
            addCriterion("STATUS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStatusIdEqualTo(String value) {
            addCriterion("STATUS_ID =", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotEqualTo(String value) {
            addCriterion("STATUS_ID <>", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThan(String value) {
            addCriterion("STATUS_ID >", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS_ID >=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThan(String value) {
            addCriterion("STATUS_ID <", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThanOrEqualTo(String value) {
            addCriterion("STATUS_ID <=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLike(String value) {
            addCriterion("STATUS_ID like", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotLike(String value) {
            addCriterion("STATUS_ID not like", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdIn(List<String> values) {
            addCriterion("STATUS_ID in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotIn(List<String> values) {
            addCriterion("STATUS_ID not in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdBetween(String value1, String value2) {
            addCriterion("STATUS_ID between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotBetween(String value1, String value2) {
            addCriterion("STATUS_ID not between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andCustomerBelongIsNull() {
            addCriterion("CUSTOMER_BELONG is null");
            return (Criteria) this;
        }

        public Criteria andCustomerBelongIsNotNull() {
            addCriterion("CUSTOMER_BELONG is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerBelongEqualTo(String value) {
            addCriterion("CUSTOMER_BELONG =", value, "customerBelong");
            return (Criteria) this;
        }

        public Criteria andCustomerBelongNotEqualTo(String value) {
            addCriterion("CUSTOMER_BELONG <>", value, "customerBelong");
            return (Criteria) this;
        }

        public Criteria andCustomerBelongGreaterThan(String value) {
            addCriterion("CUSTOMER_BELONG >", value, "customerBelong");
            return (Criteria) this;
        }

        public Criteria andCustomerBelongGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_BELONG >=", value, "customerBelong");
            return (Criteria) this;
        }

        public Criteria andCustomerBelongLessThan(String value) {
            addCriterion("CUSTOMER_BELONG <", value, "customerBelong");
            return (Criteria) this;
        }

        public Criteria andCustomerBelongLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_BELONG <=", value, "customerBelong");
            return (Criteria) this;
        }

        public Criteria andCustomerBelongLike(String value) {
            addCriterion("CUSTOMER_BELONG like", value, "customerBelong");
            return (Criteria) this;
        }

        public Criteria andCustomerBelongNotLike(String value) {
            addCriterion("CUSTOMER_BELONG not like", value, "customerBelong");
            return (Criteria) this;
        }

        public Criteria andCustomerBelongIn(List<String> values) {
            addCriterion("CUSTOMER_BELONG in", values, "customerBelong");
            return (Criteria) this;
        }

        public Criteria andCustomerBelongNotIn(List<String> values) {
            addCriterion("CUSTOMER_BELONG not in", values, "customerBelong");
            return (Criteria) this;
        }

        public Criteria andCustomerBelongBetween(String value1, String value2) {
            addCriterion("CUSTOMER_BELONG between", value1, value2, "customerBelong");
            return (Criteria) this;
        }

        public Criteria andCustomerBelongNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_BELONG not between", value1, value2, "customerBelong");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("AREA_CODE =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("AREA_CODE <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("AREA_CODE >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_CODE >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("AREA_CODE <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("AREA_CODE <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("AREA_CODE like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("AREA_CODE not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("AREA_CODE in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("AREA_CODE not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("AREA_CODE between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("AREA_CODE not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNull() {
            addCriterion("SHORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNotNull() {
            addCriterion("SHORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShortNameEqualTo(String value) {
            addCriterion("SHORT_NAME =", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotEqualTo(String value) {
            addCriterion("SHORT_NAME <>", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThan(String value) {
            addCriterion("SHORT_NAME >", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHORT_NAME >=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThan(String value) {
            addCriterion("SHORT_NAME <", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThanOrEqualTo(String value) {
            addCriterion("SHORT_NAME <=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLike(String value) {
            addCriterion("SHORT_NAME like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotLike(String value) {
            addCriterion("SHORT_NAME not like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameIn(List<String> values) {
            addCriterion("SHORT_NAME in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotIn(List<String> values) {
            addCriterion("SHORT_NAME not in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameBetween(String value1, String value2) {
            addCriterion("SHORT_NAME between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotBetween(String value1, String value2) {
            addCriterion("SHORT_NAME not between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNull() {
            addCriterion("CUSTOMER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNotNull() {
            addCriterion("CUSTOMER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE =", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE <>", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThan(String value) {
            addCriterion("CUSTOMER_TYPE >", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE >=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThan(String value) {
            addCriterion("CUSTOMER_TYPE <", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE <=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLike(String value) {
            addCriterion("CUSTOMER_TYPE like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotLike(String value) {
            addCriterion("CUSTOMER_TYPE not like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIn(List<String> values) {
            addCriterion("CUSTOMER_TYPE in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotIn(List<String> values) {
            addCriterion("CUSTOMER_TYPE not in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeBetween(String value1, String value2) {
            addCriterion("CUSTOMER_TYPE between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_TYPE not between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerCode3IsNull() {
            addCriterion("CUSTOMER_CODE_3 is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCode3IsNotNull() {
            addCriterion("CUSTOMER_CODE_3 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCode3EqualTo(String value) {
            addCriterion("CUSTOMER_CODE_3 =", value, "customerCode3");
            return (Criteria) this;
        }

        public Criteria andCustomerCode3NotEqualTo(String value) {
            addCriterion("CUSTOMER_CODE_3 <>", value, "customerCode3");
            return (Criteria) this;
        }

        public Criteria andCustomerCode3GreaterThan(String value) {
            addCriterion("CUSTOMER_CODE_3 >", value, "customerCode3");
            return (Criteria) this;
        }

        public Criteria andCustomerCode3GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_CODE_3 >=", value, "customerCode3");
            return (Criteria) this;
        }

        public Criteria andCustomerCode3LessThan(String value) {
            addCriterion("CUSTOMER_CODE_3 <", value, "customerCode3");
            return (Criteria) this;
        }

        public Criteria andCustomerCode3LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_CODE_3 <=", value, "customerCode3");
            return (Criteria) this;
        }

        public Criteria andCustomerCode3Like(String value) {
            addCriterion("CUSTOMER_CODE_3 like", value, "customerCode3");
            return (Criteria) this;
        }

        public Criteria andCustomerCode3NotLike(String value) {
            addCriterion("CUSTOMER_CODE_3 not like", value, "customerCode3");
            return (Criteria) this;
        }

        public Criteria andCustomerCode3In(List<String> values) {
            addCriterion("CUSTOMER_CODE_3 in", values, "customerCode3");
            return (Criteria) this;
        }

        public Criteria andCustomerCode3NotIn(List<String> values) {
            addCriterion("CUSTOMER_CODE_3 not in", values, "customerCode3");
            return (Criteria) this;
        }

        public Criteria andCustomerCode3Between(String value1, String value2) {
            addCriterion("CUSTOMER_CODE_3 between", value1, value2, "customerCode3");
            return (Criteria) this;
        }

        public Criteria andCustomerCode3NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_CODE_3 not between", value1, value2, "customerCode3");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("DISTRICT is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("DISTRICT is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("DISTRICT =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("DISTRICT <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("DISTRICT >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("DISTRICT >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("DISTRICT <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("DISTRICT <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("DISTRICT like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("DISTRICT not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("DISTRICT in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("DISTRICT not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("DISTRICT between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("DISTRICT not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityTypeIsNull() {
            addCriterion("CITY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCityTypeIsNotNull() {
            addCriterion("CITY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCityTypeEqualTo(String value) {
            addCriterion("CITY_TYPE =", value, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeNotEqualTo(String value) {
            addCriterion("CITY_TYPE <>", value, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeGreaterThan(String value) {
            addCriterion("CITY_TYPE >", value, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_TYPE >=", value, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeLessThan(String value) {
            addCriterion("CITY_TYPE <", value, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeLessThanOrEqualTo(String value) {
            addCriterion("CITY_TYPE <=", value, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeLike(String value) {
            addCriterion("CITY_TYPE like", value, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeNotLike(String value) {
            addCriterion("CITY_TYPE not like", value, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeIn(List<String> values) {
            addCriterion("CITY_TYPE in", values, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeNotIn(List<String> values) {
            addCriterion("CITY_TYPE not in", values, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeBetween(String value1, String value2) {
            addCriterion("CITY_TYPE between", value1, value2, "cityType");
            return (Criteria) this;
        }

        public Criteria andCityTypeNotBetween(String value1, String value2) {
            addCriterion("CITY_TYPE not between", value1, value2, "cityType");
            return (Criteria) this;
        }

        public Criteria andAgencyStatusIsNull() {
            addCriterion("AGENCY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAgencyStatusIsNotNull() {
            addCriterion("AGENCY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyStatusEqualTo(String value) {
            addCriterion("AGENCY_STATUS =", value, "agencyStatus");
            return (Criteria) this;
        }

        public Criteria andAgencyStatusNotEqualTo(String value) {
            addCriterion("AGENCY_STATUS <>", value, "agencyStatus");
            return (Criteria) this;
        }

        public Criteria andAgencyStatusGreaterThan(String value) {
            addCriterion("AGENCY_STATUS >", value, "agencyStatus");
            return (Criteria) this;
        }

        public Criteria andAgencyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("AGENCY_STATUS >=", value, "agencyStatus");
            return (Criteria) this;
        }

        public Criteria andAgencyStatusLessThan(String value) {
            addCriterion("AGENCY_STATUS <", value, "agencyStatus");
            return (Criteria) this;
        }

        public Criteria andAgencyStatusLessThanOrEqualTo(String value) {
            addCriterion("AGENCY_STATUS <=", value, "agencyStatus");
            return (Criteria) this;
        }

        public Criteria andAgencyStatusLike(String value) {
            addCriterion("AGENCY_STATUS like", value, "agencyStatus");
            return (Criteria) this;
        }

        public Criteria andAgencyStatusNotLike(String value) {
            addCriterion("AGENCY_STATUS not like", value, "agencyStatus");
            return (Criteria) this;
        }

        public Criteria andAgencyStatusIn(List<String> values) {
            addCriterion("AGENCY_STATUS in", values, "agencyStatus");
            return (Criteria) this;
        }

        public Criteria andAgencyStatusNotIn(List<String> values) {
            addCriterion("AGENCY_STATUS not in", values, "agencyStatus");
            return (Criteria) this;
        }

        public Criteria andAgencyStatusBetween(String value1, String value2) {
            addCriterion("AGENCY_STATUS between", value1, value2, "agencyStatus");
            return (Criteria) this;
        }

        public Criteria andAgencyStatusNotBetween(String value1, String value2) {
            addCriterion("AGENCY_STATUS not between", value1, value2, "agencyStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerZtIsNull() {
            addCriterion("CUSTOMER_ZT is null");
            return (Criteria) this;
        }

        public Criteria andCustomerZtIsNotNull() {
            addCriterion("CUSTOMER_ZT is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerZtEqualTo(String value) {
            addCriterion("CUSTOMER_ZT =", value, "customerZt");
            return (Criteria) this;
        }

        public Criteria andCustomerZtNotEqualTo(String value) {
            addCriterion("CUSTOMER_ZT <>", value, "customerZt");
            return (Criteria) this;
        }

        public Criteria andCustomerZtGreaterThan(String value) {
            addCriterion("CUSTOMER_ZT >", value, "customerZt");
            return (Criteria) this;
        }

        public Criteria andCustomerZtGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ZT >=", value, "customerZt");
            return (Criteria) this;
        }

        public Criteria andCustomerZtLessThan(String value) {
            addCriterion("CUSTOMER_ZT <", value, "customerZt");
            return (Criteria) this;
        }

        public Criteria andCustomerZtLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ZT <=", value, "customerZt");
            return (Criteria) this;
        }

        public Criteria andCustomerZtLike(String value) {
            addCriterion("CUSTOMER_ZT like", value, "customerZt");
            return (Criteria) this;
        }

        public Criteria andCustomerZtNotLike(String value) {
            addCriterion("CUSTOMER_ZT not like", value, "customerZt");
            return (Criteria) this;
        }

        public Criteria andCustomerZtIn(List<String> values) {
            addCriterion("CUSTOMER_ZT in", values, "customerZt");
            return (Criteria) this;
        }

        public Criteria andCustomerZtNotIn(List<String> values) {
            addCriterion("CUSTOMER_ZT not in", values, "customerZt");
            return (Criteria) this;
        }

        public Criteria andCustomerZtBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ZT between", value1, value2, "customerZt");
            return (Criteria) this;
        }

        public Criteria andCustomerZtNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ZT not between", value1, value2, "customerZt");
            return (Criteria) this;
        }

        public Criteria andO2oFlagIsNull() {
            addCriterion("O2O_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andO2oFlagIsNotNull() {
            addCriterion("O2O_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andO2oFlagEqualTo(String value) {
            addCriterion("O2O_FLAG =", value, "o2oFlag");
            return (Criteria) this;
        }

        public Criteria andO2oFlagNotEqualTo(String value) {
            addCriterion("O2O_FLAG <>", value, "o2oFlag");
            return (Criteria) this;
        }

        public Criteria andO2oFlagGreaterThan(String value) {
            addCriterion("O2O_FLAG >", value, "o2oFlag");
            return (Criteria) this;
        }

        public Criteria andO2oFlagGreaterThanOrEqualTo(String value) {
            addCriterion("O2O_FLAG >=", value, "o2oFlag");
            return (Criteria) this;
        }

        public Criteria andO2oFlagLessThan(String value) {
            addCriterion("O2O_FLAG <", value, "o2oFlag");
            return (Criteria) this;
        }

        public Criteria andO2oFlagLessThanOrEqualTo(String value) {
            addCriterion("O2O_FLAG <=", value, "o2oFlag");
            return (Criteria) this;
        }

        public Criteria andO2oFlagLike(String value) {
            addCriterion("O2O_FLAG like", value, "o2oFlag");
            return (Criteria) this;
        }

        public Criteria andO2oFlagNotLike(String value) {
            addCriterion("O2O_FLAG not like", value, "o2oFlag");
            return (Criteria) this;
        }

        public Criteria andO2oFlagIn(List<String> values) {
            addCriterion("O2O_FLAG in", values, "o2oFlag");
            return (Criteria) this;
        }

        public Criteria andO2oFlagNotIn(List<String> values) {
            addCriterion("O2O_FLAG not in", values, "o2oFlag");
            return (Criteria) this;
        }

        public Criteria andO2oFlagBetween(String value1, String value2) {
            addCriterion("O2O_FLAG between", value1, value2, "o2oFlag");
            return (Criteria) this;
        }

        public Criteria andO2oFlagNotBetween(String value1, String value2) {
            addCriterion("O2O_FLAG not between", value1, value2, "o2oFlag");
            return (Criteria) this;
        }

        public Criteria andAreaDistrictIsNull() {
            addCriterion("AREA_DISTRICT is null");
            return (Criteria) this;
        }

        public Criteria andAreaDistrictIsNotNull() {
            addCriterion("AREA_DISTRICT is not null");
            return (Criteria) this;
        }

        public Criteria andAreaDistrictEqualTo(String value) {
            addCriterion("AREA_DISTRICT =", value, "areaDistrict");
            return (Criteria) this;
        }

        public Criteria andAreaDistrictNotEqualTo(String value) {
            addCriterion("AREA_DISTRICT <>", value, "areaDistrict");
            return (Criteria) this;
        }

        public Criteria andAreaDistrictGreaterThan(String value) {
            addCriterion("AREA_DISTRICT >", value, "areaDistrict");
            return (Criteria) this;
        }

        public Criteria andAreaDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_DISTRICT >=", value, "areaDistrict");
            return (Criteria) this;
        }

        public Criteria andAreaDistrictLessThan(String value) {
            addCriterion("AREA_DISTRICT <", value, "areaDistrict");
            return (Criteria) this;
        }

        public Criteria andAreaDistrictLessThanOrEqualTo(String value) {
            addCriterion("AREA_DISTRICT <=", value, "areaDistrict");
            return (Criteria) this;
        }

        public Criteria andAreaDistrictLike(String value) {
            addCriterion("AREA_DISTRICT like", value, "areaDistrict");
            return (Criteria) this;
        }

        public Criteria andAreaDistrictNotLike(String value) {
            addCriterion("AREA_DISTRICT not like", value, "areaDistrict");
            return (Criteria) this;
        }

        public Criteria andAreaDistrictIn(List<String> values) {
            addCriterion("AREA_DISTRICT in", values, "areaDistrict");
            return (Criteria) this;
        }

        public Criteria andAreaDistrictNotIn(List<String> values) {
            addCriterion("AREA_DISTRICT not in", values, "areaDistrict");
            return (Criteria) this;
        }

        public Criteria andAreaDistrictBetween(String value1, String value2) {
            addCriterion("AREA_DISTRICT between", value1, value2, "areaDistrict");
            return (Criteria) this;
        }

        public Criteria andAreaDistrictNotBetween(String value1, String value2) {
            addCriterion("AREA_DISTRICT not between", value1, value2, "areaDistrict");
            return (Criteria) this;
        }

        public Criteria andBalanceReceiveIsNull() {
            addCriterion("BALANCE_RECEIVE is null");
            return (Criteria) this;
        }

        public Criteria andBalanceReceiveIsNotNull() {
            addCriterion("BALANCE_RECEIVE is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceReceiveEqualTo(BigDecimal value) {
            addCriterion("BALANCE_RECEIVE =", value, "balanceReceive");
            return (Criteria) this;
        }

        public Criteria andBalanceReceiveNotEqualTo(BigDecimal value) {
            addCriterion("BALANCE_RECEIVE <>", value, "balanceReceive");
            return (Criteria) this;
        }

        public Criteria andBalanceReceiveGreaterThan(BigDecimal value) {
            addCriterion("BALANCE_RECEIVE >", value, "balanceReceive");
            return (Criteria) this;
        }

        public Criteria andBalanceReceiveGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCE_RECEIVE >=", value, "balanceReceive");
            return (Criteria) this;
        }

        public Criteria andBalanceReceiveLessThan(BigDecimal value) {
            addCriterion("BALANCE_RECEIVE <", value, "balanceReceive");
            return (Criteria) this;
        }

        public Criteria andBalanceReceiveLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCE_RECEIVE <=", value, "balanceReceive");
            return (Criteria) this;
        }

        public Criteria andBalanceReceiveIn(List<BigDecimal> values) {
            addCriterion("BALANCE_RECEIVE in", values, "balanceReceive");
            return (Criteria) this;
        }

        public Criteria andBalanceReceiveNotIn(List<BigDecimal> values) {
            addCriterion("BALANCE_RECEIVE not in", values, "balanceReceive");
            return (Criteria) this;
        }

        public Criteria andBalanceReceiveBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCE_RECEIVE between", value1, value2, "balanceReceive");
            return (Criteria) this;
        }

        public Criteria andBalanceReceiveNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCE_RECEIVE not between", value1, value2, "balanceReceive");
            return (Criteria) this;
        }

        public Criteria andCreditCodeIsNull() {
            addCriterion("CREDIT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCreditCodeIsNotNull() {
            addCriterion("CREDIT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCodeEqualTo(String value) {
            addCriterion("CREDIT_CODE =", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotEqualTo(String value) {
            addCriterion("CREDIT_CODE <>", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeGreaterThan(String value) {
            addCriterion("CREDIT_CODE >", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CREDIT_CODE >=", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeLessThan(String value) {
            addCriterion("CREDIT_CODE <", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeLessThanOrEqualTo(String value) {
            addCriterion("CREDIT_CODE <=", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeLike(String value) {
            addCriterion("CREDIT_CODE like", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotLike(String value) {
            addCriterion("CREDIT_CODE not like", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeIn(List<String> values) {
            addCriterion("CREDIT_CODE in", values, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotIn(List<String> values) {
            addCriterion("CREDIT_CODE not in", values, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeBetween(String value1, String value2) {
            addCriterion("CREDIT_CODE between", value1, value2, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotBetween(String value1, String value2) {
            addCriterion("CREDIT_CODE not between", value1, value2, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIsNull() {
            addCriterion("CURRENCY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIsNotNull() {
            addCriterion("CURRENCY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdEqualTo(String value) {
            addCriterion("CURRENCY_ID =", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotEqualTo(String value) {
            addCriterion("CURRENCY_ID <>", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdGreaterThan(String value) {
            addCriterion("CURRENCY_ID >", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCY_ID >=", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLessThan(String value) {
            addCriterion("CURRENCY_ID <", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLessThanOrEqualTo(String value) {
            addCriterion("CURRENCY_ID <=", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLike(String value) {
            addCriterion("CURRENCY_ID like", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotLike(String value) {
            addCriterion("CURRENCY_ID not like", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIn(List<String> values) {
            addCriterion("CURRENCY_ID in", values, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotIn(List<String> values) {
            addCriterion("CURRENCY_ID not in", values, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdBetween(String value1, String value2) {
            addCriterion("CURRENCY_ID between", value1, value2, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotBetween(String value1, String value2) {
            addCriterion("CURRENCY_ID not between", value1, value2, "currencyId");
            return (Criteria) this;
        }

        public Criteria andDateCreIsNull() {
            addCriterion("DATE_CRE is null");
            return (Criteria) this;
        }

        public Criteria andDateCreIsNotNull() {
            addCriterion("DATE_CRE is not null");
            return (Criteria) this;
        }

        public Criteria andDateCreEqualTo(Date value) {
            addCriterion("DATE_CRE =", value, "dateCre");
            return (Criteria) this;
        }

        public Criteria andDateCreNotEqualTo(Date value) {
            addCriterion("DATE_CRE <>", value, "dateCre");
            return (Criteria) this;
        }

        public Criteria andDateCreGreaterThan(Date value) {
            addCriterion("DATE_CRE >", value, "dateCre");
            return (Criteria) this;
        }

        public Criteria andDateCreGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_CRE >=", value, "dateCre");
            return (Criteria) this;
        }

        public Criteria andDateCreLessThan(Date value) {
            addCriterion("DATE_CRE <", value, "dateCre");
            return (Criteria) this;
        }

        public Criteria andDateCreLessThanOrEqualTo(Date value) {
            addCriterion("DATE_CRE <=", value, "dateCre");
            return (Criteria) this;
        }

        public Criteria andDateCreIn(List<Date> values) {
            addCriterion("DATE_CRE in", values, "dateCre");
            return (Criteria) this;
        }

        public Criteria andDateCreNotIn(List<Date> values) {
            addCriterion("DATE_CRE not in", values, "dateCre");
            return (Criteria) this;
        }

        public Criteria andDateCreBetween(Date value1, Date value2) {
            addCriterion("DATE_CRE between", value1, value2, "dateCre");
            return (Criteria) this;
        }

        public Criteria andDateCreNotBetween(Date value1, Date value2) {
            addCriterion("DATE_CRE not between", value1, value2, "dateCre");
            return (Criteria) this;
        }

        public Criteria andDateUpdateIsNull() {
            addCriterion("DATE_UPDATE is null");
            return (Criteria) this;
        }

        public Criteria andDateUpdateIsNotNull() {
            addCriterion("DATE_UPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDateUpdateEqualTo(Date value) {
            addCriterion("DATE_UPDATE =", value, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateNotEqualTo(Date value) {
            addCriterion("DATE_UPDATE <>", value, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateGreaterThan(Date value) {
            addCriterion("DATE_UPDATE >", value, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_UPDATE >=", value, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateLessThan(Date value) {
            addCriterion("DATE_UPDATE <", value, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateLessThanOrEqualTo(Date value) {
            addCriterion("DATE_UPDATE <=", value, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateIn(List<Date> values) {
            addCriterion("DATE_UPDATE in", values, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateNotIn(List<Date> values) {
            addCriterion("DATE_UPDATE not in", values, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateBetween(Date value1, Date value2) {
            addCriterion("DATE_UPDATE between", value1, value2, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDateUpdateNotBetween(Date value1, Date value2) {
            addCriterion("DATE_UPDATE not between", value1, value2, "dateUpdate");
            return (Criteria) this;
        }

        public Criteria andDeptNoIsNull() {
            addCriterion("DEPT_NO is null");
            return (Criteria) this;
        }

        public Criteria andDeptNoIsNotNull() {
            addCriterion("DEPT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNoEqualTo(String value) {
            addCriterion("DEPT_NO =", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoNotEqualTo(String value) {
            addCriterion("DEPT_NO <>", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoGreaterThan(String value) {
            addCriterion("DEPT_NO >", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_NO >=", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoLessThan(String value) {
            addCriterion("DEPT_NO <", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoLessThanOrEqualTo(String value) {
            addCriterion("DEPT_NO <=", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoLike(String value) {
            addCriterion("DEPT_NO like", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoNotLike(String value) {
            addCriterion("DEPT_NO not like", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoIn(List<String> values) {
            addCriterion("DEPT_NO in", values, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoNotIn(List<String> values) {
            addCriterion("DEPT_NO not in", values, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoBetween(String value1, String value2) {
            addCriterion("DEPT_NO between", value1, value2, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoNotBetween(String value1, String value2) {
            addCriterion("DEPT_NO not between", value1, value2, "deptNo");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeIsNull() {
            addCriterion("FINANCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeIsNotNull() {
            addCriterion("FINANCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeEqualTo(String value) {
            addCriterion("FINANCE_CODE =", value, "financeCode");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeNotEqualTo(String value) {
            addCriterion("FINANCE_CODE <>", value, "financeCode");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeGreaterThan(String value) {
            addCriterion("FINANCE_CODE >", value, "financeCode");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FINANCE_CODE >=", value, "financeCode");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeLessThan(String value) {
            addCriterion("FINANCE_CODE <", value, "financeCode");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeLessThanOrEqualTo(String value) {
            addCriterion("FINANCE_CODE <=", value, "financeCode");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeLike(String value) {
            addCriterion("FINANCE_CODE like", value, "financeCode");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeNotLike(String value) {
            addCriterion("FINANCE_CODE not like", value, "financeCode");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeIn(List<String> values) {
            addCriterion("FINANCE_CODE in", values, "financeCode");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeNotIn(List<String> values) {
            addCriterion("FINANCE_CODE not in", values, "financeCode");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeBetween(String value1, String value2) {
            addCriterion("FINANCE_CODE between", value1, value2, "financeCode");
            return (Criteria) this;
        }

        public Criteria andFinanceCodeNotBetween(String value1, String value2) {
            addCriterion("FINANCE_CODE not between", value1, value2, "financeCode");
            return (Criteria) this;
        }

        public Criteria andIntranetIsNull() {
            addCriterion("INTRANET is null");
            return (Criteria) this;
        }

        public Criteria andIntranetIsNotNull() {
            addCriterion("INTRANET is not null");
            return (Criteria) this;
        }

        public Criteria andIntranetEqualTo(String value) {
            addCriterion("INTRANET =", value, "intranet");
            return (Criteria) this;
        }

        public Criteria andIntranetNotEqualTo(String value) {
            addCriterion("INTRANET <>", value, "intranet");
            return (Criteria) this;
        }

        public Criteria andIntranetGreaterThan(String value) {
            addCriterion("INTRANET >", value, "intranet");
            return (Criteria) this;
        }

        public Criteria andIntranetGreaterThanOrEqualTo(String value) {
            addCriterion("INTRANET >=", value, "intranet");
            return (Criteria) this;
        }

        public Criteria andIntranetLessThan(String value) {
            addCriterion("INTRANET <", value, "intranet");
            return (Criteria) this;
        }

        public Criteria andIntranetLessThanOrEqualTo(String value) {
            addCriterion("INTRANET <=", value, "intranet");
            return (Criteria) this;
        }

        public Criteria andIntranetLike(String value) {
            addCriterion("INTRANET like", value, "intranet");
            return (Criteria) this;
        }

        public Criteria andIntranetNotLike(String value) {
            addCriterion("INTRANET not like", value, "intranet");
            return (Criteria) this;
        }

        public Criteria andIntranetIn(List<String> values) {
            addCriterion("INTRANET in", values, "intranet");
            return (Criteria) this;
        }

        public Criteria andIntranetNotIn(List<String> values) {
            addCriterion("INTRANET not in", values, "intranet");
            return (Criteria) this;
        }

        public Criteria andIntranetBetween(String value1, String value2) {
            addCriterion("INTRANET between", value1, value2, "intranet");
            return (Criteria) this;
        }

        public Criteria andIntranetNotBetween(String value1, String value2) {
            addCriterion("INTRANET not between", value1, value2, "intranet");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonIsNull() {
            addCriterion("JURIDIC_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonIsNotNull() {
            addCriterion("JURIDIC_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonEqualTo(String value) {
            addCriterion("JURIDIC_PERSON =", value, "juridicPerson");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonNotEqualTo(String value) {
            addCriterion("JURIDIC_PERSON <>", value, "juridicPerson");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonGreaterThan(String value) {
            addCriterion("JURIDIC_PERSON >", value, "juridicPerson");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonGreaterThanOrEqualTo(String value) {
            addCriterion("JURIDIC_PERSON >=", value, "juridicPerson");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonLessThan(String value) {
            addCriterion("JURIDIC_PERSON <", value, "juridicPerson");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonLessThanOrEqualTo(String value) {
            addCriterion("JURIDIC_PERSON <=", value, "juridicPerson");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonLike(String value) {
            addCriterion("JURIDIC_PERSON like", value, "juridicPerson");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonNotLike(String value) {
            addCriterion("JURIDIC_PERSON not like", value, "juridicPerson");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonIn(List<String> values) {
            addCriterion("JURIDIC_PERSON in", values, "juridicPerson");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonNotIn(List<String> values) {
            addCriterion("JURIDIC_PERSON not in", values, "juridicPerson");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonBetween(String value1, String value2) {
            addCriterion("JURIDIC_PERSON between", value1, value2, "juridicPerson");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonNotBetween(String value1, String value2) {
            addCriterion("JURIDIC_PERSON not between", value1, value2, "juridicPerson");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("NOTES is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("NOTES is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("NOTES =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("NOTES <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("NOTES >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("NOTES >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("NOTES <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("NOTES <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("NOTES like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("NOTES not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("NOTES in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("NOTES not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("NOTES between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("NOTES not between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andOfficeTelIsNull() {
            addCriterion("OFFICE_TEL is null");
            return (Criteria) this;
        }

        public Criteria andOfficeTelIsNotNull() {
            addCriterion("OFFICE_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeTelEqualTo(String value) {
            addCriterion("OFFICE_TEL =", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelNotEqualTo(String value) {
            addCriterion("OFFICE_TEL <>", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelGreaterThan(String value) {
            addCriterion("OFFICE_TEL >", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICE_TEL >=", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelLessThan(String value) {
            addCriterion("OFFICE_TEL <", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelLessThanOrEqualTo(String value) {
            addCriterion("OFFICE_TEL <=", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelLike(String value) {
            addCriterion("OFFICE_TEL like", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelNotLike(String value) {
            addCriterion("OFFICE_TEL not like", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelIn(List<String> values) {
            addCriterion("OFFICE_TEL in", values, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelNotIn(List<String> values) {
            addCriterion("OFFICE_TEL not in", values, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelBetween(String value1, String value2) {
            addCriterion("OFFICE_TEL between", value1, value2, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelNotBetween(String value1, String value2) {
            addCriterion("OFFICE_TEL not between", value1, value2, "officeTel");
            return (Criteria) this;
        }

        public Criteria andPostAddressIsNull() {
            addCriterion("POST_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andPostAddressIsNotNull() {
            addCriterion("POST_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andPostAddressEqualTo(String value) {
            addCriterion("POST_ADDRESS =", value, "postAddress");
            return (Criteria) this;
        }

        public Criteria andPostAddressNotEqualTo(String value) {
            addCriterion("POST_ADDRESS <>", value, "postAddress");
            return (Criteria) this;
        }

        public Criteria andPostAddressGreaterThan(String value) {
            addCriterion("POST_ADDRESS >", value, "postAddress");
            return (Criteria) this;
        }

        public Criteria andPostAddressGreaterThanOrEqualTo(String value) {
            addCriterion("POST_ADDRESS >=", value, "postAddress");
            return (Criteria) this;
        }

        public Criteria andPostAddressLessThan(String value) {
            addCriterion("POST_ADDRESS <", value, "postAddress");
            return (Criteria) this;
        }

        public Criteria andPostAddressLessThanOrEqualTo(String value) {
            addCriterion("POST_ADDRESS <=", value, "postAddress");
            return (Criteria) this;
        }

        public Criteria andPostAddressLike(String value) {
            addCriterion("POST_ADDRESS like", value, "postAddress");
            return (Criteria) this;
        }

        public Criteria andPostAddressNotLike(String value) {
            addCriterion("POST_ADDRESS not like", value, "postAddress");
            return (Criteria) this;
        }

        public Criteria andPostAddressIn(List<String> values) {
            addCriterion("POST_ADDRESS in", values, "postAddress");
            return (Criteria) this;
        }

        public Criteria andPostAddressNotIn(List<String> values) {
            addCriterion("POST_ADDRESS not in", values, "postAddress");
            return (Criteria) this;
        }

        public Criteria andPostAddressBetween(String value1, String value2) {
            addCriterion("POST_ADDRESS between", value1, value2, "postAddress");
            return (Criteria) this;
        }

        public Criteria andPostAddressNotBetween(String value1, String value2) {
            addCriterion("POST_ADDRESS not between", value1, value2, "postAddress");
            return (Criteria) this;
        }

        public Criteria andQuotaSaleIsNull() {
            addCriterion("QUOTA_SALE is null");
            return (Criteria) this;
        }

        public Criteria andQuotaSaleIsNotNull() {
            addCriterion("QUOTA_SALE is not null");
            return (Criteria) this;
        }

        public Criteria andQuotaSaleEqualTo(BigDecimal value) {
            addCriterion("QUOTA_SALE =", value, "quotaSale");
            return (Criteria) this;
        }

        public Criteria andQuotaSaleNotEqualTo(BigDecimal value) {
            addCriterion("QUOTA_SALE <>", value, "quotaSale");
            return (Criteria) this;
        }

        public Criteria andQuotaSaleGreaterThan(BigDecimal value) {
            addCriterion("QUOTA_SALE >", value, "quotaSale");
            return (Criteria) this;
        }

        public Criteria andQuotaSaleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QUOTA_SALE >=", value, "quotaSale");
            return (Criteria) this;
        }

        public Criteria andQuotaSaleLessThan(BigDecimal value) {
            addCriterion("QUOTA_SALE <", value, "quotaSale");
            return (Criteria) this;
        }

        public Criteria andQuotaSaleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QUOTA_SALE <=", value, "quotaSale");
            return (Criteria) this;
        }

        public Criteria andQuotaSaleIn(List<BigDecimal> values) {
            addCriterion("QUOTA_SALE in", values, "quotaSale");
            return (Criteria) this;
        }

        public Criteria andQuotaSaleNotIn(List<BigDecimal> values) {
            addCriterion("QUOTA_SALE not in", values, "quotaSale");
            return (Criteria) this;
        }

        public Criteria andQuotaSaleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUOTA_SALE between", value1, value2, "quotaSale");
            return (Criteria) this;
        }

        public Criteria andQuotaSaleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUOTA_SALE not between", value1, value2, "quotaSale");
            return (Criteria) this;
        }

        public Criteria andSalesmanIsNull() {
            addCriterion("SALESMAN is null");
            return (Criteria) this;
        }

        public Criteria andSalesmanIsNotNull() {
            addCriterion("SALESMAN is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmanEqualTo(String value) {
            addCriterion("SALESMAN =", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotEqualTo(String value) {
            addCriterion("SALESMAN <>", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanGreaterThan(String value) {
            addCriterion("SALESMAN >", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanGreaterThanOrEqualTo(String value) {
            addCriterion("SALESMAN >=", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanLessThan(String value) {
            addCriterion("SALESMAN <", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanLessThanOrEqualTo(String value) {
            addCriterion("SALESMAN <=", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanLike(String value) {
            addCriterion("SALESMAN like", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotLike(String value) {
            addCriterion("SALESMAN not like", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanIn(List<String> values) {
            addCriterion("SALESMAN in", values, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotIn(List<String> values) {
            addCriterion("SALESMAN not in", values, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanBetween(String value1, String value2) {
            addCriterion("SALESMAN between", value1, value2, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotBetween(String value1, String value2) {
            addCriterion("SALESMAN not between", value1, value2, "salesman");
            return (Criteria) this;
        }

        public Criteria andScaleIsNull() {
            addCriterion("SCALE is null");
            return (Criteria) this;
        }

        public Criteria andScaleIsNotNull() {
            addCriterion("SCALE is not null");
            return (Criteria) this;
        }

        public Criteria andScaleEqualTo(String value) {
            addCriterion("SCALE =", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotEqualTo(String value) {
            addCriterion("SCALE <>", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleGreaterThan(String value) {
            addCriterion("SCALE >", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleGreaterThanOrEqualTo(String value) {
            addCriterion("SCALE >=", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleLessThan(String value) {
            addCriterion("SCALE <", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleLessThanOrEqualTo(String value) {
            addCriterion("SCALE <=", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleLike(String value) {
            addCriterion("SCALE like", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotLike(String value) {
            addCriterion("SCALE not like", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleIn(List<String> values) {
            addCriterion("SCALE in", values, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotIn(List<String> values) {
            addCriterion("SCALE not in", values, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleBetween(String value1, String value2) {
            addCriterion("SCALE between", value1, value2, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotBetween(String value1, String value2) {
            addCriterion("SCALE not between", value1, value2, "scale");
            return (Criteria) this;
        }

        public Criteria andTaxNoIsNull() {
            addCriterion("TAX_NO is null");
            return (Criteria) this;
        }

        public Criteria andTaxNoIsNotNull() {
            addCriterion("TAX_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxNoEqualTo(String value) {
            addCriterion("TAX_NO =", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoNotEqualTo(String value) {
            addCriterion("TAX_NO <>", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoGreaterThan(String value) {
            addCriterion("TAX_NO >", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_NO >=", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoLessThan(String value) {
            addCriterion("TAX_NO <", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoLessThanOrEqualTo(String value) {
            addCriterion("TAX_NO <=", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoLike(String value) {
            addCriterion("TAX_NO like", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoNotLike(String value) {
            addCriterion("TAX_NO not like", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoIn(List<String> values) {
            addCriterion("TAX_NO in", values, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoNotIn(List<String> values) {
            addCriterion("TAX_NO not in", values, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoBetween(String value1, String value2) {
            addCriterion("TAX_NO between", value1, value2, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoNotBetween(String value1, String value2) {
            addCriterion("TAX_NO not between", value1, value2, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTradeDescIsNull() {
            addCriterion("TRADE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andTradeDescIsNotNull() {
            addCriterion("TRADE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andTradeDescEqualTo(String value) {
            addCriterion("TRADE_DESC =", value, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescNotEqualTo(String value) {
            addCriterion("TRADE_DESC <>", value, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescGreaterThan(String value) {
            addCriterion("TRADE_DESC >", value, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_DESC >=", value, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescLessThan(String value) {
            addCriterion("TRADE_DESC <", value, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescLessThanOrEqualTo(String value) {
            addCriterion("TRADE_DESC <=", value, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescLike(String value) {
            addCriterion("TRADE_DESC like", value, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescNotLike(String value) {
            addCriterion("TRADE_DESC not like", value, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescIn(List<String> values) {
            addCriterion("TRADE_DESC in", values, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescNotIn(List<String> values) {
            addCriterion("TRADE_DESC not in", values, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescBetween(String value1, String value2) {
            addCriterion("TRADE_DESC between", value1, value2, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTradeDescNotBetween(String value1, String value2) {
            addCriterion("TRADE_DESC not between", value1, value2, "tradeDesc");
            return (Criteria) this;
        }

        public Criteria andTAccountIsNull() {
            addCriterion("T_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTAccountIsNotNull() {
            addCriterion("T_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTAccountEqualTo(String value) {
            addCriterion("T_ACCOUNT =", value, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountNotEqualTo(String value) {
            addCriterion("T_ACCOUNT <>", value, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountGreaterThan(String value) {
            addCriterion("T_ACCOUNT >", value, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountGreaterThanOrEqualTo(String value) {
            addCriterion("T_ACCOUNT >=", value, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountLessThan(String value) {
            addCriterion("T_ACCOUNT <", value, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountLessThanOrEqualTo(String value) {
            addCriterion("T_ACCOUNT <=", value, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountLike(String value) {
            addCriterion("T_ACCOUNT like", value, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountNotLike(String value) {
            addCriterion("T_ACCOUNT not like", value, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountIn(List<String> values) {
            addCriterion("T_ACCOUNT in", values, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountNotIn(List<String> values) {
            addCriterion("T_ACCOUNT not in", values, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountBetween(String value1, String value2) {
            addCriterion("T_ACCOUNT between", value1, value2, "tAccount");
            return (Criteria) this;
        }

        public Criteria andTAccountNotBetween(String value1, String value2) {
            addCriterion("T_ACCOUNT not between", value1, value2, "tAccount");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNull() {
            addCriterion("ZIP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("ZIP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(String value) {
            addCriterion("ZIP_CODE =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(String value) {
            addCriterion("ZIP_CODE <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(String value) {
            addCriterion("ZIP_CODE >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ZIP_CODE >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(String value) {
            addCriterion("ZIP_CODE <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(String value) {
            addCriterion("ZIP_CODE <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLike(String value) {
            addCriterion("ZIP_CODE like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotLike(String value) {
            addCriterion("ZIP_CODE not like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<String> values) {
            addCriterion("ZIP_CODE in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<String> values) {
            addCriterion("ZIP_CODE not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(String value1, String value2) {
            addCriterion("ZIP_CODE between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(String value1, String value2) {
            addCriterion("ZIP_CODE not between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andImportantFlagIsNull() {
            addCriterion("IMPORTANT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andImportantFlagIsNotNull() {
            addCriterion("IMPORTANT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andImportantFlagEqualTo(String value) {
            addCriterion("IMPORTANT_FLAG =", value, "importantFlag");
            return (Criteria) this;
        }

        public Criteria andImportantFlagNotEqualTo(String value) {
            addCriterion("IMPORTANT_FLAG <>", value, "importantFlag");
            return (Criteria) this;
        }

        public Criteria andImportantFlagGreaterThan(String value) {
            addCriterion("IMPORTANT_FLAG >", value, "importantFlag");
            return (Criteria) this;
        }

        public Criteria andImportantFlagGreaterThanOrEqualTo(String value) {
            addCriterion("IMPORTANT_FLAG >=", value, "importantFlag");
            return (Criteria) this;
        }

        public Criteria andImportantFlagLessThan(String value) {
            addCriterion("IMPORTANT_FLAG <", value, "importantFlag");
            return (Criteria) this;
        }

        public Criteria andImportantFlagLessThanOrEqualTo(String value) {
            addCriterion("IMPORTANT_FLAG <=", value, "importantFlag");
            return (Criteria) this;
        }

        public Criteria andImportantFlagLike(String value) {
            addCriterion("IMPORTANT_FLAG like", value, "importantFlag");
            return (Criteria) this;
        }

        public Criteria andImportantFlagNotLike(String value) {
            addCriterion("IMPORTANT_FLAG not like", value, "importantFlag");
            return (Criteria) this;
        }

        public Criteria andImportantFlagIn(List<String> values) {
            addCriterion("IMPORTANT_FLAG in", values, "importantFlag");
            return (Criteria) this;
        }

        public Criteria andImportantFlagNotIn(List<String> values) {
            addCriterion("IMPORTANT_FLAG not in", values, "importantFlag");
            return (Criteria) this;
        }

        public Criteria andImportantFlagBetween(String value1, String value2) {
            addCriterion("IMPORTANT_FLAG between", value1, value2, "importantFlag");
            return (Criteria) this;
        }

        public Criteria andImportantFlagNotBetween(String value1, String value2) {
            addCriterion("IMPORTANT_FLAG not between", value1, value2, "importantFlag");
            return (Criteria) this;
        }

        public Criteria andDeliveryAdressIsNull() {
            addCriterion("DELIVERY_ADRESS is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAdressIsNotNull() {
            addCriterion("DELIVERY_ADRESS is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAdressEqualTo(String value) {
            addCriterion("DELIVERY_ADRESS =", value, "deliveryAdress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAdressNotEqualTo(String value) {
            addCriterion("DELIVERY_ADRESS <>", value, "deliveryAdress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAdressGreaterThan(String value) {
            addCriterion("DELIVERY_ADRESS >", value, "deliveryAdress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAdressGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_ADRESS >=", value, "deliveryAdress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAdressLessThan(String value) {
            addCriterion("DELIVERY_ADRESS <", value, "deliveryAdress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAdressLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_ADRESS <=", value, "deliveryAdress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAdressLike(String value) {
            addCriterion("DELIVERY_ADRESS like", value, "deliveryAdress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAdressNotLike(String value) {
            addCriterion("DELIVERY_ADRESS not like", value, "deliveryAdress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAdressIn(List<String> values) {
            addCriterion("DELIVERY_ADRESS in", values, "deliveryAdress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAdressNotIn(List<String> values) {
            addCriterion("DELIVERY_ADRESS not in", values, "deliveryAdress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAdressBetween(String value1, String value2) {
            addCriterion("DELIVERY_ADRESS between", value1, value2, "deliveryAdress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAdressNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_ADRESS not between", value1, value2, "deliveryAdress");
            return (Criteria) this;
        }

        public Criteria andCustomerClassifyIsNull() {
            addCriterion("CUSTOMER_CLASSIFY is null");
            return (Criteria) this;
        }

        public Criteria andCustomerClassifyIsNotNull() {
            addCriterion("CUSTOMER_CLASSIFY is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerClassifyEqualTo(String value) {
            addCriterion("CUSTOMER_CLASSIFY =", value, "customerClassify");
            return (Criteria) this;
        }

        public Criteria andCustomerClassifyNotEqualTo(String value) {
            addCriterion("CUSTOMER_CLASSIFY <>", value, "customerClassify");
            return (Criteria) this;
        }

        public Criteria andCustomerClassifyGreaterThan(String value) {
            addCriterion("CUSTOMER_CLASSIFY >", value, "customerClassify");
            return (Criteria) this;
        }

        public Criteria andCustomerClassifyGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_CLASSIFY >=", value, "customerClassify");
            return (Criteria) this;
        }

        public Criteria andCustomerClassifyLessThan(String value) {
            addCriterion("CUSTOMER_CLASSIFY <", value, "customerClassify");
            return (Criteria) this;
        }

        public Criteria andCustomerClassifyLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_CLASSIFY <=", value, "customerClassify");
            return (Criteria) this;
        }

        public Criteria andCustomerClassifyLike(String value) {
            addCriterion("CUSTOMER_CLASSIFY like", value, "customerClassify");
            return (Criteria) this;
        }

        public Criteria andCustomerClassifyNotLike(String value) {
            addCriterion("CUSTOMER_CLASSIFY not like", value, "customerClassify");
            return (Criteria) this;
        }

        public Criteria andCustomerClassifyIn(List<String> values) {
            addCriterion("CUSTOMER_CLASSIFY in", values, "customerClassify");
            return (Criteria) this;
        }

        public Criteria andCustomerClassifyNotIn(List<String> values) {
            addCriterion("CUSTOMER_CLASSIFY not in", values, "customerClassify");
            return (Criteria) this;
        }

        public Criteria andCustomerClassifyBetween(String value1, String value2) {
            addCriterion("CUSTOMER_CLASSIFY between", value1, value2, "customerClassify");
            return (Criteria) this;
        }

        public Criteria andCustomerClassifyNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_CLASSIFY not between", value1, value2, "customerClassify");
            return (Criteria) this;
        }

        public Criteria andFollowCodeIsNull() {
            addCriterion("FOLLOW_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFollowCodeIsNotNull() {
            addCriterion("FOLLOW_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFollowCodeEqualTo(String value) {
            addCriterion("FOLLOW_CODE =", value, "followCode");
            return (Criteria) this;
        }

        public Criteria andFollowCodeNotEqualTo(String value) {
            addCriterion("FOLLOW_CODE <>", value, "followCode");
            return (Criteria) this;
        }

        public Criteria andFollowCodeGreaterThan(String value) {
            addCriterion("FOLLOW_CODE >", value, "followCode");
            return (Criteria) this;
        }

        public Criteria andFollowCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FOLLOW_CODE >=", value, "followCode");
            return (Criteria) this;
        }

        public Criteria andFollowCodeLessThan(String value) {
            addCriterion("FOLLOW_CODE <", value, "followCode");
            return (Criteria) this;
        }

        public Criteria andFollowCodeLessThanOrEqualTo(String value) {
            addCriterion("FOLLOW_CODE <=", value, "followCode");
            return (Criteria) this;
        }

        public Criteria andFollowCodeLike(String value) {
            addCriterion("FOLLOW_CODE like", value, "followCode");
            return (Criteria) this;
        }

        public Criteria andFollowCodeNotLike(String value) {
            addCriterion("FOLLOW_CODE not like", value, "followCode");
            return (Criteria) this;
        }

        public Criteria andFollowCodeIn(List<String> values) {
            addCriterion("FOLLOW_CODE in", values, "followCode");
            return (Criteria) this;
        }

        public Criteria andFollowCodeNotIn(List<String> values) {
            addCriterion("FOLLOW_CODE not in", values, "followCode");
            return (Criteria) this;
        }

        public Criteria andFollowCodeBetween(String value1, String value2) {
            addCriterion("FOLLOW_CODE between", value1, value2, "followCode");
            return (Criteria) this;
        }

        public Criteria andFollowCodeNotBetween(String value1, String value2) {
            addCriterion("FOLLOW_CODE not between", value1, value2, "followCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceRecieveStartIsNull() {
            addCriterion("INVOICE_RECIEVE_START is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceRecieveStartIsNotNull() {
            addCriterion("INVOICE_RECIEVE_START is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceRecieveStartEqualTo(BigDecimal value) {
            addCriterion("INVOICE_RECIEVE_START =", value, "invoiceRecieveStart");
            return (Criteria) this;
        }

        public Criteria andInvoiceRecieveStartNotEqualTo(BigDecimal value) {
            addCriterion("INVOICE_RECIEVE_START <>", value, "invoiceRecieveStart");
            return (Criteria) this;
        }

        public Criteria andInvoiceRecieveStartGreaterThan(BigDecimal value) {
            addCriterion("INVOICE_RECIEVE_START >", value, "invoiceRecieveStart");
            return (Criteria) this;
        }

        public Criteria andInvoiceRecieveStartGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICE_RECIEVE_START >=", value, "invoiceRecieveStart");
            return (Criteria) this;
        }

        public Criteria andInvoiceRecieveStartLessThan(BigDecimal value) {
            addCriterion("INVOICE_RECIEVE_START <", value, "invoiceRecieveStart");
            return (Criteria) this;
        }

        public Criteria andInvoiceRecieveStartLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICE_RECIEVE_START <=", value, "invoiceRecieveStart");
            return (Criteria) this;
        }

        public Criteria andInvoiceRecieveStartIn(List<BigDecimal> values) {
            addCriterion("INVOICE_RECIEVE_START in", values, "invoiceRecieveStart");
            return (Criteria) this;
        }

        public Criteria andInvoiceRecieveStartNotIn(List<BigDecimal> values) {
            addCriterion("INVOICE_RECIEVE_START not in", values, "invoiceRecieveStart");
            return (Criteria) this;
        }

        public Criteria andInvoiceRecieveStartBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICE_RECIEVE_START between", value1, value2, "invoiceRecieveStart");
            return (Criteria) this;
        }

        public Criteria andInvoiceRecieveStartNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICE_RECIEVE_START not between", value1, value2, "invoiceRecieveStart");
            return (Criteria) this;
        }

        public Criteria andDateChangeStatusIsNull() {
            addCriterion("DATE_CHANGE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDateChangeStatusIsNotNull() {
            addCriterion("DATE_CHANGE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDateChangeStatusEqualTo(Date value) {
            addCriterion("DATE_CHANGE_STATUS =", value, "dateChangeStatus");
            return (Criteria) this;
        }

        public Criteria andDateChangeStatusNotEqualTo(Date value) {
            addCriterion("DATE_CHANGE_STATUS <>", value, "dateChangeStatus");
            return (Criteria) this;
        }

        public Criteria andDateChangeStatusGreaterThan(Date value) {
            addCriterion("DATE_CHANGE_STATUS >", value, "dateChangeStatus");
            return (Criteria) this;
        }

        public Criteria andDateChangeStatusGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_CHANGE_STATUS >=", value, "dateChangeStatus");
            return (Criteria) this;
        }

        public Criteria andDateChangeStatusLessThan(Date value) {
            addCriterion("DATE_CHANGE_STATUS <", value, "dateChangeStatus");
            return (Criteria) this;
        }

        public Criteria andDateChangeStatusLessThanOrEqualTo(Date value) {
            addCriterion("DATE_CHANGE_STATUS <=", value, "dateChangeStatus");
            return (Criteria) this;
        }

        public Criteria andDateChangeStatusIn(List<Date> values) {
            addCriterion("DATE_CHANGE_STATUS in", values, "dateChangeStatus");
            return (Criteria) this;
        }

        public Criteria andDateChangeStatusNotIn(List<Date> values) {
            addCriterion("DATE_CHANGE_STATUS not in", values, "dateChangeStatus");
            return (Criteria) this;
        }

        public Criteria andDateChangeStatusBetween(Date value1, Date value2) {
            addCriterion("DATE_CHANGE_STATUS between", value1, value2, "dateChangeStatus");
            return (Criteria) this;
        }

        public Criteria andDateChangeStatusNotBetween(Date value1, Date value2) {
            addCriterion("DATE_CHANGE_STATUS not between", value1, value2, "dateChangeStatus");
            return (Criteria) this;
        }

        public Criteria andOperaterChangeStatusIsNull() {
            addCriterion("OPERATER_CHANGE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOperaterChangeStatusIsNotNull() {
            addCriterion("OPERATER_CHANGE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOperaterChangeStatusEqualTo(String value) {
            addCriterion("OPERATER_CHANGE_STATUS =", value, "operaterChangeStatus");
            return (Criteria) this;
        }

        public Criteria andOperaterChangeStatusNotEqualTo(String value) {
            addCriterion("OPERATER_CHANGE_STATUS <>", value, "operaterChangeStatus");
            return (Criteria) this;
        }

        public Criteria andOperaterChangeStatusGreaterThan(String value) {
            addCriterion("OPERATER_CHANGE_STATUS >", value, "operaterChangeStatus");
            return (Criteria) this;
        }

        public Criteria andOperaterChangeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATER_CHANGE_STATUS >=", value, "operaterChangeStatus");
            return (Criteria) this;
        }

        public Criteria andOperaterChangeStatusLessThan(String value) {
            addCriterion("OPERATER_CHANGE_STATUS <", value, "operaterChangeStatus");
            return (Criteria) this;
        }

        public Criteria andOperaterChangeStatusLessThanOrEqualTo(String value) {
            addCriterion("OPERATER_CHANGE_STATUS <=", value, "operaterChangeStatus");
            return (Criteria) this;
        }

        public Criteria andOperaterChangeStatusLike(String value) {
            addCriterion("OPERATER_CHANGE_STATUS like", value, "operaterChangeStatus");
            return (Criteria) this;
        }

        public Criteria andOperaterChangeStatusNotLike(String value) {
            addCriterion("OPERATER_CHANGE_STATUS not like", value, "operaterChangeStatus");
            return (Criteria) this;
        }

        public Criteria andOperaterChangeStatusIn(List<String> values) {
            addCriterion("OPERATER_CHANGE_STATUS in", values, "operaterChangeStatus");
            return (Criteria) this;
        }

        public Criteria andOperaterChangeStatusNotIn(List<String> values) {
            addCriterion("OPERATER_CHANGE_STATUS not in", values, "operaterChangeStatus");
            return (Criteria) this;
        }

        public Criteria andOperaterChangeStatusBetween(String value1, String value2) {
            addCriterion("OPERATER_CHANGE_STATUS between", value1, value2, "operaterChangeStatus");
            return (Criteria) this;
        }

        public Criteria andOperaterChangeStatusNotBetween(String value1, String value2) {
            addCriterion("OPERATER_CHANGE_STATUS not between", value1, value2, "operaterChangeStatus");
            return (Criteria) this;
        }

        public Criteria andReasonChangeStatusIsNull() {
            addCriterion("REASON_CHANGE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andReasonChangeStatusIsNotNull() {
            addCriterion("REASON_CHANGE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andReasonChangeStatusEqualTo(String value) {
            addCriterion("REASON_CHANGE_STATUS =", value, "reasonChangeStatus");
            return (Criteria) this;
        }

        public Criteria andReasonChangeStatusNotEqualTo(String value) {
            addCriterion("REASON_CHANGE_STATUS <>", value, "reasonChangeStatus");
            return (Criteria) this;
        }

        public Criteria andReasonChangeStatusGreaterThan(String value) {
            addCriterion("REASON_CHANGE_STATUS >", value, "reasonChangeStatus");
            return (Criteria) this;
        }

        public Criteria andReasonChangeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("REASON_CHANGE_STATUS >=", value, "reasonChangeStatus");
            return (Criteria) this;
        }

        public Criteria andReasonChangeStatusLessThan(String value) {
            addCriterion("REASON_CHANGE_STATUS <", value, "reasonChangeStatus");
            return (Criteria) this;
        }

        public Criteria andReasonChangeStatusLessThanOrEqualTo(String value) {
            addCriterion("REASON_CHANGE_STATUS <=", value, "reasonChangeStatus");
            return (Criteria) this;
        }

        public Criteria andReasonChangeStatusLike(String value) {
            addCriterion("REASON_CHANGE_STATUS like", value, "reasonChangeStatus");
            return (Criteria) this;
        }

        public Criteria andReasonChangeStatusNotLike(String value) {
            addCriterion("REASON_CHANGE_STATUS not like", value, "reasonChangeStatus");
            return (Criteria) this;
        }

        public Criteria andReasonChangeStatusIn(List<String> values) {
            addCriterion("REASON_CHANGE_STATUS in", values, "reasonChangeStatus");
            return (Criteria) this;
        }

        public Criteria andReasonChangeStatusNotIn(List<String> values) {
            addCriterion("REASON_CHANGE_STATUS not in", values, "reasonChangeStatus");
            return (Criteria) this;
        }

        public Criteria andReasonChangeStatusBetween(String value1, String value2) {
            addCriterion("REASON_CHANGE_STATUS between", value1, value2, "reasonChangeStatus");
            return (Criteria) this;
        }

        public Criteria andReasonChangeStatusNotBetween(String value1, String value2) {
            addCriterion("REASON_CHANGE_STATUS not between", value1, value2, "reasonChangeStatus");
            return (Criteria) this;
        }

        public Criteria andBalanceReceiveZtIsNull() {
            addCriterion("BALANCE_RECEIVE_ZT is null");
            return (Criteria) this;
        }

        public Criteria andBalanceReceiveZtIsNotNull() {
            addCriterion("BALANCE_RECEIVE_ZT is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceReceiveZtEqualTo(BigDecimal value) {
            addCriterion("BALANCE_RECEIVE_ZT =", value, "balanceReceiveZt");
            return (Criteria) this;
        }

        public Criteria andBalanceReceiveZtNotEqualTo(BigDecimal value) {
            addCriterion("BALANCE_RECEIVE_ZT <>", value, "balanceReceiveZt");
            return (Criteria) this;
        }

        public Criteria andBalanceReceiveZtGreaterThan(BigDecimal value) {
            addCriterion("BALANCE_RECEIVE_ZT >", value, "balanceReceiveZt");
            return (Criteria) this;
        }

        public Criteria andBalanceReceiveZtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCE_RECEIVE_ZT >=", value, "balanceReceiveZt");
            return (Criteria) this;
        }

        public Criteria andBalanceReceiveZtLessThan(BigDecimal value) {
            addCriterion("BALANCE_RECEIVE_ZT <", value, "balanceReceiveZt");
            return (Criteria) this;
        }

        public Criteria andBalanceReceiveZtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCE_RECEIVE_ZT <=", value, "balanceReceiveZt");
            return (Criteria) this;
        }

        public Criteria andBalanceReceiveZtIn(List<BigDecimal> values) {
            addCriterion("BALANCE_RECEIVE_ZT in", values, "balanceReceiveZt");
            return (Criteria) this;
        }

        public Criteria andBalanceReceiveZtNotIn(List<BigDecimal> values) {
            addCriterion("BALANCE_RECEIVE_ZT not in", values, "balanceReceiveZt");
            return (Criteria) this;
        }

        public Criteria andBalanceReceiveZtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCE_RECEIVE_ZT between", value1, value2, "balanceReceiveZt");
            return (Criteria) this;
        }

        public Criteria andBalanceReceiveZtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCE_RECEIVE_ZT not between", value1, value2, "balanceReceiveZt");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartIsNull() {
            addCriterion("RECEIVE_MONTH_START is null");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartIsNotNull() {
            addCriterion("RECEIVE_MONTH_START is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartEqualTo(BigDecimal value) {
            addCriterion("RECEIVE_MONTH_START =", value, "receiveMonthStart");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartNotEqualTo(BigDecimal value) {
            addCriterion("RECEIVE_MONTH_START <>", value, "receiveMonthStart");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartGreaterThan(BigDecimal value) {
            addCriterion("RECEIVE_MONTH_START >", value, "receiveMonthStart");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVE_MONTH_START >=", value, "receiveMonthStart");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartLessThan(BigDecimal value) {
            addCriterion("RECEIVE_MONTH_START <", value, "receiveMonthStart");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVE_MONTH_START <=", value, "receiveMonthStart");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartIn(List<BigDecimal> values) {
            addCriterion("RECEIVE_MONTH_START in", values, "receiveMonthStart");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartNotIn(List<BigDecimal> values) {
            addCriterion("RECEIVE_MONTH_START not in", values, "receiveMonthStart");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVE_MONTH_START between", value1, value2, "receiveMonthStart");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVE_MONTH_START not between", value1, value2, "receiveMonthStart");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartZtIsNull() {
            addCriterion("RECEIVE_MONTH_START_ZT is null");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartZtIsNotNull() {
            addCriterion("RECEIVE_MONTH_START_ZT is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartZtEqualTo(BigDecimal value) {
            addCriterion("RECEIVE_MONTH_START_ZT =", value, "receiveMonthStartZt");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartZtNotEqualTo(BigDecimal value) {
            addCriterion("RECEIVE_MONTH_START_ZT <>", value, "receiveMonthStartZt");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartZtGreaterThan(BigDecimal value) {
            addCriterion("RECEIVE_MONTH_START_ZT >", value, "receiveMonthStartZt");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartZtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVE_MONTH_START_ZT >=", value, "receiveMonthStartZt");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartZtLessThan(BigDecimal value) {
            addCriterion("RECEIVE_MONTH_START_ZT <", value, "receiveMonthStartZt");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartZtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVE_MONTH_START_ZT <=", value, "receiveMonthStartZt");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartZtIn(List<BigDecimal> values) {
            addCriterion("RECEIVE_MONTH_START_ZT in", values, "receiveMonthStartZt");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartZtNotIn(List<BigDecimal> values) {
            addCriterion("RECEIVE_MONTH_START_ZT not in", values, "receiveMonthStartZt");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartZtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVE_MONTH_START_ZT between", value1, value2, "receiveMonthStartZt");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartZtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVE_MONTH_START_ZT not between", value1, value2, "receiveMonthStartZt");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict2IsNull() {
            addCriterion("AREA_DISTRICT_2 is null");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict2IsNotNull() {
            addCriterion("AREA_DISTRICT_2 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict2EqualTo(String value) {
            addCriterion("AREA_DISTRICT_2 =", value, "areaDistrict2");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict2NotEqualTo(String value) {
            addCriterion("AREA_DISTRICT_2 <>", value, "areaDistrict2");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict2GreaterThan(String value) {
            addCriterion("AREA_DISTRICT_2 >", value, "areaDistrict2");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict2GreaterThanOrEqualTo(String value) {
            addCriterion("AREA_DISTRICT_2 >=", value, "areaDistrict2");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict2LessThan(String value) {
            addCriterion("AREA_DISTRICT_2 <", value, "areaDistrict2");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict2LessThanOrEqualTo(String value) {
            addCriterion("AREA_DISTRICT_2 <=", value, "areaDistrict2");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict2Like(String value) {
            addCriterion("AREA_DISTRICT_2 like", value, "areaDistrict2");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict2NotLike(String value) {
            addCriterion("AREA_DISTRICT_2 not like", value, "areaDistrict2");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict2In(List<String> values) {
            addCriterion("AREA_DISTRICT_2 in", values, "areaDistrict2");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict2NotIn(List<String> values) {
            addCriterion("AREA_DISTRICT_2 not in", values, "areaDistrict2");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict2Between(String value1, String value2) {
            addCriterion("AREA_DISTRICT_2 between", value1, value2, "areaDistrict2");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict2NotBetween(String value1, String value2) {
            addCriterion("AREA_DISTRICT_2 not between", value1, value2, "areaDistrict2");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("UPDATER is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("UPDATER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("UPDATER =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("UPDATER <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("UPDATER >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATER >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("UPDATER <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("UPDATER <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("UPDATER like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("UPDATER not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("UPDATER in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("UPDATER not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("UPDATER between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("UPDATER not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andConsignmentTypeIsNull() {
            addCriterion("CONSIGNMENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andConsignmentTypeIsNotNull() {
            addCriterion("CONSIGNMENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andConsignmentTypeEqualTo(String value) {
            addCriterion("CONSIGNMENT_TYPE =", value, "consignmentType");
            return (Criteria) this;
        }

        public Criteria andConsignmentTypeNotEqualTo(String value) {
            addCriterion("CONSIGNMENT_TYPE <>", value, "consignmentType");
            return (Criteria) this;
        }

        public Criteria andConsignmentTypeGreaterThan(String value) {
            addCriterion("CONSIGNMENT_TYPE >", value, "consignmentType");
            return (Criteria) this;
        }

        public Criteria andConsignmentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONSIGNMENT_TYPE >=", value, "consignmentType");
            return (Criteria) this;
        }

        public Criteria andConsignmentTypeLessThan(String value) {
            addCriterion("CONSIGNMENT_TYPE <", value, "consignmentType");
            return (Criteria) this;
        }

        public Criteria andConsignmentTypeLessThanOrEqualTo(String value) {
            addCriterion("CONSIGNMENT_TYPE <=", value, "consignmentType");
            return (Criteria) this;
        }

        public Criteria andConsignmentTypeLike(String value) {
            addCriterion("CONSIGNMENT_TYPE like", value, "consignmentType");
            return (Criteria) this;
        }

        public Criteria andConsignmentTypeNotLike(String value) {
            addCriterion("CONSIGNMENT_TYPE not like", value, "consignmentType");
            return (Criteria) this;
        }

        public Criteria andConsignmentTypeIn(List<String> values) {
            addCriterion("CONSIGNMENT_TYPE in", values, "consignmentType");
            return (Criteria) this;
        }

        public Criteria andConsignmentTypeNotIn(List<String> values) {
            addCriterion("CONSIGNMENT_TYPE not in", values, "consignmentType");
            return (Criteria) this;
        }

        public Criteria andConsignmentTypeBetween(String value1, String value2) {
            addCriterion("CONSIGNMENT_TYPE between", value1, value2, "consignmentType");
            return (Criteria) this;
        }

        public Criteria andConsignmentTypeNotBetween(String value1, String value2) {
            addCriterion("CONSIGNMENT_TYPE not between", value1, value2, "consignmentType");
            return (Criteria) this;
        }

        public Criteria andPricePolicyIsNull() {
            addCriterion("PRICE_POLICY is null");
            return (Criteria) this;
        }

        public Criteria andPricePolicyIsNotNull() {
            addCriterion("PRICE_POLICY is not null");
            return (Criteria) this;
        }

        public Criteria andPricePolicyEqualTo(String value) {
            addCriterion("PRICE_POLICY =", value, "pricePolicy");
            return (Criteria) this;
        }

        public Criteria andPricePolicyNotEqualTo(String value) {
            addCriterion("PRICE_POLICY <>", value, "pricePolicy");
            return (Criteria) this;
        }

        public Criteria andPricePolicyGreaterThan(String value) {
            addCriterion("PRICE_POLICY >", value, "pricePolicy");
            return (Criteria) this;
        }

        public Criteria andPricePolicyGreaterThanOrEqualTo(String value) {
            addCriterion("PRICE_POLICY >=", value, "pricePolicy");
            return (Criteria) this;
        }

        public Criteria andPricePolicyLessThan(String value) {
            addCriterion("PRICE_POLICY <", value, "pricePolicy");
            return (Criteria) this;
        }

        public Criteria andPricePolicyLessThanOrEqualTo(String value) {
            addCriterion("PRICE_POLICY <=", value, "pricePolicy");
            return (Criteria) this;
        }

        public Criteria andPricePolicyLike(String value) {
            addCriterion("PRICE_POLICY like", value, "pricePolicy");
            return (Criteria) this;
        }

        public Criteria andPricePolicyNotLike(String value) {
            addCriterion("PRICE_POLICY not like", value, "pricePolicy");
            return (Criteria) this;
        }

        public Criteria andPricePolicyIn(List<String> values) {
            addCriterion("PRICE_POLICY in", values, "pricePolicy");
            return (Criteria) this;
        }

        public Criteria andPricePolicyNotIn(List<String> values) {
            addCriterion("PRICE_POLICY not in", values, "pricePolicy");
            return (Criteria) this;
        }

        public Criteria andPricePolicyBetween(String value1, String value2) {
            addCriterion("PRICE_POLICY between", value1, value2, "pricePolicy");
            return (Criteria) this;
        }

        public Criteria andPricePolicyNotBetween(String value1, String value2) {
            addCriterion("PRICE_POLICY not between", value1, value2, "pricePolicy");
            return (Criteria) this;
        }

        public Criteria andLevelNoIsNull() {
            addCriterion("LEVEL_NO is null");
            return (Criteria) this;
        }

        public Criteria andLevelNoIsNotNull() {
            addCriterion("LEVEL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLevelNoEqualTo(Integer value) {
            addCriterion("LEVEL_NO =", value, "levelNo");
            return (Criteria) this;
        }

        public Criteria andLevelNoNotEqualTo(Integer value) {
            addCriterion("LEVEL_NO <>", value, "levelNo");
            return (Criteria) this;
        }

        public Criteria andLevelNoGreaterThan(Integer value) {
            addCriterion("LEVEL_NO >", value, "levelNo");
            return (Criteria) this;
        }

        public Criteria andLevelNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEVEL_NO >=", value, "levelNo");
            return (Criteria) this;
        }

        public Criteria andLevelNoLessThan(Integer value) {
            addCriterion("LEVEL_NO <", value, "levelNo");
            return (Criteria) this;
        }

        public Criteria andLevelNoLessThanOrEqualTo(Integer value) {
            addCriterion("LEVEL_NO <=", value, "levelNo");
            return (Criteria) this;
        }

        public Criteria andLevelNoIn(List<Integer> values) {
            addCriterion("LEVEL_NO in", values, "levelNo");
            return (Criteria) this;
        }

        public Criteria andLevelNoNotIn(List<Integer> values) {
            addCriterion("LEVEL_NO not in", values, "levelNo");
            return (Criteria) this;
        }

        public Criteria andLevelNoBetween(Integer value1, Integer value2) {
            addCriterion("LEVEL_NO between", value1, value2, "levelNo");
            return (Criteria) this;
        }

        public Criteria andLevelNoNotBetween(Integer value1, Integer value2) {
            addCriterion("LEVEL_NO not between", value1, value2, "levelNo");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountIsNull() {
            addCriterion("CUSTOMER_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountIsNotNull() {
            addCriterion("CUSTOMER_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountEqualTo(String value) {
            addCriterion("CUSTOMER_ACCOUNT =", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountNotEqualTo(String value) {
            addCriterion("CUSTOMER_ACCOUNT <>", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountGreaterThan(String value) {
            addCriterion("CUSTOMER_ACCOUNT >", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ACCOUNT >=", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountLessThan(String value) {
            addCriterion("CUSTOMER_ACCOUNT <", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ACCOUNT <=", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountLike(String value) {
            addCriterion("CUSTOMER_ACCOUNT like", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountNotLike(String value) {
            addCriterion("CUSTOMER_ACCOUNT not like", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountIn(List<String> values) {
            addCriterion("CUSTOMER_ACCOUNT in", values, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountNotIn(List<String> values) {
            addCriterion("CUSTOMER_ACCOUNT not in", values, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ACCOUNT between", value1, value2, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ACCOUNT not between", value1, value2, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerGroupIsNull() {
            addCriterion("CUSTOMER_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andCustomerGroupIsNotNull() {
            addCriterion("CUSTOMER_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerGroupEqualTo(String value) {
            addCriterion("CUSTOMER_GROUP =", value, "customerGroup");
            return (Criteria) this;
        }

        public Criteria andCustomerGroupNotEqualTo(String value) {
            addCriterion("CUSTOMER_GROUP <>", value, "customerGroup");
            return (Criteria) this;
        }

        public Criteria andCustomerGroupGreaterThan(String value) {
            addCriterion("CUSTOMER_GROUP >", value, "customerGroup");
            return (Criteria) this;
        }

        public Criteria andCustomerGroupGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_GROUP >=", value, "customerGroup");
            return (Criteria) this;
        }

        public Criteria andCustomerGroupLessThan(String value) {
            addCriterion("CUSTOMER_GROUP <", value, "customerGroup");
            return (Criteria) this;
        }

        public Criteria andCustomerGroupLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_GROUP <=", value, "customerGroup");
            return (Criteria) this;
        }

        public Criteria andCustomerGroupLike(String value) {
            addCriterion("CUSTOMER_GROUP like", value, "customerGroup");
            return (Criteria) this;
        }

        public Criteria andCustomerGroupNotLike(String value) {
            addCriterion("CUSTOMER_GROUP not like", value, "customerGroup");
            return (Criteria) this;
        }

        public Criteria andCustomerGroupIn(List<String> values) {
            addCriterion("CUSTOMER_GROUP in", values, "customerGroup");
            return (Criteria) this;
        }

        public Criteria andCustomerGroupNotIn(List<String> values) {
            addCriterion("CUSTOMER_GROUP not in", values, "customerGroup");
            return (Criteria) this;
        }

        public Criteria andCustomerGroupBetween(String value1, String value2) {
            addCriterion("CUSTOMER_GROUP between", value1, value2, "customerGroup");
            return (Criteria) this;
        }

        public Criteria andCustomerGroupNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_GROUP not between", value1, value2, "customerGroup");
            return (Criteria) this;
        }

        public Criteria andCustomerDmslIsNull() {
            addCriterion("CUSTOMER_DMSL is null");
            return (Criteria) this;
        }

        public Criteria andCustomerDmslIsNotNull() {
            addCriterion("CUSTOMER_DMSL is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerDmslEqualTo(String value) {
            addCriterion("CUSTOMER_DMSL =", value, "customerDmsl");
            return (Criteria) this;
        }

        public Criteria andCustomerDmslNotEqualTo(String value) {
            addCriterion("CUSTOMER_DMSL <>", value, "customerDmsl");
            return (Criteria) this;
        }

        public Criteria andCustomerDmslGreaterThan(String value) {
            addCriterion("CUSTOMER_DMSL >", value, "customerDmsl");
            return (Criteria) this;
        }

        public Criteria andCustomerDmslGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_DMSL >=", value, "customerDmsl");
            return (Criteria) this;
        }

        public Criteria andCustomerDmslLessThan(String value) {
            addCriterion("CUSTOMER_DMSL <", value, "customerDmsl");
            return (Criteria) this;
        }

        public Criteria andCustomerDmslLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_DMSL <=", value, "customerDmsl");
            return (Criteria) this;
        }

        public Criteria andCustomerDmslLike(String value) {
            addCriterion("CUSTOMER_DMSL like", value, "customerDmsl");
            return (Criteria) this;
        }

        public Criteria andCustomerDmslNotLike(String value) {
            addCriterion("CUSTOMER_DMSL not like", value, "customerDmsl");
            return (Criteria) this;
        }

        public Criteria andCustomerDmslIn(List<String> values) {
            addCriterion("CUSTOMER_DMSL in", values, "customerDmsl");
            return (Criteria) this;
        }

        public Criteria andCustomerDmslNotIn(List<String> values) {
            addCriterion("CUSTOMER_DMSL not in", values, "customerDmsl");
            return (Criteria) this;
        }

        public Criteria andCustomerDmslBetween(String value1, String value2) {
            addCriterion("CUSTOMER_DMSL between", value1, value2, "customerDmsl");
            return (Criteria) this;
        }

        public Criteria andCustomerDmslNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_DMSL not between", value1, value2, "customerDmsl");
            return (Criteria) this;
        }

        public Criteria andCustomerFxsslIsNull() {
            addCriterion("CUSTOMER_FXSSL is null");
            return (Criteria) this;
        }

        public Criteria andCustomerFxsslIsNotNull() {
            addCriterion("CUSTOMER_FXSSL is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerFxsslEqualTo(String value) {
            addCriterion("CUSTOMER_FXSSL =", value, "customerFxssl");
            return (Criteria) this;
        }

        public Criteria andCustomerFxsslNotEqualTo(String value) {
            addCriterion("CUSTOMER_FXSSL <>", value, "customerFxssl");
            return (Criteria) this;
        }

        public Criteria andCustomerFxsslGreaterThan(String value) {
            addCriterion("CUSTOMER_FXSSL >", value, "customerFxssl");
            return (Criteria) this;
        }

        public Criteria andCustomerFxsslGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_FXSSL >=", value, "customerFxssl");
            return (Criteria) this;
        }

        public Criteria andCustomerFxsslLessThan(String value) {
            addCriterion("CUSTOMER_FXSSL <", value, "customerFxssl");
            return (Criteria) this;
        }

        public Criteria andCustomerFxsslLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_FXSSL <=", value, "customerFxssl");
            return (Criteria) this;
        }

        public Criteria andCustomerFxsslLike(String value) {
            addCriterion("CUSTOMER_FXSSL like", value, "customerFxssl");
            return (Criteria) this;
        }

        public Criteria andCustomerFxsslNotLike(String value) {
            addCriterion("CUSTOMER_FXSSL not like", value, "customerFxssl");
            return (Criteria) this;
        }

        public Criteria andCustomerFxsslIn(List<String> values) {
            addCriterion("CUSTOMER_FXSSL in", values, "customerFxssl");
            return (Criteria) this;
        }

        public Criteria andCustomerFxsslNotIn(List<String> values) {
            addCriterion("CUSTOMER_FXSSL not in", values, "customerFxssl");
            return (Criteria) this;
        }

        public Criteria andCustomerFxsslBetween(String value1, String value2) {
            addCriterion("CUSTOMER_FXSSL between", value1, value2, "customerFxssl");
            return (Criteria) this;
        }

        public Criteria andCustomerFxsslNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_FXSSL not between", value1, value2, "customerFxssl");
            return (Criteria) this;
        }

        public Criteria andDateCrtsIsNull() {
            addCriterion("DATE_CRTS is null");
            return (Criteria) this;
        }

        public Criteria andDateCrtsIsNotNull() {
            addCriterion("DATE_CRTS is not null");
            return (Criteria) this;
        }

        public Criteria andDateCrtsEqualTo(Short value) {
            addCriterion("DATE_CRTS =", value, "dateCrts");
            return (Criteria) this;
        }

        public Criteria andDateCrtsNotEqualTo(Short value) {
            addCriterion("DATE_CRTS <>", value, "dateCrts");
            return (Criteria) this;
        }

        public Criteria andDateCrtsGreaterThan(Short value) {
            addCriterion("DATE_CRTS >", value, "dateCrts");
            return (Criteria) this;
        }

        public Criteria andDateCrtsGreaterThanOrEqualTo(Short value) {
            addCriterion("DATE_CRTS >=", value, "dateCrts");
            return (Criteria) this;
        }

        public Criteria andDateCrtsLessThan(Short value) {
            addCriterion("DATE_CRTS <", value, "dateCrts");
            return (Criteria) this;
        }

        public Criteria andDateCrtsLessThanOrEqualTo(Short value) {
            addCriterion("DATE_CRTS <=", value, "dateCrts");
            return (Criteria) this;
        }

        public Criteria andDateCrtsIn(List<Short> values) {
            addCriterion("DATE_CRTS in", values, "dateCrts");
            return (Criteria) this;
        }

        public Criteria andDateCrtsNotIn(List<Short> values) {
            addCriterion("DATE_CRTS not in", values, "dateCrts");
            return (Criteria) this;
        }

        public Criteria andDateCrtsBetween(Short value1, Short value2) {
            addCriterion("DATE_CRTS between", value1, value2, "dateCrts");
            return (Criteria) this;
        }

        public Criteria andDateCrtsNotBetween(Short value1, Short value2) {
            addCriterion("DATE_CRTS not between", value1, value2, "dateCrts");
            return (Criteria) this;
        }

        public Criteria andCustomerAgentIsNull() {
            addCriterion("CUSTOMER_AGENT is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAgentIsNotNull() {
            addCriterion("CUSTOMER_AGENT is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAgentEqualTo(String value) {
            addCriterion("CUSTOMER_AGENT =", value, "customerAgent");
            return (Criteria) this;
        }

        public Criteria andCustomerAgentNotEqualTo(String value) {
            addCriterion("CUSTOMER_AGENT <>", value, "customerAgent");
            return (Criteria) this;
        }

        public Criteria andCustomerAgentGreaterThan(String value) {
            addCriterion("CUSTOMER_AGENT >", value, "customerAgent");
            return (Criteria) this;
        }

        public Criteria andCustomerAgentGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_AGENT >=", value, "customerAgent");
            return (Criteria) this;
        }

        public Criteria andCustomerAgentLessThan(String value) {
            addCriterion("CUSTOMER_AGENT <", value, "customerAgent");
            return (Criteria) this;
        }

        public Criteria andCustomerAgentLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_AGENT <=", value, "customerAgent");
            return (Criteria) this;
        }

        public Criteria andCustomerAgentLike(String value) {
            addCriterion("CUSTOMER_AGENT like", value, "customerAgent");
            return (Criteria) this;
        }

        public Criteria andCustomerAgentNotLike(String value) {
            addCriterion("CUSTOMER_AGENT not like", value, "customerAgent");
            return (Criteria) this;
        }

        public Criteria andCustomerAgentIn(List<String> values) {
            addCriterion("CUSTOMER_AGENT in", values, "customerAgent");
            return (Criteria) this;
        }

        public Criteria andCustomerAgentNotIn(List<String> values) {
            addCriterion("CUSTOMER_AGENT not in", values, "customerAgent");
            return (Criteria) this;
        }

        public Criteria andCustomerAgentBetween(String value1, String value2) {
            addCriterion("CUSTOMER_AGENT between", value1, value2, "customerAgent");
            return (Criteria) this;
        }

        public Criteria andCustomerAgentNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_AGENT not between", value1, value2, "customerAgent");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict3IsNull() {
            addCriterion("AREA_DISTRICT_3 is null");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict3IsNotNull() {
            addCriterion("AREA_DISTRICT_3 is not null");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict3EqualTo(String value) {
            addCriterion("AREA_DISTRICT_3 =", value, "areaDistrict3");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict3NotEqualTo(String value) {
            addCriterion("AREA_DISTRICT_3 <>", value, "areaDistrict3");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict3GreaterThan(String value) {
            addCriterion("AREA_DISTRICT_3 >", value, "areaDistrict3");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict3GreaterThanOrEqualTo(String value) {
            addCriterion("AREA_DISTRICT_3 >=", value, "areaDistrict3");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict3LessThan(String value) {
            addCriterion("AREA_DISTRICT_3 <", value, "areaDistrict3");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict3LessThanOrEqualTo(String value) {
            addCriterion("AREA_DISTRICT_3 <=", value, "areaDistrict3");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict3Like(String value) {
            addCriterion("AREA_DISTRICT_3 like", value, "areaDistrict3");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict3NotLike(String value) {
            addCriterion("AREA_DISTRICT_3 not like", value, "areaDistrict3");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict3In(List<String> values) {
            addCriterion("AREA_DISTRICT_3 in", values, "areaDistrict3");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict3NotIn(List<String> values) {
            addCriterion("AREA_DISTRICT_3 not in", values, "areaDistrict3");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict3Between(String value1, String value2) {
            addCriterion("AREA_DISTRICT_3 between", value1, value2, "areaDistrict3");
            return (Criteria) this;
        }

        public Criteria andAreaDistrict3NotBetween(String value1, String value2) {
            addCriterion("AREA_DISTRICT_3 not between", value1, value2, "areaDistrict3");
            return (Criteria) this;
        }

        public Criteria andOfficeTel1IsNull() {
            addCriterion("OFFICE_TEL_1 is null");
            return (Criteria) this;
        }

        public Criteria andOfficeTel1IsNotNull() {
            addCriterion("OFFICE_TEL_1 is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeTel1EqualTo(String value) {
            addCriterion("OFFICE_TEL_1 =", value, "officeTel1");
            return (Criteria) this;
        }

        public Criteria andOfficeTel1NotEqualTo(String value) {
            addCriterion("OFFICE_TEL_1 <>", value, "officeTel1");
            return (Criteria) this;
        }

        public Criteria andOfficeTel1GreaterThan(String value) {
            addCriterion("OFFICE_TEL_1 >", value, "officeTel1");
            return (Criteria) this;
        }

        public Criteria andOfficeTel1GreaterThanOrEqualTo(String value) {
            addCriterion("OFFICE_TEL_1 >=", value, "officeTel1");
            return (Criteria) this;
        }

        public Criteria andOfficeTel1LessThan(String value) {
            addCriterion("OFFICE_TEL_1 <", value, "officeTel1");
            return (Criteria) this;
        }

        public Criteria andOfficeTel1LessThanOrEqualTo(String value) {
            addCriterion("OFFICE_TEL_1 <=", value, "officeTel1");
            return (Criteria) this;
        }

        public Criteria andOfficeTel1Like(String value) {
            addCriterion("OFFICE_TEL_1 like", value, "officeTel1");
            return (Criteria) this;
        }

        public Criteria andOfficeTel1NotLike(String value) {
            addCriterion("OFFICE_TEL_1 not like", value, "officeTel1");
            return (Criteria) this;
        }

        public Criteria andOfficeTel1In(List<String> values) {
            addCriterion("OFFICE_TEL_1 in", values, "officeTel1");
            return (Criteria) this;
        }

        public Criteria andOfficeTel1NotIn(List<String> values) {
            addCriterion("OFFICE_TEL_1 not in", values, "officeTel1");
            return (Criteria) this;
        }

        public Criteria andOfficeTel1Between(String value1, String value2) {
            addCriterion("OFFICE_TEL_1 between", value1, value2, "officeTel1");
            return (Criteria) this;
        }

        public Criteria andOfficeTel1NotBetween(String value1, String value2) {
            addCriterion("OFFICE_TEL_1 not between", value1, value2, "officeTel1");
            return (Criteria) this;
        }

        public Criteria andHandsetIsNull() {
            addCriterion("HANDSET is null");
            return (Criteria) this;
        }

        public Criteria andHandsetIsNotNull() {
            addCriterion("HANDSET is not null");
            return (Criteria) this;
        }

        public Criteria andHandsetEqualTo(String value) {
            addCriterion("HANDSET =", value, "handset");
            return (Criteria) this;
        }

        public Criteria andHandsetNotEqualTo(String value) {
            addCriterion("HANDSET <>", value, "handset");
            return (Criteria) this;
        }

        public Criteria andHandsetGreaterThan(String value) {
            addCriterion("HANDSET >", value, "handset");
            return (Criteria) this;
        }

        public Criteria andHandsetGreaterThanOrEqualTo(String value) {
            addCriterion("HANDSET >=", value, "handset");
            return (Criteria) this;
        }

        public Criteria andHandsetLessThan(String value) {
            addCriterion("HANDSET <", value, "handset");
            return (Criteria) this;
        }

        public Criteria andHandsetLessThanOrEqualTo(String value) {
            addCriterion("HANDSET <=", value, "handset");
            return (Criteria) this;
        }

        public Criteria andHandsetLike(String value) {
            addCriterion("HANDSET like", value, "handset");
            return (Criteria) this;
        }

        public Criteria andHandsetNotLike(String value) {
            addCriterion("HANDSET not like", value, "handset");
            return (Criteria) this;
        }

        public Criteria andHandsetIn(List<String> values) {
            addCriterion("HANDSET in", values, "handset");
            return (Criteria) this;
        }

        public Criteria andHandsetNotIn(List<String> values) {
            addCriterion("HANDSET not in", values, "handset");
            return (Criteria) this;
        }

        public Criteria andHandsetBetween(String value1, String value2) {
            addCriterion("HANDSET between", value1, value2, "handset");
            return (Criteria) this;
        }

        public Criteria andHandsetNotBetween(String value1, String value2) {
            addCriterion("HANDSET not between", value1, value2, "handset");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIsNull() {
            addCriterion("CUSTOMER_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIsNotNull() {
            addCriterion("CUSTOMER_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelEqualTo(String value) {
            addCriterion("CUSTOMER_LEVEL =", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotEqualTo(String value) {
            addCriterion("CUSTOMER_LEVEL <>", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelGreaterThan(String value) {
            addCriterion("CUSTOMER_LEVEL >", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_LEVEL >=", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLessThan(String value) {
            addCriterion("CUSTOMER_LEVEL <", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_LEVEL <=", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLike(String value) {
            addCriterion("CUSTOMER_LEVEL like", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotLike(String value) {
            addCriterion("CUSTOMER_LEVEL not like", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIn(List<String> values) {
            addCriterion("CUSTOMER_LEVEL in", values, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotIn(List<String> values) {
            addCriterion("CUSTOMER_LEVEL not in", values, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelBetween(String value1, String value2) {
            addCriterion("CUSTOMER_LEVEL between", value1, value2, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_LEVEL not between", value1, value2, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andTranscompanyIdIsNull() {
            addCriterion("TRANSCOMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andTranscompanyIdIsNotNull() {
            addCriterion("TRANSCOMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTranscompanyIdEqualTo(String value) {
            addCriterion("TRANSCOMPANY_ID =", value, "transcompanyId");
            return (Criteria) this;
        }

        public Criteria andTranscompanyIdNotEqualTo(String value) {
            addCriterion("TRANSCOMPANY_ID <>", value, "transcompanyId");
            return (Criteria) this;
        }

        public Criteria andTranscompanyIdGreaterThan(String value) {
            addCriterion("TRANSCOMPANY_ID >", value, "transcompanyId");
            return (Criteria) this;
        }

        public Criteria andTranscompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSCOMPANY_ID >=", value, "transcompanyId");
            return (Criteria) this;
        }

        public Criteria andTranscompanyIdLessThan(String value) {
            addCriterion("TRANSCOMPANY_ID <", value, "transcompanyId");
            return (Criteria) this;
        }

        public Criteria andTranscompanyIdLessThanOrEqualTo(String value) {
            addCriterion("TRANSCOMPANY_ID <=", value, "transcompanyId");
            return (Criteria) this;
        }

        public Criteria andTranscompanyIdLike(String value) {
            addCriterion("TRANSCOMPANY_ID like", value, "transcompanyId");
            return (Criteria) this;
        }

        public Criteria andTranscompanyIdNotLike(String value) {
            addCriterion("TRANSCOMPANY_ID not like", value, "transcompanyId");
            return (Criteria) this;
        }

        public Criteria andTranscompanyIdIn(List<String> values) {
            addCriterion("TRANSCOMPANY_ID in", values, "transcompanyId");
            return (Criteria) this;
        }

        public Criteria andTranscompanyIdNotIn(List<String> values) {
            addCriterion("TRANSCOMPANY_ID not in", values, "transcompanyId");
            return (Criteria) this;
        }

        public Criteria andTranscompanyIdBetween(String value1, String value2) {
            addCriterion("TRANSCOMPANY_ID between", value1, value2, "transcompanyId");
            return (Criteria) this;
        }

        public Criteria andTranscompanyIdNotBetween(String value1, String value2) {
            addCriterion("TRANSCOMPANY_ID not between", value1, value2, "transcompanyId");
            return (Criteria) this;
        }

        public Criteria andManagerIsNull() {
            addCriterion("MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andManagerIsNotNull() {
            addCriterion("MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andManagerEqualTo(String value) {
            addCriterion("MANAGER =", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotEqualTo(String value) {
            addCriterion("MANAGER <>", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThan(String value) {
            addCriterion("MANAGER >", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGER >=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThan(String value) {
            addCriterion("MANAGER <", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThanOrEqualTo(String value) {
            addCriterion("MANAGER <=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLike(String value) {
            addCriterion("MANAGER like", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotLike(String value) {
            addCriterion("MANAGER not like", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerIn(List<String> values) {
            addCriterion("MANAGER in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotIn(List<String> values) {
            addCriterion("MANAGER not in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerBetween(String value1, String value2) {
            addCriterion("MANAGER between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotBetween(String value1, String value2) {
            addCriterion("MANAGER not between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andStockNoIsNull() {
            addCriterion("STOCK_NO is null");
            return (Criteria) this;
        }

        public Criteria andStockNoIsNotNull() {
            addCriterion("STOCK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andStockNoEqualTo(String value) {
            addCriterion("STOCK_NO =", value, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoNotEqualTo(String value) {
            addCriterion("STOCK_NO <>", value, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoGreaterThan(String value) {
            addCriterion("STOCK_NO >", value, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoGreaterThanOrEqualTo(String value) {
            addCriterion("STOCK_NO >=", value, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoLessThan(String value) {
            addCriterion("STOCK_NO <", value, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoLessThanOrEqualTo(String value) {
            addCriterion("STOCK_NO <=", value, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoLike(String value) {
            addCriterion("STOCK_NO like", value, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoNotLike(String value) {
            addCriterion("STOCK_NO not like", value, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoIn(List<String> values) {
            addCriterion("STOCK_NO in", values, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoNotIn(List<String> values) {
            addCriterion("STOCK_NO not in", values, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoBetween(String value1, String value2) {
            addCriterion("STOCK_NO between", value1, value2, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoNotBetween(String value1, String value2) {
            addCriterion("STOCK_NO not between", value1, value2, "stockNo");
            return (Criteria) this;
        }

        public Criteria andCustomerBelong2IsNull() {
            addCriterion("CUSTOMER_BELONG2 is null");
            return (Criteria) this;
        }

        public Criteria andCustomerBelong2IsNotNull() {
            addCriterion("CUSTOMER_BELONG2 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerBelong2EqualTo(String value) {
            addCriterion("CUSTOMER_BELONG2 =", value, "customerBelong2");
            return (Criteria) this;
        }

        public Criteria andCustomerBelong2NotEqualTo(String value) {
            addCriterion("CUSTOMER_BELONG2 <>", value, "customerBelong2");
            return (Criteria) this;
        }

        public Criteria andCustomerBelong2GreaterThan(String value) {
            addCriterion("CUSTOMER_BELONG2 >", value, "customerBelong2");
            return (Criteria) this;
        }

        public Criteria andCustomerBelong2GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_BELONG2 >=", value, "customerBelong2");
            return (Criteria) this;
        }

        public Criteria andCustomerBelong2LessThan(String value) {
            addCriterion("CUSTOMER_BELONG2 <", value, "customerBelong2");
            return (Criteria) this;
        }

        public Criteria andCustomerBelong2LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_BELONG2 <=", value, "customerBelong2");
            return (Criteria) this;
        }

        public Criteria andCustomerBelong2Like(String value) {
            addCriterion("CUSTOMER_BELONG2 like", value, "customerBelong2");
            return (Criteria) this;
        }

        public Criteria andCustomerBelong2NotLike(String value) {
            addCriterion("CUSTOMER_BELONG2 not like", value, "customerBelong2");
            return (Criteria) this;
        }

        public Criteria andCustomerBelong2In(List<String> values) {
            addCriterion("CUSTOMER_BELONG2 in", values, "customerBelong2");
            return (Criteria) this;
        }

        public Criteria andCustomerBelong2NotIn(List<String> values) {
            addCriterion("CUSTOMER_BELONG2 not in", values, "customerBelong2");
            return (Criteria) this;
        }

        public Criteria andCustomerBelong2Between(String value1, String value2) {
            addCriterion("CUSTOMER_BELONG2 between", value1, value2, "customerBelong2");
            return (Criteria) this;
        }

        public Criteria andCustomerBelong2NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_BELONG2 not between", value1, value2, "customerBelong2");
            return (Criteria) this;
        }

        public Criteria andManager1IsNull() {
            addCriterion("MANAGER1 is null");
            return (Criteria) this;
        }

        public Criteria andManager1IsNotNull() {
            addCriterion("MANAGER1 is not null");
            return (Criteria) this;
        }

        public Criteria andManager1EqualTo(String value) {
            addCriterion("MANAGER1 =", value, "manager1");
            return (Criteria) this;
        }

        public Criteria andManager1NotEqualTo(String value) {
            addCriterion("MANAGER1 <>", value, "manager1");
            return (Criteria) this;
        }

        public Criteria andManager1GreaterThan(String value) {
            addCriterion("MANAGER1 >", value, "manager1");
            return (Criteria) this;
        }

        public Criteria andManager1GreaterThanOrEqualTo(String value) {
            addCriterion("MANAGER1 >=", value, "manager1");
            return (Criteria) this;
        }

        public Criteria andManager1LessThan(String value) {
            addCriterion("MANAGER1 <", value, "manager1");
            return (Criteria) this;
        }

        public Criteria andManager1LessThanOrEqualTo(String value) {
            addCriterion("MANAGER1 <=", value, "manager1");
            return (Criteria) this;
        }

        public Criteria andManager1Like(String value) {
            addCriterion("MANAGER1 like", value, "manager1");
            return (Criteria) this;
        }

        public Criteria andManager1NotLike(String value) {
            addCriterion("MANAGER1 not like", value, "manager1");
            return (Criteria) this;
        }

        public Criteria andManager1In(List<String> values) {
            addCriterion("MANAGER1 in", values, "manager1");
            return (Criteria) this;
        }

        public Criteria andManager1NotIn(List<String> values) {
            addCriterion("MANAGER1 not in", values, "manager1");
            return (Criteria) this;
        }

        public Criteria andManager1Between(String value1, String value2) {
            addCriterion("MANAGER1 between", value1, value2, "manager1");
            return (Criteria) this;
        }

        public Criteria andManager1NotBetween(String value1, String value2) {
            addCriterion("MANAGER1 not between", value1, value2, "manager1");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNull() {
            addCriterion("INVOICE is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("INVOICE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(String value) {
            addCriterion("INVOICE =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(String value) {
            addCriterion("INVOICE <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(String value) {
            addCriterion("INVOICE >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(String value) {
            addCriterion("INVOICE <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(String value) {
            addCriterion("INVOICE <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLike(String value) {
            addCriterion("INVOICE like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotLike(String value) {
            addCriterion("INVOICE not like", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<String> values) {
            addCriterion("INVOICE in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<String> values) {
            addCriterion("INVOICE not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(String value1, String value2) {
            addCriterion("INVOICE between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(String value1, String value2) {
            addCriterion("INVOICE not between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartSalIsNull() {
            addCriterion("RECEIVE_MONTH_START_SAL is null");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartSalIsNotNull() {
            addCriterion("RECEIVE_MONTH_START_SAL is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartSalEqualTo(BigDecimal value) {
            addCriterion("RECEIVE_MONTH_START_SAL =", value, "receiveMonthStartSal");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartSalNotEqualTo(BigDecimal value) {
            addCriterion("RECEIVE_MONTH_START_SAL <>", value, "receiveMonthStartSal");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartSalGreaterThan(BigDecimal value) {
            addCriterion("RECEIVE_MONTH_START_SAL >", value, "receiveMonthStartSal");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartSalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVE_MONTH_START_SAL >=", value, "receiveMonthStartSal");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartSalLessThan(BigDecimal value) {
            addCriterion("RECEIVE_MONTH_START_SAL <", value, "receiveMonthStartSal");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartSalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVE_MONTH_START_SAL <=", value, "receiveMonthStartSal");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartSalIn(List<BigDecimal> values) {
            addCriterion("RECEIVE_MONTH_START_SAL in", values, "receiveMonthStartSal");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartSalNotIn(List<BigDecimal> values) {
            addCriterion("RECEIVE_MONTH_START_SAL not in", values, "receiveMonthStartSal");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartSalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVE_MONTH_START_SAL between", value1, value2, "receiveMonthStartSal");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartSalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVE_MONTH_START_SAL not between", value1, value2, "receiveMonthStartSal");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartZtSalIsNull() {
            addCriterion("RECEIVE_MONTH_START_ZT_SAL is null");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartZtSalIsNotNull() {
            addCriterion("RECEIVE_MONTH_START_ZT_SAL is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartZtSalEqualTo(BigDecimal value) {
            addCriterion("RECEIVE_MONTH_START_ZT_SAL =", value, "receiveMonthStartZtSal");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartZtSalNotEqualTo(BigDecimal value) {
            addCriterion("RECEIVE_MONTH_START_ZT_SAL <>", value, "receiveMonthStartZtSal");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartZtSalGreaterThan(BigDecimal value) {
            addCriterion("RECEIVE_MONTH_START_ZT_SAL >", value, "receiveMonthStartZtSal");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartZtSalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVE_MONTH_START_ZT_SAL >=", value, "receiveMonthStartZtSal");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartZtSalLessThan(BigDecimal value) {
            addCriterion("RECEIVE_MONTH_START_ZT_SAL <", value, "receiveMonthStartZtSal");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartZtSalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVE_MONTH_START_ZT_SAL <=", value, "receiveMonthStartZtSal");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartZtSalIn(List<BigDecimal> values) {
            addCriterion("RECEIVE_MONTH_START_ZT_SAL in", values, "receiveMonthStartZtSal");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartZtSalNotIn(List<BigDecimal> values) {
            addCriterion("RECEIVE_MONTH_START_ZT_SAL not in", values, "receiveMonthStartZtSal");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartZtSalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVE_MONTH_START_ZT_SAL between", value1, value2, "receiveMonthStartZtSal");
            return (Criteria) this;
        }

        public Criteria andReceiveMonthStartZtSalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVE_MONTH_START_ZT_SAL not between", value1, value2, "receiveMonthStartZtSal");
            return (Criteria) this;
        }

        public Criteria andHandset2IsNull() {
            addCriterion("HANDSET_2 is null");
            return (Criteria) this;
        }

        public Criteria andHandset2IsNotNull() {
            addCriterion("HANDSET_2 is not null");
            return (Criteria) this;
        }

        public Criteria andHandset2EqualTo(String value) {
            addCriterion("HANDSET_2 =", value, "handset2");
            return (Criteria) this;
        }

        public Criteria andHandset2NotEqualTo(String value) {
            addCriterion("HANDSET_2 <>", value, "handset2");
            return (Criteria) this;
        }

        public Criteria andHandset2GreaterThan(String value) {
            addCriterion("HANDSET_2 >", value, "handset2");
            return (Criteria) this;
        }

        public Criteria andHandset2GreaterThanOrEqualTo(String value) {
            addCriterion("HANDSET_2 >=", value, "handset2");
            return (Criteria) this;
        }

        public Criteria andHandset2LessThan(String value) {
            addCriterion("HANDSET_2 <", value, "handset2");
            return (Criteria) this;
        }

        public Criteria andHandset2LessThanOrEqualTo(String value) {
            addCriterion("HANDSET_2 <=", value, "handset2");
            return (Criteria) this;
        }

        public Criteria andHandset2Like(String value) {
            addCriterion("HANDSET_2 like", value, "handset2");
            return (Criteria) this;
        }

        public Criteria andHandset2NotLike(String value) {
            addCriterion("HANDSET_2 not like", value, "handset2");
            return (Criteria) this;
        }

        public Criteria andHandset2In(List<String> values) {
            addCriterion("HANDSET_2 in", values, "handset2");
            return (Criteria) this;
        }

        public Criteria andHandset2NotIn(List<String> values) {
            addCriterion("HANDSET_2 not in", values, "handset2");
            return (Criteria) this;
        }

        public Criteria andHandset2Between(String value1, String value2) {
            addCriterion("HANDSET_2 between", value1, value2, "handset2");
            return (Criteria) this;
        }

        public Criteria andHandset2NotBetween(String value1, String value2) {
            addCriterion("HANDSET_2 not between", value1, value2, "handset2");
            return (Criteria) this;
        }

        public Criteria andTransFlagIsNull() {
            addCriterion("TRANS_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andTransFlagIsNotNull() {
            addCriterion("TRANS_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andTransFlagEqualTo(String value) {
            addCriterion("TRANS_FLAG =", value, "transFlag");
            return (Criteria) this;
        }

        public Criteria andTransFlagNotEqualTo(String value) {
            addCriterion("TRANS_FLAG <>", value, "transFlag");
            return (Criteria) this;
        }

        public Criteria andTransFlagGreaterThan(String value) {
            addCriterion("TRANS_FLAG >", value, "transFlag");
            return (Criteria) this;
        }

        public Criteria andTransFlagGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_FLAG >=", value, "transFlag");
            return (Criteria) this;
        }

        public Criteria andTransFlagLessThan(String value) {
            addCriterion("TRANS_FLAG <", value, "transFlag");
            return (Criteria) this;
        }

        public Criteria andTransFlagLessThanOrEqualTo(String value) {
            addCriterion("TRANS_FLAG <=", value, "transFlag");
            return (Criteria) this;
        }

        public Criteria andTransFlagLike(String value) {
            addCriterion("TRANS_FLAG like", value, "transFlag");
            return (Criteria) this;
        }

        public Criteria andTransFlagNotLike(String value) {
            addCriterion("TRANS_FLAG not like", value, "transFlag");
            return (Criteria) this;
        }

        public Criteria andTransFlagIn(List<String> values) {
            addCriterion("TRANS_FLAG in", values, "transFlag");
            return (Criteria) this;
        }

        public Criteria andTransFlagNotIn(List<String> values) {
            addCriterion("TRANS_FLAG not in", values, "transFlag");
            return (Criteria) this;
        }

        public Criteria andTransFlagBetween(String value1, String value2) {
            addCriterion("TRANS_FLAG between", value1, value2, "transFlag");
            return (Criteria) this;
        }

        public Criteria andTransFlagNotBetween(String value1, String value2) {
            addCriterion("TRANS_FLAG not between", value1, value2, "transFlag");
            return (Criteria) this;
        }

        public Criteria andPassDateIsNull() {
            addCriterion("PASS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPassDateIsNotNull() {
            addCriterion("PASS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPassDateEqualTo(Date value) {
            addCriterion("PASS_DATE =", value, "passDate");
            return (Criteria) this;
        }

        public Criteria andPassDateNotEqualTo(Date value) {
            addCriterion("PASS_DATE <>", value, "passDate");
            return (Criteria) this;
        }

        public Criteria andPassDateGreaterThan(Date value) {
            addCriterion("PASS_DATE >", value, "passDate");
            return (Criteria) this;
        }

        public Criteria andPassDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PASS_DATE >=", value, "passDate");
            return (Criteria) this;
        }

        public Criteria andPassDateLessThan(Date value) {
            addCriterion("PASS_DATE <", value, "passDate");
            return (Criteria) this;
        }

        public Criteria andPassDateLessThanOrEqualTo(Date value) {
            addCriterion("PASS_DATE <=", value, "passDate");
            return (Criteria) this;
        }

        public Criteria andPassDateIn(List<Date> values) {
            addCriterion("PASS_DATE in", values, "passDate");
            return (Criteria) this;
        }

        public Criteria andPassDateNotIn(List<Date> values) {
            addCriterion("PASS_DATE not in", values, "passDate");
            return (Criteria) this;
        }

        public Criteria andPassDateBetween(Date value1, Date value2) {
            addCriterion("PASS_DATE between", value1, value2, "passDate");
            return (Criteria) this;
        }

        public Criteria andPassDateNotBetween(Date value1, Date value2) {
            addCriterion("PASS_DATE not between", value1, value2, "passDate");
            return (Criteria) this;
        }

        public Criteria andSignFlagIsNull() {
            addCriterion("SIGN_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSignFlagIsNotNull() {
            addCriterion("SIGN_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSignFlagEqualTo(String value) {
            addCriterion("SIGN_FLAG =", value, "signFlag");
            return (Criteria) this;
        }

        public Criteria andSignFlagNotEqualTo(String value) {
            addCriterion("SIGN_FLAG <>", value, "signFlag");
            return (Criteria) this;
        }

        public Criteria andSignFlagGreaterThan(String value) {
            addCriterion("SIGN_FLAG >", value, "signFlag");
            return (Criteria) this;
        }

        public Criteria andSignFlagGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_FLAG >=", value, "signFlag");
            return (Criteria) this;
        }

        public Criteria andSignFlagLessThan(String value) {
            addCriterion("SIGN_FLAG <", value, "signFlag");
            return (Criteria) this;
        }

        public Criteria andSignFlagLessThanOrEqualTo(String value) {
            addCriterion("SIGN_FLAG <=", value, "signFlag");
            return (Criteria) this;
        }

        public Criteria andSignFlagLike(String value) {
            addCriterion("SIGN_FLAG like", value, "signFlag");
            return (Criteria) this;
        }

        public Criteria andSignFlagNotLike(String value) {
            addCriterion("SIGN_FLAG not like", value, "signFlag");
            return (Criteria) this;
        }

        public Criteria andSignFlagIn(List<String> values) {
            addCriterion("SIGN_FLAG in", values, "signFlag");
            return (Criteria) this;
        }

        public Criteria andSignFlagNotIn(List<String> values) {
            addCriterion("SIGN_FLAG not in", values, "signFlag");
            return (Criteria) this;
        }

        public Criteria andSignFlagBetween(String value1, String value2) {
            addCriterion("SIGN_FLAG between", value1, value2, "signFlag");
            return (Criteria) this;
        }

        public Criteria andSignFlagNotBetween(String value1, String value2) {
            addCriterion("SIGN_FLAG not between", value1, value2, "signFlag");
            return (Criteria) this;
        }

        public Criteria andMoneyRebateIsNull() {
            addCriterion("MONEY_REBATE is null");
            return (Criteria) this;
        }

        public Criteria andMoneyRebateIsNotNull() {
            addCriterion("MONEY_REBATE is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyRebateEqualTo(BigDecimal value) {
            addCriterion("MONEY_REBATE =", value, "moneyRebate");
            return (Criteria) this;
        }

        public Criteria andMoneyRebateNotEqualTo(BigDecimal value) {
            addCriterion("MONEY_REBATE <>", value, "moneyRebate");
            return (Criteria) this;
        }

        public Criteria andMoneyRebateGreaterThan(BigDecimal value) {
            addCriterion("MONEY_REBATE >", value, "moneyRebate");
            return (Criteria) this;
        }

        public Criteria andMoneyRebateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY_REBATE >=", value, "moneyRebate");
            return (Criteria) this;
        }

        public Criteria andMoneyRebateLessThan(BigDecimal value) {
            addCriterion("MONEY_REBATE <", value, "moneyRebate");
            return (Criteria) this;
        }

        public Criteria andMoneyRebateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY_REBATE <=", value, "moneyRebate");
            return (Criteria) this;
        }

        public Criteria andMoneyRebateIn(List<BigDecimal> values) {
            addCriterion("MONEY_REBATE in", values, "moneyRebate");
            return (Criteria) this;
        }

        public Criteria andMoneyRebateNotIn(List<BigDecimal> values) {
            addCriterion("MONEY_REBATE not in", values, "moneyRebate");
            return (Criteria) this;
        }

        public Criteria andMoneyRebateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY_REBATE between", value1, value2, "moneyRebate");
            return (Criteria) this;
        }

        public Criteria andMoneyRebateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY_REBATE not between", value1, value2, "moneyRebate");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonHandsetDIsNull() {
            addCriterion("JURIDIC_PERSON_HANDSET_D is null");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonHandsetDIsNotNull() {
            addCriterion("JURIDIC_PERSON_HANDSET_D is not null");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonHandsetDEqualTo(String value) {
            addCriterion("JURIDIC_PERSON_HANDSET_D =", value, "juridicPersonHandsetD");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonHandsetDNotEqualTo(String value) {
            addCriterion("JURIDIC_PERSON_HANDSET_D <>", value, "juridicPersonHandsetD");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonHandsetDGreaterThan(String value) {
            addCriterion("JURIDIC_PERSON_HANDSET_D >", value, "juridicPersonHandsetD");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonHandsetDGreaterThanOrEqualTo(String value) {
            addCriterion("JURIDIC_PERSON_HANDSET_D >=", value, "juridicPersonHandsetD");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonHandsetDLessThan(String value) {
            addCriterion("JURIDIC_PERSON_HANDSET_D <", value, "juridicPersonHandsetD");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonHandsetDLessThanOrEqualTo(String value) {
            addCriterion("JURIDIC_PERSON_HANDSET_D <=", value, "juridicPersonHandsetD");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonHandsetDLike(String value) {
            addCriterion("JURIDIC_PERSON_HANDSET_D like", value, "juridicPersonHandsetD");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonHandsetDNotLike(String value) {
            addCriterion("JURIDIC_PERSON_HANDSET_D not like", value, "juridicPersonHandsetD");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonHandsetDIn(List<String> values) {
            addCriterion("JURIDIC_PERSON_HANDSET_D in", values, "juridicPersonHandsetD");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonHandsetDNotIn(List<String> values) {
            addCriterion("JURIDIC_PERSON_HANDSET_D not in", values, "juridicPersonHandsetD");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonHandsetDBetween(String value1, String value2) {
            addCriterion("JURIDIC_PERSON_HANDSET_D between", value1, value2, "juridicPersonHandsetD");
            return (Criteria) this;
        }

        public Criteria andJuridicPersonHandsetDNotBetween(String value1, String value2) {
            addCriterion("JURIDIC_PERSON_HANDSET_D not between", value1, value2, "juridicPersonHandsetD");
            return (Criteria) this;
        }

        public Criteria andQqDIsNull() {
            addCriterion("QQ_D is null");
            return (Criteria) this;
        }

        public Criteria andQqDIsNotNull() {
            addCriterion("QQ_D is not null");
            return (Criteria) this;
        }

        public Criteria andQqDEqualTo(String value) {
            addCriterion("QQ_D =", value, "qqD");
            return (Criteria) this;
        }

        public Criteria andQqDNotEqualTo(String value) {
            addCriterion("QQ_D <>", value, "qqD");
            return (Criteria) this;
        }

        public Criteria andQqDGreaterThan(String value) {
            addCriterion("QQ_D >", value, "qqD");
            return (Criteria) this;
        }

        public Criteria andQqDGreaterThanOrEqualTo(String value) {
            addCriterion("QQ_D >=", value, "qqD");
            return (Criteria) this;
        }

        public Criteria andQqDLessThan(String value) {
            addCriterion("QQ_D <", value, "qqD");
            return (Criteria) this;
        }

        public Criteria andQqDLessThanOrEqualTo(String value) {
            addCriterion("QQ_D <=", value, "qqD");
            return (Criteria) this;
        }

        public Criteria andQqDLike(String value) {
            addCriterion("QQ_D like", value, "qqD");
            return (Criteria) this;
        }

        public Criteria andQqDNotLike(String value) {
            addCriterion("QQ_D not like", value, "qqD");
            return (Criteria) this;
        }

        public Criteria andQqDIn(List<String> values) {
            addCriterion("QQ_D in", values, "qqD");
            return (Criteria) this;
        }

        public Criteria andQqDNotIn(List<String> values) {
            addCriterion("QQ_D not in", values, "qqD");
            return (Criteria) this;
        }

        public Criteria andQqDBetween(String value1, String value2) {
            addCriterion("QQ_D between", value1, value2, "qqD");
            return (Criteria) this;
        }

        public Criteria andQqDNotBetween(String value1, String value2) {
            addCriterion("QQ_D not between", value1, value2, "qqD");
            return (Criteria) this;
        }

        public Criteria andFaxWlDIsNull() {
            addCriterion("FAX_WL_D is null");
            return (Criteria) this;
        }

        public Criteria andFaxWlDIsNotNull() {
            addCriterion("FAX_WL_D is not null");
            return (Criteria) this;
        }

        public Criteria andFaxWlDEqualTo(String value) {
            addCriterion("FAX_WL_D =", value, "faxWlD");
            return (Criteria) this;
        }

        public Criteria andFaxWlDNotEqualTo(String value) {
            addCriterion("FAX_WL_D <>", value, "faxWlD");
            return (Criteria) this;
        }

        public Criteria andFaxWlDGreaterThan(String value) {
            addCriterion("FAX_WL_D >", value, "faxWlD");
            return (Criteria) this;
        }

        public Criteria andFaxWlDGreaterThanOrEqualTo(String value) {
            addCriterion("FAX_WL_D >=", value, "faxWlD");
            return (Criteria) this;
        }

        public Criteria andFaxWlDLessThan(String value) {
            addCriterion("FAX_WL_D <", value, "faxWlD");
            return (Criteria) this;
        }

        public Criteria andFaxWlDLessThanOrEqualTo(String value) {
            addCriterion("FAX_WL_D <=", value, "faxWlD");
            return (Criteria) this;
        }

        public Criteria andFaxWlDLike(String value) {
            addCriterion("FAX_WL_D like", value, "faxWlD");
            return (Criteria) this;
        }

        public Criteria andFaxWlDNotLike(String value) {
            addCriterion("FAX_WL_D not like", value, "faxWlD");
            return (Criteria) this;
        }

        public Criteria andFaxWlDIn(List<String> values) {
            addCriterion("FAX_WL_D in", values, "faxWlD");
            return (Criteria) this;
        }

        public Criteria andFaxWlDNotIn(List<String> values) {
            addCriterion("FAX_WL_D not in", values, "faxWlD");
            return (Criteria) this;
        }

        public Criteria andFaxWlDBetween(String value1, String value2) {
            addCriterion("FAX_WL_D between", value1, value2, "faxWlD");
            return (Criteria) this;
        }

        public Criteria andFaxWlDNotBetween(String value1, String value2) {
            addCriterion("FAX_WL_D not between", value1, value2, "faxWlD");
            return (Criteria) this;
        }

        public Criteria andZipCodeWlDIsNull() {
            addCriterion("ZIP_CODE_WL_D is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeWlDIsNotNull() {
            addCriterion("ZIP_CODE_WL_D is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeWlDEqualTo(String value) {
            addCriterion("ZIP_CODE_WL_D =", value, "zipCodeWlD");
            return (Criteria) this;
        }

        public Criteria andZipCodeWlDNotEqualTo(String value) {
            addCriterion("ZIP_CODE_WL_D <>", value, "zipCodeWlD");
            return (Criteria) this;
        }

        public Criteria andZipCodeWlDGreaterThan(String value) {
            addCriterion("ZIP_CODE_WL_D >", value, "zipCodeWlD");
            return (Criteria) this;
        }

        public Criteria andZipCodeWlDGreaterThanOrEqualTo(String value) {
            addCriterion("ZIP_CODE_WL_D >=", value, "zipCodeWlD");
            return (Criteria) this;
        }

        public Criteria andZipCodeWlDLessThan(String value) {
            addCriterion("ZIP_CODE_WL_D <", value, "zipCodeWlD");
            return (Criteria) this;
        }

        public Criteria andZipCodeWlDLessThanOrEqualTo(String value) {
            addCriterion("ZIP_CODE_WL_D <=", value, "zipCodeWlD");
            return (Criteria) this;
        }

        public Criteria andZipCodeWlDLike(String value) {
            addCriterion("ZIP_CODE_WL_D like", value, "zipCodeWlD");
            return (Criteria) this;
        }

        public Criteria andZipCodeWlDNotLike(String value) {
            addCriterion("ZIP_CODE_WL_D not like", value, "zipCodeWlD");
            return (Criteria) this;
        }

        public Criteria andZipCodeWlDIn(List<String> values) {
            addCriterion("ZIP_CODE_WL_D in", values, "zipCodeWlD");
            return (Criteria) this;
        }

        public Criteria andZipCodeWlDNotIn(List<String> values) {
            addCriterion("ZIP_CODE_WL_D not in", values, "zipCodeWlD");
            return (Criteria) this;
        }

        public Criteria andZipCodeWlDBetween(String value1, String value2) {
            addCriterion("ZIP_CODE_WL_D between", value1, value2, "zipCodeWlD");
            return (Criteria) this;
        }

        public Criteria andZipCodeWlDNotBetween(String value1, String value2) {
            addCriterion("ZIP_CODE_WL_D not between", value1, value2, "zipCodeWlD");
            return (Criteria) this;
        }

        public Criteria andShopAreaDIsNull() {
            addCriterion("SHOP_AREA_D is null");
            return (Criteria) this;
        }

        public Criteria andShopAreaDIsNotNull() {
            addCriterion("SHOP_AREA_D is not null");
            return (Criteria) this;
        }

        public Criteria andShopAreaDEqualTo(Integer value) {
            addCriterion("SHOP_AREA_D =", value, "shopAreaD");
            return (Criteria) this;
        }

        public Criteria andShopAreaDNotEqualTo(Integer value) {
            addCriterion("SHOP_AREA_D <>", value, "shopAreaD");
            return (Criteria) this;
        }

        public Criteria andShopAreaDGreaterThan(Integer value) {
            addCriterion("SHOP_AREA_D >", value, "shopAreaD");
            return (Criteria) this;
        }

        public Criteria andShopAreaDGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHOP_AREA_D >=", value, "shopAreaD");
            return (Criteria) this;
        }

        public Criteria andShopAreaDLessThan(Integer value) {
            addCriterion("SHOP_AREA_D <", value, "shopAreaD");
            return (Criteria) this;
        }

        public Criteria andShopAreaDLessThanOrEqualTo(Integer value) {
            addCriterion("SHOP_AREA_D <=", value, "shopAreaD");
            return (Criteria) this;
        }

        public Criteria andShopAreaDIn(List<Integer> values) {
            addCriterion("SHOP_AREA_D in", values, "shopAreaD");
            return (Criteria) this;
        }

        public Criteria andShopAreaDNotIn(List<Integer> values) {
            addCriterion("SHOP_AREA_D not in", values, "shopAreaD");
            return (Criteria) this;
        }

        public Criteria andShopAreaDBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_AREA_D between", value1, value2, "shopAreaD");
            return (Criteria) this;
        }

        public Criteria andShopAreaDNotBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_AREA_D not between", value1, value2, "shopAreaD");
            return (Criteria) this;
        }

        public Criteria andBusinessWayIsNull() {
            addCriterion("BUSINESS_WAY is null");
            return (Criteria) this;
        }

        public Criteria andBusinessWayIsNotNull() {
            addCriterion("BUSINESS_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessWayEqualTo(String value) {
            addCriterion("BUSINESS_WAY =", value, "businessWay");
            return (Criteria) this;
        }

        public Criteria andBusinessWayNotEqualTo(String value) {
            addCriterion("BUSINESS_WAY <>", value, "businessWay");
            return (Criteria) this;
        }

        public Criteria andBusinessWayGreaterThan(String value) {
            addCriterion("BUSINESS_WAY >", value, "businessWay");
            return (Criteria) this;
        }

        public Criteria andBusinessWayGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_WAY >=", value, "businessWay");
            return (Criteria) this;
        }

        public Criteria andBusinessWayLessThan(String value) {
            addCriterion("BUSINESS_WAY <", value, "businessWay");
            return (Criteria) this;
        }

        public Criteria andBusinessWayLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_WAY <=", value, "businessWay");
            return (Criteria) this;
        }

        public Criteria andBusinessWayLike(String value) {
            addCriterion("BUSINESS_WAY like", value, "businessWay");
            return (Criteria) this;
        }

        public Criteria andBusinessWayNotLike(String value) {
            addCriterion("BUSINESS_WAY not like", value, "businessWay");
            return (Criteria) this;
        }

        public Criteria andBusinessWayIn(List<String> values) {
            addCriterion("BUSINESS_WAY in", values, "businessWay");
            return (Criteria) this;
        }

        public Criteria andBusinessWayNotIn(List<String> values) {
            addCriterion("BUSINESS_WAY not in", values, "businessWay");
            return (Criteria) this;
        }

        public Criteria andBusinessWayBetween(String value1, String value2) {
            addCriterion("BUSINESS_WAY between", value1, value2, "businessWay");
            return (Criteria) this;
        }

        public Criteria andBusinessWayNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_WAY not between", value1, value2, "businessWay");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoIsNull() {
            addCriterion("BUSINESS_LICENSE_NO is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoIsNotNull() {
            addCriterion("BUSINESS_LICENSE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_NO =", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoNotEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_NO <>", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoGreaterThan(String value) {
            addCriterion("BUSINESS_LICENSE_NO >", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_NO >=", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoLessThan(String value) {
            addCriterion("BUSINESS_LICENSE_NO <", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_NO <=", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoLike(String value) {
            addCriterion("BUSINESS_LICENSE_NO like", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoNotLike(String value) {
            addCriterion("BUSINESS_LICENSE_NO not like", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoIn(List<String> values) {
            addCriterion("BUSINESS_LICENSE_NO in", values, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoNotIn(List<String> values) {
            addCriterion("BUSINESS_LICENSE_NO not in", values, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoBetween(String value1, String value2) {
            addCriterion("BUSINESS_LICENSE_NO between", value1, value2, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_LICENSE_NO not between", value1, value2, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoIsNull() {
            addCriterion("ORGANIZATION_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoIsNotNull() {
            addCriterion("ORGANIZATION_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoEqualTo(String value) {
            addCriterion("ORGANIZATION_NO =", value, "organizationNo");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoNotEqualTo(String value) {
            addCriterion("ORGANIZATION_NO <>", value, "organizationNo");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoGreaterThan(String value) {
            addCriterion("ORGANIZATION_NO >", value, "organizationNo");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_NO >=", value, "organizationNo");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoLessThan(String value) {
            addCriterion("ORGANIZATION_NO <", value, "organizationNo");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_NO <=", value, "organizationNo");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoLike(String value) {
            addCriterion("ORGANIZATION_NO like", value, "organizationNo");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoNotLike(String value) {
            addCriterion("ORGANIZATION_NO not like", value, "organizationNo");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoIn(List<String> values) {
            addCriterion("ORGANIZATION_NO in", values, "organizationNo");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoNotIn(List<String> values) {
            addCriterion("ORGANIZATION_NO not in", values, "organizationNo");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_NO between", value1, value2, "organizationNo");
            return (Criteria) this;
        }

        public Criteria andOrganizationNoNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_NO not between", value1, value2, "organizationNo");
            return (Criteria) this;
        }

        public Criteria andGeneraltaxpayerStatusIsNull() {
            addCriterion("GENERALTAXPAYER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andGeneraltaxpayerStatusIsNotNull() {
            addCriterion("GENERALTAXPAYER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andGeneraltaxpayerStatusEqualTo(String value) {
            addCriterion("GENERALTAXPAYER_STATUS =", value, "generaltaxpayerStatus");
            return (Criteria) this;
        }

        public Criteria andGeneraltaxpayerStatusNotEqualTo(String value) {
            addCriterion("GENERALTAXPAYER_STATUS <>", value, "generaltaxpayerStatus");
            return (Criteria) this;
        }

        public Criteria andGeneraltaxpayerStatusGreaterThan(String value) {
            addCriterion("GENERALTAXPAYER_STATUS >", value, "generaltaxpayerStatus");
            return (Criteria) this;
        }

        public Criteria andGeneraltaxpayerStatusGreaterThanOrEqualTo(String value) {
            addCriterion("GENERALTAXPAYER_STATUS >=", value, "generaltaxpayerStatus");
            return (Criteria) this;
        }

        public Criteria andGeneraltaxpayerStatusLessThan(String value) {
            addCriterion("GENERALTAXPAYER_STATUS <", value, "generaltaxpayerStatus");
            return (Criteria) this;
        }

        public Criteria andGeneraltaxpayerStatusLessThanOrEqualTo(String value) {
            addCriterion("GENERALTAXPAYER_STATUS <=", value, "generaltaxpayerStatus");
            return (Criteria) this;
        }

        public Criteria andGeneraltaxpayerStatusLike(String value) {
            addCriterion("GENERALTAXPAYER_STATUS like", value, "generaltaxpayerStatus");
            return (Criteria) this;
        }

        public Criteria andGeneraltaxpayerStatusNotLike(String value) {
            addCriterion("GENERALTAXPAYER_STATUS not like", value, "generaltaxpayerStatus");
            return (Criteria) this;
        }

        public Criteria andGeneraltaxpayerStatusIn(List<String> values) {
            addCriterion("GENERALTAXPAYER_STATUS in", values, "generaltaxpayerStatus");
            return (Criteria) this;
        }

        public Criteria andGeneraltaxpayerStatusNotIn(List<String> values) {
            addCriterion("GENERALTAXPAYER_STATUS not in", values, "generaltaxpayerStatus");
            return (Criteria) this;
        }

        public Criteria andGeneraltaxpayerStatusBetween(String value1, String value2) {
            addCriterion("GENERALTAXPAYER_STATUS between", value1, value2, "generaltaxpayerStatus");
            return (Criteria) this;
        }

        public Criteria andGeneraltaxpayerStatusNotBetween(String value1, String value2) {
            addCriterion("GENERALTAXPAYER_STATUS not between", value1, value2, "generaltaxpayerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerNameOldIsNull() {
            addCriterion("CUSTOMER_NAME_OLD is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameOldIsNotNull() {
            addCriterion("CUSTOMER_NAME_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameOldEqualTo(String value) {
            addCriterion("CUSTOMER_NAME_OLD =", value, "customerNameOld");
            return (Criteria) this;
        }

        public Criteria andCustomerNameOldNotEqualTo(String value) {
            addCriterion("CUSTOMER_NAME_OLD <>", value, "customerNameOld");
            return (Criteria) this;
        }

        public Criteria andCustomerNameOldGreaterThan(String value) {
            addCriterion("CUSTOMER_NAME_OLD >", value, "customerNameOld");
            return (Criteria) this;
        }

        public Criteria andCustomerNameOldGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME_OLD >=", value, "customerNameOld");
            return (Criteria) this;
        }

        public Criteria andCustomerNameOldLessThan(String value) {
            addCriterion("CUSTOMER_NAME_OLD <", value, "customerNameOld");
            return (Criteria) this;
        }

        public Criteria andCustomerNameOldLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME_OLD <=", value, "customerNameOld");
            return (Criteria) this;
        }

        public Criteria andCustomerNameOldLike(String value) {
            addCriterion("CUSTOMER_NAME_OLD like", value, "customerNameOld");
            return (Criteria) this;
        }

        public Criteria andCustomerNameOldNotLike(String value) {
            addCriterion("CUSTOMER_NAME_OLD not like", value, "customerNameOld");
            return (Criteria) this;
        }

        public Criteria andCustomerNameOldIn(List<String> values) {
            addCriterion("CUSTOMER_NAME_OLD in", values, "customerNameOld");
            return (Criteria) this;
        }

        public Criteria andCustomerNameOldNotIn(List<String> values) {
            addCriterion("CUSTOMER_NAME_OLD not in", values, "customerNameOld");
            return (Criteria) this;
        }

        public Criteria andCustomerNameOldBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME_OLD between", value1, value2, "customerNameOld");
            return (Criteria) this;
        }

        public Criteria andCustomerNameOldNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME_OLD not between", value1, value2, "customerNameOld");
            return (Criteria) this;
        }

        public Criteria andExamineFlagIsNull() {
            addCriterion("EXAMINE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andExamineFlagIsNotNull() {
            addCriterion("EXAMINE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andExamineFlagEqualTo(String value) {
            addCriterion("EXAMINE_FLAG =", value, "examineFlag");
            return (Criteria) this;
        }

        public Criteria andExamineFlagNotEqualTo(String value) {
            addCriterion("EXAMINE_FLAG <>", value, "examineFlag");
            return (Criteria) this;
        }

        public Criteria andExamineFlagGreaterThan(String value) {
            addCriterion("EXAMINE_FLAG >", value, "examineFlag");
            return (Criteria) this;
        }

        public Criteria andExamineFlagGreaterThanOrEqualTo(String value) {
            addCriterion("EXAMINE_FLAG >=", value, "examineFlag");
            return (Criteria) this;
        }

        public Criteria andExamineFlagLessThan(String value) {
            addCriterion("EXAMINE_FLAG <", value, "examineFlag");
            return (Criteria) this;
        }

        public Criteria andExamineFlagLessThanOrEqualTo(String value) {
            addCriterion("EXAMINE_FLAG <=", value, "examineFlag");
            return (Criteria) this;
        }

        public Criteria andExamineFlagLike(String value) {
            addCriterion("EXAMINE_FLAG like", value, "examineFlag");
            return (Criteria) this;
        }

        public Criteria andExamineFlagNotLike(String value) {
            addCriterion("EXAMINE_FLAG not like", value, "examineFlag");
            return (Criteria) this;
        }

        public Criteria andExamineFlagIn(List<String> values) {
            addCriterion("EXAMINE_FLAG in", values, "examineFlag");
            return (Criteria) this;
        }

        public Criteria andExamineFlagNotIn(List<String> values) {
            addCriterion("EXAMINE_FLAG not in", values, "examineFlag");
            return (Criteria) this;
        }

        public Criteria andExamineFlagBetween(String value1, String value2) {
            addCriterion("EXAMINE_FLAG between", value1, value2, "examineFlag");
            return (Criteria) this;
        }

        public Criteria andExamineFlagNotBetween(String value1, String value2) {
            addCriterion("EXAMINE_FLAG not between", value1, value2, "examineFlag");
            return (Criteria) this;
        }

        public Criteria andDgzhIsNull() {
            addCriterion("DGZH is null");
            return (Criteria) this;
        }

        public Criteria andDgzhIsNotNull() {
            addCriterion("DGZH is not null");
            return (Criteria) this;
        }

        public Criteria andDgzhEqualTo(String value) {
            addCriterion("DGZH =", value, "dgzh");
            return (Criteria) this;
        }

        public Criteria andDgzhNotEqualTo(String value) {
            addCriterion("DGZH <>", value, "dgzh");
            return (Criteria) this;
        }

        public Criteria andDgzhGreaterThan(String value) {
            addCriterion("DGZH >", value, "dgzh");
            return (Criteria) this;
        }

        public Criteria andDgzhGreaterThanOrEqualTo(String value) {
            addCriterion("DGZH >=", value, "dgzh");
            return (Criteria) this;
        }

        public Criteria andDgzhLessThan(String value) {
            addCriterion("DGZH <", value, "dgzh");
            return (Criteria) this;
        }

        public Criteria andDgzhLessThanOrEqualTo(String value) {
            addCriterion("DGZH <=", value, "dgzh");
            return (Criteria) this;
        }

        public Criteria andDgzhLike(String value) {
            addCriterion("DGZH like", value, "dgzh");
            return (Criteria) this;
        }

        public Criteria andDgzhNotLike(String value) {
            addCriterion("DGZH not like", value, "dgzh");
            return (Criteria) this;
        }

        public Criteria andDgzhIn(List<String> values) {
            addCriterion("DGZH in", values, "dgzh");
            return (Criteria) this;
        }

        public Criteria andDgzhNotIn(List<String> values) {
            addCriterion("DGZH not in", values, "dgzh");
            return (Criteria) this;
        }

        public Criteria andDgzhBetween(String value1, String value2) {
            addCriterion("DGZH between", value1, value2, "dgzh");
            return (Criteria) this;
        }

        public Criteria andDgzhNotBetween(String value1, String value2) {
            addCriterion("DGZH not between", value1, value2, "dgzh");
            return (Criteria) this;
        }

        public Criteria andCustomerCode4IsNull() {
            addCriterion("CUSTOMER_CODE_4 is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCode4IsNotNull() {
            addCriterion("CUSTOMER_CODE_4 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCode4EqualTo(String value) {
            addCriterion("CUSTOMER_CODE_4 =", value, "customerCode4");
            return (Criteria) this;
        }

        public Criteria andCustomerCode4NotEqualTo(String value) {
            addCriterion("CUSTOMER_CODE_4 <>", value, "customerCode4");
            return (Criteria) this;
        }

        public Criteria andCustomerCode4GreaterThan(String value) {
            addCriterion("CUSTOMER_CODE_4 >", value, "customerCode4");
            return (Criteria) this;
        }

        public Criteria andCustomerCode4GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_CODE_4 >=", value, "customerCode4");
            return (Criteria) this;
        }

        public Criteria andCustomerCode4LessThan(String value) {
            addCriterion("CUSTOMER_CODE_4 <", value, "customerCode4");
            return (Criteria) this;
        }

        public Criteria andCustomerCode4LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_CODE_4 <=", value, "customerCode4");
            return (Criteria) this;
        }

        public Criteria andCustomerCode4Like(String value) {
            addCriterion("CUSTOMER_CODE_4 like", value, "customerCode4");
            return (Criteria) this;
        }

        public Criteria andCustomerCode4NotLike(String value) {
            addCriterion("CUSTOMER_CODE_4 not like", value, "customerCode4");
            return (Criteria) this;
        }

        public Criteria andCustomerCode4In(List<String> values) {
            addCriterion("CUSTOMER_CODE_4 in", values, "customerCode4");
            return (Criteria) this;
        }

        public Criteria andCustomerCode4NotIn(List<String> values) {
            addCriterion("CUSTOMER_CODE_4 not in", values, "customerCode4");
            return (Criteria) this;
        }

        public Criteria andCustomerCode4Between(String value1, String value2) {
            addCriterion("CUSTOMER_CODE_4 between", value1, value2, "customerCode4");
            return (Criteria) this;
        }

        public Criteria andCustomerCode4NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_CODE_4 not between", value1, value2, "customerCode4");
            return (Criteria) this;
        }

        public Criteria andIdcardNoIsNull() {
            addCriterion("IDCARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andIdcardNoIsNotNull() {
            addCriterion("IDCARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardNoEqualTo(String value) {
            addCriterion("IDCARD_NO =", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotEqualTo(String value) {
            addCriterion("IDCARD_NO <>", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoGreaterThan(String value) {
            addCriterion("IDCARD_NO >", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARD_NO >=", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoLessThan(String value) {
            addCriterion("IDCARD_NO <", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoLessThanOrEqualTo(String value) {
            addCriterion("IDCARD_NO <=", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoLike(String value) {
            addCriterion("IDCARD_NO like", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotLike(String value) {
            addCriterion("IDCARD_NO not like", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoIn(List<String> values) {
            addCriterion("IDCARD_NO in", values, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotIn(List<String> values) {
            addCriterion("IDCARD_NO not in", values, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoBetween(String value1, String value2) {
            addCriterion("IDCARD_NO between", value1, value2, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotBetween(String value1, String value2) {
            addCriterion("IDCARD_NO not between", value1, value2, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andFlagSalItemIsNull() {
            addCriterion("FLAG_SAL_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andFlagSalItemIsNotNull() {
            addCriterion("FLAG_SAL_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andFlagSalItemEqualTo(String value) {
            addCriterion("FLAG_SAL_ITEM =", value, "flagSalItem");
            return (Criteria) this;
        }

        public Criteria andFlagSalItemNotEqualTo(String value) {
            addCriterion("FLAG_SAL_ITEM <>", value, "flagSalItem");
            return (Criteria) this;
        }

        public Criteria andFlagSalItemGreaterThan(String value) {
            addCriterion("FLAG_SAL_ITEM >", value, "flagSalItem");
            return (Criteria) this;
        }

        public Criteria andFlagSalItemGreaterThanOrEqualTo(String value) {
            addCriterion("FLAG_SAL_ITEM >=", value, "flagSalItem");
            return (Criteria) this;
        }

        public Criteria andFlagSalItemLessThan(String value) {
            addCriterion("FLAG_SAL_ITEM <", value, "flagSalItem");
            return (Criteria) this;
        }

        public Criteria andFlagSalItemLessThanOrEqualTo(String value) {
            addCriterion("FLAG_SAL_ITEM <=", value, "flagSalItem");
            return (Criteria) this;
        }

        public Criteria andFlagSalItemLike(String value) {
            addCriterion("FLAG_SAL_ITEM like", value, "flagSalItem");
            return (Criteria) this;
        }

        public Criteria andFlagSalItemNotLike(String value) {
            addCriterion("FLAG_SAL_ITEM not like", value, "flagSalItem");
            return (Criteria) this;
        }

        public Criteria andFlagSalItemIn(List<String> values) {
            addCriterion("FLAG_SAL_ITEM in", values, "flagSalItem");
            return (Criteria) this;
        }

        public Criteria andFlagSalItemNotIn(List<String> values) {
            addCriterion("FLAG_SAL_ITEM not in", values, "flagSalItem");
            return (Criteria) this;
        }

        public Criteria andFlagSalItemBetween(String value1, String value2) {
            addCriterion("FLAG_SAL_ITEM between", value1, value2, "flagSalItem");
            return (Criteria) this;
        }

        public Criteria andFlagSalItemNotBetween(String value1, String value2) {
            addCriterion("FLAG_SAL_ITEM not between", value1, value2, "flagSalItem");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateEndIsNull() {
            addCriterion("BUSINESSLICENSE_DATE_END is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateEndIsNotNull() {
            addCriterion("BUSINESSLICENSE_DATE_END is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateEndEqualTo(String value) {
            addCriterion("BUSINESSLICENSE_DATE_END =", value, "businesslicenseDateEnd");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateEndNotEqualTo(String value) {
            addCriterion("BUSINESSLICENSE_DATE_END <>", value, "businesslicenseDateEnd");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateEndGreaterThan(String value) {
            addCriterion("BUSINESSLICENSE_DATE_END >", value, "businesslicenseDateEnd");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateEndGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSLICENSE_DATE_END >=", value, "businesslicenseDateEnd");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateEndLessThan(String value) {
            addCriterion("BUSINESSLICENSE_DATE_END <", value, "businesslicenseDateEnd");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateEndLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSLICENSE_DATE_END <=", value, "businesslicenseDateEnd");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateEndLike(String value) {
            addCriterion("BUSINESSLICENSE_DATE_END like", value, "businesslicenseDateEnd");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateEndNotLike(String value) {
            addCriterion("BUSINESSLICENSE_DATE_END not like", value, "businesslicenseDateEnd");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateEndIn(List<String> values) {
            addCriterion("BUSINESSLICENSE_DATE_END in", values, "businesslicenseDateEnd");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateEndNotIn(List<String> values) {
            addCriterion("BUSINESSLICENSE_DATE_END not in", values, "businesslicenseDateEnd");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateEndBetween(String value1, String value2) {
            addCriterion("BUSINESSLICENSE_DATE_END between", value1, value2, "businesslicenseDateEnd");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateEndNotBetween(String value1, String value2) {
            addCriterion("BUSINESSLICENSE_DATE_END not between", value1, value2, "businesslicenseDateEnd");
            return (Criteria) this;
        }

        public Criteria andCustomerPpFlagIsNull() {
            addCriterion("CUSTOMER_PP_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPpFlagIsNotNull() {
            addCriterion("CUSTOMER_PP_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPpFlagEqualTo(String value) {
            addCriterion("CUSTOMER_PP_FLAG =", value, "customerPpFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerPpFlagNotEqualTo(String value) {
            addCriterion("CUSTOMER_PP_FLAG <>", value, "customerPpFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerPpFlagGreaterThan(String value) {
            addCriterion("CUSTOMER_PP_FLAG >", value, "customerPpFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerPpFlagGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_PP_FLAG >=", value, "customerPpFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerPpFlagLessThan(String value) {
            addCriterion("CUSTOMER_PP_FLAG <", value, "customerPpFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerPpFlagLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_PP_FLAG <=", value, "customerPpFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerPpFlagLike(String value) {
            addCriterion("CUSTOMER_PP_FLAG like", value, "customerPpFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerPpFlagNotLike(String value) {
            addCriterion("CUSTOMER_PP_FLAG not like", value, "customerPpFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerPpFlagIn(List<String> values) {
            addCriterion("CUSTOMER_PP_FLAG in", values, "customerPpFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerPpFlagNotIn(List<String> values) {
            addCriterion("CUSTOMER_PP_FLAG not in", values, "customerPpFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerPpFlagBetween(String value1, String value2) {
            addCriterion("CUSTOMER_PP_FLAG between", value1, value2, "customerPpFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerPpFlagNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_PP_FLAG not between", value1, value2, "customerPpFlag");
            return (Criteria) this;
        }

        public Criteria andTaxAddressIsNull() {
            addCriterion("TAX_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andTaxAddressIsNotNull() {
            addCriterion("TAX_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andTaxAddressEqualTo(String value) {
            addCriterion("TAX_ADDRESS =", value, "taxAddress");
            return (Criteria) this;
        }

        public Criteria andTaxAddressNotEqualTo(String value) {
            addCriterion("TAX_ADDRESS <>", value, "taxAddress");
            return (Criteria) this;
        }

        public Criteria andTaxAddressGreaterThan(String value) {
            addCriterion("TAX_ADDRESS >", value, "taxAddress");
            return (Criteria) this;
        }

        public Criteria andTaxAddressGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_ADDRESS >=", value, "taxAddress");
            return (Criteria) this;
        }

        public Criteria andTaxAddressLessThan(String value) {
            addCriterion("TAX_ADDRESS <", value, "taxAddress");
            return (Criteria) this;
        }

        public Criteria andTaxAddressLessThanOrEqualTo(String value) {
            addCriterion("TAX_ADDRESS <=", value, "taxAddress");
            return (Criteria) this;
        }

        public Criteria andTaxAddressLike(String value) {
            addCriterion("TAX_ADDRESS like", value, "taxAddress");
            return (Criteria) this;
        }

        public Criteria andTaxAddressNotLike(String value) {
            addCriterion("TAX_ADDRESS not like", value, "taxAddress");
            return (Criteria) this;
        }

        public Criteria andTaxAddressIn(List<String> values) {
            addCriterion("TAX_ADDRESS in", values, "taxAddress");
            return (Criteria) this;
        }

        public Criteria andTaxAddressNotIn(List<String> values) {
            addCriterion("TAX_ADDRESS not in", values, "taxAddress");
            return (Criteria) this;
        }

        public Criteria andTaxAddressBetween(String value1, String value2) {
            addCriterion("TAX_ADDRESS between", value1, value2, "taxAddress");
            return (Criteria) this;
        }

        public Criteria andTaxAddressNotBetween(String value1, String value2) {
            addCriterion("TAX_ADDRESS not between", value1, value2, "taxAddress");
            return (Criteria) this;
        }

        public Criteria andTaxTelIsNull() {
            addCriterion("TAX_TEL is null");
            return (Criteria) this;
        }

        public Criteria andTaxTelIsNotNull() {
            addCriterion("TAX_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTaxTelEqualTo(String value) {
            addCriterion("TAX_TEL =", value, "taxTel");
            return (Criteria) this;
        }

        public Criteria andTaxTelNotEqualTo(String value) {
            addCriterion("TAX_TEL <>", value, "taxTel");
            return (Criteria) this;
        }

        public Criteria andTaxTelGreaterThan(String value) {
            addCriterion("TAX_TEL >", value, "taxTel");
            return (Criteria) this;
        }

        public Criteria andTaxTelGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_TEL >=", value, "taxTel");
            return (Criteria) this;
        }

        public Criteria andTaxTelLessThan(String value) {
            addCriterion("TAX_TEL <", value, "taxTel");
            return (Criteria) this;
        }

        public Criteria andTaxTelLessThanOrEqualTo(String value) {
            addCriterion("TAX_TEL <=", value, "taxTel");
            return (Criteria) this;
        }

        public Criteria andTaxTelLike(String value) {
            addCriterion("TAX_TEL like", value, "taxTel");
            return (Criteria) this;
        }

        public Criteria andTaxTelNotLike(String value) {
            addCriterion("TAX_TEL not like", value, "taxTel");
            return (Criteria) this;
        }

        public Criteria andTaxTelIn(List<String> values) {
            addCriterion("TAX_TEL in", values, "taxTel");
            return (Criteria) this;
        }

        public Criteria andTaxTelNotIn(List<String> values) {
            addCriterion("TAX_TEL not in", values, "taxTel");
            return (Criteria) this;
        }

        public Criteria andTaxTelBetween(String value1, String value2) {
            addCriterion("TAX_TEL between", value1, value2, "taxTel");
            return (Criteria) this;
        }

        public Criteria andTaxTelNotBetween(String value1, String value2) {
            addCriterion("TAX_TEL not between", value1, value2, "taxTel");
            return (Criteria) this;
        }

        public Criteria andTaxBankIsNull() {
            addCriterion("TAX_BANK is null");
            return (Criteria) this;
        }

        public Criteria andTaxBankIsNotNull() {
            addCriterion("TAX_BANK is not null");
            return (Criteria) this;
        }

        public Criteria andTaxBankEqualTo(String value) {
            addCriterion("TAX_BANK =", value, "taxBank");
            return (Criteria) this;
        }

        public Criteria andTaxBankNotEqualTo(String value) {
            addCriterion("TAX_BANK <>", value, "taxBank");
            return (Criteria) this;
        }

        public Criteria andTaxBankGreaterThan(String value) {
            addCriterion("TAX_BANK >", value, "taxBank");
            return (Criteria) this;
        }

        public Criteria andTaxBankGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_BANK >=", value, "taxBank");
            return (Criteria) this;
        }

        public Criteria andTaxBankLessThan(String value) {
            addCriterion("TAX_BANK <", value, "taxBank");
            return (Criteria) this;
        }

        public Criteria andTaxBankLessThanOrEqualTo(String value) {
            addCriterion("TAX_BANK <=", value, "taxBank");
            return (Criteria) this;
        }

        public Criteria andTaxBankLike(String value) {
            addCriterion("TAX_BANK like", value, "taxBank");
            return (Criteria) this;
        }

        public Criteria andTaxBankNotLike(String value) {
            addCriterion("TAX_BANK not like", value, "taxBank");
            return (Criteria) this;
        }

        public Criteria andTaxBankIn(List<String> values) {
            addCriterion("TAX_BANK in", values, "taxBank");
            return (Criteria) this;
        }

        public Criteria andTaxBankNotIn(List<String> values) {
            addCriterion("TAX_BANK not in", values, "taxBank");
            return (Criteria) this;
        }

        public Criteria andTaxBankBetween(String value1, String value2) {
            addCriterion("TAX_BANK between", value1, value2, "taxBank");
            return (Criteria) this;
        }

        public Criteria andTaxBankNotBetween(String value1, String value2) {
            addCriterion("TAX_BANK not between", value1, value2, "taxBank");
            return (Criteria) this;
        }

        public Criteria andTaxBankNoIsNull() {
            addCriterion("TAX_BANK_NO is null");
            return (Criteria) this;
        }

        public Criteria andTaxBankNoIsNotNull() {
            addCriterion("TAX_BANK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxBankNoEqualTo(String value) {
            addCriterion("TAX_BANK_NO =", value, "taxBankNo");
            return (Criteria) this;
        }

        public Criteria andTaxBankNoNotEqualTo(String value) {
            addCriterion("TAX_BANK_NO <>", value, "taxBankNo");
            return (Criteria) this;
        }

        public Criteria andTaxBankNoGreaterThan(String value) {
            addCriterion("TAX_BANK_NO >", value, "taxBankNo");
            return (Criteria) this;
        }

        public Criteria andTaxBankNoGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_BANK_NO >=", value, "taxBankNo");
            return (Criteria) this;
        }

        public Criteria andTaxBankNoLessThan(String value) {
            addCriterion("TAX_BANK_NO <", value, "taxBankNo");
            return (Criteria) this;
        }

        public Criteria andTaxBankNoLessThanOrEqualTo(String value) {
            addCriterion("TAX_BANK_NO <=", value, "taxBankNo");
            return (Criteria) this;
        }

        public Criteria andTaxBankNoLike(String value) {
            addCriterion("TAX_BANK_NO like", value, "taxBankNo");
            return (Criteria) this;
        }

        public Criteria andTaxBankNoNotLike(String value) {
            addCriterion("TAX_BANK_NO not like", value, "taxBankNo");
            return (Criteria) this;
        }

        public Criteria andTaxBankNoIn(List<String> values) {
            addCriterion("TAX_BANK_NO in", values, "taxBankNo");
            return (Criteria) this;
        }

        public Criteria andTaxBankNoNotIn(List<String> values) {
            addCriterion("TAX_BANK_NO not in", values, "taxBankNo");
            return (Criteria) this;
        }

        public Criteria andTaxBankNoBetween(String value1, String value2) {
            addCriterion("TAX_BANK_NO between", value1, value2, "taxBankNo");
            return (Criteria) this;
        }

        public Criteria andTaxBankNoNotBetween(String value1, String value2) {
            addCriterion("TAX_BANK_NO not between", value1, value2, "taxBankNo");
            return (Criteria) this;
        }

        public Criteria andCustomerAgent1IsNull() {
            addCriterion("CUSTOMER_AGENT_1 is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAgent1IsNotNull() {
            addCriterion("CUSTOMER_AGENT_1 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAgent1EqualTo(String value) {
            addCriterion("CUSTOMER_AGENT_1 =", value, "customerAgent1");
            return (Criteria) this;
        }

        public Criteria andCustomerAgent1NotEqualTo(String value) {
            addCriterion("CUSTOMER_AGENT_1 <>", value, "customerAgent1");
            return (Criteria) this;
        }

        public Criteria andCustomerAgent1GreaterThan(String value) {
            addCriterion("CUSTOMER_AGENT_1 >", value, "customerAgent1");
            return (Criteria) this;
        }

        public Criteria andCustomerAgent1GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_AGENT_1 >=", value, "customerAgent1");
            return (Criteria) this;
        }

        public Criteria andCustomerAgent1LessThan(String value) {
            addCriterion("CUSTOMER_AGENT_1 <", value, "customerAgent1");
            return (Criteria) this;
        }

        public Criteria andCustomerAgent1LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_AGENT_1 <=", value, "customerAgent1");
            return (Criteria) this;
        }

        public Criteria andCustomerAgent1Like(String value) {
            addCriterion("CUSTOMER_AGENT_1 like", value, "customerAgent1");
            return (Criteria) this;
        }

        public Criteria andCustomerAgent1NotLike(String value) {
            addCriterion("CUSTOMER_AGENT_1 not like", value, "customerAgent1");
            return (Criteria) this;
        }

        public Criteria andCustomerAgent1In(List<String> values) {
            addCriterion("CUSTOMER_AGENT_1 in", values, "customerAgent1");
            return (Criteria) this;
        }

        public Criteria andCustomerAgent1NotIn(List<String> values) {
            addCriterion("CUSTOMER_AGENT_1 not in", values, "customerAgent1");
            return (Criteria) this;
        }

        public Criteria andCustomerAgent1Between(String value1, String value2) {
            addCriterion("CUSTOMER_AGENT_1 between", value1, value2, "customerAgent1");
            return (Criteria) this;
        }

        public Criteria andCustomerAgent1NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_AGENT_1 not between", value1, value2, "customerAgent1");
            return (Criteria) this;
        }

        public Criteria andImportantLevelIsNull() {
            addCriterion("IMPORTANT_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andImportantLevelIsNotNull() {
            addCriterion("IMPORTANT_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andImportantLevelEqualTo(String value) {
            addCriterion("IMPORTANT_LEVEL =", value, "importantLevel");
            return (Criteria) this;
        }

        public Criteria andImportantLevelNotEqualTo(String value) {
            addCriterion("IMPORTANT_LEVEL <>", value, "importantLevel");
            return (Criteria) this;
        }

        public Criteria andImportantLevelGreaterThan(String value) {
            addCriterion("IMPORTANT_LEVEL >", value, "importantLevel");
            return (Criteria) this;
        }

        public Criteria andImportantLevelGreaterThanOrEqualTo(String value) {
            addCriterion("IMPORTANT_LEVEL >=", value, "importantLevel");
            return (Criteria) this;
        }

        public Criteria andImportantLevelLessThan(String value) {
            addCriterion("IMPORTANT_LEVEL <", value, "importantLevel");
            return (Criteria) this;
        }

        public Criteria andImportantLevelLessThanOrEqualTo(String value) {
            addCriterion("IMPORTANT_LEVEL <=", value, "importantLevel");
            return (Criteria) this;
        }

        public Criteria andImportantLevelLike(String value) {
            addCriterion("IMPORTANT_LEVEL like", value, "importantLevel");
            return (Criteria) this;
        }

        public Criteria andImportantLevelNotLike(String value) {
            addCriterion("IMPORTANT_LEVEL not like", value, "importantLevel");
            return (Criteria) this;
        }

        public Criteria andImportantLevelIn(List<String> values) {
            addCriterion("IMPORTANT_LEVEL in", values, "importantLevel");
            return (Criteria) this;
        }

        public Criteria andImportantLevelNotIn(List<String> values) {
            addCriterion("IMPORTANT_LEVEL not in", values, "importantLevel");
            return (Criteria) this;
        }

        public Criteria andImportantLevelBetween(String value1, String value2) {
            addCriterion("IMPORTANT_LEVEL between", value1, value2, "importantLevel");
            return (Criteria) this;
        }

        public Criteria andImportantLevelNotBetween(String value1, String value2) {
            addCriterion("IMPORTANT_LEVEL not between", value1, value2, "importantLevel");
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