# wordle-hacks

A project made with Aiden Kreeger in December 2021 to find sets of 5 words that would reveal as many letters as possible in a game of Wordle and experiment with large big O computation.

## Important notes

### Disclaimer
This project was created several years ago without the intention of later publishing. Poor documentation and portability errors are to be expected unless I decide to revisit this project later.

### Another disclaimer
At the time of creation, the New York Times had not yet acquired Wordle. The Times significantly shrunk the accepted words list, meaning this project is only relevant to Wordle clones that use the original word list. This comes down to the words "waqfs" and "vozhd" which are present in every set of 5 but were removed due to obscurity. In case you're wondering, a waqf is a charitable endowment made to a place of education in Muslim culture, and a vozhd is a Russian supreme leader.

## Documentation

bin contains many intermediate sets of words. bin/perfectPerfection.txt is the final set of words. TheFinalCountdown.java produced the final set, while Nicifier.java made the set more readable. 

## Methodology

### Initial cutdown
We started with a list of words Wordle accepted at the time and removed all words with more than 2 vowels, figuring that, in most cases, using too many vowels in a word would cut off all possibility for later guesses (see the Cwtch Exception). This was not theoretically necessary, but in previous attempts we found that attempting to read through ~15,000 words in O(n^2) time was impractical for our computing capabilities.

### Finding combinations
We decided to execute this task modularly; we first found all the pairs that could fit together, then found all the quadruplets that could fit together, and finally found all the quintuplets that fit. The reasoning for this approach was twofold: 1) we could ensure things were working in intermediary steps before waiting for the entire computation to complete, and 2) we could experiment with different implementations for each step. This method and the inherent experimentation is the reason this repository is so large; we created several versions of the same code for every step. 

## The Cwtch Exception

A cwtch is a kind of hug in Wales. It is also one of several words that contains no traditional vowels (a,e,i,o,u,y). As mentioned earlier, all words with 3+ vowels were culled under the expectation that with 6 vowels split among 5 words and each word needing at least 1 vowel, 2 was the max. However this is not the case if a word like cwtch is used; a 3-vowel word could then be possible. 

###

On occasion I am haunted by cwtch and its mysterious brothers. What Wordle secrets do they hide? Could waqfs and vozhd be dethroned as the kings of wordle-hacks? Could a wordle-hacks solution exist within the oppressive bounds of the NYT word list? The world may never know. 
