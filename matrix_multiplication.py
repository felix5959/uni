# Cloud Infrastructure and Serivces - Lab 1
# Name: Phelim Birch

# Matrix Multiplication Program
import random
import time

# function where you input how many dimensions you want the matrices to have
def matrix_multiplication(n):

    # create the matrices at random
    matrix1 = []
    matrix2 = []
    solution = []

    # for n rows
    for row in range(n):
        # add an empty list to the three matrices
        matrix1.append([])
        matrix2.append([])
        solution.append([])
        # for n columns
        for column in range(n):
            # add a random one digit number to the list for the two input matrices
            matrix1[row].append(random.randint(0,9))
            matrix2[row].append(random.randint(0,9))
            # add a 0 to the solution matrix
            solution[row].append(0)

    # for every row
    for row in range(n):
        # for every column
        for column in range(n):
            # create a result variable
            result = 0
            # for every dimension in the vectors used
            for dimension in range(n):
                # add the multiples to the result
                result = result+(matrix1[row][dimension]*matrix2[dimension][column])
            # add the final result to the solution matrix
            solution[row][column] = result

# testing execution times
start_time_30 = time.perf_counter()
matrix_multiplication(30)
end_time_30 = time.perf_counter()
time_30 = end_time_30-start_time_30
print(f"Time taken to multiple two 30x30 matrices: {time_30:2f} seconds")

start_time_50 = time.perf_counter()
matrix_multiplication(50)
end_time_50 = time.perf_counter()
time_50 = end_time_50-start_time_50
print(f"Time taken to multiple two 50x50 matrices: {time_50:2f} seconds")

start_time_80 = time.perf_counter()
matrix_multiplication(80)
end_time_80 = time.perf_counter()
time_80 = end_time_80-start_time_80
print(f"Time taken to multiple two 80x80 matrices: {time_80:2f} seconds")

start_time_100 = time.perf_counter()
matrix_multiplication(100)
end_time_100 = time.perf_counter()
time_100 = end_time_100-start_time_100
print(f"Time taken to multiple two 100x100 matrices: {time_100:2f} seconds")

start_time_150 = time.perf_counter()
matrix_multiplication(150)
end_time_150 = time.perf_counter()
time_150 = end_time_150-start_time_150
print(f"Time taken to multiple two 150x150 matrices: {time_150:2f} seconds")