#### *Primary source used: [Corey Schafer's Regex Tutorial](https://www.youtube.com/watch?v=sa-TUpSx1JA)

# Regex
Regular Expressions: Used to search for patterns of text.

 * Case sensitive and order does matter.

 ## Literal Character

* Character with meaning. (What you see is what you get)

## Meta/ Special characters

* Special characters that have more meaning/special value, must use \ key before respective meta character to a literal character.

* .[{()}\^$|*+
  * .   "Any character except new line"
  * \d "Digit (0-9)"
  * \D "Not a digit (0-9)"
  * \w "Word character (a-z, A-Z, 0-9)"
  * \W "Not a word character"
  * \s "Whitespace (space, tab, newline)"
  * \S "Not whitespace (space, tab, newline)"
  * \b Word Boundary (Space between two words on same line)
  * \B "No word boundary"
  * ^ "Beginning of a string"
  * $ "End of a string"

  #### Quantifyers
  * afa
   
## Examples

* Search for a 10 digit phone number that is seperated by dashes.
  * Example: 123-123-1221
  * Soution #1 \d\d\d-\d\d\d-\d\d\d\d
* Search for a 10 digit phone number that is seperated by dashes or dots.
  * Example: 121-122-1212 1212-213.23312
  * Solution #1: \d\d\d[.-]\d\d\d[.-]\d\d\d\d

* Search for digits between 1 and 7.
  * Example: 1341 4315 08482 98973

  * Solution #1: [1-7]

* Search for lower case characters.
  * Example: Sans is SUPER Cool

  * Solution #1: [a-z]

* Search for any case characters.
  * Example: Sans is SUPER Cool

  * Solution #1: [a-zA-Z]

* Search for strings that do not start with 'b' and end with 'at'.
  * Example: cat mat pat bat
  * Solution #1: [^b]at

 * Search for strings that contain prefix 'Mr.' or 'Mrs.' along with name after it.

 * Example: Mr. Schafer Mr. Smith Ms Davis Mrs. Robinson Mr T


 * Solution #1: M(r|s|rs)\\.?\s[A-Z]\w+

 * Examplanation #1: Looking for M and (Looking for r or s or rs) and Looking for . and that is one or more and Looking for space and Looking for character that is uppercase and Looking for 0 or more word characters.