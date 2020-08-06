package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InputCacheExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InputCacheExample() {
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

        public Criteria andInputcacheidIsNull() {
            addCriterion("InputCacheId is null");
            return (Criteria) this;
        }

        public Criteria andInputcacheidIsNotNull() {
            addCriterion("InputCacheId is not null");
            return (Criteria) this;
        }

        public Criteria andInputcacheidEqualTo(Integer value) {
            addCriterion("InputCacheId =", value, "inputcacheid");
            return (Criteria) this;
        }

        public Criteria andInputcacheidNotEqualTo(Integer value) {
            addCriterion("InputCacheId <>", value, "inputcacheid");
            return (Criteria) this;
        }

        public Criteria andInputcacheidGreaterThan(Integer value) {
            addCriterion("InputCacheId >", value, "inputcacheid");
            return (Criteria) this;
        }

        public Criteria andInputcacheidGreaterThanOrEqualTo(Integer value) {
            addCriterion("InputCacheId >=", value, "inputcacheid");
            return (Criteria) this;
        }

        public Criteria andInputcacheidLessThan(Integer value) {
            addCriterion("InputCacheId <", value, "inputcacheid");
            return (Criteria) this;
        }

        public Criteria andInputcacheidLessThanOrEqualTo(Integer value) {
            addCriterion("InputCacheId <=", value, "inputcacheid");
            return (Criteria) this;
        }

        public Criteria andInputcacheidIn(List<Integer> values) {
            addCriterion("InputCacheId in", values, "inputcacheid");
            return (Criteria) this;
        }

        public Criteria andInputcacheidNotIn(List<Integer> values) {
            addCriterion("InputCacheId not in", values, "inputcacheid");
            return (Criteria) this;
        }

        public Criteria andInputcacheidBetween(Integer value1, Integer value2) {
            addCriterion("InputCacheId between", value1, value2, "inputcacheid");
            return (Criteria) this;
        }

        public Criteria andInputcacheidNotBetween(Integer value1, Integer value2) {
            addCriterion("InputCacheId not between", value1, value2, "inputcacheid");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNull() {
            addCriterion("BatchId is null");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNotNull() {
            addCriterion("BatchId is not null");
            return (Criteria) this;
        }

        public Criteria andBatchidEqualTo(String value) {
            addCriterion("BatchId =", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotEqualTo(String value) {
            addCriterion("BatchId <>", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThan(String value) {
            addCriterion("BatchId >", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThanOrEqualTo(String value) {
            addCriterion("BatchId >=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThan(String value) {
            addCriterion("BatchId <", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThanOrEqualTo(String value) {
            addCriterion("BatchId <=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLike(String value) {
            addCriterion("BatchId like", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotLike(String value) {
            addCriterion("BatchId not like", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidIn(List<String> values) {
            addCriterion("BatchId in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotIn(List<String> values) {
            addCriterion("BatchId not in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidBetween(String value1, String value2) {
            addCriterion("BatchId between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotBetween(String value1, String value2) {
            addCriterion("BatchId not between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andInputnameIsNull() {
            addCriterion("InputName is null");
            return (Criteria) this;
        }

        public Criteria andInputnameIsNotNull() {
            addCriterion("InputName is not null");
            return (Criteria) this;
        }

        public Criteria andInputnameEqualTo(String value) {
            addCriterion("InputName =", value, "inputname");
            return (Criteria) this;
        }

        public Criteria andInputnameNotEqualTo(String value) {
            addCriterion("InputName <>", value, "inputname");
            return (Criteria) this;
        }

        public Criteria andInputnameGreaterThan(String value) {
            addCriterion("InputName >", value, "inputname");
            return (Criteria) this;
        }

        public Criteria andInputnameGreaterThanOrEqualTo(String value) {
            addCriterion("InputName >=", value, "inputname");
            return (Criteria) this;
        }

        public Criteria andInputnameLessThan(String value) {
            addCriterion("InputName <", value, "inputname");
            return (Criteria) this;
        }

        public Criteria andInputnameLessThanOrEqualTo(String value) {
            addCriterion("InputName <=", value, "inputname");
            return (Criteria) this;
        }

        public Criteria andInputnameLike(String value) {
            addCriterion("InputName like", value, "inputname");
            return (Criteria) this;
        }

        public Criteria andInputnameNotLike(String value) {
            addCriterion("InputName not like", value, "inputname");
            return (Criteria) this;
        }

        public Criteria andInputnameIn(List<String> values) {
            addCriterion("InputName in", values, "inputname");
            return (Criteria) this;
        }

        public Criteria andInputnameNotIn(List<String> values) {
            addCriterion("InputName not in", values, "inputname");
            return (Criteria) this;
        }

        public Criteria andInputnameBetween(String value1, String value2) {
            addCriterion("InputName between", value1, value2, "inputname");
            return (Criteria) this;
        }

        public Criteria andInputnameNotBetween(String value1, String value2) {
            addCriterion("InputName not between", value1, value2, "inputname");
            return (Criteria) this;
        }

        public Criteria andInputvalueIsNull() {
            addCriterion("InputValue is null");
            return (Criteria) this;
        }

        public Criteria andInputvalueIsNotNull() {
            addCriterion("InputValue is not null");
            return (Criteria) this;
        }

        public Criteria andInputvalueEqualTo(String value) {
            addCriterion("InputValue =", value, "inputvalue");
            return (Criteria) this;
        }

        public Criteria andInputvalueNotEqualTo(String value) {
            addCriterion("InputValue <>", value, "inputvalue");
            return (Criteria) this;
        }

        public Criteria andInputvalueGreaterThan(String value) {
            addCriterion("InputValue >", value, "inputvalue");
            return (Criteria) this;
        }

        public Criteria andInputvalueGreaterThanOrEqualTo(String value) {
            addCriterion("InputValue >=", value, "inputvalue");
            return (Criteria) this;
        }

        public Criteria andInputvalueLessThan(String value) {
            addCriterion("InputValue <", value, "inputvalue");
            return (Criteria) this;
        }

        public Criteria andInputvalueLessThanOrEqualTo(String value) {
            addCriterion("InputValue <=", value, "inputvalue");
            return (Criteria) this;
        }

        public Criteria andInputvalueLike(String value) {
            addCriterion("InputValue like", value, "inputvalue");
            return (Criteria) this;
        }

        public Criteria andInputvalueNotLike(String value) {
            addCriterion("InputValue not like", value, "inputvalue");
            return (Criteria) this;
        }

        public Criteria andInputvalueIn(List<String> values) {
            addCriterion("InputValue in", values, "inputvalue");
            return (Criteria) this;
        }

        public Criteria andInputvalueNotIn(List<String> values) {
            addCriterion("InputValue not in", values, "inputvalue");
            return (Criteria) this;
        }

        public Criteria andInputvalueBetween(String value1, String value2) {
            addCriterion("InputValue between", value1, value2, "inputvalue");
            return (Criteria) this;
        }

        public Criteria andInputvalueNotBetween(String value1, String value2) {
            addCriterion("InputValue not between", value1, value2, "inputvalue");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andChangelasttimeIsNull() {
            addCriterion("ChangeLastTime is null");
            return (Criteria) this;
        }

        public Criteria andChangelasttimeIsNotNull() {
            addCriterion("ChangeLastTime is not null");
            return (Criteria) this;
        }

        public Criteria andChangelasttimeEqualTo(Date value) {
            addCriterion("ChangeLastTime =", value, "changelasttime");
            return (Criteria) this;
        }

        public Criteria andChangelasttimeNotEqualTo(Date value) {
            addCriterion("ChangeLastTime <>", value, "changelasttime");
            return (Criteria) this;
        }

        public Criteria andChangelasttimeGreaterThan(Date value) {
            addCriterion("ChangeLastTime >", value, "changelasttime");
            return (Criteria) this;
        }

        public Criteria andChangelasttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ChangeLastTime >=", value, "changelasttime");
            return (Criteria) this;
        }

        public Criteria andChangelasttimeLessThan(Date value) {
            addCriterion("ChangeLastTime <", value, "changelasttime");
            return (Criteria) this;
        }

        public Criteria andChangelasttimeLessThanOrEqualTo(Date value) {
            addCriterion("ChangeLastTime <=", value, "changelasttime");
            return (Criteria) this;
        }

        public Criteria andChangelasttimeIn(List<Date> values) {
            addCriterion("ChangeLastTime in", values, "changelasttime");
            return (Criteria) this;
        }

        public Criteria andChangelasttimeNotIn(List<Date> values) {
            addCriterion("ChangeLastTime not in", values, "changelasttime");
            return (Criteria) this;
        }

        public Criteria andChangelasttimeBetween(Date value1, Date value2) {
            addCriterion("ChangeLastTime between", value1, value2, "changelasttime");
            return (Criteria) this;
        }

        public Criteria andChangelasttimeNotBetween(Date value1, Date value2) {
            addCriterion("ChangeLastTime not between", value1, value2, "changelasttime");
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