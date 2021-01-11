create table RECORD_ORGANIZATION
(
    ID                             VARCHAR2(50) not null,
    DATE_CREATED                   DATE default null not null,
    DATE_UPDATED                   DATE              not null,
    CREATOR_ID                     VARCHAR2(50),
    LAST_MODIFIER_ID               VARCHAR2(512),
    DELETED                        NUMBER(10) default 0 not null,
    SERIAL_NUMBER                  NUMBER(10),
    NAME                           VARCHAR2(800),
    COUNTY                         VARCHAR2(160),
    ADDRESS                        VARCHAR2(800),
    ZIP                            VARCHAR2(80),
    X                              FLOAT,
    Y                              FLOAT,
    BUSINESS                       VARCHAR2(400),
    TYPE                           VARCHAR2(20),
    OFFICE_TEL                     VARCHAR2(40),
    COMPLAIN_TEL                   VARCHAR2(160),
    ECONOMIC_NATURE                VARCHAR2(100),
    REGISTERED_CAPITAL             VARCHAR2(80),
    REGISTERED_CURRENCY            VARCHAR2(240),
    REGISTERED_DATE                VARCHAR2(160),
    ORGANIZATION_CODE_PIC          VARCHAR2(2040),
    BUSINESS_LICENSE               VARCHAR2(240),
    BUSINESS_LICENSE_PIC           VARCHAR2(2040),
    LINKMAN                        VARCHAR2(160),
    LINK_TEL                       VARCHAR2(100),
    SOURCE                         VARCHAR2(240),
    STATUS                         VARCHAR2(160),
    REGISTER_TIME                  DATE,
    FIRST_TRAIL_TIME               DATE,
    REEXAMINE_TIME                 DATE,
    CHECK_TIME                     DATE,
    MAKE_CREDENTIALS_TIME          DATE,
    COMPLETED_RECORD_TIME          DATE,
    JURIDICAL_PERSON               VARCHAR2(60),
    JURIDICAL_PERSON_TEL           VARCHAR2(50),
    JURIDICAL_PERSON_CARDNO        VARCHAR2(60),
    JURIDICAL_PERSON_CARDNO_PIC    VARCHAR2(2040),
    JURIDICAL_PERSON_CARDNO_PIC_BA VARCHAR2(2040),
    RECORD_NO                      VARCHAR2(240),
    CARD_ADD_NO                    NUMBER(10),
    NOTE                           VARCHAR2(2040),
    CHECK_FLAG                     VARCHAR2(400),
    BEGIN_DATE                     DATE,
    END_DATE                       DATE,
    INSTCODE                       VARCHAR2(160),
    VIOLATIONS                     NUMBER(3) default '0',
    CONFINED                       NUMBER(3) default '0',
    REVIEW_INFO                    VARCHAR2(400),
    YYZZJYQXASR                    DATE,
    YYZZQXDQR                      DATE,
    ZZZSYXQSRQ                     DATE,
    ZZZSYXZZRQ                     DATE,
    CLRQ                           DATE,
    JYMJ                           NUMBER(18, 2),
    QYJC                           VARCHAR2(255),
    SZSS                           VARCHAR2(2),
    ZCDZ                           VARCHAR2(255),
    ZCZBDW                         VARCHAR2(2),
    FRDBZJMC                       VARCHAR2(50),
    CZHM                           VARCHAR2(50),
    DZYJ                           VARCHAR2(120),
    WANGZHAN                       VARCHAR2(120),
    ZZDJ                           VARCHAR2(2),
    ZZZSBH                         VARCHAR2(20),
    DJQXH                          VARCHAR2(6),
    ZJL                            VARCHAR2(50),
    LXDZ                           VARCHAR2(255),
    BAZT                           VARCHAR2(2),
    XYPJ                           VARCHAR2(2),
    JGLX                           VARCHAR2(2),
    MGSBH                          VARCHAR2(20),
    CITY_NO                        VARCHAR2(10) not null,
    CXBH                           VARCHAR2(100),
    FRDBZJLX                       VARCHAR2(2),
    ZJLX                           VARCHAR2(2),
    LOGIN_NAME                     VARCHAR2(30),
    PASSWORD                       VARCHAR2(30),
    CXFZ                           VARCHAR2(18),
    JURIDICAL_PERSON_SEX           VARCHAR2(10),
    JURIDICAL_PERSON_ADDRESS       VARCHAR2(600),
    TAX_NUM                        VARCHAR2(50),
    OFFICE_QQ                      VARCHAR2(50),
    LINK_QQ                        VARCHAR2(50),
    REFER_PLACE                    VARCHAR2(600),
    ASSOCIATION_MEMBER             VARCHAR2(10),
    CHARGES_SEC_NUM                VARCHAR2(50),
    COMPLAIN_NAME                  VARCHAR2(200),
    COMPLAIN_QQ                    VARCHAR2(50),
    DEPART_ID                      VARCHAR2(50),
    CCBSIGN                        VARCHAR2(2),
    LOGO_PIC                       VARCHAR2(2040),
    ORGANIZATION_CODE              VARCHAR2(30),
    ECONOMIC_LIMIT                 VARCHAR2(2040),
    YZCZYRS                        NUMBER(8),
    GJZCZYRS                       NUMBER(8),
    ZCRYZS                         NUMBER(8),
    ZJZCRS                         NUMBER(8),
    CJZCRS                         NUMBER(8),
    JZC                            NUMBER(20, 2),
    ZZC                            NUMBER(20, 2),
    PID                            VARCHAR2(50),
    CANCELL_REASON                 VARCHAR2(2040),
    ORGANIZATION_DATA_SOURCE       VARCHAR2(200),
    TELEPHONE                      VARCHAR2(400),
    RECORD_SOURCE                  VARCHAR2(50),
    JGQRCODE                       VARCHAR2(255),
    BUSINESS_TYPE                  VARCHAR2(200),
    KHYH                           VARCHAR2(200),
    JBZH                           VARCHAR2(200),
    QYJBQK                         VARCHAR2(500),
    SQWTR                          VARCHAR2(200),
    PYRY                           VARCHAR2(200),
    YYQXZ                          DATE,
    TZZT                           VARCHAR2(200),
    SQWTRDH                        VARCHAR2(200),
    GDMC                           VARCHAR2(200),
    GDLX                           VARCHAR2(200),
    GDZJHM                         VARCHAR2(200),
    GQBL                           VARCHAR2(200),
    BGSX                           VARCHAR2(200),
    JYCS                           VARCHAR2(200),
    SFGS                           VARCHAR2(1),
    SFGYQY                         VARCHAR2(2)
) /

