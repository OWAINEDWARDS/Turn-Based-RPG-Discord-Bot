# Turn-Based-RPG-Discord-Bot
A turn-based RPG playable through a discord bot - "PixelBot".

## Goal
 
to be written

## Planned Features

- [ ] Turn based battle using dice. Each number on the dice corresponds to the damage. (Rolling a 2 is 2 damange).
- [ ] Several dice abilites.
- [ ] Small variety Of monsters with turn based "dice battles." Each monster having different "dice abilities."
- [ ] Several dice types.
- [ ] Inventory to collect items. such as food and artificats. - no weapons your dice is the weapon. thus:
- [ ] Can get better dice. start from a dice which has faces 1,1,1,1,1,2 to dices that have faces 1,6,6,6,6,6. with multiple dice slots.
- [ ] Rolling a 1 is a fail and will result in your turn being forfeited. 
- [ ] You can roll your dice as many times as you like but you risk rolling a 1 and giving up any damage you have stacked by rolling each dice you have. 
- [ ] Food can be eaten during combat to restore health.
- [ ] Progress through a pseudo-ranomly generated "dungeon" with "/walk" or "/continue story" slash command.
- [ ] Can rummage for new items in a current location arrived at by using the previous command by using "/rummage". 

- [ ] Can begin a run. which gets harder, can end a run.
- [ ] Lose rewards if the player dies before you choose to end a run. By continuing (using "/forward"), you risk losing all loot gained so far.


## Ambitious Features

- [ ] Boss battles
- [ ] Monster capture as pets. (Multi Party battle)
- [ ] Artifacts
- [ ] Monsters drop gold / items - add to inventory
- [ ] Shop for coins.



## Synopsis

tbw

## Key Words + Phrases

- "DICE ABILITY" = Health Dice, Electric Dice etc.
- "DICE TYPES" = D6, D8, D20 etc.
- "DICE SLOTS" = player or monster can hold dice equal to their dice slots. more dice = more damange for that turn.

### A look at the food items so far

| Item Name:  | Swatted Soup | Hot Dog | Gregors Sosij Roll | Mango Mochi | Beef Broth With Too Much Pak Choi |
| ------------- | ------------- | ------------- | ------------- | ------------- | ------------- |
| Image:  | ![food: swatted soup](https://github.com/OWAINEDWARDS/Turn-Based-RPG-Discord-Bot/blob/master/src/main/resources/edibleItemResources/swattedSoup.png) | ![food: swatted soup](https://github.com/OWAINEDWARDS/Turn-Based-RPG-Discord-Bot/blob/master/src/main/resources/edibleItemResources/hotDog.png)| ![food: swatted soup](https://github.com/OWAINEDWARDS/Turn-Based-RPG-Discord-Bot/blob/master/src/main/resources/edibleItemResources/GregorsSosijRoll.png) | WIP | WIP |
| Description:  | An 'edible' looking soup with lingering buzz , ew. Do I see flies in there?  | This food has little culture | WIP | Yummy, Gooey, Perfect.| Warms Your Tummy good.|
| Die Type:  | D6| D6 | WIP | WIP | WIP |
| health gain:  | 10% | 2.5% | 100% | WIP | 50% |

### A look at the monsters so far

| Monster Name:  | Chielle | Aewa | Sploj |
| ------------- | ------------- | ------------- | ------------- |
| Image:  | ![food: swatted soup](https://github.com/OWAINEDWARDS/Turn-Based-RPG-Discord-Bot/blob/master/src/main/resources/monsterResources/chielle.png) | ![food: swatted soup](https://github.com/OWAINEDWARDS/Turn-Based-RPG-Discord-Bot/blob/master/src/main/resources/monsterResources/aewa.png) | ![food: swatted soup](https://github.com/OWAINEDWARDS/Turn-Based-RPG-Discord-Bot/blob/master/src/main/resources/monsterResources/sploj.png) |
| Random Remarks:  | First Monster drawn. | num 2| num 3|

### The Dice

#### Health Dice

|  Example Face:  | ![food: swatted soup](https://github.com/OWAINEDWARDS/Turn-Based-RPG-Discord-Bot/blob/master/src/main/resources/diceResources/healthDice/HD6-2.png) |
| ------------- | ------------- | 
| Description:  |  WIP |
| Dice Type :  | D6 | 

#### Electric Dice

|  Example Face:  | ![food: swatted soup](https://github.com/OWAINEDWARDS/Turn-Based-RPG-Discord-Bot/blob/master/src/main/resources/diceResources/electricDice/ED6-4.png) |
| ------------- | ------------- | 
| Description:  |  WIP |
| Dice Type :  | D6 | 

#### Basic Dice

|  Example Face:  | WIP |
| ------------- | ------------- | 
| Description:  |  WIP |
| Dice Type :  | D6 | 

## "Exploring" the world

3 element stack idea:


### All Slash Commands

- /Rummage - can only rummage once in a rummage location. can only rummage 5 times in that location.
- /Inventory
- /Forward
- /Backward 
- /endRun
- /beginRun




