# Smelly

This application is intentionally bad written.

Please refactor the code and project structure using TDD with jUnit to leave the application in the best possible state.

The resulting code must be the best of the best.

The program solves two problems.
 
## Problem A 
Write a program that takes a 'size' parameter and outputs a string following this pattern:
e.g. size=4:  
#---  
-#--  
--#-  
---# 

## Problem B
Write a program that reads a file of words (one per line) and outputs each word in descending order of occurrence count, with a list of line locations. 
e.g.:

\---- input   
bar  
foo  
foo  
foo  
---- output  
foo:[2, 3, 4]  
bar:[1]  
\----
