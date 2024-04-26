# current-time

A Spring Boot MVC application that displays the current time. Completed as an assignment for
the [Devops with Docker](https://devopswithdocker.com/part-1/section-6#exercises-115-116)
course from the University of Helsinki's [Mooc.fi](https://www.mooc.fi/en/).

## Getting Started

This application has been containerized with Docker.

### Prerequisities

In order to run this container you'll need docker installed.

* [Windows](https://docs.docker.com/windows/started)
* [OS X](https://docs.docker.com/mac/started/)
* [Linux](https://docs.docker.com/linux/started/)

### Usage

```shell
docker pull jacquesnavarro/current-time
```

```shell
docker build -t current-time .
```

```shell
docker run -p <host port>:<container port> current-time
```

The application runs on port ```8080``` of the container.

```shell
docker run -p 8080:8080 current-time
```

The port on the host can be changed by another port if another application is already using port 8080 .

```shell
docker run -p <host port>:8080 current-time
```

The shell can be accessed with the ```-it``` flags and passing ```bash``` as an argument after the image name.

```shell
docker run -it -p 8080:8080 current-time bash
```

## Built With

* [maven:3.8.7-openjdk-18-slim](https://hub.docker.com/layers/library/maven/3.8.7-openjdk-18-slim/images/sha256-de5262140ec5c7ddb053f11ff5569184d8988947d771d3beca98c0400fbd3f19)
* [openjdk:17-ea-jdk-alpine3.14](https://hub.docker.com/layers/library/openjdk/17-ea-jdk-alpine3.14/images/sha256-a996cdcc040704ec6badaf5fecf1e144c096e00231a29188596c784bcf858d05)
* Spring Boot 3.2.2
* Eclipse-Temurin 17.0.8

## Author

https://github.com/jacques-navarro

## Find Me

![](Mastodon_logo.png) [@bunnythief@hachyderm.io](https://hachyderm.io/@bunnythief)

[passingarguments.dev](https://www.passingarguments.dev/)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.