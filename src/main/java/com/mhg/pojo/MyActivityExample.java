package com.mhg.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MyActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MyActivityExample() {
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

        public Criteria andAcidIsNull() {
            addCriterion("acid is null");
            return (Criteria) this;
        }

        public Criteria andAcidIsNotNull() {
            addCriterion("acid is not null");
            return (Criteria) this;
        }

        public Criteria andAcidEqualTo(Long value) {
            addCriterion("acid =", value, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidNotEqualTo(Long value) {
            addCriterion("acid <>", value, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidGreaterThan(Long value) {
            addCriterion("acid >", value, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidGreaterThanOrEqualTo(Long value) {
            addCriterion("acid >=", value, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidLessThan(Long value) {
            addCriterion("acid <", value, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidLessThanOrEqualTo(Long value) {
            addCriterion("acid <=", value, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidIn(List<Long> values) {
            addCriterion("acid in", values, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidNotIn(List<Long> values) {
            addCriterion("acid not in", values, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidBetween(Long value1, Long value2) {
            addCriterion("acid between", value1, value2, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidNotBetween(Long value1, Long value2) {
            addCriterion("acid not between", value1, value2, "acid");
            return (Criteria) this;
        }

        public Criteria andAcnameIsNull() {
            addCriterion("acname is null");
            return (Criteria) this;
        }

        public Criteria andAcnameIsNotNull() {
            addCriterion("acname is not null");
            return (Criteria) this;
        }

        public Criteria andAcnameEqualTo(String value) {
            addCriterion("acname =", value, "acname");
            return (Criteria) this;
        }

        public Criteria andAcnameNotEqualTo(String value) {
            addCriterion("acname <>", value, "acname");
            return (Criteria) this;
        }

        public Criteria andAcnameGreaterThan(String value) {
            addCriterion("acname >", value, "acname");
            return (Criteria) this;
        }

        public Criteria andAcnameGreaterThanOrEqualTo(String value) {
            addCriterion("acname >=", value, "acname");
            return (Criteria) this;
        }

        public Criteria andAcnameLessThan(String value) {
            addCriterion("acname <", value, "acname");
            return (Criteria) this;
        }

        public Criteria andAcnameLessThanOrEqualTo(String value) {
            addCriterion("acname <=", value, "acname");
            return (Criteria) this;
        }

        public Criteria andAcnameLike(String value) {
            addCriterion("acname like", value, "acname");
            return (Criteria) this;
        }

        public Criteria andAcnameNotLike(String value) {
            addCriterion("acname not like", value, "acname");
            return (Criteria) this;
        }

        public Criteria andAcnameIn(List<String> values) {
            addCriterion("acname in", values, "acname");
            return (Criteria) this;
        }

        public Criteria andAcnameNotIn(List<String> values) {
            addCriterion("acname not in", values, "acname");
            return (Criteria) this;
        }

        public Criteria andAcnameBetween(String value1, String value2) {
            addCriterion("acname between", value1, value2, "acname");
            return (Criteria) this;
        }

        public Criteria andAcnameNotBetween(String value1, String value2) {
            addCriterion("acname not between", value1, value2, "acname");
            return (Criteria) this;
        }

        public Criteria andAcmsgIsNull() {
            addCriterion("acmsg is null");
            return (Criteria) this;
        }

        public Criteria andAcmsgIsNotNull() {
            addCriterion("acmsg is not null");
            return (Criteria) this;
        }

        public Criteria andAcmsgEqualTo(String value) {
            addCriterion("acmsg =", value, "acmsg");
            return (Criteria) this;
        }

        public Criteria andAcmsgNotEqualTo(String value) {
            addCriterion("acmsg <>", value, "acmsg");
            return (Criteria) this;
        }

        public Criteria andAcmsgGreaterThan(String value) {
            addCriterion("acmsg >", value, "acmsg");
            return (Criteria) this;
        }

        public Criteria andAcmsgGreaterThanOrEqualTo(String value) {
            addCriterion("acmsg >=", value, "acmsg");
            return (Criteria) this;
        }

        public Criteria andAcmsgLessThan(String value) {
            addCriterion("acmsg <", value, "acmsg");
            return (Criteria) this;
        }

        public Criteria andAcmsgLessThanOrEqualTo(String value) {
            addCriterion("acmsg <=", value, "acmsg");
            return (Criteria) this;
        }

        public Criteria andAcmsgLike(String value) {
            addCriterion("acmsg like", value, "acmsg");
            return (Criteria) this;
        }

        public Criteria andAcmsgNotLike(String value) {
            addCriterion("acmsg not like", value, "acmsg");
            return (Criteria) this;
        }

        public Criteria andAcmsgIn(List<String> values) {
            addCriterion("acmsg in", values, "acmsg");
            return (Criteria) this;
        }

        public Criteria andAcmsgNotIn(List<String> values) {
            addCriterion("acmsg not in", values, "acmsg");
            return (Criteria) this;
        }

        public Criteria andAcmsgBetween(String value1, String value2) {
            addCriterion("acmsg between", value1, value2, "acmsg");
            return (Criteria) this;
        }

        public Criteria andAcmsgNotBetween(String value1, String value2) {
            addCriterion("acmsg not between", value1, value2, "acmsg");
            return (Criteria) this;
        }

        public Criteria andMimageIsNull() {
            addCriterion("mimage is null");
            return (Criteria) this;
        }

        public Criteria andMimageIsNotNull() {
            addCriterion("mimage is not null");
            return (Criteria) this;
        }

        public Criteria andMimageEqualTo(String value) {
            addCriterion("mimage =", value, "mimage");
            return (Criteria) this;
        }

        public Criteria andMimageNotEqualTo(String value) {
            addCriterion("mimage <>", value, "mimage");
            return (Criteria) this;
        }

        public Criteria andMimageGreaterThan(String value) {
            addCriterion("mimage >", value, "mimage");
            return (Criteria) this;
        }

        public Criteria andMimageGreaterThanOrEqualTo(String value) {
            addCriterion("mimage >=", value, "mimage");
            return (Criteria) this;
        }

        public Criteria andMimageLessThan(String value) {
            addCriterion("mimage <", value, "mimage");
            return (Criteria) this;
        }

        public Criteria andMimageLessThanOrEqualTo(String value) {
            addCriterion("mimage <=", value, "mimage");
            return (Criteria) this;
        }

        public Criteria andMimageLike(String value) {
            addCriterion("mimage like", value, "mimage");
            return (Criteria) this;
        }

        public Criteria andMimageNotLike(String value) {
            addCriterion("mimage not like", value, "mimage");
            return (Criteria) this;
        }

        public Criteria andMimageIn(List<String> values) {
            addCriterion("mimage in", values, "mimage");
            return (Criteria) this;
        }

        public Criteria andMimageNotIn(List<String> values) {
            addCriterion("mimage not in", values, "mimage");
            return (Criteria) this;
        }

        public Criteria andMimageBetween(String value1, String value2) {
            addCriterion("mimage between", value1, value2, "mimage");
            return (Criteria) this;
        }

        public Criteria andMimageNotBetween(String value1, String value2) {
            addCriterion("mimage not between", value1, value2, "mimage");
            return (Criteria) this;
        }

        public Criteria andCredateIsNull() {
            addCriterion("credate is null");
            return (Criteria) this;
        }

        public Criteria andCredateIsNotNull() {
            addCriterion("credate is not null");
            return (Criteria) this;
        }

        public Criteria andCredateEqualTo(Date value) {
            addCriterionForJDBCDate("credate =", value, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateNotEqualTo(Date value) {
            addCriterionForJDBCDate("credate <>", value, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateGreaterThan(Date value) {
            addCriterionForJDBCDate("credate >", value, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("credate >=", value, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateLessThan(Date value) {
            addCriterionForJDBCDate("credate <", value, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("credate <=", value, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateIn(List<Date> values) {
            addCriterionForJDBCDate("credate in", values, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateNotIn(List<Date> values) {
            addCriterionForJDBCDate("credate not in", values, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("credate between", value1, value2, "credate");
            return (Criteria) this;
        }

        public Criteria andCredateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("credate not between", value1, value2, "credate");
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