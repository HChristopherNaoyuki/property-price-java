# Property Price Calculator

## Table of Contents

* [Introduction](#introduction)
* [Features](#features)
* [Getting Started](#getting‑started)
  * [Prerequisites](#prerequisites)
  * [Installation](#installation)
* [Usage](#usage)
* [Project Structure](#project‑structure)
* [DISCLAIMER](#disclaimer)

## Introduction

A Java console application that calculates and displays the average property price per province. It collects prices for different property types (Flat, Townhouse, House) across multiple provinces and prints the average price for each.

The application is written in Allman style, with logic encapsulated in the `Solution` package and the `Solution` main class.

## Features

* Prompts user input for property prices (Flats, Townhouses, Houses) across predefined provinces.
* Validates input to ensure it's a non‑negative number and handles invalid entries gracefully.
* Calculates the average property price per province and presents a formatted result.

## Getting Started

### Prerequisites

* Java Development Kit (JDK) version 8 or higher.
* A Java-compatible IDE (such as IntelliJ IDEA, Eclipse) or command-line tools.

### Installation

1. **Clone the repository**:

   ```sh
   git clone https://github.com/HChristopherNaoyuki/property-price-java.git
   ```

2. **Navigate into the project directory**:

   ```sh
   cd property-price-java
   ```

3. **Compile the code**:

   ```sh
   javac -d bin src/Solution/Solution.java
   ```

4. **Run the application**:

   ```sh
   java -cp bin Solution.Solution
   ```

## Usage

When you run the program, it will prompt:

```
Enter property prices for Gauteng (Flat, Townhouse, House):
Flat: R [input price]
Townhouse: R [input price]
House: R [input price]

... (repeats for other provinces)
```

After entering valid prices for all provinces and types, it prints:

```
Total average property price for Gauteng: R xxx.xx  
Total average property price for Natal: R xxx.xx  
Total average property price for Cape: R xxx.xx
```

If invalid input is detected (e.g., non-numeric or negative), the program will prompt again until a valid value is entered.

## Project Structure

Here’s a sample layout—please adjust based on your actual project organization:

```
property-price-java/
├── src/
│   └── Solution/
│       └── Solution.java   # Contains the main application logic
├── README.md               # (You are editing this file now)
└── bin/                    # (Optional) output folder for compiled classes
```

## DISCLAIMER

UNDER NO CIRCUMSTANCES SHOULD IMAGES OR EMOJIS BE INCLUDED DIRECTLY 
IN THE README FILE. ALL VISUAL MEDIA, INCLUDING SCREENSHOTS AND IMAGES 
OF THE APPLICATION, MUST BE STORED IN A DEDICATED FOLDER WITHIN THE 
PROJECT DIRECTORY. THIS FOLDER SHOULD BE CLEARLY STRUCTURED AND NAMED 
ACCORDINGLY TO INDICATE THAT IT CONTAINS ALL VISUAL CONTENT RELATED TO 
THE APPLICATION (FOR EXAMPLE, A FOLDER NAMED IMAGES, SCREENSHOTS, OR MEDIA).

I AM NOT LIABLE OR RESPONSIBLE FOR ANY MALFUNCTIONS, DEFECTS, OR ISSUES 
THAT MAY OCCUR AS A RESULT OF COPYING, MODIFYING, OR USING THIS SOFTWARE. 
IF YOU ENCOUNTER ANY PROBLEMS OR ERRORS, PLEASE DO NOT ATTEMPT TO FIX THEM 
SILENTLY OR OUTSIDE THE PROJECT. INSTEAD, KINDLY SUBMIT A PULL REQUEST 
OR OPEN AN ISSUE ON THE CORRESPONDING GITHUB REPOSITORY, SO THAT IT CAN 
BE ADDRESSED APPROPRIATELY BY THE MAINTAINERS OR CONTRIBUTORS.

---
