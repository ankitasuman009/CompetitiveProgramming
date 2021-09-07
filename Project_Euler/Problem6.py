def square_sum(n):
    sum_of_sqs, sum = 0, 0
    for x in range(1, n+1):
        sum_of_sqs += math.pow(x, 2)
        sum += x
    return (math.pow(sum, 2) - sum_of_sqs)
    
print(square_sum(100))