comment on column RECORD_ORGANIZATION.CREATOR_ID is '创建人ID'
/

comment on column RECORD_ORGANIZATION.SERIAL_NUMBER is '流水号'
/

comment on column RECORD_ORGANIZATION.NAME is '机构名'
/

comment on column RECORD_ORGANIZATION.COUNTY is '区域'
/

comment on column RECORD_ORGANIZATION.ADDRESS is '机构的地址'
/

comment on column RECORD_ORGANIZATION.ZIP is '邮政编码'
/

comment on column RECORD_ORGANIZATION.X is '地图坐标X'
/

comment on column RECORD_ORGANIZATION.Y is '地图坐标Y'
/

comment on column RECORD_ORGANIZATION.BUSINESS is '企业类型：01-住房租赁企业;02-房地产经纪机构;03-物业公司;99-其他'
/

comment on column RECORD_ORGANIZATION.TYPE is '机构类型：总部  直营 加盟 个体工商户'
/

comment on column RECORD_ORGANIZATION.OFFICE_TEL is '办公电话'
/

comment on column RECORD_ORGANIZATION.COMPLAIN_TEL is '投诉联系电话'
/

comment on column RECORD_ORGANIZATION.ECONOMIC_NATURE is '经纪性质'
/

comment on column RECORD_ORGANIZATION.REGISTERED_CAPITAL is '注册资金 单位万元'
/

comment on column RECORD_ORGANIZATION.REGISTERED_CURRENCY is '注册资金币种'
/

