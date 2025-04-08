# Number System Converter

This program converts numbers between different number systems (Binary, Decimal, and Hexadecimal).

## Project Structure

- `NumberConverter`: Main class for handling number system conversions
- `NumberConvertController`: Controller class managing the conversion operations
- `MenuUtils`: Utility class for menu handling
- `StringUtils`: Utility class for string input handling

## Technical Implementation Notes

### Use of StringBuilder in Number Conversion

The project uses StringBuilder for efficient string manipulation during number conversion. Here's why:

1. **Performance Benefits:**
   - String is immutable - each concatenation creates a new String object
   - StringBuilder is mutable - modifications happen in-place
   - More efficient in loops where multiple string modifications occur

2. **Easy Prepending:**
   - StringBuilder's `insert(0, char)` method efficiently adds characters at the start
   - Essential for number system conversion where digits are processed right-to-left

Example converting decimal 13 to binary:

```java
// Using StringBuilder (Efficient):
StringBuilder binary = new StringBuilder();
binary.insert(0, "1")  -> "1"      // One StringBuilder object
binary.insert(0, "0")  -> "01"     // Same StringBuilder object
binary.insert(0, "1")  -> "101"    // Same StringBuilder object
binary.insert(0, "1")  -> "1101"   // Same StringBuilder object

// Using String (Less Efficient):
String binary = "";
binary = "1"           -> "1"      // New String object
binary = "0" + binary  -> "01"     // New String object
binary = "1" + binary  -> "101"    // New String object
binary = "1" + binary  -> "1101"   // New String object
```

### When StringBuilder is Beneficial:
1. Variable number of string operations (depends on input number)
2. Frequent prepending operations
3. Performance critical scenarios with large numbers

### Alternative Approaches:
1. **Using Arrays:**
   - Pre-allocate fixed-size array
   - Store digits and reverse at end
   - Good performance but more complex code

2. **Using String:**
   - Simpler code but poor performance
   - Creates many temporary objects
   - Not recommended for large numbers

## Usage Example

```java
NumberConverter converter = new NumberConverter();

// Binary to Decimal
String binary = "1101";
int decimal = converter.convertBinaryToDec(binary);  // Result: 13

// Decimal to Hex
String hex = converter.convertDecToHex(decimal);     // Result: "D"
```