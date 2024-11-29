# Snake and Ladder Game 🎲🐍🎉

## **About the Game**
The Snake and Ladder game is a classic board game brought to life through this Java implementation. Players compete to reach the finish line (**WINPOINT: 100**) by rolling a dice, climbing ladders, and avoiding snakes.

### **Rules of the Game**
1. The game is played between two players.
2. Both players start at position `0`.
3. On their turn, a player rolls a dice (a random number between 1 and 6) to move forward.
4. If a player lands on a ladder, they climb up to a higher position.
5. If a player lands on a snake, they slide down to a lower position.
6. The first player to reach exactly **100** wins the game.
7. If a dice roll would cause a player to exceed **100**, their position remains unchanged for that turn.

---

## **About the Code**
This implementation simulates the game using Java, utilizing core concepts such as `HashMap` for snakes and ladders, random number generation, and basic I/O for user interaction.

### **Key Features**
- **Game Rules:** Adheres to traditional Snake and Ladder rules.
- **Random Dice Rolls:** Uses Java's `Random` class to simulate a dice roll.
- **Snakes and Ladders:** 
  - **Snakes:** Pull players down when landed upon.
  - **Ladders:** Boost players up when landed upon.
- **Interactive Gameplay:** Players take turns and roll the dice by pressing a key.

---

## **Code Breakdown**
1. **Constants and Data Structures:**
   - The constant `WINPOINT` defines the target score.
   - `HashMap` objects `snake` and `ladder` store positions for snakes and ladders.

2. **Game Logic:**
   - **Dice Roll:** `rollDice()` generates a random number between 1 and 6.
   - **Position Calculation:** `calculatePlayerValue()` adjusts the player's position based on dice rolls, snakes, and ladders.
   - **Win Condition:** `isWin()` checks if a player has reached **100**.

3. **Gameplay:**
   - `startGame()` orchestrates the gameplay, alternating turns between two players and displaying the current state.

4. **Player Interaction:**
   - Players roll the dice by pressing "r" during their turn.

---

## **How to Play**
1. Clone the repository and compile the code:
   javac SnakeNLadderTest.java
   
2.Run the game:
   java SnakeNLadderTest
   
3.Follow the on-screen instructions to play:
   Player 1 and Player 2 take turns rolling the dice by pressing r.
   Watch out for snakes and aim for ladders!
   First player to reach 100 wins.




## Thank You Feel Free to reach for any correction!