comment on column RECORD_ORGANIZATION.REGISTERED_DATE is '工商登记时间'
/

comment on column RECORD_ORGANIZATION.ORGANIZATION_CODE_PIC is '组织机构代码图片'
/

comment on column RECORD_ORGANIZATION.BUSINESS_LICENSE is '营业执照号'
/

comment on column RECORD_ORGANIZATION.BUSINESS_LICENSE_PIC is '营业执照号图片'
/

comment on column RECORD_ORGANIZATION.LINKMAN is '联系人姓名'
/

comment on column RECORD_ORGANIZATION.LINK_TEL is '联系人电话号码'
/

comment on column RECORD_ORGANIZATION.SOURCE is '数据来源'
/

comment on column RECORD_ORGANIZATION.STATUS is '状态'
/

comment on column RECORD_ORGANIZATION.REGISTER_TIME is '登记（受理, 录入）时间'
/

comment on column RECORD_ORGANIZATION.FIRST_TRAIL_TIME is '初审时间'
/

comment on column RECORD_ORGANIZATION.REEXAMINE_TIME is '复审时间'
/

comment on column RECORD_ORGANIZATION.CHECK_TIME is '审核时间'
/

comment on column RECORD_ORGANIZATION.MAKE_CREDENTIALS_TIME is '制证时间'
/

comment on column RECORD_ORGANIZATION.COMPLETED_RECORD_TIME is '完成备案时间'
/

comment on column RECORD_ORGANIZATION.JURIDICAL_PERSON is '法人'
/

comment on column RECORD_ORGANIZATION.JURIDICAL_PERSON_TEL is '法人联系电话'
/

comment on column RECORD_ORGANIZATION.JURIDICAL_PERSON_CARDNO is '法人身份证号'
/

comment on column RECORD_ORGANIZATION.JURIDICAL_PERSON_CARDNO_PIC is '法人身份证正面图片'
/

comment on column RECORD_ORGANIZATION.JURIDICAL_PERSON_CARDNO_PIC_BA is '法人身份证背面图片'
/

comment on column RECORD_ORGANIZATION.RECORD_NO is '备案号'
/

comment on column RECORD_ORGANIZATION.CARD_ADD_NO is '备案号后缀'
/

comment on column RECORD_ORGANIZATION.NOTE is '备注信息'
/

comment on column RECORD_ORGANIZATION.CHECK_FLAG is '当前机构所在流程'
/

comment on column RECORD_ORGANIZATION.BEGIN_DATE is '备案证 开始日期'
/

comment on column RECORD_ORGANIZATION.END_DATE is '备案证 结束日期'
/

comment on column RECORD_ORGANIZATION.INSTCODE is '网签系统机构ID'
/

comment on column RECORD_ORGANIZATION.VIOLATIONS is '是否违规'
/

comment on column RECORD_ORGANIZATION.CONFINED is '是否网签受限'
/

comment on column RECORD_ORGANIZATION.REVIEW_INFO is '机构审阅情况'
/

comment on column RECORD_ORGANIZATION.DZYJ is '电子邮件'
/

comment on column RECORD_ORGANIZATION.CXBH is '诚信编号'
/

comment on column RECORD_ORGANIZATION.FRDBZJLX is '法人代表证件类型'
/

comment on column RECORD_ORGANIZATION.ZJLX is '企业证件类型（三证合一）'
/

comment on column RECORD_ORGANIZATION.LOGIN_NAME is '机构管理员登录账号'
/

comment on column RECORD_ORGANIZATION.PASSWORD is '机构管理员登录账号密码'
/

comment on column RECORD_ORGANIZATION.CXFZ is '诚信分值'
/

comment on column RECORD_ORGANIZATION.JURIDICAL_PERSON_SEX is '负责人性别(1男2女)'
/

comment on column RECORD_ORGANIZATION.JURIDICAL_PERSON_ADDRESS is '负责人家庭住址'
/

comment on column RECORD_ORGANIZATION.TAX_NUM is '税务登记号'
/

comment on column RECORD_ORGANIZATION.OFFICE_QQ is '办公QQ'
/

comment on column RECORD_ORGANIZATION.LINK_QQ is '联系人QQ'
/

