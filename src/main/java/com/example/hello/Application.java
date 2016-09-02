package com.example.hello;

import static com.blade.Blade.$;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.blade.embedd.EmbedJettyServer;
import com.blade.route.RouteHandler;
import com.blade.web.http.Request;
import com.blade.web.http.Response;

/**
 * Hello Blade!
 */
public class Application {

	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) throws Exception {

		// jdk6
		$().get("/", new RouteHandler() {
			public void handle(Request request, Response response) {
				response.html("<h1>Hello Blade！</h1>");
			}
		}).get("/users", new RouteHandler() {
			public void handle(Request request, Response response) {
				List<User> users = new ArrayList<User>(2);
				users.add(new User("jack", 22));
				users.add(new User("王爵nice", 24));
				response.json(users);
			}
		}).before("/.*", new RouteHandler() {
			public void handle(Request request, Response response) {
				LOGGER.info("before ...");
			}
		}).start(EmbedJettyServer.class);

	}

}