#dubbo使用总结
记录dubbo使用过程中遇到的一些问题

##端口被占用
1. 20880类似的端口被占用，只需要改变端口就行了。
2. [DUBBO] qos-server can not bind localhost:22222。如果出现这种错误，
需要在配置中
```
<dubbo:application name="demo-provider" >
		<dubbo:parameter key="qos.enable" value="true" />
		<dubbo:parameter key="qos.accept.foreign.ip" value="false" />
		<dubbo:parameter key="qos.port" value="33325" />
	</dubbo:application>
```
参考链接https://blog.csdn.net/u012988901/article/details/84503672


