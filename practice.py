from random import *

users = range(1, 21)
print(users)
print(type(users))
users = list(users)

print(type(users))

print(users)
shuffle(users)
print(users)

winners = sample(users, 4)
print(winners)

print(" -- 당첨자발표 -- ")
print("치킨 당첨자 : {0}".format(winners[0]))
print("커피 당첨자 : {0}".format(winners[1:]))
print("-- 축하합니다 --")