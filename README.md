# prime_sums

Written for an internship application. When ran, this prints the prime sums of the digits of each number from 1-100,000.

`sum-digits` takes a number and returns the sum of each digit in the input. A loop separates each digit in the number recursively. The remainder of the digit when divided by ten is taken (producing the last digit in the number) and added to the sum. The digit is then divided by ten, and the process continues until the digit is less than or equal to one. 

`is-prime` takes a number and returns a boolean representing whether or not the input is prime. In order to determine primality, this function searches for the existance of factors. To do this, a loop counts up from 2 and determines if that number is a factor. If n is 2, we know it is not prime and the loop ends. If n is less than or equal to one, it is not prime and the loop ends. If both of those cases are false, then the loop begins to iterate through integers until it either finds a factor or reaches the square root of the input. Each factor in a composite number is multiplied by another factor, and stopping at the square root of n eliminates this redundancy. 

`lists-prime` takes no arguments. Doseq&mdash;which was used rather than loop so that a print statement could be applied to each result&mdash;begins to loop through each number from 1 to 100,000 (inclusive). `sum-digits1` is called on each number. If calling `is-prime` on the result from `sum-digits` results in true, then the sum is printed.

In the future, I would like to improve the efficiency of this program. Generating the range of numbers is time intensive. I might have been able to cut that down if I created a function that produced . And while I was glad that I was able to increase efficiency by reducing the number of factors I had to test in `is-prime`, I think there is more room for improvement. Rather than test each factor individually, I could have found a way to cut out all multiples of smaller prime numbers. I also could have automated testing, rather than the manual testing I did as I wrote each piece. Overall, I enjoyed getting to play around in clojure again, and I was proud to see that I still remembered quite a bit from last summer.  
