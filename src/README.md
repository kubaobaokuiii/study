Shell编程调研
一、初识Shell编程
Shell是linux的命令解释器，解释用户对操作系统的操作

二、Linux的启动过程
  BIOS：基本引导，在主板上
  
  MBR:到硬盘，看主记录部分，看是否可引导
  
  BootLoader(grup):启动和引导内核，确定内核版本
  
  kernel：进入内核
  
  Systemd

  系统初始化

  Shell

三、Shell脚本格式
一条命令只做一件事
为了组合命令和多次执行，使用脚本文件来保存需要执行的命令
赋予该文件执行权限

cd  /var/ ; ls；pwd 进入var目录，并查看目录信息，及查看其路径

建立.sh文件

chmod u+x .sh  赋予权限

bash  xx.sh  或者 ./xx.sh 执行

.sh脚本需要声明：#！/bin/bash

# demo 注释

四、脚本不同执行方式的影响
1.bash ./filename.sh

2../filename.sh

3.source ./filename.sh

4..filename.sh
第三与第四种是在当前脚本运行

第一与第二种的区别是bash的声明，bash是不需要赋权限,./的方式必须有执行的权限
五、管道
是进程通讯的工具

1.管道与管道符
管道和信号一样，通信的方式之一

匿名管道是shell编程经常用到的通信工具

管道符”|”,将前一个命令执行结果传递给后面的命令

ps | cat 

echo123 | ps 
2.子进程与子shell
3.重定向符号
六、重定向
让程序输出到文件，代替键盘输入
七、变量赋值
八、变量引用及作用范围
九、环境变量、预定义、变量与位置变量
十、环境变量配置文件