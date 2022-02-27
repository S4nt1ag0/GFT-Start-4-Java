# BOOTCAMP PROJECT
This project abstractly describes the relationship of a bootcamp with devs and contents managed by the bootcamp with gamification per contents finish.
## CONTENT
content is the superclass with title, description, XP_DEFAULT, and methods for calculate the xp for user and others methods. Every content is unique by your name, technique the name of content are used by calculate a hash 

### CHALLENGE
A chanllenge have a difficult and a xp and the XP for dev are calculate with difficult * xp

### PROJECT
A project have only xp and a link for the project in github
### MENTORING
A mentoring have a xp, workload and a date that will be transmitted. The xp for dev are calculated with workload * xp

### COURSE
A course have a xp and workload. The xp for dev are calculated with workload * xp
## BOOTCAMP
bootcamp have a set of devs that are registered and content that compose the bootcamp. Name, description, start and end date are also required

## DEVS
the devs have a name, a level, an id, a Map Collection with the bootcamps to which they are registered and a set with contents that are finalized. As a sequence must be followed to end the bootcamp, when the dev finishes a content it is removed from its bootcamp instance and added to the finalized content set. Because of this, and because the contents are identified by their name, it is possible that the dev makes all the contents of a bootcamp and the bootcamp persists in the map of registered bootcamps with no content added to it. And when this devs do another bootcamp, if the bootcamps share content, some content from the second bootcamp can be removed without causing inconsistency in the dev's set collection. With the final content set the xp is calculated and with the xp the level is calculated

