# Fishing Game

Create the next classes:
- Pond - It should have the next attributes: capacity – list that contains all fish from the Pond in the current moment; state – ‘poor’, ‘normal’, ‘rich’. Pond is ‘poor’ if it’s capacity contains less then 5 fishes, ‘normal’, if capacity contains from 5 to 10 fishes, and ‘rich’ if it has more than 10 fishes. Pond can obtainFish() – it will be added to it’s capacity, and lostFish() – it will be taken from capacity. The Pond state changes automatically when it’s capacity reaches the appropriate value. Pond also allows showCapacity() and showState(). You can also add the optional attributes (as you wish).
 - Fish -  It has weight. Fish has two derived classes: SheatFish and Carp.
 - SheatFish should have whisckerLength
 - Carp should have color.You can also add optional attributes (as you wish).

User should have interactive menu:
- 1.1. View capacity;
- 2.2. View state of Pond;
- 3.3. Add fish( Carp or SheatFish);
- 4.4. Catch fish (concrete instance);
- 5.5. Create new fish (fill himself the creator)))
- 6.6. Finish the game.
