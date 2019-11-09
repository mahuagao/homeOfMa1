package com.mhg.pojo;

import java.util.ArrayList;
import java.util.List;

public class AuthFunctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthFunctionExample() {
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

        public Criteria andAuthidIsNull() {
            addCriterion("authid is null");
            return (Criteria) this;
        }

        public Criteria andAuthidIsNotNull() {
            addCriterion("authid is not null");
            return (Criteria) this;
        }

        public Criteria andAuthidEqualTo(Long value) {
            addCriterion("authid =", value, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidNotEqualTo(Long value) {
            addCriterion("authid <>", value, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidGreaterThan(Long value) {
            addCriterion("authid >", value, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidGreaterThanOrEqualTo(Long value) {
            addCriterion("authid >=", value, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidLessThan(Long value) {
            addCriterion("authid <", value, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidLessThanOrEqualTo(Long value) {
            addCriterion("authid <=", value, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidIn(List<Long> values) {
            addCriterion("authid in", values, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidNotIn(List<Long> values) {
            addCriterion("authid not in", values, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidBetween(Long value1, Long value2) {
            addCriterion("authid between", value1, value2, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthidNotBetween(Long value1, Long value2) {
            addCriterion("authid not between", value1, value2, "authid");
            return (Criteria) this;
        }

        public Criteria andAuthtypeIsNull() {
            addCriterion("authtype is null");
            return (Criteria) this;
        }

        public Criteria andAuthtypeIsNotNull() {
            addCriterion("authtype is not null");
            return (Criteria) this;
        }

        public Criteria andAuthtypeEqualTo(String value) {
            addCriterion("authtype =", value, "authtype");
            return (Criteria) this;
        }

        public Criteria andAuthtypeNotEqualTo(String value) {
            addCriterion("authtype <>", value, "authtype");
            return (Criteria) this;
        }

        public Criteria andAuthtypeGreaterThan(String value) {
            addCriterion("authtype >", value, "authtype");
            return (Criteria) this;
        }

        public Criteria andAuthtypeGreaterThanOrEqualTo(String value) {
            addCriterion("authtype >=", value, "authtype");
            return (Criteria) this;
        }

        public Criteria andAuthtypeLessThan(String value) {
            addCriterion("authtype <", value, "authtype");
            return (Criteria) this;
        }

        public Criteria andAuthtypeLessThanOrEqualTo(String value) {
            addCriterion("authtype <=", value, "authtype");
            return (Criteria) this;
        }

        public Criteria andAuthtypeLike(String value) {
            addCriterion("authtype like", value, "authtype");
            return (Criteria) this;
        }

        public Criteria andAuthtypeNotLike(String value) {
            addCriterion("authtype not like", value, "authtype");
            return (Criteria) this;
        }

        public Criteria andAuthtypeIn(List<String> values) {
            addCriterion("authtype in", values, "authtype");
            return (Criteria) this;
        }

        public Criteria andAuthtypeNotIn(List<String> values) {
            addCriterion("authtype not in", values, "authtype");
            return (Criteria) this;
        }

        public Criteria andAuthtypeBetween(String value1, String value2) {
            addCriterion("authtype between", value1, value2, "authtype");
            return (Criteria) this;
        }

        public Criteria andAuthtypeNotBetween(String value1, String value2) {
            addCriterion("authtype not between", value1, value2, "authtype");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNull() {
            addCriterion("roleid is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("roleid is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(Long value) {
            addCriterion("roleid =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(Long value) {
            addCriterion("roleid <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(Long value) {
            addCriterion("roleid >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(Long value) {
            addCriterion("roleid >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(Long value) {
            addCriterion("roleid <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(Long value) {
            addCriterion("roleid <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<Long> values) {
            addCriterion("roleid in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<Long> values) {
            addCriterion("roleid not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(Long value1, Long value2) {
            addCriterion("roleid between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(Long value1, Long value2) {
            addCriterion("roleid not between", value1, value2, "roleid");
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