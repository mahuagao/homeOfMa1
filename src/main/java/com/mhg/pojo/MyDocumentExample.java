package com.mhg.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MyDocumentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MyDocumentExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Long value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Long value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Long value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Long value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Long value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Long value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Long> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Long> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Long value1, Long value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Long value1, Long value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDocnameIsNull() {
            addCriterion("docname is null");
            return (Criteria) this;
        }

        public Criteria andDocnameIsNotNull() {
            addCriterion("docname is not null");
            return (Criteria) this;
        }

        public Criteria andDocnameEqualTo(String value) {
            addCriterion("docname =", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameNotEqualTo(String value) {
            addCriterion("docname <>", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameGreaterThan(String value) {
            addCriterion("docname >", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameGreaterThanOrEqualTo(String value) {
            addCriterion("docname >=", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameLessThan(String value) {
            addCriterion("docname <", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameLessThanOrEqualTo(String value) {
            addCriterion("docname <=", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameLike(String value) {
            addCriterion("docname like", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameNotLike(String value) {
            addCriterion("docname not like", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameIn(List<String> values) {
            addCriterion("docname in", values, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameNotIn(List<String> values) {
            addCriterion("docname not in", values, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameBetween(String value1, String value2) {
            addCriterion("docname between", value1, value2, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameNotBetween(String value1, String value2) {
            addCriterion("docname not between", value1, value2, "docname");
            return (Criteria) this;
        }

        public Criteria andDocsizeIsNull() {
            addCriterion("docsize is null");
            return (Criteria) this;
        }

        public Criteria andDocsizeIsNotNull() {
            addCriterion("docsize is not null");
            return (Criteria) this;
        }

        public Criteria andDocsizeEqualTo(String value) {
            addCriterion("docsize =", value, "docsize");
            return (Criteria) this;
        }

        public Criteria andDocsizeNotEqualTo(String value) {
            addCriterion("docsize <>", value, "docsize");
            return (Criteria) this;
        }

        public Criteria andDocsizeGreaterThan(String value) {
            addCriterion("docsize >", value, "docsize");
            return (Criteria) this;
        }

        public Criteria andDocsizeGreaterThanOrEqualTo(String value) {
            addCriterion("docsize >=", value, "docsize");
            return (Criteria) this;
        }

        public Criteria andDocsizeLessThan(String value) {
            addCriterion("docsize <", value, "docsize");
            return (Criteria) this;
        }

        public Criteria andDocsizeLessThanOrEqualTo(String value) {
            addCriterion("docsize <=", value, "docsize");
            return (Criteria) this;
        }

        public Criteria andDocsizeLike(String value) {
            addCriterion("docsize like", value, "docsize");
            return (Criteria) this;
        }

        public Criteria andDocsizeNotLike(String value) {
            addCriterion("docsize not like", value, "docsize");
            return (Criteria) this;
        }

        public Criteria andDocsizeIn(List<String> values) {
            addCriterion("docsize in", values, "docsize");
            return (Criteria) this;
        }

        public Criteria andDocsizeNotIn(List<String> values) {
            addCriterion("docsize not in", values, "docsize");
            return (Criteria) this;
        }

        public Criteria andDocsizeBetween(String value1, String value2) {
            addCriterion("docsize between", value1, value2, "docsize");
            return (Criteria) this;
        }

        public Criteria andDocsizeNotBetween(String value1, String value2) {
            addCriterion("docsize not between", value1, value2, "docsize");
            return (Criteria) this;
        }

        public Criteria andDocpathIsNull() {
            addCriterion("docpath is null");
            return (Criteria) this;
        }

        public Criteria andDocpathIsNotNull() {
            addCriterion("docpath is not null");
            return (Criteria) this;
        }

        public Criteria andDocpathEqualTo(String value) {
            addCriterion("docpath =", value, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathNotEqualTo(String value) {
            addCriterion("docpath <>", value, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathGreaterThan(String value) {
            addCriterion("docpath >", value, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathGreaterThanOrEqualTo(String value) {
            addCriterion("docpath >=", value, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathLessThan(String value) {
            addCriterion("docpath <", value, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathLessThanOrEqualTo(String value) {
            addCriterion("docpath <=", value, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathLike(String value) {
            addCriterion("docpath like", value, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathNotLike(String value) {
            addCriterion("docpath not like", value, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathIn(List<String> values) {
            addCriterion("docpath in", values, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathNotIn(List<String> values) {
            addCriterion("docpath not in", values, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathBetween(String value1, String value2) {
            addCriterion("docpath between", value1, value2, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathNotBetween(String value1, String value2) {
            addCriterion("docpath not between", value1, value2, "docpath");
            return (Criteria) this;
        }

        public Criteria andUplodateIsNull() {
            addCriterion("uplodate is null");
            return (Criteria) this;
        }

        public Criteria andUplodateIsNotNull() {
            addCriterion("uplodate is not null");
            return (Criteria) this;
        }

        public Criteria andUplodateEqualTo(Date value) {
            addCriterionForJDBCDate("uplodate =", value, "uplodate");
            return (Criteria) this;
        }

        public Criteria andUplodateNotEqualTo(Date value) {
            addCriterionForJDBCDate("uplodate <>", value, "uplodate");
            return (Criteria) this;
        }

        public Criteria andUplodateGreaterThan(Date value) {
            addCriterionForJDBCDate("uplodate >", value, "uplodate");
            return (Criteria) this;
        }

        public Criteria andUplodateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("uplodate >=", value, "uplodate");
            return (Criteria) this;
        }

        public Criteria andUplodateLessThan(Date value) {
            addCriterionForJDBCDate("uplodate <", value, "uplodate");
            return (Criteria) this;
        }

        public Criteria andUplodateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("uplodate <=", value, "uplodate");
            return (Criteria) this;
        }

        public Criteria andUplodateIn(List<Date> values) {
            addCriterionForJDBCDate("uplodate in", values, "uplodate");
            return (Criteria) this;
        }

        public Criteria andUplodateNotIn(List<Date> values) {
            addCriterionForJDBCDate("uplodate not in", values, "uplodate");
            return (Criteria) this;
        }

        public Criteria andUplodateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("uplodate between", value1, value2, "uplodate");
            return (Criteria) this;
        }

        public Criteria andUplodateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("uplodate not between", value1, value2, "uplodate");
            return (Criteria) this;
        }

        public Criteria andScannumIsNull() {
            addCriterion("scannum is null");
            return (Criteria) this;
        }

        public Criteria andScannumIsNotNull() {
            addCriterion("scannum is not null");
            return (Criteria) this;
        }

        public Criteria andScannumEqualTo(Long value) {
            addCriterion("scannum =", value, "scannum");
            return (Criteria) this;
        }

        public Criteria andScannumNotEqualTo(Long value) {
            addCriterion("scannum <>", value, "scannum");
            return (Criteria) this;
        }

        public Criteria andScannumGreaterThan(Long value) {
            addCriterion("scannum >", value, "scannum");
            return (Criteria) this;
        }

        public Criteria andScannumGreaterThanOrEqualTo(Long value) {
            addCriterion("scannum >=", value, "scannum");
            return (Criteria) this;
        }

        public Criteria andScannumLessThan(Long value) {
            addCriterion("scannum <", value, "scannum");
            return (Criteria) this;
        }

        public Criteria andScannumLessThanOrEqualTo(Long value) {
            addCriterion("scannum <=", value, "scannum");
            return (Criteria) this;
        }

        public Criteria andScannumIn(List<Long> values) {
            addCriterion("scannum in", values, "scannum");
            return (Criteria) this;
        }

        public Criteria andScannumNotIn(List<Long> values) {
            addCriterion("scannum not in", values, "scannum");
            return (Criteria) this;
        }

        public Criteria andScannumBetween(Long value1, Long value2) {
            addCriterion("scannum between", value1, value2, "scannum");
            return (Criteria) this;
        }

        public Criteria andScannumNotBetween(Long value1, Long value2) {
            addCriterion("scannum not between", value1, value2, "scannum");
            return (Criteria) this;
        }

        public Criteria andDownnumIsNull() {
            addCriterion("downnum is null");
            return (Criteria) this;
        }

        public Criteria andDownnumIsNotNull() {
            addCriterion("downnum is not null");
            return (Criteria) this;
        }

        public Criteria andDownnumEqualTo(Long value) {
            addCriterion("downnum =", value, "downnum");
            return (Criteria) this;
        }

        public Criteria andDownnumNotEqualTo(Long value) {
            addCriterion("downnum <>", value, "downnum");
            return (Criteria) this;
        }

        public Criteria andDownnumGreaterThan(Long value) {
            addCriterion("downnum >", value, "downnum");
            return (Criteria) this;
        }

        public Criteria andDownnumGreaterThanOrEqualTo(Long value) {
            addCriterion("downnum >=", value, "downnum");
            return (Criteria) this;
        }

        public Criteria andDownnumLessThan(Long value) {
            addCriterion("downnum <", value, "downnum");
            return (Criteria) this;
        }

        public Criteria andDownnumLessThanOrEqualTo(Long value) {
            addCriterion("downnum <=", value, "downnum");
            return (Criteria) this;
        }

        public Criteria andDownnumIn(List<Long> values) {
            addCriterion("downnum in", values, "downnum");
            return (Criteria) this;
        }

        public Criteria andDownnumNotIn(List<Long> values) {
            addCriterion("downnum not in", values, "downnum");
            return (Criteria) this;
        }

        public Criteria andDownnumBetween(Long value1, Long value2) {
            addCriterion("downnum between", value1, value2, "downnum");
            return (Criteria) this;
        }

        public Criteria andDownnumNotBetween(Long value1, Long value2) {
            addCriterion("downnum not between", value1, value2, "downnum");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("modifydate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("modifydate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterionForJDBCDate("modifydate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("modifydate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterionForJDBCDate("modifydate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("modifydate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterionForJDBCDate("modifydate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("modifydate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterionForJDBCDate("modifydate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("modifydate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("modifydate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("modifydate not between", value1, value2, "modifydate");
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