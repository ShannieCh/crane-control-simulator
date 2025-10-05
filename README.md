````markdown
[![MIT License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

# Crane Control Simulator

A Spring Boot REST API simulating crane operations: move, pickup, drop, and status.

## Features

- Move crane to X/Y coordinates
- Pickup and drop containers
- Get current status

## Technologies

- Java
- Spring Boot
- Lombok

## Running

1. Clone the repo:
```bash
git clone https://github.com/yourusername/crane-control-simulator.git
cd CraneControlSim
````

2. Build and run:

```bash
mvn clean install
mvn spring-boot:run
```

3. Access at `http://localhost:8080`

## API Endpoints

* POST `/crane/move`
  JSON body: `{ "newX": 10, "newY": 5 }`

* POST `/crane/pickup`

* POST `/crane/drop`

* GET `/crane/status`

## License

MIT

