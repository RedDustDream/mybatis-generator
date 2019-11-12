package com.huang.mybatis.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class WashcarSubsidiaryOrderMx {
    private Long pkid;

    private String fphm;

    private String circleId;

    private String hydm;

    private String hyname;

    private String userId;

    private String userName;

    private String userMobile;

    private String wxOpenid;

    private Date cdate;

    private String netCode;

    private String depid;

    private String machineCode;

    private String ocrDeviceId;

    private String carPlate;

    private String washTyp;

    private Short status;

    private String couponCode;

    private String couponName;

    private Byte payTyp;

    private BigDecimal payAmt;

    private String payOrderId;

    private String cardId;

    private String timemd5;

    private String remark;

    private Date date1;

    private Date date2;

    private Integer couponType;

    private BigDecimal couponAmt;

    private BigDecimal getMoney;

    private BigDecimal favourMoney;

    private Integer balanceType;

    private String mac;

    private String networkname;

    private String str00;

    private String str01;

    private String str02;

    private String str03;

    private Integer flag00;

    private Integer flag01;

    private Integer flag02;

    private Integer flag03;

    private String str04;

    private String str05;

    private String str06;

    private Date refunddate;

    private Date reviewdate;

    private String reviewuser;

    private Integer retundstatus;

    private String refusereason;

    private String dpid;

    private Short agentTyp;

    private Integer couponFlag01;

    private Integer orderTyp;

    private Long foreginId;

    private String foreginName;

    private Date subDate;

    private Long timepartId;

    private Integer buySl;

    private String img;

    private Integer vipFlag;

    private Long workerId;

    private String workerInfo;

    private String workerMobile;

    private Date workerDate;

    public WashcarSubsidiaryOrderMx(Long pkid, String fphm, String circleId, String hydm, String hyname, String userId, String userName, String userMobile, String wxOpenid, Date cdate, String netCode, String depid, String machineCode, String ocrDeviceId, String carPlate, String washTyp, Short status, String couponCode, String couponName, Byte payTyp, BigDecimal payAmt, String payOrderId, String cardId, String timemd5, String remark, Date date1, Date date2, Integer couponType, BigDecimal couponAmt, BigDecimal getMoney, BigDecimal favourMoney, Integer balanceType, String mac, String networkname, String str00, String str01, String str02, String str03, Integer flag00, Integer flag01, Integer flag02, Integer flag03, String str04, String str05, String str06, Date refunddate, Date reviewdate, String reviewuser, Integer retundstatus, String refusereason, String dpid, Short agentTyp, Integer couponFlag01, Integer orderTyp, Long foreginId, String foreginName, Date subDate, Long timepartId, Integer buySl, String img, Integer vipFlag, Long workerId, String workerInfo, String workerMobile, Date workerDate) {
        this.pkid = pkid;
        this.fphm = fphm;
        this.circleId = circleId;
        this.hydm = hydm;
        this.hyname = hyname;
        this.userId = userId;
        this.userName = userName;
        this.userMobile = userMobile;
        this.wxOpenid = wxOpenid;
        this.cdate = cdate;
        this.netCode = netCode;
        this.depid = depid;
        this.machineCode = machineCode;
        this.ocrDeviceId = ocrDeviceId;
        this.carPlate = carPlate;
        this.washTyp = washTyp;
        this.status = status;
        this.couponCode = couponCode;
        this.couponName = couponName;
        this.payTyp = payTyp;
        this.payAmt = payAmt;
        this.payOrderId = payOrderId;
        this.cardId = cardId;
        this.timemd5 = timemd5;
        this.remark = remark;
        this.date1 = date1;
        this.date2 = date2;
        this.couponType = couponType;
        this.couponAmt = couponAmt;
        this.getMoney = getMoney;
        this.favourMoney = favourMoney;
        this.balanceType = balanceType;
        this.mac = mac;
        this.networkname = networkname;
        this.str00 = str00;
        this.str01 = str01;
        this.str02 = str02;
        this.str03 = str03;
        this.flag00 = flag00;
        this.flag01 = flag01;
        this.flag02 = flag02;
        this.flag03 = flag03;
        this.str04 = str04;
        this.str05 = str05;
        this.str06 = str06;
        this.refunddate = refunddate;
        this.reviewdate = reviewdate;
        this.reviewuser = reviewuser;
        this.retundstatus = retundstatus;
        this.refusereason = refusereason;
        this.dpid = dpid;
        this.agentTyp = agentTyp;
        this.couponFlag01 = couponFlag01;
        this.orderTyp = orderTyp;
        this.foreginId = foreginId;
        this.foreginName = foreginName;
        this.subDate = subDate;
        this.timepartId = timepartId;
        this.buySl = buySl;
        this.img = img;
        this.vipFlag = vipFlag;
        this.workerId = workerId;
        this.workerInfo = workerInfo;
        this.workerMobile = workerMobile;
        this.workerDate = workerDate;
    }

    public WashcarSubsidiaryOrderMx() {
        super();
    }

    public Long getPkid() {
        return pkid;
    }

    public void setPkid(Long pkid) {
        this.pkid = pkid;
    }

    public String getFphm() {
        return fphm;
    }

    public void setFphm(String fphm) {
        this.fphm = fphm == null ? null : fphm.trim();
    }

    public String getCircleId() {
        return circleId;
    }

    public void setCircleId(String circleId) {
        this.circleId = circleId == null ? null : circleId.trim();
    }

    public String getHydm() {
        return hydm;
    }

    public void setHydm(String hydm) {
        this.hydm = hydm == null ? null : hydm.trim();
    }

    public String getHyname() {
        return hyname;
    }

    public void setHyname(String hyname) {
        this.hyname = hyname == null ? null : hyname.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public String getWxOpenid() {
        return wxOpenid;
    }

    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid == null ? null : wxOpenid.trim();
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public String getNetCode() {
        return netCode;
    }

    public void setNetCode(String netCode) {
        this.netCode = netCode == null ? null : netCode.trim();
    }

    public String getDepid() {
        return depid;
    }

    public void setDepid(String depid) {
        this.depid = depid == null ? null : depid.trim();
    }

    public String getMachineCode() {
        return machineCode;
    }

    public void setMachineCode(String machineCode) {
        this.machineCode = machineCode == null ? null : machineCode.trim();
    }

    public String getOcrDeviceId() {
        return ocrDeviceId;
    }

    public void setOcrDeviceId(String ocrDeviceId) {
        this.ocrDeviceId = ocrDeviceId == null ? null : ocrDeviceId.trim();
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate == null ? null : carPlate.trim();
    }

    public String getWashTyp() {
        return washTyp;
    }

    public void setWashTyp(String washTyp) {
        this.washTyp = washTyp == null ? null : washTyp.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode == null ? null : couponCode.trim();
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName == null ? null : couponName.trim();
    }

    public Byte getPayTyp() {
        return payTyp;
    }

    public void setPayTyp(Byte payTyp) {
        this.payTyp = payTyp;
    }

    public BigDecimal getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(BigDecimal payAmt) {
        this.payAmt = payAmt;
    }

    public String getPayOrderId() {
        return payOrderId;
    }

    public void setPayOrderId(String payOrderId) {
        this.payOrderId = payOrderId == null ? null : payOrderId.trim();
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public String getTimemd5() {
        return timemd5;
    }

    public void setTimemd5(String timemd5) {
        this.timemd5 = timemd5 == null ? null : timemd5.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public BigDecimal getCouponAmt() {
        return couponAmt;
    }

    public void setCouponAmt(BigDecimal couponAmt) {
        this.couponAmt = couponAmt;
    }

    public BigDecimal getGetMoney() {
        return getMoney;
    }

    public void setGetMoney(BigDecimal getMoney) {
        this.getMoney = getMoney;
    }

    public BigDecimal getFavourMoney() {
        return favourMoney;
    }

    public void setFavourMoney(BigDecimal favourMoney) {
        this.favourMoney = favourMoney;
    }

    public Integer getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(Integer balanceType) {
        this.balanceType = balanceType;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
    }

    public String getNetworkname() {
        return networkname;
    }

    public void setNetworkname(String networkname) {
        this.networkname = networkname == null ? null : networkname.trim();
    }

    public String getStr00() {
        return str00;
    }

    public void setStr00(String str00) {
        this.str00 = str00 == null ? null : str00.trim();
    }

    public String getStr01() {
        return str01;
    }

    public void setStr01(String str01) {
        this.str01 = str01 == null ? null : str01.trim();
    }

    public String getStr02() {
        return str02;
    }

    public void setStr02(String str02) {
        this.str02 = str02 == null ? null : str02.trim();
    }

    public String getStr03() {
        return str03;
    }

    public void setStr03(String str03) {
        this.str03 = str03 == null ? null : str03.trim();
    }

    public Integer getFlag00() {
        return flag00;
    }

    public void setFlag00(Integer flag00) {
        this.flag00 = flag00;
    }

    public Integer getFlag01() {
        return flag01;
    }

    public void setFlag01(Integer flag01) {
        this.flag01 = flag01;
    }

    public Integer getFlag02() {
        return flag02;
    }

    public void setFlag02(Integer flag02) {
        this.flag02 = flag02;
    }

    public Integer getFlag03() {
        return flag03;
    }

    public void setFlag03(Integer flag03) {
        this.flag03 = flag03;
    }

    public String getStr04() {
        return str04;
    }

    public void setStr04(String str04) {
        this.str04 = str04 == null ? null : str04.trim();
    }

    public String getStr05() {
        return str05;
    }

    public void setStr05(String str05) {
        this.str05 = str05 == null ? null : str05.trim();
    }

    public String getStr06() {
        return str06;
    }

    public void setStr06(String str06) {
        this.str06 = str06 == null ? null : str06.trim();
    }

    public Date getRefunddate() {
        return refunddate;
    }

    public void setRefunddate(Date refunddate) {
        this.refunddate = refunddate;
    }

    public Date getReviewdate() {
        return reviewdate;
    }

    public void setReviewdate(Date reviewdate) {
        this.reviewdate = reviewdate;
    }

    public String getReviewuser() {
        return reviewuser;
    }

    public void setReviewuser(String reviewuser) {
        this.reviewuser = reviewuser == null ? null : reviewuser.trim();
    }

    public Integer getRetundstatus() {
        return retundstatus;
    }

    public void setRetundstatus(Integer retundstatus) {
        this.retundstatus = retundstatus;
    }

    public String getRefusereason() {
        return refusereason;
    }

    public void setRefusereason(String refusereason) {
        this.refusereason = refusereason == null ? null : refusereason.trim();
    }

    public String getDpid() {
        return dpid;
    }

    public void setDpid(String dpid) {
        this.dpid = dpid == null ? null : dpid.trim();
    }

    public Short getAgentTyp() {
        return agentTyp;
    }

    public void setAgentTyp(Short agentTyp) {
        this.agentTyp = agentTyp;
    }

    public Integer getCouponFlag01() {
        return couponFlag01;
    }

    public void setCouponFlag01(Integer couponFlag01) {
        this.couponFlag01 = couponFlag01;
    }

    public Integer getOrderTyp() {
        return orderTyp;
    }

    public void setOrderTyp(Integer orderTyp) {
        this.orderTyp = orderTyp;
    }

    public Long getForeginId() {
        return foreginId;
    }

    public void setForeginId(Long foreginId) {
        this.foreginId = foreginId;
    }

    public String getForeginName() {
        return foreginName;
    }

    public void setForeginName(String foreginName) {
        this.foreginName = foreginName == null ? null : foreginName.trim();
    }

    public Date getSubDate() {
        return subDate;
    }

    public void setSubDate(Date subDate) {
        this.subDate = subDate;
    }

    public Long getTimepartId() {
        return timepartId;
    }

    public void setTimepartId(Long timepartId) {
        this.timepartId = timepartId;
    }

    public Integer getBuySl() {
        return buySl;
    }

    public void setBuySl(Integer buySl) {
        this.buySl = buySl;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Integer getVipFlag() {
        return vipFlag;
    }

    public void setVipFlag(Integer vipFlag) {
        this.vipFlag = vipFlag;
    }

    public Long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Long workerId) {
        this.workerId = workerId;
    }

    public String getWorkerInfo() {
        return workerInfo;
    }

    public void setWorkerInfo(String workerInfo) {
        this.workerInfo = workerInfo == null ? null : workerInfo.trim();
    }

    public String getWorkerMobile() {
        return workerMobile;
    }

    public void setWorkerMobile(String workerMobile) {
        this.workerMobile = workerMobile == null ? null : workerMobile.trim();
    }

    public Date getWorkerDate() {
        return workerDate;
    }

    public void setWorkerDate(Date workerDate) {
        this.workerDate = workerDate;
    }
}