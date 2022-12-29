Lecture3.2-SpringBean对象定义

Spring中配置数据：

![image-20221229160359962](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212291607175.png)

---

具体的，配置Bean对象有三种方法：

- XML —— 不做介绍
- Java代码 —— 需要单独写一个类，然后在类的方法中创建Bean对象，Bean的名字是havel —— ![image-20221229160905392](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212291609440.png)
- 注解 —— 在类前面加@Component，Bean的名字是toyota —— ![image-20221229160815895](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212291608951.png)

什么时候用注解，什么时候用Java代码去创建Bean呢？

- 没什么花招，只要一个Bean对象，就用注解就行，很简单
- 如果需要写一些花里胡哨的Bean，就用Java代码去写。