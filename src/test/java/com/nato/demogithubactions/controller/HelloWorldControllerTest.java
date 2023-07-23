package com.nato.demogithubactions.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloWorldControllerTest {

    private final HelloWorldController controller = new HelloWorldController();

    @Test
    void testHelloWorld() {
        String helloWorld = controller.sayHello();

        Assertions.assertThat(helloWorld).isEqualTo("Hello World!");
    }

}