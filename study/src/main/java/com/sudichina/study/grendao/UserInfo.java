package com.sudichina.study.grendao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

@Entity
public class UserInfo {

    /**
     * id : 20
     * phone : 13552564452
     * password : d1a804f5325d711784977c52d85947ec
     * name : “”
     * sex : 1
     * birthday : ““
     * idCardNo : ”“
     * idCardJust : ”“
     * idCardBack : ”“
     * idCardHand : ” ”
     * provincialCode : “”
     * provincialName :
     * cityCode :
     * cityName :
     * countyCode :
     * countyName :
     * detailedAddress :
     * balance : 0
     * freezingBalance : 0
     * driverFollow : 1
     * driverLicense :
     * companyName :
     * companyOpeningbank :
     * companyCreditcode :
     * companyAccountbankAccount :
     * companyOperate :
     * companyOperateMobile :
     * companyOperateIdcard :
     * companyBusinessLicense :
     * companyOpenIcence :
     * companyOperateIdcardimg :
     * bankcardNo :
     * bankcardPassword :
     * bankcardMobile :
     * bankcardName :
     * bankcardIdcard :
     * carOwnerType : 认证类型企业与个人 1个人 2企业
     * registerTime : “”
     * isFrozen : 0
     * auditPeople : “”
     * auditTime : “”
     * auditStatus :
     * userType : 2
     * remark : “”
     * headImage : “”
     * createTime : ”“
     * updateTime : “”
     * logo : 银行卡图标
     */

    @Id(autoincrement = true)
    private Long id;
    private String carownerId;
    private String phone;
    private String password;
    private String name;

    public String getBankcardAccountbank() {
        return bankcardAccountbank;
    }

    public void setBankcardAccountbank(String bankcardAccountbank) {
        this.bankcardAccountbank = bankcardAccountbank;
    }

    public String getBankcardType() {
        return bankcardType;
    }

    public void setBankcardType(String bankcardType) {
        this.bankcardType = bankcardType;
    }

    private String bankcardAccountbank;
    private String bankcardType;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    private String nickName;


    public String getCeshi() {
        return ceshi;
    }

    public void setCeshi(String ceshi) {
        this.ceshi = ceshi;
    }

    private String ceshi;
    private String ceshi4;

    public String getCeshi4() {
        return ceshi4;
    }

    public void setCeshi4(String ceshi4) {
        this.ceshi4 = ceshi4;
    }

    private String sex;
    private String birthday;
    private String idCardNo;
    private String idCardJust;
    private String idCardBack;
    private String idCardHand;
    private String provincialCode;
    private String provincialName;
    private String cityCode;
    private String cityName;
    private String countyCode;
    private String countyName;
    private String detailedAddress;
    private String balance;
    private String freezingBalance;
    private String driverFollow;
    private String driverLicense;
    private String companyName;
    private String companyOpeningbank;
    private String companyCreditcode;
    private String companyAccountbankAccount;
    private String companyOperate;
    private String companyOperateMobile;
    private String companyOperateIdcard;
    private String companyBusinessLicense;
    private String companyOpenIcence;
    private String companyOperateIdcardimg;
    private String bankcardNo;
    private String bankcardPassword;
    private String bankcardMobile;
    private String bankcardName;
    private String bankcardIdcard;
    private String carOwnerType;
    private String registerTime;
    private String isFrozen;
    private String auditPeople;
    private String auditTime;
    private String auditStatus;

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    private String logo;

    public String getIsBindingCar() {
        return isBindingCar + "";
    }

    public void setIsBindingCar(String isBindingCar) {
        this.isBindingCar = isBindingCar;
    }

    private String isBindingCar;
    private String userType;
    private String remark;
    private String headImage;
    private String createTime;

    public String getCarownerId() {
        return carownerId + "";
    }

    public void setCarownerId(String carownerId) {
        this.carownerId = carownerId;
    }

    private String updateTime;

