set  output-directory=D:\b2c\b2c-cloud-test-parent-foundmental\b2c-cloud-test-annotation-processor\target
set  source-directory=D:\b2c\b2c-cloud-test-parent-foundmental\b2c-cloud-test-annotation-processor\src\main\java
set  java8_home=D:\java\64\jdk1.8.0_131
if exist %output-directory% (echo "directory already exists") else (md %output-directory%\classes\com\csair\b2c\cloud\test\annotation\processor\annotation)
%java8_home%\bin\javac -version
rem 先编译注解
%java8_home%\bin\javac -classpath %classpath% -d %output-directory%\classes %source-directory%\com\csair\b2c\cloud\test\annotation\processor\annotation\*
rem 再编译service
%java8_home%\bin\javac -classpath %java8_home%/lib/tools.jar;%java8_home%/jre/lib/rt.jar;%output-directory%\classes -d %output-directory%\classes %source-directory%\com\csair\b2c\cloud\test\annotation\processor\service\*
rem 再编译注解处理器
%java8_home%\bin\javac -classpath %java8_home%/lib/tools.jar;%java8_home%/jre/lib/rt.jar;%output-directory%\classes -d %output-directory%\classes %source-directory%\com\csair\b2c\cloud\test\annotation\processor\processor\*