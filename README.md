# java-sandbox
A place for me to play around with [Java](https://www.oracle.com/java/), [Bazel](https://bazel.build/), and [GraphQL](https://graphql.org). It's not much yet...

## Working Versions
This is being developed in and known to work with the following versions:
- Java 8
- Bazel 0.29.0
- Intellij 2019.2
- [Intelij Bazel plugin](https://ij.bazel.build/docs/bazel-plugin.html) 2019.08.19.0.5

## Setting up

You will need to have Bazel version higher than 0.23.0 

Set `BAZEL_TARGET_PATH` to your Bazel install path for your bazel (or bazel-real) file in order to to build and run locally.

If you have an older version of Bazel installed that you want to keep, install the newer version in a different directory and set the `BAZEL_TARGET_PATH` to that path. 

## Getting Started
From each module directory you can run `make help` in your terminal to see what you can do.