comment on column RECORD_ORGANIZATION.REFER_PLACE is '显著地标'
/

comment on column RECORD_ORGANIZATION.ASSOCIATION_MEMBER is '是否协会会员'
/

comment on column RECORD_ORGANIZATION.CHARGES_SEC_NUM is '收费监审证号'
/

comment on column RECORD_ORGANIZATION.COMPLAIN_NAME is '投诉负责人姓名'
/

comment on column RECORD_ORGANIZATION.COMPLAIN_QQ is '投诉负责人QQ'
/

comment on column RECORD_ORGANIZATION.DEPART_ID is '所属房管局'
/

comment on column RECORD_ORGANIZATION.CCBSIGN is '是否与建行签约'
/

comment on column RECORD_ORGANIZATION.LOGO_PIC is '企业logo图片'
/

comment on column RECORD_ORGANIZATION.ORGANIZATION_CODE is '组织机构代码'
/

comment on column RECORD_ORGANIZATION.ECONOMIC_LIMIT is '经营范围'
/

comment on column RECORD_ORGANIZATION.YZCZYRS is '有职称专业人数'
/

comment on column RECORD_ORGANIZATION.GJZCZYRS is '高级职称人数'
/

comment on column RECORD_ORGANIZATION.ZCRYZS is '在册人员总数'
/

comment on column RECORD_ORGANIZATION.ZJZCRS is '中级职称人数'
/

comment on column RECORD_ORGANIZATION.CJZCRS is '初级职称人数'
/

comment on column RECORD_ORGANIZATION.JZC is '净资产（元）'
/

comment on column RECORD_ORGANIZATION.ZZC is '总资产（元）'
/

comment on column RECORD_ORGANIZATION.PID is '上级机构ID'
/

comment on column RECORD_ORGANIZATION.RECORD_SOURCE is '机构信息录入来源'
/

comment on column RECORD_ORGANIZATION.JGQRCODE is '二维码nas路径'
/

comment on column RECORD_ORGANIZATION.BUSINESS_TYPE is 'KYBG 开业报告   JGBA 机构备案'
/

comment on column RECORD_ORGANIZATION.KHYH is '开户银行'
/

comment on column RECORD_ORGANIZATION.JBZH is '基本账号'
/

comment on column RECORD_ORGANIZATION.QYJBQK is '企业基本情况简介'
/

comment on column RECORD_ORGANIZATION.SQWTR is '授权委托人'
/

comment on column RECORD_ORGANIZATION.PYRY is '聘用人员（人）'
/

comment on column RECORD_ORGANIZATION.YYQXZ is '营业期限至'
/

comment on column RECORD_ORGANIZATION.TZZT is '投资主体'
/

comment on column RECORD_ORGANIZATION.SQWTRDH is '授权委托人电话'
/

comment on column RECORD_ORGANIZATION.GDMC is '股东名称'
/

comment on column RECORD_ORGANIZATION.GDLX is '股东类型'
/

comment on column RECORD_ORGANIZATION.GDZJHM is '股东证件号码'
/

comment on column RECORD_ORGANIZATION.GQBL is '股权比例'
/

comment on column RECORD_ORGANIZATION.BGSX is '报告事项'
/

comment on column RECORD_ORGANIZATION.JYCS is '经营场所'
/

comment on column RECORD_ORGANIZATION.SFGS is '是否公示 0：否1：是 默认：空'
/

comment on column RECORD_ORGANIZATION.SFGYQY is '是否国有企业'
/

create
index INDEXON
    on RECORD_ORGANIZATION (CITY_NO, STATUS)
/

create
index IDX_RECORD_ORGANIZATION_3
    on RECORD_ORGANIZATION (CITY_NO)
/

create
index IDX_RECORD_ORGAN_DATEUPDATED
    on RECORD_ORGANIZATION (TO_CHAR("DATE_UPDATED", 'YYYYMMDD'))
/

create
index IDX_RECORD_ORGAN_DATECREATED
    on RECORD_ORGANIZATION (TO_CHAR("DATE_CREATED", 'YYYYMMDD'))
/

