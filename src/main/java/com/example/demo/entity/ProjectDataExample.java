package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectDataExample() {
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

        public Criteria andProjectdataidIsNull() {
            addCriterion("ProjectDataId is null");
            return (Criteria) this;
        }

        public Criteria andProjectdataidIsNotNull() {
            addCriterion("ProjectDataId is not null");
            return (Criteria) this;
        }

        public Criteria andProjectdataidEqualTo(Integer value) {
            addCriterion("ProjectDataId =", value, "projectdataid");
            return (Criteria) this;
        }

        public Criteria andProjectdataidNotEqualTo(Integer value) {
            addCriterion("ProjectDataId <>", value, "projectdataid");
            return (Criteria) this;
        }

        public Criteria andProjectdataidGreaterThan(Integer value) {
            addCriterion("ProjectDataId >", value, "projectdataid");
            return (Criteria) this;
        }

        public Criteria andProjectdataidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProjectDataId >=", value, "projectdataid");
            return (Criteria) this;
        }

        public Criteria andProjectdataidLessThan(Integer value) {
            addCriterion("ProjectDataId <", value, "projectdataid");
            return (Criteria) this;
        }

        public Criteria andProjectdataidLessThanOrEqualTo(Integer value) {
            addCriterion("ProjectDataId <=", value, "projectdataid");
            return (Criteria) this;
        }

        public Criteria andProjectdataidIn(List<Integer> values) {
            addCriterion("ProjectDataId in", values, "projectdataid");
            return (Criteria) this;
        }

        public Criteria andProjectdataidNotIn(List<Integer> values) {
            addCriterion("ProjectDataId not in", values, "projectdataid");
            return (Criteria) this;
        }

        public Criteria andProjectdataidBetween(Integer value1, Integer value2) {
            addCriterion("ProjectDataId between", value1, value2, "projectdataid");
            return (Criteria) this;
        }

        public Criteria andProjectdataidNotBetween(Integer value1, Integer value2) {
            addCriterion("ProjectDataId not between", value1, value2, "projectdataid");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("ProjectName is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("ProjectName is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("ProjectName =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("ProjectName <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("ProjectName >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("ProjectName >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("ProjectName <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("ProjectName <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("ProjectName like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("ProjectName not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("ProjectName in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("ProjectName not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("ProjectName between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("ProjectName not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andDatacolumn1IsNull() {
            addCriterion("DataColumn1 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn1IsNotNull() {
            addCriterion("DataColumn1 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn1EqualTo(String value) {
            addCriterion("DataColumn1 =", value, "datacolumn1");
            return (Criteria) this;
        }

        public Criteria andDatacolumn1NotEqualTo(String value) {
            addCriterion("DataColumn1 <>", value, "datacolumn1");
            return (Criteria) this;
        }

        public Criteria andDatacolumn1GreaterThan(String value) {
            addCriterion("DataColumn1 >", value, "datacolumn1");
            return (Criteria) this;
        }

        public Criteria andDatacolumn1GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn1 >=", value, "datacolumn1");
            return (Criteria) this;
        }

        public Criteria andDatacolumn1LessThan(String value) {
            addCriterion("DataColumn1 <", value, "datacolumn1");
            return (Criteria) this;
        }

        public Criteria andDatacolumn1LessThanOrEqualTo(String value) {
            addCriterion("DataColumn1 <=", value, "datacolumn1");
            return (Criteria) this;
        }

        public Criteria andDatacolumn1Like(String value) {
            addCriterion("DataColumn1 like", value, "datacolumn1");
            return (Criteria) this;
        }

        public Criteria andDatacolumn1NotLike(String value) {
            addCriterion("DataColumn1 not like", value, "datacolumn1");
            return (Criteria) this;
        }

        public Criteria andDatacolumn1In(List<String> values) {
            addCriterion("DataColumn1 in", values, "datacolumn1");
            return (Criteria) this;
        }

        public Criteria andDatacolumn1NotIn(List<String> values) {
            addCriterion("DataColumn1 not in", values, "datacolumn1");
            return (Criteria) this;
        }

        public Criteria andDatacolumn1Between(String value1, String value2) {
            addCriterion("DataColumn1 between", value1, value2, "datacolumn1");
            return (Criteria) this;
        }

        public Criteria andDatacolumn1NotBetween(String value1, String value2) {
            addCriterion("DataColumn1 not between", value1, value2, "datacolumn1");
            return (Criteria) this;
        }

        public Criteria andDatacolumn2IsNull() {
            addCriterion("DataColumn2 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn2IsNotNull() {
            addCriterion("DataColumn2 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn2EqualTo(String value) {
            addCriterion("DataColumn2 =", value, "datacolumn2");
            return (Criteria) this;
        }

        public Criteria andDatacolumn2NotEqualTo(String value) {
            addCriterion("DataColumn2 <>", value, "datacolumn2");
            return (Criteria) this;
        }

        public Criteria andDatacolumn2GreaterThan(String value) {
            addCriterion("DataColumn2 >", value, "datacolumn2");
            return (Criteria) this;
        }

        public Criteria andDatacolumn2GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn2 >=", value, "datacolumn2");
            return (Criteria) this;
        }

        public Criteria andDatacolumn2LessThan(String value) {
            addCriterion("DataColumn2 <", value, "datacolumn2");
            return (Criteria) this;
        }

        public Criteria andDatacolumn2LessThanOrEqualTo(String value) {
            addCriterion("DataColumn2 <=", value, "datacolumn2");
            return (Criteria) this;
        }

        public Criteria andDatacolumn2Like(String value) {
            addCriterion("DataColumn2 like", value, "datacolumn2");
            return (Criteria) this;
        }

        public Criteria andDatacolumn2NotLike(String value) {
            addCriterion("DataColumn2 not like", value, "datacolumn2");
            return (Criteria) this;
        }

        public Criteria andDatacolumn2In(List<String> values) {
            addCriterion("DataColumn2 in", values, "datacolumn2");
            return (Criteria) this;
        }

        public Criteria andDatacolumn2NotIn(List<String> values) {
            addCriterion("DataColumn2 not in", values, "datacolumn2");
            return (Criteria) this;
        }

        public Criteria andDatacolumn2Between(String value1, String value2) {
            addCriterion("DataColumn2 between", value1, value2, "datacolumn2");
            return (Criteria) this;
        }

        public Criteria andDatacolumn2NotBetween(String value1, String value2) {
            addCriterion("DataColumn2 not between", value1, value2, "datacolumn2");
            return (Criteria) this;
        }

        public Criteria andDatacolumn3IsNull() {
            addCriterion("DataColumn3 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn3IsNotNull() {
            addCriterion("DataColumn3 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn3EqualTo(String value) {
            addCriterion("DataColumn3 =", value, "datacolumn3");
            return (Criteria) this;
        }

        public Criteria andDatacolumn3NotEqualTo(String value) {
            addCriterion("DataColumn3 <>", value, "datacolumn3");
            return (Criteria) this;
        }

        public Criteria andDatacolumn3GreaterThan(String value) {
            addCriterion("DataColumn3 >", value, "datacolumn3");
            return (Criteria) this;
        }

        public Criteria andDatacolumn3GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn3 >=", value, "datacolumn3");
            return (Criteria) this;
        }

        public Criteria andDatacolumn3LessThan(String value) {
            addCriterion("DataColumn3 <", value, "datacolumn3");
            return (Criteria) this;
        }

        public Criteria andDatacolumn3LessThanOrEqualTo(String value) {
            addCriterion("DataColumn3 <=", value, "datacolumn3");
            return (Criteria) this;
        }

        public Criteria andDatacolumn3Like(String value) {
            addCriterion("DataColumn3 like", value, "datacolumn3");
            return (Criteria) this;
        }

        public Criteria andDatacolumn3NotLike(String value) {
            addCriterion("DataColumn3 not like", value, "datacolumn3");
            return (Criteria) this;
        }

        public Criteria andDatacolumn3In(List<String> values) {
            addCriterion("DataColumn3 in", values, "datacolumn3");
            return (Criteria) this;
        }

        public Criteria andDatacolumn3NotIn(List<String> values) {
            addCriterion("DataColumn3 not in", values, "datacolumn3");
            return (Criteria) this;
        }

        public Criteria andDatacolumn3Between(String value1, String value2) {
            addCriterion("DataColumn3 between", value1, value2, "datacolumn3");
            return (Criteria) this;
        }

        public Criteria andDatacolumn3NotBetween(String value1, String value2) {
            addCriterion("DataColumn3 not between", value1, value2, "datacolumn3");
            return (Criteria) this;
        }

        public Criteria andDatacolumn4IsNull() {
            addCriterion("DataColumn4 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn4IsNotNull() {
            addCriterion("DataColumn4 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn4EqualTo(String value) {
            addCriterion("DataColumn4 =", value, "datacolumn4");
            return (Criteria) this;
        }

        public Criteria andDatacolumn4NotEqualTo(String value) {
            addCriterion("DataColumn4 <>", value, "datacolumn4");
            return (Criteria) this;
        }

        public Criteria andDatacolumn4GreaterThan(String value) {
            addCriterion("DataColumn4 >", value, "datacolumn4");
            return (Criteria) this;
        }

        public Criteria andDatacolumn4GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn4 >=", value, "datacolumn4");
            return (Criteria) this;
        }

        public Criteria andDatacolumn4LessThan(String value) {
            addCriterion("DataColumn4 <", value, "datacolumn4");
            return (Criteria) this;
        }

        public Criteria andDatacolumn4LessThanOrEqualTo(String value) {
            addCriterion("DataColumn4 <=", value, "datacolumn4");
            return (Criteria) this;
        }

        public Criteria andDatacolumn4Like(String value) {
            addCriterion("DataColumn4 like", value, "datacolumn4");
            return (Criteria) this;
        }

        public Criteria andDatacolumn4NotLike(String value) {
            addCriterion("DataColumn4 not like", value, "datacolumn4");
            return (Criteria) this;
        }

        public Criteria andDatacolumn4In(List<String> values) {
            addCriterion("DataColumn4 in", values, "datacolumn4");
            return (Criteria) this;
        }

        public Criteria andDatacolumn4NotIn(List<String> values) {
            addCriterion("DataColumn4 not in", values, "datacolumn4");
            return (Criteria) this;
        }

        public Criteria andDatacolumn4Between(String value1, String value2) {
            addCriterion("DataColumn4 between", value1, value2, "datacolumn4");
            return (Criteria) this;
        }

        public Criteria andDatacolumn4NotBetween(String value1, String value2) {
            addCriterion("DataColumn4 not between", value1, value2, "datacolumn4");
            return (Criteria) this;
        }

        public Criteria andDatacolumn5IsNull() {
            addCriterion("DataColumn5 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn5IsNotNull() {
            addCriterion("DataColumn5 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn5EqualTo(String value) {
            addCriterion("DataColumn5 =", value, "datacolumn5");
            return (Criteria) this;
        }

        public Criteria andDatacolumn5NotEqualTo(String value) {
            addCriterion("DataColumn5 <>", value, "datacolumn5");
            return (Criteria) this;
        }

        public Criteria andDatacolumn5GreaterThan(String value) {
            addCriterion("DataColumn5 >", value, "datacolumn5");
            return (Criteria) this;
        }

        public Criteria andDatacolumn5GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn5 >=", value, "datacolumn5");
            return (Criteria) this;
        }

        public Criteria andDatacolumn5LessThan(String value) {
            addCriterion("DataColumn5 <", value, "datacolumn5");
            return (Criteria) this;
        }

        public Criteria andDatacolumn5LessThanOrEqualTo(String value) {
            addCriterion("DataColumn5 <=", value, "datacolumn5");
            return (Criteria) this;
        }

        public Criteria andDatacolumn5Like(String value) {
            addCriterion("DataColumn5 like", value, "datacolumn5");
            return (Criteria) this;
        }

        public Criteria andDatacolumn5NotLike(String value) {
            addCriterion("DataColumn5 not like", value, "datacolumn5");
            return (Criteria) this;
        }

        public Criteria andDatacolumn5In(List<String> values) {
            addCriterion("DataColumn5 in", values, "datacolumn5");
            return (Criteria) this;
        }

        public Criteria andDatacolumn5NotIn(List<String> values) {
            addCriterion("DataColumn5 not in", values, "datacolumn5");
            return (Criteria) this;
        }

        public Criteria andDatacolumn5Between(String value1, String value2) {
            addCriterion("DataColumn5 between", value1, value2, "datacolumn5");
            return (Criteria) this;
        }

        public Criteria andDatacolumn5NotBetween(String value1, String value2) {
            addCriterion("DataColumn5 not between", value1, value2, "datacolumn5");
            return (Criteria) this;
        }

        public Criteria andDatacolumn6IsNull() {
            addCriterion("DataColumn6 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn6IsNotNull() {
            addCriterion("DataColumn6 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn6EqualTo(String value) {
            addCriterion("DataColumn6 =", value, "datacolumn6");
            return (Criteria) this;
        }

        public Criteria andDatacolumn6NotEqualTo(String value) {
            addCriterion("DataColumn6 <>", value, "datacolumn6");
            return (Criteria) this;
        }

        public Criteria andDatacolumn6GreaterThan(String value) {
            addCriterion("DataColumn6 >", value, "datacolumn6");
            return (Criteria) this;
        }

        public Criteria andDatacolumn6GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn6 >=", value, "datacolumn6");
            return (Criteria) this;
        }

        public Criteria andDatacolumn6LessThan(String value) {
            addCriterion("DataColumn6 <", value, "datacolumn6");
            return (Criteria) this;
        }

        public Criteria andDatacolumn6LessThanOrEqualTo(String value) {
            addCriterion("DataColumn6 <=", value, "datacolumn6");
            return (Criteria) this;
        }

        public Criteria andDatacolumn6Like(String value) {
            addCriterion("DataColumn6 like", value, "datacolumn6");
            return (Criteria) this;
        }

        public Criteria andDatacolumn6NotLike(String value) {
            addCriterion("DataColumn6 not like", value, "datacolumn6");
            return (Criteria) this;
        }

        public Criteria andDatacolumn6In(List<String> values) {
            addCriterion("DataColumn6 in", values, "datacolumn6");
            return (Criteria) this;
        }

        public Criteria andDatacolumn6NotIn(List<String> values) {
            addCriterion("DataColumn6 not in", values, "datacolumn6");
            return (Criteria) this;
        }

        public Criteria andDatacolumn6Between(String value1, String value2) {
            addCriterion("DataColumn6 between", value1, value2, "datacolumn6");
            return (Criteria) this;
        }

        public Criteria andDatacolumn6NotBetween(String value1, String value2) {
            addCriterion("DataColumn6 not between", value1, value2, "datacolumn6");
            return (Criteria) this;
        }

        public Criteria andDatacolumn7IsNull() {
            addCriterion("DataColumn7 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn7IsNotNull() {
            addCriterion("DataColumn7 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn7EqualTo(String value) {
            addCriterion("DataColumn7 =", value, "datacolumn7");
            return (Criteria) this;
        }

        public Criteria andDatacolumn7NotEqualTo(String value) {
            addCriterion("DataColumn7 <>", value, "datacolumn7");
            return (Criteria) this;
        }

        public Criteria andDatacolumn7GreaterThan(String value) {
            addCriterion("DataColumn7 >", value, "datacolumn7");
            return (Criteria) this;
        }

        public Criteria andDatacolumn7GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn7 >=", value, "datacolumn7");
            return (Criteria) this;
        }

        public Criteria andDatacolumn7LessThan(String value) {
            addCriterion("DataColumn7 <", value, "datacolumn7");
            return (Criteria) this;
        }

        public Criteria andDatacolumn7LessThanOrEqualTo(String value) {
            addCriterion("DataColumn7 <=", value, "datacolumn7");
            return (Criteria) this;
        }

        public Criteria andDatacolumn7Like(String value) {
            addCriterion("DataColumn7 like", value, "datacolumn7");
            return (Criteria) this;
        }

        public Criteria andDatacolumn7NotLike(String value) {
            addCriterion("DataColumn7 not like", value, "datacolumn7");
            return (Criteria) this;
        }

        public Criteria andDatacolumn7In(List<String> values) {
            addCriterion("DataColumn7 in", values, "datacolumn7");
            return (Criteria) this;
        }

        public Criteria andDatacolumn7NotIn(List<String> values) {
            addCriterion("DataColumn7 not in", values, "datacolumn7");
            return (Criteria) this;
        }

        public Criteria andDatacolumn7Between(String value1, String value2) {
            addCriterion("DataColumn7 between", value1, value2, "datacolumn7");
            return (Criteria) this;
        }

        public Criteria andDatacolumn7NotBetween(String value1, String value2) {
            addCriterion("DataColumn7 not between", value1, value2, "datacolumn7");
            return (Criteria) this;
        }

        public Criteria andDatacolumn8IsNull() {
            addCriterion("DataColumn8 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn8IsNotNull() {
            addCriterion("DataColumn8 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn8EqualTo(String value) {
            addCriterion("DataColumn8 =", value, "datacolumn8");
            return (Criteria) this;
        }

        public Criteria andDatacolumn8NotEqualTo(String value) {
            addCriterion("DataColumn8 <>", value, "datacolumn8");
            return (Criteria) this;
        }

        public Criteria andDatacolumn8GreaterThan(String value) {
            addCriterion("DataColumn8 >", value, "datacolumn8");
            return (Criteria) this;
        }

        public Criteria andDatacolumn8GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn8 >=", value, "datacolumn8");
            return (Criteria) this;
        }

        public Criteria andDatacolumn8LessThan(String value) {
            addCriterion("DataColumn8 <", value, "datacolumn8");
            return (Criteria) this;
        }

        public Criteria andDatacolumn8LessThanOrEqualTo(String value) {
            addCriterion("DataColumn8 <=", value, "datacolumn8");
            return (Criteria) this;
        }

        public Criteria andDatacolumn8Like(String value) {
            addCriterion("DataColumn8 like", value, "datacolumn8");
            return (Criteria) this;
        }

        public Criteria andDatacolumn8NotLike(String value) {
            addCriterion("DataColumn8 not like", value, "datacolumn8");
            return (Criteria) this;
        }

        public Criteria andDatacolumn8In(List<String> values) {
            addCriterion("DataColumn8 in", values, "datacolumn8");
            return (Criteria) this;
        }

        public Criteria andDatacolumn8NotIn(List<String> values) {
            addCriterion("DataColumn8 not in", values, "datacolumn8");
            return (Criteria) this;
        }

        public Criteria andDatacolumn8Between(String value1, String value2) {
            addCriterion("DataColumn8 between", value1, value2, "datacolumn8");
            return (Criteria) this;
        }

        public Criteria andDatacolumn8NotBetween(String value1, String value2) {
            addCriterion("DataColumn8 not between", value1, value2, "datacolumn8");
            return (Criteria) this;
        }

        public Criteria andDatacolumn9IsNull() {
            addCriterion("DataColumn9 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn9IsNotNull() {
            addCriterion("DataColumn9 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn9EqualTo(String value) {
            addCriterion("DataColumn9 =", value, "datacolumn9");
            return (Criteria) this;
        }

        public Criteria andDatacolumn9NotEqualTo(String value) {
            addCriterion("DataColumn9 <>", value, "datacolumn9");
            return (Criteria) this;
        }

        public Criteria andDatacolumn9GreaterThan(String value) {
            addCriterion("DataColumn9 >", value, "datacolumn9");
            return (Criteria) this;
        }

        public Criteria andDatacolumn9GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn9 >=", value, "datacolumn9");
            return (Criteria) this;
        }

        public Criteria andDatacolumn9LessThan(String value) {
            addCriterion("DataColumn9 <", value, "datacolumn9");
            return (Criteria) this;
        }

        public Criteria andDatacolumn9LessThanOrEqualTo(String value) {
            addCriterion("DataColumn9 <=", value, "datacolumn9");
            return (Criteria) this;
        }

        public Criteria andDatacolumn9Like(String value) {
            addCriterion("DataColumn9 like", value, "datacolumn9");
            return (Criteria) this;
        }

        public Criteria andDatacolumn9NotLike(String value) {
            addCriterion("DataColumn9 not like", value, "datacolumn9");
            return (Criteria) this;
        }

        public Criteria andDatacolumn9In(List<String> values) {
            addCriterion("DataColumn9 in", values, "datacolumn9");
            return (Criteria) this;
        }

        public Criteria andDatacolumn9NotIn(List<String> values) {
            addCriterion("DataColumn9 not in", values, "datacolumn9");
            return (Criteria) this;
        }

        public Criteria andDatacolumn9Between(String value1, String value2) {
            addCriterion("DataColumn9 between", value1, value2, "datacolumn9");
            return (Criteria) this;
        }

        public Criteria andDatacolumn9NotBetween(String value1, String value2) {
            addCriterion("DataColumn9 not between", value1, value2, "datacolumn9");
            return (Criteria) this;
        }

        public Criteria andDatacolumn10IsNull() {
            addCriterion("DataColumn10 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn10IsNotNull() {
            addCriterion("DataColumn10 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn10EqualTo(String value) {
            addCriterion("DataColumn10 =", value, "datacolumn10");
            return (Criteria) this;
        }

        public Criteria andDatacolumn10NotEqualTo(String value) {
            addCriterion("DataColumn10 <>", value, "datacolumn10");
            return (Criteria) this;
        }

        public Criteria andDatacolumn10GreaterThan(String value) {
            addCriterion("DataColumn10 >", value, "datacolumn10");
            return (Criteria) this;
        }

        public Criteria andDatacolumn10GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn10 >=", value, "datacolumn10");
            return (Criteria) this;
        }

        public Criteria andDatacolumn10LessThan(String value) {
            addCriterion("DataColumn10 <", value, "datacolumn10");
            return (Criteria) this;
        }

        public Criteria andDatacolumn10LessThanOrEqualTo(String value) {
            addCriterion("DataColumn10 <=", value, "datacolumn10");
            return (Criteria) this;
        }

        public Criteria andDatacolumn10Like(String value) {
            addCriterion("DataColumn10 like", value, "datacolumn10");
            return (Criteria) this;
        }

        public Criteria andDatacolumn10NotLike(String value) {
            addCriterion("DataColumn10 not like", value, "datacolumn10");
            return (Criteria) this;
        }

        public Criteria andDatacolumn10In(List<String> values) {
            addCriterion("DataColumn10 in", values, "datacolumn10");
            return (Criteria) this;
        }

        public Criteria andDatacolumn10NotIn(List<String> values) {
            addCriterion("DataColumn10 not in", values, "datacolumn10");
            return (Criteria) this;
        }

        public Criteria andDatacolumn10Between(String value1, String value2) {
            addCriterion("DataColumn10 between", value1, value2, "datacolumn10");
            return (Criteria) this;
        }

        public Criteria andDatacolumn10NotBetween(String value1, String value2) {
            addCriterion("DataColumn10 not between", value1, value2, "datacolumn10");
            return (Criteria) this;
        }

        public Criteria andDatacolumn11IsNull() {
            addCriterion("DataColumn11 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn11IsNotNull() {
            addCriterion("DataColumn11 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn11EqualTo(String value) {
            addCriterion("DataColumn11 =", value, "datacolumn11");
            return (Criteria) this;
        }

        public Criteria andDatacolumn11NotEqualTo(String value) {
            addCriterion("DataColumn11 <>", value, "datacolumn11");
            return (Criteria) this;
        }

        public Criteria andDatacolumn11GreaterThan(String value) {
            addCriterion("DataColumn11 >", value, "datacolumn11");
            return (Criteria) this;
        }

        public Criteria andDatacolumn11GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn11 >=", value, "datacolumn11");
            return (Criteria) this;
        }

        public Criteria andDatacolumn11LessThan(String value) {
            addCriterion("DataColumn11 <", value, "datacolumn11");
            return (Criteria) this;
        }

        public Criteria andDatacolumn11LessThanOrEqualTo(String value) {
            addCriterion("DataColumn11 <=", value, "datacolumn11");
            return (Criteria) this;
        }

        public Criteria andDatacolumn11Like(String value) {
            addCriterion("DataColumn11 like", value, "datacolumn11");
            return (Criteria) this;
        }

        public Criteria andDatacolumn11NotLike(String value) {
            addCriterion("DataColumn11 not like", value, "datacolumn11");
            return (Criteria) this;
        }

        public Criteria andDatacolumn11In(List<String> values) {
            addCriterion("DataColumn11 in", values, "datacolumn11");
            return (Criteria) this;
        }

        public Criteria andDatacolumn11NotIn(List<String> values) {
            addCriterion("DataColumn11 not in", values, "datacolumn11");
            return (Criteria) this;
        }

        public Criteria andDatacolumn11Between(String value1, String value2) {
            addCriterion("DataColumn11 between", value1, value2, "datacolumn11");
            return (Criteria) this;
        }

        public Criteria andDatacolumn11NotBetween(String value1, String value2) {
            addCriterion("DataColumn11 not between", value1, value2, "datacolumn11");
            return (Criteria) this;
        }

        public Criteria andDatacolumn12IsNull() {
            addCriterion("DataColumn12 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn12IsNotNull() {
            addCriterion("DataColumn12 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn12EqualTo(String value) {
            addCriterion("DataColumn12 =", value, "datacolumn12");
            return (Criteria) this;
        }

        public Criteria andDatacolumn12NotEqualTo(String value) {
            addCriterion("DataColumn12 <>", value, "datacolumn12");
            return (Criteria) this;
        }

        public Criteria andDatacolumn12GreaterThan(String value) {
            addCriterion("DataColumn12 >", value, "datacolumn12");
            return (Criteria) this;
        }

        public Criteria andDatacolumn12GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn12 >=", value, "datacolumn12");
            return (Criteria) this;
        }

        public Criteria andDatacolumn12LessThan(String value) {
            addCriterion("DataColumn12 <", value, "datacolumn12");
            return (Criteria) this;
        }

        public Criteria andDatacolumn12LessThanOrEqualTo(String value) {
            addCriterion("DataColumn12 <=", value, "datacolumn12");
            return (Criteria) this;
        }

        public Criteria andDatacolumn12Like(String value) {
            addCriterion("DataColumn12 like", value, "datacolumn12");
            return (Criteria) this;
        }

        public Criteria andDatacolumn12NotLike(String value) {
            addCriterion("DataColumn12 not like", value, "datacolumn12");
            return (Criteria) this;
        }

        public Criteria andDatacolumn12In(List<String> values) {
            addCriterion("DataColumn12 in", values, "datacolumn12");
            return (Criteria) this;
        }

        public Criteria andDatacolumn12NotIn(List<String> values) {
            addCriterion("DataColumn12 not in", values, "datacolumn12");
            return (Criteria) this;
        }

        public Criteria andDatacolumn12Between(String value1, String value2) {
            addCriterion("DataColumn12 between", value1, value2, "datacolumn12");
            return (Criteria) this;
        }

        public Criteria andDatacolumn12NotBetween(String value1, String value2) {
            addCriterion("DataColumn12 not between", value1, value2, "datacolumn12");
            return (Criteria) this;
        }

        public Criteria andDatacolumn13IsNull() {
            addCriterion("DataColumn13 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn13IsNotNull() {
            addCriterion("DataColumn13 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn13EqualTo(String value) {
            addCriterion("DataColumn13 =", value, "datacolumn13");
            return (Criteria) this;
        }

        public Criteria andDatacolumn13NotEqualTo(String value) {
            addCriterion("DataColumn13 <>", value, "datacolumn13");
            return (Criteria) this;
        }

        public Criteria andDatacolumn13GreaterThan(String value) {
            addCriterion("DataColumn13 >", value, "datacolumn13");
            return (Criteria) this;
        }

        public Criteria andDatacolumn13GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn13 >=", value, "datacolumn13");
            return (Criteria) this;
        }

        public Criteria andDatacolumn13LessThan(String value) {
            addCriterion("DataColumn13 <", value, "datacolumn13");
            return (Criteria) this;
        }

        public Criteria andDatacolumn13LessThanOrEqualTo(String value) {
            addCriterion("DataColumn13 <=", value, "datacolumn13");
            return (Criteria) this;
        }

        public Criteria andDatacolumn13Like(String value) {
            addCriterion("DataColumn13 like", value, "datacolumn13");
            return (Criteria) this;
        }

        public Criteria andDatacolumn13NotLike(String value) {
            addCriterion("DataColumn13 not like", value, "datacolumn13");
            return (Criteria) this;
        }

        public Criteria andDatacolumn13In(List<String> values) {
            addCriterion("DataColumn13 in", values, "datacolumn13");
            return (Criteria) this;
        }

        public Criteria andDatacolumn13NotIn(List<String> values) {
            addCriterion("DataColumn13 not in", values, "datacolumn13");
            return (Criteria) this;
        }

        public Criteria andDatacolumn13Between(String value1, String value2) {
            addCriterion("DataColumn13 between", value1, value2, "datacolumn13");
            return (Criteria) this;
        }

        public Criteria andDatacolumn13NotBetween(String value1, String value2) {
            addCriterion("DataColumn13 not between", value1, value2, "datacolumn13");
            return (Criteria) this;
        }

        public Criteria andDatacolumn14IsNull() {
            addCriterion("DataColumn14 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn14IsNotNull() {
            addCriterion("DataColumn14 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn14EqualTo(String value) {
            addCriterion("DataColumn14 =", value, "datacolumn14");
            return (Criteria) this;
        }

        public Criteria andDatacolumn14NotEqualTo(String value) {
            addCriterion("DataColumn14 <>", value, "datacolumn14");
            return (Criteria) this;
        }

        public Criteria andDatacolumn14GreaterThan(String value) {
            addCriterion("DataColumn14 >", value, "datacolumn14");
            return (Criteria) this;
        }

        public Criteria andDatacolumn14GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn14 >=", value, "datacolumn14");
            return (Criteria) this;
        }

        public Criteria andDatacolumn14LessThan(String value) {
            addCriterion("DataColumn14 <", value, "datacolumn14");
            return (Criteria) this;
        }

        public Criteria andDatacolumn14LessThanOrEqualTo(String value) {
            addCriterion("DataColumn14 <=", value, "datacolumn14");
            return (Criteria) this;
        }

        public Criteria andDatacolumn14Like(String value) {
            addCriterion("DataColumn14 like", value, "datacolumn14");
            return (Criteria) this;
        }

        public Criteria andDatacolumn14NotLike(String value) {
            addCriterion("DataColumn14 not like", value, "datacolumn14");
            return (Criteria) this;
        }

        public Criteria andDatacolumn14In(List<String> values) {
            addCriterion("DataColumn14 in", values, "datacolumn14");
            return (Criteria) this;
        }

        public Criteria andDatacolumn14NotIn(List<String> values) {
            addCriterion("DataColumn14 not in", values, "datacolumn14");
            return (Criteria) this;
        }

        public Criteria andDatacolumn14Between(String value1, String value2) {
            addCriterion("DataColumn14 between", value1, value2, "datacolumn14");
            return (Criteria) this;
        }

        public Criteria andDatacolumn14NotBetween(String value1, String value2) {
            addCriterion("DataColumn14 not between", value1, value2, "datacolumn14");
            return (Criteria) this;
        }

        public Criteria andDatacolumn15IsNull() {
            addCriterion("DataColumn15 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn15IsNotNull() {
            addCriterion("DataColumn15 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn15EqualTo(String value) {
            addCriterion("DataColumn15 =", value, "datacolumn15");
            return (Criteria) this;
        }

        public Criteria andDatacolumn15NotEqualTo(String value) {
            addCriterion("DataColumn15 <>", value, "datacolumn15");
            return (Criteria) this;
        }

        public Criteria andDatacolumn15GreaterThan(String value) {
            addCriterion("DataColumn15 >", value, "datacolumn15");
            return (Criteria) this;
        }

        public Criteria andDatacolumn15GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn15 >=", value, "datacolumn15");
            return (Criteria) this;
        }

        public Criteria andDatacolumn15LessThan(String value) {
            addCriterion("DataColumn15 <", value, "datacolumn15");
            return (Criteria) this;
        }

        public Criteria andDatacolumn15LessThanOrEqualTo(String value) {
            addCriterion("DataColumn15 <=", value, "datacolumn15");
            return (Criteria) this;
        }

        public Criteria andDatacolumn15Like(String value) {
            addCriterion("DataColumn15 like", value, "datacolumn15");
            return (Criteria) this;
        }

        public Criteria andDatacolumn15NotLike(String value) {
            addCriterion("DataColumn15 not like", value, "datacolumn15");
            return (Criteria) this;
        }

        public Criteria andDatacolumn15In(List<String> values) {
            addCriterion("DataColumn15 in", values, "datacolumn15");
            return (Criteria) this;
        }

        public Criteria andDatacolumn15NotIn(List<String> values) {
            addCriterion("DataColumn15 not in", values, "datacolumn15");
            return (Criteria) this;
        }

        public Criteria andDatacolumn15Between(String value1, String value2) {
            addCriterion("DataColumn15 between", value1, value2, "datacolumn15");
            return (Criteria) this;
        }

        public Criteria andDatacolumn15NotBetween(String value1, String value2) {
            addCriterion("DataColumn15 not between", value1, value2, "datacolumn15");
            return (Criteria) this;
        }

        public Criteria andDatacolumn16IsNull() {
            addCriterion("DataColumn16 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn16IsNotNull() {
            addCriterion("DataColumn16 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn16EqualTo(String value) {
            addCriterion("DataColumn16 =", value, "datacolumn16");
            return (Criteria) this;
        }

        public Criteria andDatacolumn16NotEqualTo(String value) {
            addCriterion("DataColumn16 <>", value, "datacolumn16");
            return (Criteria) this;
        }

        public Criteria andDatacolumn16GreaterThan(String value) {
            addCriterion("DataColumn16 >", value, "datacolumn16");
            return (Criteria) this;
        }

        public Criteria andDatacolumn16GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn16 >=", value, "datacolumn16");
            return (Criteria) this;
        }

        public Criteria andDatacolumn16LessThan(String value) {
            addCriterion("DataColumn16 <", value, "datacolumn16");
            return (Criteria) this;
        }

        public Criteria andDatacolumn16LessThanOrEqualTo(String value) {
            addCriterion("DataColumn16 <=", value, "datacolumn16");
            return (Criteria) this;
        }

        public Criteria andDatacolumn16Like(String value) {
            addCriterion("DataColumn16 like", value, "datacolumn16");
            return (Criteria) this;
        }

        public Criteria andDatacolumn16NotLike(String value) {
            addCriterion("DataColumn16 not like", value, "datacolumn16");
            return (Criteria) this;
        }

        public Criteria andDatacolumn16In(List<String> values) {
            addCriterion("DataColumn16 in", values, "datacolumn16");
            return (Criteria) this;
        }

        public Criteria andDatacolumn16NotIn(List<String> values) {
            addCriterion("DataColumn16 not in", values, "datacolumn16");
            return (Criteria) this;
        }

        public Criteria andDatacolumn16Between(String value1, String value2) {
            addCriterion("DataColumn16 between", value1, value2, "datacolumn16");
            return (Criteria) this;
        }

        public Criteria andDatacolumn16NotBetween(String value1, String value2) {
            addCriterion("DataColumn16 not between", value1, value2, "datacolumn16");
            return (Criteria) this;
        }

        public Criteria andDatacolumn17IsNull() {
            addCriterion("DataColumn17 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn17IsNotNull() {
            addCriterion("DataColumn17 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn17EqualTo(String value) {
            addCriterion("DataColumn17 =", value, "datacolumn17");
            return (Criteria) this;
        }

        public Criteria andDatacolumn17NotEqualTo(String value) {
            addCriterion("DataColumn17 <>", value, "datacolumn17");
            return (Criteria) this;
        }

        public Criteria andDatacolumn17GreaterThan(String value) {
            addCriterion("DataColumn17 >", value, "datacolumn17");
            return (Criteria) this;
        }

        public Criteria andDatacolumn17GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn17 >=", value, "datacolumn17");
            return (Criteria) this;
        }

        public Criteria andDatacolumn17LessThan(String value) {
            addCriterion("DataColumn17 <", value, "datacolumn17");
            return (Criteria) this;
        }

        public Criteria andDatacolumn17LessThanOrEqualTo(String value) {
            addCriterion("DataColumn17 <=", value, "datacolumn17");
            return (Criteria) this;
        }

        public Criteria andDatacolumn17Like(String value) {
            addCriterion("DataColumn17 like", value, "datacolumn17");
            return (Criteria) this;
        }

        public Criteria andDatacolumn17NotLike(String value) {
            addCriterion("DataColumn17 not like", value, "datacolumn17");
            return (Criteria) this;
        }

        public Criteria andDatacolumn17In(List<String> values) {
            addCriterion("DataColumn17 in", values, "datacolumn17");
            return (Criteria) this;
        }

        public Criteria andDatacolumn17NotIn(List<String> values) {
            addCriterion("DataColumn17 not in", values, "datacolumn17");
            return (Criteria) this;
        }

        public Criteria andDatacolumn17Between(String value1, String value2) {
            addCriterion("DataColumn17 between", value1, value2, "datacolumn17");
            return (Criteria) this;
        }

        public Criteria andDatacolumn17NotBetween(String value1, String value2) {
            addCriterion("DataColumn17 not between", value1, value2, "datacolumn17");
            return (Criteria) this;
        }

        public Criteria andDatacolumn18IsNull() {
            addCriterion("DataColumn18 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn18IsNotNull() {
            addCriterion("DataColumn18 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn18EqualTo(String value) {
            addCriterion("DataColumn18 =", value, "datacolumn18");
            return (Criteria) this;
        }

        public Criteria andDatacolumn18NotEqualTo(String value) {
            addCriterion("DataColumn18 <>", value, "datacolumn18");
            return (Criteria) this;
        }

        public Criteria andDatacolumn18GreaterThan(String value) {
            addCriterion("DataColumn18 >", value, "datacolumn18");
            return (Criteria) this;
        }

        public Criteria andDatacolumn18GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn18 >=", value, "datacolumn18");
            return (Criteria) this;
        }

        public Criteria andDatacolumn18LessThan(String value) {
            addCriterion("DataColumn18 <", value, "datacolumn18");
            return (Criteria) this;
        }

        public Criteria andDatacolumn18LessThanOrEqualTo(String value) {
            addCriterion("DataColumn18 <=", value, "datacolumn18");
            return (Criteria) this;
        }

        public Criteria andDatacolumn18Like(String value) {
            addCriterion("DataColumn18 like", value, "datacolumn18");
            return (Criteria) this;
        }

        public Criteria andDatacolumn18NotLike(String value) {
            addCriterion("DataColumn18 not like", value, "datacolumn18");
            return (Criteria) this;
        }

        public Criteria andDatacolumn18In(List<String> values) {
            addCriterion("DataColumn18 in", values, "datacolumn18");
            return (Criteria) this;
        }

        public Criteria andDatacolumn18NotIn(List<String> values) {
            addCriterion("DataColumn18 not in", values, "datacolumn18");
            return (Criteria) this;
        }

        public Criteria andDatacolumn18Between(String value1, String value2) {
            addCriterion("DataColumn18 between", value1, value2, "datacolumn18");
            return (Criteria) this;
        }

        public Criteria andDatacolumn18NotBetween(String value1, String value2) {
            addCriterion("DataColumn18 not between", value1, value2, "datacolumn18");
            return (Criteria) this;
        }

        public Criteria andDatacolumn19IsNull() {
            addCriterion("DataColumn19 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn19IsNotNull() {
            addCriterion("DataColumn19 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn19EqualTo(String value) {
            addCriterion("DataColumn19 =", value, "datacolumn19");
            return (Criteria) this;
        }

        public Criteria andDatacolumn19NotEqualTo(String value) {
            addCriterion("DataColumn19 <>", value, "datacolumn19");
            return (Criteria) this;
        }

        public Criteria andDatacolumn19GreaterThan(String value) {
            addCriterion("DataColumn19 >", value, "datacolumn19");
            return (Criteria) this;
        }

        public Criteria andDatacolumn19GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn19 >=", value, "datacolumn19");
            return (Criteria) this;
        }

        public Criteria andDatacolumn19LessThan(String value) {
            addCriterion("DataColumn19 <", value, "datacolumn19");
            return (Criteria) this;
        }

        public Criteria andDatacolumn19LessThanOrEqualTo(String value) {
            addCriterion("DataColumn19 <=", value, "datacolumn19");
            return (Criteria) this;
        }

        public Criteria andDatacolumn19Like(String value) {
            addCriterion("DataColumn19 like", value, "datacolumn19");
            return (Criteria) this;
        }

        public Criteria andDatacolumn19NotLike(String value) {
            addCriterion("DataColumn19 not like", value, "datacolumn19");
            return (Criteria) this;
        }

        public Criteria andDatacolumn19In(List<String> values) {
            addCriterion("DataColumn19 in", values, "datacolumn19");
            return (Criteria) this;
        }

        public Criteria andDatacolumn19NotIn(List<String> values) {
            addCriterion("DataColumn19 not in", values, "datacolumn19");
            return (Criteria) this;
        }

        public Criteria andDatacolumn19Between(String value1, String value2) {
            addCriterion("DataColumn19 between", value1, value2, "datacolumn19");
            return (Criteria) this;
        }

        public Criteria andDatacolumn19NotBetween(String value1, String value2) {
            addCriterion("DataColumn19 not between", value1, value2, "datacolumn19");
            return (Criteria) this;
        }

        public Criteria andDatacolumn20IsNull() {
            addCriterion("DataColumn20 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn20IsNotNull() {
            addCriterion("DataColumn20 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn20EqualTo(String value) {
            addCriterion("DataColumn20 =", value, "datacolumn20");
            return (Criteria) this;
        }

        public Criteria andDatacolumn20NotEqualTo(String value) {
            addCriterion("DataColumn20 <>", value, "datacolumn20");
            return (Criteria) this;
        }

        public Criteria andDatacolumn20GreaterThan(String value) {
            addCriterion("DataColumn20 >", value, "datacolumn20");
            return (Criteria) this;
        }

        public Criteria andDatacolumn20GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn20 >=", value, "datacolumn20");
            return (Criteria) this;
        }

        public Criteria andDatacolumn20LessThan(String value) {
            addCriterion("DataColumn20 <", value, "datacolumn20");
            return (Criteria) this;
        }

        public Criteria andDatacolumn20LessThanOrEqualTo(String value) {
            addCriterion("DataColumn20 <=", value, "datacolumn20");
            return (Criteria) this;
        }

        public Criteria andDatacolumn20Like(String value) {
            addCriterion("DataColumn20 like", value, "datacolumn20");
            return (Criteria) this;
        }

        public Criteria andDatacolumn20NotLike(String value) {
            addCriterion("DataColumn20 not like", value, "datacolumn20");
            return (Criteria) this;
        }

        public Criteria andDatacolumn20In(List<String> values) {
            addCriterion("DataColumn20 in", values, "datacolumn20");
            return (Criteria) this;
        }

        public Criteria andDatacolumn20NotIn(List<String> values) {
            addCriterion("DataColumn20 not in", values, "datacolumn20");
            return (Criteria) this;
        }

        public Criteria andDatacolumn20Between(String value1, String value2) {
            addCriterion("DataColumn20 between", value1, value2, "datacolumn20");
            return (Criteria) this;
        }

        public Criteria andDatacolumn20NotBetween(String value1, String value2) {
            addCriterion("DataColumn20 not between", value1, value2, "datacolumn20");
            return (Criteria) this;
        }

        public Criteria andDatacolumn21IsNull() {
            addCriterion("DataColumn21 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn21IsNotNull() {
            addCriterion("DataColumn21 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn21EqualTo(String value) {
            addCriterion("DataColumn21 =", value, "datacolumn21");
            return (Criteria) this;
        }

        public Criteria andDatacolumn21NotEqualTo(String value) {
            addCriterion("DataColumn21 <>", value, "datacolumn21");
            return (Criteria) this;
        }

        public Criteria andDatacolumn21GreaterThan(String value) {
            addCriterion("DataColumn21 >", value, "datacolumn21");
            return (Criteria) this;
        }

        public Criteria andDatacolumn21GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn21 >=", value, "datacolumn21");
            return (Criteria) this;
        }

        public Criteria andDatacolumn21LessThan(String value) {
            addCriterion("DataColumn21 <", value, "datacolumn21");
            return (Criteria) this;
        }

        public Criteria andDatacolumn21LessThanOrEqualTo(String value) {
            addCriterion("DataColumn21 <=", value, "datacolumn21");
            return (Criteria) this;
        }

        public Criteria andDatacolumn21Like(String value) {
            addCriterion("DataColumn21 like", value, "datacolumn21");
            return (Criteria) this;
        }

        public Criteria andDatacolumn21NotLike(String value) {
            addCriterion("DataColumn21 not like", value, "datacolumn21");
            return (Criteria) this;
        }

        public Criteria andDatacolumn21In(List<String> values) {
            addCriterion("DataColumn21 in", values, "datacolumn21");
            return (Criteria) this;
        }

        public Criteria andDatacolumn21NotIn(List<String> values) {
            addCriterion("DataColumn21 not in", values, "datacolumn21");
            return (Criteria) this;
        }

        public Criteria andDatacolumn21Between(String value1, String value2) {
            addCriterion("DataColumn21 between", value1, value2, "datacolumn21");
            return (Criteria) this;
        }

        public Criteria andDatacolumn21NotBetween(String value1, String value2) {
            addCriterion("DataColumn21 not between", value1, value2, "datacolumn21");
            return (Criteria) this;
        }

        public Criteria andDatacolumn22IsNull() {
            addCriterion("DataColumn22 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn22IsNotNull() {
            addCriterion("DataColumn22 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn22EqualTo(String value) {
            addCriterion("DataColumn22 =", value, "datacolumn22");
            return (Criteria) this;
        }

        public Criteria andDatacolumn22NotEqualTo(String value) {
            addCriterion("DataColumn22 <>", value, "datacolumn22");
            return (Criteria) this;
        }

        public Criteria andDatacolumn22GreaterThan(String value) {
            addCriterion("DataColumn22 >", value, "datacolumn22");
            return (Criteria) this;
        }

        public Criteria andDatacolumn22GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn22 >=", value, "datacolumn22");
            return (Criteria) this;
        }

        public Criteria andDatacolumn22LessThan(String value) {
            addCriterion("DataColumn22 <", value, "datacolumn22");
            return (Criteria) this;
        }

        public Criteria andDatacolumn22LessThanOrEqualTo(String value) {
            addCriterion("DataColumn22 <=", value, "datacolumn22");
            return (Criteria) this;
        }

        public Criteria andDatacolumn22Like(String value) {
            addCriterion("DataColumn22 like", value, "datacolumn22");
            return (Criteria) this;
        }

        public Criteria andDatacolumn22NotLike(String value) {
            addCriterion("DataColumn22 not like", value, "datacolumn22");
            return (Criteria) this;
        }

        public Criteria andDatacolumn22In(List<String> values) {
            addCriterion("DataColumn22 in", values, "datacolumn22");
            return (Criteria) this;
        }

        public Criteria andDatacolumn22NotIn(List<String> values) {
            addCriterion("DataColumn22 not in", values, "datacolumn22");
            return (Criteria) this;
        }

        public Criteria andDatacolumn22Between(String value1, String value2) {
            addCriterion("DataColumn22 between", value1, value2, "datacolumn22");
            return (Criteria) this;
        }

        public Criteria andDatacolumn22NotBetween(String value1, String value2) {
            addCriterion("DataColumn22 not between", value1, value2, "datacolumn22");
            return (Criteria) this;
        }

        public Criteria andDatacolumn23IsNull() {
            addCriterion("DataColumn23 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn23IsNotNull() {
            addCriterion("DataColumn23 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn23EqualTo(String value) {
            addCriterion("DataColumn23 =", value, "datacolumn23");
            return (Criteria) this;
        }

        public Criteria andDatacolumn23NotEqualTo(String value) {
            addCriterion("DataColumn23 <>", value, "datacolumn23");
            return (Criteria) this;
        }

        public Criteria andDatacolumn23GreaterThan(String value) {
            addCriterion("DataColumn23 >", value, "datacolumn23");
            return (Criteria) this;
        }

        public Criteria andDatacolumn23GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn23 >=", value, "datacolumn23");
            return (Criteria) this;
        }

        public Criteria andDatacolumn23LessThan(String value) {
            addCriterion("DataColumn23 <", value, "datacolumn23");
            return (Criteria) this;
        }

        public Criteria andDatacolumn23LessThanOrEqualTo(String value) {
            addCriterion("DataColumn23 <=", value, "datacolumn23");
            return (Criteria) this;
        }

        public Criteria andDatacolumn23Like(String value) {
            addCriterion("DataColumn23 like", value, "datacolumn23");
            return (Criteria) this;
        }

        public Criteria andDatacolumn23NotLike(String value) {
            addCriterion("DataColumn23 not like", value, "datacolumn23");
            return (Criteria) this;
        }

        public Criteria andDatacolumn23In(List<String> values) {
            addCriterion("DataColumn23 in", values, "datacolumn23");
            return (Criteria) this;
        }

        public Criteria andDatacolumn23NotIn(List<String> values) {
            addCriterion("DataColumn23 not in", values, "datacolumn23");
            return (Criteria) this;
        }

        public Criteria andDatacolumn23Between(String value1, String value2) {
            addCriterion("DataColumn23 between", value1, value2, "datacolumn23");
            return (Criteria) this;
        }

        public Criteria andDatacolumn23NotBetween(String value1, String value2) {
            addCriterion("DataColumn23 not between", value1, value2, "datacolumn23");
            return (Criteria) this;
        }

        public Criteria andDatacolumn24IsNull() {
            addCriterion("DataColumn24 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn24IsNotNull() {
            addCriterion("DataColumn24 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn24EqualTo(String value) {
            addCriterion("DataColumn24 =", value, "datacolumn24");
            return (Criteria) this;
        }

        public Criteria andDatacolumn24NotEqualTo(String value) {
            addCriterion("DataColumn24 <>", value, "datacolumn24");
            return (Criteria) this;
        }

        public Criteria andDatacolumn24GreaterThan(String value) {
            addCriterion("DataColumn24 >", value, "datacolumn24");
            return (Criteria) this;
        }

        public Criteria andDatacolumn24GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn24 >=", value, "datacolumn24");
            return (Criteria) this;
        }

        public Criteria andDatacolumn24LessThan(String value) {
            addCriterion("DataColumn24 <", value, "datacolumn24");
            return (Criteria) this;
        }

        public Criteria andDatacolumn24LessThanOrEqualTo(String value) {
            addCriterion("DataColumn24 <=", value, "datacolumn24");
            return (Criteria) this;
        }

        public Criteria andDatacolumn24Like(String value) {
            addCriterion("DataColumn24 like", value, "datacolumn24");
            return (Criteria) this;
        }

        public Criteria andDatacolumn24NotLike(String value) {
            addCriterion("DataColumn24 not like", value, "datacolumn24");
            return (Criteria) this;
        }

        public Criteria andDatacolumn24In(List<String> values) {
            addCriterion("DataColumn24 in", values, "datacolumn24");
            return (Criteria) this;
        }

        public Criteria andDatacolumn24NotIn(List<String> values) {
            addCriterion("DataColumn24 not in", values, "datacolumn24");
            return (Criteria) this;
        }

        public Criteria andDatacolumn24Between(String value1, String value2) {
            addCriterion("DataColumn24 between", value1, value2, "datacolumn24");
            return (Criteria) this;
        }

        public Criteria andDatacolumn24NotBetween(String value1, String value2) {
            addCriterion("DataColumn24 not between", value1, value2, "datacolumn24");
            return (Criteria) this;
        }

        public Criteria andDatacolumn25IsNull() {
            addCriterion("DataColumn25 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn25IsNotNull() {
            addCriterion("DataColumn25 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn25EqualTo(String value) {
            addCriterion("DataColumn25 =", value, "datacolumn25");
            return (Criteria) this;
        }

        public Criteria andDatacolumn25NotEqualTo(String value) {
            addCriterion("DataColumn25 <>", value, "datacolumn25");
            return (Criteria) this;
        }

        public Criteria andDatacolumn25GreaterThan(String value) {
            addCriterion("DataColumn25 >", value, "datacolumn25");
            return (Criteria) this;
        }

        public Criteria andDatacolumn25GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn25 >=", value, "datacolumn25");
            return (Criteria) this;
        }

        public Criteria andDatacolumn25LessThan(String value) {
            addCriterion("DataColumn25 <", value, "datacolumn25");
            return (Criteria) this;
        }

        public Criteria andDatacolumn25LessThanOrEqualTo(String value) {
            addCriterion("DataColumn25 <=", value, "datacolumn25");
            return (Criteria) this;
        }

        public Criteria andDatacolumn25Like(String value) {
            addCriterion("DataColumn25 like", value, "datacolumn25");
            return (Criteria) this;
        }

        public Criteria andDatacolumn25NotLike(String value) {
            addCriterion("DataColumn25 not like", value, "datacolumn25");
            return (Criteria) this;
        }

        public Criteria andDatacolumn25In(List<String> values) {
            addCriterion("DataColumn25 in", values, "datacolumn25");
            return (Criteria) this;
        }

        public Criteria andDatacolumn25NotIn(List<String> values) {
            addCriterion("DataColumn25 not in", values, "datacolumn25");
            return (Criteria) this;
        }

        public Criteria andDatacolumn25Between(String value1, String value2) {
            addCriterion("DataColumn25 between", value1, value2, "datacolumn25");
            return (Criteria) this;
        }

        public Criteria andDatacolumn25NotBetween(String value1, String value2) {
            addCriterion("DataColumn25 not between", value1, value2, "datacolumn25");
            return (Criteria) this;
        }

        public Criteria andDatacolumn26IsNull() {
            addCriterion("DataColumn26 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn26IsNotNull() {
            addCriterion("DataColumn26 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn26EqualTo(String value) {
            addCriterion("DataColumn26 =", value, "datacolumn26");
            return (Criteria) this;
        }

        public Criteria andDatacolumn26NotEqualTo(String value) {
            addCriterion("DataColumn26 <>", value, "datacolumn26");
            return (Criteria) this;
        }

        public Criteria andDatacolumn26GreaterThan(String value) {
            addCriterion("DataColumn26 >", value, "datacolumn26");
            return (Criteria) this;
        }

        public Criteria andDatacolumn26GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn26 >=", value, "datacolumn26");
            return (Criteria) this;
        }

        public Criteria andDatacolumn26LessThan(String value) {
            addCriterion("DataColumn26 <", value, "datacolumn26");
            return (Criteria) this;
        }

        public Criteria andDatacolumn26LessThanOrEqualTo(String value) {
            addCriterion("DataColumn26 <=", value, "datacolumn26");
            return (Criteria) this;
        }

        public Criteria andDatacolumn26Like(String value) {
            addCriterion("DataColumn26 like", value, "datacolumn26");
            return (Criteria) this;
        }

        public Criteria andDatacolumn26NotLike(String value) {
            addCriterion("DataColumn26 not like", value, "datacolumn26");
            return (Criteria) this;
        }

        public Criteria andDatacolumn26In(List<String> values) {
            addCriterion("DataColumn26 in", values, "datacolumn26");
            return (Criteria) this;
        }

        public Criteria andDatacolumn26NotIn(List<String> values) {
            addCriterion("DataColumn26 not in", values, "datacolumn26");
            return (Criteria) this;
        }

        public Criteria andDatacolumn26Between(String value1, String value2) {
            addCriterion("DataColumn26 between", value1, value2, "datacolumn26");
            return (Criteria) this;
        }

        public Criteria andDatacolumn26NotBetween(String value1, String value2) {
            addCriterion("DataColumn26 not between", value1, value2, "datacolumn26");
            return (Criteria) this;
        }

        public Criteria andDatacolumn27IsNull() {
            addCriterion("DataColumn27 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn27IsNotNull() {
            addCriterion("DataColumn27 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn27EqualTo(String value) {
            addCriterion("DataColumn27 =", value, "datacolumn27");
            return (Criteria) this;
        }

        public Criteria andDatacolumn27NotEqualTo(String value) {
            addCriterion("DataColumn27 <>", value, "datacolumn27");
            return (Criteria) this;
        }

        public Criteria andDatacolumn27GreaterThan(String value) {
            addCriterion("DataColumn27 >", value, "datacolumn27");
            return (Criteria) this;
        }

        public Criteria andDatacolumn27GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn27 >=", value, "datacolumn27");
            return (Criteria) this;
        }

        public Criteria andDatacolumn27LessThan(String value) {
            addCriterion("DataColumn27 <", value, "datacolumn27");
            return (Criteria) this;
        }

        public Criteria andDatacolumn27LessThanOrEqualTo(String value) {
            addCriterion("DataColumn27 <=", value, "datacolumn27");
            return (Criteria) this;
        }

        public Criteria andDatacolumn27Like(String value) {
            addCriterion("DataColumn27 like", value, "datacolumn27");
            return (Criteria) this;
        }

        public Criteria andDatacolumn27NotLike(String value) {
            addCriterion("DataColumn27 not like", value, "datacolumn27");
            return (Criteria) this;
        }

        public Criteria andDatacolumn27In(List<String> values) {
            addCriterion("DataColumn27 in", values, "datacolumn27");
            return (Criteria) this;
        }

        public Criteria andDatacolumn27NotIn(List<String> values) {
            addCriterion("DataColumn27 not in", values, "datacolumn27");
            return (Criteria) this;
        }

        public Criteria andDatacolumn27Between(String value1, String value2) {
            addCriterion("DataColumn27 between", value1, value2, "datacolumn27");
            return (Criteria) this;
        }

        public Criteria andDatacolumn27NotBetween(String value1, String value2) {
            addCriterion("DataColumn27 not between", value1, value2, "datacolumn27");
            return (Criteria) this;
        }

        public Criteria andDatacolumn28IsNull() {
            addCriterion("DataColumn28 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn28IsNotNull() {
            addCriterion("DataColumn28 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn28EqualTo(String value) {
            addCriterion("DataColumn28 =", value, "datacolumn28");
            return (Criteria) this;
        }

        public Criteria andDatacolumn28NotEqualTo(String value) {
            addCriterion("DataColumn28 <>", value, "datacolumn28");
            return (Criteria) this;
        }

        public Criteria andDatacolumn28GreaterThan(String value) {
            addCriterion("DataColumn28 >", value, "datacolumn28");
            return (Criteria) this;
        }

        public Criteria andDatacolumn28GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn28 >=", value, "datacolumn28");
            return (Criteria) this;
        }

        public Criteria andDatacolumn28LessThan(String value) {
            addCriterion("DataColumn28 <", value, "datacolumn28");
            return (Criteria) this;
        }

        public Criteria andDatacolumn28LessThanOrEqualTo(String value) {
            addCriterion("DataColumn28 <=", value, "datacolumn28");
            return (Criteria) this;
        }

        public Criteria andDatacolumn28Like(String value) {
            addCriterion("DataColumn28 like", value, "datacolumn28");
            return (Criteria) this;
        }

        public Criteria andDatacolumn28NotLike(String value) {
            addCriterion("DataColumn28 not like", value, "datacolumn28");
            return (Criteria) this;
        }

        public Criteria andDatacolumn28In(List<String> values) {
            addCriterion("DataColumn28 in", values, "datacolumn28");
            return (Criteria) this;
        }

        public Criteria andDatacolumn28NotIn(List<String> values) {
            addCriterion("DataColumn28 not in", values, "datacolumn28");
            return (Criteria) this;
        }

        public Criteria andDatacolumn28Between(String value1, String value2) {
            addCriterion("DataColumn28 between", value1, value2, "datacolumn28");
            return (Criteria) this;
        }

        public Criteria andDatacolumn28NotBetween(String value1, String value2) {
            addCriterion("DataColumn28 not between", value1, value2, "datacolumn28");
            return (Criteria) this;
        }

        public Criteria andDatacolumn29IsNull() {
            addCriterion("DataColumn29 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn29IsNotNull() {
            addCriterion("DataColumn29 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn29EqualTo(String value) {
            addCriterion("DataColumn29 =", value, "datacolumn29");
            return (Criteria) this;
        }

        public Criteria andDatacolumn29NotEqualTo(String value) {
            addCriterion("DataColumn29 <>", value, "datacolumn29");
            return (Criteria) this;
        }

        public Criteria andDatacolumn29GreaterThan(String value) {
            addCriterion("DataColumn29 >", value, "datacolumn29");
            return (Criteria) this;
        }

        public Criteria andDatacolumn29GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn29 >=", value, "datacolumn29");
            return (Criteria) this;
        }

        public Criteria andDatacolumn29LessThan(String value) {
            addCriterion("DataColumn29 <", value, "datacolumn29");
            return (Criteria) this;
        }

        public Criteria andDatacolumn29LessThanOrEqualTo(String value) {
            addCriterion("DataColumn29 <=", value, "datacolumn29");
            return (Criteria) this;
        }

        public Criteria andDatacolumn29Like(String value) {
            addCriterion("DataColumn29 like", value, "datacolumn29");
            return (Criteria) this;
        }

        public Criteria andDatacolumn29NotLike(String value) {
            addCriterion("DataColumn29 not like", value, "datacolumn29");
            return (Criteria) this;
        }

        public Criteria andDatacolumn29In(List<String> values) {
            addCriterion("DataColumn29 in", values, "datacolumn29");
            return (Criteria) this;
        }

        public Criteria andDatacolumn29NotIn(List<String> values) {
            addCriterion("DataColumn29 not in", values, "datacolumn29");
            return (Criteria) this;
        }

        public Criteria andDatacolumn29Between(String value1, String value2) {
            addCriterion("DataColumn29 between", value1, value2, "datacolumn29");
            return (Criteria) this;
        }

        public Criteria andDatacolumn29NotBetween(String value1, String value2) {
            addCriterion("DataColumn29 not between", value1, value2, "datacolumn29");
            return (Criteria) this;
        }

        public Criteria andDatacolumn30IsNull() {
            addCriterion("DataColumn30 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn30IsNotNull() {
            addCriterion("DataColumn30 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn30EqualTo(String value) {
            addCriterion("DataColumn30 =", value, "datacolumn30");
            return (Criteria) this;
        }

        public Criteria andDatacolumn30NotEqualTo(String value) {
            addCriterion("DataColumn30 <>", value, "datacolumn30");
            return (Criteria) this;
        }

        public Criteria andDatacolumn30GreaterThan(String value) {
            addCriterion("DataColumn30 >", value, "datacolumn30");
            return (Criteria) this;
        }

        public Criteria andDatacolumn30GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn30 >=", value, "datacolumn30");
            return (Criteria) this;
        }

        public Criteria andDatacolumn30LessThan(String value) {
            addCriterion("DataColumn30 <", value, "datacolumn30");
            return (Criteria) this;
        }

        public Criteria andDatacolumn30LessThanOrEqualTo(String value) {
            addCriterion("DataColumn30 <=", value, "datacolumn30");
            return (Criteria) this;
        }

        public Criteria andDatacolumn30Like(String value) {
            addCriterion("DataColumn30 like", value, "datacolumn30");
            return (Criteria) this;
        }

        public Criteria andDatacolumn30NotLike(String value) {
            addCriterion("DataColumn30 not like", value, "datacolumn30");
            return (Criteria) this;
        }

        public Criteria andDatacolumn30In(List<String> values) {
            addCriterion("DataColumn30 in", values, "datacolumn30");
            return (Criteria) this;
        }

        public Criteria andDatacolumn30NotIn(List<String> values) {
            addCriterion("DataColumn30 not in", values, "datacolumn30");
            return (Criteria) this;
        }

        public Criteria andDatacolumn30Between(String value1, String value2) {
            addCriterion("DataColumn30 between", value1, value2, "datacolumn30");
            return (Criteria) this;
        }

        public Criteria andDatacolumn30NotBetween(String value1, String value2) {
            addCriterion("DataColumn30 not between", value1, value2, "datacolumn30");
            return (Criteria) this;
        }

        public Criteria andDatacolumn31IsNull() {
            addCriterion("DataColumn31 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn31IsNotNull() {
            addCriterion("DataColumn31 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn31EqualTo(String value) {
            addCriterion("DataColumn31 =", value, "datacolumn31");
            return (Criteria) this;
        }

        public Criteria andDatacolumn31NotEqualTo(String value) {
            addCriterion("DataColumn31 <>", value, "datacolumn31");
            return (Criteria) this;
        }

        public Criteria andDatacolumn31GreaterThan(String value) {
            addCriterion("DataColumn31 >", value, "datacolumn31");
            return (Criteria) this;
        }

        public Criteria andDatacolumn31GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn31 >=", value, "datacolumn31");
            return (Criteria) this;
        }

        public Criteria andDatacolumn31LessThan(String value) {
            addCriterion("DataColumn31 <", value, "datacolumn31");
            return (Criteria) this;
        }

        public Criteria andDatacolumn31LessThanOrEqualTo(String value) {
            addCriterion("DataColumn31 <=", value, "datacolumn31");
            return (Criteria) this;
        }

        public Criteria andDatacolumn31Like(String value) {
            addCriterion("DataColumn31 like", value, "datacolumn31");
            return (Criteria) this;
        }

        public Criteria andDatacolumn31NotLike(String value) {
            addCriterion("DataColumn31 not like", value, "datacolumn31");
            return (Criteria) this;
        }

        public Criteria andDatacolumn31In(List<String> values) {
            addCriterion("DataColumn31 in", values, "datacolumn31");
            return (Criteria) this;
        }

        public Criteria andDatacolumn31NotIn(List<String> values) {
            addCriterion("DataColumn31 not in", values, "datacolumn31");
            return (Criteria) this;
        }

        public Criteria andDatacolumn31Between(String value1, String value2) {
            addCriterion("DataColumn31 between", value1, value2, "datacolumn31");
            return (Criteria) this;
        }

        public Criteria andDatacolumn31NotBetween(String value1, String value2) {
            addCriterion("DataColumn31 not between", value1, value2, "datacolumn31");
            return (Criteria) this;
        }

        public Criteria andDatacolumn32IsNull() {
            addCriterion("DataColumn32 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn32IsNotNull() {
            addCriterion("DataColumn32 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn32EqualTo(String value) {
            addCriterion("DataColumn32 =", value, "datacolumn32");
            return (Criteria) this;
        }

        public Criteria andDatacolumn32NotEqualTo(String value) {
            addCriterion("DataColumn32 <>", value, "datacolumn32");
            return (Criteria) this;
        }

        public Criteria andDatacolumn32GreaterThan(String value) {
            addCriterion("DataColumn32 >", value, "datacolumn32");
            return (Criteria) this;
        }

        public Criteria andDatacolumn32GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn32 >=", value, "datacolumn32");
            return (Criteria) this;
        }

        public Criteria andDatacolumn32LessThan(String value) {
            addCriterion("DataColumn32 <", value, "datacolumn32");
            return (Criteria) this;
        }

        public Criteria andDatacolumn32LessThanOrEqualTo(String value) {
            addCriterion("DataColumn32 <=", value, "datacolumn32");
            return (Criteria) this;
        }

        public Criteria andDatacolumn32Like(String value) {
            addCriterion("DataColumn32 like", value, "datacolumn32");
            return (Criteria) this;
        }

        public Criteria andDatacolumn32NotLike(String value) {
            addCriterion("DataColumn32 not like", value, "datacolumn32");
            return (Criteria) this;
        }

        public Criteria andDatacolumn32In(List<String> values) {
            addCriterion("DataColumn32 in", values, "datacolumn32");
            return (Criteria) this;
        }

        public Criteria andDatacolumn32NotIn(List<String> values) {
            addCriterion("DataColumn32 not in", values, "datacolumn32");
            return (Criteria) this;
        }

        public Criteria andDatacolumn32Between(String value1, String value2) {
            addCriterion("DataColumn32 between", value1, value2, "datacolumn32");
            return (Criteria) this;
        }

        public Criteria andDatacolumn32NotBetween(String value1, String value2) {
            addCriterion("DataColumn32 not between", value1, value2, "datacolumn32");
            return (Criteria) this;
        }

        public Criteria andDatacolumn33IsNull() {
            addCriterion("DataColumn33 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn33IsNotNull() {
            addCriterion("DataColumn33 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn33EqualTo(String value) {
            addCriterion("DataColumn33 =", value, "datacolumn33");
            return (Criteria) this;
        }

        public Criteria andDatacolumn33NotEqualTo(String value) {
            addCriterion("DataColumn33 <>", value, "datacolumn33");
            return (Criteria) this;
        }

        public Criteria andDatacolumn33GreaterThan(String value) {
            addCriterion("DataColumn33 >", value, "datacolumn33");
            return (Criteria) this;
        }

        public Criteria andDatacolumn33GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn33 >=", value, "datacolumn33");
            return (Criteria) this;
        }

        public Criteria andDatacolumn33LessThan(String value) {
            addCriterion("DataColumn33 <", value, "datacolumn33");
            return (Criteria) this;
        }

        public Criteria andDatacolumn33LessThanOrEqualTo(String value) {
            addCriterion("DataColumn33 <=", value, "datacolumn33");
            return (Criteria) this;
        }

        public Criteria andDatacolumn33Like(String value) {
            addCriterion("DataColumn33 like", value, "datacolumn33");
            return (Criteria) this;
        }

        public Criteria andDatacolumn33NotLike(String value) {
            addCriterion("DataColumn33 not like", value, "datacolumn33");
            return (Criteria) this;
        }

        public Criteria andDatacolumn33In(List<String> values) {
            addCriterion("DataColumn33 in", values, "datacolumn33");
            return (Criteria) this;
        }

        public Criteria andDatacolumn33NotIn(List<String> values) {
            addCriterion("DataColumn33 not in", values, "datacolumn33");
            return (Criteria) this;
        }

        public Criteria andDatacolumn33Between(String value1, String value2) {
            addCriterion("DataColumn33 between", value1, value2, "datacolumn33");
            return (Criteria) this;
        }

        public Criteria andDatacolumn33NotBetween(String value1, String value2) {
            addCriterion("DataColumn33 not between", value1, value2, "datacolumn33");
            return (Criteria) this;
        }

        public Criteria andDatacolumn34IsNull() {
            addCriterion("DataColumn34 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn34IsNotNull() {
            addCriterion("DataColumn34 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn34EqualTo(String value) {
            addCriterion("DataColumn34 =", value, "datacolumn34");
            return (Criteria) this;
        }

        public Criteria andDatacolumn34NotEqualTo(String value) {
            addCriterion("DataColumn34 <>", value, "datacolumn34");
            return (Criteria) this;
        }

        public Criteria andDatacolumn34GreaterThan(String value) {
            addCriterion("DataColumn34 >", value, "datacolumn34");
            return (Criteria) this;
        }

        public Criteria andDatacolumn34GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn34 >=", value, "datacolumn34");
            return (Criteria) this;
        }

        public Criteria andDatacolumn34LessThan(String value) {
            addCriterion("DataColumn34 <", value, "datacolumn34");
            return (Criteria) this;
        }

        public Criteria andDatacolumn34LessThanOrEqualTo(String value) {
            addCriterion("DataColumn34 <=", value, "datacolumn34");
            return (Criteria) this;
        }

        public Criteria andDatacolumn34Like(String value) {
            addCriterion("DataColumn34 like", value, "datacolumn34");
            return (Criteria) this;
        }

        public Criteria andDatacolumn34NotLike(String value) {
            addCriterion("DataColumn34 not like", value, "datacolumn34");
            return (Criteria) this;
        }

        public Criteria andDatacolumn34In(List<String> values) {
            addCriterion("DataColumn34 in", values, "datacolumn34");
            return (Criteria) this;
        }

        public Criteria andDatacolumn34NotIn(List<String> values) {
            addCriterion("DataColumn34 not in", values, "datacolumn34");
            return (Criteria) this;
        }

        public Criteria andDatacolumn34Between(String value1, String value2) {
            addCriterion("DataColumn34 between", value1, value2, "datacolumn34");
            return (Criteria) this;
        }

        public Criteria andDatacolumn34NotBetween(String value1, String value2) {
            addCriterion("DataColumn34 not between", value1, value2, "datacolumn34");
            return (Criteria) this;
        }

        public Criteria andDatacolumn35IsNull() {
            addCriterion("DataColumn35 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn35IsNotNull() {
            addCriterion("DataColumn35 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn35EqualTo(String value) {
            addCriterion("DataColumn35 =", value, "datacolumn35");
            return (Criteria) this;
        }

        public Criteria andDatacolumn35NotEqualTo(String value) {
            addCriterion("DataColumn35 <>", value, "datacolumn35");
            return (Criteria) this;
        }

        public Criteria andDatacolumn35GreaterThan(String value) {
            addCriterion("DataColumn35 >", value, "datacolumn35");
            return (Criteria) this;
        }

        public Criteria andDatacolumn35GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn35 >=", value, "datacolumn35");
            return (Criteria) this;
        }

        public Criteria andDatacolumn35LessThan(String value) {
            addCriterion("DataColumn35 <", value, "datacolumn35");
            return (Criteria) this;
        }

        public Criteria andDatacolumn35LessThanOrEqualTo(String value) {
            addCriterion("DataColumn35 <=", value, "datacolumn35");
            return (Criteria) this;
        }

        public Criteria andDatacolumn35Like(String value) {
            addCriterion("DataColumn35 like", value, "datacolumn35");
            return (Criteria) this;
        }

        public Criteria andDatacolumn35NotLike(String value) {
            addCriterion("DataColumn35 not like", value, "datacolumn35");
            return (Criteria) this;
        }

        public Criteria andDatacolumn35In(List<String> values) {
            addCriterion("DataColumn35 in", values, "datacolumn35");
            return (Criteria) this;
        }

        public Criteria andDatacolumn35NotIn(List<String> values) {
            addCriterion("DataColumn35 not in", values, "datacolumn35");
            return (Criteria) this;
        }

        public Criteria andDatacolumn35Between(String value1, String value2) {
            addCriterion("DataColumn35 between", value1, value2, "datacolumn35");
            return (Criteria) this;
        }

        public Criteria andDatacolumn35NotBetween(String value1, String value2) {
            addCriterion("DataColumn35 not between", value1, value2, "datacolumn35");
            return (Criteria) this;
        }

        public Criteria andDatacolumn36IsNull() {
            addCriterion("DataColumn36 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn36IsNotNull() {
            addCriterion("DataColumn36 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn36EqualTo(String value) {
            addCriterion("DataColumn36 =", value, "datacolumn36");
            return (Criteria) this;
        }

        public Criteria andDatacolumn36NotEqualTo(String value) {
            addCriterion("DataColumn36 <>", value, "datacolumn36");
            return (Criteria) this;
        }

        public Criteria andDatacolumn36GreaterThan(String value) {
            addCriterion("DataColumn36 >", value, "datacolumn36");
            return (Criteria) this;
        }

        public Criteria andDatacolumn36GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn36 >=", value, "datacolumn36");
            return (Criteria) this;
        }

        public Criteria andDatacolumn36LessThan(String value) {
            addCriterion("DataColumn36 <", value, "datacolumn36");
            return (Criteria) this;
        }

        public Criteria andDatacolumn36LessThanOrEqualTo(String value) {
            addCriterion("DataColumn36 <=", value, "datacolumn36");
            return (Criteria) this;
        }

        public Criteria andDatacolumn36Like(String value) {
            addCriterion("DataColumn36 like", value, "datacolumn36");
            return (Criteria) this;
        }

        public Criteria andDatacolumn36NotLike(String value) {
            addCriterion("DataColumn36 not like", value, "datacolumn36");
            return (Criteria) this;
        }

        public Criteria andDatacolumn36In(List<String> values) {
            addCriterion("DataColumn36 in", values, "datacolumn36");
            return (Criteria) this;
        }

        public Criteria andDatacolumn36NotIn(List<String> values) {
            addCriterion("DataColumn36 not in", values, "datacolumn36");
            return (Criteria) this;
        }

        public Criteria andDatacolumn36Between(String value1, String value2) {
            addCriterion("DataColumn36 between", value1, value2, "datacolumn36");
            return (Criteria) this;
        }

        public Criteria andDatacolumn36NotBetween(String value1, String value2) {
            addCriterion("DataColumn36 not between", value1, value2, "datacolumn36");
            return (Criteria) this;
        }

        public Criteria andDatacolumn37IsNull() {
            addCriterion("DataColumn37 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn37IsNotNull() {
            addCriterion("DataColumn37 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn37EqualTo(String value) {
            addCriterion("DataColumn37 =", value, "datacolumn37");
            return (Criteria) this;
        }

        public Criteria andDatacolumn37NotEqualTo(String value) {
            addCriterion("DataColumn37 <>", value, "datacolumn37");
            return (Criteria) this;
        }

        public Criteria andDatacolumn37GreaterThan(String value) {
            addCriterion("DataColumn37 >", value, "datacolumn37");
            return (Criteria) this;
        }

        public Criteria andDatacolumn37GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn37 >=", value, "datacolumn37");
            return (Criteria) this;
        }

        public Criteria andDatacolumn37LessThan(String value) {
            addCriterion("DataColumn37 <", value, "datacolumn37");
            return (Criteria) this;
        }

        public Criteria andDatacolumn37LessThanOrEqualTo(String value) {
            addCriterion("DataColumn37 <=", value, "datacolumn37");
            return (Criteria) this;
        }

        public Criteria andDatacolumn37Like(String value) {
            addCriterion("DataColumn37 like", value, "datacolumn37");
            return (Criteria) this;
        }

        public Criteria andDatacolumn37NotLike(String value) {
            addCriterion("DataColumn37 not like", value, "datacolumn37");
            return (Criteria) this;
        }

        public Criteria andDatacolumn37In(List<String> values) {
            addCriterion("DataColumn37 in", values, "datacolumn37");
            return (Criteria) this;
        }

        public Criteria andDatacolumn37NotIn(List<String> values) {
            addCriterion("DataColumn37 not in", values, "datacolumn37");
            return (Criteria) this;
        }

        public Criteria andDatacolumn37Between(String value1, String value2) {
            addCriterion("DataColumn37 between", value1, value2, "datacolumn37");
            return (Criteria) this;
        }

        public Criteria andDatacolumn37NotBetween(String value1, String value2) {
            addCriterion("DataColumn37 not between", value1, value2, "datacolumn37");
            return (Criteria) this;
        }

        public Criteria andDatacolumn38IsNull() {
            addCriterion("DataColumn38 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn38IsNotNull() {
            addCriterion("DataColumn38 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn38EqualTo(String value) {
            addCriterion("DataColumn38 =", value, "datacolumn38");
            return (Criteria) this;
        }

        public Criteria andDatacolumn38NotEqualTo(String value) {
            addCriterion("DataColumn38 <>", value, "datacolumn38");
            return (Criteria) this;
        }

        public Criteria andDatacolumn38GreaterThan(String value) {
            addCriterion("DataColumn38 >", value, "datacolumn38");
            return (Criteria) this;
        }

        public Criteria andDatacolumn38GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn38 >=", value, "datacolumn38");
            return (Criteria) this;
        }

        public Criteria andDatacolumn38LessThan(String value) {
            addCriterion("DataColumn38 <", value, "datacolumn38");
            return (Criteria) this;
        }

        public Criteria andDatacolumn38LessThanOrEqualTo(String value) {
            addCriterion("DataColumn38 <=", value, "datacolumn38");
            return (Criteria) this;
        }

        public Criteria andDatacolumn38Like(String value) {
            addCriterion("DataColumn38 like", value, "datacolumn38");
            return (Criteria) this;
        }

        public Criteria andDatacolumn38NotLike(String value) {
            addCriterion("DataColumn38 not like", value, "datacolumn38");
            return (Criteria) this;
        }

        public Criteria andDatacolumn38In(List<String> values) {
            addCriterion("DataColumn38 in", values, "datacolumn38");
            return (Criteria) this;
        }

        public Criteria andDatacolumn38NotIn(List<String> values) {
            addCriterion("DataColumn38 not in", values, "datacolumn38");
            return (Criteria) this;
        }

        public Criteria andDatacolumn38Between(String value1, String value2) {
            addCriterion("DataColumn38 between", value1, value2, "datacolumn38");
            return (Criteria) this;
        }

        public Criteria andDatacolumn38NotBetween(String value1, String value2) {
            addCriterion("DataColumn38 not between", value1, value2, "datacolumn38");
            return (Criteria) this;
        }

        public Criteria andDatacolumn39IsNull() {
            addCriterion("DataColumn39 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn39IsNotNull() {
            addCriterion("DataColumn39 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn39EqualTo(String value) {
            addCriterion("DataColumn39 =", value, "datacolumn39");
            return (Criteria) this;
        }

        public Criteria andDatacolumn39NotEqualTo(String value) {
            addCriterion("DataColumn39 <>", value, "datacolumn39");
            return (Criteria) this;
        }

        public Criteria andDatacolumn39GreaterThan(String value) {
            addCriterion("DataColumn39 >", value, "datacolumn39");
            return (Criteria) this;
        }

        public Criteria andDatacolumn39GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn39 >=", value, "datacolumn39");
            return (Criteria) this;
        }

        public Criteria andDatacolumn39LessThan(String value) {
            addCriterion("DataColumn39 <", value, "datacolumn39");
            return (Criteria) this;
        }

        public Criteria andDatacolumn39LessThanOrEqualTo(String value) {
            addCriterion("DataColumn39 <=", value, "datacolumn39");
            return (Criteria) this;
        }

        public Criteria andDatacolumn39Like(String value) {
            addCriterion("DataColumn39 like", value, "datacolumn39");
            return (Criteria) this;
        }

        public Criteria andDatacolumn39NotLike(String value) {
            addCriterion("DataColumn39 not like", value, "datacolumn39");
            return (Criteria) this;
        }

        public Criteria andDatacolumn39In(List<String> values) {
            addCriterion("DataColumn39 in", values, "datacolumn39");
            return (Criteria) this;
        }

        public Criteria andDatacolumn39NotIn(List<String> values) {
            addCriterion("DataColumn39 not in", values, "datacolumn39");
            return (Criteria) this;
        }

        public Criteria andDatacolumn39Between(String value1, String value2) {
            addCriterion("DataColumn39 between", value1, value2, "datacolumn39");
            return (Criteria) this;
        }

        public Criteria andDatacolumn39NotBetween(String value1, String value2) {
            addCriterion("DataColumn39 not between", value1, value2, "datacolumn39");
            return (Criteria) this;
        }

        public Criteria andDatacolumn40IsNull() {
            addCriterion("DataColumn40 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn40IsNotNull() {
            addCriterion("DataColumn40 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn40EqualTo(String value) {
            addCriterion("DataColumn40 =", value, "datacolumn40");
            return (Criteria) this;
        }

        public Criteria andDatacolumn40NotEqualTo(String value) {
            addCriterion("DataColumn40 <>", value, "datacolumn40");
            return (Criteria) this;
        }

        public Criteria andDatacolumn40GreaterThan(String value) {
            addCriterion("DataColumn40 >", value, "datacolumn40");
            return (Criteria) this;
        }

        public Criteria andDatacolumn40GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn40 >=", value, "datacolumn40");
            return (Criteria) this;
        }

        public Criteria andDatacolumn40LessThan(String value) {
            addCriterion("DataColumn40 <", value, "datacolumn40");
            return (Criteria) this;
        }

        public Criteria andDatacolumn40LessThanOrEqualTo(String value) {
            addCriterion("DataColumn40 <=", value, "datacolumn40");
            return (Criteria) this;
        }

        public Criteria andDatacolumn40Like(String value) {
            addCriterion("DataColumn40 like", value, "datacolumn40");
            return (Criteria) this;
        }

        public Criteria andDatacolumn40NotLike(String value) {
            addCriterion("DataColumn40 not like", value, "datacolumn40");
            return (Criteria) this;
        }

        public Criteria andDatacolumn40In(List<String> values) {
            addCriterion("DataColumn40 in", values, "datacolumn40");
            return (Criteria) this;
        }

        public Criteria andDatacolumn40NotIn(List<String> values) {
            addCriterion("DataColumn40 not in", values, "datacolumn40");
            return (Criteria) this;
        }

        public Criteria andDatacolumn40Between(String value1, String value2) {
            addCriterion("DataColumn40 between", value1, value2, "datacolumn40");
            return (Criteria) this;
        }

        public Criteria andDatacolumn40NotBetween(String value1, String value2) {
            addCriterion("DataColumn40 not between", value1, value2, "datacolumn40");
            return (Criteria) this;
        }

        public Criteria andDatacolumn41IsNull() {
            addCriterion("DataColumn41 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn41IsNotNull() {
            addCriterion("DataColumn41 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn41EqualTo(String value) {
            addCriterion("DataColumn41 =", value, "datacolumn41");
            return (Criteria) this;
        }

        public Criteria andDatacolumn41NotEqualTo(String value) {
            addCriterion("DataColumn41 <>", value, "datacolumn41");
            return (Criteria) this;
        }

        public Criteria andDatacolumn41GreaterThan(String value) {
            addCriterion("DataColumn41 >", value, "datacolumn41");
            return (Criteria) this;
        }

        public Criteria andDatacolumn41GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn41 >=", value, "datacolumn41");
            return (Criteria) this;
        }

        public Criteria andDatacolumn41LessThan(String value) {
            addCriterion("DataColumn41 <", value, "datacolumn41");
            return (Criteria) this;
        }

        public Criteria andDatacolumn41LessThanOrEqualTo(String value) {
            addCriterion("DataColumn41 <=", value, "datacolumn41");
            return (Criteria) this;
        }

        public Criteria andDatacolumn41Like(String value) {
            addCriterion("DataColumn41 like", value, "datacolumn41");
            return (Criteria) this;
        }

        public Criteria andDatacolumn41NotLike(String value) {
            addCriterion("DataColumn41 not like", value, "datacolumn41");
            return (Criteria) this;
        }

        public Criteria andDatacolumn41In(List<String> values) {
            addCriterion("DataColumn41 in", values, "datacolumn41");
            return (Criteria) this;
        }

        public Criteria andDatacolumn41NotIn(List<String> values) {
            addCriterion("DataColumn41 not in", values, "datacolumn41");
            return (Criteria) this;
        }

        public Criteria andDatacolumn41Between(String value1, String value2) {
            addCriterion("DataColumn41 between", value1, value2, "datacolumn41");
            return (Criteria) this;
        }

        public Criteria andDatacolumn41NotBetween(String value1, String value2) {
            addCriterion("DataColumn41 not between", value1, value2, "datacolumn41");
            return (Criteria) this;
        }

        public Criteria andDatacolumn42IsNull() {
            addCriterion("DataColumn42 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn42IsNotNull() {
            addCriterion("DataColumn42 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn42EqualTo(String value) {
            addCriterion("DataColumn42 =", value, "datacolumn42");
            return (Criteria) this;
        }

        public Criteria andDatacolumn42NotEqualTo(String value) {
            addCriterion("DataColumn42 <>", value, "datacolumn42");
            return (Criteria) this;
        }

        public Criteria andDatacolumn42GreaterThan(String value) {
            addCriterion("DataColumn42 >", value, "datacolumn42");
            return (Criteria) this;
        }

        public Criteria andDatacolumn42GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn42 >=", value, "datacolumn42");
            return (Criteria) this;
        }

        public Criteria andDatacolumn42LessThan(String value) {
            addCriterion("DataColumn42 <", value, "datacolumn42");
            return (Criteria) this;
        }

        public Criteria andDatacolumn42LessThanOrEqualTo(String value) {
            addCriterion("DataColumn42 <=", value, "datacolumn42");
            return (Criteria) this;
        }

        public Criteria andDatacolumn42Like(String value) {
            addCriterion("DataColumn42 like", value, "datacolumn42");
            return (Criteria) this;
        }

        public Criteria andDatacolumn42NotLike(String value) {
            addCriterion("DataColumn42 not like", value, "datacolumn42");
            return (Criteria) this;
        }

        public Criteria andDatacolumn42In(List<String> values) {
            addCriterion("DataColumn42 in", values, "datacolumn42");
            return (Criteria) this;
        }

        public Criteria andDatacolumn42NotIn(List<String> values) {
            addCriterion("DataColumn42 not in", values, "datacolumn42");
            return (Criteria) this;
        }

        public Criteria andDatacolumn42Between(String value1, String value2) {
            addCriterion("DataColumn42 between", value1, value2, "datacolumn42");
            return (Criteria) this;
        }

        public Criteria andDatacolumn42NotBetween(String value1, String value2) {
            addCriterion("DataColumn42 not between", value1, value2, "datacolumn42");
            return (Criteria) this;
        }

        public Criteria andDatacolumn43IsNull() {
            addCriterion("DataColumn43 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn43IsNotNull() {
            addCriterion("DataColumn43 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn43EqualTo(String value) {
            addCriterion("DataColumn43 =", value, "datacolumn43");
            return (Criteria) this;
        }

        public Criteria andDatacolumn43NotEqualTo(String value) {
            addCriterion("DataColumn43 <>", value, "datacolumn43");
            return (Criteria) this;
        }

        public Criteria andDatacolumn43GreaterThan(String value) {
            addCriterion("DataColumn43 >", value, "datacolumn43");
            return (Criteria) this;
        }

        public Criteria andDatacolumn43GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn43 >=", value, "datacolumn43");
            return (Criteria) this;
        }

        public Criteria andDatacolumn43LessThan(String value) {
            addCriterion("DataColumn43 <", value, "datacolumn43");
            return (Criteria) this;
        }

        public Criteria andDatacolumn43LessThanOrEqualTo(String value) {
            addCriterion("DataColumn43 <=", value, "datacolumn43");
            return (Criteria) this;
        }

        public Criteria andDatacolumn43Like(String value) {
            addCriterion("DataColumn43 like", value, "datacolumn43");
            return (Criteria) this;
        }

        public Criteria andDatacolumn43NotLike(String value) {
            addCriterion("DataColumn43 not like", value, "datacolumn43");
            return (Criteria) this;
        }

        public Criteria andDatacolumn43In(List<String> values) {
            addCriterion("DataColumn43 in", values, "datacolumn43");
            return (Criteria) this;
        }

        public Criteria andDatacolumn43NotIn(List<String> values) {
            addCriterion("DataColumn43 not in", values, "datacolumn43");
            return (Criteria) this;
        }

        public Criteria andDatacolumn43Between(String value1, String value2) {
            addCriterion("DataColumn43 between", value1, value2, "datacolumn43");
            return (Criteria) this;
        }

        public Criteria andDatacolumn43NotBetween(String value1, String value2) {
            addCriterion("DataColumn43 not between", value1, value2, "datacolumn43");
            return (Criteria) this;
        }

        public Criteria andDatacolumn44IsNull() {
            addCriterion("DataColumn44 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn44IsNotNull() {
            addCriterion("DataColumn44 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn44EqualTo(String value) {
            addCriterion("DataColumn44 =", value, "datacolumn44");
            return (Criteria) this;
        }

        public Criteria andDatacolumn44NotEqualTo(String value) {
            addCriterion("DataColumn44 <>", value, "datacolumn44");
            return (Criteria) this;
        }

        public Criteria andDatacolumn44GreaterThan(String value) {
            addCriterion("DataColumn44 >", value, "datacolumn44");
            return (Criteria) this;
        }

        public Criteria andDatacolumn44GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn44 >=", value, "datacolumn44");
            return (Criteria) this;
        }

        public Criteria andDatacolumn44LessThan(String value) {
            addCriterion("DataColumn44 <", value, "datacolumn44");
            return (Criteria) this;
        }

        public Criteria andDatacolumn44LessThanOrEqualTo(String value) {
            addCriterion("DataColumn44 <=", value, "datacolumn44");
            return (Criteria) this;
        }

        public Criteria andDatacolumn44Like(String value) {
            addCriterion("DataColumn44 like", value, "datacolumn44");
            return (Criteria) this;
        }

        public Criteria andDatacolumn44NotLike(String value) {
            addCriterion("DataColumn44 not like", value, "datacolumn44");
            return (Criteria) this;
        }

        public Criteria andDatacolumn44In(List<String> values) {
            addCriterion("DataColumn44 in", values, "datacolumn44");
            return (Criteria) this;
        }

        public Criteria andDatacolumn44NotIn(List<String> values) {
            addCriterion("DataColumn44 not in", values, "datacolumn44");
            return (Criteria) this;
        }

        public Criteria andDatacolumn44Between(String value1, String value2) {
            addCriterion("DataColumn44 between", value1, value2, "datacolumn44");
            return (Criteria) this;
        }

        public Criteria andDatacolumn44NotBetween(String value1, String value2) {
            addCriterion("DataColumn44 not between", value1, value2, "datacolumn44");
            return (Criteria) this;
        }

        public Criteria andDatacolumn45IsNull() {
            addCriterion("DataColumn45 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn45IsNotNull() {
            addCriterion("DataColumn45 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn45EqualTo(String value) {
            addCriterion("DataColumn45 =", value, "datacolumn45");
            return (Criteria) this;
        }

        public Criteria andDatacolumn45NotEqualTo(String value) {
            addCriterion("DataColumn45 <>", value, "datacolumn45");
            return (Criteria) this;
        }

        public Criteria andDatacolumn45GreaterThan(String value) {
            addCriterion("DataColumn45 >", value, "datacolumn45");
            return (Criteria) this;
        }

        public Criteria andDatacolumn45GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn45 >=", value, "datacolumn45");
            return (Criteria) this;
        }

        public Criteria andDatacolumn45LessThan(String value) {
            addCriterion("DataColumn45 <", value, "datacolumn45");
            return (Criteria) this;
        }

        public Criteria andDatacolumn45LessThanOrEqualTo(String value) {
            addCriterion("DataColumn45 <=", value, "datacolumn45");
            return (Criteria) this;
        }

        public Criteria andDatacolumn45Like(String value) {
            addCriterion("DataColumn45 like", value, "datacolumn45");
            return (Criteria) this;
        }

        public Criteria andDatacolumn45NotLike(String value) {
            addCriterion("DataColumn45 not like", value, "datacolumn45");
            return (Criteria) this;
        }

        public Criteria andDatacolumn45In(List<String> values) {
            addCriterion("DataColumn45 in", values, "datacolumn45");
            return (Criteria) this;
        }

        public Criteria andDatacolumn45NotIn(List<String> values) {
            addCriterion("DataColumn45 not in", values, "datacolumn45");
            return (Criteria) this;
        }

        public Criteria andDatacolumn45Between(String value1, String value2) {
            addCriterion("DataColumn45 between", value1, value2, "datacolumn45");
            return (Criteria) this;
        }

        public Criteria andDatacolumn45NotBetween(String value1, String value2) {
            addCriterion("DataColumn45 not between", value1, value2, "datacolumn45");
            return (Criteria) this;
        }

        public Criteria andDatacolumn46IsNull() {
            addCriterion("DataColumn46 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn46IsNotNull() {
            addCriterion("DataColumn46 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn46EqualTo(String value) {
            addCriterion("DataColumn46 =", value, "datacolumn46");
            return (Criteria) this;
        }

        public Criteria andDatacolumn46NotEqualTo(String value) {
            addCriterion("DataColumn46 <>", value, "datacolumn46");
            return (Criteria) this;
        }

        public Criteria andDatacolumn46GreaterThan(String value) {
            addCriterion("DataColumn46 >", value, "datacolumn46");
            return (Criteria) this;
        }

        public Criteria andDatacolumn46GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn46 >=", value, "datacolumn46");
            return (Criteria) this;
        }

        public Criteria andDatacolumn46LessThan(String value) {
            addCriterion("DataColumn46 <", value, "datacolumn46");
            return (Criteria) this;
        }

        public Criteria andDatacolumn46LessThanOrEqualTo(String value) {
            addCriterion("DataColumn46 <=", value, "datacolumn46");
            return (Criteria) this;
        }

        public Criteria andDatacolumn46Like(String value) {
            addCriterion("DataColumn46 like", value, "datacolumn46");
            return (Criteria) this;
        }

        public Criteria andDatacolumn46NotLike(String value) {
            addCriterion("DataColumn46 not like", value, "datacolumn46");
            return (Criteria) this;
        }

        public Criteria andDatacolumn46In(List<String> values) {
            addCriterion("DataColumn46 in", values, "datacolumn46");
            return (Criteria) this;
        }

        public Criteria andDatacolumn46NotIn(List<String> values) {
            addCriterion("DataColumn46 not in", values, "datacolumn46");
            return (Criteria) this;
        }

        public Criteria andDatacolumn46Between(String value1, String value2) {
            addCriterion("DataColumn46 between", value1, value2, "datacolumn46");
            return (Criteria) this;
        }

        public Criteria andDatacolumn46NotBetween(String value1, String value2) {
            addCriterion("DataColumn46 not between", value1, value2, "datacolumn46");
            return (Criteria) this;
        }

        public Criteria andDatacolumn47IsNull() {
            addCriterion("DataColumn47 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn47IsNotNull() {
            addCriterion("DataColumn47 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn47EqualTo(String value) {
            addCriterion("DataColumn47 =", value, "datacolumn47");
            return (Criteria) this;
        }

        public Criteria andDatacolumn47NotEqualTo(String value) {
            addCriterion("DataColumn47 <>", value, "datacolumn47");
            return (Criteria) this;
        }

        public Criteria andDatacolumn47GreaterThan(String value) {
            addCriterion("DataColumn47 >", value, "datacolumn47");
            return (Criteria) this;
        }

        public Criteria andDatacolumn47GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn47 >=", value, "datacolumn47");
            return (Criteria) this;
        }

        public Criteria andDatacolumn47LessThan(String value) {
            addCriterion("DataColumn47 <", value, "datacolumn47");
            return (Criteria) this;
        }

        public Criteria andDatacolumn47LessThanOrEqualTo(String value) {
            addCriterion("DataColumn47 <=", value, "datacolumn47");
            return (Criteria) this;
        }

        public Criteria andDatacolumn47Like(String value) {
            addCriterion("DataColumn47 like", value, "datacolumn47");
            return (Criteria) this;
        }

        public Criteria andDatacolumn47NotLike(String value) {
            addCriterion("DataColumn47 not like", value, "datacolumn47");
            return (Criteria) this;
        }

        public Criteria andDatacolumn47In(List<String> values) {
            addCriterion("DataColumn47 in", values, "datacolumn47");
            return (Criteria) this;
        }

        public Criteria andDatacolumn47NotIn(List<String> values) {
            addCriterion("DataColumn47 not in", values, "datacolumn47");
            return (Criteria) this;
        }

        public Criteria andDatacolumn47Between(String value1, String value2) {
            addCriterion("DataColumn47 between", value1, value2, "datacolumn47");
            return (Criteria) this;
        }

        public Criteria andDatacolumn47NotBetween(String value1, String value2) {
            addCriterion("DataColumn47 not between", value1, value2, "datacolumn47");
            return (Criteria) this;
        }

        public Criteria andDatacolumn48IsNull() {
            addCriterion("DataColumn48 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn48IsNotNull() {
            addCriterion("DataColumn48 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn48EqualTo(String value) {
            addCriterion("DataColumn48 =", value, "datacolumn48");
            return (Criteria) this;
        }

        public Criteria andDatacolumn48NotEqualTo(String value) {
            addCriterion("DataColumn48 <>", value, "datacolumn48");
            return (Criteria) this;
        }

        public Criteria andDatacolumn48GreaterThan(String value) {
            addCriterion("DataColumn48 >", value, "datacolumn48");
            return (Criteria) this;
        }

        public Criteria andDatacolumn48GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn48 >=", value, "datacolumn48");
            return (Criteria) this;
        }

        public Criteria andDatacolumn48LessThan(String value) {
            addCriterion("DataColumn48 <", value, "datacolumn48");
            return (Criteria) this;
        }

        public Criteria andDatacolumn48LessThanOrEqualTo(String value) {
            addCriterion("DataColumn48 <=", value, "datacolumn48");
            return (Criteria) this;
        }

        public Criteria andDatacolumn48Like(String value) {
            addCriterion("DataColumn48 like", value, "datacolumn48");
            return (Criteria) this;
        }

        public Criteria andDatacolumn48NotLike(String value) {
            addCriterion("DataColumn48 not like", value, "datacolumn48");
            return (Criteria) this;
        }

        public Criteria andDatacolumn48In(List<String> values) {
            addCriterion("DataColumn48 in", values, "datacolumn48");
            return (Criteria) this;
        }

        public Criteria andDatacolumn48NotIn(List<String> values) {
            addCriterion("DataColumn48 not in", values, "datacolumn48");
            return (Criteria) this;
        }

        public Criteria andDatacolumn48Between(String value1, String value2) {
            addCriterion("DataColumn48 between", value1, value2, "datacolumn48");
            return (Criteria) this;
        }

        public Criteria andDatacolumn48NotBetween(String value1, String value2) {
            addCriterion("DataColumn48 not between", value1, value2, "datacolumn48");
            return (Criteria) this;
        }

        public Criteria andDatacolumn49IsNull() {
            addCriterion("DataColumn49 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn49IsNotNull() {
            addCriterion("DataColumn49 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn49EqualTo(String value) {
            addCriterion("DataColumn49 =", value, "datacolumn49");
            return (Criteria) this;
        }

        public Criteria andDatacolumn49NotEqualTo(String value) {
            addCriterion("DataColumn49 <>", value, "datacolumn49");
            return (Criteria) this;
        }

        public Criteria andDatacolumn49GreaterThan(String value) {
            addCriterion("DataColumn49 >", value, "datacolumn49");
            return (Criteria) this;
        }

        public Criteria andDatacolumn49GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn49 >=", value, "datacolumn49");
            return (Criteria) this;
        }

        public Criteria andDatacolumn49LessThan(String value) {
            addCriterion("DataColumn49 <", value, "datacolumn49");
            return (Criteria) this;
        }

        public Criteria andDatacolumn49LessThanOrEqualTo(String value) {
            addCriterion("DataColumn49 <=", value, "datacolumn49");
            return (Criteria) this;
        }

        public Criteria andDatacolumn49Like(String value) {
            addCriterion("DataColumn49 like", value, "datacolumn49");
            return (Criteria) this;
        }

        public Criteria andDatacolumn49NotLike(String value) {
            addCriterion("DataColumn49 not like", value, "datacolumn49");
            return (Criteria) this;
        }

        public Criteria andDatacolumn49In(List<String> values) {
            addCriterion("DataColumn49 in", values, "datacolumn49");
            return (Criteria) this;
        }

        public Criteria andDatacolumn49NotIn(List<String> values) {
            addCriterion("DataColumn49 not in", values, "datacolumn49");
            return (Criteria) this;
        }

        public Criteria andDatacolumn49Between(String value1, String value2) {
            addCriterion("DataColumn49 between", value1, value2, "datacolumn49");
            return (Criteria) this;
        }

        public Criteria andDatacolumn49NotBetween(String value1, String value2) {
            addCriterion("DataColumn49 not between", value1, value2, "datacolumn49");
            return (Criteria) this;
        }

        public Criteria andDatacolumn50IsNull() {
            addCriterion("DataColumn50 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn50IsNotNull() {
            addCriterion("DataColumn50 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn50EqualTo(String value) {
            addCriterion("DataColumn50 =", value, "datacolumn50");
            return (Criteria) this;
        }

        public Criteria andDatacolumn50NotEqualTo(String value) {
            addCriterion("DataColumn50 <>", value, "datacolumn50");
            return (Criteria) this;
        }

        public Criteria andDatacolumn50GreaterThan(String value) {
            addCriterion("DataColumn50 >", value, "datacolumn50");
            return (Criteria) this;
        }

        public Criteria andDatacolumn50GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn50 >=", value, "datacolumn50");
            return (Criteria) this;
        }

        public Criteria andDatacolumn50LessThan(String value) {
            addCriterion("DataColumn50 <", value, "datacolumn50");
            return (Criteria) this;
        }

        public Criteria andDatacolumn50LessThanOrEqualTo(String value) {
            addCriterion("DataColumn50 <=", value, "datacolumn50");
            return (Criteria) this;
        }

        public Criteria andDatacolumn50Like(String value) {
            addCriterion("DataColumn50 like", value, "datacolumn50");
            return (Criteria) this;
        }

        public Criteria andDatacolumn50NotLike(String value) {
            addCriterion("DataColumn50 not like", value, "datacolumn50");
            return (Criteria) this;
        }

        public Criteria andDatacolumn50In(List<String> values) {
            addCriterion("DataColumn50 in", values, "datacolumn50");
            return (Criteria) this;
        }

        public Criteria andDatacolumn50NotIn(List<String> values) {
            addCriterion("DataColumn50 not in", values, "datacolumn50");
            return (Criteria) this;
        }

        public Criteria andDatacolumn50Between(String value1, String value2) {
            addCriterion("DataColumn50 between", value1, value2, "datacolumn50");
            return (Criteria) this;
        }

        public Criteria andDatacolumn50NotBetween(String value1, String value2) {
            addCriterion("DataColumn50 not between", value1, value2, "datacolumn50");
            return (Criteria) this;
        }

        public Criteria andDatacolumn51IsNull() {
            addCriterion("DataColumn51 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn51IsNotNull() {
            addCriterion("DataColumn51 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn51EqualTo(String value) {
            addCriterion("DataColumn51 =", value, "datacolumn51");
            return (Criteria) this;
        }

        public Criteria andDatacolumn51NotEqualTo(String value) {
            addCriterion("DataColumn51 <>", value, "datacolumn51");
            return (Criteria) this;
        }

        public Criteria andDatacolumn51GreaterThan(String value) {
            addCriterion("DataColumn51 >", value, "datacolumn51");
            return (Criteria) this;
        }

        public Criteria andDatacolumn51GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn51 >=", value, "datacolumn51");
            return (Criteria) this;
        }

        public Criteria andDatacolumn51LessThan(String value) {
            addCriterion("DataColumn51 <", value, "datacolumn51");
            return (Criteria) this;
        }

        public Criteria andDatacolumn51LessThanOrEqualTo(String value) {
            addCriterion("DataColumn51 <=", value, "datacolumn51");
            return (Criteria) this;
        }

        public Criteria andDatacolumn51Like(String value) {
            addCriterion("DataColumn51 like", value, "datacolumn51");
            return (Criteria) this;
        }

        public Criteria andDatacolumn51NotLike(String value) {
            addCriterion("DataColumn51 not like", value, "datacolumn51");
            return (Criteria) this;
        }

        public Criteria andDatacolumn51In(List<String> values) {
            addCriterion("DataColumn51 in", values, "datacolumn51");
            return (Criteria) this;
        }

        public Criteria andDatacolumn51NotIn(List<String> values) {
            addCriterion("DataColumn51 not in", values, "datacolumn51");
            return (Criteria) this;
        }

        public Criteria andDatacolumn51Between(String value1, String value2) {
            addCriterion("DataColumn51 between", value1, value2, "datacolumn51");
            return (Criteria) this;
        }

        public Criteria andDatacolumn51NotBetween(String value1, String value2) {
            addCriterion("DataColumn51 not between", value1, value2, "datacolumn51");
            return (Criteria) this;
        }

        public Criteria andDatacolumn52IsNull() {
            addCriterion("DataColumn52 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn52IsNotNull() {
            addCriterion("DataColumn52 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn52EqualTo(String value) {
            addCriterion("DataColumn52 =", value, "datacolumn52");
            return (Criteria) this;
        }

        public Criteria andDatacolumn52NotEqualTo(String value) {
            addCriterion("DataColumn52 <>", value, "datacolumn52");
            return (Criteria) this;
        }

        public Criteria andDatacolumn52GreaterThan(String value) {
            addCriterion("DataColumn52 >", value, "datacolumn52");
            return (Criteria) this;
        }

        public Criteria andDatacolumn52GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn52 >=", value, "datacolumn52");
            return (Criteria) this;
        }

        public Criteria andDatacolumn52LessThan(String value) {
            addCriterion("DataColumn52 <", value, "datacolumn52");
            return (Criteria) this;
        }

        public Criteria andDatacolumn52LessThanOrEqualTo(String value) {
            addCriterion("DataColumn52 <=", value, "datacolumn52");
            return (Criteria) this;
        }

        public Criteria andDatacolumn52Like(String value) {
            addCriterion("DataColumn52 like", value, "datacolumn52");
            return (Criteria) this;
        }

        public Criteria andDatacolumn52NotLike(String value) {
            addCriterion("DataColumn52 not like", value, "datacolumn52");
            return (Criteria) this;
        }

        public Criteria andDatacolumn52In(List<String> values) {
            addCriterion("DataColumn52 in", values, "datacolumn52");
            return (Criteria) this;
        }

        public Criteria andDatacolumn52NotIn(List<String> values) {
            addCriterion("DataColumn52 not in", values, "datacolumn52");
            return (Criteria) this;
        }

        public Criteria andDatacolumn52Between(String value1, String value2) {
            addCriterion("DataColumn52 between", value1, value2, "datacolumn52");
            return (Criteria) this;
        }

        public Criteria andDatacolumn52NotBetween(String value1, String value2) {
            addCriterion("DataColumn52 not between", value1, value2, "datacolumn52");
            return (Criteria) this;
        }

        public Criteria andDatacolumn53IsNull() {
            addCriterion("DataColumn53 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn53IsNotNull() {
            addCriterion("DataColumn53 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn53EqualTo(String value) {
            addCriterion("DataColumn53 =", value, "datacolumn53");
            return (Criteria) this;
        }

        public Criteria andDatacolumn53NotEqualTo(String value) {
            addCriterion("DataColumn53 <>", value, "datacolumn53");
            return (Criteria) this;
        }

        public Criteria andDatacolumn53GreaterThan(String value) {
            addCriterion("DataColumn53 >", value, "datacolumn53");
            return (Criteria) this;
        }

        public Criteria andDatacolumn53GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn53 >=", value, "datacolumn53");
            return (Criteria) this;
        }

        public Criteria andDatacolumn53LessThan(String value) {
            addCriterion("DataColumn53 <", value, "datacolumn53");
            return (Criteria) this;
        }

        public Criteria andDatacolumn53LessThanOrEqualTo(String value) {
            addCriterion("DataColumn53 <=", value, "datacolumn53");
            return (Criteria) this;
        }

        public Criteria andDatacolumn53Like(String value) {
            addCriterion("DataColumn53 like", value, "datacolumn53");
            return (Criteria) this;
        }

        public Criteria andDatacolumn53NotLike(String value) {
            addCriterion("DataColumn53 not like", value, "datacolumn53");
            return (Criteria) this;
        }

        public Criteria andDatacolumn53In(List<String> values) {
            addCriterion("DataColumn53 in", values, "datacolumn53");
            return (Criteria) this;
        }

        public Criteria andDatacolumn53NotIn(List<String> values) {
            addCriterion("DataColumn53 not in", values, "datacolumn53");
            return (Criteria) this;
        }

        public Criteria andDatacolumn53Between(String value1, String value2) {
            addCriterion("DataColumn53 between", value1, value2, "datacolumn53");
            return (Criteria) this;
        }

        public Criteria andDatacolumn53NotBetween(String value1, String value2) {
            addCriterion("DataColumn53 not between", value1, value2, "datacolumn53");
            return (Criteria) this;
        }

        public Criteria andDatacolumn54IsNull() {
            addCriterion("DataColumn54 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn54IsNotNull() {
            addCriterion("DataColumn54 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn54EqualTo(String value) {
            addCriterion("DataColumn54 =", value, "datacolumn54");
            return (Criteria) this;
        }

        public Criteria andDatacolumn54NotEqualTo(String value) {
            addCriterion("DataColumn54 <>", value, "datacolumn54");
            return (Criteria) this;
        }

        public Criteria andDatacolumn54GreaterThan(String value) {
            addCriterion("DataColumn54 >", value, "datacolumn54");
            return (Criteria) this;
        }

        public Criteria andDatacolumn54GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn54 >=", value, "datacolumn54");
            return (Criteria) this;
        }

        public Criteria andDatacolumn54LessThan(String value) {
            addCriterion("DataColumn54 <", value, "datacolumn54");
            return (Criteria) this;
        }

        public Criteria andDatacolumn54LessThanOrEqualTo(String value) {
            addCriterion("DataColumn54 <=", value, "datacolumn54");
            return (Criteria) this;
        }

        public Criteria andDatacolumn54Like(String value) {
            addCriterion("DataColumn54 like", value, "datacolumn54");
            return (Criteria) this;
        }

        public Criteria andDatacolumn54NotLike(String value) {
            addCriterion("DataColumn54 not like", value, "datacolumn54");
            return (Criteria) this;
        }

        public Criteria andDatacolumn54In(List<String> values) {
            addCriterion("DataColumn54 in", values, "datacolumn54");
            return (Criteria) this;
        }

        public Criteria andDatacolumn54NotIn(List<String> values) {
            addCriterion("DataColumn54 not in", values, "datacolumn54");
            return (Criteria) this;
        }

        public Criteria andDatacolumn54Between(String value1, String value2) {
            addCriterion("DataColumn54 between", value1, value2, "datacolumn54");
            return (Criteria) this;
        }

        public Criteria andDatacolumn54NotBetween(String value1, String value2) {
            addCriterion("DataColumn54 not between", value1, value2, "datacolumn54");
            return (Criteria) this;
        }

        public Criteria andDatacolumn55IsNull() {
            addCriterion("DataColumn55 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn55IsNotNull() {
            addCriterion("DataColumn55 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn55EqualTo(String value) {
            addCriterion("DataColumn55 =", value, "datacolumn55");
            return (Criteria) this;
        }

        public Criteria andDatacolumn55NotEqualTo(String value) {
            addCriterion("DataColumn55 <>", value, "datacolumn55");
            return (Criteria) this;
        }

        public Criteria andDatacolumn55GreaterThan(String value) {
            addCriterion("DataColumn55 >", value, "datacolumn55");
            return (Criteria) this;
        }

        public Criteria andDatacolumn55GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn55 >=", value, "datacolumn55");
            return (Criteria) this;
        }

        public Criteria andDatacolumn55LessThan(String value) {
            addCriterion("DataColumn55 <", value, "datacolumn55");
            return (Criteria) this;
        }

        public Criteria andDatacolumn55LessThanOrEqualTo(String value) {
            addCriterion("DataColumn55 <=", value, "datacolumn55");
            return (Criteria) this;
        }

        public Criteria andDatacolumn55Like(String value) {
            addCriterion("DataColumn55 like", value, "datacolumn55");
            return (Criteria) this;
        }

        public Criteria andDatacolumn55NotLike(String value) {
            addCriterion("DataColumn55 not like", value, "datacolumn55");
            return (Criteria) this;
        }

        public Criteria andDatacolumn55In(List<String> values) {
            addCriterion("DataColumn55 in", values, "datacolumn55");
            return (Criteria) this;
        }

        public Criteria andDatacolumn55NotIn(List<String> values) {
            addCriterion("DataColumn55 not in", values, "datacolumn55");
            return (Criteria) this;
        }

        public Criteria andDatacolumn55Between(String value1, String value2) {
            addCriterion("DataColumn55 between", value1, value2, "datacolumn55");
            return (Criteria) this;
        }

        public Criteria andDatacolumn55NotBetween(String value1, String value2) {
            addCriterion("DataColumn55 not between", value1, value2, "datacolumn55");
            return (Criteria) this;
        }

        public Criteria andDatacolumn56IsNull() {
            addCriterion("DataColumn56 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn56IsNotNull() {
            addCriterion("DataColumn56 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn56EqualTo(String value) {
            addCriterion("DataColumn56 =", value, "datacolumn56");
            return (Criteria) this;
        }

        public Criteria andDatacolumn56NotEqualTo(String value) {
            addCriterion("DataColumn56 <>", value, "datacolumn56");
            return (Criteria) this;
        }

        public Criteria andDatacolumn56GreaterThan(String value) {
            addCriterion("DataColumn56 >", value, "datacolumn56");
            return (Criteria) this;
        }

        public Criteria andDatacolumn56GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn56 >=", value, "datacolumn56");
            return (Criteria) this;
        }

        public Criteria andDatacolumn56LessThan(String value) {
            addCriterion("DataColumn56 <", value, "datacolumn56");
            return (Criteria) this;
        }

        public Criteria andDatacolumn56LessThanOrEqualTo(String value) {
            addCriterion("DataColumn56 <=", value, "datacolumn56");
            return (Criteria) this;
        }

        public Criteria andDatacolumn56Like(String value) {
            addCriterion("DataColumn56 like", value, "datacolumn56");
            return (Criteria) this;
        }

        public Criteria andDatacolumn56NotLike(String value) {
            addCriterion("DataColumn56 not like", value, "datacolumn56");
            return (Criteria) this;
        }

        public Criteria andDatacolumn56In(List<String> values) {
            addCriterion("DataColumn56 in", values, "datacolumn56");
            return (Criteria) this;
        }

        public Criteria andDatacolumn56NotIn(List<String> values) {
            addCriterion("DataColumn56 not in", values, "datacolumn56");
            return (Criteria) this;
        }

        public Criteria andDatacolumn56Between(String value1, String value2) {
            addCriterion("DataColumn56 between", value1, value2, "datacolumn56");
            return (Criteria) this;
        }

        public Criteria andDatacolumn56NotBetween(String value1, String value2) {
            addCriterion("DataColumn56 not between", value1, value2, "datacolumn56");
            return (Criteria) this;
        }

        public Criteria andDatacolumn57IsNull() {
            addCriterion("DataColumn57 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn57IsNotNull() {
            addCriterion("DataColumn57 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn57EqualTo(String value) {
            addCriterion("DataColumn57 =", value, "datacolumn57");
            return (Criteria) this;
        }

        public Criteria andDatacolumn57NotEqualTo(String value) {
            addCriterion("DataColumn57 <>", value, "datacolumn57");
            return (Criteria) this;
        }

        public Criteria andDatacolumn57GreaterThan(String value) {
            addCriterion("DataColumn57 >", value, "datacolumn57");
            return (Criteria) this;
        }

        public Criteria andDatacolumn57GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn57 >=", value, "datacolumn57");
            return (Criteria) this;
        }

        public Criteria andDatacolumn57LessThan(String value) {
            addCriterion("DataColumn57 <", value, "datacolumn57");
            return (Criteria) this;
        }

        public Criteria andDatacolumn57LessThanOrEqualTo(String value) {
            addCriterion("DataColumn57 <=", value, "datacolumn57");
            return (Criteria) this;
        }

        public Criteria andDatacolumn57Like(String value) {
            addCriterion("DataColumn57 like", value, "datacolumn57");
            return (Criteria) this;
        }

        public Criteria andDatacolumn57NotLike(String value) {
            addCriterion("DataColumn57 not like", value, "datacolumn57");
            return (Criteria) this;
        }

        public Criteria andDatacolumn57In(List<String> values) {
            addCriterion("DataColumn57 in", values, "datacolumn57");
            return (Criteria) this;
        }

        public Criteria andDatacolumn57NotIn(List<String> values) {
            addCriterion("DataColumn57 not in", values, "datacolumn57");
            return (Criteria) this;
        }

        public Criteria andDatacolumn57Between(String value1, String value2) {
            addCriterion("DataColumn57 between", value1, value2, "datacolumn57");
            return (Criteria) this;
        }

        public Criteria andDatacolumn57NotBetween(String value1, String value2) {
            addCriterion("DataColumn57 not between", value1, value2, "datacolumn57");
            return (Criteria) this;
        }

        public Criteria andDatacolumn58IsNull() {
            addCriterion("DataColumn58 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn58IsNotNull() {
            addCriterion("DataColumn58 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn58EqualTo(String value) {
            addCriterion("DataColumn58 =", value, "datacolumn58");
            return (Criteria) this;
        }

        public Criteria andDatacolumn58NotEqualTo(String value) {
            addCriterion("DataColumn58 <>", value, "datacolumn58");
            return (Criteria) this;
        }

        public Criteria andDatacolumn58GreaterThan(String value) {
            addCriterion("DataColumn58 >", value, "datacolumn58");
            return (Criteria) this;
        }

        public Criteria andDatacolumn58GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn58 >=", value, "datacolumn58");
            return (Criteria) this;
        }

        public Criteria andDatacolumn58LessThan(String value) {
            addCriterion("DataColumn58 <", value, "datacolumn58");
            return (Criteria) this;
        }

        public Criteria andDatacolumn58LessThanOrEqualTo(String value) {
            addCriterion("DataColumn58 <=", value, "datacolumn58");
            return (Criteria) this;
        }

        public Criteria andDatacolumn58Like(String value) {
            addCriterion("DataColumn58 like", value, "datacolumn58");
            return (Criteria) this;
        }

        public Criteria andDatacolumn58NotLike(String value) {
            addCriterion("DataColumn58 not like", value, "datacolumn58");
            return (Criteria) this;
        }

        public Criteria andDatacolumn58In(List<String> values) {
            addCriterion("DataColumn58 in", values, "datacolumn58");
            return (Criteria) this;
        }

        public Criteria andDatacolumn58NotIn(List<String> values) {
            addCriterion("DataColumn58 not in", values, "datacolumn58");
            return (Criteria) this;
        }

        public Criteria andDatacolumn58Between(String value1, String value2) {
            addCriterion("DataColumn58 between", value1, value2, "datacolumn58");
            return (Criteria) this;
        }

        public Criteria andDatacolumn58NotBetween(String value1, String value2) {
            addCriterion("DataColumn58 not between", value1, value2, "datacolumn58");
            return (Criteria) this;
        }

        public Criteria andDatacolumn59IsNull() {
            addCriterion("DataColumn59 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn59IsNotNull() {
            addCriterion("DataColumn59 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn59EqualTo(String value) {
            addCriterion("DataColumn59 =", value, "datacolumn59");
            return (Criteria) this;
        }

        public Criteria andDatacolumn59NotEqualTo(String value) {
            addCriterion("DataColumn59 <>", value, "datacolumn59");
            return (Criteria) this;
        }

        public Criteria andDatacolumn59GreaterThan(String value) {
            addCriterion("DataColumn59 >", value, "datacolumn59");
            return (Criteria) this;
        }

        public Criteria andDatacolumn59GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn59 >=", value, "datacolumn59");
            return (Criteria) this;
        }

        public Criteria andDatacolumn59LessThan(String value) {
            addCriterion("DataColumn59 <", value, "datacolumn59");
            return (Criteria) this;
        }

        public Criteria andDatacolumn59LessThanOrEqualTo(String value) {
            addCriterion("DataColumn59 <=", value, "datacolumn59");
            return (Criteria) this;
        }

        public Criteria andDatacolumn59Like(String value) {
            addCriterion("DataColumn59 like", value, "datacolumn59");
            return (Criteria) this;
        }

        public Criteria andDatacolumn59NotLike(String value) {
            addCriterion("DataColumn59 not like", value, "datacolumn59");
            return (Criteria) this;
        }

        public Criteria andDatacolumn59In(List<String> values) {
            addCriterion("DataColumn59 in", values, "datacolumn59");
            return (Criteria) this;
        }

        public Criteria andDatacolumn59NotIn(List<String> values) {
            addCriterion("DataColumn59 not in", values, "datacolumn59");
            return (Criteria) this;
        }

        public Criteria andDatacolumn59Between(String value1, String value2) {
            addCriterion("DataColumn59 between", value1, value2, "datacolumn59");
            return (Criteria) this;
        }

        public Criteria andDatacolumn59NotBetween(String value1, String value2) {
            addCriterion("DataColumn59 not between", value1, value2, "datacolumn59");
            return (Criteria) this;
        }

        public Criteria andDatacolumn60IsNull() {
            addCriterion("DataColumn60 is null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn60IsNotNull() {
            addCriterion("DataColumn60 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacolumn60EqualTo(String value) {
            addCriterion("DataColumn60 =", value, "datacolumn60");
            return (Criteria) this;
        }

        public Criteria andDatacolumn60NotEqualTo(String value) {
            addCriterion("DataColumn60 <>", value, "datacolumn60");
            return (Criteria) this;
        }

        public Criteria andDatacolumn60GreaterThan(String value) {
            addCriterion("DataColumn60 >", value, "datacolumn60");
            return (Criteria) this;
        }

        public Criteria andDatacolumn60GreaterThanOrEqualTo(String value) {
            addCriterion("DataColumn60 >=", value, "datacolumn60");
            return (Criteria) this;
        }

        public Criteria andDatacolumn60LessThan(String value) {
            addCriterion("DataColumn60 <", value, "datacolumn60");
            return (Criteria) this;
        }

        public Criteria andDatacolumn60LessThanOrEqualTo(String value) {
            addCriterion("DataColumn60 <=", value, "datacolumn60");
            return (Criteria) this;
        }

        public Criteria andDatacolumn60Like(String value) {
            addCriterion("DataColumn60 like", value, "datacolumn60");
            return (Criteria) this;
        }

        public Criteria andDatacolumn60NotLike(String value) {
            addCriterion("DataColumn60 not like", value, "datacolumn60");
            return (Criteria) this;
        }

        public Criteria andDatacolumn60In(List<String> values) {
            addCriterion("DataColumn60 in", values, "datacolumn60");
            return (Criteria) this;
        }

        public Criteria andDatacolumn60NotIn(List<String> values) {
            addCriterion("DataColumn60 not in", values, "datacolumn60");
            return (Criteria) this;
        }

        public Criteria andDatacolumn60Between(String value1, String value2) {
            addCriterion("DataColumn60 between", value1, value2, "datacolumn60");
            return (Criteria) this;
        }

        public Criteria andDatacolumn60NotBetween(String value1, String value2) {
            addCriterion("DataColumn60 not between", value1, value2, "datacolumn60");
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