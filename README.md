# Project 04: LinkedList-based Integer Sorter

## Description
This project is a command-line Java program that reads a list of integer numbers from user input, stores them in a `LinkedList`, sorts them in ascending order, and prints the sorted list.

It demonstrates the use of:
- Java Collections Framework (`LinkedList` and `Collections.sort()`)
- Standard input reading with `Scanner`

## Features
- Reads integers from standard input and stores them in a `LinkedList`.
- Sorts the list in ascending order using `Collections.sort()`.
- Prints the sorted list to the console.

## How to Run

### Step 1: Compilation
Use the following command to compile the program:
```sh
javac SortedLinkedList.java
```

### Step 2: Execution
Run the compiled program with:
```sh
java SortedLinkedList
```

### Step 3: Example Input and Output
**Input:**
```
Enter integers separated by spaces (press Enter to finish):
45 12 78 3 56 23
```

**Output:**
```
Sorted List:
3 12 23 45 56 78
```

### Step 4: Generating Javadoc
To generate the Javadoc documentation for the project, use the following command:
```sh
javadoc -d docs SortedLinkedList.java
```

This will create a `docs/` directory containing the generated HTML documentation. You can open `index.html` in a web browser to view the documentation.

## How to Access the Project
1. Clone the repository from GitHub:
    ```sh
    git clone https://github.com/bessepmack/SortedLinkedList.git
    ```
2. Navigate to the project directory:
    ```sh
    cd SortedLinkedList
    ```

## License
This project is licensed under the MIT License.

---