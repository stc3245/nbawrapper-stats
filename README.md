# nbawrapper-stats
Wrapper for NBA player/team stats and even more!
## Getting a player's statistics
### Using keywords
To get a player's complete statistics using keywords to search him, you can use the static method getPlayerByNameKeywords of the Player class.
```java
Player player = Player.getPlayerByNameKeywords("westbrook");
System.out.println(player.getFirstName()); // Russell
System.out.println(player.getFirstName()); // Westbrook
```
### Using the player ID
To get a player's complete statistics using his ID, you can use the static method getPlayerById of the Player class.
```java
Player player = Player.getPlayerById("203471");
System.out.println(player.getFirstName()); // Dennis
System.out.println(player.getFirstName()); // Schroder
```
### Get player's short profile
You can also get a player's minimal informations, useful when displaying a roster for instance, using the static method getPlayerMinById of the Player class.
```java
PlayerMin playerMin = Player.getPlayerMinById("203471");
System.out.println(playerMin.getFirstName()); // Dennis
System.out.println(playerMin.getFirstName()); // Schroder
```
## Getting a team's profile
### Using keywords
To get a team's complete profile using keywords to search it, you can use the static method getTeamByNameKeywords of the Team class.
```java
Team toronto = Team.getTeamByNameKeywords("Toronto");
System.out.println(toronto.getCity()); // Toronto
System.out.println(toronto.getFullName()); // Toronto Raptors

Team hawks = Team.getTeamByNameKeywords("Hawks");
System.out.println(hawks.getCity()); // Atlanta
System.out.println(hawks.getFullName()); // Atlanta Hawks
```
### Using the team ID
To get a team's complete profile using its ID, you can use the static method getTeamById of the Team class.
```java
Team team = Team.getTeamById("1610612737");
System.out.println(team.getCity()); // Atlanta
System.out.println(team.getFullName()); // Atlanta Hawks
```
### Get team's short profile
You can also get a team's minimal profile, useful when displaying a list of teams for instance, using the static method getShortProfileByTeamId of the Team class.
```java
TeamMin teamMin = Team.getShortProfileByTeamId("1610612737");
System.out.println(teamMin.getCity()); // Atlanta
System.out.println(teamMin.getFullName()); // Atlanta Hawks
```
