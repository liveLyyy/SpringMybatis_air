Spring-MyBatis整合实例
=====================
1、beans配置文件配置<br>
```xml
   <!--数据源封装类-->
    <bean id="DataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
        <property name="driverClassName" value="com.mysql.jdbc.Driver"/>
        <property name="url" value="jdbc:mysql://localhost:3306/mybatis?serverTimezone=UTC"/>
        <property name="username" value="root"/>
        <property name="password" value="root"/>
    </bean>

    <!--创建SqlSessionFactory对象-->
    <bean id="factory" class="org.mybatis.spring.SqlSessionFactoryBean">
        <!--引用数据源-->
        <property name="dataSource" ref="DataSource"/>
    </bean>
    <!--扫描器相当于mybatis中package标签，扫描后会给对应接口创建对象-->
    <bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
        <!--扫描包路径-->
        <property name="basePackage" value="com.liyan.mapper"/>
        <property name="sqlSessionFactory" ref="factory"/>
    </bean>
    <!--由spring管理service实现类-->
    <bean id="airPortService" class="com.liyan.service.Impl.AirPortServiceImpl">
        <property name="airPortMapper" ref="airPortMapper"/>
    </bean>
```
2、规则<br>
>2.1、编写mapper包下时必须使用接口绑定方案或注解方案（必须有接口）<br>
>2.2、需要在service实现类中声明mapper接口对象并生成get/set方法<br>
>2.3、spring无法管理servlet<br>