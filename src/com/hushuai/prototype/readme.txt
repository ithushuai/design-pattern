原型模式(prototype pattern):用于创建重复的对象，同时又能保证性能。在java中，原型模式其实就是对象拷贝（clone），已经与java融为一体了，
很少单独使用，其实就是继承Cloneable接口，重写clone方法