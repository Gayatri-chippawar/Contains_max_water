# 💧 Container With Maximum Water (Two Pointer Approach)
## 📌 Problem Statement

Given an ArrayList<Integer> representing heights of vertical lines, determine the maximum amount of water that can be contained between any two lines.

Each element represents the height of a vertical line drawn at that index. The container is formed by choosing two lines, and the water stored is limited by:

Water = min(height[left], height[right]) × (right - left)

## 🚀 Approach Used: Two Pointer Technique

Instead of checking all possible pairs (O(n²)), this solution uses the Two Pointer Approach to optimize the time complexity to O(n).

## 🔎 Algorithm

Initialize two pointers:

left = 0

right = n - 1

Calculate the area between the two pointers.

Update maxWater if the calculated area is larger.

Move the pointer pointing to the smaller height:

If height[left] < height[right], increment left

Otherwise, decrement right

Repeat until left < right

## 🧠 Why Two Pointer Works?

The water level depends on the smaller height.

Moving the taller line won’t increase water capacity.

Therefore, always move the pointer at the smaller height to explore better possibilities.

⏱️ Time & Space Complexity

Time Complexity: O(n)

Space Complexity: O(1)


## 📊 Example

Input:

[1,8,6,2,5,4,8,3,7]


Output:

49


## Explanation:
The maximum water is formed between heights 8 and 7 with width 7.

## 🎯 Key Learning

Efficient use of Two Pointer technique

Optimization from brute force O(n²) to O(n)

Strong understanding of greedy movement logic
