def isPrimo(num: int) -> bool:
    
    for i in range(num - 1, 1, -1):

        if num % i == 0:
            return False

    return True

for i in range(2, 1001):

    if isPrimo(i):
        print(i)