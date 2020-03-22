构建Mybatis工程：
1.写SqlSessionFactory的实现类，获取SqlSessionFactory对象,利用SQLSessionFactory对象获取SqlSession
2.实现类需要一个resource里面的xml配置文件mybatis-config.xml
  在里面写configuration核心配置文件,写入和数据库的jdbc链接，再导入对数据库的操作
3.写实体类属性，其属性和数据库字段一一对应，实现get，set方法，有参无参构造方法，toString方法
4.写相应Mapper的接口，然后写相应Mapper的xml文件，
  namespace绑定唯一接口，里面的id指向接口中的方法，resultxxx规定返回类型，指向实体类(写全路径)
5.写测试类，利用实现类获取SqlSession

以后在增加功能时，实体类和实现类就不用更改任何东西，只需要更改接口Mapper和相应的Mapper.xml配置文件
对数据库的增删改必须提交事务
java中使用模糊查询时必须使用通配符%value%，value时用户输入
1.java代码执行时传递通配符
  List<User> userlist=mapper.getUserLike("%李%");
2.sql拼接时使用通配符
  select * from test1.User where name like "%"#{value}"%"











