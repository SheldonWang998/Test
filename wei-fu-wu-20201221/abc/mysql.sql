
/*********************查询数据库中表结构-- 导出到Excel表格*************************/
select column_name              as '字段类型',
       column_type              as '数据类型',
       data_type                as '字段类型',
       character_maximum_length as '长度',
       is_nullable              as '是否为空',
       column_default           as '默认值',
       column_comment           as '备注'
into outfile 'E:/mysqlData1.xls'
from information_schema.columns
where table_schema = 'my_test_demo'
  and table_name = 'user';

/******************查询数据库中表数据-- 导出到Excel表格*******************************************/
select *
into outfile 'E:/mysqlData2.xls'
from user;