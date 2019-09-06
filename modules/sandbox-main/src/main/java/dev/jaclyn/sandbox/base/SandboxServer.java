package dev.jaclyn.sandbox.base;

import org.jooby.Jooby;

public class SandboxServer extends Jooby {

    {
        get("/", ctx -> "Welcome to Jooby!");
    }

    public static void main(String[] args) {
        Jooby.run(SandboxServer::new, args);
    }
}