    public UserInfo(String name) {
        this.nickName = name;
    }

    @Generated(hash = 1085590577)
    public UserInfo(Long id, String carownerId, String phone, String password,
            String name, String bankcardAccountbank, String bankcardType,
            String nickName, String ceshi, String ceshi4, String sex,
            String birthday, String idCardNo, String idCardJust, String idCardBack,
            String idCardHand, String provincialCode, String provincialName,
            String cityCode, String cityName, String countyCode, String countyName,
            String detailedAddress, String balance, String freezingBalance,
            String driverFollow, String driverLicense, String companyName,
            String companyOpeningbank, String companyCreditcode,
            String companyAccountbankAccount, String companyOperate,
            String companyOperateMobile, String companyOperateIdcard,
            String companyBusinessLicense, String companyOpenIcence,
            String companyOperateIdcardimg, String bankcardNo,
            String bankcardPassword, String bankcardMobile, String bankcardName,
            String bankcardIdcard, String carOwnerType, String registerTime,
            String isFrozen, String auditPeople, String auditTime,
            String auditStatus, String logo, String isBindingCar, String userType,
            String remark, String headImage, String createTime, String updateTime) {
        this.id = id;
        this.carownerId = carownerId;
        this.phone = phone;
        this.password = password;
        this.name = name;
        this.bankcardAccountbank = bankcardAccountbank;
        this.bankcardType = bankcardType;
        this.nickName = nickName;
        this.ceshi = ceshi;
        this.ceshi4 = ceshi4;
        this.sex = sex;
        this.birthday = birthday;
        this.idCardNo = idCardNo;
        this.idCardJust = idCardJust;
        this.idCardBack = idCardBack;
        this.idCardHand = idCardHand;
        this.provincialCode = provincialCode;
        this.provincialName = provincialName;
        this.cityCode = cityCode;
        this.cityName = cityName;
        this.countyCode = countyCode;
        this.countyName = countyName;
        this.detailedAddress = detailedAddress;
        this.balance = balance;
        this.freezingBalance = freezingBalance;
        this.driverFollow = driverFollow;
        this.driverLicense = driverLicense;
        this.companyName = companyName;
        this.companyOpeningbank = companyOpeningbank;
        this.companyCreditcode = companyCreditcode;
        this.companyAccountbankAccount = companyAccountbankAccount;
        this.companyOperate = companyOperate;
        this.companyOperateMobile = companyOperateMobile;
        this.companyOperateIdcard = companyOperateIdcard;
        this.companyBusinessLicense = companyBusinessLicense;
        this.companyOpenIcence = companyOpenIcence;
        this.companyOperateIdcardimg = companyOperateIdcardimg;
        this.bankcardNo = bankcardNo;
        this.bankcardPassword = bankcardPassword;
        this.bankcardMobile = bankcardMobile;
        this.bankcardName = bankcardName;
        this.bankcardIdcard = bankcardIdcard;
        this.carOwnerType = carOwnerType;
        this.registerTime = registerTime;
        this.isFrozen = isFrozen;
        this.auditPeople = auditPeople;
        this.auditTime = auditTime;
        this.auditStatus = auditStatus;
        this.logo = logo;
        this.isBindingCar = isBindingCar;
        this.userType = userType;
        this.remark = remark;
        this.headImage = headImage;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    @Generated(hash = 1279772520)
    public UserInfo() {
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getIdCardJust() {
        return idCardJust;
    }

    public void setIdCardJust(String idCardJust) {
        this.idCardJust = idCardJust;
    }

    public String getIdCardBack() {
        return idCardBack;
    }

    public void setIdCardBack(String idCardBack) {
        this.idCardBack = idCardBack;
    }

    public String getIdCardHand() {
        return idCardHand;
    }

    public void setIdCardHand(String idCardHand) {
        this.idCardHand = idCardHand;
    }

    public String getProvincialCode() {
        return provincialCode;
    }

    public void setProvincialCode(String provincialCode) {
        this.provincialCode = provincialCode;
    }

    public String getProvincialName() {
        return provincialName;
    }

    public void setProvincialName(String provincialName) {
        this.provincialName = provincialName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getBalance() {
        return balance + "";
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getFreezingBalance() {
        return freezingBalance + "";
    }

    public void setFreezingBalance(String freezingBalance) {
        this.freezingBalance = freezingBalance;
    }

    public String getDriverFollow() {
        return driverFollow;
    }

    public void setDriverFollow(String driverFollow) {
        this.driverFollow = driverFollow;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyOpeningbank() {
        return companyOpeningbank;
    }

    public void setCompanyOpeningbank(String companyOpeningbank) {
        this.companyOpeningbank = companyOpeningbank;
    }

    public String getCompanyCreditcode() {
        return companyCreditcode;
    }

    public void setCompanyCreditcode(String companyCreditcode) {
        this.companyCreditcode = companyCreditcode;
    }

    public String getCompanyAccountbankAccount() {
        return companyAccountbankAccount;
    }

    public void setCompanyAccountbankAccount(String companyAccountbankAccount) {
        this.companyAccountbankAccount = companyAccountbankAccount;
    }

    public String getCompanyOperate() {
        return companyOperate;
    }

    public void setCompanyOperate(String companyOperate) {
        this.companyOperate = companyOperate;
    }

    public String getCompanyOperateMobile() {
        return companyOperateMobile;
    }

    public void setCompanyOperateMobile(String companyOperateMobile) {
        this.companyOperateMobile = companyOperateMobile;
    }

    public String getCompanyOperateIdcard() {
        return companyOperateIdcard;
    }

    public void setCompanyOperateIdcard(String companyOperateIdcard) {
        this.companyOperateIdcard = companyOperateIdcard;
    }

    public String getCompanyBusinessLicense() {
        return companyBusinessLicense;
    }

    public void setCompanyBusinessLicense(String companyBusinessLicense) {
        this.companyBusinessLicense = companyBusinessLicense;
    }

    public String getCompanyOpenIcence() {
        return companyOpenIcence;
    }

    public void setCompanyOpenIcence(String companyOpenIcence) {
        this.companyOpenIcence = companyOpenIcence;
    }

    public String getCompanyOperateIdcardimg() {
        return companyOperateIdcardimg;
    }

    public void setCompanyOperateIdcardimg(String companyOperateIdcardimg) {
        this.companyOperateIdcardimg = companyOperateIdcardimg;
    }

    public String getBankcardNo() {
        return bankcardNo;
    }

    public void setBankcardNo(String bankcardNo) {
        this.bankcardNo = bankcardNo;
    }

    public String getBankcardPassword() {
        return bankcardPassword;
    }

    public void setBankcardPassword(String bankcardPassword) {
        this.bankcardPassword = bankcardPassword;
    }

    public String getBankcardMobile() {
        return bankcardMobile;
    }

    public void setBankcardMobile(String bankcardMobile) {
        this.bankcardMobile = bankcardMobile;
    }

    public String getBankcardName() {
        return bankcardName;
    }

    public void setBankcardName(String bankcardName) {
        this.bankcardName = bankcardName;
    }

    public String getBankcardIdcard() {
        return bankcardIdcard;
    }

    public void setBankcardIdcard(String bankcardIdcard) {
        this.bankcardIdcard = bankcardIdcard;
    }

    public String getCarOwnerType() {
        return carOwnerType;
    }

    public void setCarOwnerType(String carOwnerType) {
        this.carOwnerType = carOwnerType;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public String getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(String isFrozen) {
        this.isFrozen = isFrozen;
    }

    public String getAuditPeople() {
        return auditPeople;
    }

    public void setAuditPeople(String auditPeople) {
        this.auditPeople = auditPeople;
    }

    public String getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditStatus() {
        return auditStatus + "";
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
