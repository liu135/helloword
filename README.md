#hello

This is `blade` framework of an initial project, running is very simple, experience the charm of it!

### Run

```sh
git clone https://github.com/bladejava/hello.git
```

Import Project to your IDE. Run `main` method.

### Console

```bash
[main] INFO com.blade.route.Routers - Add Route: GET	/
[main] INFO com.blade.route.Routers - Add Route: GET	/hello
[main] INFO com.blade.route.Routers - Add Route: GET	/show
[main] INFO com.blade.route.Routers - Add Interceptor: BEFORE	/.*
[main] INFO org.eclipse.jetty.util.log - Logging initialized @393ms
[main] INFO org.eclipse.jetty.server.Server - jetty-9.2.12.v20150709
[main] INFO com.blade.web.DispatcherServlet - DispatcherServlet start ...
[main] INFO com.blade.web.DispatcherServlet - jdk.version = 1.8.0_60
[main] INFO com.blade.web.DispatcherServlet - user.dir = E:\github\hello
[main] INFO com.blade.web.DispatcherServlet - java.io.tmpdir = C:\Users\renqi\AppData\Local\Temp\
[main] INFO com.blade.web.DispatcherServlet - user.timezone = 
[main] INFO com.blade.web.DispatcherServlet - file.encoding = utf-8
[main] INFO com.blade.web.DispatcherServlet - blade.webroot = E:\github\hello\target\classes
[main] INFO com.blade.web.DispatcherServlet - blade.isDev = false
[main] INFO blade.kit.config.adapter.PropConfigAdapter - Loading config file [classpath:/default.properties]
[main] INFO com.blade.ioc.IocApplication - Add Object: [com.blade.web.DispatcherServlet$1@3b6eb2ec]
[main] INFO com.blade.web.DispatcherServlet - DispatcherServlet initialize successfully, Time elapsed: 20 ms.
	 __, _,   _, __, __,
	 |_) |   /_\ | \ |_
	 |_) | , | | |_/ |
	 ~   ~~~ ~ ~ ~   ~~~
	 :: Blade :: (v1.6.0-alpha)

[main] INFO org.eclipse.jetty.server.handler.ContextHandler - Started o.e.j.s.ServletContextHandler@1e643faf{/,file:/E:/github/hello/target/classes/,AVAILABLE}
[main] INFO org.eclipse.jetty.server.ServerConnector - Started ServerConnector@7f690630{HTTP/1.1}{0.0.0.0:9001}
[main] INFO org.eclipse.jetty.server.Server - Started @704ms
[main] INFO com.blade.server.Server - Blade Server Listen on http://127.0.0.1:9001

```

### Web

**Access the URL:**

- http://127.0.0.1:9001/
- http://127.0.0.1:9001/hello
- http://127.0.0.1:9001/show

