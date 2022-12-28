Lecture2.3-Tomcat并发原理

![image-20221228171735325](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212281717417.png)

分别解释一下：

max-thread=200，是线程池中最大的处于工作状态的线程数

accept-count=100，是排队队列的长度，是处于等待的请求数

所以最多可以处理300个请求，200个正在工作，100个等待，超过300之后的请求都将被拒绝

max-connections，默认值，基本上不会动

min-spare-threads，有时候请求不多的时候，如果你还是保持线程池中有200个（最大值）线程，就会造成内容浪费，所以会慢慢释放线程到最小值100，由此来节省内存。

---------------------

具体这几个参数选择多少，取决于你的应用是IO密集型的还是计算密集型的。

![image-20221228173148588](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212281731685.png)

---

- 阻塞式IO（BIO）- 在IO的过程中，线程也被占用了

![image-20221228172633624](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212281726855.png)

- 非阻塞式IO（NIO）- 在IO的过程中，线程不被占用 - Tomcat10中的默认模式。

![image-20221228172813879](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212281728157.png)

可以看到read和send对效率的影响已经被NIO模型给优化了，但是如果你的computer中间也存在IO，那么在servlet模型中就无法优化了，只能抛弃传统模型，选择函数式编程。