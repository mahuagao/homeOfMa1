package com.mhg.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MyResumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MyResumExample() {
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

        public Criteria andInameIsNull() {
            addCriterion("iname is null");
            return (Criteria) this;
        }

        public Criteria andInameIsNotNull() {
            addCriterion("iname is not null");
            return (Criteria) this;
        }

        public Criteria andInameEqualTo(String value) {
            addCriterion("iname =", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameNotEqualTo(String value) {
            addCriterion("iname <>", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameGreaterThan(String value) {
            addCriterion("iname >", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameGreaterThanOrEqualTo(String value) {
            addCriterion("iname >=", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameLessThan(String value) {
            addCriterion("iname <", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameLessThanOrEqualTo(String value) {
            addCriterion("iname <=", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameLike(String value) {
            addCriterion("iname like", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameNotLike(String value) {
            addCriterion("iname not like", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameIn(List<String> values) {
            addCriterion("iname in", values, "iname");
            return (Criteria) this;
        }

        public Criteria andInameNotIn(List<String> values) {
            addCriterion("iname not in", values, "iname");
            return (Criteria) this;
        }

        public Criteria andInameBetween(String value1, String value2) {
            addCriterion("iname between", value1, value2, "iname");
            return (Criteria) this;
        }

        public Criteria andInameNotBetween(String value1, String value2) {
            addCriterion("iname not between", value1, value2, "iname");
            return (Criteria) this;
        }

        public Criteria andIsexIsNull() {
            addCriterion("isex is null");
            return (Criteria) this;
        }

        public Criteria andIsexIsNotNull() {
            addCriterion("isex is not null");
            return (Criteria) this;
        }

        public Criteria andIsexEqualTo(String value) {
            addCriterion("isex =", value, "isex");
            return (Criteria) this;
        }

        public Criteria andIsexNotEqualTo(String value) {
            addCriterion("isex <>", value, "isex");
            return (Criteria) this;
        }

        public Criteria andIsexGreaterThan(String value) {
            addCriterion("isex >", value, "isex");
            return (Criteria) this;
        }

        public Criteria andIsexGreaterThanOrEqualTo(String value) {
            addCriterion("isex >=", value, "isex");
            return (Criteria) this;
        }

        public Criteria andIsexLessThan(String value) {
            addCriterion("isex <", value, "isex");
            return (Criteria) this;
        }

        public Criteria andIsexLessThanOrEqualTo(String value) {
            addCriterion("isex <=", value, "isex");
            return (Criteria) this;
        }

        public Criteria andIsexLike(String value) {
            addCriterion("isex like", value, "isex");
            return (Criteria) this;
        }

        public Criteria andIsexNotLike(String value) {
            addCriterion("isex not like", value, "isex");
            return (Criteria) this;
        }

        public Criteria andIsexIn(List<String> values) {
            addCriterion("isex in", values, "isex");
            return (Criteria) this;
        }

        public Criteria andIsexNotIn(List<String> values) {
            addCriterion("isex not in", values, "isex");
            return (Criteria) this;
        }

        public Criteria andIsexBetween(String value1, String value2) {
            addCriterion("isex between", value1, value2, "isex");
            return (Criteria) this;
        }

        public Criteria andIsexNotBetween(String value1, String value2) {
            addCriterion("isex not between", value1, value2, "isex");
            return (Criteria) this;
        }

        public Criteria andEducateIsNull() {
            addCriterion("educate is null");
            return (Criteria) this;
        }

        public Criteria andEducateIsNotNull() {
            addCriterion("educate is not null");
            return (Criteria) this;
        }

        public Criteria andEducateEqualTo(String value) {
            addCriterion("educate =", value, "educate");
            return (Criteria) this;
        }

        public Criteria andEducateNotEqualTo(String value) {
            addCriterion("educate <>", value, "educate");
            return (Criteria) this;
        }

        public Criteria andEducateGreaterThan(String value) {
            addCriterion("educate >", value, "educate");
            return (Criteria) this;
        }

        public Criteria andEducateGreaterThanOrEqualTo(String value) {
            addCriterion("educate >=", value, "educate");
            return (Criteria) this;
        }

        public Criteria andEducateLessThan(String value) {
            addCriterion("educate <", value, "educate");
            return (Criteria) this;
        }

        public Criteria andEducateLessThanOrEqualTo(String value) {
            addCriterion("educate <=", value, "educate");
            return (Criteria) this;
        }

        public Criteria andEducateLike(String value) {
            addCriterion("educate like", value, "educate");
            return (Criteria) this;
        }

        public Criteria andEducateNotLike(String value) {
            addCriterion("educate not like", value, "educate");
            return (Criteria) this;
        }

        public Criteria andEducateIn(List<String> values) {
            addCriterion("educate in", values, "educate");
            return (Criteria) this;
        }

        public Criteria andEducateNotIn(List<String> values) {
            addCriterion("educate not in", values, "educate");
            return (Criteria) this;
        }

        public Criteria andEducateBetween(String value1, String value2) {
            addCriterion("educate between", value1, value2, "educate");
            return (Criteria) this;
        }

        public Criteria andEducateNotBetween(String value1, String value2) {
            addCriterion("educate not between", value1, value2, "educate");
            return (Criteria) this;
        }

        public Criteria andImgpathIsNull() {
            addCriterion("imgpath is null");
            return (Criteria) this;
        }

        public Criteria andImgpathIsNotNull() {
            addCriterion("imgpath is not null");
            return (Criteria) this;
        }

        public Criteria andImgpathEqualTo(String value) {
            addCriterion("imgpath =", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathNotEqualTo(String value) {
            addCriterion("imgpath <>", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathGreaterThan(String value) {
            addCriterion("imgpath >", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathGreaterThanOrEqualTo(String value) {
            addCriterion("imgpath >=", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathLessThan(String value) {
            addCriterion("imgpath <", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathLessThanOrEqualTo(String value) {
            addCriterion("imgpath <=", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathLike(String value) {
            addCriterion("imgpath like", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathNotLike(String value) {
            addCriterion("imgpath not like", value, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathIn(List<String> values) {
            addCriterion("imgpath in", values, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathNotIn(List<String> values) {
            addCriterion("imgpath not in", values, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathBetween(String value1, String value2) {
            addCriterion("imgpath between", value1, value2, "imgpath");
            return (Criteria) this;
        }

        public Criteria andImgpathNotBetween(String value1, String value2) {
            addCriterion("imgpath not between", value1, value2, "imgpath");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andHealthIsNull() {
            addCriterion("health is null");
            return (Criteria) this;
        }

        public Criteria andHealthIsNotNull() {
            addCriterion("health is not null");
            return (Criteria) this;
        }

        public Criteria andHealthEqualTo(String value) {
            addCriterion("health =", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotEqualTo(String value) {
            addCriterion("health <>", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthGreaterThan(String value) {
            addCriterion("health >", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthGreaterThanOrEqualTo(String value) {
            addCriterion("health >=", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLessThan(String value) {
            addCriterion("health <", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLessThanOrEqualTo(String value) {
            addCriterion("health <=", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLike(String value) {
            addCriterion("health like", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotLike(String value) {
            addCriterion("health not like", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthIn(List<String> values) {
            addCriterion("health in", values, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotIn(List<String> values) {
            addCriterion("health not in", values, "health");
            return (Criteria) this;
        }

        public Criteria andHealthBetween(String value1, String value2) {
            addCriterion("health between", value1, value2, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotBetween(String value1, String value2) {
            addCriterion("health not between", value1, value2, "health");
            return (Criteria) this;
        }

        public Criteria andMajortypeIsNull() {
            addCriterion("majortype is null");
            return (Criteria) this;
        }

        public Criteria andMajortypeIsNotNull() {
            addCriterion("majortype is not null");
            return (Criteria) this;
        }

        public Criteria andMajortypeEqualTo(String value) {
            addCriterion("majortype =", value, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeNotEqualTo(String value) {
            addCriterion("majortype <>", value, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeGreaterThan(String value) {
            addCriterion("majortype >", value, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeGreaterThanOrEqualTo(String value) {
            addCriterion("majortype >=", value, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeLessThan(String value) {
            addCriterion("majortype <", value, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeLessThanOrEqualTo(String value) {
            addCriterion("majortype <=", value, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeLike(String value) {
            addCriterion("majortype like", value, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeNotLike(String value) {
            addCriterion("majortype not like", value, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeIn(List<String> values) {
            addCriterion("majortype in", values, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeNotIn(List<String> values) {
            addCriterion("majortype not in", values, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeBetween(String value1, String value2) {
            addCriterion("majortype between", value1, value2, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeNotBetween(String value1, String value2) {
            addCriterion("majortype not between", value1, value2, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andMarryIsNull() {
            addCriterion("marry is null");
            return (Criteria) this;
        }

        public Criteria andMarryIsNotNull() {
            addCriterion("marry is not null");
            return (Criteria) this;
        }

        public Criteria andMarryEqualTo(String value) {
            addCriterion("marry =", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotEqualTo(String value) {
            addCriterion("marry <>", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryGreaterThan(String value) {
            addCriterion("marry >", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryGreaterThanOrEqualTo(String value) {
            addCriterion("marry >=", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryLessThan(String value) {
            addCriterion("marry <", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryLessThanOrEqualTo(String value) {
            addCriterion("marry <=", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryLike(String value) {
            addCriterion("marry like", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotLike(String value) {
            addCriterion("marry not like", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryIn(List<String> values) {
            addCriterion("marry in", values, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotIn(List<String> values) {
            addCriterion("marry not in", values, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryBetween(String value1, String value2) {
            addCriterion("marry between", value1, value2, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotBetween(String value1, String value2) {
            addCriterion("marry not between", value1, value2, "marry");
            return (Criteria) this;
        }

        public Criteria andGradutedateIsNull() {
            addCriterion("gradutedate is null");
            return (Criteria) this;
        }

        public Criteria andGradutedateIsNotNull() {
            addCriterion("gradutedate is not null");
            return (Criteria) this;
        }

        public Criteria andGradutedateEqualTo(Date value) {
            addCriterionForJDBCDate("gradutedate =", value, "gradutedate");
            return (Criteria) this;
        }

        public Criteria andGradutedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("gradutedate <>", value, "gradutedate");
            return (Criteria) this;
        }

        public Criteria andGradutedateGreaterThan(Date value) {
            addCriterionForJDBCDate("gradutedate >", value, "gradutedate");
            return (Criteria) this;
        }

        public Criteria andGradutedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gradutedate >=", value, "gradutedate");
            return (Criteria) this;
        }

        public Criteria andGradutedateLessThan(Date value) {
            addCriterionForJDBCDate("gradutedate <", value, "gradutedate");
            return (Criteria) this;
        }

        public Criteria andGradutedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gradutedate <=", value, "gradutedate");
            return (Criteria) this;
        }

        public Criteria andGradutedateIn(List<Date> values) {
            addCriterionForJDBCDate("gradutedate in", values, "gradutedate");
            return (Criteria) this;
        }

        public Criteria andGradutedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("gradutedate not in", values, "gradutedate");
            return (Criteria) this;
        }

        public Criteria andGradutedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gradutedate between", value1, value2, "gradutedate");
            return (Criteria) this;
        }

        public Criteria andGradutedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gradutedate not between", value1, value2, "gradutedate");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andFacultyIsNull() {
            addCriterion("faculty is null");
            return (Criteria) this;
        }

        public Criteria andFacultyIsNotNull() {
            addCriterion("faculty is not null");
            return (Criteria) this;
        }

        public Criteria andFacultyEqualTo(String value) {
            addCriterion("faculty =", value, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyNotEqualTo(String value) {
            addCriterion("faculty <>", value, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyGreaterThan(String value) {
            addCriterion("faculty >", value, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyGreaterThanOrEqualTo(String value) {
            addCriterion("faculty >=", value, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyLessThan(String value) {
            addCriterion("faculty <", value, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyLessThanOrEqualTo(String value) {
            addCriterion("faculty <=", value, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyLike(String value) {
            addCriterion("faculty like", value, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyNotLike(String value) {
            addCriterion("faculty not like", value, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyIn(List<String> values) {
            addCriterion("faculty in", values, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyNotIn(List<String> values) {
            addCriterion("faculty not in", values, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyBetween(String value1, String value2) {
            addCriterion("faculty between", value1, value2, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyNotBetween(String value1, String value2) {
            addCriterion("faculty not between", value1, value2, "faculty");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andCplevelIsNull() {
            addCriterion("cplevel is null");
            return (Criteria) this;
        }

        public Criteria andCplevelIsNotNull() {
            addCriterion("cplevel is not null");
            return (Criteria) this;
        }

        public Criteria andCplevelEqualTo(String value) {
            addCriterion("cplevel =", value, "cplevel");
            return (Criteria) this;
        }

        public Criteria andCplevelNotEqualTo(String value) {
            addCriterion("cplevel <>", value, "cplevel");
            return (Criteria) this;
        }

        public Criteria andCplevelGreaterThan(String value) {
            addCriterion("cplevel >", value, "cplevel");
            return (Criteria) this;
        }

        public Criteria andCplevelGreaterThanOrEqualTo(String value) {
            addCriterion("cplevel >=", value, "cplevel");
            return (Criteria) this;
        }

        public Criteria andCplevelLessThan(String value) {
            addCriterion("cplevel <", value, "cplevel");
            return (Criteria) this;
        }

        public Criteria andCplevelLessThanOrEqualTo(String value) {
            addCriterion("cplevel <=", value, "cplevel");
            return (Criteria) this;
        }

        public Criteria andCplevelLike(String value) {
            addCriterion("cplevel like", value, "cplevel");
            return (Criteria) this;
        }

        public Criteria andCplevelNotLike(String value) {
            addCriterion("cplevel not like", value, "cplevel");
            return (Criteria) this;
        }

        public Criteria andCplevelIn(List<String> values) {
            addCriterion("cplevel in", values, "cplevel");
            return (Criteria) this;
        }

        public Criteria andCplevelNotIn(List<String> values) {
            addCriterion("cplevel not in", values, "cplevel");
            return (Criteria) this;
        }

        public Criteria andCplevelBetween(String value1, String value2) {
            addCriterion("cplevel between", value1, value2, "cplevel");
            return (Criteria) this;
        }

        public Criteria andCplevelNotBetween(String value1, String value2) {
            addCriterion("cplevel not between", value1, value2, "cplevel");
            return (Criteria) this;
        }

        public Criteria andMypageIsNull() {
            addCriterion("mypage is null");
            return (Criteria) this;
        }

        public Criteria andMypageIsNotNull() {
            addCriterion("mypage is not null");
            return (Criteria) this;
        }

        public Criteria andMypageEqualTo(String value) {
            addCriterion("mypage =", value, "mypage");
            return (Criteria) this;
        }

        public Criteria andMypageNotEqualTo(String value) {
            addCriterion("mypage <>", value, "mypage");
            return (Criteria) this;
        }

        public Criteria andMypageGreaterThan(String value) {
            addCriterion("mypage >", value, "mypage");
            return (Criteria) this;
        }

        public Criteria andMypageGreaterThanOrEqualTo(String value) {
            addCriterion("mypage >=", value, "mypage");
            return (Criteria) this;
        }

        public Criteria andMypageLessThan(String value) {
            addCriterion("mypage <", value, "mypage");
            return (Criteria) this;
        }

        public Criteria andMypageLessThanOrEqualTo(String value) {
            addCriterion("mypage <=", value, "mypage");
            return (Criteria) this;
        }

        public Criteria andMypageLike(String value) {
            addCriterion("mypage like", value, "mypage");
            return (Criteria) this;
        }

        public Criteria andMypageNotLike(String value) {
            addCriterion("mypage not like", value, "mypage");
            return (Criteria) this;
        }

        public Criteria andMypageIn(List<String> values) {
            addCriterion("mypage in", values, "mypage");
            return (Criteria) this;
        }

        public Criteria andMypageNotIn(List<String> values) {
            addCriterion("mypage not in", values, "mypage");
            return (Criteria) this;
        }

        public Criteria andMypageBetween(String value1, String value2) {
            addCriterion("mypage between", value1, value2, "mypage");
            return (Criteria) this;
        }

        public Criteria andMypageNotBetween(String value1, String value2) {
            addCriterion("mypage not between", value1, value2, "mypage");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andQqnumIsNull() {
            addCriterion("qqnum is null");
            return (Criteria) this;
        }

        public Criteria andQqnumIsNotNull() {
            addCriterion("qqnum is not null");
            return (Criteria) this;
        }

        public Criteria andQqnumEqualTo(String value) {
            addCriterion("qqnum =", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumNotEqualTo(String value) {
            addCriterion("qqnum <>", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumGreaterThan(String value) {
            addCriterion("qqnum >", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumGreaterThanOrEqualTo(String value) {
            addCriterion("qqnum >=", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumLessThan(String value) {
            addCriterion("qqnum <", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumLessThanOrEqualTo(String value) {
            addCriterion("qqnum <=", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumLike(String value) {
            addCriterion("qqnum like", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumNotLike(String value) {
            addCriterion("qqnum not like", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumIn(List<String> values) {
            addCriterion("qqnum in", values, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumNotIn(List<String> values) {
            addCriterion("qqnum not in", values, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumBetween(String value1, String value2) {
            addCriterion("qqnum between", value1, value2, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumNotBetween(String value1, String value2) {
            addCriterion("qqnum not between", value1, value2, "qqnum");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNull() {
            addCriterion("weixin is null");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNotNull() {
            addCriterion("weixin is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinEqualTo(String value) {
            addCriterion("weixin =", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotEqualTo(String value) {
            addCriterion("weixin <>", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThan(String value) {
            addCriterion("weixin >", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("weixin >=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThan(String value) {
            addCriterion("weixin <", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThanOrEqualTo(String value) {
            addCriterion("weixin <=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLike(String value) {
            addCriterion("weixin like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotLike(String value) {
            addCriterion("weixin not like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIn(List<String> values) {
            addCriterion("weixin in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotIn(List<String> values) {
            addCriterion("weixin not in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinBetween(String value1, String value2) {
            addCriterion("weixin between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotBetween(String value1, String value2) {
            addCriterion("weixin not between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andFindjobIsNull() {
            addCriterion("findjob is null");
            return (Criteria) this;
        }

        public Criteria andFindjobIsNotNull() {
            addCriterion("findjob is not null");
            return (Criteria) this;
        }

        public Criteria andFindjobEqualTo(String value) {
            addCriterion("findjob =", value, "findjob");
            return (Criteria) this;
        }

        public Criteria andFindjobNotEqualTo(String value) {
            addCriterion("findjob <>", value, "findjob");
            return (Criteria) this;
        }

        public Criteria andFindjobGreaterThan(String value) {
            addCriterion("findjob >", value, "findjob");
            return (Criteria) this;
        }

        public Criteria andFindjobGreaterThanOrEqualTo(String value) {
            addCriterion("findjob >=", value, "findjob");
            return (Criteria) this;
        }

        public Criteria andFindjobLessThan(String value) {
            addCriterion("findjob <", value, "findjob");
            return (Criteria) this;
        }

        public Criteria andFindjobLessThanOrEqualTo(String value) {
            addCriterion("findjob <=", value, "findjob");
            return (Criteria) this;
        }

        public Criteria andFindjobLike(String value) {
            addCriterion("findjob like", value, "findjob");
            return (Criteria) this;
        }

        public Criteria andFindjobNotLike(String value) {
            addCriterion("findjob not like", value, "findjob");
            return (Criteria) this;
        }

        public Criteria andFindjobIn(List<String> values) {
            addCriterion("findjob in", values, "findjob");
            return (Criteria) this;
        }

        public Criteria andFindjobNotIn(List<String> values) {
            addCriterion("findjob not in", values, "findjob");
            return (Criteria) this;
        }

        public Criteria andFindjobBetween(String value1, String value2) {
            addCriterion("findjob between", value1, value2, "findjob");
            return (Criteria) this;
        }

        public Criteria andFindjobNotBetween(String value1, String value2) {
            addCriterion("findjob not between", value1, value2, "findjob");
            return (Criteria) this;
        }

        public Criteria andTechnologyIsNull() {
            addCriterion("technology is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyIsNotNull() {
            addCriterion("technology is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyEqualTo(String value) {
            addCriterion("technology =", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyNotEqualTo(String value) {
            addCriterion("technology <>", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyGreaterThan(String value) {
            addCriterion("technology >", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyGreaterThanOrEqualTo(String value) {
            addCriterion("technology >=", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyLessThan(String value) {
            addCriterion("technology <", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyLessThanOrEqualTo(String value) {
            addCriterion("technology <=", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyLike(String value) {
            addCriterion("technology like", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyNotLike(String value) {
            addCriterion("technology not like", value, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyIn(List<String> values) {
            addCriterion("technology in", values, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyNotIn(List<String> values) {
            addCriterion("technology not in", values, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyBetween(String value1, String value2) {
            addCriterion("technology between", value1, value2, "technology");
            return (Criteria) this;
        }

        public Criteria andTechnologyNotBetween(String value1, String value2) {
            addCriterion("technology not between", value1, value2, "technology");
            return (Criteria) this;
        }

        public Criteria andDevtoolIsNull() {
            addCriterion("devtool is null");
            return (Criteria) this;
        }

        public Criteria andDevtoolIsNotNull() {
            addCriterion("devtool is not null");
            return (Criteria) this;
        }

        public Criteria andDevtoolEqualTo(String value) {
            addCriterion("devtool =", value, "devtool");
            return (Criteria) this;
        }

        public Criteria andDevtoolNotEqualTo(String value) {
            addCriterion("devtool <>", value, "devtool");
            return (Criteria) this;
        }

        public Criteria andDevtoolGreaterThan(String value) {
            addCriterion("devtool >", value, "devtool");
            return (Criteria) this;
        }

        public Criteria andDevtoolGreaterThanOrEqualTo(String value) {
            addCriterion("devtool >=", value, "devtool");
            return (Criteria) this;
        }

        public Criteria andDevtoolLessThan(String value) {
            addCriterion("devtool <", value, "devtool");
            return (Criteria) this;
        }

        public Criteria andDevtoolLessThanOrEqualTo(String value) {
            addCriterion("devtool <=", value, "devtool");
            return (Criteria) this;
        }

        public Criteria andDevtoolLike(String value) {
            addCriterion("devtool like", value, "devtool");
            return (Criteria) this;
        }

        public Criteria andDevtoolNotLike(String value) {
            addCriterion("devtool not like", value, "devtool");
            return (Criteria) this;
        }

        public Criteria andDevtoolIn(List<String> values) {
            addCriterion("devtool in", values, "devtool");
            return (Criteria) this;
        }

        public Criteria andDevtoolNotIn(List<String> values) {
            addCriterion("devtool not in", values, "devtool");
            return (Criteria) this;
        }

        public Criteria andDevtoolBetween(String value1, String value2) {
            addCriterion("devtool between", value1, value2, "devtool");
            return (Criteria) this;
        }

        public Criteria andDevtoolNotBetween(String value1, String value2) {
            addCriterion("devtool not between", value1, value2, "devtool");
            return (Criteria) this;
        }

        public Criteria andEdubackIsNull() {
            addCriterion("eduback is null");
            return (Criteria) this;
        }

        public Criteria andEdubackIsNotNull() {
            addCriterion("eduback is not null");
            return (Criteria) this;
        }

        public Criteria andEdubackEqualTo(String value) {
            addCriterion("eduback =", value, "eduback");
            return (Criteria) this;
        }

        public Criteria andEdubackNotEqualTo(String value) {
            addCriterion("eduback <>", value, "eduback");
            return (Criteria) this;
        }

        public Criteria andEdubackGreaterThan(String value) {
            addCriterion("eduback >", value, "eduback");
            return (Criteria) this;
        }

        public Criteria andEdubackGreaterThanOrEqualTo(String value) {
            addCriterion("eduback >=", value, "eduback");
            return (Criteria) this;
        }

        public Criteria andEdubackLessThan(String value) {
            addCriterion("eduback <", value, "eduback");
            return (Criteria) this;
        }

        public Criteria andEdubackLessThanOrEqualTo(String value) {
            addCriterion("eduback <=", value, "eduback");
            return (Criteria) this;
        }

        public Criteria andEdubackLike(String value) {
            addCriterion("eduback like", value, "eduback");
            return (Criteria) this;
        }

        public Criteria andEdubackNotLike(String value) {
            addCriterion("eduback not like", value, "eduback");
            return (Criteria) this;
        }

        public Criteria andEdubackIn(List<String> values) {
            addCriterion("eduback in", values, "eduback");
            return (Criteria) this;
        }

        public Criteria andEdubackNotIn(List<String> values) {
            addCriterion("eduback not in", values, "eduback");
            return (Criteria) this;
        }

        public Criteria andEdubackBetween(String value1, String value2) {
            addCriterion("eduback between", value1, value2, "eduback");
            return (Criteria) this;
        }

        public Criteria andEdubackNotBetween(String value1, String value2) {
            addCriterion("eduback not between", value1, value2, "eduback");
            return (Criteria) this;
        }

        public Criteria andEnglishIsNull() {
            addCriterion("english is null");
            return (Criteria) this;
        }

        public Criteria andEnglishIsNotNull() {
            addCriterion("english is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishEqualTo(String value) {
            addCriterion("english =", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotEqualTo(String value) {
            addCriterion("english <>", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishGreaterThan(String value) {
            addCriterion("english >", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishGreaterThanOrEqualTo(String value) {
            addCriterion("english >=", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishLessThan(String value) {
            addCriterion("english <", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishLessThanOrEqualTo(String value) {
            addCriterion("english <=", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishLike(String value) {
            addCriterion("english like", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotLike(String value) {
            addCriterion("english not like", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishIn(List<String> values) {
            addCriterion("english in", values, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotIn(List<String> values) {
            addCriterion("english not in", values, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishBetween(String value1, String value2) {
            addCriterion("english between", value1, value2, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotBetween(String value1, String value2) {
            addCriterion("english not between", value1, value2, "english");
            return (Criteria) this;
        }

        public Criteria andProjectIsNull() {
            addCriterion("project is null");
            return (Criteria) this;
        }

        public Criteria andProjectIsNotNull() {
            addCriterion("project is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEqualTo(String value) {
            addCriterion("project =", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotEqualTo(String value) {
            addCriterion("project <>", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThan(String value) {
            addCriterion("project >", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThanOrEqualTo(String value) {
            addCriterion("project >=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThan(String value) {
            addCriterion("project <", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThanOrEqualTo(String value) {
            addCriterion("project <=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLike(String value) {
            addCriterion("project like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotLike(String value) {
            addCriterion("project not like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectIn(List<String> values) {
            addCriterion("project in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotIn(List<String> values) {
            addCriterion("project not in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectBetween(String value1, String value2) {
            addCriterion("project between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotBetween(String value1, String value2) {
            addCriterion("project not between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andObjectIsNull() {
            addCriterion("object is null");
            return (Criteria) this;
        }

        public Criteria andObjectIsNotNull() {
            addCriterion("object is not null");
            return (Criteria) this;
        }

        public Criteria andObjectEqualTo(String value) {
            addCriterion("object =", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectNotEqualTo(String value) {
            addCriterion("object <>", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectGreaterThan(String value) {
            addCriterion("object >", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectGreaterThanOrEqualTo(String value) {
            addCriterion("object >=", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectLessThan(String value) {
            addCriterion("object <", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectLessThanOrEqualTo(String value) {
            addCriterion("object <=", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectLike(String value) {
            addCriterion("object like", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectNotLike(String value) {
            addCriterion("object not like", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectIn(List<String> values) {
            addCriterion("object in", values, "object");
            return (Criteria) this;
        }

        public Criteria andObjectNotIn(List<String> values) {
            addCriterion("object not in", values, "object");
            return (Criteria) this;
        }

        public Criteria andObjectBetween(String value1, String value2) {
            addCriterion("object between", value1, value2, "object");
            return (Criteria) this;
        }

        public Criteria andObjectNotBetween(String value1, String value2) {
            addCriterion("object not between", value1, value2, "object");
            return (Criteria) this;
        }

        public Criteria andEvaluationIsNull() {
            addCriterion("evaluation is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationIsNotNull() {
            addCriterion("evaluation is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationEqualTo(String value) {
            addCriterion("evaluation =", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationNotEqualTo(String value) {
            addCriterion("evaluation <>", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationGreaterThan(String value) {
            addCriterion("evaluation >", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationGreaterThanOrEqualTo(String value) {
            addCriterion("evaluation >=", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationLessThan(String value) {
            addCriterion("evaluation <", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationLessThanOrEqualTo(String value) {
            addCriterion("evaluation <=", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationLike(String value) {
            addCriterion("evaluation like", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationNotLike(String value) {
            addCriterion("evaluation not like", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationIn(List<String> values) {
            addCriterion("evaluation in", values, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationNotIn(List<String> values) {
            addCriterion("evaluation not in", values, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationBetween(String value1, String value2) {
            addCriterion("evaluation between", value1, value2, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationNotBetween(String value1, String value2) {
            addCriterion("evaluation not between", value1, value2, "evaluation");
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