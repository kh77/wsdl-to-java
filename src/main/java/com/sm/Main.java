package com.sm;

import java.net.URI;
import java.net.URL;

public class Main {

    public static void main(final String[] args) throws Exception {


        final String endpoint = "http://example.org/math";
        final URL url = URI.create(endpoint).toURL();

        final MathService service = new MathService(url);
        Add add = new Add();
        add.setX(1);
        add.setY(2);

        final WsMath soap = service.getMathEndpoint();
        final Answer answer = soap.sum(add);
        System.out.println("Answer :" + answer.getResult());
    }
}
