# Miner Eats

A simple console-based ordering system for a fictional dining establishment called "Miner Eats". Customers can view the menu, add food items to their cart, modify their order, and checkout. This lab was suppose to read from the text file to populate the menu.

## Highlights
* Text-based menu navigation. 
* Ability to add multiple quantities of various food items (e.g., Burger, Fries, etc.) to the cart.
* View and clear the shopping cart.
* Choose between pickup or delivery options (includes a delivery fee).
* Optional tip addition with percentage calculation.

## Overview

Miner Eats simulates a basic ordering experience. It presents users with a menu of food items, allowing them to add quantities of different foods to their cart. Users can view the current contents of their cart and clear it if needed. At checkout, customers can choose between pickup or delivery options (with an added delivery fee). They also have the option to add a tip percentage to their total order. 

Currently, the system does not store orders or interact with external files for realistic persistence. Its primary focus is on demonstrating the core functionality of a simple ordering process using console input and output.

## Why This Project
This project provides a simplified introduction to basic programming concepts like menu selection, user input handling, looping, conditional statements (switches), and calculations. It demonstrates how these elements interact to create a functional application. 

Although simplistic, it can serve as a starting point for learning about larger-scale ordering systems or building upon it to incorporate features such as persistent storage, database interaction, and graphical user interfaces.

## Usage
1. **Compile:** Save the code as `CL1.java` and compile using a Java compiler (e.g., `javac CL1.java`). 
2. **Run:** Execute the compiled code (`java CL1`).

The program will present you with the Miner Eats menu via the console, where you can interact with options to add items, view your cart, manage your order, and checkout.

## Installation
* Ensure you have Java Development Kit (JDK) installed on your system.

## Architecture
*  **File Structure:**  The project consists of a single `.java` file (`CL1.java`). 

* **Components:** The program uses classes to manage user input (Scanner), basic calculations, and the menu options presented to the user. It relies primarily on loops (while loop) and switch statements for navigating through different actions. There is no explicit database or persistent storage within the code.  

## Future Improvements
* Implement  persistent storage for orders
* Create a more interactive graphical user interface (GUI)
