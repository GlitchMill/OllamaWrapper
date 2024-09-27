# AskMe

This is a simple Java-based wrapper for the Ollama API with a web interface. It allows users to input prompts and receive responses through a web UI. The application is built using Spring Boot for the backend and Thymeleaf for the frontend.

## Features

- **Web UI**: Simple interface for sending prompts and viewing responses from the Ollama service.
- **Ollama API Integration**: Interacts with Ollama's API to generate responses based on user input.
- **Spring Boot**: Easy to run and manage as a standalone application.
- **Thymeleaf**: For rendering the HTML view dynamically based on the prompt input and responses.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Configuration](#configuration)
- [Running the Application](#running-the-application)
- [Contributing](#contributing)
- [License](#license)

## Installation

### Prerequisites

- **Java Development Kit (JDK)**: You will need JDK 11 or higher. Install it from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) if you don’t have it already.
- **Apache Maven**: You will need Maven to build the project. Install it from [here](https://maven.apache.org/download.cgi) if necessary.
- **Ollama API**: Make sure you have the Ollama API server running on your machine or accessible over a network.

### Clone the Repository

To get started, clone the repository to your local machine:

```bash
git clone https://github.com/yourusername/ollama-wrapper.git
cd ollama-wrapper
```

### Install Dependencies

Use Maven to install all necessary dependencies:

```bash
mvn clean install
```

## Usage

### Configuration

Before running the application, ensure that the Ollama API is running and accessible at the URL specified in the `OllamaService.java` file. You can adjust this if necessary:

```java
private final String baseUrl = "http://localhost:11434"; // Adjust the Ollama API server URL if needed
```

### Running the Application

To run the application, use the Maven command:

```bash
mvn spring-boot:run
```

Alternatively, you can build a jar file and run it directly:

```bash
mvn package
java -jar target/ollama-wrapper-1.0-SNAPSHOT.jar
```

### Accessing the Web UI

Once the application is running, open a browser and go to:

```
http://localhost:8080
```

You will see a simple input form where you can enter prompts. After submitting, the response from the Ollama API will be displayed on the same page.

## Project Structure

```
ollama-wrapper/
│
├── src/
│   ├── main/
│   │   ├── java/com/example/ollamawrapper/
│   │   │   ├── OllamaService.java     # Service class for handling API calls to Ollama
│   │   │   ├── OllamaController.java  # Controller for handling web requests
│   │   │   └── OllamaWrapperApplication.java  # Main Spring Boot application
│   │   └── resources/
│   │       └── templates/
│   │           └── index.html         # Thymeleaf template for the web UI
│   └── test/                          # Unit tests (if needed)
│
├── pom.xml                            # Maven dependencies and build configuration
└── README.md                          # Project documentation
```

## Configuration

### Ollama API

The application is set to interact with an Ollama API server running at `http://localhost:11434`. If your Ollama API is running on a different URL or port, update the `baseUrl` in `OllamaService.java`.

```java
private final String baseUrl = "http://localhost:11434"; // Adjust here
```

### Application Properties

You can also modify `application.properties` in `src/main/resources` to customize server settings, such as changing the port of the Spring Boot application.

```properties
server.port=8080
```

## Contributing

Contributions are welcome! If you have any suggestions, improvements, or bug fixes, feel free to submit a pull request. 

### Steps to Contribute

1. Fork the repository.
2. Create a feature branch: `git checkout -b my-feature`
3. Commit your changes: `git commit -m 'Add some feature'`
4. Push to the branch: `git push origin my-feature`
5. Open a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

