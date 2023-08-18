# Hero Squad

Java implementation of the Hero Squad Additions.

## Features


## Getting Started

### Prerequisites

- Maven version [3.9.4]("https://maven.apache.org/download.cgi"): 

### Usage

1. Clone this repository to your local machine:
    ```sh
      git clone https://github.com/cosmasnyairo/herosquad.git
    ```
2. Update the yml files holding squad and hero details:
    ```yaml
    # Heroes
    - name: Luffy
      age: 20
      specialpower: Imagination
      weakness: water
      powerLevel: 90
    - name: Koby
      age: 21
      specialpower: Honesty
      weakness: fire
      powerLevel: 70
    ```

    ```yaml
    # Squads
    - name: Straw Hats
      maxsize: 10
      cause: Freedom
    - name: Marines
      maxsize: 20
      cause: Justice

    ```
3. Build the package 
    ```sh
      mvn clean package
    ```
4. Run the jar file
    ```sh
      java -jar target/HeroSqaud-1.0-shaded.jar
    ```