默认事务管理器JDBC  默认连接池POLLED
如果外部引入properties文件，必须放在xml文件最上面
外部引入的配置文件，如链接数据库的驱动，url，username，password，外部文件的优先级高于xml文件内部的属性设置
采取package包名优化时，别名使用大小写均可
使用注解实现区别名，在相应实体类上面@Alies（别名），在扫描包取别名的基础上


映射器：注册绑定mapper
1.类路径(推荐使用)
,,,
    <mappers>
        <mapper resource="com/lzz/Dao/UserMapper.xml"/>
    </mappers>
,,,

2.class映射
,,,
    <mappers>
      <mapper class="org.mybatis.builder.AuthorMapper"/>
      <mapper class="org.mybatis.builder.BlogMapper"/>
      <mapper class="org.mybatis.builder.PostMapper"/>
    </mappers>
,,,
注意事项;
1.接口和他的Mapper配置文件必须同名
2.两个文件必须在同一个包下

3.包扫描
,,,
    <mappers>
      <package name="org.mybatis.builder"/>
    </mappers>
,,,
注意事项同第二个

字段名与属性名不一致时
1.在sql语句中起别名 eg：pwd as password
















