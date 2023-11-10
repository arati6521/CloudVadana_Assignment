function reverseWords(sentence) {
    // Split the sentence into words
    let words = [];
    let currentWord = '';

    for (let i = 0; i < sentence.length; i++) {
        let char = sentence[i];

        if (char === ' ') {
            // If a space is encountered, add the current word to the array
            words.push(currentWord);
            currentWord = '';
        } else {
            // Build the current word
            currentWord += char;
        }
    }

    // Add the last word (there might not be a space after the last word)
    words.push(currentWord);

    // Reverse each word in the array
    for (let i = 0; i < words.length; i++) {
        words[i] = reverseString(words[i]);
    }

    // Join the reversed words back into a sentence
    let reversedSentence = words.join(' ');

    return reversedSentence;
}

// Function to reverse a string
function reverseString(str) {
    let reversed = '';
    for (let i = str.length - 1; i >= 0; i--) {
        reversed += str[i];
    }
    return reversed;
}

// // Example usage
// let inputSentence = "This is a sunny day";
// let result = reverseWords(inputSentence);

console.log(result);

/*

Output:
sihT si a ynnus yad

*/