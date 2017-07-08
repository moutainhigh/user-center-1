package com.footprint.common.model;

import com.footprint.common.config.mybatis.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DUcEntpAuditHisExample {
    /**
     * D_UC_ENTP_AUDIT_HIS
     */
    protected String orderByClause;

    /**
     * D_UC_ENTP_AUDIT_HIS
     */
    protected boolean distinct;

    /**
     * D_UC_ENTP_AUDIT_HIS
     */
    protected List<Criteria> oredCriteria;

    /**
     * D_UC_ENTP_AUDIT_HIS
     */
    protected Page page;

    public DUcEntpAuditHisExample() {
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

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
    }

    /**
     * D_UC_ENTP_AUDIT_HIS null
     */
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andVeridIsNull() {
            addCriterion("VERID is null");
            return (Criteria) this;
        }

        public Criteria andVeridIsNotNull() {
            addCriterion("VERID is not null");
            return (Criteria) this;
        }

        public Criteria andVeridEqualTo(Short value) {
            addCriterion("VERID =", value, "verid");
            return (Criteria) this;
        }

        public Criteria andVeridNotEqualTo(Short value) {
            addCriterion("VERID <>", value, "verid");
            return (Criteria) this;
        }

        public Criteria andVeridGreaterThan(Short value) {
            addCriterion("VERID >", value, "verid");
            return (Criteria) this;
        }

        public Criteria andVeridGreaterThanOrEqualTo(Short value) {
            addCriterion("VERID >=", value, "verid");
            return (Criteria) this;
        }

        public Criteria andVeridLessThan(Short value) {
            addCriterion("VERID <", value, "verid");
            return (Criteria) this;
        }

        public Criteria andVeridLessThanOrEqualTo(Short value) {
            addCriterion("VERID <=", value, "verid");
            return (Criteria) this;
        }

        public Criteria andVeridIn(List<Short> values) {
            addCriterion("VERID in", values, "verid");
            return (Criteria) this;
        }

        public Criteria andVeridNotIn(List<Short> values) {
            addCriterion("VERID not in", values, "verid");
            return (Criteria) this;
        }

        public Criteria andVeridBetween(Short value1, Short value2) {
            addCriterion("VERID between", value1, value2, "verid");
            return (Criteria) this;
        }

        public Criteria andVeridNotBetween(Short value1, Short value2) {
            addCriterion("VERID not between", value1, value2, "verid");
            return (Criteria) this;
        }

        public Criteria andEntpIdIsNull() {
            addCriterion("ENTP_ID is null");
            return (Criteria) this;
        }

        public Criteria andEntpIdIsNotNull() {
            addCriterion("ENTP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEntpIdEqualTo(String value) {
            addCriterion("ENTP_ID =", value, "entpId");
            return (Criteria) this;
        }

        public Criteria andEntpIdNotEqualTo(String value) {
            addCriterion("ENTP_ID <>", value, "entpId");
            return (Criteria) this;
        }

        public Criteria andEntpIdGreaterThan(String value) {
            addCriterion("ENTP_ID >", value, "entpId");
            return (Criteria) this;
        }

        public Criteria andEntpIdGreaterThanOrEqualTo(String value) {
            addCriterion("ENTP_ID >=", value, "entpId");
            return (Criteria) this;
        }

        public Criteria andEntpIdLessThan(String value) {
            addCriterion("ENTP_ID <", value, "entpId");
            return (Criteria) this;
        }

        public Criteria andEntpIdLessThanOrEqualTo(String value) {
            addCriterion("ENTP_ID <=", value, "entpId");
            return (Criteria) this;
        }

        public Criteria andEntpIdLike(String value) {
            addCriterion("ENTP_ID like", value, "entpId");
            return (Criteria) this;
        }

        public Criteria andEntpIdNotLike(String value) {
            addCriterion("ENTP_ID not like", value, "entpId");
            return (Criteria) this;
        }

        public Criteria andEntpIdIn(List<String> values) {
            addCriterion("ENTP_ID in", values, "entpId");
            return (Criteria) this;
        }

        public Criteria andEntpIdNotIn(List<String> values) {
            addCriterion("ENTP_ID not in", values, "entpId");
            return (Criteria) this;
        }

        public Criteria andEntpIdBetween(String value1, String value2) {
            addCriterion("ENTP_ID between", value1, value2, "entpId");
            return (Criteria) this;
        }

        public Criteria andEntpIdNotBetween(String value1, String value2) {
            addCriterion("ENTP_ID not between", value1, value2, "entpId");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIsNull() {
            addCriterion("AUDIT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIsNotNull() {
            addCriterion("AUDIT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTypeEqualTo(Short value) {
            addCriterion("AUDIT_TYPE =", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotEqualTo(Short value) {
            addCriterion("AUDIT_TYPE <>", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeGreaterThan(Short value) {
            addCriterion("AUDIT_TYPE >", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("AUDIT_TYPE >=", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeLessThan(Short value) {
            addCriterion("AUDIT_TYPE <", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeLessThanOrEqualTo(Short value) {
            addCriterion("AUDIT_TYPE <=", value, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeIn(List<Short> values) {
            addCriterion("AUDIT_TYPE in", values, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotIn(List<Short> values) {
            addCriterion("AUDIT_TYPE not in", values, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeBetween(Short value1, Short value2) {
            addCriterion("AUDIT_TYPE between", value1, value2, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditTypeNotBetween(Short value1, Short value2) {
            addCriterion("AUDIT_TYPE not between", value1, value2, "auditType");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("AUDIT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("AUDIT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(Short value) {
            addCriterion("AUDIT_STATUS =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(Short value) {
            addCriterion("AUDIT_STATUS <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(Short value) {
            addCriterion("AUDIT_STATUS >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("AUDIT_STATUS >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(Short value) {
            addCriterion("AUDIT_STATUS <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(Short value) {
            addCriterion("AUDIT_STATUS <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<Short> values) {
            addCriterion("AUDIT_STATUS in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<Short> values) {
            addCriterion("AUDIT_STATUS not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(Short value1, Short value2) {
            addCriterion("AUDIT_STATUS between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(Short value1, Short value2) {
            addCriterion("AUDIT_STATUS not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditMemoIsNull() {
            addCriterion("AUDIT_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andAuditMemoIsNotNull() {
            addCriterion("AUDIT_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andAuditMemoEqualTo(String value) {
            addCriterion("AUDIT_MEMO =", value, "auditMemo");
            return (Criteria) this;
        }

        public Criteria andAuditMemoNotEqualTo(String value) {
            addCriterion("AUDIT_MEMO <>", value, "auditMemo");
            return (Criteria) this;
        }

        public Criteria andAuditMemoGreaterThan(String value) {
            addCriterion("AUDIT_MEMO >", value, "auditMemo");
            return (Criteria) this;
        }

        public Criteria andAuditMemoGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_MEMO >=", value, "auditMemo");
            return (Criteria) this;
        }

        public Criteria andAuditMemoLessThan(String value) {
            addCriterion("AUDIT_MEMO <", value, "auditMemo");
            return (Criteria) this;
        }

        public Criteria andAuditMemoLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_MEMO <=", value, "auditMemo");
            return (Criteria) this;
        }

        public Criteria andAuditMemoLike(String value) {
            addCriterion("AUDIT_MEMO like", value, "auditMemo");
            return (Criteria) this;
        }

        public Criteria andAuditMemoNotLike(String value) {
            addCriterion("AUDIT_MEMO not like", value, "auditMemo");
            return (Criteria) this;
        }

        public Criteria andAuditMemoIn(List<String> values) {
            addCriterion("AUDIT_MEMO in", values, "auditMemo");
            return (Criteria) this;
        }

        public Criteria andAuditMemoNotIn(List<String> values) {
            addCriterion("AUDIT_MEMO not in", values, "auditMemo");
            return (Criteria) this;
        }

        public Criteria andAuditMemoBetween(String value1, String value2) {
            addCriterion("AUDIT_MEMO between", value1, value2, "auditMemo");
            return (Criteria) this;
        }

        public Criteria andAuditMemoNotBetween(String value1, String value2) {
            addCriterion("AUDIT_MEMO not between", value1, value2, "auditMemo");
            return (Criteria) this;
        }

        public Criteria andAuditManIsNull() {
            addCriterion("AUDIT_MAN is null");
            return (Criteria) this;
        }

        public Criteria andAuditManIsNotNull() {
            addCriterion("AUDIT_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andAuditManEqualTo(String value) {
            addCriterion("AUDIT_MAN =", value, "auditMan");
            return (Criteria) this;
        }

        public Criteria andAuditManNotEqualTo(String value) {
            addCriterion("AUDIT_MAN <>", value, "auditMan");
            return (Criteria) this;
        }

        public Criteria andAuditManGreaterThan(String value) {
            addCriterion("AUDIT_MAN >", value, "auditMan");
            return (Criteria) this;
        }

        public Criteria andAuditManGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_MAN >=", value, "auditMan");
            return (Criteria) this;
        }

        public Criteria andAuditManLessThan(String value) {
            addCriterion("AUDIT_MAN <", value, "auditMan");
            return (Criteria) this;
        }

        public Criteria andAuditManLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_MAN <=", value, "auditMan");
            return (Criteria) this;
        }

        public Criteria andAuditManLike(String value) {
            addCriterion("AUDIT_MAN like", value, "auditMan");
            return (Criteria) this;
        }

        public Criteria andAuditManNotLike(String value) {
            addCriterion("AUDIT_MAN not like", value, "auditMan");
            return (Criteria) this;
        }

        public Criteria andAuditManIn(List<String> values) {
            addCriterion("AUDIT_MAN in", values, "auditMan");
            return (Criteria) this;
        }

        public Criteria andAuditManNotIn(List<String> values) {
            addCriterion("AUDIT_MAN not in", values, "auditMan");
            return (Criteria) this;
        }

        public Criteria andAuditManBetween(String value1, String value2) {
            addCriterion("AUDIT_MAN between", value1, value2, "auditMan");
            return (Criteria) this;
        }

        public Criteria andAuditManNotBetween(String value1, String value2) {
            addCriterion("AUDIT_MAN not between", value1, value2, "auditMan");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNull() {
            addCriterion("AUDIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNotNull() {
            addCriterion("AUDIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDateEqualTo(Date value) {
            addCriterion("AUDIT_DATE =", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotEqualTo(Date value) {
            addCriterion("AUDIT_DATE <>", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThan(Date value) {
            addCriterion("AUDIT_DATE >", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("AUDIT_DATE >=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThan(Date value) {
            addCriterion("AUDIT_DATE <", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThanOrEqualTo(Date value) {
            addCriterion("AUDIT_DATE <=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateIn(List<Date> values) {
            addCriterion("AUDIT_DATE in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotIn(List<Date> values) {
            addCriterion("AUDIT_DATE not in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateBetween(Date value1, Date value2) {
            addCriterion("AUDIT_DATE between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotBetween(Date value1, Date value2) {
            addCriterion("AUDIT_DATE not between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andLatestFlgIsNull() {
            addCriterion("LATEST_FLG is null");
            return (Criteria) this;
        }

        public Criteria andLatestFlgIsNotNull() {
            addCriterion("LATEST_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andLatestFlgEqualTo(Short value) {
            addCriterion("LATEST_FLG =", value, "latestFlg");
            return (Criteria) this;
        }

        public Criteria andLatestFlgNotEqualTo(Short value) {
            addCriterion("LATEST_FLG <>", value, "latestFlg");
            return (Criteria) this;
        }

        public Criteria andLatestFlgGreaterThan(Short value) {
            addCriterion("LATEST_FLG >", value, "latestFlg");
            return (Criteria) this;
        }

        public Criteria andLatestFlgGreaterThanOrEqualTo(Short value) {
            addCriterion("LATEST_FLG >=", value, "latestFlg");
            return (Criteria) this;
        }

        public Criteria andLatestFlgLessThan(Short value) {
            addCriterion("LATEST_FLG <", value, "latestFlg");
            return (Criteria) this;
        }

        public Criteria andLatestFlgLessThanOrEqualTo(Short value) {
            addCriterion("LATEST_FLG <=", value, "latestFlg");
            return (Criteria) this;
        }

        public Criteria andLatestFlgIn(List<Short> values) {
            addCriterion("LATEST_FLG in", values, "latestFlg");
            return (Criteria) this;
        }

        public Criteria andLatestFlgNotIn(List<Short> values) {
            addCriterion("LATEST_FLG not in", values, "latestFlg");
            return (Criteria) this;
        }

        public Criteria andLatestFlgBetween(Short value1, Short value2) {
            addCriterion("LATEST_FLG between", value1, value2, "latestFlg");
            return (Criteria) this;
        }

        public Criteria andLatestFlgNotBetween(Short value1, Short value2) {
            addCriterion("LATEST_FLG not between", value1, value2, "latestFlg");
            return (Criteria) this;
        }

        public Criteria andAuditPreIdIsNull() {
            addCriterion("AUDIT_PRE_ID is null");
            return (Criteria) this;
        }

        public Criteria andAuditPreIdIsNotNull() {
            addCriterion("AUDIT_PRE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAuditPreIdEqualTo(String value) {
            addCriterion("AUDIT_PRE_ID =", value, "auditPreId");
            return (Criteria) this;
        }

        public Criteria andAuditPreIdNotEqualTo(String value) {
            addCriterion("AUDIT_PRE_ID <>", value, "auditPreId");
            return (Criteria) this;
        }

        public Criteria andAuditPreIdGreaterThan(String value) {
            addCriterion("AUDIT_PRE_ID >", value, "auditPreId");
            return (Criteria) this;
        }

        public Criteria andAuditPreIdGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_PRE_ID >=", value, "auditPreId");
            return (Criteria) this;
        }

        public Criteria andAuditPreIdLessThan(String value) {
            addCriterion("AUDIT_PRE_ID <", value, "auditPreId");
            return (Criteria) this;
        }

        public Criteria andAuditPreIdLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_PRE_ID <=", value, "auditPreId");
            return (Criteria) this;
        }

        public Criteria andAuditPreIdLike(String value) {
            addCriterion("AUDIT_PRE_ID like", value, "auditPreId");
            return (Criteria) this;
        }

        public Criteria andAuditPreIdNotLike(String value) {
            addCriterion("AUDIT_PRE_ID not like", value, "auditPreId");
            return (Criteria) this;
        }

        public Criteria andAuditPreIdIn(List<String> values) {
            addCriterion("AUDIT_PRE_ID in", values, "auditPreId");
            return (Criteria) this;
        }

        public Criteria andAuditPreIdNotIn(List<String> values) {
            addCriterion("AUDIT_PRE_ID not in", values, "auditPreId");
            return (Criteria) this;
        }

        public Criteria andAuditPreIdBetween(String value1, String value2) {
            addCriterion("AUDIT_PRE_ID between", value1, value2, "auditPreId");
            return (Criteria) this;
        }

        public Criteria andAuditPreIdNotBetween(String value1, String value2) {
            addCriterion("AUDIT_PRE_ID not between", value1, value2, "auditPreId");
            return (Criteria) this;
        }

        public Criteria andAuditPreVeridIsNull() {
            addCriterion("AUDIT_PRE_VERID is null");
            return (Criteria) this;
        }

        public Criteria andAuditPreVeridIsNotNull() {
            addCriterion("AUDIT_PRE_VERID is not null");
            return (Criteria) this;
        }

        public Criteria andAuditPreVeridEqualTo(Short value) {
            addCriterion("AUDIT_PRE_VERID =", value, "auditPreVerid");
            return (Criteria) this;
        }

        public Criteria andAuditPreVeridNotEqualTo(Short value) {
            addCriterion("AUDIT_PRE_VERID <>", value, "auditPreVerid");
            return (Criteria) this;
        }

        public Criteria andAuditPreVeridGreaterThan(Short value) {
            addCriterion("AUDIT_PRE_VERID >", value, "auditPreVerid");
            return (Criteria) this;
        }

        public Criteria andAuditPreVeridGreaterThanOrEqualTo(Short value) {
            addCriterion("AUDIT_PRE_VERID >=", value, "auditPreVerid");
            return (Criteria) this;
        }

        public Criteria andAuditPreVeridLessThan(Short value) {
            addCriterion("AUDIT_PRE_VERID <", value, "auditPreVerid");
            return (Criteria) this;
        }

        public Criteria andAuditPreVeridLessThanOrEqualTo(Short value) {
            addCriterion("AUDIT_PRE_VERID <=", value, "auditPreVerid");
            return (Criteria) this;
        }

        public Criteria andAuditPreVeridIn(List<Short> values) {
            addCriterion("AUDIT_PRE_VERID in", values, "auditPreVerid");
            return (Criteria) this;
        }

        public Criteria andAuditPreVeridNotIn(List<Short> values) {
            addCriterion("AUDIT_PRE_VERID not in", values, "auditPreVerid");
            return (Criteria) this;
        }

        public Criteria andAuditPreVeridBetween(Short value1, Short value2) {
            addCriterion("AUDIT_PRE_VERID between", value1, value2, "auditPreVerid");
            return (Criteria) this;
        }

        public Criteria andAuditPreVeridNotBetween(Short value1, Short value2) {
            addCriterion("AUDIT_PRE_VERID not between", value1, value2, "auditPreVerid");
            return (Criteria) this;
        }

        public Criteria andAuditWaitIdIsNull() {
            addCriterion("AUDIT_WAIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAuditWaitIdIsNotNull() {
            addCriterion("AUDIT_WAIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAuditWaitIdEqualTo(String value) {
            addCriterion("AUDIT_WAIT_ID =", value, "auditWaitId");
            return (Criteria) this;
        }

        public Criteria andAuditWaitIdNotEqualTo(String value) {
            addCriterion("AUDIT_WAIT_ID <>", value, "auditWaitId");
            return (Criteria) this;
        }

        public Criteria andAuditWaitIdGreaterThan(String value) {
            addCriterion("AUDIT_WAIT_ID >", value, "auditWaitId");
            return (Criteria) this;
        }

        public Criteria andAuditWaitIdGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_WAIT_ID >=", value, "auditWaitId");
            return (Criteria) this;
        }

        public Criteria andAuditWaitIdLessThan(String value) {
            addCriterion("AUDIT_WAIT_ID <", value, "auditWaitId");
            return (Criteria) this;
        }

        public Criteria andAuditWaitIdLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_WAIT_ID <=", value, "auditWaitId");
            return (Criteria) this;
        }

        public Criteria andAuditWaitIdLike(String value) {
            addCriterion("AUDIT_WAIT_ID like", value, "auditWaitId");
            return (Criteria) this;
        }

        public Criteria andAuditWaitIdNotLike(String value) {
            addCriterion("AUDIT_WAIT_ID not like", value, "auditWaitId");
            return (Criteria) this;
        }

        public Criteria andAuditWaitIdIn(List<String> values) {
            addCriterion("AUDIT_WAIT_ID in", values, "auditWaitId");
            return (Criteria) this;
        }

        public Criteria andAuditWaitIdNotIn(List<String> values) {
            addCriterion("AUDIT_WAIT_ID not in", values, "auditWaitId");
            return (Criteria) this;
        }

        public Criteria andAuditWaitIdBetween(String value1, String value2) {
            addCriterion("AUDIT_WAIT_ID between", value1, value2, "auditWaitId");
            return (Criteria) this;
        }

        public Criteria andAuditWaitIdNotBetween(String value1, String value2) {
            addCriterion("AUDIT_WAIT_ID not between", value1, value2, "auditWaitId");
            return (Criteria) this;
        }

        public Criteria andAuditWaitVeridIsNull() {
            addCriterion("AUDIT_WAIT_VERID is null");
            return (Criteria) this;
        }

        public Criteria andAuditWaitVeridIsNotNull() {
            addCriterion("AUDIT_WAIT_VERID is not null");
            return (Criteria) this;
        }

        public Criteria andAuditWaitVeridEqualTo(Short value) {
            addCriterion("AUDIT_WAIT_VERID =", value, "auditWaitVerid");
            return (Criteria) this;
        }

        public Criteria andAuditWaitVeridNotEqualTo(Short value) {
            addCriterion("AUDIT_WAIT_VERID <>", value, "auditWaitVerid");
            return (Criteria) this;
        }

        public Criteria andAuditWaitVeridGreaterThan(Short value) {
            addCriterion("AUDIT_WAIT_VERID >", value, "auditWaitVerid");
            return (Criteria) this;
        }

        public Criteria andAuditWaitVeridGreaterThanOrEqualTo(Short value) {
            addCriterion("AUDIT_WAIT_VERID >=", value, "auditWaitVerid");
            return (Criteria) this;
        }

        public Criteria andAuditWaitVeridLessThan(Short value) {
            addCriterion("AUDIT_WAIT_VERID <", value, "auditWaitVerid");
            return (Criteria) this;
        }

        public Criteria andAuditWaitVeridLessThanOrEqualTo(Short value) {
            addCriterion("AUDIT_WAIT_VERID <=", value, "auditWaitVerid");
            return (Criteria) this;
        }

        public Criteria andAuditWaitVeridIn(List<Short> values) {
            addCriterion("AUDIT_WAIT_VERID in", values, "auditWaitVerid");
            return (Criteria) this;
        }

        public Criteria andAuditWaitVeridNotIn(List<Short> values) {
            addCriterion("AUDIT_WAIT_VERID not in", values, "auditWaitVerid");
            return (Criteria) this;
        }

        public Criteria andAuditWaitVeridBetween(Short value1, Short value2) {
            addCriterion("AUDIT_WAIT_VERID between", value1, value2, "auditWaitVerid");
            return (Criteria) this;
        }

        public Criteria andAuditWaitVeridNotBetween(Short value1, Short value2) {
            addCriterion("AUDIT_WAIT_VERID not between", value1, value2, "auditWaitVerid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNull() {
            addCriterion("CREATEUSER is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNotNull() {
            addCriterion("CREATEUSER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserEqualTo(String value) {
            addCriterion("CREATEUSER =", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotEqualTo(String value) {
            addCriterion("CREATEUSER <>", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThan(String value) {
            addCriterion("CREATEUSER >", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEUSER >=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThan(String value) {
            addCriterion("CREATEUSER <", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThanOrEqualTo(String value) {
            addCriterion("CREATEUSER <=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLike(String value) {
            addCriterion("CREATEUSER like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotLike(String value) {
            addCriterion("CREATEUSER not like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserIn(List<String> values) {
            addCriterion("CREATEUSER in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotIn(List<String> values) {
            addCriterion("CREATEUSER not in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserBetween(String value1, String value2) {
            addCriterion("CREATEUSER between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotBetween(String value1, String value2) {
            addCriterion("CREATEUSER not between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIsNull() {
            addCriterion("UPDATEUSER is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIsNotNull() {
            addCriterion("UPDATEUSER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserEqualTo(String value) {
            addCriterion("UPDATEUSER =", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotEqualTo(String value) {
            addCriterion("UPDATEUSER <>", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThan(String value) {
            addCriterion("UPDATEUSER >", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATEUSER >=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThan(String value) {
            addCriterion("UPDATEUSER <", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThanOrEqualTo(String value) {
            addCriterion("UPDATEUSER <=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLike(String value) {
            addCriterion("UPDATEUSER like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotLike(String value) {
            addCriterion("UPDATEUSER not like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIn(List<String> values) {
            addCriterion("UPDATEUSER in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotIn(List<String> values) {
            addCriterion("UPDATEUSER not in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserBetween(String value1, String value2) {
            addCriterion("UPDATEUSER between", value1, value2, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotBetween(String value1, String value2) {
            addCriterion("UPDATEUSER not between", value1, value2, "updateuser");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andEntpIdLikeInsensitive(String value) {
            addCriterion("upper(ENTP_ID) like", value.toUpperCase(), "entpId");
            return (Criteria) this;
        }

        public Criteria andAuditMemoLikeInsensitive(String value) {
            addCriterion("upper(AUDIT_MEMO) like", value.toUpperCase(), "auditMemo");
            return (Criteria) this;
        }

        public Criteria andAuditManLikeInsensitive(String value) {
            addCriterion("upper(AUDIT_MAN) like", value.toUpperCase(), "auditMan");
            return (Criteria) this;
        }

        public Criteria andAuditPreIdLikeInsensitive(String value) {
            addCriterion("upper(AUDIT_PRE_ID) like", value.toUpperCase(), "auditPreId");
            return (Criteria) this;
        }

        public Criteria andAuditWaitIdLikeInsensitive(String value) {
            addCriterion("upper(AUDIT_WAIT_ID) like", value.toUpperCase(), "auditWaitId");
            return (Criteria) this;
        }

        public Criteria andCreateuserLikeInsensitive(String value) {
            addCriterion("upper(CREATEUSER) like", value.toUpperCase(), "createuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLikeInsensitive(String value) {
            addCriterion("upper(UPDATEUSER) like", value.toUpperCase(), "updateuser");
            return (Criteria) this;
        }
    }

    /**
     * D_UC_ENTP_AUDIT_HIS
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * D_UC_ENTP_AUDIT_HIS null
     */
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