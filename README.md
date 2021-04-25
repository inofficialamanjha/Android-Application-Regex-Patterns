# Android-Application-Regex-Patterns
Android application to detect various standard codes &amp; Patterns using Regex standard library in Kotlin

# ABSTRACT

Regular expressions a fundamental part of almost every programming language. Regex is primarily used for faster string matching purposes. The Regex Library in Kotlin provides functions to compare strings in patterns, replace the found occurrences, and split text around matches.

Our Day to Day lives involve activities that require a wide variety of text processing tasks, more generally string processing. Typical applications include data validation, simple parsing, data scraping, and many other tasks.

Processing and validating these standard codes and expressions across the entire database could be a tedious task. Backend computation could significantly increase the operating time of various string/data/text validation processes such as Licence, Aadhar Number, CVV Number validation over large number of users considering vast database systems.

One of the Regex’s fundamental principles is to validate these strings and expressions faster ensuring faster processing of data while decreasing processing time and ensuring good user experience.

I intend to build a complete frontend based Android application on the latter principle. Complete with its own GUI, it can quickly detect Valid and In-Valid patterns amongst the 16 most commonly used day-to-day codes.

# INTRODUCTION

The Android application, with the help of standard Regex Library in Kotlin, can check the Validation of strings belonging to the following 16 Classes/Categories:

- Date: Date in the Format of DD-MM-YYYY
- HTML Tag: HTML tag, eg: <code/>
- URL: Https or htts encrypted URL, e.g. “https://www/geeksforgeeks.org”
- Aadhar Card Number: Indian Valid 12 digit Aadhar card number, e.g. “3675 9834 6012”
- Licence Card Number: Indian Licence Number, e.g. “HR06 19850034761”
- CVV Number: 3 or 4 digit CVV Number, e.g.: 4456
- Time: Time in 24 Hrs format
- Indian Mobile Number: Indian Mobile Number, e.g. 8595020188
- Indian Passport Number: Indian Passport Number, e.g.: J8369854
- Visa Card Number: Indian Visa Card Number, e.g. 4722 5400 7109 3191
- IP Address: IPv4 address, e.g.: 000.12.12.034
- MAC Address: MAC Address containing 12 Hexadecimal digits, e.g.: FF-FF-FF-FF-FF-FF
- Indian Pin Code: Pin Code of 6 digits, e.g. 132103
- IFSC Code: Indian IFSC Code, e.g.: SBIN0125620
- PAN Card Number: Indian Pan Card Number, e.g. BNZAA2318J
- YouTube Video Id: ID in the format of “ https://www.youtube.com/channel/UC{22 Alphanumeric characters} “

The Application entirely relies on Frontend and uses Gradle build automation tools for Software development. Other dependencies such as Nested Scroll View, Card-Based Layout, Vertical Linear Layout ,and Automatic slider, are also used to implement the GUI successfully.

# FRONTEND

**Gradle**

Gradle is a build automation tool for multi-language software development. It Controls the development process in the task of compilation and packaging for testing, deployment,and publishing.

Gradle builds on the concept of Apache Ant and Apache Maven and introduces a Groovy & Kotlin based domain-specific language contrasted with the XML-based project configuration. Uses a Directed acyclic graph to determine the order in which tasks can be run, through providing dependency Management.

**Nested Scroll View**

Supports activity as both a nested scrolling parent and child.

**Fragments**

Represents behavior or portion of User Interface. We combine multiple fragments in a single activity to build Multiple UI. Defined using an XML Layout file, it is a modular section of activity having its own life cycle.

**Card-Based Layout**

Container style display which holds each item’s information.

**Vertical linear Layout**

Used to provide Card view elements one by one in a vertical orientation.

-**IMPLEMENTATION DETAILS**_

![Implementation Detals](https://user-images.githubusercontent.com/75173703/115987045-096fc580-a5d1-11eb-82ef-fddfac2c2861.PNG)


# STANDARD REGEX LIBRARY IN KOTLIN

In Kotlin, the support for Regex is provided through Regex Class. An object of the Regex class represents a Regular expression, that can be used for string matching purposes.

Functions :
- .compile(“Regex”) : Converts a string into regex object
- Regex_object.matcher(string) : evaluates the string with the expression defined by the Regex_object

# REGEX ALGORITHMS

- Date : ^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((?:19|20)[0-9][0-9])$
- HTML Tag: <(\”[^\”]*\”|’[^’]*’|[^’\”>])*>
- URL : ((((https?|ftps?|gopher|telnet|nntp)://)|(mailto:|news:)) (%[0-9A-Fa- f] {2}|[-()_.!~*’;/?:@&=+$,A-Za-z0-9])+) ([).!’;/?:,][[:blank:]])?$
- Aadhar Number : ^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$
- Licence Number : ^([A-Z]{2}[0-9]{2}) ((19|20)[0-9][0-9])[0-9]{7}$
- CVV Number : ^[0-9]{3,4}$
- Time : ^([01]?[0-9]|2[0-3]):[0-5][0-9]
- Indian Phone Number : (0|91)?[7-9][0-9]{9}
- Indian Passport Number : ^[A-Z][0-9]{7}$
- Visa Card Number : ^4[0-9]{12}(?:[0-9]{3})?$
- IPv4 Address : ^[0-255].[0-255].[0-255].[0-255]$
- MaC Address : ^([0-9A-Fa-f]{2}[:-]){5}[0-9A-Fa-f]
- Indian Pin Code : ^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$
- IFSC Code : [A-Z]{4}0[A-Z0-9]{6}$
- Pan Card Number : [A-Z]{5}[0-9]{4}[A-Z]{1}
- Youtube Channel ID : http(?:s)?:\\/\\/(?:m.)?(?:www\\.)?youtu(?:\\.be\\/|be\\.com\\/(?:watch\\?(?:feature=youtu.be\\&)?v=|v\\/|embed\\/|user\\/(?:[\\w#]+\\/)+))([^&#?\\n]+)

# GUI![GUI](https://user-images.githubusercontent.com/75173703/115987210-af233480-a5d1-11eb-82de-50cd2a861036.PNG)

# CONCLUSIONS

- Extemely Quick : Our Applications is extremely fast in checking the Validation status of the Code/String.
- Day To Day Administrative Use : The application could be used at Commercial Infrastructures such as Aadhar checking, Licence Validation, Form Validation, Details Verification. This would enhance user experience and minimize the scope of process delay due to backend computation.

# REFERENCES

- [Regex Standard API Library documentation](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/-regex/)
- [Regular Expressions - Wikipedia](https://en.wikipedia.org/wiki/Regular_expression#:~:text=A%20regular%20expression%20(shortened%20as,strings%2C%20or%20for%20input%20validation)
