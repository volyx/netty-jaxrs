package com.kpavlov.netty.jaxrs.jersey;

public class ServerRunner {

    public static void main(String... args) {
        JaxrsNettyServer server = new JaxrsNettyServer("localhost", 8080, new TestJerseyConfig());
        server.start();
    }
}
