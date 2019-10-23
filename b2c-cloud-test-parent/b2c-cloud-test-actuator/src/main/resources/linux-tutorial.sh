# 查看当前在线用户
who
# 查看用户各类id信息
id
# 可以查得这个月份有登入主机者的身份
last
# 排序
sort
# 去重
uniq
# 查看网络状态
netstat -a
# 查看进程
ps aux
# 机器会在十分钟后关机！幵且会显示在目前登入者的屏幕前方
shutdown -h 10 'I will shutdown after 10 mins'
# 再过三十分钟系统会重新启劢，幵显示后面的讯息给所有在在线的使用者
shutdown -r +30 'The system will reboot'
# 仅发出警告信件的参数！系统幵丌会关机啦！
shutdown -k now 'This system will reboot'
# 关机
shutdown -h now
poweroff -f
init 0
# 重启
init 6
# 压缩
tar -czf -f filename.tar.gz
# 解压
tar -xzf -f filename.tar.gz
#　　1、*.tar 用 tar –xvf 解压
#　　2、*.gz 用 gzip -d或者gunzip 解压
#　　3、*.tar.gz和*.tgz 用 tar –xzf 解压
#　　4、*.bz2 用 bzip2 -d或者用bunzip2 解压
#　　5、*.tar.bz2用tar –xjf 解压
#　　6、*.Z 用 uncompress 解压
#　　7、*.tar.Z 用tar –xZf 解压
#　　8、*.rar 用 unrar e解压
#　　9、*.zip 用 unzip 解压

# 0 标准输入 < <<
# 1 标准输出 >(等价于1>) >>
# 2 标准错误输出 2> 2>>
ll 2>&1 info.log

# 1. 若 cmd1 执行完毕且正确执行($?=0)，则开始执行 cmd2。
# 2. 若 cmd1 执行完毕且为错诨 ($?≠0)，则 cmd2 丌执行。
cmd1 && cmd2

# 1. 若 cmd1 执行完毕且正确执行($?=0)，则 cmd2 丌执行。
# 2. 若 cmd1 执行完毕且为错诨 ($?≠0)，则开始执行 cmd2。
cmd1 || cmd2

# 找出syslog的pid
ps aux | grep 'syslog' | grep -v 'grep'| awk '{print $2}'
# 关掉syslog
ps -ef | grep 'syslog' | grep -v grep | awk '{print $2}'| xargs kill -9
# 重新启动syslog
kill -SIGHUP $(ps aux|grep 'syslog'|grep -v 'grep'|awk '{print $2}')
# 确认重新启动情况
tail -5 /var/log/messages
# 作为后台运行
nohup /usr/lib/jvm/java-7-oracle/bin/java -Xms512m -Xmx2048m -jar /spring-cloud/b2c-portal-2.2.3-SNAPSHOT.jar >/dev/null 2>&1 &
# 查看内存
free
#清空目录
#位于待清空的目录
rm -rf *
#使用绝对路径
rm -rf /home/appadm/logs/*