# Java Calculator Project

This is a simple calculator application built using Maven for Java project management.

## Project Structure

- A simple calculator application with basic arithmetic operations (add, subtract, multiply, divide)
- Maven-based Java project structure
- JUnit 5 tests for comprehensive test coverage
- Checkstyle for code quality verification
- JaCoCo for code coverage analysis (100% branch coverage required)

## Building and Running the Project

### Prerequisites

- Java JDK 17 or higher
- Maven 3.8 or higher
- Git

### Build Commands

1. Clone the repository:

   ```
   git clone <repository-url>
   cd calculator
   ```

2. Build the project:

   ```
   mvn clean install
   ```

3. Run tests:

   ```
   mvn test
   ```

4. Check code style:

   ```
   mvn checkstyle:check
   ```

5. Generate code coverage report:

   ```
   mvn jacoco:report
   ```

   The report will be available at `target/site/jacoco/index.html`

6. Verify 100% branch coverage:
   ```
   mvn jacoco:check
   ```

## Git Workflow

This project follows a structured Git workflow with branch protection rules:

- `main`: Production-ready code, protected from direct pushes
- All changes must be made through pull requests
- Pull requests must pass CI checks before merging
- 100% branch coverage is required

## Continuous Integration

The CI pipeline implemented with GitHub Actions ensures:

1. Building the project with Maven
2. Running JUnit tests
3. Validating code with Checkstyle
4. Verifying 100% branch coverage with JaCoCo
5. Automatic rejection of merges if quality checks fail

## License

MIT License
