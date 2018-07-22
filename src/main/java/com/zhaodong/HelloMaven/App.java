package com.zhaodong.HelloMaven;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Hello world!
 *  java -cp ./HelloMaven-0.0.1-SNAPSHOT.jar com.zhaodong.HelloMaven.App
 *  java -cp .:./HelloMaven-0.0.1-SNAPSHOT.jar com.zhaodong.HelloMaven.App
 *  java -jar HelloMaven-0.0.1-SNAPSHOT.jar 
 *   -cp 和 -classpath 一样，是指定类运行所依赖其他类的路径，通常是类库，jar包之类，
 *   需要全路径到jar包，window上分号“;” 分隔，linux上是分号“:”分隔。不支持通配符，
 *   需要列出所有jar包，用一点“.”代表当前路径。
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Log log = LogFactory.getLog(App.class);
        //log.info( "Hello World!" );
    	Greeting.print("Maveneee");
    }
    
    int sum(int ...ns)
    {
    	int x = 0;
    	for(int n : ns)
    	{
    		x += n;
    	}
    	return x;
    }
}