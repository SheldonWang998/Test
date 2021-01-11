/***查询oracle数据库表的结构***/
SELECT t1.Table_Name || chr(13)                     AS 表名称,
       t3.comments                                  AS 表说明,
       t1.Column_Name                               AS 字段名称,
       t1.DATA_TYPE || '(' || t1.DATA_LENGTH || ')' AS 数据类型,
       t1.NullAble                                  AS 是否为空,
       t2.Comments                                  AS 字段说明,
       t1.Data_Default                              AS 默认值,
       t4.created                                   AS 建表时间
FROM cols t1
         LEFT JOIN user_col_comments t2
                   ON t1.Table_name = t2.Table_name
                       AND t1.Column_Name = t2.Column_Name
         LEFT JOIN user_tab_comments t3
                   ON t1.Table_name = t3.Table_name
         LEFT JOIN user_objects t4
                   ON t1.table_name = t4.OBJECT_NAME
WHERE t1.TABLE_NAME = 'TOM_PROJECT_IMF'
ORDER BY t1.Column_ID;
