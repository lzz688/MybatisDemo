使用注解实现crud，相应的Mapper接口不需要实现xml配置文件
但仍需要在核心配置文件mybatis-config.xml中注册绑定接口

在对应的方法上面写sql语句

@Param:
1.当有参数时，若参数类型为基本数据类型或者String时,前面可以使用
2.@Param（）注解来标示数据名，这也是sql语句查找的依据，他写的数据名优先级
  比相应方法中写的参数名要高
3.引用类型不需要写
  
Mybatis执行流程：
开始-->Resource加载全局配置文件-->实例化SqlSessionFactoryBuilder构造器-->解析配置文件流XMlConfigBuilder
-->Configuration所有的配置信息-->生成SqlSessionFactory-->transaction事务管理-->创建executor执行器-->
创建SqlSession-->实现crud(如出现问题则会回滚到事务管理)-->检测是否执行成功(如出现问题则会回滚到事务管理)
  