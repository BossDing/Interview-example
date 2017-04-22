#如何理解Hibernate的延迟加载机制？在实际应用中，延迟加载与Session关闭的矛盾是如何处理的？

延迟加载就是并不是在读取的时候就把数据加载进来，而是等到使用时再加载。
Hibernate使用了虚拟代理机制实现延迟加载，我们使用Session的load()方法加载数据
或者一对多关联映射在使用延迟加载的情况下从一的一方加载多的一方，得到的都是虚拟代理，
简单的说返回给用户的并不是实体本身，而是实体对象的代理。代理对象在用户调用getter方法时才会去数据库加载数据。
但加载数据就需要数据库连接。而当我们把会话关闭时，数据库连接就同时关闭了。

#延迟加载与session关闭的矛盾一般可以这样处理：   
> * 关闭延迟加载特性。这种方式操作起来比较简单，因为Hibernate的延迟加载特性是可以通过映射文件或者注解进行配置的，
但这种解决方案存在明显的缺陷。首先，出现”no session or session was closed”通常说明系统中已经存在主外键关联，
如果去掉延迟加载的话，每次查询的开销都会变得很大。    

> * 在session关闭之前先获取需要查询的数据，可以使用工具方法Hibernate.isInitialized()判断对象是否被加载，
如果没有被加载则可以使用Hibernate.initialize()方法加载对象。     

> * 使用拦截器或过滤器延长Session的生命周期直到视图获得数据。
Spring整合Hibernate提供的OpenSessionInViewFilter和OpenSessionInViewInterceptor就是这种做法。