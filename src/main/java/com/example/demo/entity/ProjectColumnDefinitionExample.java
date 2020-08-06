package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectColumnDefinitionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectColumnDefinitionExample() {
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

        public Criteria andProjectcolumndefinitionidIsNull() {
            addCriterion("ProjectColumnDefinitionId is null");
            return (Criteria) this;
        }

        public Criteria andProjectcolumndefinitionidIsNotNull() {
            addCriterion("ProjectColumnDefinitionId is not null");
            return (Criteria) this;
        }

        public Criteria andProjectcolumndefinitionidEqualTo(Integer value) {
            addCriterion("ProjectColumnDefinitionId =", value, "projectcolumndefinitionid");
            return (Criteria) this;
        }

        public Criteria andProjectcolumndefinitionidNotEqualTo(Integer value) {
            addCriterion("ProjectColumnDefinitionId <>", value, "projectcolumndefinitionid");
            return (Criteria) this;
        }

        public Criteria andProjectcolumndefinitionidGreaterThan(Integer value) {
            addCriterion("ProjectColumnDefinitionId >", value, "projectcolumndefinitionid");
            return (Criteria) this;
        }

        public Criteria andProjectcolumndefinitionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProjectColumnDefinitionId >=", value, "projectcolumndefinitionid");
            return (Criteria) this;
        }

        public Criteria andProjectcolumndefinitionidLessThan(Integer value) {
            addCriterion("ProjectColumnDefinitionId <", value, "projectcolumndefinitionid");
            return (Criteria) this;
        }

        public Criteria andProjectcolumndefinitionidLessThanOrEqualTo(Integer value) {
            addCriterion("ProjectColumnDefinitionId <=", value, "projectcolumndefinitionid");
            return (Criteria) this;
        }

        public Criteria andProjectcolumndefinitionidIn(List<Integer> values) {
            addCriterion("ProjectColumnDefinitionId in", values, "projectcolumndefinitionid");
            return (Criteria) this;
        }

        public Criteria andProjectcolumndefinitionidNotIn(List<Integer> values) {
            addCriterion("ProjectColumnDefinitionId not in", values, "projectcolumndefinitionid");
            return (Criteria) this;
        }

        public Criteria andProjectcolumndefinitionidBetween(Integer value1, Integer value2) {
            addCriterion("ProjectColumnDefinitionId between", value1, value2, "projectcolumndefinitionid");
            return (Criteria) this;
        }

        public Criteria andProjectcolumndefinitionidNotBetween(Integer value1, Integer value2) {
            addCriterion("ProjectColumnDefinitionId not between", value1, value2, "projectcolumndefinitionid");
            return (Criteria) this;
        }

        public Criteria andColumnnameIsNull() {
            addCriterion("ColumnName is null");
            return (Criteria) this;
        }

        public Criteria andColumnnameIsNotNull() {
            addCriterion("ColumnName is not null");
            return (Criteria) this;
        }

        public Criteria andColumnnameEqualTo(String value) {
            addCriterion("ColumnName =", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameNotEqualTo(String value) {
            addCriterion("ColumnName <>", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameGreaterThan(String value) {
            addCriterion("ColumnName >", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameGreaterThanOrEqualTo(String value) {
            addCriterion("ColumnName >=", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameLessThan(String value) {
            addCriterion("ColumnName <", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameLessThanOrEqualTo(String value) {
            addCriterion("ColumnName <=", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameLike(String value) {
            addCriterion("ColumnName like", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameNotLike(String value) {
            addCriterion("ColumnName not like", value, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameIn(List<String> values) {
            addCriterion("ColumnName in", values, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameNotIn(List<String> values) {
            addCriterion("ColumnName not in", values, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameBetween(String value1, String value2) {
            addCriterion("ColumnName between", value1, value2, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumnnameNotBetween(String value1, String value2) {
            addCriterion("ColumnName not between", value1, value2, "columnname");
            return (Criteria) this;
        }

        public Criteria andColumndatatypeIsNull() {
            addCriterion("ColumnDataType is null");
            return (Criteria) this;
        }

        public Criteria andColumndatatypeIsNotNull() {
            addCriterion("ColumnDataType is not null");
            return (Criteria) this;
        }

        public Criteria andColumndatatypeEqualTo(Integer value) {
            addCriterion("ColumnDataType =", value, "columndatatype");
            return (Criteria) this;
        }

        public Criteria andColumndatatypeNotEqualTo(Integer value) {
            addCriterion("ColumnDataType <>", value, "columndatatype");
            return (Criteria) this;
        }

        public Criteria andColumndatatypeGreaterThan(Integer value) {
            addCriterion("ColumnDataType >", value, "columndatatype");
            return (Criteria) this;
        }

        public Criteria andColumndatatypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ColumnDataType >=", value, "columndatatype");
            return (Criteria) this;
        }

        public Criteria andColumndatatypeLessThan(Integer value) {
            addCriterion("ColumnDataType <", value, "columndatatype");
            return (Criteria) this;
        }

        public Criteria andColumndatatypeLessThanOrEqualTo(Integer value) {
            addCriterion("ColumnDataType <=", value, "columndatatype");
            return (Criteria) this;
        }

        public Criteria andColumndatatypeIn(List<Integer> values) {
            addCriterion("ColumnDataType in", values, "columndatatype");
            return (Criteria) this;
        }

        public Criteria andColumndatatypeNotIn(List<Integer> values) {
            addCriterion("ColumnDataType not in", values, "columndatatype");
            return (Criteria) this;
        }

        public Criteria andColumndatatypeBetween(Integer value1, Integer value2) {
            addCriterion("ColumnDataType between", value1, value2, "columndatatype");
            return (Criteria) this;
        }

        public Criteria andColumndatatypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ColumnDataType not between", value1, value2, "columndatatype");
            return (Criteria) this;
        }

        public Criteria andQueryconditionorderIsNull() {
            addCriterion("QueryConditionOrder is null");
            return (Criteria) this;
        }

        public Criteria andQueryconditionorderIsNotNull() {
            addCriterion("QueryConditionOrder is not null");
            return (Criteria) this;
        }

        public Criteria andQueryconditionorderEqualTo(Integer value) {
            addCriterion("QueryConditionOrder =", value, "queryconditionorder");
            return (Criteria) this;
        }

        public Criteria andQueryconditionorderNotEqualTo(Integer value) {
            addCriterion("QueryConditionOrder <>", value, "queryconditionorder");
            return (Criteria) this;
        }

        public Criteria andQueryconditionorderGreaterThan(Integer value) {
            addCriterion("QueryConditionOrder >", value, "queryconditionorder");
            return (Criteria) this;
        }

        public Criteria andQueryconditionorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("QueryConditionOrder >=", value, "queryconditionorder");
            return (Criteria) this;
        }

        public Criteria andQueryconditionorderLessThan(Integer value) {
            addCriterion("QueryConditionOrder <", value, "queryconditionorder");
            return (Criteria) this;
        }

        public Criteria andQueryconditionorderLessThanOrEqualTo(Integer value) {
            addCriterion("QueryConditionOrder <=", value, "queryconditionorder");
            return (Criteria) this;
        }

        public Criteria andQueryconditionorderIn(List<Integer> values) {
            addCriterion("QueryConditionOrder in", values, "queryconditionorder");
            return (Criteria) this;
        }

        public Criteria andQueryconditionorderNotIn(List<Integer> values) {
            addCriterion("QueryConditionOrder not in", values, "queryconditionorder");
            return (Criteria) this;
        }

        public Criteria andQueryconditionorderBetween(Integer value1, Integer value2) {
            addCriterion("QueryConditionOrder between", value1, value2, "queryconditionorder");
            return (Criteria) this;
        }

        public Criteria andQueryconditionorderNotBetween(Integer value1, Integer value2) {
            addCriterion("QueryConditionOrder not between", value1, value2, "queryconditionorder");
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