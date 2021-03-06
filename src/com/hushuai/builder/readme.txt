建造者模式（Builder pattern）：使一个简单的对象一步一步构建成一个复杂的对象。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
意图：将一个复杂的构建与其表示相分离
当一个对象的创建很复杂，可能会有很多的构造参数，使用构造方法创建则显得不人性化，甚至可能会出现传递错误的构造参数，导致创建的对象
事与愿违。这时候的对象创建鼓励使用Builder模式
创建一个完整的复杂对象需要N步，可以理解为有N个构造参数，用户往往不需要完整的复杂对象，只需要指定一部分参数即可，甚至这部分参数指定的
顺序也不一样。所以建造者模式可以使用户在构造任何几个部件的情况下都能得到一个完整对象。使用者甚至不需要知道创建一个对象到底需要多少参数
，使用者只需要对对象的部分属性进行自定义
例如：在SpringData-ElaticSearch的使用中，需要传入“查询实体”对象，而查询实体对象由一个建造者NativeSearchQueryBuilder来构建，
需要添加查询条件：queryBuilder.withQuery(xxx)
需要排序：queryBuilder.withSort(xxx)...
获得对象：queryBuilder.build()
类似于这种模式
