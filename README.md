# Design-a-2-bit-ALU-with-a-Status-Register-
## 2-Bit ALU with Status Register

This repository contains the design and implementation of a 2-bit Arithmetic Logic Unit (ALU) with a Status Register. The ALU performs four different operations: A * B, 2A + B, !(A & B), and A | B. The Status Register includes four flags to indicate the status of each ALU operation: Carry Flag, Negative Flag, Parity Flag, and Zero Flag.

### ALU Overview

The ALU is a combinational logic digital function that performs arithmetic and logical operations on 2-bit binary numbers. It consists of four subsystems, each responsible for a specific operation. The operation to be performed is determined by a set of switches. Only one operation can be performed at a time, resulting in a single output.

### Flags Description

The Status Register includes four flags to provide additional information about the result of the last ALU operation:

1. Carry Flag: This flag indicates whether an arithmetic carry or borrow has been generated from the most significant bit position of the ALU. It is set when a carry or borrow occurs and can be used for subsequent operations that require it.

2. Negative Flag: The Negative Flag is a single bit in the status register that indicates whether the result of the last mathematical operation produced a value with the most significant bit set. If the leftmost bit is set, the Negative Flag is also set.

3. Parity Flag: This flag indicates the parity of the result of the last operation. If the number of set bits in the binary representation of the result is odd, the Parity Flag is set; otherwise, it is cleared.

4. Zero Flag: The Zero Flag is set when an operand is subtracted from another operand of equal value, resulting in a zero value. It provides information about equality between operands.

### Implementation

The ALU and the Status Register are implemented using digital logic circuits and connected as per the design specifications. The input to the ALU is provided using DIP switches, and the output is displayed on a common anode display, where all the anode connections of the LED segments are joined together to logic "1".

### Repository Contents

1. `README.md`: This readme file providing an overview of the repository.
2. `DC_course_project.pptx`: This is documentation which includes basics, circuits, and results of the project.
3. `DC_project.pdsprj.zip`: This is simulation file of 2-Bit ALU.

### List of components
| Component | Notation | Quantity | 
|---|---|---|
| AND gate | 7408 | 6 | 
| OR gate | 7432 | 2 | 
| NAND gate | 7400 | 2 | 
| XOR gate | 7447 | 2 | 
| 7 segment display | Disp | 4 |
| 4 way DIP switch | SW1 | 5 | 
| Common anode | CA | 4 | 
| Wires | W | N/A | N/A |
| Breadboard | BB | 2 or 3 |
| LEDs | LED | 16 |


### Usage

To use the ALU design and test its functionality, follow these steps:

1. Set the desired input values using the DIP switches.
2. Configure the operation to be performed by setting the corresponding switches.
3. Observe the output displayed on the common anode display.
4. Check the flags in the Status Register to determine the status of the ALU operation.

### License
This project is licensed under the MIT License.

### Acknowledgments

The design and implementation of the 2-bit ALU with Status Register in this repository were created as an educational exercise. The simulation and accompanying files were developed by Fardin khan and team, can be used for learning and reference purposes.

Please note that this implementation may not be optimized for production use, and additional considerations may be required for specific hardware platforms or requirements.

For more information on the design, implementation, and usage of the ALU, please refer to the files.

If you have any questions or suggestions, feel free to contact [fardinkhanz2410@gmail.com].

Thank you for your interest in the 2-bit ALU with Status Register!
