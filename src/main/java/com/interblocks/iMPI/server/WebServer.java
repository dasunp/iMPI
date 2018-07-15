package com.interblocks.iMPI.server;

import java.io.IOException;
import java.net.URISyntaxException;
import javax.servlet.ServletException;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class WebServer
{
    public static void main(final String[] args) throws ServletException, LifecycleException, URISyntaxException, IOException {
        final Tomcat tomcat = new Tomcat();
        tomcat.setPort(8089);
        tomcat.getService().setContainer(tomcat.getEngine());
        tomcat.addWebapp("/app", "/Users/dasunperera/Documents/Code/svn/TestabilityPOC/target/TestabilityPOC-1.0.war");
        tomcat.start();
        tomcat.getServer().await();
    }
}