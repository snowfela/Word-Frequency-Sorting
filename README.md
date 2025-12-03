# Word-Frequency-Sorting

## Objectives
Given a group of strings containing multiple words, with some words appearing more than once, the objectives are to:
- Identify all unique words.
- Count how many times each word appears.
- Sort the words based on their frequency, starting with the most frequent.
- Return the sorted results.

## Solution
Input : list of strings- each string can contain multiple words separated by spaces.

Output : list of unique words sorted in descending order of their frequencies.

Process :
1. Convert the input to lowercase and split each line into words.
2. Count occurrences of each word using a HashMap.
3. Convert the map entries into a list to enable sorting.
4. Sort the list in descending order of frequency. If frequencies are the same, sort alphabetically.
5. Print the sorted list of words with their frequencies.

## Sample Input List
 ["apple  mango  apple banana guava     ", "mango  apple apple apple banana mango grapes" ]

 ## Sample Output
apple : 5

mango : 3

banana : 2

grapes : 1

guava : 1

values sorted in the descending order of frequencies. For grapes and guava where the frequency is 1, grapes come first alphabetically.
