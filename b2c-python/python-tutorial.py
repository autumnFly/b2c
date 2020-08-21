# 安装模块 python3 setup.py install
import json
import os

movies = ["The Holy Grail", "The Life Of Brian", "The Meaning Of Life"]
print(movies[1], len(movies))

array = ['hello', 'world']
for item in array:
    print(item, len(item))

array.append('python')
array.insert(0, 'first')
array.insert(1, 1973)
array.remove('hello')

print(array)

for num in range(3):
    print("range:" + str(num))

i = 0
while i < len(array):
    print(i, array[i])
    i = i + 1

multiArray = [[1], [1, 2, 3], [1, 2, 3, 4]]
for item in multiArray:
    for innerItem in item:
        print(innerItem)

names = ['Jack', 'Rose']
print(isinstance(names, list))

times = 23
if times > 23:
    print('good job')
else:
    print('bad job')


def join(arr, splitter=''):
    result = ''
    if len(arr) == 1:
        return arr[1]
    else:
        index = 0
        while index < len(arr):
            if index != len(arr) - 1:
                result = result + arr[index] + splitter
            else:
                result = result + arr[index]
            index = index + 1
    return result


print(join(names, ','))

welcomeStr = "hello world"
(a1, a2) = welcomeStr.split(" ")
print(a1, a2)

moviesJsonStr = json.dumps(movies)
print(moviesJsonStr)
print(json.loads(moviesJsonStr))

print(os.environ["PATH"])
