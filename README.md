#hello

This is `blade` framework of an initial project, running is very simple, experience the charm of it!

### Run

```sh
git clone https://github.com/blade-samples/hello.git
```

Import Project to your IDE. Run `com.example.hello.Application` main method.

### Console

```bash
[hello] 2016-09-02 11:12:49,439 INFO  [main] com.blade.route.Routers | Add Route: GET	/
[hello] 2016-09-02 11:12:49,440 INFO  [main] com.blade.route.Routers | Add Route: GET	/users
[hello] 2016-09-02 11:12:49,476 INFO  [main] com.blade.route.Routers | Add Interceptor: BEFORE	/.*
[hello] 2016-09-02 11:12:49,499 INFO  [main] org.eclipse.jetty.util.log | Logging initialized @222ms
[hello] 2016-09-02 11:12:49,570 INFO  [main] org.eclipse.jetty.server.Server | jetty-9.2.12.v20150709
[hello] 2016-09-02 11:12:49,623 INFO  [main] com.blade.web.DispatcherServlet | jdk.version = 1.8.0_101
[hello] 2016-09-02 11:12:49,623 INFO  [main] com.blade.web.DispatcherServlet | user.dir = D:\projects\hello
[hello] 2016-09-02 11:12:49,623 INFO  [main] com.blade.web.DispatcherServlet | java.io.tmpdir = C:\Users\ADMINI~1\AppData\Local\Temp\
[hello] 2016-09-02 11:12:49,623 INFO  [main] com.blade.web.DispatcherServlet | user.timezone = GMT+08:00
[hello] 2016-09-02 11:12:49,623 INFO  [main] com.blade.web.DispatcherServlet | file.encoding = UTF-8
[hello] 2016-09-02 11:12:49,625 INFO  [main] com.blade.web.DispatcherServlet | blade.webroot = D:\projects\hello
[hello] 2016-09-02 11:12:49,630 DEBUG [main] com.blade.ioc.IocApplication | Add Resource: /assets
[hello] 2016-09-02 11:12:49,630 DEBUG [main] com.blade.ioc.IocApplication | Add Resource: /public
[hello] 2016-09-02 11:12:49,630 DEBUG [main] com.blade.ioc.IocApplication | Add Resource: /static
[hello] 2016-09-02 11:12:49,630 INFO  [main] com.blade.ioc.IocApplication | Add Object: []
[hello] 2016-09-02 11:12:49,630 INFO  [main] com.blade.web.DispatcherServlet | blade.isDev = true
[hello] 2016-09-02 11:12:49,634 INFO  [main] com.blade.BladeBanner | 	 __, _,   _, __, __,
[hello] 2016-09-02 11:12:49,634 INFO  [main] com.blade.BladeBanner | 	 |_) |   /_\ | \ |_
[hello] 2016-09-02 11:12:49,634 INFO  [main] com.blade.BladeBanner | 	 |_) | , | | |_/ |
[hello] 2016-09-02 11:12:49,634 INFO  [main] com.blade.BladeBanner | 	 ~   ~~~ ~ ~ ~   ~~~
[hello] 2016-09-02 11:12:49,634 INFO  [main] com.blade.BladeBanner | 	 :: Blade :: (v1.6.6-beta)

[hello] 2016-09-02 11:12:49,634 INFO  [main] com.blade.web.DispatcherServlet | Blade initialize successfully, Time elapsed: 11 ms.
[hello] 2016-09-02 11:12:49,634 INFO  [main] org.eclipse.jetty.server.handler.ContextHandler | Started o.e.j.s.ServletContextHandler@2d6e8792{/,file:/D:/projects/hello/,AVAILABLE}
[hello] 2016-09-02 11:12:49,711 INFO  [main] org.eclipse.jetty.server.ServerConnector | Started ServerConnector@73f792cf{HTTP/1.1}{0.0.0.0:9000}
[hello] 2016-09-02 11:12:49,712 INFO  [main] org.eclipse.jetty.server.Server | Started @443ms
[hello] 2016-09-02 11:12:49,712 INFO  [main] com.blade.embedd.EmbedJettyServer | Blade Server Listen on 0.0.0.0:9000
```

### Web

**Access the URL:**

- http://127.0.0.1:9000/
- http://127.0.0.1:9001/users
