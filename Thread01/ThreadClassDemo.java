package Thread01;
//文件名 : ThreadClassDemo.java
//继承其他两个文件 DisplayMessage.java和GuessANumber.java
public class ThreadClassDemo {

public static void main(String [] args) {
   Runnable hello = new DisplayMessage("Hello");
   Thread thread1 = new Thread(hello);
   thread1.setDaemon(true);
   thread1.setName("hello");
   System.out.println("Starting hello thread...");
   thread1.start();
   
   Runnable bye = new DisplayMessage("Goodbye");
   Thread thread2 = new Thread(bye);
   thread2.setPriority(Thread.MIN_PRIORITY);
   thread2.setDaemon(true);
   System.out.println("Starting goodbye thread...");
   thread2.start();

   System.out.println("Starting thread3...");
   Thread thread3 = new GuessANumber(27);
   thread3.start();
   try {
      thread3.join();
   }catch(InterruptedException e) {
      System.out.println("Thread interrupted.");
   }
   System.out.println("Starting thread4...");
   Thread thread4 = new GuessANumber(75);
   
   thread4.start();
   System.out.println("main() is ending...");
}
}

/*
创建线程的三种方式的对比
1. 采用实现 Runnable、Callable 接口的方式创建多线程时，线程类只是实现了 Runnable 接口或 Callable 接口，还可以继承其他类。

2. 使用继承 Thread 类的方式创建多线程时，编写简单，如果需要访问当前线程，则无需使用 Thread.currentThread() 方法，直接使用 this 即可获得当前线程。

线程的几个主要概念
在多线程编程时，你需要了解以下几个概念：

线程同步
线程间通信
线程死锁
线程控制：挂起、停止和恢复
*/