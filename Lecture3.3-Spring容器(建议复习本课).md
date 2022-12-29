Lecture3.3-Spring容器

(建议复习本课)

https://www.bilibili.com/video/BV1eW4y1e7Gf/?p=3&spm_id_from=pageDriver&vd_source=ab70a9e722c9b39daeacc07aeafe96d2

Spring的容器是怎样创建Bean对象，并且去管理的？

- BeanFactory接口

![image-20221229161753998](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212291617090.png)

- 但是现在用的更多的是ApplicationContext，是BeanFactory的子接口，实现了更多的方法。

![image-20221229161839637](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212291618728.png)

- 控制反转的实现机制

  对象之间的依赖自己不管了，交给容器去处理，容器通过构造函数以及set方法，来进行依赖注入，完成关联。配置的方法主要是Java代码和注解。

- @Autowired是自动绑定依赖注入

  如下，加了@Autowired之后，Boss_constructor会去在Bean里面找Car和Office，自动注入；

![image-20221229164133794](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212291641873.png)

因为依赖注入一般在构造函数和set方法中进行，所以@Autowired一般放在它们之前，如下：

![image-20221229164236289](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212291642345.png)

此外，注意这里自动绑定的时候，Car toyota的名字不是随便取的，因为Car类的Bean对象有两个toyota和havel，那么这个地方就会绑定toyota对象。—— 也就是用变量的名称去对应Bean对象的名称。

此外，如果容器中没有找到Car和Office，就会放入空值。

----

用代码来写的话，一般用构造方法，不用set方法（set方法一般用于解决循环依赖，ABC，循坏依赖的时候Spring会报错，配合@Lazy延迟加载来解决）

![image-20221229165016396](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212291650480.png)

![image-20221229164803257](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212291648335.png)

循环依赖的问题：其实我们应该避免出现循环依赖。

----

生命周期：

- 容器级生命周期接口

![image-20221229165331197](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212291653309.png)

- Bean级生命周期接口

![image-20221229165337023](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212291653069.png)

- 一个Bean对象在容器中实例化的过程是：

![](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212291658701.png)