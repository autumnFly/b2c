jps 虚拟机进程状况工具
只输出LVMID，省略主类名称
jps -q
输出启动时传递给main方法的参数
jps -m
输出主类的全名，如果是jar包，输出jar包路径
jps -l
输出启动时JVM参数
jps -v

jstat 虚拟机统计信息监视工具
监视类加载、卸载、总空间及耗费的时间
jstat -class
监视堆状况，包括伊甸区、幸存区、老年代等容量，已用空间，GC时间等
jstat -gc

jinfo 实时查看和调整虚拟机各项参数
1.6以上可用java -XX:+PrintFlagsFinal查看所有参数

jmap Java内存映像工具，用于生成堆转储快照，一般称为dump文件
生成dump文件,live表示是否只dump出存活对象
jmap -dump：[live,]format=b,file=filename
显示F-Queue等待执行的finalize方法对象，只在linux环境有效
jmap -finalizeinfo
显示java堆详细信息，如使用哪种收集器，参数配置， 分代状况等，只在linux环境有效
jmap -heap
显示堆中对象统计信息，包括类、实例数量和合计容量
以ClassLoader为口径统计永久代内存状况，只在linux环境有效
jmap -permstat
-F 当使用-dump虚拟机没有响应时，强制生成dump快照，只在linux环境有效

jhat dump快照分析工具
分析jmap生成的dump文件，然后启动一个微型的http服务器，浏览器访问http://localhost:7000，分析内存泄露主要用到Heap Histogram
jhat heap.bin

jstack 堆栈跟踪工具，生成所有线程的堆栈快照，主要用于定位线程出现长时间停顿的原因，如死锁、死循环、请求外部资源导致的长
时间等待等。
当正常输出的请求不被响应时，强制输出线程堆栈
jstack -F
除了堆栈外，显示关于锁的附加信息
jstack -l
如果调用到本地方法，可以显示C/C++的堆栈
jstack -m