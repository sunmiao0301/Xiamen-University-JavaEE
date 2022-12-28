Lecture2.5-Docker

虚拟机虚的是物理资源

Docker虚的是操作系统

![image-20221228182347037](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212281823090.png)

Docker镜像：应用环境的只读模板

Docker容器：运行和隔离应用的沙箱

![image-20221228182832498](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212281828576.png)

其实可以理解为镜像是模板，容器就是通过模板生产的沙箱a，沙箱b，沙箱c，都是从模板镜像生出来的。

![image-20221228182958298](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212281829386.png)

---

镜像的产生：

- Dockerfile

![image-20221228183104993](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212281831091.png)

一个Dockerfile例子

![image-20221228183246953](https://raw.githubusercontent.com/sunmiao0301/Public-Pic-Bed/main/imgfromPicGO/202212281832051.png)

----

Docker容器之间如何通讯？—— Swarm集群

