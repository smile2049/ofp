package com.webside.ofp.model;

import java.util.Date;
import java.util.List;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table quotation_sheet
 *
 * @mbg.generated do_not_delete_during_merge Tue Jul 18 00:02:59 CST 2017
 */
public class QuotationSheetEntity {
	
	
	private List<QuotationSubSheetEntity> subSheetList;
	
	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.QUOTATION_SHEET_ID
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private Integer quotationSheetId;

    /**
     * Database Column Remarks:
     *   客户ID,外键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.CUSTOMER_ID
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private CustomerEntity customer;

    /**
     * Database Column Remarks:
     *   利率ID,外键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.INTEREST_RATE_ID
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private Integer interestRateId;

    /**
     * Database Column Remarks:
     *   报价单号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.QUOTATION_SHEET_CODE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private String quotationSheetCode;

    /**
     * Database Column Remarks:
     *   报价日期
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.QUOTATION_DATE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private Date quotationDate;

    /**
     * Database Column Remarks:
     *   价格术语
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.PRICE_TERMS
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private String priceTerms;

    /**
     * Database Column Remarks:
     *   币种
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.CURRENCY
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private String currency;

    /**
     * Database Column Remarks:
     *   汇率
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.EXCHANGE_RATE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private Double exchangeRate;

    /**
     * Database Column Remarks:
     *   有效期限
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.EXPIRATION_DATE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private Date expirationDate;

    /**
     * Database Column Remarks:
     *   付款方式
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.PAY_MODE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private String payMode;

    /**
     * Database Column Remarks:
     *   起运地
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.RESOURCE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private String resource;

    /**
     * Database Column Remarks:
     *   目的地
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.DEST
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private String dest;

    /**
     * Database Column Remarks:
     *   交货期限
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.DELIVERY_DATE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private Date deliveryDate;

    /**
     * Database Column Remarks:
     *   保险费
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.INSURANCE_COST
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private Double insuranceCost;

    /**
     * Database Column Remarks:
     *   国外运费
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.FOREIGN_GREIGHT
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private Double foreignGreight;

    /**
     * Database Column Remarks:
     *   国内运费
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.HOME_GREIGHT
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private Double homeGreight;

    /**
     * Database Column Remarks:
     *   管理费
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.OPERATION_COST
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private Double operationCost;

    /**
     * Database Column Remarks:
     *   佣金
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.COMMISSION
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private Double commission;

    /**
     * Database Column Remarks:
     *   折扣
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.REBATE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private Double rebate;

    /**
     * Database Column Remarks:
     *   CBM合计
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.TOTAL_CBM
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private Double totalCbm;

    /**
     * Database Column Remarks:
     *   利润
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.PROFIT
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private Double profit;

    /**
     * Database Column Remarks:
     *   换汇率
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.SWAP_RATE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private Double swapRate;

    /**
     * Database Column Remarks:
     *   计息月
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.INTEREST_MONTH
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private Integer interestMonth;

    /**
     * Database Column Remarks:
     *   逻辑删除（1.删除，0，否）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.IS_DELETE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private Integer isDelete;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.CREATE_TIME
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.MODIFY_TIME
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private Date modifyTime;

    /**
     * Database Column Remarks:
     *   创建人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.CREATE_USER
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private Integer createUser;

    /**
     * Database Column Remarks:
     *   修改人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.MDOIFY_USER
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private Integer modifyUser;

    /**
     * Database Column Remarks:
     *   描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quotation_sheet.DESCRIPTION
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.QUOTATION_SHEET_ID
     *
     * @return the value of quotation_sheet.QUOTATION_SHEET_ID
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public Integer getQuotationSheetId() {
        return quotationSheetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.QUOTATION_SHEET_ID
     *
     * @param quotationSheetId the value for quotation_sheet.QUOTATION_SHEET_ID
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setQuotationSheetId(Integer quotationSheetId) {
        this.quotationSheetId = quotationSheetId;
    }


    public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.INTEREST_RATE_ID
     *
     * @return the value of quotation_sheet.INTEREST_RATE_ID
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public Integer getInterestRateId() {
        return interestRateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.INTEREST_RATE_ID
     *
     * @param interestRateId the value for quotation_sheet.INTEREST_RATE_ID
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setInterestRateId(Integer interestRateId) {
        this.interestRateId = interestRateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.QUOTATION_SHEET_CODE
     *
     * @return the value of quotation_sheet.QUOTATION_SHEET_CODE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public String getQuotationSheetCode() {
        return quotationSheetCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.QUOTATION_SHEET_CODE
     *
     * @param quotationSheetCode the value for quotation_sheet.QUOTATION_SHEET_CODE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setQuotationSheetCode(String quotationSheetCode) {
        this.quotationSheetCode = quotationSheetCode == null ? null : quotationSheetCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.QUOTATION_DATE
     *
     * @return the value of quotation_sheet.QUOTATION_DATE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public Date getQuotationDate() {
        return quotationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.QUOTATION_DATE
     *
     * @param quotationDate the value for quotation_sheet.QUOTATION_DATE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setQuotationDate(Date quotationDate) {
        this.quotationDate = quotationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.PRICE_TERMS
     *
     * @return the value of quotation_sheet.PRICE_TERMS
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public String getPriceTerms() {
        return priceTerms;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.PRICE_TERMS
     *
     * @param priceTerms the value for quotation_sheet.PRICE_TERMS
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setPriceTerms(String priceTerms) {
        this.priceTerms = priceTerms == null ? null : priceTerms.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.CURRENCY
     *
     * @return the value of quotation_sheet.CURRENCY
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.CURRENCY
     *
     * @param currency the value for quotation_sheet.CURRENCY
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.EXCHANGE_RATE
     *
     * @return the value of quotation_sheet.EXCHANGE_RATE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public Double getExchangeRate() {
        return exchangeRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.EXCHANGE_RATE
     *
     * @param exchangeRate the value for quotation_sheet.EXCHANGE_RATE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.EXPIRATION_DATE
     *
     * @return the value of quotation_sheet.EXPIRATION_DATE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.EXPIRATION_DATE
     *
     * @param expirationDate the value for quotation_sheet.EXPIRATION_DATE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.PAY_MODE
     *
     * @return the value of quotation_sheet.PAY_MODE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public String getPayMode() {
        return payMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.PAY_MODE
     *
     * @param payMode the value for quotation_sheet.PAY_MODE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setPayMode(String payMode) {
        this.payMode = payMode == null ? null : payMode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.RESOURCE
     *
     * @return the value of quotation_sheet.RESOURCE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public String getResource() {
        return resource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.RESOURCE
     *
     * @param resource the value for quotation_sheet.RESOURCE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setResource(String resource) {
        this.resource = resource == null ? null : resource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.DEST
     *
     * @return the value of quotation_sheet.DEST
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public String getDest() {
        return dest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.DEST
     *
     * @param dest the value for quotation_sheet.DEST
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setDest(String dest) {
        this.dest = dest == null ? null : dest.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.DELIVERY_DATE
     *
     * @return the value of quotation_sheet.DELIVERY_DATE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public Date getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.DELIVERY_DATE
     *
     * @param deliveryDate the value for quotation_sheet.DELIVERY_DATE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.INSURANCE_COST
     *
     * @return the value of quotation_sheet.INSURANCE_COST
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public Double getInsuranceCost() {
        return insuranceCost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.INSURANCE_COST
     *
     * @param insuranceCost the value for quotation_sheet.INSURANCE_COST
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setInsuranceCost(Double insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.FOREIGN_GREIGHT
     *
     * @return the value of quotation_sheet.FOREIGN_GREIGHT
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public Double getForeignGreight() {
        return foreignGreight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.FOREIGN_GREIGHT
     *
     * @param foreignGreight the value for quotation_sheet.FOREIGN_GREIGHT
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setForeignGreight(Double foreignGreight) {
        this.foreignGreight = foreignGreight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.HOME_GREIGHT
     *
     * @return the value of quotation_sheet.HOME_GREIGHT
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public Double getHomeGreight() {
        return homeGreight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.HOME_GREIGHT
     *
     * @param homeGreight the value for quotation_sheet.HOME_GREIGHT
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setHomeGreight(Double homeGreight) {
        this.homeGreight = homeGreight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.OPERATION_COST
     *
     * @return the value of quotation_sheet.OPERATION_COST
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public Double getOperationCost() {
        return operationCost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.OPERATION_COST
     *
     * @param operationCost the value for quotation_sheet.OPERATION_COST
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setOperationCost(Double operationCost) {
        this.operationCost = operationCost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.COMMISSION
     *
     * @return the value of quotation_sheet.COMMISSION
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public Double getCommission() {
        return commission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.COMMISSION
     *
     * @param commission the value for quotation_sheet.COMMISSION
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setCommission(Double commission) {
        this.commission = commission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.REBATE
     *
     * @return the value of quotation_sheet.REBATE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public Double getRebate() {
        return rebate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.REBATE
     *
     * @param rebate the value for quotation_sheet.REBATE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setRebate(Double rebate) {
        this.rebate = rebate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.TOTAL_CBM
     *
     * @return the value of quotation_sheet.TOTAL_CBM
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public Double getTotalCbm() {
        return totalCbm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.TOTAL_CBM
     *
     * @param totalCbm the value for quotation_sheet.TOTAL_CBM
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setTotalCbm(Double totalCbm) {
        this.totalCbm = totalCbm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.PROFIT
     *
     * @return the value of quotation_sheet.PROFIT
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public Double getProfit() {
        return profit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.PROFIT
     *
     * @param profit the value for quotation_sheet.PROFIT
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setProfit(Double profit) {
        this.profit = profit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.SWAP_RATE
     *
     * @return the value of quotation_sheet.SWAP_RATE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public Double getSwapRate() {
        return swapRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.SWAP_RATE
     *
     * @param swapRate the value for quotation_sheet.SWAP_RATE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setSwapRate(Double swapRate) {
        this.swapRate = swapRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.INTEREST_MONTH
     *
     * @return the value of quotation_sheet.INTEREST_MONTH
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public Integer getInterestMonth() {
        return interestMonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.INTEREST_MONTH
     *
     * @param interestMonth the value for quotation_sheet.INTEREST_MONTH
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setInterestMonth(Integer interestMonth) {
        this.interestMonth = interestMonth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.IS_DELETE
     *
     * @return the value of quotation_sheet.IS_DELETE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.IS_DELETE
     *
     * @param isDelete the value for quotation_sheet.IS_DELETE
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.CREATE_TIME
     *
     * @return the value of quotation_sheet.CREATE_TIME
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.CREATE_TIME
     *
     * @param createTime the value for quotation_sheet.CREATE_TIME
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.MODIFY_TIME
     *
     * @return the value of quotation_sheet.MODIFY_TIME
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.MODIFY_TIME
     *
     * @param modifyTime the value for quotation_sheet.MODIFY_TIME
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.CREATE_USER
     *
     * @return the value of quotation_sheet.CREATE_USER
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.CREATE_USER
     *
     * @param createUser the value for quotation_sheet.CREATE_USER
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.MDOIFY_USER
     *
     * @return the value of quotation_sheet.MDOIFY_USER
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public Integer getModifyUser() {
        return modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.MDOIFY_USER
     *
     * @param mdoifyUser the value for quotation_sheet.MDOIFY_USER
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setModifyUser(Integer modifyUser) {
        this.modifyUser = modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quotation_sheet.DESCRIPTION
     *
     * @return the value of quotation_sheet.DESCRIPTION
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quotation_sheet.DESCRIPTION
     *
     * @param description the value for quotation_sheet.DESCRIPTION
     *
     * @mbg.generated Tue Jul 18 00:02:59 CST 2017
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
    
    public List<QuotationSubSheetEntity> getSubSheetList() {
		return subSheetList;
	}

	public void setSubSheetList(List<QuotationSubSheetEntity> subSheetList) {
		this.subSheetList = subSheetList;
	}
}