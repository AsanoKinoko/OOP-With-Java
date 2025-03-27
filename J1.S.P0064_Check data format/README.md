# J1.S.P0064 - Check data format

This program allows users to input and validate phone numbers, email addresses, and dates.

## Requirements

- JDK 8 or higher

## Project Structure

```
J1.S.P0064/
├── src/
│   ├── utils/
│   │   └── StringUtils.java
│   ├── BO/
│   │   └── Validator.java
│   └──ui 
|      └──J1SP0064.java
```

## Validation Rules

- **Phone Number**: Must be exactly 10 digits and contain only numbers.
- **Email**: Must follow standard email format (user@domain.com).
- **Date**: Must follow the dd/MM/yyyy format.

## Implementation Details

The program follows proper OOP principles:
- **View**: Console-based user interface
- **Validator**: Contains validation logic
- **StringUtils**: Handles user input 