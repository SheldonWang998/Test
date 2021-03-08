package com.rexyn.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 苏州租赁房源数据(QdLeaseSzsj)实体类
 *
 * @author makejava
 * @since 2021-03-08 16:26:07
 */
public class QdLeaseSzsj implements Serializable {
    private static final long serialVersionUID = -68162371016338352L;
    /**
    * 记录唯一标识
    */
    private String fwId;
    /**
    * 平台编码，关联平台信息表
    */
    private String ptCode;
    /**
    * 平台名称
    */
    private String ptName;
    /**
    * 平台房屋ID，各个中介平台系统中房屋唯一编码
    */
    private String ptfwId;
    /**
    * 区县地区名称
    */
    private String distinctName;
    /**
    * 区域坂块名称
    */
    private String regionName;
    /**
    * 小区ID，关联小区表
    */
    private String communilyId;
    /**
    * 小区名字
    */
    private String communilyName;
    /**
    * 房屋坐落，房屋类型为独幢时需有值，为分散时可为空
    */
    private String zuoluo;
    /**
    * 小区经度
    */
    private Float lon;
    /**
    * 小区纬度
    */
    private Float lat;
    /**
    * 标题，房屋情况描述
    */
    private String title;
    /**
    * 房屋类型，独幢/分散
    */
    private String leixing;
    /**
    * 租房方式，整租/合租
    */
    private String rentWay;
    /**
    * 租房面积（平方米
    */
    private Float square;
    /**
    * 租金总价（元）
    */
    private Float rentPrice;
    /**
    * 房屋套型，如：二室一厅
    */
    private String houseType;
    /**
    * 房源平台的页面链接
    */
    private String detaiipageUrl;
    /**
    * 房源发布人员，房地产经纪信用平台从业人员编号（SZ_00022684）
    */
    private String cyrybh;
    /**
    * 状态，0：上传：1上架，2：下架
    */
    private String status;
    /**
    * 房源核验码，房源核验成功后生成
    */
    private String heyanId;
    /**
    * 数据更新时间
    */
    private Date updateTime;


    public String getFwId() {
        return fwId;
    }

    public void setFwId(String fwId) {
        this.fwId = fwId;
    }

    public String getPtCode() {
        return ptCode;
    }

    public void setPtCode(String ptCode) {
        this.ptCode = ptCode;
    }

    public String getPtName() {
        return ptName;
    }

    public void setPtName(String ptName) {
        this.ptName = ptName;
    }

    public String getPtfwId() {
        return ptfwId;
    }

    public void setPtfwId(String ptfwId) {
        this.ptfwId = ptfwId;
    }

    public String getDistinctName() {
        return distinctName;
    }

    public void setDistinctName(String distinctName) {
        this.distinctName = distinctName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCommunilyId() {
        return communilyId;
    }

    public void setCommunilyId(String communilyId) {
        this.communilyId = communilyId;
    }

    public String getCommunilyName() {
        return communilyName;
    }

    public void setCommunilyName(String communilyName) {
        this.communilyName = communilyName;
    }

    public String getZuoluo() {
        return zuoluo;
    }

    public void setZuoluo(String zuoluo) {
        this.zuoluo = zuoluo;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLeixing() {
        return leixing;
    }

    public void setLeixing(String leixing) {
        this.leixing = leixing;
    }

    public String getRentWay() {
        return rentWay;
    }

    public void setRentWay(String rentWay) {
        this.rentWay = rentWay;
    }

    public Float getSquare() {
        return square;
    }

    public void setSquare(Float square) {
        this.square = square;
    }

    public Float getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(Float rentPrice) {
        this.rentPrice = rentPrice;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getDetaiipageUrl() {
        return detaiipageUrl;
    }

    public void setDetaiipageUrl(String detaiipageUrl) {
        this.detaiipageUrl = detaiipageUrl;
    }

    public String getCyrybh() {
        return cyrybh;
    }

    public void setCyrybh(String cyrybh) {
        this.cyrybh = cyrybh;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHeyanId() {
        return heyanId;
    }

    public void setHeyanId(String heyanId) {
        this.heyanId = heyanId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}