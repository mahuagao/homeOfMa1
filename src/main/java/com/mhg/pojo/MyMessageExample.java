package com.mhg.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MyMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MyMessageExample() {
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

        public Criteria andMeidIsNull() {
            addCriterion("meid is null");
            return (Criteria) this;
        }

        public Criteria andMeidIsNotNull() {
            addCriterion("meid is not null");
            return (Criteria) this;
        }

        public Criteria andMeidEqualTo(Integer value) {
            addCriterion("meid =", value, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidNotEqualTo(Integer value) {
            addCriterion("meid <>", value, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidGreaterThan(Integer value) {
            addCriterion("meid >", value, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("meid >=", value, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidLessThan(Integer value) {
            addCriterion("meid <", value, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidLessThanOrEqualTo(Integer value) {
            addCriterion("meid <=", value, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidIn(List<Integer> values) {
            addCriterion("meid in", values, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidNotIn(List<Integer> values) {
            addCriterion("meid not in", values, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidBetween(Integer value1, Integer value2) {
            addCriterion("meid between", value1, value2, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidNotBetween(Integer value1, Integer value2) {
            addCriterion("meid not between", value1, value2, "meid");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andSouipIsNull() {
            addCriterion("souip is null");
            return (Criteria) this;
        }

        public Criteria andSouipIsNotNull() {
            addCriterion("souip is not null");
            return (Criteria) this;
        }

        public Criteria andSouipEqualTo(String value) {
            addCriterion("souip =", value, "souip");
            return (Criteria) this;
        }

        public Criteria andSouipNotEqualTo(String value) {
            addCriterion("souip <>", value, "souip");
            return (Criteria) this;
        }

        public Criteria andSouipGreaterThan(String value) {
            addCriterion("souip >", value, "souip");
            return (Criteria) this;
        }

        public Criteria andSouipGreaterThanOrEqualTo(String value) {
            addCriterion("souip >=", value, "souip");
            return (Criteria) this;
        }

        public Criteria andSouipLessThan(String value) {
            addCriterion("souip <", value, "souip");
            return (Criteria) this;
        }

        public Criteria andSouipLessThanOrEqualTo(String value) {
            addCriterion("souip <=", value, "souip");
            return (Criteria) this;
        }

        public Criteria andSouipLike(String value) {
            addCriterion("souip like", value, "souip");
            return (Criteria) this;
        }

        public Criteria andSouipNotLike(String value) {
            addCriterion("souip not like", value, "souip");
            return (Criteria) this;
        }

        public Criteria andSouipIn(List<String> values) {
            addCriterion("souip in", values, "souip");
            return (Criteria) this;
        }

        public Criteria andSouipNotIn(List<String> values) {
            addCriterion("souip not in", values, "souip");
            return (Criteria) this;
        }

        public Criteria andSouipBetween(String value1, String value2) {
            addCriterion("souip between", value1, value2, "souip");
            return (Criteria) this;
        }

        public Criteria andSouipNotBetween(String value1, String value2) {
            addCriterion("souip not between", value1, value2, "souip");
            return (Criteria) this;
        }

        public Criteria andMessdateIsNull() {
            addCriterion("messdate is null");
            return (Criteria) this;
        }

        public Criteria andMessdateIsNotNull() {
            addCriterion("messdate is not null");
            return (Criteria) this;
        }

        public Criteria andMessdateEqualTo(Date value) {
            addCriterion("messdate =", value, "messdate");
            return (Criteria) this;
        }

        public Criteria andMessdateNotEqualTo(Date value) {
            addCriterion("messdate <>", value, "messdate");
            return (Criteria) this;
        }

        public Criteria andMessdateGreaterThan(Date value) {
            addCriterion("messdate >", value, "messdate");
            return (Criteria) this;
        }

        public Criteria andMessdateGreaterThanOrEqualTo(Date value) {
            addCriterion("messdate >=", value, "messdate");
            return (Criteria) this;
        }

        public Criteria andMessdateLessThan(Date value) {
            addCriterion("messdate <", value, "messdate");
            return (Criteria) this;
        }

        public Criteria andMessdateLessThanOrEqualTo(Date value) {
            addCriterion("messdate <=", value, "messdate");
            return (Criteria) this;
        }

        public Criteria andMessdateIn(List<Date> values) {
            addCriterion("messdate in", values, "messdate");
            return (Criteria) this;
        }

        public Criteria andMessdateNotIn(List<Date> values) {
            addCriterion("messdate not in", values, "messdate");
            return (Criteria) this;
        }

        public Criteria andMessdateBetween(Date value1, Date value2) {
            addCriterion("messdate between", value1, value2, "messdate");
            return (Criteria) this;
        }

        public Criteria andMessdateNotBetween(Date value1, Date value2) {
            addCriterion("messdate not between", value1, value2, "messdate");
            return (Criteria) this;
        }

        public Criteria andDearIsNull() {
            addCriterion("dear is null");
            return (Criteria) this;
        }

        public Criteria andDearIsNotNull() {
            addCriterion("dear is not null");
            return (Criteria) this;
        }

        public Criteria andDearEqualTo(String value) {
            addCriterion("dear =", value, "dear");
            return (Criteria) this;
        }

        public Criteria andDearNotEqualTo(String value) {
            addCriterion("dear <>", value, "dear");
            return (Criteria) this;
        }

        public Criteria andDearGreaterThan(String value) {
            addCriterion("dear >", value, "dear");
            return (Criteria) this;
        }

        public Criteria andDearGreaterThanOrEqualTo(String value) {
            addCriterion("dear >=", value, "dear");
            return (Criteria) this;
        }

        public Criteria andDearLessThan(String value) {
            addCriterion("dear <", value, "dear");
            return (Criteria) this;
        }

        public Criteria andDearLessThanOrEqualTo(String value) {
            addCriterion("dear <=", value, "dear");
            return (Criteria) this;
        }

        public Criteria andDearLike(String value) {
            addCriterion("dear like", value, "dear");
            return (Criteria) this;
        }

        public Criteria andDearNotLike(String value) {
            addCriterion("dear not like", value, "dear");
            return (Criteria) this;
        }

        public Criteria andDearIn(List<String> values) {
            addCriterion("dear in", values, "dear");
            return (Criteria) this;
        }

        public Criteria andDearNotIn(List<String> values) {
            addCriterion("dear not in", values, "dear");
            return (Criteria) this;
        }

        public Criteria andDearBetween(String value1, String value2) {
            addCriterion("dear between", value1, value2, "dear");
            return (Criteria) this;
        }

        public Criteria andDearNotBetween(String value1, String value2) {
            addCriterion("dear not between", value1, value2, "dear");
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