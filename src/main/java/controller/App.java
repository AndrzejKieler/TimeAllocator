package controller;


import domain.notes.noteEnums.Label;
import org.eclipse.jetty.annotations.AnnotationConfiguration;
import org.eclipse.jetty.plus.webapp.EnvConfiguration;
import org.eclipse.jetty.plus.webapp.PlusConfiguration;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.component.AbstractLifeCycle;
import org.eclipse.jetty.util.component.LifeCycle;
import org.eclipse.jetty.webapp.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;


public class App {
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        Logger logger = LoggerFactory.getLogger(App.class);

        var webapp = new WebAppContext();
        webapp.setResourceBase("src/main/webapp");
        webapp.setContextPath("/"); //aby wszystkie requesty zaczynały się od slasha
        webapp.setConfigurations(new Configuration[]
                {
                        new AnnotationConfiguration(),
                        new WebInfConfiguration(),
                        new WebXmlConfiguration(),
                        new MetaInfConfiguration(),
                        new FragmentConfiguration(),
                        new EnvConfiguration(),
                        new PlusConfiguration(),
                        new JettyWebXmlConfiguration()
                });
        webapp.setAttribute("org.eclipse.jetty.server.webapp.ContainerIncludeJarPattern", ".*/classes/.*");

        //webapp.addServlet(TimeAllocatorServlet.class, "/api/*")
        var server = new Server(8080);
        server.setHandler(webapp);
        server.addLifeCycleListener(new AbstractLifeCycle.AbstractLifeCycleListener() {
            @Override
            public void lifeCycleStopped(LifeCycle event) {
                HibernateUtil.close();
            }
        });
        server.start();
        server.join();

    }
}
