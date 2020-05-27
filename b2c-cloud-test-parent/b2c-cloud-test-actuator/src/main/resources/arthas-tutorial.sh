#!/bin/bash
# arthas在线教程文档
https://alibaba.github.io/arthas/
https://arthas.gitee.io/

# 调用静态方法
ognl '@java.lang.System@out.println("hello world")'
ognl '@java.lang.Math@random()'
ognl "@java.lang.Thread@currentThread()"
ognl "@java.lang.Thread@currentThread().getContextClassLoader()"

# 获取类的静态字段
ognl '@java.lang.System@out'

#执行多行表达式，赋值给临时变量，返回一个List
ognl '#value1=@System@getProperty("java.home"), #value2=@System@getProperty("java.runtime.name"), {#value1, #value2}'

# 查看JVM已加载的类信息
sc org.javamaster.b2c.swagger2.service.impl*

# 打印类的详细信息
sc -d -f org.javamaster.b2c.swagger2.service.impl.LoginServiceImpl

# 查看已加载类的方法信息
sm org.javamaster.b2c.swagger2.service.impl.LoginServiceImpl

# 查看方法的详细信息
sm -d org.javamaster.b2c.swagger2.service.impl.LoginServiceImpl

# 反编译class文件
jad org.javamaster.b2c.swagger2.service.impl.LoginServiceImpl

# 查看类加载器
classloader -l
# 使用ClassLoader去加载类
classloader -c 439f5b3d --load /tmp/LoginServiceImpl.class

# 本地编译好改动的class文件,上传到服务器重新加载(局限:不允许新增加field/method)
# 和jad/watch/trace/monitor/tt等命令会冲突，执行完redefine之后，如果再执行前面
# 提到的命令，则会把redefine的字节码重置
redefine /tmp/LoginServiceImpl.class

# 方法执行监控
monitor -c 5 org.javamaster.b2c.swagger2.service.impl.LoginServiceImpl login

# 观察方法调用前入参
watch org.javamaster.b2c.swagger2.service.impl.LoginServiceImpl login {params} -x 2 -b
watch org.javamaster.b2c.swagger2.service.impl.LoginServiceImpl login {params[0].username} -x 2 -b
watch org.javamaster.b2c.swagger2.service.impl.LoginServiceImpl login "{params}" -x 2 -b
watch org.javamaster.b2c.swagger2.service.impl.LoginServiceImpl login "{params[0].username}" -x 2 -b
watch org.javamaster.b2c.swagger2.service.impl.LoginServiceImpl login "params" -x 2 -b
watch org.javamaster.b2c.swagger2.service.impl.LoginServiceImpl login "params[0].username" -x 2 -b
# 对于重载方法,指定过滤条件
watch org.javamaster.b2c.swagger2.service.impl.LoginServiceImpl login {params} "params.length==2" -x 2 -b
watch org.javamaster.b2c.swagger2.service.impl.LoginServiceImpl login {params} "params.length==2 && params[1] instanceof String" -x 2 -b
watch org.javamaster.b2c.swagger2.service.impl.LoginServiceImpl login {params} "params.length==2 && params[1] instanceof Integer" -x 2 -b
# 观察方法调用后入参
watch org.javamaster.b2c.swagger2.service.impl.LoginServiceImpl login {params} -x 2 -s

# 观察方法调用后返回值
watch org.javamaster.b2c.swagger2.service.impl.LoginServiceImpl login {returnObj} -x 2 -s

# 同时观察方法调用前后的入参和返回值
watch org.javamaster.b2c.swagger2.service.impl.LoginServiceImpl login {params,returnObj} -x 2 -b -s

# 观察方法调用前对象的属性值
watch org.javamaster.b2c.swagger2.controller.LoginController login {target} -x 3 -b
# 观察方法调用前对象的具体某个属性值
watch org.javamaster.b2c.swagger2.controller.LoginController login {target.loginService.enabled} -x 3 -b

# ognl方式:查看第一个参数
watch org.javamaster.b2c.swagger2.service.impl.LoginServiceImpl login "params[0]"
# ognl方式:按username方式投影
watch org.javamaster.b2c.swagger2.service.impl.LoginServiceImpl login "params[0].{#this.username}"
# ognl方式:按条件过滤
watch org.javamaster.b2c.swagger2.service.impl.LoginServiceImpl login "params[0].{? #this.username=='root' }" -x -2

# 输出当前方法被调用的调用路径
stack org.javamaster.b2c.swagger2.service.impl.LoginServiceImpl login
# 按条件过滤
stack org.javamaster.b2c.swagger2.service.impl.LoginServiceImpl login "params[0].username=='root'"

# 记录下指定方法每次调用的入参和返回信息
tt -t org.javamaster.b2c.swagger2.service.impl.LoginServiceImpl login
# 检索调用记录
tt -i 1000
# tt 命令由于保存了当时调用的所有现场信息，所以可重新触发方法调用
tt -i 1000 -p
