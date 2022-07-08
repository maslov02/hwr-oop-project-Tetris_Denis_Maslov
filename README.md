# HWR OOP Lecture Project Template
## Abstract

Hierfür einfach die "READme_DenisMaslov" lesen 

## Feature List

| Number | Feature                           | Tests |
|--------|-----------------------------------|-------|
| 1      | Shape.moveToLeft                  | 21    |
| 2      | Shape.moveToRight                 | 21    |
| 3      | Shape.moveDown                    | 21    |
| 4      | Shape                             | 8     |
| 5      | Rules.moveShapeDown               | 2     |
| 6      | Rules.clearRow                    | 2     |
| 7      | Rules.set Block/Shape To One/Zero | 4     |
| 8      | Rules.spawnShape                  | 2     |
| 9      | Rules.tick                        | 1     |
| 10     | Rules                             | 1     |
| 11     | Rest enthält keine Tests          | \     |


## Additional Dependencies

| Number | Dependency Name                       | Dependency Description                                       | Why is it necessary?                                                                                         |
|--------|---------------------------------------|--------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------|
| 1      | java.util.Random                      | Ermöglicht es eine Random Zahl zu erzeugen                   | Randomness ist besser als die ganze Zeit eine liste durchzuarbeiten                                          |
| 2      | java.util.TimerTask + java.util.Timer | Erlaubt es einen Timer zu setzten und ständig zu wiederholen | Als Clock ist es nützlich das Spiel immerwieder ticken zu lassen, wie zb. jede Sekunde soll ein Block fallen |
