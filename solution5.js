function bubbleSortDescending(arr) {
    let len = arr.length;
    
    for (let i = 0; i < len; i++) {
        for (let j = 0; j < len - 1; j++) {
            // Compare adjacent elements and swap if necessary for descending order
            if (arr[j] < arr[j + 1]) {
                // Swap arr[j] and arr[j + 1]
                let temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    return arr;
}

// Example usage
let inputArray = [5, 2, 9, 1, 5, 6];
let sortedArray = bubbleSortDescending(inputArray);

console.log("Original Array: " + inputArray.join(', '));
console.log("Sorted Array (Descending): " + sortedArray.join(', '));


/*

Output:
Original Array: 9, 6, 5, 5, 2, 1
Sorted Array (Descending): 9, 6, 5, 5, 2, 1

*/