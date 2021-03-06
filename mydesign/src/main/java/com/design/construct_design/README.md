##结构型模式
结构型模式描述如何将类或对象按某种布局组成更大的结构。它分为类结构型模式和对象结构型模式，
前者采用继承机制来组织接口和类，后者采用组合或聚合来组成对象。<br>
由于组合或聚合关系比继承关系耦合度低，满足“合成复用原则”，所以对象结构型模式比类结构型模式具有更大的灵活性。
> 结构型模式
>> 代理模式
> * 概念：由于某些原因需要给某对象提供一个代理以控制对该对象的访问，访问对象不适合或者不能直接引用目标对象，代理对象作为访问对象和目标对象之间的中介。
> * 分类：根据代理类生成时机不同，分为静态代理和动态代理
>   * 静态代理：代理类在编译期生成
>   * 动态代理：在Java运行时动态生成。Java中提供JDK动态代理和CGLIB动态代理。
>       * JDK动态代理是基于接口生成的代理类
>       * CGLIB动态代理是基于子类生成的代理类
> * 角色：
>   * 抽象主题类：通过接口或抽象类声明真实主题和代理对象实现的业务方法。
>   * 真实主题类：实现抽象主题中的具体业务，是代理对象所代表的真实对象，是最终要引用的对象。
>   * 代理类：提供与真实主题相同的接口，其内部含有对真实主题的引用，它可以访问、控制或扩展真实主题的功能
> * 例子：模拟火车站卖票，代售点作为代理对象，卖票接口作为抽象主题类，火车站作为真实主题类
> * 比较：
>   * 动态代理和静态代理：
>       * 动态代理中接口或父类声明的所有方法都被转移到调用处理器的一个集中方法中处理（InvocationHandler.invoke）。灵活且代码维护方便。不同方法的增强方式可以通过method.getName()来区分。
>       * 静态代理，如果接口增加一个方法，除了所有实现类实现这个方法外，代理类也要实现，增加了代码维护的复杂度。
>   * jdk代理和CGLIB代理：
>       * 有接口时用jdk代理，没接口时用CGLIB代码。jdk1.8，jdk代理效率要更高些。
>> 适配器模式 
> * 分类
>> 装饰者模式
> * 分类
>> 桥接模式
> * 分类
>> 外观模式
> * 分类
>> 组合模式
> * 分类
>> 享元模式
> * 分类